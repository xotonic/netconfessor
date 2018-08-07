import os
import re

from .. import util, context

from ..java_value import JavaValue
from ..method import JavaMethod
from ..ordered_set import OrderedSet


class MethodGenerator(object):
    """A generator for JavaMethod objects"""

    def __init__(self, stmt, ctx):
        """Sets the attributes of the method generator, depending on stmt"""
        self.stmt = stmt
        self.n = util.normalize(stmt.arg)
        self.n2 = util.camelize(stmt.arg)
        self.children = [util.normalize(s.arg) for s in
                         util.search(stmt, context.yangelement_stmts | context.leaf_stmts)]

        self.ctx = ctx
        self.module_stmt = util.get_module(stmt)
        prefix = util.search_one(self.module_stmt, 'prefix')
        self.root = util.schema_class(util.normalize(prefix.arg))

        self.pkg = util.get_package(stmt, ctx)
        self.basepkg = self.pkg.partition('.')[0]
        self.rootpkg = ctx.rootpkg.split(os.sep)
        if self.rootpkg[:1] == ['src']:
            self.rootpkg = self.rootpkg[1:]  # src not part of package
        self.rootpkg.append(util.camelize(self.module_stmt.arg))

        self.is_container = stmt.keyword in ('container', 'notification')
        self.is_list = stmt.keyword == 'list'
        self.is_typedef = stmt.keyword == 'typedef'
        self.is_leaf = stmt.keyword == 'leaf'
        self.is_anyxml = stmt.keyword == 'anyxml'
        self.is_leaflist = stmt.keyword == 'leaf-list'
        self.is_top_level = util.get_parent(self.stmt) == self.module_stmt
        self.is_augmented = self.module_stmt != util.get_module(stmt.parent)
        assert (self.is_container or self.is_list or self.is_typedef
                or self.is_leaf or self.is_leaflist or self.is_anyxml)
        self.gen = self
        if type(self) is MethodGenerator:

            if self.is_typedef:
                from typedef import TypedefMethodGenerator
                self.gen = TypedefMethodGenerator(stmt, ctx)
            elif self.is_container:
                from container import ContainerMethodGenerator
                self.gen = ContainerMethodGenerator(stmt, ctx)
            elif self.is_list:
                from list import ListMethodGenerator
                self.gen = ListMethodGenerator(stmt, ctx)
            elif self.is_leaflist:
                from leaf_list import LeafListMethodGenerator
                self.gen = LeafListMethodGenerator(stmt, ctx)
            elif self.is_leaf:
                from leaf import LeafMethodGenerator
                self.gen = LeafMethodGenerator(stmt, ctx)
            elif self.is_anyxml:
                from anyxml import AnyXmlMethodGenerator
                self.gen = AnyXmlMethodGenerator(stmt, ctx)

    def canonical_import(self, import_, child=False):
        """Returns a string representing a class that can be imported in Java.

        Does not handle Generics or Array types.

        """
        if import_ == self.root:
            return '.'.join(self.rootpkg + [import_])
        elif import_ in self.children:
            type_child = util.search_one(self.stmt, 'type')
            if type_child is not None and util.normalize(type_child.arg) == import_:
                try:
                    typedef_pkg = util.get_package(type_child.i_typedef, self.ctx)
                except AttributeError:
                    typedef_pkg = util.get_package(type_child, self.ctx)
                return '.'.join([typedef_pkg, import_])
            return '.'.join([self.pkg, self.n2, import_])
        elif child and import_ == self.n:
            return '.'.join([self.pkg, import_])
        else:
            return util.get_import(import_)

    def fix_imports(self, method, child=False):
        res = set([])
        imports = method.imports
        if self.ctx.opts.import_on_demand:
            imports = set([])
            pkg = self.pkg
            if child:
                pkg = pkg.rpartition('.')[0]
            pkg_classes = context.class_hierarchy.get(pkg, [])
            for import_ in method.imports:
                if import_.rpartition('.')[2] in pkg_classes:
                    if (child and not import_.rpartition('.')[1]
                            and import_ != self.root):
                        imports.add('.'.join([self.pkg, import_]))
                    else:
                        imports.add(import_)

        for dependency in imports:
            if dependency.startswith(('java.math', 'java.util',
                                      'io.netconfessor', self.basepkg)):
                res.add(dependency)
                continue
            elif dependency.endswith('>'):
                for token in [_f for _f in re.findall(r'\w+', dependency) if _f]:
                    res.add(self.canonical_import(token, child))
            elif dependency.endswith(']'):
                assert dependency[:-2] and dependency[-2:] == '[]'
                res.add(self.canonical_import(dependency[:-2], child))
            else:
                res.add(self.canonical_import(dependency, child))

        method.imports = res
        return method

    def _root_namespace(self, stmt_arg):
        """Returns '([Root].NAMESPACE, "[stmt.arg]");'"""
        return ['(', self.root, '.NAMESPACE, "', stmt_arg, '");']

    def _constructor_template(self):
        """Returns a constructor invoking parent constructor, without
        parameters and javadoc."""
        constructor = JavaMethod(modifiers=['public'], name=self.n)
        constructor.set_return_type(None)
        if self.is_container or self.is_list or self.is_anyxml or self.is_leaf or self.is_leaflist:
            call = ['super']
            call.extend(self._root_namespace(self.stmt.arg))
            constructor.add_dependency(self.root)
            constructor.add_line(''.join(call))
            if self.is_top_level or self.is_augmented:
                constructor.add_line('setDefaultPrefix();')
                setPrefix = ['setPrefix(', self.root, '.PREFIX);']
                constructor.add_line(''.join(setPrefix))
        elif self.is_typedef:
            constructor.add_line('super(value);')
        else:
            return None
        return self.fix_imports(constructor)

    def access_methods_comment(self):
        """Returns a JavaValue representing a code structuring Java comment"""
        res = ['    /* Access methods for']
        if hasattr(self.gen, 'is_optional') and self.gen.is_optional:
            res.append('optional')
        res.extend([self.stmt.keyword, 'child: "' + self.stmt.arg + '". */'])
        return JavaValue(exact=[' '.join(res)])

    def empty_constructor(self):
        """Returns parameter-free constructor as a JavaMethod object"""
        assert not self.is_typedef, "Typedefs don't have empty constructors"
        constructor = self._constructor_template()
        javadoc = ['Constructor for an empty ']
        javadoc.append(self.n)
        javadoc.append(' object.')
        constructor.add_javadoc(''.join(javadoc))
        return self.fix_imports(constructor)

    def constructors(self):
        """Returns a list of JavaMethods representing constructors to include
        in generated class of self.stmt

        """
        assert self.gen is not self, 'Avoid infinite recursion'

        return self.gen.constructors()

    def cloners(self):
        if self.is_typedef:
            return []  # Typedefs, leafs and leaflists don't have clone methods
        cloners = [JavaMethod(), JavaMethod()]
        a = (' an exact ', ' a shallow ')
        b = ('', ' Children are not included.')
        c = ('', 'Shallow')
        keys = ''
        if self.is_list:
            getter_calls = []
            for key_stmt in self.gen.key_stmts:
                getter_calls.append(''.join([util.camelize(key_stmt.arg), '.getValue().toString()']))
            keys = ', '.join(getter_calls)
        for i, cloner in enumerate(cloners):
            cloner.add_javadoc('Clones this object, returning' + a[i] + 'copy.')
            cloner.add_javadoc('@return A clone of the object.' + b[i])
            cloner.return_type = self.n
            cloner.set_name('clone' + c[i])
            copy = ''.join(['new ', self.n, '(', keys, ')'])
            if self.is_list and self.gen.is_config:
                cloner.add_line(self.n + ' copy;')
                cloner.add_line('try {')
                cloner.add_line('    copy = ' + copy + ';')
                cloner.add_line('} catch (JNCException e) {')
                cloner.add_line('    copy = null;')
                cloner.add_line('}')
                copy = 'copy'
            cloner.add_line(''.join(['return (', self.n, ')clone', c[i],
                                     'Content(', copy, ');']))
            cloner = self.fix_imports(cloner)

        # Clone method without children
        cloner_wo_chields = JavaMethod()
        cloner_wo_chields.return_type = self.n
        cloner_wo_chields.set_name('cloneWithoutChildren')
        cloner_wo_chields.add_line(''.join(['return new ', self.n, '();']))
        cloners.append(cloner_wo_chields)

        return cloners

    def key_names(self):
        """Returns a method that can be used to get the keys of a statement.

        The keys are returned by the generated method as a String array
        with the identifiers of the keys in the statement of this generator,
        which should be a list, container or notification, otherwise None is
        returned. If the statement does not have any keys, the generated method
        returns null.

        """
        if not (self.is_list or self.is_container or self.is_anyxml):
            return None
        method = JavaMethod(modifiers=['public'], name='keyNames')
        method.set_return_type('String[]')
        method.add_javadoc('@return An array with the identifiers of any key children')
        if self.is_container or self.is_anyxml or not self.gen.is_config:
            method.add_line('return null;')
        else:
            method.add_line('return new String[] {')
            for key_stmt in self.gen.key_stmts:
                method.add_line('"'.join([' ' * 4,
                                          key_stmt.arg,
                                          ',']))
            method.add_line('};')
        return self.fix_imports(method)

    def children_names(self):
        """Returns a method that can be used to get the identifiers of the
        children of the statement of this generator, excluding any keys.

        """
        if not (self.is_list or self.is_container or self.is_anyxml):
            return None

        if self.is_anyxml:
            method = JavaMethod(modifiers=['public'], name='childrenNames')
            method.set_return_type('String[]')
            method.add_line('return super.childrenNames();')
        else:
            method = JavaMethod(modifiers=['public'], name='childrenNames')
            method.set_return_type('String[]')
            method.add_javadoc('@return An array with the identifiers of any children, in order.')
            children = util.search(self.stmt, context.yangelement_stmts | context.leaf_stmts)
            method.add_line('return new String[] {')
            for child in children:
                method.add_line('"'.join([' ' * 4, child.arg, ',']))
            method.add_line('};')
        return self.fix_imports(method)

    def support_method(self, fields=None):

        if self.is_typedef:
            return None
        add_child = JavaMethod(modifiers=['public'],
                               return_type='void',
                               name='addChild',
                               params=[('Element', 'child')])
        add_child.add_javadoc('Support method for addChild.')
        add_child.add_javadoc('Adds a child to this object.')
        add_child.add_javadoc('')
        add_child.add_javadoc('@param child The child to add')
        add_child.add_line('super.addChild(child);')
        if fields is None:
            fields = OrderedSet()
        cond = ''
        for field in fields:  # could do reversed(fields) to preserve order
            add_child.add_line(''.join([cond, 'if (child instanceof ',
                                        util.normalize(field), ') ', util.camelize(field), ' = (',
                                        util.normalize(field), ')child;']))
            add_child.add_dependency(util.normalize(field))
            cond = 'else '
        return self.fix_imports(add_child)

    def setters(self):
        """Returns a list of JavaMethods representing setters to include
        in generated class of self.stmt

        """
        assert self.gen is not self, 'Avoid infinite recursion'
        return self.gen.setters()

    def unsetter(self):
        """Returns an 'unset<Identifier>Value' JavaMethod for self.stmt"""
        assert self.gen is not self, 'Avoid infinite recursion'
        return None

    def checker(self):
        """Returns a 'check' JavaMethod for generated class for self.stmt"""
        assert self.gen is not self, 'Avoid infinite recursion'
        return self.gen.checker() if self.is_typedef else None

    def markers(self):
        """Generates methods that enqueues operations to be performed."""
        assert self.gen is not self, 'Avoid infinite recursion'
        return None if self.is_typedef else self.gen.markers()

    def child_field(self):
        """Returns a string representing java code for a field"""
        assert self.gen is not self, 'Avoid infinite recursion'
        return self.gen.child_field() if self.is_container or self.is_anyxml or self.is_leaf else None

    def _parent_template(self, method_type):
        """Returns an access method for the statement of this method generator.

        method_type -- prefix of method name

        """
        method = JavaMethod()
        if self.is_container or self.is_list or self.is_anyxml or self.is_anyxml:
            method.set_return_type(self.n)
        method.set_name(method_type + self.n)
        method.add_exception('JNCException')
        return self.fix_imports(method, child=True)

    def adders(self):
        """Returns a list of methods that adds an instance of the class to be
        generated from the statement of this method generator to its parent
        class.

        """
        if self.is_leaflist:
            assert self.gen != self
            return self.gen.adders()
        elif not (self.is_container or self.is_list or self.is_anyxml or self.is_leaf):
            return None
        number_of_adders = 2
        if self.is_list and self.gen.is_config:
            number_of_adders = 4
        res = [self._parent_template('add') for _ in range(number_of_adders)]

        for i, method in enumerate(res):
            javadoc1 = ['Adds ', self.stmt.keyword, ' entry "', self.n2, '"']
            javadoc2 = []
            if i == 0:  # Add existing object
                javadoc1.append(', using an existing object.')
                javadoc2.append(' '.join(['@param', self.n2, 'The object to add.']))
                method.add_parameter(self.n, self.n2)
            elif self.is_list and i in {1, 2} and len(res) == 4:
                # Add child with String or JNC type keys
                javadoc1.append(', with specified keys.')
                if i == 2:
                    javadoc2.append('The keys are specified as strings.')
                for key_stmt in self.gen.key_stmts:
                    # print(key_stmt.arg)
                    key_arg = util.camelize(key_stmt.arg) + 'Value'
                    javadoc2.append(''.join(['@param ', key_arg,
                                             ' Key argument of child.']))
                    param_type, _ = util.get_types(key_stmt, self.ctx)
                    if i == 2:
                        param_type = 'String'
                    method.add_parameter(param_type, key_arg)
                new_child = [self.n, ' ', self.n2, ' = new ', self.n, '(']
                keys = [util.camelize(s.arg) + 'Value' for s in self.gen.key_stmts]
                new_child.append(', '.join(keys))
                new_child.append(');')
                method.add_line(''.join(new_child))
            else:  # Create new, for subtree filter usage
                javadoc1.append('.')
                javadoc2.append('This method is used for creating subtree filters.')
                method.add_line(' '.join([self.n, self.n2, '= new', self.n + '();']))
            method.add_javadoc(''.join(javadoc1))
            for javadoc in javadoc2:
                method.add_javadoc(javadoc)
            method.add_javadoc('@return The added child.')
            if self.is_container:
                method.add_line('this.' + self.n2 + ' = ' + self.n2 + ';')
            if self.is_list and i in {1, 2} and len(res) == 4:
                method.add_line('return ' + method.name + '(' + self.n2 + ');')
            elif self.is_leaf:
                method.set_return_type(self.n)
                method.add_line('this.' + self.n2 + ' = ' + self.n2 + ';')
                method.add_line('insertChild(' + self.n2 + ', childrenNames());')
                method.add_line('return ' + self.n2 + ';')
            else:
                method.add_line('insertChild(' + self.n2 + ', childrenNames());')
                method.add_line('return ' + self.n2 + ';')
            self.fix_imports(method, child=True)
        return res

    def getters(self):
        """Returns a list of JavaMethods representing getters to include
        in generated class of parent

        """
        assert self.gen is not self, 'Avoid infinite recursion'
        return self.gen.getters() if self.is_list or self.is_leaf or self.is_anyxml else None

    def deleters(self):
        """Returns a list of JavaMethods representing deleters to include
        in generated class of parent

        """
        assert self.gen is not self, 'Avoid infinite recursion'
        if not (self.is_list or self.is_container or self.is_leaflist or self.is_anyxml):
            return None
        else:
            return self.gen.deleters()

    def child_iterator(self):
        """Returns a java iterator method"""
        if not (self.is_leaflist or self.is_list):
            return None

        res = JavaMethod(name=(self.n2 + 'Iterator'))
        res.add_javadoc(''.join(['Iterator method for the ', self.stmt.keyword,
                                 ' "', self.stmt.arg, '".']))
        res.add_javadoc(''.join(['@return An iterator for the ',
                                 self.stmt.keyword, '.']))
        return_stmt = ['return new Element']
        if self.is_leaflist:
            res.set_return_type('ElementLeafListValueIterator')
            return_stmt.append('LeafListValue')
        else:  # List
            res.set_return_type(''.join(['ElementChildrenIterator', '<', self.n, '>']))
            return_stmt.append('Children')
        return_stmt.extend(['Iterator(children, "', self.stmt.arg, '");'])
        res.add_line(''.join(return_stmt))
        return self.fix_imports(res)

    def parent_access_methods(self):
        assert self.gen is not self, 'Avoid infinite recursion'
        if self.is_container or self.is_list or self.is_anyxml or self.is_leaf or self.is_leaflist:
            return self.gen.parent_access_methods()
        else:
            return None

    def leaf_value_access_methods(self):
        assert self.gen is not self, 'This method must be overriden'
        assert self.is_leaf or self.is_leaflist
        return self.gen.leaf_value_access_methods()

    def create_value_method(self, this_class_name, value_type):

        assert self.is_leaf or self.is_leaflist

        static_type_factory = JavaMethod(name='createValue')
        dependency = static_type_factory.add_dependency(value_type, this_class_name)
        param_name = 'stringRepresentation'
        static_type_factory.add_parameter('String', param_name, this_class_name)
        static_type_factory.add_exception('JNCException')
        static_type_factory.set_return_type(dependency, this_class_name)
        return_stmt = 'return '
        if self.gen.type_str[0] == 'io.netconfessor.YangEmpty':
            static_type_factory.add_parameter('String', param_name)
            l = [return_stmt, 'new ', dependency, '();']
            static_type_factory.add_line(''.join(l))
        else:
            line = [return_stmt, 'new ', dependency,
                    '(', param_name]
            if self.gen.type_str[0] == 'io.netconfessor.YangUnion':
                line.append(', new String[] {')
                static_type_factory.add_line(''.join(line))
                for type_stmt in util.search(self.gen.base_type, 'type'):
                    member_type, _ = util.get_types(type_stmt, self.gen.ctx)
                    static_type_factory.add_line('     "' + member_type + '",')
                line = ['}']
            elif self.gen.type_str[0] == 'io.netconfessor.YangEnumeration':
                line.append(', new String[] {')
                static_type_factory.add_line(''.join(line))
                for enum in util.search(self.gen.base_type, 'enum'):
                    static_type_factory.add_line('     ' + util.capitalize(enum.arg) + ',')
                line = ['}']
            elif self.gen.type_str[0] == 'io.netconfessor.YangBits':
                line.append(',')
                static_type_factory.add_line(''.join(line))
                mask = 0
                smap = ['    new String[] {']
                imap = ['    new int[] {']
                position = 0
                for bit in util.search(self.gen.base_type, 'bit'):
                    smap.extend(['"', bit.arg, '", '])
                    pos_stmt = util.search_one(bit, 'position')
                    if pos_stmt:
                        position = int(pos_stmt.arg)
                    imap.extend([str(position), ', '])
                    mask += 1 << position
                    position += 1
                smap.append('},')
                imap.append('}')
                static_type_factory.add_line(''.join(['    new BigInteger("',
                                                      str(mask), '"),']))
                static_type_factory.add_line(''.join(smap))
                static_type_factory.add_line(''.join(imap))
                line = []
            elif self.gen.type_str[0] == 'io.netconfessor.YangDecimal64':
                frac_digits = util.search_one(self.gen.base_type, 'fraction-digits')
                line.extend([', ', frac_digits.arg])

            line.append(');')
            static_type_factory.add_line(''.join(line))
        self.fix_imports(static_type_factory, child=True)
        return static_type_factory

    def value_method(self, this_class_name, value_type):

        assert self.is_leaf or self.is_leaflist

        setter = JavaMethod(name='value')
        setter.add_exception('JNCException')
        param_name = self.n2 + 'Value'
        setter.add_javadoc('Sets the value  ' + self.stmt.keyword +
                           ' "' + self.stmt.arg + '",')
        setter.add_line(''.join(['setValue(', param_name, ');']))
        setter.add_parameter(value_type, param_name, this_class_name)
        setter.add_javadoc(' '.join(['@param', param_name, 'used during instantiation.']))
        self.fix_imports(setter, child=True)
        return setter

    def get_value_method(self, this_class_name, value_type):

        assert self.is_leaf or self.is_leaflist

        getter = JavaMethod(name='value')
        getter.set_return_type(value_type, this_class_name)
        getter.add_line(' '.join(['return',
                                  '(' + getter.add_dependency(value_type, this_class_name) + ')', 'getValue();']))
        self.fix_imports(getter, child=True)
        return getter

    def get_value_class_method(self, this_class_name, value_type):

        assert self.is_leaf or self.is_leaflist

        getter = JavaMethod(name='valueClass')
        getter.set_return_type_generic('Class', value_type, this_class_name)
        getter.add_line(' '.join(['return', getter.add_dependency(value_type, this_class_name) + '.class;']))
        self.fix_imports(getter, child=True)
        return getter

    def default_value_method(self, this_class_name, value_type):

        assert self.is_leaf or self.is_leaflist

        default_getter = JavaMethod(name='defaultValue')
        default_getter.set_return_type(value_type, this_class_name)
        default_getter.add_exception('JNCException')
        # Leaves with a default value returns it instead of null
        if self.gen.default:

            new_value = ['new ', default_getter.return_type, '("',
                         self.gen.default_value]
            if self.gen.type_str[0] == 'io.netconfessor.YangUnion':
                new_value.append('", new String[] {  \n')
                for type_stmt in util.search(self.gen.base_type, 'type'):
                    member_type, _ = util.get_types(type_stmt, self.gen.ctx)
                    new_value.append(' ' * 16 + '"' + member_type + '",\n')
                new_value.append(' ' * 12 + '})')
            elif self.gen.type_str[0] == 'io.netconfessor.YangEnumeration':
                new_value.append('", new String[] {\n')
                for enum in util.search(self.gen.base_type, 'enum'):
                    new_value.append(' ' * 16 + '"' + enum.arg + '",\n')
                new_value.append(' ' * 12 + '})')
            elif self.gen.type_str[0] == 'io.netconfessor.YangBits':
                new_value.append('",')
                default_getter.add_line(''.join(new_value))
                mask = 0
                smap = ['        new String[] {']
                imap = ['        new int[] {']
                position = 0
                for bit in util.search(self.gen.base_type, 'bit'):
                    smap.extend(['"', bit.arg, '", '])
                    pos_stmt = util.search_one(bit, 'position')
                    if pos_stmt:
                        position = int(pos_stmt.arg)
                    imap.extend([str(position), ', '])
                    mask += 1 << position
                    position += 1
                smap.append('},')
                imap.append('}')
                line = [' ' * 8, 'new BigInteger("', str(mask), '"),']
                default_getter.add_line(''.join(line))
                default_getter.add_line(''.join(smap))
                default_getter.add_line(''.join(imap))
                new_value = ['    )']
            elif self.gen.type_str[0] == 'io.netconfessor.YangDecimal64':
                fraction_digits = util.search_one(self.gen.base_type, 'fraction-digits')
                new_value.extend(['", ', fraction_digits.arg, ')'])
            else:
                new_value.append('")')
            default_getter.add_line(''.join(['return ', ''.join(new_value), ';']))
        else:
            default_getter.add_line('return null;')
        self.fix_imports(default_getter, child=True)
        return default_getter

    def is_key_method(self):
        assert self.is_leaf

        default_getter_predicate = JavaMethod(name='isKey')
        default_getter_predicate.set_return_type('boolean')

        default_getter_predicate.add_line('return ' + ('true' if self.gen.is_key else 'false') + ";")
        self.gen.fix_imports(default_getter_predicate, child=True)
        return default_getter_predicate

    def has_default_value_method(self):

        assert self.is_leaf or self.is_leaflist

        default_getter_predicate = JavaMethod(name='hasDefaultValue')
        default_getter_predicate.set_return_type('boolean')
        default_getter_predicate.add_line('return ' + ('true' if self.gen.default else 'false') + ";")
        self.gen.fix_imports(default_getter_predicate, child=True)
        return default_getter_predicate

    def instantiate_value_method(self, this_class_name, value_type):

        assert self.is_leaf or self.is_leaflist

        type_factory_method = JavaMethod(name='instantiateValue')
        param_name = 'stringRepresentation'
        type_factory_method.add_parameter('String', param_name, this_class_name)
        type_factory_method.add_exception('JNCException')
        setter_name = 'value'
        if self.gen.type_str[0] == 'io.netconfessor.YangEmpty':
            type_factory_method.add_parameter('String', param_name)
            l = [setter_name, '(new ', type_factory_method.add_dependency(value_type, this_class_name), '());']
            type_factory_method.add_line(''.join(l))
        else:
            line = [setter_name, '(new ', type_factory_method.add_dependency(value_type, this_class_name),
                    '(', param_name]
            if self.gen.type_str[0] == 'io.netconfessor.YangUnion':
                line.append(', new String[] {')
                type_factory_method.add_line(''.join(line))
                for type_stmt in util.search(self.gen.base_type, 'type'):
                    member_type, _ = util.get_types(type_stmt, self.gen.ctx)
                    type_factory_method.add_line('     "' + member_type + '",')
                line = ['}']
            elif self.gen.type_str[0] == 'io.netconfessor.YangEnumeration':
                line.append(', new String[] {')
                type_factory_method.add_line(''.join(line))
                for enum in util.search(self.gen.base_type, 'enum'):
                    type_factory_method.add_line('     "' + enum.arg + '",')
                line = ['}']
            elif self.gen.type_str[0] == 'io.netconfessor.YangBits':
                line.append(',')
                type_factory_method.add_line(''.join(line))
                mask = 0
                smap = ['    new String[] {']
                imap = ['    new int[] {']
                position = 0
                for bit in util.search(self.gen.base_type, 'bit'):
                    smap.extend(['"', bit.arg, '", '])
                    pos_stmt = util.search_one(bit, 'position')
                    if pos_stmt:
                        position = int(pos_stmt.arg)
                    imap.extend([str(position), ', '])
                    mask += 1 << position
                    position += 1
                smap.append('},')
                imap.append('}')
                type_factory_method.add_line(''.join(['    new BigInteger("',
                                                      str(mask), '"),']))
                type_factory_method.add_line(''.join(smap))
                type_factory_method.add_line(''.join(imap))
                line = []
            elif self.gen.type_str[0] == 'io.netconfessor.YangDecimal64':
                frac_digits = util.search_one(self.gen.base_type, 'fraction-digits')
                line.extend([', ', frac_digits.arg])

            line.append('));')
            type_factory_method.add_line(''.join(line))
        self.fix_imports(type_factory_method, child=True)
        return type_factory_method

    def enums(self):
        return self.gen.enums()

    def enum_consts(self):
        return self.gen.enum_consts()