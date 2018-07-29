
package io.netconfessor.gen.robocop;

import io.netconfessor.JNCException;
import io.netconfessor.SchemaNode;
import io.netconfessor.SchemaParser;
import io.netconfessor.SchemaTree;
import io.netconfessor.Tagpath;
import io.netconfessor.YangElement;

import java.util.HashMap;

/**
 * The root class for namespace jnc:test:robocop (accessible from 
 * Robocop.NAMESPACE) with prefix "robocop" (Robocop.PREFIX).
 *
 * @author jnc.py
 */
public class RobocopSchema {

    public static final String NAMESPACE = "jnc:test:robocop";

    public static final String PREFIX = "robocop";

    /**
     * Enable the elements in this namespace to be aware
     * of the data model and use the generated classes.
     */
    public static void enable() throws JNCException {
        YangElement.setPackage(NAMESPACE, "io.netconfessor.gen.robocop");
        RobocopSchema.registerSchema();
    }

    /**
     * Register the schema for this namespace in the global
     * schema table (CsTree) making it possible to lookup
     * CsNode entries for all tagpaths
     */
    public static void registerSchema() throws JNCException {
        SchemaParser parser = new SchemaParser();
        HashMap<Tagpath, SchemaNode> h = SchemaTree.create(NAMESPACE);
        parser.findAndReadFile("Robocop.xml", h, RobocopSchema.class, NAMESPACE);
    }

}
