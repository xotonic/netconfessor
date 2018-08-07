from ..java import util
from java_method import MethodGenerator


class ListMethodGenerator(MethodGenerator):
    """Method generator specific to classes generated from list stmts"""

    def __init__(self, stmt, ctx):
        super(ListMethodGenerator, self).__init__(stmt, ctx)
        assert self.gen is self
        assert self.is_list, 'Only valid for list stmts'

        self.is_config = util.is_config(stmt)
        self.keys = []
        if self.is_config:
            key = util.search_one(self.stmt, 'key')
            # print('keys : [' + key.arg + ']')
            try:
                self.keys = key.arg.replace('\n', '').split(' ')
                # print(self.keys)
            except AttributeError:
                self.is_config = False  # is_config produced wrong value

        findkey = lambda k: util.search_one(self.stmt, 'leaf', arg=k)
        self.key_stmts = [findkey(k) for k in self.keys]

        notstring = lambda k: util.get_types(k, ctx)[1] != 'String'
        self.is_string = not all(notstring(k) for k in self.key_stmts)

    def value_constructors(self):
        """Returns a list of constructors for configuration data lists"""
        assert self.is_config, 'Only called with configuration data stmts'

        constructors = []

        # Determine number of constructors
        number_of_value_constructors = 2 + (not self.is_string)
        javadoc1 = ['Constructor for an initialized ', self.n, ' object,']
        javadoc2 = ['', 'with String keys.']
        if not self.is_string:
            javadoc2.append('with keys of built in Java types.')

        # Create constructors in a loop
        for i in range(number_of_value_constructors):
            constructor = self._constructor_template()
            constructor.add_javadoc(''.join(javadoc1))
            constructor.add_javadoc(javadoc2[i])
            constructor.add_exception('JNCException')
            for key in self.key_stmts:
                key_arg = util.camelize(key.arg)
                key_class = util.normalize(key.arg)
                key_type = util.search_one(key, 'type')
                jnc, primitive = util.get_types(key_type, self.ctx)
                jnc = constructor.add_dependency(jnc)
                javadoc = ['@param ', key_arg, 'Value Key argument of child.']
                constructor.add_javadoc(''.join(javadoc))
                newLeaf = [key_class, ' ', key_arg, ' = new ', key_class]
                constructor.add_dependency(key_class)
                # newLeaf.extend(self._root_namespace(key.arg))
                newLeaf.extend('();')
                constructor.add_line(''.join(newLeaf))
                setValue = [key_arg, '.setValue(']
                if i == 0:
                    # Default constructor
                    param_type = jnc
                    setValue.extend([key_arg, 'Value);'])
                    constructor.add_line(''.join(setValue))
                else:
                    # String or primitive constructor
                    setValue.extend(['new ', jnc, '(', key_arg, 'Value'])
                    if jnc == 'YangUnion':
                        setValue.append(', new String [] {')
                        for type_stmt in util.search(key_type, 'type'):
                            member_type, _ = util.get_types(type_stmt, self.ctx)
                            setValue.append('"' + member_type + '", ')
                        setValue.append('}));')
                        constructor.add_line(''.join(setValue))
                    elif jnc == 'YangEnumeration':
                        setValue.append(', new String [] {')
                        for enum in util.search(key_type, 'enum'):
                            setValue.append('"' + enum.arg + '", ')
                        setValue.append('}));')
                        constructor.add_line(''.join(setValue))
                    elif jnc == 'YangBits':
                        setValue.append(',')
                        constructor.add_line(''.join(setValue))
                        mask = 0
                        smap = ['    new String[] {']
                        imap = ['    new int[] {']
                        position = 0
                        for bit in util.search(key_type, 'bit'):
                            smap.extend(['"', bit.arg, '", '])
                            pos_stmt = util.search_one(bit, 'position')
                            if pos_stmt:
                                position = int(pos_stmt.arg)
                            imap.extend([str(position), ', '])
                            mask += 1 << position
                            position += 1
                        smap.append('},')
                        imap.append('}')
                        constructor.add_line(''.join(['    new BigInteger("',
                                                      str(mask), '"),']))
                        constructor.add_dependency('BigInteger')
                        constructor.add_line(''.join(smap))
                        constructor.add_line(''.join(imap))
                        constructor.add_line('));')
                    elif jnc == 'YangDecimal64':
                        frac_digits = util.search_one(key_type, 'fraction-digits')
                        setValue.extend([', ', frac_digits.arg])
                        setValue.append('));')
                        constructor.add_line(''.join(setValue))
                    else:
                        setValue.append('));')
                        constructor.add_line(''.join(setValue))

                    if i == 1:
                        param_type = 'String'
                    else:
                        param_type = primitive

                constructor.add_parameter(param_type, key_arg + 'Value')
                constructor.add_line('this.' + key_arg + ' = ' + key_arg + ';')
                insertChild = ['insertChild(', key_arg, ', childrenNames());']
                constructor.add_line(''.join(insertChild))
            constructors.append(self.fix_imports(constructor))

        return constructors

    def constructors(self):
        # Number of constructors depends on the type of the key
        constructors = [self.empty_constructor()]
        if self.is_config or self.keys:
            constructors.extend(self.value_constructors())
        return constructors

    def setters(self):
        return NotImplemented

    def markers(self):
        return NotImplemented

    def _parent_method(self, method_type):
        """Returns a list of methods that either gets an instance of the class
        to be generated from the statement of this method generator to its
        parent class, or deletes it, depending on the method_type parameter.

        method_type -- either 'get' or 'delete'

        """
        num_methods = 2 if self.is_config else 1
        res = [self._parent_template(method_type) for _ in range(num_methods)]

        for i, method in enumerate(res):
            javadoc1 = [method_type.capitalize(), 's ', self.stmt.keyword,
                        ' entry "', self.n2, '", with specified keys.']
            javadoc2 = []
            path = ['String path = "', self.stmt.arg]
            if i == 1:
                javadoc2.append('The keys are specified as strings.')

            for key in self.gen.key_stmts:
                key_arg = util.camelize(key.arg)
                javadoc2.append(''.join(['@param ', key_arg,
                                         'Value Key argument of child.']))
                param_type = 'String'
                if i == 0:
                    param_type, _ = util.get_types(key, self.ctx)
                method.add_parameter(param_type, key_arg + 'Value')
                path.extend(['[', key_arg, '=\'" + ', key_arg, 'Value + "\']'])
            path.append('";')

            method.add_javadoc(''.join(javadoc1))
            for javadoc in javadoc2:
                method.add_javadoc(javadoc)
            method.add_line(''.join(path))
            if method_type == 'delete':
                method.set_return_type('void')
                method.add_line('delete(path);')
            else:  # get
                method.add_line('return (' + self.n + ')searchOne(path);')
            self.fix_imports(method, child=True)
        return res

    def deleters(self):
        """Returns a list of methods that deletes an instance of the class to
        be generated from the statement of this method generator to its parent
        class.

        """
        return self._parent_method('delete')

    def getters(self):
        """Returns a list of methods that gets an instance of the class to be
        generated from the statement of this method generator to its parent
        class.

        """
        return self._parent_method('get')

    def parent_access_methods(self):
        res = []
        res.append(self.access_methods_comment())
        res.extend(self.getters())
        res.append(self.child_iterator())
        res.extend(self.adders())
        res.extend(self.deleters())
        return res