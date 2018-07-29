
package io.netconfessor.gen.apConfig.config.interface_.wlan.ap;

import io.netconfessor.Element;
import io.netconfessor.EnumYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangData;
import io.netconfessor.YangDataType;
import io.netconfessor.gen.apConfig.Enum_blacklist_whitelist;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.Acl;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.acl.Mac;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.acl.MacVisitor;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.acl.Mode;

/**
 * Visitor of container acl
 *
 * @author jnc.py
 */
public abstract class AclVisitor {

    public abstract void setupMode(EnumYangData<Enum_blacklist_whitelist> data);

    public abstract MacVisitor setupMac(YangData data);

    private MacVisitor macVisitor;

    public abstract void onMode(Mode leaf);

    public abstract Mode getMode();

    public abstract void onNextMac(Mac item);

    protected void onStartMacList() {
    }

    protected void onStopMacList() {
    }

    abstract protected Mac getNextMac();

    public void setup() {
        setupMode(new EnumYangData<>("mode", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:ap/ap-config:acl/ap-config:mode", "ACL work-mode", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_blacklist_whitelist", s -> new Enum_blacklist_whitelist(s), Enum_blacklist_whitelist.enums()));
        macVisitor = setupMac(new YangData("mac", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:ap/ap-config:acl/ap-config:mac", null, true, YangDataType.list));
        if (macVisitor != null) {
            macVisitor.setup();
        }
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public Acl collectConfig() {
        Acl acl = new Acl();
        Mode mode = getMode();
        if (mode != null) {
            acl.addMode(mode);
        }
        Mac mac;
        while((mac = getNextMac()) != null) {
            mac.removeNonKeysIfMarkedToDelete();
            acl.addMac(mac);
        }
        if (acl.hasChildren()) {
           return acl;
        } else {
           return null;
        }
    }

    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element mode = nodes.getFirstChild("mode");
        if (mode != null) {
            onMode((Mode)mode);
        }
        
        onStartMacList();
        for (Element node : nodes.getChildren("mac")) {
            onNextMac((Mac)node);
            if (macVisitor != null) {
                if (node.hasChildren()) {
                    macVisitor.visit(node.getChildren());
                }
            }
        }
        onStopMacList();
    }

}
