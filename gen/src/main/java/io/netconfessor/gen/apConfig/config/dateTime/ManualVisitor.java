
package io.netconfessor.gen.apConfig.config.dateTime;

import io.netconfessor.Element;
import io.netconfessor.NodeSet;
import io.netconfessor.gen.apConfig.config.dateTime.Manual;

/**
 * Visitor of container manual
 *
 * @author jnc.py
 */
public abstract class ManualVisitor {

    public void setup() {
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public Manual collectConfig() {
        Manual manual = new Manual();
        if (manual.hasChildren()) {
           return manual;
        } else {
           return null;
        }
    }

    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
    }

}
