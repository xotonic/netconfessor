
package io.netconfessor.gen.apConfig.config;

import io.netconfessor.Element;
import io.netconfessor.NodeSet;
import io.netconfessor.YangData;
import io.netconfessor.YangDataType;
import io.netconfessor.gen.apConfig.config.Trace;
import io.netconfessor.gen.apConfig.config.trace.Networkd;
import io.netconfessor.gen.apConfig.config.trace.NetworkdVisitor;

/**
 * Visitor of container trace
 *
 * @author jnc.py
 */
public abstract class TraceVisitor {

    private NetworkdVisitor networkdVisitor;

    public abstract NetworkdVisitor setupNetworkd(YangData data);

    public abstract void onNetworkd(Networkd container);

    public void setup() {
        networkdVisitor = setupNetworkd(new YangData("networkd", "/ap-config:config/ap-config:trace/ap-config:networkd", null, true, YangDataType.container));
        if (networkdVisitor != null) {
            networkdVisitor.setup();
        }
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public Trace collectConfig() {
        Trace trace = new Trace();
        if (networkdVisitor != null) {
            Networkd networkd = networkdVisitor.collectConfig();
            if (networkd != null) {
                trace.addNetworkd(networkd);
            }
        }
        if (trace.hasChildren()) {
           return trace;
        } else {
           return null;
        }
    }

    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element networkd = nodes.getFirstChild("networkd");
        if (networkd != null) {
            onNetworkd((Networkd)networkd);
            if (networkdVisitor != null) {
                if (networkd.hasChildren()) {
                    networkdVisitor.visit(networkd.getChildren());
                }
            }
        }
    }

}
