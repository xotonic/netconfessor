
package io.netconfessor.gen.apConfig.config.interface_.bridge;

import io.netconfessor.Element;
import io.netconfessor.LeafYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangDataType;
import io.netconfessor.YangString;
import io.netconfessor.gen.apConfig.config.interface_.bridge.Port;
import io.netconfessor.gen.apConfig.config.interface_.bridge.port.Name;

/**
 * Visitor of list port
 *
 * @author jnc.py
 */
public abstract class PortVisitor {

    public abstract void setupName(LeafYangData<YangString> data);

    public abstract void onName(Name leaf);

    public abstract Name getName();

    public void setup() {
        setupName(new LeafYangData<>("name", "/ap-config:config/ap-config:interface/ap-config:bridge/ap-config:port/ap-config:name", "Bridge port name", true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public Port collectConfig(Port port) {
        if (port == null) {
            return null;
        }
        Name name = getName();
        if (name != null) {
            port.addName(name);
        }
        if (port.hasChildren()) {
           return port;
        } else {
           return null;
        }
    }

    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element name = nodes.getFirstChild("name");
        if (name != null) {
            onName((Name)name);
        }
    }

}
