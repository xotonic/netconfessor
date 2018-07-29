
package io.netconfessor.gen.apConfig.config;

import io.netconfessor.Element;
import io.netconfessor.LeafYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangData;
import io.netconfessor.YangDataType;
import io.netconfessor.YangString;
import io.netconfessor.gen.apConfig.config.JInterface;
import io.netconfessor.gen.apConfig.config.interface_.Bridge;
import io.netconfessor.gen.apConfig.config.interface_.BridgeVisitor;
import io.netconfessor.gen.apConfig.config.interface_.Common;
import io.netconfessor.gen.apConfig.config.interface_.CommonVisitor;
import io.netconfessor.gen.apConfig.config.interface_.Eth;
import io.netconfessor.gen.apConfig.config.interface_.EthVisitor;
import io.netconfessor.gen.apConfig.config.interface_.Gre;
import io.netconfessor.gen.apConfig.config.interface_.GreVisitor;
import io.netconfessor.gen.apConfig.config.interface_.Name;
import io.netconfessor.gen.apConfig.config.interface_.Vap;
import io.netconfessor.gen.apConfig.config.interface_.VapVisitor;
import io.netconfessor.gen.apConfig.config.interface_.Vlan;
import io.netconfessor.gen.apConfig.config.interface_.VlanVisitor;
import io.netconfessor.gen.apConfig.config.interface_.Wlan;
import io.netconfessor.gen.apConfig.config.interface_.WlanVisitor;

/**
 * Visitor of list interface
 *
 * @author jnc.py
 */
public abstract class JInterfaceVisitor {

    public abstract void setupName(LeafYangData<YangString> data);

    private CommonVisitor commonVisitor;

    public abstract CommonVisitor setupCommon(YangData data);

    private EthVisitor ethVisitor;

    public abstract EthVisitor setupEth(YangData data);

    private BridgeVisitor bridgeVisitor;

    public abstract BridgeVisitor setupBridge(YangData data);

    private GreVisitor greVisitor;

    public abstract GreVisitor setupGre(YangData data);

    private VlanVisitor vlanVisitor;

    public abstract VlanVisitor setupVlan(YangData data);

    private VapVisitor vapVisitor;

    public abstract VapVisitor setupVap(YangData data);

    private WlanVisitor wlanVisitor;

    public abstract WlanVisitor setupWlan(YangData data);

    public abstract void onName(Name leaf);

    public abstract Name getName();

    public abstract void onCommon(Common container);

    public abstract void onEth(Eth container);

    public abstract void onBridge(Bridge container);

    public abstract void onGre(Gre container);

    public abstract void onVlan(Vlan container);

    public abstract void onVap(Vap container);

    public abstract void onWlan(Wlan container);

    public void setup() {
        setupName(new LeafYangData<>("name", "/ap-config:config/ap-config:interface/ap-config:name", "Interface name", true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        commonVisitor = setupCommon(new YangData("common", "/ap-config:config/ap-config:interface/ap-config:common", null, true, YangDataType.container));
        if (commonVisitor != null) {
            commonVisitor.setup();
        }
        ethVisitor = setupEth(new YangData("eth", "/ap-config:config/ap-config:interface/ap-config:eth", null, true, YangDataType.container));
        if (ethVisitor != null) {
            ethVisitor.setup();
        }
        bridgeVisitor = setupBridge(new YangData("bridge", "/ap-config:config/ap-config:interface/ap-config:bridge", null, true, YangDataType.container));
        if (bridgeVisitor != null) {
            bridgeVisitor.setup();
        }
        greVisitor = setupGre(new YangData("gre", "/ap-config:config/ap-config:interface/ap-config:gre", null, true, YangDataType.container));
        if (greVisitor != null) {
            greVisitor.setup();
        }
        vlanVisitor = setupVlan(new YangData("vlan", "/ap-config:config/ap-config:interface/ap-config:vlan", null, true, YangDataType.container));
        if (vlanVisitor != null) {
            vlanVisitor.setup();
        }
        vapVisitor = setupVap(new YangData("vap", "/ap-config:config/ap-config:interface/ap-config:vap", null, true, YangDataType.container));
        if (vapVisitor != null) {
            vapVisitor.setup();
        }
        wlanVisitor = setupWlan(new YangData("wlan", "/ap-config:config/ap-config:interface/ap-config:wlan", null, true, YangDataType.container));
        if (wlanVisitor != null) {
            wlanVisitor.setup();
        }
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public JInterface collectConfig(JInterface interface_) {
        if (interface_ == null) {
            return null;
        }
        Name name = getName();
        if (name != null) {
            interface_.addName(name);
        }
        if (commonVisitor != null) {
            Common common = commonVisitor.collectConfig();
            if (common != null) {
                interface_.addCommon(common);
            }
        }
        if (ethVisitor != null) {
            Eth eth = ethVisitor.collectConfig();
            if (eth != null) {
                interface_.addEth(eth);
            }
        }
        if (bridgeVisitor != null) {
            Bridge bridge = bridgeVisitor.collectConfig();
            if (bridge != null) {
                interface_.addBridge(bridge);
            }
        }
        if (greVisitor != null) {
            Gre gre = greVisitor.collectConfig();
            if (gre != null) {
                interface_.addGre(gre);
            }
        }
        if (vlanVisitor != null) {
            Vlan vlan = vlanVisitor.collectConfig();
            if (vlan != null) {
                interface_.addVlan(vlan);
            }
        }
        if (vapVisitor != null) {
            Vap vap = vapVisitor.collectConfig();
            if (vap != null) {
                interface_.addVap(vap);
            }
        }
        if (wlanVisitor != null) {
            Wlan wlan = wlanVisitor.collectConfig();
            if (wlan != null) {
                interface_.addWlan(wlan);
            }
        }
        if (interface_.hasChildren()) {
           return interface_;
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
        
        final Element common = nodes.getFirstChild("common");
        if (common != null) {
            onCommon((Common)common);
            if (commonVisitor != null) {
                if (common.hasChildren()) {
                    commonVisitor.visit(common.getChildren());
                }
            }
        }
        
        final Element eth = nodes.getFirstChild("eth");
        if (eth != null) {
            onEth((Eth)eth);
            if (ethVisitor != null) {
                if (eth.hasChildren()) {
                    ethVisitor.visit(eth.getChildren());
                }
            }
        }
        
        final Element bridge = nodes.getFirstChild("bridge");
        if (bridge != null) {
            onBridge((Bridge)bridge);
            if (bridgeVisitor != null) {
                if (bridge.hasChildren()) {
                    bridgeVisitor.visit(bridge.getChildren());
                }
            }
        }
        
        final Element gre = nodes.getFirstChild("gre");
        if (gre != null) {
            onGre((Gre)gre);
            if (greVisitor != null) {
                if (gre.hasChildren()) {
                    greVisitor.visit(gre.getChildren());
                }
            }
        }
        
        final Element vlan = nodes.getFirstChild("vlan");
        if (vlan != null) {
            onVlan((Vlan)vlan);
            if (vlanVisitor != null) {
                if (vlan.hasChildren()) {
                    vlanVisitor.visit(vlan.getChildren());
                }
            }
        }
        
        final Element vap = nodes.getFirstChild("vap");
        if (vap != null) {
            onVap((Vap)vap);
            if (vapVisitor != null) {
                if (vap.hasChildren()) {
                    vapVisitor.visit(vap.getChildren());
                }
            }
        }
        
        final Element wlan = nodes.getFirstChild("wlan");
        if (wlan != null) {
            onWlan((Wlan)wlan);
            if (wlanVisitor != null) {
                if (wlan.hasChildren()) {
                    wlanVisitor.visit(wlan.getChildren());
                }
            }
        }
    }

}
