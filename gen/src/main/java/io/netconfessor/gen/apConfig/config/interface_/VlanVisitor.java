
package io.netconfessor.gen.apConfig.config.interface_;

import io.netconfessor.Element;
import io.netconfessor.LeafYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangDataType;
import io.netconfessor.YangInt32;
import io.netconfessor.YangString;
import io.netconfessor.gen.apConfig.config.interface_.Vlan;
import io.netconfessor.gen.apConfig.config.interface_.vlan.Basic;
import io.netconfessor.gen.apConfig.config.interface_.vlan.VlanId;

/**
 * Visitor of container vlan
 *
 * @author jnc.py
 */
public abstract class VlanVisitor {

    public abstract void setupBasic(LeafYangData<YangString> data);

    public abstract void setupVlanId(LeafYangData<YangInt32> data);

    public abstract void onBasic(Basic leaf);

    public abstract Basic getBasic();

    public abstract void onVlanId(VlanId leaf);

    public abstract VlanId getVlanId();

    public void setup() {
        setupBasic(new LeafYangData<>("basic", "/ap-config:config/ap-config:interface/ap-config:vlan/ap-config:basic", "Basic interface name", true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupVlanId(new LeafYangData<>("vlan-id", "/ap-config:config/ap-config:interface/ap-config:vlan/ap-config:vlan-id", "VLAN ID", true, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public Vlan collectConfig() {
        Vlan vlan = new Vlan();
        Basic basic = getBasic();
        if (basic != null) {
            vlan.addBasic(basic);
        }
        VlanId vlanId = getVlanId();
        if (vlanId != null) {
            vlan.addVlanId(vlanId);
        }
        if (vlan.hasChildren()) {
           return vlan;
        } else {
           return null;
        }
    }

    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element basic = nodes.getFirstChild("basic");
        if (basic != null) {
            onBasic((Basic)basic);
        }
        
        final Element vlanId = nodes.getFirstChild("vlan-id");
        if (vlanId != null) {
            onVlanId((VlanId)vlanId);
        }
    }

}
