
package io.netconfessor.gen.ietfInetTypes;

import io.netconfessor.JNCException;
import io.netconfessor.SchemaNode;
import io.netconfessor.SchemaParser;
import io.netconfessor.SchemaTree;
import io.netconfessor.Tagpath;
import io.netconfessor.YangElement;

import java.util.HashMap;

/**
 * The root class for namespace urn:ietf:params:xml:ns:yang:ietf-inet-types (accessible from 
 * IetfInetTypes.NAMESPACE) with prefix "inet" (IetfInetTypes.PREFIX).
 *
 * @author jnc.py
 */
public class InetSchema {

    public static final String NAMESPACE = "urn:ietf:params:xml:ns:yang:ietf-inet-types";

    public static final String PREFIX = "inet";

    /**
     * Enable the elements in this namespace to be aware
     * of the data model and use the generated classes.
     */
    public static void enable() throws JNCException {
        YangElement.setPackage(NAMESPACE, "io.netconfessor.gen.ietfInetTypes");
        InetSchema.registerSchema();
    }

    /**
     * Register the schema for this namespace in the global
     * schema table (CsTree) making it possible to lookup
     * CsNode entries for all tagpaths
     */
    public static void registerSchema() throws JNCException {
        SchemaParser parser = new SchemaParser();
        HashMap<Tagpath, SchemaNode> h = SchemaTree.create(NAMESPACE);
        parser.findAndReadFile("Inet.xml", h, InetSchema.class, NAMESPACE);
    }

}