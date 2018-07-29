
package io.netconfessor.gen.apConfig.config.interface_;

import io.netconfessor.Element;
import io.netconfessor.NodeSet;
import io.netconfessor.gen.apConfig.config.interface_.Eth;

/**
 * Visitor of container eth
 *
 * @author jnc.py
 */
public abstract class EthVisitor {

    public void setup() {
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public Eth collectConfig() {
        Eth eth = new Eth();
        if (eth.hasChildren()) {
           return eth;
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