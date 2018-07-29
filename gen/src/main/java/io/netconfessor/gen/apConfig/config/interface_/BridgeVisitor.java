
package io.netconfessor.gen.apConfig.config.interface_;

import io.netconfessor.Element;
import io.netconfessor.NodeSet;
import io.netconfessor.YangData;
import io.netconfessor.YangDataType;
import io.netconfessor.gen.apConfig.config.interface_.Bridge;
import io.netconfessor.gen.apConfig.config.interface_.bridge.Port;
import io.netconfessor.gen.apConfig.config.interface_.bridge.PortVisitor;

/**
 * Visitor of container bridge
 *
 * @author jnc.py
 */
public abstract class BridgeVisitor {

    public abstract PortVisitor setupPort(YangData data);

    private PortVisitor portVisitor;

    public abstract void onNextPort(Port item);

    protected void onStartPortList() {
    }

    protected void onStopPortList() {
    }

    abstract protected Port getNextPort();

    public void setup() {
        portVisitor = setupPort(new YangData("port", "/ap-config:config/ap-config:interface/ap-config:bridge/ap-config:port", null, true, YangDataType.list));
        if (portVisitor != null) {
            portVisitor.setup();
        }
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public Bridge collectConfig() {
        Bridge bridge = new Bridge();
        Port port;
        while((port = getNextPort()) != null) {
            port.removeNonKeysIfMarkedToDelete();
            bridge.addPort(port);
        }
        if (bridge.hasChildren()) {
           return bridge;
        } else {
           return null;
        }
    }

    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        onStartPortList();
        for (Element node : nodes.getChildren("port")) {
            onNextPort((Port)node);
            if (portVisitor != null) {
                if (node.hasChildren()) {
                    portVisitor.visit(node.getChildren());
                }
            }
        }
        onStopPortList();
    }

}
