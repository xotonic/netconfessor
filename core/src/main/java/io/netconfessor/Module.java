package io.netconfessor;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * WARNING: This element does not participates in protocol exchanging!
 * It is for better client structuring only.
 * You must make sure that it absent in GET/XGET/EDIT-CONFIG/RPC operations
 */
public class Module extends Element {


    private final Map<String, Class<?>> childrenNames = new LinkedHashMap<>();

    private String moduleNamespace;
    private SchemaNode moduleNode;

    public Module(String namespace) {
        super(namespace, "uninitialized-module");

        moduleNamespace = namespace;
        shadowed = true;
    }

    public SchemaNode load() throws Exception {

        moduleNode = SchemaTree.getHashMap(moduleNamespace).get(new Tagpath(0));
        if (moduleNode == null) {
            throw new IllegalArgumentException("No module found for namespace " + moduleNamespace);
        }

        if (moduleNode.type != SchemaNode.Type.module) {
            throw new IllegalArgumentException("Not found module element in the namespace " + moduleNamespace);
        }


        this.name = moduleNode.name;


        //System.out.println(moduleNode.name + " ->" + Arrays.toString(moduleNode.childrenTags));

        //if (moduleNode.childrenTags != null &&
        //        !(moduleNode.childrenTags.length == 1 && moduleNode.childrenTags[0].isEmpty()))
        for (String childName : moduleNode.childrenTags) {

            SchemaNode childNode = null;

            try {
                final Tagpath tagpath = new Tagpath(childName);
                childNode = SchemaTree.lookup(moduleNamespace, tagpath);
                if (childNode == null) {
                    throw new IllegalArgumentException(
                            String.format("ERROR Cannot find child schema node for '%s' ([%s]@[%s])", childName,
                                    tagpath.toString(), moduleNamespace));
                }

                final Class<?> clazz = Class.forName(childNode.classname);
                if (YangType.class.isAssignableFrom(clazz)) {
                    // leaf
                    addChild(new Leaf(moduleNamespace, childName));
                } else {
                    // element
                    final Object childInstance = clazz.getConstructor().newInstance();
                    if (childInstance instanceof Element) {
                        final Element childElement = ((Element) childInstance);
                        addChild(childElement);
                    }
                }

                childrenNames.put(childName, clazz);
            } catch (Exception e) {
                System.err.println("ERROR: " + String.valueOf(childNode));
                e.printStackTrace();
                continue;
            }
        }

        //System.out.println("Module '" + moduleNode.id +"' loaded" );

        return moduleNode;
    }

    @Override
    public String[] childrenNames() {
        return childrenNames.keySet().toArray(new String[0]);
    }

    @Override
    public Element addChild(String childName)
            throws IllegalAccessException, InvocationTargetException, NoSuchMethodException, InstantiationException {
        return (Element) childrenNames.get(childName).getConstructor().newInstance();
    }


    @Override
    public String toString() {
        return "Module{" + "childrenNames=" + childrenNames + "} ";
    }

    @Override
    public Tagpath tagpath() {
        // in the schema this element is has "/" path
        return new Tagpath(0);
    }

    public SchemaNode getModuleSchemaNode() {
        return moduleNode;
    }

    public String getModuleNamespace() {
        return moduleNamespace;
    }

    @Override
    public Module cloneWithoutChildren() {
        final Module module = new Module(namespace);
        module.name = this.name;
        module.childrenNames.putAll(this.childrenNames);
        return module;
    }
}
