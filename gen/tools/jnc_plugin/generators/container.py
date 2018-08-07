from ..java import util
from ..java import MethodGenerator
from tools.jnc_plugin.java_value import JavaValue
from tools.jnc_plugin.method import JavaMethod


class ContainerMethodGenerator(MethodGenerator):
    """Method generator specific to classes generated from container stmts"""

    def __init__(self, stmt, ctx=None):
        super(ContainerMethodGenerator, self).__init__(stmt, ctx)
        assert self.gen is self
        assert self.is_container, 'Only valid for containers and notifications'

        self.lists = util.search(self.stmt, 'list')

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

    def list_container_impl(self):
        m_has_lists = JavaMethod(modifiers=['public'], name='hasLists')
        m_has_lists.add_override_annotation()
        m_has_lists.set_return_type('boolean')
        m_has_lists.add_line('return ' + ('true' if self.lists else 'false') + ';')

        m_get_lists = JavaMethod(modifiers=['public'], name='getLists')
        m_get_lists.set_return_type('List<NodeSet>')
        m_get_lists.add_override_annotation()
        m_get_lists.add_exception('JNCException')

        m_get_lists.add_line('List<NodeSet> lists = new LinkedList<>();')
        m_get_lists.add_dependency('LinkedList')

        for list in self.lists:
            m_get_lists.add_line('lists.add(get("' + list.arg + '"));')
        m_get_lists.add_line('return lists;')

        return [self.fix_imports(m_has_lists), self.fix_imports(m_get_lists)]

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