
package io.netconfessor.gen.apConfig.config.interface_.wlan.ap.acl;

import io.netconfessor.Element;
import io.netconfessor.LeafYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangDataType;
import io.netconfessor.YangString;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.acl.Mac;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.acl.mac.Name;

/**
 * Visitor of list mac
 *
 * @author jnc.py
 */
public abstract class MacVisitor {

    public abstract void setupName(LeafYangData<YangString> data);

    public abstract void onName(Name leaf);

    public abstract Name getName();

    public void setup() {
        setupName(new LeafYangData<>("name", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:ap/ap-config:acl/ap-config:mac/ap-config:name", "STA MAC address name", true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public Mac collectConfig(Mac mac) {
        if (mac == null) {
            return null;
        }
        Name name = getName();
        if (name != null) {
            mac.addName(name);
        }
        if (mac.hasChildren()) {
           return mac;
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
