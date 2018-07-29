
package io.netconfessor.gen.ietfInetTypes;

import io.netconfessor.Element;
import io.netconfessor.NodeSet;

/**
 * Visitor of module inet(urn:ietf:params:xml:ns:yang:ietf-inet-types)
 *
 * @author jnc.py
 */
public abstract class InetVisitor {

    public void setup() {
    }

    /**
     * Retrieve all config values in registered visitors
     * Before send to device you need sync result with older nodeset (empty allowed)
     */
    public NodeSet collectConfig() {
        NodeSet nodes = new NodeSet();
        return nodes;
    }

    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
    }

}
