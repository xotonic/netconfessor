from ..java import util
from ..java_value import JavaValue
from ..method import JavaMethod
from java_method import MethodGenerator


class LeafMethodGenerator(MethodGenerator):
    """Method generator for YANG leaf and leaf-list associated methods"""

    def __init__(self, stmt, ctx):
        super(LeafMethodGenerator, self).__init__(stmt, ctx)
        assert self.is_leaf
        self.stmt_type = util.search_one(stmt, 'type')
        self.base_type = util.get_base_type(self.stmt_type)
        self.default = util.search_one(stmt, 'default')
        self.default_value = None if not self.default else self.default.arg
        self.type_str = util.get_types(self.stmt_type, ctx)
        self.is_string = self.type_str[1] == 'String'
        self.is_typedef = False
        key = util.search_one(util.get_parent(stmt), 'key')
        self.is_optional = key is None or stmt.arg not in key.arg.replace('\n', '').split(' ')
        self.is_key = not self.is_optional
        self.is_enum_holder = self.type_str[0] == 'io.netconfessor.YangEnumeration'


    def constructors(self):
        return [self.empty_constructor(), self.value_constructor()]

    def setters(self):
        return NotImplemented

    def markers(self):
        return NotImplemented

    def child_field(self):
        """Returns a string representing java code for a field"""
        res = JavaValue(name=self.n2, value='null')
        res.add_javadoc(' '.join(['Field for child', self.stmt.keyword,
                                  '"' + self.stmt.arg + '".']))
        res.add_modifier('public')
        res.add_modifier(self.n)
        res.add_dependency(self.n)
        return self.fix_imports(res, child=True)

    def deleters(self):
        """Returns a list with a single method that deletes an instance of the
        class to be generated from the statement of this method generator to
        its parent class.

        """
        method = self._parent_template('delete')
        method.add_javadoc(''.join(['Deletes ', self.stmt.keyword,
                                    ' entry "', self.n2, '".']))
        method.add_javadoc('@return An array of the deleted element nodes.')
        method.add_line(''.join(['this.', self.n2, ' = null;']))
        method.add_line(''.join(['String path = "', self.stmt.arg, '";']))
        method.set_return_type('NodeSet')
        method.add_line('return delete(path);')
        return [self.fix_imports(method, child=True)]

    def parent_access_methods(self):
        res = []
        res.append(self.access_methods_comment())
        res.extend(self.adders())
        res.append(self.deleters())
        return res

    def leaf_value_access_methods(self):
        value_type = self.type_str[0]  # JNC type
        this_class_name = self.n

        setter = self.value_method(this_class_name, value_type)
        getter = self.get_value_method(this_class_name, value_type)
        default_getter = self.default_value_method(this_class_name, value_type)
        default_getter_predicate = self.has_default_value_method()
        is_key_method = self.is_key_method()
        type_factory_method = self.instantiate_value_method(this_class_name, value_type)
        static_type_factory = self.create_value_method(this_class_name, value_type)
        value_class_getter = self.get_value_class_method(this_class_name, value_type)

        methods = [getter, setter, default_getter, default_getter_predicate, type_factory_method,
                   static_type_factory, value_class_getter]
        # default implementation is in parent
        if self.is_key:
            methods.append(is_key_method)
        return methods

    def enum_holder_impl(self):

        value_type = self.type_str[0]  # JNC type
        this_class_name = self.n

        if self.is_enum_holder:
            first_value = JavaMethod(name='createWithFirstSelectedItem')
            first_value.add_override_annotation()
            first_value.set_return_type(value_type, this_class_name)
            first_value.add_exception('JNCException')
            # Leaves with a default value returns it instead of null
            enum_values = util.search(self.base_type, 'enum')
            new_value = ['new ', first_value.return_type, '("', enum_values[0].arg]
            new_value.append('", new String[] {\n')
            for enum in enum_values:
                new_value.append(' ' * 16 + '"' + enum.arg + '",\n')
            new_value.append(' ' * 12 + '})')
            first_value.add_line(''.join(['return ', ''.join(new_value), ';']))
            self.fix_imports(first_value, child=True)
            return [first_value]
        else:
            return []

    def value_constructor(self):
        value_type = self.type_str[0]  # JNC type
        this_class_name = self.n
        m = self.empty_constructor()
        m.add_parameter(value_type, 'value', this_class_name)
        m.add_line('this.value(value);')
        return m