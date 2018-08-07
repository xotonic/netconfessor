from ..java import util
from ..method import JavaMethod
from java_method import MethodGenerator


class LeafListMethodGenerator(MethodGenerator):
    """Method generator for YANG leaf and leaf-list associated methods"""

    def __init__(self, stmt, ctx):
        super(LeafListMethodGenerator, self).__init__(stmt, ctx)
        assert self.is_leaflist
        self.stmt_type = util.search_one(stmt, 'type')
        self.base_type = util.get_base_type(self.stmt_type)
        self.default = util.search_one(stmt, 'default')
        self.default_value = None if not self.default else self.default.arg
        self.type_str = util.get_types(self.stmt_type, ctx)
        self.is_string = self.type_str[1] == 'String'
        self.is_typedef = False
        key = util.search_one(util.get_parent(stmt), 'key')
        self.is_optional = key is None or stmt.arg not in key.arg.split(' ')
        self.is_enum_holder = self.type_str == 'io.netconfessor.YangEnumeration'

    def constructors(self):
        return [self.empty_constructor()]

    def getters(self):
        """get<Identifier>Value method generator."""
        assert self.is_leaf
        method = JavaMethod()
        method.set_return_type(self.type_str[0])
        method.set_name('get' + self.n + 'Value')
        method.add_exception('JNCException')

        # YangEmpty type needs to be special treated
        if self.type_str[0] == 'io.netconfessor.YangEmpty':
            method.add_javadoc('Searches for ' + self.stmt.keyword + ' "' +
                               self.stmt.arg + '".')
            method.add_javadoc('@return A YangEmpty object if ' +
                               self.stmt.keyword +
                               ' exists; <code>null</code> otherwise.')
        else:
            method.add_javadoc('Gets the value for child ' + self.stmt.keyword +
                               ' "' + self.stmt.arg + '".')
            method.add_javadoc('@return The value of the ' + self.stmt.keyword + '.')

        # Leaves with a default value returns it instead of null
        if self.default:
            method.add_line(''.join([method.return_type, ' ', self.n2, ' = (',
                                     method.return_type, ')getValue("',
                                     self.stmt.arg, '");']))
            method.add_line('if (' + self.n2 + ' == null) {')
            newValue = ['    ', self.n2, ' = new ', method.return_type, '("',
                        self.default_value]
            if self.type_str[0] == 'io.netconfessor.YangUnion':
                newValue.append('", new String[] {  // default\n')
                for type_stmt in util.search(self.base_type, 'type'):
                    member_type, _ = util.get_types(type_stmt, self.ctx)
                    newValue.append(' ' * 16 + '"' + member_type + '",\n')
                newValue.append(' ' * 12 + '});')
            elif self.type_str[0] == 'io.netconfessor.YangEnumeration':
                newValue.append('", new String[] {  // default\n')
                for enum in util.search(self.base_type, 'enum'):
                    newValue.append(' ' * 16 + '"' + enum.arg + '",\n')
                newValue.append(' ' * 12 + '});')
            elif self.type_str[0] == 'io.netconfessor.YangBits':
                newValue.append('",  // default')
                method.add_line(''.join(newValue))
                mask = 0
                smap = ['        new String[] {']
                imap = ['        new int[] {']
                position = 0
                for bit in util.search(self.base_type, 'bit'):
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
                method.add_line(''.join(line))
                method.add_line(''.join(smap))
                method.add_line(''.join(imap))
                newValue = ['    );']
            elif self.type_str[0] == 'io.netconfessor.YangDecimal64':
                fraction_digits = util.search_one(self.base_type, 'fraction-digits')
                newValue.extend(['", ', fraction_digits.arg, ');  // default'])
            else:
                newValue.append('");  // default')
            method.add_line(''.join(newValue))
            method.add_line('}')
            method.add_line('return ' + self.n2 + ';')
        else:
            method.add_line(''.join(['return (', method.return_type,
                                     ')getValue("', self.stmt.arg, '");']))
        return [self.fix_imports(method, child=True)]

    def setters(self):
        name = 'set' + self.n + 'Value'
        num_methods = 2 + (not self.is_string)
        value_type = self.type_str[0]  # JNC type
        res = [JavaMethod(name=name) for _ in range(num_methods)]

        for i, method in enumerate(res):
            param_names = [self.n2 + 'Value']
            method.add_exception('JNCException')
            method.add_javadoc('Sets the value for child ' + self.stmt.keyword +
                               ' "' + self.stmt.arg + '",')
            if i == 0:
                param_types = [value_type]
                if not self.is_typedef:
                    method.add_javadoc('using instance of generated typedef class.')
                else:
                    method.add_javadoc('using a JNC type value.')
                method.add_javadoc(' '.join(['@param', param_names[0],
                                             'The value to set.']))
                method.add_line(''.join(['set', util.normalize(self.stmt.keyword),
                                         'Value(', self.root, '.NAMESPACE,']))
                method.add_dependency(self.root)
                method.add_line('    "' + self.stmt.arg + '",')
                method.add_line('    ' + param_names[0] + ',')
                method.add_line('    childrenNames());')
            elif self.type_str[0] == 'io.netconfessor.YangEmpty':
                method.add_javadoc('by instantiating it (value n/a).')
                param_types = []  # Add parameter here to get correct javadoc
                method.add_parameter('String', param_names[0])
                method.add_javadoc(' '.join(['@param', param_names[0], 'ignored.']))
                l = [name, '(new ', method.add_dependency(value_type), '());']
                method.add_line(''.join(l))
            else:
                line = [name, '(new ', method.add_dependency(value_type),
                        '(', param_names[0]]
                if not self.is_string and i == 1:
                    param_types = [self.type_str[1]]
                    method.add_javadoc('using Java primitive values.')
                    # FIXME: Some types are incorrectly classified as string
                else:
                    param_types = ['String']
                    method.add_javadoc('using a String value.')

                if self.type_str[0] == 'io.netconfessor.YangUnion':
                    line.append(', new String[] {')
                    method.add_line(''.join(line))
                    for type_stmt in util.search(self.base_type, 'type'):
                        member_type, _ = util.get_types(type_stmt, self.ctx)
                        method.add_line('     "' + member_type + '",')
                    line = ['}']
                elif self.type_str[0] == 'io.netconfessor.YangEnumeration':
                    line.append(', new String[] {')
                    method.add_line(''.join(line))
                    for enum in util.search(self.base_type, 'enum'):
                        method.add_line('     "' + enum.arg + '",')
                    line = ['}']
                elif self.type_str[0] == 'io.netconfessor.YangBits':
                    line.append(',')
                    method.add_line(''.join(line))
                    mask = 0
                    smap = ['    new String[] {']
                    imap = ['    new int[] {']
                    position = 0
                    for bit in util.search(self.base_type, 'bit'):
                        smap.extend(['"', bit.arg, '", '])
                        pos_stmt = util.search_one(bit, 'position')
                        if pos_stmt:
                            position = int(pos_stmt.arg)
                        imap.extend([str(position), ', '])
                        mask += 1 << position
                        position += 1
                    smap.append('},')
                    imap.append('}')
                    method.add_line(''.join(['    new BigInteger("',
                                             str(mask), '"),']))
                    method.add_line(''.join(smap))
                    method.add_line(''.join(imap))
                    line = []
                elif self.type_str[0] == 'io.netconfessor.YangDecimal64':
                    frac_digits = util.search_one(self.base_type, 'fraction-digits')
                    line.extend([', ', frac_digits.arg])

                line.append('));')
                method.add_line(''.join(line))

            for param_type, param_name in zip(param_types, param_names):
                method.add_parameter(param_type, param_name)
                method.add_javadoc(' '.join(['@param', param_name,
                                             'used during instantiation.']))
            self.fix_imports(method, child=True)
        return res

    def unsetter(self):
        """unset<Identifier>Value method generator"""
        method = JavaMethod()
        method.add_javadoc(' '.join(['Unsets the value for child',
                                     self.stmt.keyword,
                                     '"' + self.stmt.arg + '".']))
        method.set_name('unset' + self.n + 'Value')
        method.add_exception('JNCException')
        method.add_line('delete("' + self.stmt.arg + '");')
        return self.fix_imports(method, child=True)

    def _parent_method(self, method_type):
        """Returns a list of methods that either creates a value in the
        leaf-list of the parent YangElement instance, or deletes it, depending
        on the method_type parameter.

        method_type -- either 'create' or 'delete'

        """
        assert self.is_leaflist
        res = [self._parent_template(method_type) for _ in range(2)]

        for i, method in enumerate(res):
            method.add_javadoc(''.join([method_type.capitalize(), 's ',
                                        self.stmt.keyword, ' entry "',
                                        self.n2, '".']))
            if i == 1:
                method.add_javadoc('The value is specified as a string.')
            method.add_javadoc(''.join(['@param ', self.n2, 'Value Value to ',
                                        method_type, '.']))
            param_type = 'String'
            if i == 0:
                param_type = self.type_str[0]
            method.add_parameter(param_type, self.n2 + 'Value')
            path = ['String path = "', self.n2, '[', self.n2, 'Value]";']
            method.add_line(''.join(path))
            if method_type == 'delete':
                method.add_line('delete(path);')
            else:  # get
                method.add_line('insertChild(path);')
            self.fix_imports(method, child=True)
        return res

    def parent_access_methods(self):
        res = []
        res.append(self.access_methods_comment())
        res.extend(self.adders())
        res.append(self.deleters())
        return res

    def deleters(self):
        """Returns a list of methods that deletes the Leaf child, corresponding
        to the statement of this method generator, from its parent YangElement
        instance.

        """
        return [self._parent_method('delete')]

    def adders(self):
        method = JavaMethod(name=('add' + self.n))
        method.set_return_type(self.n)
        method.add_exception('JNCException')
        method.add_line(''.join([self.n, ' leaf = new ', self.n, '();']))
        method.add_line("insertChild(leaf, childrenNames());")
        method.add_line("return leaf;")
        return [self.fix_imports(method, child=True)]

    def markers(self):
        res = []
        for op in ('replace', 'merge', 'create', 'delete'):
            res.append(self.mark(op))
        return res

    def mark(self, op):
        assert op in ('replace', 'merge', 'create', 'delete')
        mark_methods = [JavaMethod()]
        if not self.is_string and self.is_leaflist:
            mark_methods.append(JavaMethod())
        for i, mark_method in enumerate(mark_methods):
            mark_method.set_name('mark' + self.n + util.normalize(op))
            mark_method.add_exception('JNCException')
            path = self.n2
            mark_method.add_javadoc(''.join(['Marks the ', self.stmt.keyword,
                                             ' "', self.stmt.arg,
                                             '" with operation "', op, '".']))
            if self.is_leaflist:
                path += '[name=\'" + ' + self.n2 + 'Value + "\']'
                javadoc = '@param ' + self.n2 + 'Value The value to mark'
                param_type = self.type_str[0]
                if i == 1:
                    javadoc += ', given as a String'
                    param_type = 'String'
                mark_method.add_parameter(param_type, self.n2 + 'Value')
                mark_method.add_javadoc(javadoc)
            mark_method.add_line('markLeaf' + util.normalize(op) + '("' + path + '");')
            self.fix_imports(mark_method, child=True)
        return mark_methods

    def leaf_value_access_methods(self):
        value_type = self.type_str[0]  # JNC type
        this_class_name = self.n

        setter = self.value_method(this_class_name, value_type)
        getter = self.get_value_method(this_class_name, value_type)
        default_getter = self.default_value_method(this_class_name, value_type)
        default_getter_predicate = self.has_default_value_method()
        type_factory_method = self.instantiate_value_method(this_class_name, value_type)
        static_type_factory = self.create_value_method(this_class_name, value_type)
        value_class_getter = self.get_value_class_method(this_class_name, value_type)
        return [getter,
                setter,
                default_getter,
                default_getter_predicate,
                type_factory_method,
                static_type_factory,
                value_class_getter]

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