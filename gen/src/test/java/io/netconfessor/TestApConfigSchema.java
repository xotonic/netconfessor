package io.netconfessor;

import java.util.HashMap;

/**
 * The root class for namespace http://eltex.org/ap (accessible from
 * ApConfig.NAMESPACE) with prefix "ap-config" (ApConfig.PREFIX).
 *
 * @author jnc.py
 */
public class TestApConfigSchema {

    public static final String NAMESPACE = "http://eltex.org/ap";

    public static final String PREFIX = "ap-config";

    /**
     * Enable the elements in this namespace to be aware
     * of the data model and use the generated classes.
     */
    public static void enable() throws JNCException {
        YangElement.setPackage(NAMESPACE, "org.eltex.ems.netconf.generated.apConfig");
        TestApConfigSchema.registerSchema();
    }

    /**
     * Register the schema for this namespace in the global
     * schema table (CsTree) making it possible to lookup
     * CsNode entries for all tagpaths
     */
    public static void registerSchema() throws JNCException {
        SchemaParser parser = new SchemaParser();
        HashMap<Tagpath, SchemaNode> h = SchemaTree.create(NAMESPACE);
        parser.findAndReadFile("ApConfig.xml", h, TestApConfigSchema.class, NAMESPACE);
    }

}
