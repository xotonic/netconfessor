import collections

from tools.jnc_plugin import util, context
from tools.jnc_plugin.java_value import JavaValue
from tools.jnc_plugin.ordered_set import OrderedSet


class JavaClass(object):
    """Encapsulates package name, imports, class declaration, constructors,
    fields, access methods, etc. for a Java Class. Also includes javadoc
    documentation where applicable.

    Implementation: Unless the 'body' attribute is used, different kind of
    methods and fields are stored in separate dictionaries so that the order of
    them in the generated class does not depend on the order in which they were
    added.

    """

    def __init__(self, filename=None, package=None, imports=None,
                 description=None, body=None, version='1.0',
                 superclass=None, interfaces=None, source='<unknown>.yang', abstract=False):
        """Constructor.

        filename    -- Should preferably not contain a complete path since it is
                       displayed in a Java comment in the beginning of the code.
        package     -- Should be just the name of the package in which the class
                       will be included.
        imports     -- Should be a list of names of imported libraries.
        description -- Defines the class semantics.
        body        -- Should contain the actual code of the class if it is not
                       supplied through the add-methods
        version     -- Version number, defaults to '1.0'.
        superclass  -- Parent class of this Java class, or None
        interaces   -- List of interfaces implemented by this Java class
        source      -- A string somehow representing the origin of the class

        """
        if imports is None:
            imports = []
        self.filename = filename
        self.package = package if package[:3] != 'src' else package[4:]
        self.imports = OrderedSet()
        for i in range(len(imports)):
            self.imports.add(imports[i])
        self.description = description
        self.body = body
        self.version = version
        self.superclass = superclass
        self.interfaces = interfaces
        if interfaces is None:
            self.interfaces = []
        self.source = source
        self.fields = OrderedSet()
        self.constructors = OrderedSet()
        self.cloners = OrderedSet()
        self.value_setters = OrderedSet()
        self.enablers = OrderedSet()
        self.schema_registrators = OrderedSet()
        self.name_getters = OrderedSet()
        self.access_methods = collections.OrderedDict()
        self.support_methods = OrderedSet()
        self.abstract = abstract
        self.attrs = [self.fields,
                      self.value_setters,
                      self.constructors,
                      self.cloners,
                      self.enablers,
                      self.schema_registrators,
                      self.name_getters,
                      self.access_methods,
                      self.support_methods]

    def add_field(self, field):
        """Adds a field represented as a string"""
        self.fields.add(field)

    def add_constructor(self, constructor):
        """Adds a constructor represented as a string"""
        self.constructors.add(constructor)

    def add_cloner(self, cloner):
        """Adds a clone method represented as a string"""
        if not isinstance(cloner, str):
            for import_ in cloner.imports:
                self.imports.add(import_)
        self.cloners.add(cloner)

    def add_value_setter(self, setter):
        """Adds a clone method represented as a string"""
        if not isinstance(setter, str):
            for import_ in setter.imports:
                self.imports.add(import_)
        self.value_setters.add(setter)

    def add_enabler(self, enabler):
        """Adds an 'enable'-method as a string"""
        self.imports.add('io.netconfessor.JNCException')
        self.imports.add('io.netconfessor.YangElement')
        self.enablers.add(enabler)

    def add_schema_registrator(self, schema_registrator):
        """Adds a register schema method"""
        self.imports.add('io.netconfessor.JNCException')
        self.imports.add('io.netconfessor.SchemaParser')
        self.imports.add('io.netconfessor.Tagpath')
        self.imports.add('io.netconfessor.SchemaNode')
        self.imports.add('io.netconfessor.SchemaTree')
        self.imports.add('java.util.HashMap')
        self.schema_registrators.add(schema_registrator)

    def add_name_getter(self, name_getter):
        """Adds a keyNames or childrenNames method represented as a string"""
        self.name_getters.add(name_getter)

    def append_access_method(self, key, access_method):
        """Adds an access method represented as a string"""
        if self.access_methods.get(key) is None:
            self.access_methods[key] = []
        self.access_methods[key].append(access_method)

    def add_support_method(self, support_method):
        """Adds a support method represented as a string"""
        self.support_methods.add(support_method)

    def add_method(self, method):
        """Adds a support method represented as a string"""
        self.support_methods.add(method)

    def get_body(self):
        """Returns self.body. If it is None, fields and methods are added to it
        before it is returned."""
        if self.body is None:
            self.body = []
            if self.superclass is not None or 'Serializable' in self.interfaces:
                self.body.extend(JavaValue(
                    modifiers=['private', 'static', 'final', 'long'],
                    name='serialVersionUID', value='1L').as_list())
                self.body.append('')
            for method in util.flatten(self.attrs):
                if hasattr(method, 'as_list'):
                    self.body.extend(method.as_list())
                else:
                    self.body.append(method)
                self.body.append('')
            self.body.append('}')
        return self.body

    def get_superclass_and_interfaces(self):
        """Returns a string with extends and implements"""
        res = []
        if self.superclass:
            res.append(' extends ')
            res.append(self.superclass)
        if self.interfaces:
            res.append(' implements ')
            res.append(', '.join(self.interfaces))
        return ''.join(res)

    def add_interface_implementation(self, interface, package):
        self.imports.add(package + '.' + interface)
        self.interfaces.append(interface)

    def as_list(self):
        """Returns a string representing complete Java code for this class.

        It is vital that either self.body contains the complete code body of
        the class being generated, or that it is None and methods have been
        added using the JavaClass.add methods prior to calling this method.
        Otherwise the class will be empty.

        The class name is the filename without the file extension.

        """
        # # The header is placed in the beginning of the Java file
        # header = [' '.join(['/* \n * @(#)' + self.filename, '      ',
        #                     self.version, date.today().strftime('%d/%m/%y')])]
        # header.append(' *')
        # header.append(' * This file has been auto-generated by JNC, the')
        # header.append(' * Java output format plug-in of pyang.')
        # header.append(' * Origin: ' + self.source)
        # header.append(' */')
        #
        # # package and import statement goes here
        # header.append('')
        header = ['']
        header.append('package ' + self.package + ';')
        if self.body is None:
            for method in util.flatten(self.attrs):
                if hasattr(method, 'imports'):
                    self.imports |= method.imports
                if hasattr(method, 'exceptions'):
                    self.imports |= ['io.netconfessor.' + s for s in method.exceptions]
        if self.superclass:
            self.imports.add(util.get_import(self.superclass))
        imported_classes = []
        if self.imports:
            prevpkg = ''
            for import_ in self.imports.as_sorted_list():
                pkg, _, cls = import_.rpartition('.')
                if (cls != self.filename.split('.')[0]
                        and (pkg != 'io.netconfessor' or cls in context.io_netconfessor
                             or cls == '*')):
                    if cls in imported_classes:
                        continue
                    else:
                        imported_classes.append(cls)
                    basepkg = import_[:import_.find('.')]
                    if basepkg != prevpkg:
                        header.append('')
                    header.append('import ' + import_ + ';')
                    prevpkg = basepkg

        # Class doc-comment and declaration, with modifiers
        header.append('')
        header.append('/**')
        header.append(' * ' + self.description)
        header.append(' *')
        # header.append(' '.join([' * @version',
        #                         self.version,
        #                         date.today().isoformat()]))
        header.append(' * @author jnc.py')
        header.append(' */')
        header.append(''.join(['public', ' abstract ' if self.abstract else ' ', 'class ',
                               self.filename.split('.')[0],
                               self.get_superclass_and_interfaces(),
                               ' {']))
        header.append('')
        return header + self.get_body()