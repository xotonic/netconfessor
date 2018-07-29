
package com.netconfessor.gen.apConfig.config;

import com.netconfessor.gen.apConfig.Enum_0_1;
import com.netconfessor.gen.apConfig.config.system.GlobalStationIsolation;

import io.netconfessor.Element;
import io.netconfessor.EnumYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangDataType;

/**
 * Visitor of container system
 *
 * @author jnc.py
 */
public abstract class SystemVisitor {

    public abstract void setupGlobalStationIsolation(EnumYangData<Enum_0_1> data);

    public abstract void onGlobalStationIsolation(GlobalStationIsolation leaf);

    public abstract GlobalStationIsolation getGlobalStationIsolation();

    public void setup() {
        setupGlobalStationIsolation(new EnumYangData<>("global-station-isolation", "/ap-config:config/ap-config:system/ap-config:global-station-isolation", "Full isolation", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public com.netconfessor.gen.apConfig.config.System collectConfig() {
        System system = new System();
        GlobalStationIsolation globalStationIsolation = getGlobalStationIsolation();
        if (globalStationIsolation != null) {
            system.addGlobalStationIsolation(globalStationIsolation);
        }
        if (system.hasChildren()) {
           return system;
        } else {
           return null;
        }
    }

    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element globalStationIsolation = nodes.getFirstChild("global-station-isolation");
        if (globalStationIsolation != null) {
            onGlobalStationIsolation((GlobalStationIsolation)globalStationIsolation);
        }
    }

}
