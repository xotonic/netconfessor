
package io.netconfessor.gen.apConfig.config.interface_.wlan;

import io.netconfessor.Element;
import io.netconfessor.EnumYangData;
import io.netconfessor.LeafYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangData;
import io.netconfessor.YangDataType;
import io.netconfessor.YangInt32;
import io.netconfessor.YangString;
import io.netconfessor.gen.apConfig.Enum_0_1;
import io.netconfessor.gen.apConfig.Enum_off_manual_auto;
import io.netconfessor.gen.apConfig.Enum_off_wep_wpa_wpa2_wpa_wpa2_wpa_1x_wpa2_1x_wpa_wpa2_1x;
import io.netconfessor.gen.apConfig.config.interface_.wlan.Sta;
import io.netconfessor.gen.apConfig.config.interface_.wlan.sta.ClientShaperMode;
import io.netconfessor.gen.apConfig.config.interface_.wlan.sta.KeyWep;
import io.netconfessor.gen.apConfig.config.interface_.wlan.sta.KeyWpa;
import io.netconfessor.gen.apConfig.config.interface_.wlan.sta.Radius;
import io.netconfessor.gen.apConfig.config.interface_.wlan.sta.RadiusVisitor;
import io.netconfessor.gen.apConfig.config.interface_.wlan.sta.SecurityMode;
import io.netconfessor.gen.apConfig.config.interface_.wlan.sta.ShaperLimit;
import io.netconfessor.gen.apConfig.config.interface_.wlan.sta.Ssid;
import io.netconfessor.gen.apConfig.config.interface_.wlan.sta.VlanSupport;

/**
 * Visitor of container sta
 *
 * @author jnc.py
 */
public abstract class StaVisitor {

    public abstract void setupSecurityMode(EnumYangData<Enum_off_wep_wpa_wpa2_wpa_wpa2_wpa_1x_wpa2_1x_wpa_wpa2_1x> data);

    public abstract void setupClientShaperMode(EnumYangData<Enum_off_manual_auto> data);

    public abstract void setupShaperLimit(LeafYangData<YangInt32> data);

    public abstract void setupKeyWep(LeafYangData<YangString> data);

    public abstract void setupKeyWpa(LeafYangData<YangString> data);

    public abstract void setupSsid(LeafYangData<YangString> data);

    public abstract void setupVlanSupport(EnumYangData<Enum_0_1> data);

    private RadiusVisitor radiusVisitor;

    public abstract RadiusVisitor setupRadius(YangData data);

    public abstract void onSecurityMode(SecurityMode leaf);

    public abstract SecurityMode getSecurityMode();

    public abstract void onClientShaperMode(ClientShaperMode leaf);

    public abstract ClientShaperMode getClientShaperMode();

    public abstract void onShaperLimit(ShaperLimit leaf);

    public abstract ShaperLimit getShaperLimit();

    public abstract void onKeyWep(KeyWep leaf);

    public abstract KeyWep getKeyWep();

    public abstract void onKeyWpa(KeyWpa leaf);

    public abstract KeyWpa getKeyWpa();

    public abstract void onSsid(Ssid leaf);

    public abstract Ssid getSsid();

    public abstract void onVlanSupport(VlanSupport leaf);

    public abstract VlanSupport getVlanSupport();

    public abstract void onRadius(Radius container);

    public void setup() {
        setupSecurityMode(new EnumYangData<>("security-mode", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:sta/ap-config:security-mode", "Security mode", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_off_wep_wpa_wpa2_wpa_wpa2_wpa_1x_wpa2_1x_wpa_wpa2_1x", s -> new Enum_off_wep_wpa_wpa2_wpa_wpa2_wpa_1x_wpa2_1x_wpa_wpa2_1x(s), Enum_off_wep_wpa_wpa2_wpa_wpa2_wpa_1x_wpa2_1x_wpa_wpa2_1x.enums()));
        setupClientShaperMode(new EnumYangData<>("client-shaper-mode", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:sta/ap-config:client-shaper-mode", "Client side shaper mode", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_off_manual_auto", s -> new Enum_off_manual_auto(s), Enum_off_manual_auto.enums()));
        setupShaperLimit(new LeafYangData<>("shaper-limit", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:sta/ap-config:shaper-limit", "Client side shaper limit", true, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
        setupKeyWep(new LeafYangData<>("key-wep", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:sta/ap-config:key-wep", "Key for WEP mode", true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupKeyWpa(new LeafYangData<>("key-wpa", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:sta/ap-config:key-wpa", "Key for WPA PSK mode", true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupSsid(new LeafYangData<>("ssid", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:sta/ap-config:ssid", "SSID", true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupVlanSupport(new EnumYangData<>("vlan-support", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:sta/ap-config:vlan-support", "Realtek specific option, need always 1 for VLAN support", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        radiusVisitor = setupRadius(new YangData("radius", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:sta/ap-config:radius", null, true, YangDataType.container));
        if (radiusVisitor != null) {
            radiusVisitor.setup();
        }
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public Sta collectConfig() {
        Sta sta = new Sta();
        SecurityMode securityMode = getSecurityMode();
        if (securityMode != null) {
            sta.addSecurityMode(securityMode);
        }
        ClientShaperMode clientShaperMode = getClientShaperMode();
        if (clientShaperMode != null) {
            sta.addClientShaperMode(clientShaperMode);
        }
        ShaperLimit shaperLimit = getShaperLimit();
        if (shaperLimit != null) {
            sta.addShaperLimit(shaperLimit);
        }
        KeyWep keyWep = getKeyWep();
        if (keyWep != null) {
            sta.addKeyWep(keyWep);
        }
        KeyWpa keyWpa = getKeyWpa();
        if (keyWpa != null) {
            sta.addKeyWpa(keyWpa);
        }
        Ssid ssid = getSsid();
        if (ssid != null) {
            sta.addSsid(ssid);
        }
        VlanSupport vlanSupport = getVlanSupport();
        if (vlanSupport != null) {
            sta.addVlanSupport(vlanSupport);
        }
        if (radiusVisitor != null) {
            Radius radius = radiusVisitor.collectConfig();
            if (radius != null) {
                sta.addRadius(radius);
            }
        }
        if (sta.hasChildren()) {
           return sta;
        } else {
           return null;
        }
    }

    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element securityMode = nodes.getFirstChild("security-mode");
        if (securityMode != null) {
            onSecurityMode((SecurityMode)securityMode);
        }
        
        final Element clientShaperMode = nodes.getFirstChild("client-shaper-mode");
        if (clientShaperMode != null) {
            onClientShaperMode((ClientShaperMode)clientShaperMode);
        }
        
        final Element shaperLimit = nodes.getFirstChild("shaper-limit");
        if (shaperLimit != null) {
            onShaperLimit((ShaperLimit)shaperLimit);
        }
        
        final Element keyWep = nodes.getFirstChild("key-wep");
        if (keyWep != null) {
            onKeyWep((KeyWep)keyWep);
        }
        
        final Element keyWpa = nodes.getFirstChild("key-wpa");
        if (keyWpa != null) {
            onKeyWpa((KeyWpa)keyWpa);
        }
        
        final Element ssid = nodes.getFirstChild("ssid");
        if (ssid != null) {
            onSsid((Ssid)ssid);
        }
        
        final Element vlanSupport = nodes.getFirstChild("vlan-support");
        if (vlanSupport != null) {
            onVlanSupport((VlanSupport)vlanSupport);
        }
        
        final Element radius = nodes.getFirstChild("radius");
        if (radius != null) {
            onRadius((Radius)radius);
            if (radiusVisitor != null) {
                if (radius.hasChildren()) {
                    radiusVisitor.visit(radius.getChildren());
                }
            }
        }
    }

}
