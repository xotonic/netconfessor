package io.netconfessor;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * WARNING: This element does not participates in protocol exchanging!
 * It is for better client structuring only.
 * You must make sure that it absent in GET/XGET/EDIT-CONFIG/RPC operations
 */
public class ModuleSet extends Element {

    public static final String SERVICE_NAMESPACE = "eltex:ems:ns:service";
    public static final String NAME = "root";

    final List<Module> modules = new LinkedList<>();

    private List<SchemaNode> modulesNodes = new LinkedList<>();
    private SchemaNode node;

    public ModuleSet() {
        super(SERVICE_NAMESPACE, NAME);

        // todo move to EMSServiceSchema and load the node from XML
        node = new SchemaNode();
        node.type = SchemaNode.Type.root;
        node.name = NAME;
        node.classname = this.getClass().getName();
        node.tagpath = new Tagpath(NAME);
        node.isConfig = true;
        node.desc = "This is service element for representing list of modules supported by device at the moment";
        node.namespace = SERVICE_NAMESPACE;
        node.id = NAME;
        node.minOccurs = 1;
        node.maxOccurs = 1;

        shadowed = true;
    }

    public void addModule(Module child) {
        modules.add(child);

        super.addChild(child);
    }

    public void loadAll() {

        for (Module module : modules) {
            try {
                final SchemaNode moduleNode = module.load();
                if (!moduleNode.isAbstract) {
                    modulesNodes.add(moduleNode);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        node.childrenTags = modules.stream().map(m -> m.name).toArray(String[]::new);

        SchemaTree.create(SERVICE_NAMESPACE).put(tagpathShadowed(), node);
    }

    @Override
    public String[] childrenNames() {
        return modulesNodes.stream().map(m -> m.name).toArray(String[]::new);
    }

    @Override
    public Module addChild(String childName) throws Exception {

        final SchemaNode moduleNode = modulesNodes.stream().filter(m -> childName.equals(m.name)).findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Such module was not added to this set: " + childName));

        Module module = new Module(moduleNode.namespace);
        addModule(module);
        return module;
    }

    @Override
    public ModuleSet cloneWithoutChildren() {
        /* Тут исключение, клонируем вместе с детьми */
        final ModuleSet copy = new ModuleSet();
        copy.node = this.node;
        copy.modulesNodes = this.modulesNodes;
        return copy;
    }

    @Override
    public Tagpath tagpath() {
        return new Tagpath(NAME);
    }

    public Collection<Module> modules() {
        return modules;
    }

    public ModuleSet filter(String namespace) {
        ModuleSet filtered = new ModuleSet();
        this.modules().stream().filter(m -> m.getModuleNamespace().equals(namespace))
                .forEach(m -> filtered.addModule(m));
        filtered.loadAll();
        return filtered;
    }
}
