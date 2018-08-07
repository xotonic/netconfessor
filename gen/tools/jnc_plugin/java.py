import os

from pyang import statements

import context
import util
from generators.java_method import MethodGenerator
from java_class import JavaClass
from java_value import JavaValue
from method import JavaMethod
from ordered_set import OrderedSet


class YangType(object):
    """Provides an interface to maintain a list of defined yang types"""

    def __init__(self):
        self.defined_types = ['empty', 'int8', 'int16', 'int32', 'int64',
                              'uint8', 'uint16', 'uint32', 'uint64', 'binary', 'bits', 'boolean',
                              'decimal64', 'enumeration', 'identityref', 'instance-identifier',
                              'leafref', 'string', 'union']  # Use set instead!
        """List of types represented by a jnc or generated class"""

    def defined(self, yang_type):
        """Returns true if yang_type is defined, else false"""
        return (yang_type in self.defined_types)

    def add(self, yang_type):
        """Gives yang_type "defined" status in this instance of YangType"""
        self.defined_types.append(yang_type)


class ClassGenerator(object):
    """Used to generate java classes from a yang module"""

    def __init__(self, stmt, path=None, package=None, src=None, ctx=None,
                 ns='', prefix_name='', yang_types=None, parent=None):
        """Constructor.

        stmt        -- A statement (sub)tree, parsed from a YANG model
        path        -- Full path to where the class should be written
        package     -- Name of Java package
        src         -- Filename of parsed yang module, or the module name and
                       revision if filename is unknown
        ctx         -- Context used to fetch option parameters
        ns          -- The XML namespace of the module
        prefix_name -- The module prefix
        yang_types  -- An instance of the YangType class
        parent      -- ClassGenerator to copy arguments that were not supplied
                       from (if applicable)

        """
        self.stmt = stmt
        self.path = path
        self.package = None if package is None else package.replace(os.sep, '.')
        self.src = src
        self.ctx = ctx
        self.ns = ns
        self.prefix_name = prefix_name
        self.yang_types = yang_types

        self.n = util.normalize(stmt.arg)
        self.n2 = util.camelize(stmt.arg)
        if stmt.keyword in context.module_stmts:
            self.filename = util.schema_class(util.normalize(util.search_one(stmt, 'prefix').arg)) + '.java'
            self.filename_visitor = util.visitor_class((util.normalize(util.search_one(stmt, 'prefix').arg))) + '.java'
        else:
            self.filename = self.n + '.java'
            self.filename_visitor = util.visitor_class(self.n) + '.java'

        if yang_types is None:
            self.yang_types = YangType()
        if parent is not None:
            for attr in ('package', 'src', 'ctx', 'path', 'ns',
                         'prefix_name', 'yang_types'):
                if getattr(self, attr) is None:
                    setattr(self, attr, getattr(parent, attr))

            module = util.get_module(stmt)
            if self.ctx.rootpkg:
                self.rootpkg = '.'.join([self.ctx.rootpkg.replace(os.sep, '.'),
                                         util.camelize(module.arg)])
            else:
                self.rootpkg = util.camelize(module.arg)
        else:
            self.rootpkg = package

    def generate(self):
        """Generates class(es) for self.stmt"""

        if self.stmt.keyword in ('module', 'submodule'):
            self.generate_classes()
        else:
            self.generate_class()

    def generate_classes(self):
        """Generates a Java class hierarchy from a module statement, allowing
        for netconf communication using the jnc library.

        """
        assert (self.stmt.keyword == 'module')
        # Namespace and prefix
        ns_arg = util.search_one(self.stmt, 'namespace').arg
        prefix = util.search_one(self.stmt, 'prefix')

        # Add root to context.class_hierarchy dict
        if self.rootpkg not in context.class_hierarchy:
            context.class_hierarchy[self.rootpkg] = set([])
        context.class_hierarchy[self.rootpkg].add(self.n)

        # Add all classes that will be generated to context.class_hierarchy dict
        def record(stmt, package):
            for ch in util.search(stmt, context.yangelement_stmts):
                if package not in context.class_hierarchy:
                    context.class_hierarchy[package] = set([])
                context.class_hierarchy[package].add(util.normalize(ch.arg))
                record(ch, '.'.join([package, util.camelize(ch.arg)]))

        record(self.stmt, self.rootpkg)

        # Gather typedefs to generate and add to context.class_hierarchy dict
        typedef_stmts = set([])
        context.module_stmts = set([self.stmt])
        included = map(lambda x: x.arg, util.search(self.stmt, 'include'))
        for (module, rev) in self.ctx.modules:
            if module in included:
                context.module_stmts.add(self.ctx.modules[(module, rev)])
        for module_stmt in context.module_stmts:
            for stmt in util.search(module_stmt, 'typedef'):
                typedef_stmts.add(stmt)
                context.class_hierarchy[self.rootpkg].add(util.normalize(stmt.arg))
                try:
                    while True:
                        type_stmt = util.search_one(stmt, 'type')
                        if type_stmt.i_typedef is None:
                            break
                        typedef_stmts.add(type_stmt.i_typedef)
                        stmt = type_stmt.i_typedef
                        context.class_hierarchy[self.rootpkg].add(util.normalize(stmt.arg))
                except AttributeError:
                    pass

        # Generate the typedef classes
        for stmt in typedef_stmts:
            name = util.normalize(stmt.arg)

            description = util.class_javadoc(ns=self.ns, stmt=stmt)

            java_class = JavaClass(filename=name + '.java',
                                   package=self.package,
                                   description=description,
                                   source=self.src,
                                   superclass='YangElement')
            if self.ctx.opts.verbose:
                print('Generating Java class "' + name + '.java' + '"...')

            gen = MethodGenerator(stmt, self.ctx)

            for const_field in gen.enum_consts():
                java_class.add_field(const_field)

            for constructor in gen.constructors():
                java_class.add_constructor(constructor)

            for i, method in enumerate(gen.setters()):
                java_class.append_access_method(str(i), method)

            java_class.add_support_method(gen.enums())
            java_class.append_access_method('check', gen.checker())

            type_stmt = util.search_one(stmt, 'type')
            super_type = util.get_types(type_stmt, self.ctx)[0]
            java_class.superclass = super_type.rpartition('.')[2]
            java_class.imports.add(super_type)
            if super_type == 'io.netconfessor.YangDecimal64':
                java_class.imports.add('java.math.BigDecimal')
            elif super_type in ('io.netconfessor.YangBits',
                                'io.netconfessor.YangUInt64'):
                java_class.imports.add('java.math.BigInteger')
            elif super_type in ('io.netconfessor.YangLeafref',
                                'io.netconfessor.YangIdentityref'):
                java_class.imports.add('io.netconfessor.Element')

            util.write_file(self.path, java_class.filename,
                            java_class.as_list(), self.ctx)

        # Generate classes for children and keep track of augmented modules
        for stmt in util.search(self.stmt, list(context.yangelement_stmts | {'augment', 'leaf'})):
            child_generator = ClassGenerator(stmt, package=self.package,
                                             ns=ns_arg, prefix_name=self.n, parent=self)
            child_generator.generate()

        # Generate root class
        if self.ctx.opts.verbose:
            print('Generating Java class "' + self.filename + '"...')
        self.java_class = JavaClass(filename=self.filename,
                                    package=self.package, description=('The root class for namespace ' +
                                                                       ns_arg + ' (accessible from \n * ' + self.n +
                                                                       '.NAMESPACE) with prefix "' + prefix.arg + '" (' + self.n +
                                                                       '.PREFIX).'),
                                    source=self.src)

        self.java_class_visitor = JavaClass(
            abstract=True,
            filename=self.filename_visitor,
            package=self.package,
            description='Visitor of module ' + prefix.arg + '(' + ns_arg + ')')

        self.generate_visitor(self.stmt, module=True)

        self.class_fields(ns_arg, prefix)
        self.method_enable(prefix)
        self.method_register_schema(prefix)
        self.write_to_file()

    def generate_visitor(self, stmt, module=False):

        def pkg(class_name):
            return self.java_class_visitor.package \
                   + (('.' + util.camelize(self.n2)) if not module else '') \
                   + '.' + class_name

        def if_none_then_null(val):
            return ('"' + val + '"') if val is not None else 'null'

        method_visit = JavaMethod(return_type='void', name='visit')
        method_visit.add_javadoc('Auto-generated module traverse algorithm')
        method_visit.add_parameter('io.netconfessor.NodeSet', 'nodes')
        method_visit.add_modifier('public')
        method_visit.add_dependency('io.netconfessor.Element')

        this_config = util.is_config(stmt)
        stmt_id = util.camelize(stmt.arg)
        stmt_class = util.normalize(stmt.arg)

        method_collect = None

        # module visitor collects into NodeSet, children into corresponding java object
        if module:
            method_collect = JavaMethod(return_type='io.netconfessor.NodeSet', name='collectConfig')
            method_collect.add_modifier('public')
            method_collect.add_line('NodeSet nodes = new NodeSet();')
        elif this_config:
            method_collect = JavaMethod(return_type=self.package + '.' + self.n, name='collectConfig')

            if stmt.keyword in {'list', 'leaf-list'}:
                method_collect.add_parameter(param_type=pkg(stmt_class), param_name=stmt_id)
                # method_collect.add_line('%s %s = getNext%s();' % (stmt_class, stmt_id, stmt_class))
                method_collect.add_line('if (%s == null) {' % stmt_id)
                method_collect.add_line('    return null;')
                method_collect.add_line('}')

            else:
                method_collect.add_line('%s %s = new %s();' % (stmt_class, stmt_id, stmt_class))
            method_collect.add_modifier('public')

        method_setup_all = JavaMethod(return_type='void', name='setup')
        method_setup_all.add_modifier('public')

        for s in util.search(stmt, context.yangelement_stmts):

            config = util.is_config(s)
            xpath = statements.mk_path_str(s, True)
            keyword = s.keyword
            id = util.camelize(s.arg)
            visitee_name = util.normalize(s.arg)
            visitee = util.escape_conflicts(pkg(visitee_name))
            visitor_id = util.visitor_class(id)
            visitee_full = pkg(visitee_name)

            if keyword in {'container'}:
                method_name = 'on' + visitee_name
                next_visitor = util.visitor_class(visitee_name)
                visit_method = JavaMethod(
                    return_type='void',  # pkg(next_visitor),
                    name=method_name)
                visit_method.add_parameter(visitee_full, keyword)
                visit_method.add_modifier('public')
                visit_method.add_modifier('abstract')
                self.java_class_visitor.add_method(visit_method)

                field_visitor = JavaValue()
                field_visitor.add_modifier('private')
                field_visitor.add_modifier(next_visitor)
                field_visitor.set_name(util.visitor_class(id))
                self.java_class_visitor.add_field(field_visitor)

                if config:
                    method_collect.add_line('if (%s != null) {' % visitor_id)
                    method_collect.add_line('    %s %s = %s.collectConfig();' % (visitee, id, visitor_id))
                    method_collect.add_line('    if (%s != null) {' % id)
                    if module:
                        method_collect.add_line('        nodes.add(%s);' % id)
                    else:
                        method_collect.add_line('        %s.add%s(%s);' % (stmt_id, visitee_name, id))
                    method_collect.add_line('    }')
                    method_collect.add_line('}')

                method_visit.add_line('')
                method_visit.add_line('final Element %s = nodes.getFirstChild("%s");' % (id, s.arg))
                method_visit.add_line('if (%s != null) {' % id)
                method_visit.add_line('    %s((%s)%s);'
                                      % (method_name, visitee, id))
                method_visit.add_line('    if (%s != null) {' % visitor_id)
                method_visit.add_line('        if (%s.hasChildren()) {' % id)
                method_visit.add_line('            %s.visit(%s.getChildren());' % (visitor_id, id))
                method_visit.add_line('        }')
                method_visit.add_line('    }')
                method_visit.add_line('}')

                method_visit.add_dependency(pkg(next_visitor))

                method_setup = JavaMethod(return_type=pkg(next_visitor), name='setup' + visitee_name)
                method_setup.add_modifier('public')
                method_setup.add_modifier('abstract')
                method_setup.add_parameter(param_type='io.netconfessor.YangData', param_name='data')
                desc_stmt = util.search_one(s, 'description')
                desc = if_none_then_null(desc_stmt.arg if desc_stmt is not None else None)
                method_setup_all.add_line('%s = setup%s(new YangData("%s", "%s", %s, %s, YangDataType.%s));'
                                          % (visitor_id, visitee_name, s.arg, xpath, util.yang_string_to_jstring(desc),
                                             'true' if config else 'false', util.camelize(s.keyword)))
                method_setup_all.add_line('if (%s != null) {' % visitor_id)
                method_setup_all.add_line('    %s.setup();' % visitor_id)
                method_setup_all.add_line('}')
                method_setup_all.add_dependency('io.netconfessor.YangData')
                method_setup_all.add_dependency('io.netconfessor.YangDataType')
                self.java_class_visitor.add_field(method_setup)

            elif keyword in {'list'}:
                next_method_name = 'onNext' + visitee_name
                entry_visitor = util.visitor_class(visitee_name)
                visit_method = JavaMethod(return_type='void',  # pkg(entry_visitor),
                                          name=next_method_name)
                visit_method.add_modifier('public')
                visit_method.add_modifier('abstract')
                visit_method.add_parameter(visitee_full, 'item')
                self.java_class_visitor.add_method(visit_method)

                start_method_name = 'onStart' + visitee + 'List'
                visit_method = JavaMethod(return_type='void', name=start_method_name)
                visit_method.add_modifier('protected')
                self.java_class_visitor.add_method(visit_method)

                stop_method_name = 'onStop' + visitee + 'List'
                visit_method = JavaMethod(return_type='void', name=stop_method_name)
                visit_method.add_modifier('protected')
                self.java_class_visitor.add_method(visit_method)

                if config:
                    collect_get_next_name = 'getNext' + visitee_name

                    method_collect.add_line('%s %s;' % (util.escape_conflicts(visitee, visitee_name), id))
                    method_collect.add_line('while((%s = %s()) != null) {' % (id, collect_get_next_name))
                    if module:
                        method_collect.add_line('    nodes.add(%s);' % id)
                    else:
                        method_collect.add_line('    %s.removeNonKeysIfMarkedToDelete();' % id)
                        method_collect.add_line('    %s.add%s(%s);' % (stmt_id, visitee_name, id))
                    method_collect.add_line('}')

                    collect_get_next = JavaMethod(return_type=visitee_full, name=collect_get_next_name)
                    collect_get_next.add_modifier('abstract')
                    collect_get_next.add_modifier('protected')
                    self.java_class_visitor.add_method(collect_get_next)

                method_visit.add_line('')
                method_visit.add_line('%s();' % start_method_name)
                method_visit.add_line('for (Element node : nodes.getChildren("%s")) {' % (s.arg))
                method_visit.add_line('    %s((%s)node);' % (next_method_name, visitee))
                method_visit.add_line('    if (%s != null) {' % visitor_id)
                method_visit.add_line('        if (node.hasChildren()) {')
                method_visit.add_line('            %s.visit(node.getChildren());' % visitor_id)
                method_visit.add_line('        }')
                method_visit.add_line('    }')
                method_visit.add_line('}')
                method_visit.add_line('%s();' % stop_method_name)

                method_setup = JavaMethod(return_type=pkg(entry_visitor), name='setup' + visitee_name)
                method_setup.add_modifier('public')
                method_setup.add_modifier('abstract')
                method_setup.add_parameter(param_type='io.netconfessor.YangData', param_name='data')
                self.java_class_visitor.add_field(method_setup)
                desc_stmt = util.search_one(s, 'description')
                desc = if_none_then_null(desc_stmt.arg if desc_stmt is not None else None)
                method_setup_all.add_line('%s = setup%s(new YangData("%s", "%s", %s, %s, YangDataType.%s));'
                                          % (visitor_id, visitee_name, s.arg, xpath, util.yang_string_to_jstring(desc),
                                             'true' if config else 'false', util.camelize(s.keyword)))
                method_setup_all.add_line('if (%s != null) {' % visitor_id)
                method_setup_all.add_line('    %s.setup();' % visitor_id)
                method_setup_all.add_line('}')
                method_setup_all.add_dependency('io.netconfessor.YangData')
                method_setup_all.add_dependency('io.netconfessor.YangDataType')

                field_visitor = JavaValue()
                field_visitor.add_modifier('private')
                field_visitor.add_modifier(entry_visitor)
                field_visitor.set_name(util.visitor_class(id))
                self.java_class_visitor.add_field(field_visitor)

            elif keyword in {'leaf'}:
                method_name = 'on' + visitee
                visit_method = JavaMethod(return_type='void', name=method_name)
                visit_method.add_modifier('public')
                visit_method.add_modifier('abstract')
                visit_method.add_parameter(visitee_full, keyword)
                self.java_class_visitor.add_method(visit_method)

                jnc, primitive = util.get_types(s, self.ctx)
                type_reference = util.escape_conflicts(visitee, visitee_name)
                base_type = util.get_base_type(s)
                is_enum = base_type.arg == 'enumeration'
                type_class = util.escape_conflicts(jnc, visitee_name)

                if config:
                    get_method = JavaMethod(name='get' + visitee)
                    get_method.set_return_type(visitee, visitee_name)
                    get_method.add_modifier('public')
                    get_method.add_modifier('abstract')
                    self.java_class_visitor.add_method(get_method)

                    method_collect.add_line('%s %s = get%s();' % (visitee_name, id, visitee_name))
                    method_collect.add_line('if (%s != null) {' % id)
                    method_collect.add_line('    %s.add%s(%s);' % (stmt_id, visitee_name, id))
                    method_collect.add_line('}')

                method_visit.add_line('')
                method_visit.add_line('final Element %s = nodes.getFirstChild("%s");' % (id, s.arg))
                method_visit.add_line('if (%s != null) {' % id)
                method_visit.add_line('    %s((%s)%s);' % (method_name, type_reference, id))
                method_visit.add_line('}')

                method_setup = JavaMethod(return_type='void', name='setup' + visitee_name)
                method_setup.add_modifier('public')
                method_setup.add_modifier('abstract')

                yang_data_type = 'io.netconfessor.EnumYangData' if is_enum else 'io.netconfessor.LeafYangData'

                method_setup.add_parameter_generic(param_type=yang_data_type,
                                                   generic_type=jnc,
                                                   param_name='data',
                                                   this_class_name=visitee_full)
                desc_stmt = util.search_one(s, 'description')
                desc = if_none_then_null(desc_stmt.arg if desc_stmt is not None else None)
                if is_enum:
                    method_setup_all.add_line('setup%s(new EnumYangData<>('
                                              '"%s", "%s", %s, %s, YangDataType.%s, "%s", s -> new %s(s), %s.enums()));'
                                              % (visitee_name, s.arg, xpath, util.yang_string_to_jstring(desc),
                                                 'true' if config else 'false',
                                                 util.camelize(s.keyword), jnc, type_class, type_class))
                else:

                    method_setup_all.add_line('setup%s(new LeafYangData<>('
                                              '"%s", "%s", %s, %s, YangDataType.%s, "%s", s -> new %s(s)));'
                                              % (visitee_name, s.arg, xpath, util.yang_string_to_jstring(desc),
                                                 'true' if config else 'false',
                                                 util.camelize(s.keyword), jnc, type_class))

                method_setup_all.add_dependency(jnc)
                method_setup_all.add_dependency(yang_data_type)
                method_setup_all.add_dependency('io.netconfessor.YangDataType')
                self.java_class_visitor.add_field(method_setup)

        if module:
            method_collect.add_javadoc('Retrieve all config values in registered visitors')
            method_collect.add_javadoc('Before send to device you need sync result with older nodeset (empty allowed)')
            method_collect.add_line('return nodes;')
        elif this_config:
            method_collect.add_javadoc('Retrieve all config values in registered visitors')
            method_collect.add_line('if (%s.hasChildren()) {' % stmt_id)
            method_collect.add_line('   return %s;' % stmt_id)
            method_collect.add_line('} else {')
            method_collect.add_line('   return null;')
            method_collect.add_line('}')

        self.java_class_visitor.add_method(method_setup_all)
        self.java_class_visitor.add_method(method_collect)
        self.java_class_visitor.add_method(method_visit)

    def class_fields(self, ns_arg, prefix):
        # Set fields in root class
        root_fields = [JavaValue(), JavaValue()]
        root_fields[0].set_name('NAMESPACE')
        root_fields[1].set_name('PREFIX')
        root_fields[0].value = '"' + ns_arg + '"'
        root_fields[1].value = '"' + prefix.arg + '"'
        for root_field in root_fields:
            for modifier in ('public', 'static', 'final', 'String'):
                root_field.add_modifier(modifier)
            self.java_class.add_field(root_field)

    def method_enable(self, prefix):
        # Add method 'enable' to root class
        enabler = JavaMethod(return_type='void', name='enable')
        enabler.exceptions = ['JNCException']  # XXX: Don't use add method
        enabler.add_dependency('io.netconfessor.JNCException')
        enabler.modifiers = ['public', 'static']
        enabler.add_javadoc('Enable the elements in this namespace to be aware')
        enabler.add_javadoc('of the data model and use the generated classes.')
        enabler.add_line('"'.join(['YangElement.setPackage(NAMESPACE, ',
                                   self.java_class.package, ');']))
        enabler.add_dependency('io.netconfessor.YangElement')
        enabler.add_line(util.schema_class(util.normalize(prefix.arg)) + '.registerSchema();')
        self.java_class.add_enabler(enabler)

    def method_register_schema(self, prefix):
        # Add method 'registerSchema' to root class
        reg = JavaMethod(return_type='void', name='registerSchema')
        reg.exceptions = ['JNCException']  # XXX: Don't use add method
        reg.add_dependency('io.netconfessor.JNCException')
        reg.modifiers = ['public', 'static']
        reg.add_javadoc('Register the schema for this namespace in the global')
        reg.add_javadoc('schema table (CsTree) making it possible to lookup')
        reg.add_javadoc('CsNode entries for all tagpaths')
        reg.add_line('SchemaParser parser = new SchemaParser();')
        reg.add_dependency('io.netconfessor.SchemaParser')
        reg.add_line('HashMap<Tagpath, SchemaNode> h = SchemaTree.create(NAMESPACE);')
        reg.add_dependency('java.util.HashMap')
        reg.add_dependency('io.netconfessor.Tagpath')
        reg.add_dependency('io.netconfessor.SchemaNode')
        reg.add_dependency('io.netconfessor.SchemaTree')
        schema = os.sep.join([self.ctx.opts.directory.replace('.', os.sep),
                              self.n2, util.normalize(prefix.arg)])
        if self.ctx.opts.classpath_schema_loading:
            reg.add_line('parser.findAndReadFile("' + util.normalize(prefix.arg) + '.xml", h, '
                         + util.schema_class(util.normalize(prefix.arg)) + '.class, NAMESPACE);')
        else:
            reg.add_line('parser.readFile("' + schema + '.xml", h, NAMESPACE);')
        self.java_class.add_schema_registrator(reg)

    def generate_class(self):
        """Generates a Java class hierarchy providing an interface to a YANG
        module. Uses mutual recursion with generate_child.

        """
        stmt = self.stmt

        # If augment, add target module to context.augmented_modules dict
        if stmt.keyword == 'augment':
            if not hasattr(stmt, "i_target_node"):
                warn_msg = 'Target missing from augment statement'
                util.print_warning(warn_msg, warn_msg, self.ctx)
            else:
                target = stmt.i_target_node
                target_module = util.get_module(target)
                context.augmented_modules[target_module.arg] = target_module
            return  # XXX: Do not generate a class for the augment statement

        fields = OrderedSet()
        package_generated = False
        all_fully_qualified = True
        fully_qualified = False

        self.java_class = JavaClass(filename=self.filename,
                                    package=self.package,
                                    description=util.class_javadoc(self.ns, stmt),
                                    source=self.src,
                                    superclass=context.superclasses.get(stmt.keyword, 'YangElement'))

        # if (self.java_class.superclass == 'YangAnyXml'):
        #     print('Adding imports for ' + self.java_class.filename)
        #     self.java_class.imports.add('io.netconfessor.YangAnyXml')

        for ch in util.search(stmt, context.yangelement_stmts | {'leaf', 'leaf-list'}):
            field = self.generate_child(ch)
            ch_arg = util.normalize(ch.arg)
            if field is not None:
                package_generated = True
                if ch_arg == self.n and not fully_qualified:
                    fully_qualified = True
                    s = ('\n * <p>\n * Children with the same name as this ' +
                         'class are fully qualified.')
                    self.java_class.description += s
                else:
                    all_fully_qualified = False
                if field:
                    fields.add(field)  # Container child
                if (not self.ctx.opts.import_on_demand
                        or ch_arg in context.java_lang
                        or ch_arg in context.java_util
                        or ch_arg in context.io_netconfessor
                        or ch_arg in context.class_hierarchy[self.rootpkg]
                        or ch_arg in context.class_hierarchy[self.package]):
                    # Need to do explicit import
                    import_ = '.'.join([self.package, self.n2, ch_arg])
                    self.java_class.imports.add(import_)

        if self.ctx.opts.debug or self.ctx.opts.verbose:
            if package_generated:
                print('pkg ' + '.'.join([self.package, self.n2]) + ' generated')
            if self.ctx.opts.verbose:
                print('Generating "' + self.filename + '"...')

        gen = MethodGenerator(stmt, self.ctx)
        # print(stmt.keyword + ': ' + stmt.arg)
        for constructor in gen.constructors():
            self.java_class.add_constructor(constructor)

        for cloner in gen.cloners():
            self.java_class.add_cloner(cloner)

        if stmt.keyword in {'leaf', 'leaf-list'}:
            for value_setter in gen.leaf_value_access_methods():
                self.java_class.add_value_setter(value_setter)

        try:
            impl_methods = gen.gen.enum_holder_impl()
        except AttributeError:
            pass
        else:
            if impl_methods:
                self.java_class.add_interface_implementation('YangEnumerationHolder', 'io.netconfessor')
                for m in impl_methods:
                    self.java_class.add_support_method(m)

        try:
            lc_methods = gen.gen.list_container_impl()
        except AttributeError:
            pass
        else:
            if lc_methods:
                self.java_class.add_interface_implementation('YangContainer', 'io.netconfessor')
                for m in lc_methods:
                    self.java_class.add_support_method(m)

        support_method = gen.support_method(fields)
        if support_method is not None:
            self.java_class.add_support_method(support_method)

        self.java_class.add_name_getter(gen.key_names())
        self.java_class.add_name_getter(gen.children_names())

        if self.ctx.opts.import_on_demand:
            self.java_class.imports.add('io.netconfessor.*')
            self.java_class.imports.add('java.math.*')
            self.java_class.imports.add('java.util.*')
            if self.rootpkg != self.package:
                self.java_class.imports.add(self.rootpkg + '.*')
                top = util.get_module(self.stmt)
                if top is None:
                    top = self.stmt
                elif top.keyword == 'submodule':
                    top = util.search_one(top, 'belongs-to')
                top_classname = util.normalize(util.search_one(top, 'prefix').arg)
                if (top_classname in context.java_built_in
                        or top_classname in context.java_util):
                    top_import = self.rootpkg + '.' + top_classname
                    self.java_class.imports.add(top_import)
            if package_generated and not all_fully_qualified:
                import_ = '.'.join([self.package, self.n2, '*'])
                self.java_class.imports.add(import_)

        if stmt.keyword in {'container', 'list'}:
            self.java_class_visitor = JavaClass(
                abstract=True,
                filename=self.filename_visitor,
                package=self.package,
                description='Visitor of ' + stmt.keyword + ' ' + stmt.arg)

            self.generate_visitor(self.stmt)

        self.write_to_file()

    # TODO generate class instead method
    def generate_child(self, sub):
        """Appends access methods to class for children in the YANG module.
        Returns the name of sub if it is a container or notification, an empty
        string if sub is a list, None otherwise.

        Uses mutual recursion with generate_class. For this function to work,
        self.java_class must be defined.

        sub -- A data model subtree statement, child of self.stmt.

        """
        field = None
        add = self.java_class.append_access_method  # XXX: add is a function
        if sub.keyword in context.yangelement_stmts:
            pkg = self.package + '.' + self.n2
            child_generator = ClassGenerator(stmt=sub, package=pkg,
                                             path=self.path + os.sep + self.n2,
                                             ns=None, prefix_name=None, parent=self)
            child_generator.generate()
            child_gen = MethodGenerator(sub, self.ctx)
            if sub.keyword in ('container', 'notification', 'anyxml', 'leaf'):
                field = sub.arg
                self.java_class.add_field(child_gen.child_field())
            else:
                field = ''
            for access_method in child_gen.parent_access_methods():
                name = util.normalize(sub.arg)

                def f(s):
                    f_name = '.'.join([pkg, name])
                    res = s.replace(name, f_name)
                    res = res.replace('add' + f_name, 'add' + name)
                    return res

                if (name == self.n and isinstance(access_method, JavaMethod)):
                    access_method.return_type = f(access_method.return_type)
                    access_method.parameters = [f(x) for x in access_method.parameters]
                    access_method.body = [f(x) for x in access_method.body]
                elif name == self.n:
                    access_method.modifiers = [f(x) for x in access_method.modifiers]
                add(sub.arg, access_method)

            try:
                enum_const_fields = child_gen.enum_const_fields()
            except AttributeError:
                pass
            else:
                for enum_const in enum_const_fields:
                    self.java_class.add_field(enum_const)

        # TODO replace with class
        elif sub.keyword in context.leaf_stmts:
            child_gen = MethodGenerator(sub, self.ctx)
            add(sub.arg, child_gen.access_methods_comment())
            if sub.keyword == 'leaf':
                key = util.search_one(self.stmt, 'key')
                optional = key is None or sub.arg not in key.arg.split(' ')
                # FIXME: The leaf might be mandatory even if it is not a key
                add(sub.arg, child_gen.getters())
                for setter in child_gen.setters():
                    add(sub.arg, setter)
                if optional:
                    add(sub.arg, child_gen.unsetter())
                add(sub.arg, child_gen.adders())
            elif sub.keyword == 'leaf-list':  # sub.keyword == 'leaf-list':
                add(sub.arg, child_gen.child_iterator())
                for setter in child_gen.setters():
                    add(sub.arg, setter)
                for deleter in child_gen.deleters():
                    add(sub.arg, deleter)
                add(sub.arg, child_gen.adders())
                optional = True
            else:  # anyxml
                assert sub.keyword == 'anyxml'
                optional = False
                add(sub.arg, child_gen.adders())

            if optional:
                child_gen = MethodGenerator(sub, self.ctx)
                for mark_method in child_gen.markers():
                    add(sub.arg, mark_method)
        return field

    def write_to_file(self):

        util.write_file(self.path,
                        self.filename,
                        self.java_class.as_list(),
                        self.ctx)

        if hasattr(self, 'java_class_visitor'):
            util.write_file(self.path,
                            self.filename_visitor,
                            self.java_class_visitor.as_list(),
                            self.ctx)


class PackageInfoGenerator(object):
    """Used to generate package-info.java files, with meaningful content"""

    def __init__(self, directory, stmt, ctx):
        """Initializes a generator with package directory path, top level
        statement and context for options.

        stmt      -- Statement representing any YANG module subtree
        directory -- The package directory as a string
        ctx       -- Context for options

        """
        self.d = directory
        self.pkg = directory.rpartition('src')[2][1:]
        self.pkg = self.pkg.replace(os.sep, '.')
        self.stmt = stmt
        self.ctx = ctx

    def generate_package_info(self):
        """Main generator method: generates package-info files for self.stmt
        and all of its substatements.

        """
        util.write_file(self.d, 'package-info.java',
                        self.gen_package_info(), self.ctx)
        dirs = filter(lambda s: not s.endswith('.java'), os.listdir(self.d))
        stmts = util.search(self.stmt, context.node_stmts)
        for directory in dirs:
            for sub in stmts:
                if util.normalize(sub.arg) == util.normalize(directory):
                    old_d = self.d
                    self.d += os.sep + directory
                    old_pkg = self.pkg
                    self.pkg += '.' + directory
                    old_stmt = self.stmt
                    self.stmt = sub

                    self.generate_package_info()

                    self.d = old_d
                    self.pkg = old_pkg
                    self.stmt = old_stmt

    def gen_package_info(self):
        """Writes a package-info.java file to the package directory with a high
        level description of the package functionality and requirements.

        """
        module = util.get_module(self.stmt).arg
        return ''.join([context.package_info.format(' ' + module, ''), self.pkg, ';'])
