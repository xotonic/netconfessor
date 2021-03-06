package io.netconfessor;

import java.util.Arrays;

/**
 * The SchemaNode class is used to represent individual nodes in the schema
 * tree. Each set of classes generated by the JNC pyang plugin gets its schema,
 * as a set of SchemaNode objects generated in its top class. The SchemaNodes
 * are put into a hashtable in the SchemaTree class.
 * TODO add setters/getters instead of public fields
 */
public class SchemaNode {

    /**
     * id (camelized), also java class has the same name
     */
    public String id;
    /**
     * Tagpath - unique id in module
     */
    public Tagpath tagpath;
    /**
     * tagname - part of tagpath
     */
    public String name;
    /**
     * namespace of module
     */
    public String namespace;
    /**
     * full reference to java class
     */
    public String classname;
    /**
     * Type of element
     */
    public Type type;
    /**
     * unused
     */
    public int primitiveType;
    public int minOccurs;
    public int maxOccurs;
    /**
     * can be changed with edit-config
     */
    public boolean isConfig;

    /**
     * For modules only
     * Is module only contains augments and typedefs
     */
    public boolean isAbstract;
    /**
     * ids of children. see {@link #id}
     */
    public String[] children;
    /**
     * tag names of children. Must have the same order as in {@link #children}
     */
    public String[] childrenTags;


    public String[] keys;
    /**
     * unused yet
     */
    public long flags;
    /**
     * Description from YANG-module
     */
    public String desc;
    /**
     * unused yet ?
     */
    public RevisionInfo[] revInfo;

    /**
     * Finds the schema class for a data element
     *
     * @param e The data element
     * @return the schema node with same namespace and tagpath as e
     */
    public static SchemaNode get(Element e) {
        return SchemaTree.lookup(e.namespace, e.tagpath());
    }

    @Override
    public String toString() {
        return "SchemaNode{" + "tagpath=" + tagpath + ", name='" + name + '\'' + ", namespace='" + namespace + '\''
                + ", classname='" + classname + '\'' + ", type=" + type + ", primitiveType=" + primitiveType
                + ", minOccurs=" + minOccurs + ", maxOccurs=" + maxOccurs + ", children=" + Arrays.toString(children)
                + ", flags=" + flags + ", desc='" + desc + '\'' + ", revInfo=" + Arrays.toString(revInfo) + '}';
    }


    public enum Type {
        module("module"),
        list("list"),
        leaf("leaf"),
        leafList("leaf-list"),
        container("container"),
        notification("notification"),
        root("root"),
        anyxml("anyxml"),
        unknown("unknown");

        public String keyword;

        Type(String keyword) {
            this.keyword = keyword;
        }

        public static Type parse(String value) {
            return Arrays.stream(values()).filter(i -> i.keyword.equals(value)).findFirst().orElse(null);
        }
    }
}
