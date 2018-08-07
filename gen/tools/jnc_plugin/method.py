import util
from .java_value import JavaValue
from .ordered_set import OrderedSet


class JavaMethod(JavaValue):
    """A Java method. Default behaviour is public void."""

    def __init__(self, exact=None, javadocs=None, modifiers=None,
                 return_type=None, name=None, params=None, exceptions=None,
                 body=None, indent=4):
        """Initializes the attributes of a new Java method.

        Keyword arguments:
        exact (String list)     -- If supplied, the 'as_list' method will
                                   return this list until something has been
                                   added to this Java value.
        javadocs (String list)  -- A list of the lines in the javadoc
                                   declaration for this Java Value.
        modifiers (String list) -- A list of Java modifiers such as 'public'
                                   and 'static'. Also used to specify the type
                                   of fields.
        return_type (String)    -- The return type of the method. To avoid
                                   adding the type as a required import,
                                   assign to the return_type attribute directly
                                   instead of using this argument.
        name (String)           -- The identifier used for this value.
        params (str tuple list) -- A list of 2-tuples representing the type and
                                   name of the parameters of this method. To
                                   avoid adding the type as a required import,
                                   assign to the parameters attribute directly
                                   instead of using this argument.
        exceptions (str list)   -- A list of exceptions thrown by the method.
        value (String)          -- Not used by methods, this is placed after
                                   the assignment operator in a field
                                   declaration.
        imports (String list)   -- A (possibly redundant) set of classes to
                                   import in the class declaring this value.
                                   This list is typically filtered by other
                                   classes so nothing gets imported unless it
                                   is required to for the Java class to
                                   compile.
        indent (Integer)        -- The indentation in the 'as_list'
                                   representation. Defaults to 4 spaces.

        """
        super(JavaMethod, self).__init__(exact=exact, javadocs=javadocs,
                                         modifiers=modifiers, name=name,
                                         value=None, indent=indent)
        self.is_default = False
        if self.modifiers == []:
            self.add_modifier('public')

        self.annotations = []

        self.return_type = 'void'
        if return_type is not None:
            self.set_return_type(return_type)

        self.parameters = OrderedSet()
        if params is not None:
            for param_type, param_name in params:
                self.add_parameter(param_type, param_name)

        self.exceptions = OrderedSet()
        if exceptions is not None:
            for exc in exceptions:
                self.add_exception(exc)

        self.body = []
        if body is not None:
            for line in body:
                self.add_line(line)

        self.exact = exact
        self.default_modifiers = True

    def set_return_type(self, return_type, this_class_name=''):
        """Sets the type of the return value of this method"""
        retval = None if not return_type else self.add_dependency(return_type, this_class_name)
        self._set_instance_data('return_type', retval)

    def set_return_type_generic(self, generic_class, type_class, this_class_name=''):
        genval = None if not generic_class else self.add_dependency(generic_class, this_class_name)
        retval = None if not type_class else self.add_dependency(type_class, this_class_name)
        self._set_instance_data('return_type', genval + '<' + retval + '>')

    def add_parameter(self, param_type, param_name, this_class_name=''):
        """Adds a parameter to this method. The argument type is added to list
        of dependencies.

        param_type -- String representation of the argument type
        param_name -- String representation of the argument name
        """
        self._set_instance_data('parameters',
                                ' '.join([self.add_dependency(param_type, this_class_name),
                                          param_name]))

    def add_parameter_generic(self, param_type, param_name, generic_type, this_class_name=''):

        # gtype = self.add_dependency(generic_type, this_class_name)
        ptype = self.add_dependency(param_type, this_class_name)
        self._set_instance_data('parameters',
                                ' '.join([ptype + '<' + util.escape_conflicts(generic_type, this_class_name) + '>', param_name]))

    def add_annotation(self, annotation):
        self.annotations.append(annotation)

    def add_override_annotation(self):
        self.add_annotation('Override')

    def add_exception(self, exception):
        """Adds exception to method"""
        self._set_instance_data('exceptions',
                                self.add_dependency(exception))

    def add_line(self, line):
        """Adds line to method body"""
        self._set_instance_data('body', self.indent + ' ' * 4 + line)

    def as_list(self):
        """String list of code lines that this Java method consists of.
        Overrides JavaValue.as_list().

        """
        if 'abstract' in self.modifiers:
            return self.as_list_interface()

        MAX_COLS = 80
        if self.exact is None:
            assert self.name is not None
            assert self.indent is not None
            self.exact = self.javadoc_as_string()
            signature = self.method_signature(MAX_COLS)
            self.exact.append(''.join(signature) + ' {')
            self.exact.extend(self.body)
            self.exact.append(self.indent + '}')
        return self.exact

    def as_list_interface(self):
        MAX_COLS = 80
        assert self.name is not None
        assert self.indent is not None
        exact = self.javadoc_as_string()
        signature = self.method_signature(MAX_COLS)
        exact.append(''.join(signature) + ';')
        return exact

    def add_modifier(self, modifier):

        if modifier == 'default':
            self.is_default = True

        super(JavaMethod, self).add_modifier(modifier)

    def method_signature(self, MAX_COLS):
        at_annotations = []
        for an in self.annotations:
            at_annotations.append('@' + an)
        header = self.modifiers[:]
        if self.return_type is not None:
            header.append(self.return_type)
        header.append(self.name)
        signature = []
        if at_annotations:
            signature.append(self.indent)
            signature.append(' '.join(at_annotations))
            signature.append('\n')
        signature.append(self.indent)
        signature.append(' '.join(header))
        signature.append('(')
        signature.append(', '.join(self.parameters))
        signature.append(')')
        if self.exceptions:
            signature.append(' throws ')
            signature.append(', '.join(self.exceptions))
            if sum(len(s) for s in signature) >= MAX_COLS:
                signature.insert(-2, '\n' + (self.indent * 3)[:-1])
        return signature

    def __hash__(self):
        return hash(str(self.as_list()))