from ..java_value import JavaValue
from java_method import MethodGenerator


class AnyXmlMethodGenerator(MethodGenerator):
    """Method generator for YANG leaf and leaf-list associated methods"""

    def __init__(self, stmt, ctx):
        super(AnyXmlMethodGenerator, self).__init__(stmt, ctx)
        assert self.is_anyxml
        assert self.gen is self
        self.type_str = 'io.netconfessor.YangAnyXml', 'String'

    def constructors(self):
        return [self.empty_constructor()]

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

    # def adders(self):
    #     assert self.is_anyxml
    #
    #     method = self._parent_template('add')
    #     method.add_parameter("YangAnyXml", self.n2)
    #     method.add_line(' '.join(['YangAnyXml', self.n2, '=', 'new', 'YangAnyXml();']))
    #     method.add_line()
    #     return self.fix_imports(method, child=True)