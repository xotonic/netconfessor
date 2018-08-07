#!/usr/bin/python
# -*- coding: latin-1 -*-
"""

   JNC: Java NETCONF Client plug-in

   Copyright 2012 Tail-f Systems AB
   Modified work Copyright 2018 Dmitriy Kuzmin

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

For complete functionality, invoke with:
> pyang \
    --path <yang search path> \
    --format jnc \
    --jnc-output <package.name> \
    --jnc-verbose \
    --jnc-ignore-errors \
    --jnc-import-on-demand \
    <file.yang>

Or, if you like to keep things simple:
> pyang -f jnc -d <package.name> <file.yang>

"""

import optparse
import os
import sys
from itertools import chain

from pyang import plugin, util as putil, error
from jnc_plugin import context, util
from jnc_plugin.java import ClassGenerator, PackageInfoGenerator
from jnc_plugin.schema import SchemaNode, SchemaGenerator


def pyang_plugin_init():
    """Registers an instance of the jnc plugin"""
    plugin.register_plugin(JNCPlugin())


class JNCPlugin(plugin.PyangPlugin):
    """The plug-in class of JNC.

    The methods of this class are invoked by pyang during initialization. The
    emit method is of particular interest if you are new to writing plugins to
    pyang. It is from there that the parsing of the YANG statement tree
    emanates, producing the generated classes that constitutes the output of
    this plug-in.

    """

    def __init__(self):
        self.done = set([])  # Helps avoiding processing modules more than once

    def add_output_format(self, fmts):
        """Adds 'jnc' as a valid output format and sets the format to jnc if
        the -d/--jnc-output option is set, but -f/--format is not.

        """
        self.multiple_modules = True
        fmts['jnc'] = self

        args = sys.argv[1:]
        if not any(x in args for x in ('-f', '--format')):
            if any(x in args for x in ('-d', '--jnc-output')):
                sys.argv.insert(1, '--format')
                sys.argv.insert(2, 'jnc')

    def add_opts(self, optparser):
        """Adds options to pyang, displayed in the pyang CLI help message"""
        optlist = [
            optparse.make_option(
                '-d', '--jnc-output',
                dest='directory',
                help='Generate output to DIRECTORY.'),
            optparse.make_option(
                '--jnc-package',
                dest='package',
                help='Root package name of generated sources'),
            optparse.make_option(
                '--jnc-help',
                dest='jnc_help',
                action='store_true',
                help='Print help on usage of the JNC plugin and exit'),
            optparse.make_option(
                '--jnc-serial',
                dest='serial',
                action='store_true',
                help='Turn off usage of multiple threads.'),
            optparse.make_option(
                '--jnc-verbose',
                dest='verbose',
                action='store_true',
                help='Verbose mode: Print detailed debug messages.'),
            optparse.make_option(
                '--jnc-debug',
                dest='debug',
                action='store_true',
                help='Print debug messages. Redundant if verbose mode is on.'),
            optparse.make_option(
                '--jnc-no-classes',
                dest='no_classes',
                action='store_true',
                help='Do not generate classes.'),
            optparse.make_option(
                '--jnc-no-schema',
                dest='no_schema',
                action='store_true',
                help='Do not generate schema.'),
            optparse.make_option(
                '--jnc-no-pkginfo',
                dest='no_pkginfo',
                action='store_true',
                help='Do not generate package-info files.'),
            optparse.make_option(
                '--jnc-ignore-errors',
                dest='ignore',
                action='store_true',
                help='Ignore errors from validation.'),
            optparse.make_option(
                '--jnc-import-on-demand',
                dest='import_on_demand',
                action='store_true',
                help='Use non explicit imports where possible.'),
            optparse.make_option(
                '--jnc-classpath-schema-loading',
                dest='classpath_schema_loading',
                help='Load schema files using classpath rather than location.')
        ]
        g = optparser.add_option_group('JNC output specific options')
        g.add_options(optlist)

    def setup_ctx(self, ctx):
        """Called after ctx has been set up in main module. Checks if the
        jnc help option was supplied and if not, that the -d or
        --jnc-output was used.

        ctx -- Context object as defined in __init__.py

        """
        if ctx.opts.jnc_help:
            self.print_help()
            sys.exit(0)
        if ctx.opts.format == 'jnc':
            if not ctx.opts.directory:
                ctx.opts.directory = 'src/gen'
                util.print_warning(msg=('Option -d (or --jnc-output) not set, ' +
                                   'defaulting to "src/gen".'))

            ctx.rootpkg = ctx.opts.package

            self.ctx = ctx
            self.d = ctx.opts.directory.split('.')

    def setup_fmt(self, ctx):
        """Disables implicit errors for the Context"""
        ctx.implicit_errors = False

    def emit(self, ctx, modules, fd):
        """Generates Java classes from the YANG module supplied to pyang.

        The generated classes are placed in the directory specified by the '-d'
        or '--jnc-output' flag, or in "gen" if no such flag was provided,
        using the 'directory' attribute of ctx. If there are existing files
        in the output directory with the same name as the generated classes,
        they are silently overwritten.

        ctx     -- Context used to get output directory, verbosity mode, error
                   handling policy (the ignore attribute) and whether or not a
                   schema file should be generated.
        modules -- A list containing a module statement parsed from the YANG
                   module supplied to pyang.
        fd      -- File descriptor (ignored).

        """
        if ctx.opts.debug or ctx.opts.verbose:
            print('JNC plugin starting')
        if not ctx.opts.ignore:
            for (epos, etag, _) in ctx.errors:
                if (error.is_error(error.err_level(etag)) and
                        etag in ('MODULE_NOT_FOUND', 'MODULE_NOT_FOUND_REV')):
                    self.fatal("%s contains errors" % epos.top.arg)
                if (etag in ('TYPE_NOT_FOUND', 'FEATURE_NOT_FOUND',
                             'IDENTITY_NOT_FOUND', 'GROUPING_NOT_FOUND')):
                    util.print_warning(msg=(etag.lower() + ', generated class ' +
                                       'hierarchy might be incomplete.'), key=etag)
                else:
                    util.print_warning(msg=(etag.lower() + ', aborting.'), key=etag)
                    self.fatal("%s contains errors" % epos.top.arg)

        # Sweep, adding included and imported modules, until no change
        module_set = set(modules)
        num_modules = 0
        while num_modules != len(module_set):
            num_modules = len(module_set)
            for module in list(module_set):
                imported = map(lambda x: x.arg, util.search(module, 'import'))
                included = map(lambda x: x.arg, util.search(module, 'include'))
                for (module_stmt, rev) in self.ctx.modules:
                    if module_stmt in chain(imported, included):
                        module_set.add(self.ctx.modules[(module_stmt, rev)])

        # Generate files from main modules
        for module in filter(lambda s: s.keyword == 'module', module_set):
            self.generate_from(module)

        # Generate files from augmented modules
        for aug_module in context.augmented_modules.values():
            self.generate_from(aug_module)

        # Print debug messages saying that we're done.
        if ctx.opts.debug or ctx.opts.verbose:
            if not self.ctx.opts.no_classes:
                print('Java classes generation COMPLETE.')
            if not self.ctx.opts.no_schema:
                print('Schema generation COMPLETE.')

    def generate_from(self, module):
        """Generates classes, schema file and pkginfo files for module,
        according to options set in self.ctx. The attributes self.directory
        and self.d are used to determine where to generate the files.

        module -- Module statement to generate files from

        """
        if module in self.done:
            return
        self.done.add(module)
        subpkg = util.camelize(module.arg)
        if self.ctx.rootpkg:
            fullpkg = '.'.join([self.ctx.rootpkg, subpkg])
        else:
            fullpkg = subpkg
        d = os.sep.join(self.d + [subpkg])
        if not self.ctx.opts.no_classes:
            # Generate Java classes
            src = ('module "' + module.arg + '", revision: "' +
                   putil.get_latest_revision(module) + '".')
            generator = ClassGenerator(module,
                                       path=os.sep.join([self.ctx.opts.directory, subpkg]),
                                       package=fullpkg, src=src, ctx=self.ctx)
            generator.generate()

        if not self.ctx.opts.no_schema:
            # Generate external schema
            schema_nodes = ['<schema>']
            stmts = util.search(module, context.node_stmts)
            module_root = SchemaNode(self.ctx, module, '/')
            schema_nodes.extend(module_root.as_list())
            if self.ctx.opts.verbose:
                print('Generating schema node "/"...')
            schema_generator = SchemaGenerator(stmts, '/', self.ctx, fullpkg)
            schema_nodes.extend(schema_generator.schema_nodes())
            for i in range(1, len(schema_nodes)):
                # Indent all but the first and last line
                if schema_nodes[i] in ('<node>', '</node>'):
                    schema_nodes[i] = ' ' * 4 + schema_nodes[i]
                else:
                    schema_nodes[i] = ' ' * 8 + schema_nodes[i]
            schema_nodes.append('</schema>')

            name = util.normalize(util.search_one(module, 'prefix').arg)

            # Replace schema files store path
            s = d
            if self.ctx.opts.classpath_schema_loading:
                s = self.ctx.opts.classpath_schema_loading

            util.write_file(s, name + '.xml', '\n'.join(schema_nodes), self.ctx)
            print("- Visiting module '" + name + "'")

        if not self.ctx.opts.no_pkginfo:
            # Generate package-info.java for javadoc
            pkginfo_generator = PackageInfoGenerator(d, module, self.ctx)
            pkginfo_generator.generate_package_info()

        if self.ctx.opts.debug or self.ctx.opts.verbose:
            print('pkg ' + fullpkg + ' generated')

    def fatal(self, exitCode=1):
        """Raise an EmitError"""
        raise error.EmitError(self, exitCode)

    def print_help(self):
        """Prints a description of what JNC is and how to use it"""
        print('''
The JNC (Java NETCONF Client) plug-in can be used to generate a Java class
hierarchy from a single YANG data model. Together with the JNC library, these
generated Java classes may be used as the foundation for a NETCONF client
(AKA manager) written in Java.

The different types of generated files are:

Root class  -- This class has the name of the prefix of the YANG module, and
               contains fields with the prefix and namespace as well as methods
               that enables the JNC library to use the other generated classes
               when interacting with a NETCONF server.

YangElement -- Each YangElement corresponds to a container, list or
               notification in the YANG model. They represent tree nodes of a
               configuration and provides methods to modify the configuration
               in accordance with the YANG model that they were generated from.

               The top-level nodes in the YANG model will have their
               corresponding YangElement classes generated in the output
               directory together with the root class. Their respective
               subnodes are generated in subpackages with names corresponding
               to the name of the parent.

YangTypes   -- For each derived type in the YANG model, a class is generated to
               the root of the output directory. The derived type may either
               extend another derived type class, or the JNC type class
               corresponding to a built-in YANG type.

Packageinfo -- For each package in the generated Java class hierarchy, a
               package-info.java file is generated, which can be useful when
               generating javadoc for the hierarchy.

Schema file -- If enabled, an XML file containing structured information about
               the generated Java classes is generated. It contains tagpaths,
               namespace, primitive-type and other useful meta-information.

The typical use case for these classes is as part of a JAVA network management
system (EMS), to enable retrieval and/or storing of configurations on NETCONF
agents/servers with specific capabilities.

One way to use the JNC plug-in of pyang is
$ pyang -f jnc --jnc-output package.dir <file.yang>

Type '$ pyang --help' for more details on how to use pyang.
''')


