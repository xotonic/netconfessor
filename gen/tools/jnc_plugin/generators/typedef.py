from ..java import util
from ..java_value import JavaValue
from ..method import JavaMethod
from java_method import MethodGenerator


class TypedefMethodGenerator(MethodGenerator):
    """Method generator specific to typedef classes"""

    def __init__(self, stmt, ctx=None):
        super(TypedefMethodGenerator, self).__init__(stmt, ctx)
        assert self.gen is self
        assert self.is_typedef, 'This class is only valid for typedef stmts'
        self.type = util.search_one(stmt, 'type')
        self.jnc_type, self.primitive = util.get_types(stmt, ctx)
        self.base_type = util.get_base_type(stmt) if self.type else None
        self.base_primitive = None
        if self.base_type:
            self.base_primitive = util.get_types(self.base_type, ctx)[1]
        self.is_string = False
        self.needs_check = True  # Set to False to avoid redundant checks
        if self.base_type is not None:
            self.is_string = self.base_primitive == 'String'
            for s in ('length', 'path', 'range', 'require_instance'):
                setattr(self, s, util.search_one(self.base_type, s))
            for s in ('bit', 'enum', 'pattern'):
                setattr(self, s, util.search(self.base_type, s))
            # self.needs_check = self.enum or self.pattern

    def constructors(self):
        """Returns a list containing a single or a pair of constructors"""
        constructors = []
        javadoc = ['@param value Value to construct the ', self.n, ' from.']

        # Iterate once if string, twice otherwise
        for i in range(1 + (not self.is_string)):
            constructor = self._constructor_template()
            javadoc2 = ['Constructor for ', self.n]
            if i == 0:
                # String constructor
                javadoc2.append(' object from a string.')
                constructor.add_parameter('String', 'value')
            else:
                # i == 1, Primitive constructor
                javadoc2.extend([' object from a ', self.base_primitive, '.'])
                tmp_primitive = constructor.add_dependency(self.base_primitive)
                constructor.add_parameter(tmp_primitive, 'value')

            # Add javadoc
            constructor.add_javadoc(''.join(javadoc2))
            constructor.add_javadoc(''.join(javadoc))

            # Now add second argument to super call if the supertype has one
            if self.jnc_type == 'io.netconfessor.YangUnion':
                constructor.body = []
                constructor.add_line('super(value,')
                constructor.add_line('    new String[] {')
                for member in util.search(self.type, 'type'):
                    line = ''.join(['        "',
                                    util.get_types(member, self.ctx)[0],
                                    '",'])
                    constructor.add_line(line)
                constructor.add_line('    }')
                constructor.add_line(');')
            elif self.jnc_type == 'io.netconfessor.YangEnumeration':
                constructor.body = []
                constructor.add_line('super(value, enums());')
            elif self.jnc_type == 'io.netconfessor.YangDecimal64':
                constructor.body = []
                frac_digits = util.search_one(self.type, 'fraction-digits')
                line = ['super(value, ', frac_digits.arg, ');']
                constructor.add_line(''.join(line))
            elif self.jnc_type == 'io.netconfessor.YangBits':
                constructor.body = []
                constructor.add_line('super(value,')
                mask = 0
                smap = ['    new String[] {']
                imap = ['    new int[] {']
                position = 0
                for bit in util.search(self.type, 'bit'):
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
                constructor.add_line(''.join(smap))
                constructor.add_line(''.join(imap))
                constructor.add_line(');')

            # Add call to check method if type has constraints
            if self.needs_check:
                constructor.add_line('check();')
                constructor.add_exception('YangException')
            constructors.append(self.fix_imports(constructor))
        return constructors

    def setters(self):
        """Returns a list of set_value JavaMethods"""
        setters = []
        javadoc = '@param value The value to set.'

        # Iterate once if string, twice otherwise
        for i in range(1 + (not self.is_string)):
            setter = JavaMethod(name='setValue')
            javadoc2 = ['Sets the value using a ']
            if i == 0:
                # String setter
                javadoc2.append('string value.')
                setter.add_parameter('String', 'value')
            else:
                # i == 1, Primitive setter
                javadoc2.extend(['value of type ', self.base_primitive, '.'])
                tmp_primitive = setter.add_dependency(self.base_primitive)
                setter.add_parameter(tmp_primitive, 'value')
            setter.add_javadoc(''.join(javadoc2))
            setter.add_javadoc(javadoc)
            setter.add_line('super.setValue(value);')
            if self.needs_check:
                setter.add_line('check();')
                setter.add_exception('YangException')
            setters.append(self.fix_imports(setter, child=True))
        return setters

    def checker(self):
        """Returns a 'check' JavaMethod, which checks constraints on values"""
        if self.needs_check:
            checker = JavaMethod(name='check')
            checker.add_javadoc('Checks all restrictions (if any).')
            checker.add_exception('YangException')
            if self.bit:
                checker.add_line('super.check();')
            elif self.enum:
                checker.add_line('super.check();')
            return [self.fix_imports(checker)]
        return []

    def enums(self):
        if self.jnc_type == 'io.netconfessor.YangEnumeration':
            enumsGetter = JavaMethod(modifiers=['public static'], name='enums')
            enumsGetter.set_return_type("String[]")
            enumsGetter.body = []
            enumsGetter.add_line('return new String[] {')
            for member in util.search(self.type, 'enum'):
                enumsGetter.add_line(''.join(['        ', util.capitalize(member.arg), ',']))
            enumsGetter.add_line('    };')
            return self.fix_imports(enumsGetter)

    def enum_consts(self):
        enum_fields = []
        enum_stmts = util.search(self.base_type, 'enum')
        for enum in enum_stmts:
            enum_field = JavaValue(name=util.capitalize(enum.arg),
                                   value=util.jstr(enum.arg),
                                   modifiers=['public', 'static', 'final', 'String'])
            enum_fields.append(enum_field)
        return enum_fields