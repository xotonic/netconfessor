from . import util, context


class SchemaNode(object):

    def __init__(self, ctx, stmt, tagpath, package=None):
        self.stmt = stmt
        self.tagpath = tagpath
        self.package = package
        self.ctx = ctx

    def as_list(self):
        """Returns a string list repr "node" element content for an XML schema"""
        res = ['<node>']
        stmt = self.stmt

        res.append('<id>' + util.camelize(self.stmt.arg) + '</id>')

        if stmt.keyword in context.leaf_stmts:
            jnc, primitive_type = util.get_types(stmt, self.ctx)
            classpath = jnc
        elif stmt.keyword in ('module', 'submodule'):
            classpath = "io.netconfessor.Module"
            abstract = False if (len(util.search(stmt, context.non_abstract_stmts)) > 0) else True
            res.append('<abstract>' + ('true' if abstract else 'false') + '</abstract>')
        else:
            classpath = util.get_package(self.stmt, self.ctx) + '.' + util.normalize(self.stmt.arg)

        res.append('<class>' + classpath + '</class>')
        res.append('<tagpath>' + self.tagpath + '</tagpath>')
        res.append('<tagname>' + self.stmt.arg + '</tagname>')
        top_stmt = util.get_module(stmt)
        if top_stmt.keyword == 'module':
            module = top_stmt
        else:  # submodule
            modulename = util.search_one(top_stmt, 'belongs-to').arg
            for (name, rev) in top_stmt.i_ctx.modules:
                if name == modulename:
                    module = top_stmt.i_ctx.modules[(name, rev)]
                    break
        ns = util.search_one(module, 'namespace').arg
        res.append('<namespace>' + ns + '</namespace>')
        # res.append('<primitive_type>0</primitive_type>')

        min_occurs = '0'
        max_occurs = '-1'

        mandatory = util.search_one(stmt, 'mandatory')
        isMandatory = mandatory is not None and mandatory.arg == 'true'
        unique = util.search_one(stmt, 'unique')
        isUnique = unique is not None and unique.arg == 'true'
        key = None
        parent = util.get_parent(stmt)
        if parent:
            key = util.search_one(parent, 'key')
        isKey = key is not None and key.arg == stmt.arg
        childOfContainerOrList = (parent
                                  and parent.keyword in context.yangelement_stmts)
        if (isKey or stmt.keyword in ('module', 'submodule')
                or (childOfContainerOrList
                    and stmt.keyword in ('container', 'notification'))):
            min_occurs = '1'
            max_occurs = '1'
        if isMandatory:
            min_occurs = '1'
        if (isUnique or childOfContainerOrList
                or stmt.keyword in ('container', 'notification')):
            max_occurs = '1'
        res.append('<min-occurs>' + min_occurs + '</min-occurs>')
        res.append('<max-occurs>' + max_occurs + '</max-occurs>')

        children = ''
        for ch in util.search(stmt, context.yangelement_stmts | context.leaf_stmts):
            children += util.camelize(ch.arg) + ' '
        res.append('<children>' + children[:-1] + '</children>')

        children = ''
        for ch in util.search(stmt, context.yangelement_stmts | context.leaf_stmts):
            children += ch.arg + ' '
        res.append('<children-tags>' + children[:-1] + '</children-tags>')

        key = util.search_one(stmt, 'key')
        if key is not None:
            res.append('<keys>' + key.arg + '</keys>')

        # res.append('<flags>0</flags>')
        desc = util.search_one(stmt, 'description')
        if desc is not None:
            res.append('<desc>' + desc.arg.replace('<', '[').replace('>', ']').replace('&', '') + '</desc>')
        elem_type = stmt.keyword
        res.append('<type>' + elem_type + '</type>')

        isconf = util.is_config(stmt)
        res.append('<is-config>' + ('true' if isconf else 'false') + '</is-config>')
        res.append('</node>')
        return res


class SchemaGenerator(object):
    """Used to generate an external XML schema from a yang module"""

    def __init__(self, stmts, tagpath, ctx, package):
        self.stmts = stmts
        self.tagpath = tagpath
        self.ctx = ctx
        self.package = package

    def schema_nodes(self):
        """Generate XML schema as a list of "node" elements"""
        res = []
        for stmt in self.stmts:
            subpath = self.tagpath + stmt.arg + '/'
            if self.ctx.opts.verbose:
                print('Generating schema node "' + subpath + '"...')
            classPath = self.package + '.' + util.normalize(stmt.arg)
            node = SchemaNode(self.ctx, stmt, subpath, classPath)
            res.extend(node.as_list())
            substmt_generator = SchemaGenerator(util.search(stmt, context.node_stmts),
                                                subpath, self.ctx, self.package)
            res.extend(substmt_generator.schema_nodes())
        return res