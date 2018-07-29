
package com.netconfessor.gen.apConfig.config;

import com.netconfessor.gen.apConfig.Enum_0_1;
import com.netconfessor.gen.apConfig.config.Netconf;
import com.netconfessor.gen.apConfig.config.netconf.Enable;

import io.netconfessor.Element;
import io.netconfessor.EnumYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangDataType;

/**
 * Visitor of container netconf
 *
 * @author jnc.py
 */
public abstract class NetconfVisitor {

    public abstract void setupEnable(EnumYangData<Enum_0_1> data);

    public abstract void onEnable(Enable leaf);

    public abstract Enable getEnable();

    public void setup() {
        setupEnable(new EnumYangData<>("enable", "/ap-config:config/ap-config:netconf/ap-config:enable", "Enable NETCONF", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public Netconf collectConfig() {
        Netconf netconf = new Netconf();
        Enable enable = getEnable();
        if (enable != null) {
            netconf.addEnable(enable);
        }
        if (netconf.hasChildren()) {
           return netconf;
        } else {
           return null;
        }
    }

    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element enable = nodes.getFirstChild("enable");
        if (enable != null) {
            onEnable((Enable)enable);
        }
    }

}
