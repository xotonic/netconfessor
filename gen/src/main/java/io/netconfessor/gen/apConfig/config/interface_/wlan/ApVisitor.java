
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
import io.netconfessor.gen.apConfig.Enum_auto_0_1_2_3_4_5_6_7;
import io.netconfessor.gen.apConfig.Enum_off_wep_wpa_wpa2_wpa_wpa2_wpa_1x_wpa2_1x_wpa_wpa2_1x;
import io.netconfessor.gen.apConfig.config.interface_.wlan.Ap;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.Acl;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.AclVisitor;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.Hidden;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.Iapp;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.InactivityTimeout;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.KeyWep;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.KeyWpa;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.PriorityByDscp;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.Radius;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.RadiusVisitor;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.SecurityMode;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.ShaperPerStaRx;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.ShaperPerStaRxVisitor;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.ShaperPerStaTx;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.ShaperPerStaTxVisitor;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.ShaperPerVapRx;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.ShaperPerVapRxVisitor;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.ShaperPerVapTx;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.ShaperPerVapTxVisitor;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.Ssid;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.StaLimit;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.StationIsolation;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.VlanId;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.VlanPriority;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.VlanSupport;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.VlanTrunk;

/**
 * Visitor of container ap
 *
 * @author jnc.py
 */
public abstract class ApVisitor {

    private AclVisitor aclVisitor;

    public abstract AclVisitor setupAcl(YangData data);

    public abstract void setupStationIsolation(EnumYangData<Enum_0_1> data);

    public abstract void setupInactivityTimeout(LeafYangData<YangInt32> data);

    private ShaperPerVapTxVisitor shaperPerVapTxVisitor;

    public abstract ShaperPerVapTxVisitor setupShaperPerVapTx(YangData data);

    private ShaperPerVapRxVisitor shaperPerVapRxVisitor;

    public abstract ShaperPerVapRxVisitor setupShaperPerVapRx(YangData data);

    private ShaperPerStaTxVisitor shaperPerStaTxVisitor;

    public abstract ShaperPerStaTxVisitor setupShaperPerStaTx(YangData data);

    private ShaperPerStaRxVisitor shaperPerStaRxVisitor;

    public abstract ShaperPerStaRxVisitor setupShaperPerStaRx(YangData data);

    public abstract void setupVlanId(LeafYangData<YangInt32> data);

    public abstract void setupVlanPriority(EnumYangData<Enum_auto_0_1_2_3_4_5_6_7> data);

    public abstract void setupVlanTrunk(EnumYangData<Enum_0_1> data);

    public abstract void setupVlanSupport(EnumYangData<Enum_0_1> data);

    public abstract void setupPriorityByDscp(LeafYangData<YangInt32> data);

    public abstract void setupSecurityMode(EnumYangData<Enum_off_wep_wpa_wpa2_wpa_wpa2_wpa_1x_wpa2_1x_wpa_wpa2_1x> data);

    public abstract void setupHidden(EnumYangData<Enum_0_1> data);

    public abstract void setupStaLimit(LeafYangData<YangInt32> data);

    public abstract void setupIapp(EnumYangData<Enum_0_1> data);

    public abstract void setupKeyWep(LeafYangData<YangString> data);

    public abstract void setupKeyWpa(LeafYangData<YangString> data);

    public abstract void setupSsid(LeafYangData<YangString> data);

    private RadiusVisitor radiusVisitor;

    public abstract RadiusVisitor setupRadius(YangData data);

    public abstract void onAcl(Acl container);

    public abstract void onStationIsolation(StationIsolation leaf);

    public abstract StationIsolation getStationIsolation();

    public abstract void onInactivityTimeout(InactivityTimeout leaf);

    public abstract InactivityTimeout getInactivityTimeout();

    public abstract void onShaperPerVapTx(ShaperPerVapTx container);

    public abstract void onShaperPerVapRx(ShaperPerVapRx container);

    public abstract void onShaperPerStaTx(ShaperPerStaTx container);

    public abstract void onShaperPerStaRx(ShaperPerStaRx container);

    public abstract void onVlanId(VlanId leaf);

    public abstract VlanId getVlanId();

    public abstract void onVlanPriority(VlanPriority leaf);

    public abstract VlanPriority getVlanPriority();

    public abstract void onVlanTrunk(VlanTrunk leaf);

    public abstract VlanTrunk getVlanTrunk();

    public abstract void onVlanSupport(VlanSupport leaf);

    public abstract VlanSupport getVlanSupport();

    public abstract void onPriorityByDscp(PriorityByDscp leaf);

    public abstract PriorityByDscp getPriorityByDscp();

    public abstract void onSecurityMode(SecurityMode leaf);

    public abstract SecurityMode getSecurityMode();

    public abstract void onHidden(Hidden leaf);

    public abstract Hidden getHidden();

    public abstract void onStaLimit(StaLimit leaf);

    public abstract StaLimit getStaLimit();

    public abstract void onIapp(Iapp leaf);

    public abstract Iapp getIapp();

    public abstract void onKeyWep(KeyWep leaf);

    public abstract KeyWep getKeyWep();

    public abstract void onKeyWpa(KeyWpa leaf);

    public abstract KeyWpa getKeyWpa();

    public abstract void onSsid(Ssid leaf);

    public abstract Ssid getSsid();

    public abstract void onRadius(Radius container);

    public void setup() {
        aclVisitor = setupAcl(new YangData("acl", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:ap/ap-config:acl", null, true, YangDataType.container));
        if (aclVisitor != null) {
            aclVisitor.setup();
        }
        setupStationIsolation(new EnumYangData<>("station-isolation", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:ap/ap-config:station-isolation", "Station isolation", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupInactivityTimeout(new LeafYangData<>("inactivity-timeout", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:ap/ap-config:inactivity-timeout", "STA inactivity timeout", true, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
        shaperPerVapTxVisitor = setupShaperPerVapTx(new YangData("shaper-per-vap-tx", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:ap/ap-config:shaper-per-vap-tx", null, true, YangDataType.container));
        if (shaperPerVapTxVisitor != null) {
            shaperPerVapTxVisitor.setup();
        }
        shaperPerVapRxVisitor = setupShaperPerVapRx(new YangData("shaper-per-vap-rx", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:ap/ap-config:shaper-per-vap-rx", null, true, YangDataType.container));
        if (shaperPerVapRxVisitor != null) {
            shaperPerVapRxVisitor.setup();
        }
        shaperPerStaTxVisitor = setupShaperPerStaTx(new YangData("shaper-per-sta-tx", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:ap/ap-config:shaper-per-sta-tx", null, true, YangDataType.container));
        if (shaperPerStaTxVisitor != null) {
            shaperPerStaTxVisitor.setup();
        }
        shaperPerStaRxVisitor = setupShaperPerStaRx(new YangData("shaper-per-sta-rx", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:ap/ap-config:shaper-per-sta-rx", null, true, YangDataType.container));
        if (shaperPerStaRxVisitor != null) {
            shaperPerStaRxVisitor.setup();
        }
        setupVlanId(new LeafYangData<>("vlan-id", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:ap/ap-config:vlan-id", "VLAN ID", true, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
        setupVlanPriority(new EnumYangData<>("vlan-priority", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:ap/ap-config:vlan-priority", "VLAN priority", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_auto_0_1_2_3_4_5_6_7", s -> new Enum_auto_0_1_2_3_4_5_6_7(s), Enum_auto_0_1_2_3_4_5_6_7.enums()));
        setupVlanTrunk(new EnumYangData<>("vlan-trunk", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:ap/ap-config:vlan-trunk", "VLAN trunk feature", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupVlanSupport(new EnumYangData<>("vlan-support", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:ap/ap-config:vlan-support", "Realtek specific option, need always 1 for VLAN support", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupPriorityByDscp(new LeafYangData<>("priority-by-dscp", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:ap/ap-config:priority-by-dscp", "Use DSCP for priority packets", true, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
        setupSecurityMode(new EnumYangData<>("security-mode", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:ap/ap-config:security-mode", "Security mode", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_off_wep_wpa_wpa2_wpa_wpa2_wpa_1x_wpa2_1x_wpa_wpa2_1x", s -> new Enum_off_wep_wpa_wpa2_wpa_wpa2_wpa_1x_wpa2_1x_wpa_wpa2_1x(s), Enum_off_wep_wpa_wpa2_wpa_wpa2_wpa_1x_wpa2_1x_wpa_wpa2_1x.enums()));
        setupHidden(new EnumYangData<>("hidden", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:ap/ap-config:hidden", "Hidden AP mode", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupStaLimit(new LeafYangData<>("sta-limit", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:ap/ap-config:sta-limit", "STA count limit", true, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
        setupIapp(new EnumYangData<>("iapp", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:ap/ap-config:iapp", "IAPP", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupKeyWep(new LeafYangData<>("key-wep", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:ap/ap-config:key-wep", "Key for WEP mode", true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupKeyWpa(new LeafYangData<>("key-wpa", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:ap/ap-config:key-wpa", "Key for WPA PSK mode", true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupSsid(new LeafYangData<>("ssid", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:ap/ap-config:ssid", "SSID", true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        radiusVisitor = setupRadius(new YangData("radius", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:ap/ap-config:radius", null, true, YangDataType.container));
        if (radiusVisitor != null) {
            radiusVisitor.setup();
        }
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public Ap collectConfig() {
        Ap ap = new Ap();
        if (aclVisitor != null) {
            Acl acl = aclVisitor.collectConfig();
            if (acl != null) {
                ap.addAcl(acl);
            }
        }
        StationIsolation stationIsolation = getStationIsolation();
        if (stationIsolation != null) {
            ap.addStationIsolation(stationIsolation);
        }
        InactivityTimeout inactivityTimeout = getInactivityTimeout();
        if (inactivityTimeout != null) {
            ap.addInactivityTimeout(inactivityTimeout);
        }
        if (shaperPerVapTxVisitor != null) {
            ShaperPerVapTx shaperPerVapTx = shaperPerVapTxVisitor.collectConfig();
            if (shaperPerVapTx != null) {
                ap.addShaperPerVapTx(shaperPerVapTx);
            }
        }
        if (shaperPerVapRxVisitor != null) {
            ShaperPerVapRx shaperPerVapRx = shaperPerVapRxVisitor.collectConfig();
            if (shaperPerVapRx != null) {
                ap.addShaperPerVapRx(shaperPerVapRx);
            }
        }
        if (shaperPerStaTxVisitor != null) {
            ShaperPerStaTx shaperPerStaTx = shaperPerStaTxVisitor.collectConfig();
            if (shaperPerStaTx != null) {
                ap.addShaperPerStaTx(shaperPerStaTx);
            }
        }
        if (shaperPerStaRxVisitor != null) {
            ShaperPerStaRx shaperPerStaRx = shaperPerStaRxVisitor.collectConfig();
            if (shaperPerStaRx != null) {
                ap.addShaperPerStaRx(shaperPerStaRx);
            }
        }
        VlanId vlanId = getVlanId();
        if (vlanId != null) {
            ap.addVlanId(vlanId);
        }
        VlanPriority vlanPriority = getVlanPriority();
        if (vlanPriority != null) {
            ap.addVlanPriority(vlanPriority);
        }
        VlanTrunk vlanTrunk = getVlanTrunk();
        if (vlanTrunk != null) {
            ap.addVlanTrunk(vlanTrunk);
        }
        VlanSupport vlanSupport = getVlanSupport();
        if (vlanSupport != null) {
            ap.addVlanSupport(vlanSupport);
        }
        PriorityByDscp priorityByDscp = getPriorityByDscp();
        if (priorityByDscp != null) {
            ap.addPriorityByDscp(priorityByDscp);
        }
        SecurityMode securityMode = getSecurityMode();
        if (securityMode != null) {
            ap.addSecurityMode(securityMode);
        }
        Hidden hidden = getHidden();
        if (hidden != null) {
            ap.addHidden(hidden);
        }
        StaLimit staLimit = getStaLimit();
        if (staLimit != null) {
            ap.addStaLimit(staLimit);
        }
        Iapp iapp = getIapp();
        if (iapp != null) {
            ap.addIapp(iapp);
        }
        KeyWep keyWep = getKeyWep();
        if (keyWep != null) {
            ap.addKeyWep(keyWep);
        }
        KeyWpa keyWpa = getKeyWpa();
        if (keyWpa != null) {
            ap.addKeyWpa(keyWpa);
        }
        Ssid ssid = getSsid();
        if (ssid != null) {
            ap.addSsid(ssid);
        }
        if (radiusVisitor != null) {
            Radius radius = radiusVisitor.collectConfig();
            if (radius != null) {
                ap.addRadius(radius);
            }
        }
        if (ap.hasChildren()) {
           return ap;
        } else {
           return null;
        }
    }

    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element acl = nodes.getFirstChild("acl");
        if (acl != null) {
            onAcl((Acl)acl);
            if (aclVisitor != null) {
                if (acl.hasChildren()) {
                    aclVisitor.visit(acl.getChildren());
                }
            }
        }
        
        final Element stationIsolation = nodes.getFirstChild("station-isolation");
        if (stationIsolation != null) {
            onStationIsolation((StationIsolation)stationIsolation);
        }
        
        final Element inactivityTimeout = nodes.getFirstChild("inactivity-timeout");
        if (inactivityTimeout != null) {
            onInactivityTimeout((InactivityTimeout)inactivityTimeout);
        }
        
        final Element shaperPerVapTx = nodes.getFirstChild("shaper-per-vap-tx");
        if (shaperPerVapTx != null) {
            onShaperPerVapTx((ShaperPerVapTx)shaperPerVapTx);
            if (shaperPerVapTxVisitor != null) {
                if (shaperPerVapTx.hasChildren()) {
                    shaperPerVapTxVisitor.visit(shaperPerVapTx.getChildren());
                }
            }
        }
        
        final Element shaperPerVapRx = nodes.getFirstChild("shaper-per-vap-rx");
        if (shaperPerVapRx != null) {
            onShaperPerVapRx((ShaperPerVapRx)shaperPerVapRx);
            if (shaperPerVapRxVisitor != null) {
                if (shaperPerVapRx.hasChildren()) {
                    shaperPerVapRxVisitor.visit(shaperPerVapRx.getChildren());
                }
            }
        }
        
        final Element shaperPerStaTx = nodes.getFirstChild("shaper-per-sta-tx");
        if (shaperPerStaTx != null) {
            onShaperPerStaTx((ShaperPerStaTx)shaperPerStaTx);
            if (shaperPerStaTxVisitor != null) {
                if (shaperPerStaTx.hasChildren()) {
                    shaperPerStaTxVisitor.visit(shaperPerStaTx.getChildren());
                }
            }
        }
        
        final Element shaperPerStaRx = nodes.getFirstChild("shaper-per-sta-rx");
        if (shaperPerStaRx != null) {
            onShaperPerStaRx((ShaperPerStaRx)shaperPerStaRx);
            if (shaperPerStaRxVisitor != null) {
                if (shaperPerStaRx.hasChildren()) {
                    shaperPerStaRxVisitor.visit(shaperPerStaRx.getChildren());
                }
            }
        }
        
        final Element vlanId = nodes.getFirstChild("vlan-id");
        if (vlanId != null) {
            onVlanId((VlanId)vlanId);
        }
        
        final Element vlanPriority = nodes.getFirstChild("vlan-priority");
        if (vlanPriority != null) {
            onVlanPriority((VlanPriority)vlanPriority);
        }
        
        final Element vlanTrunk = nodes.getFirstChild("vlan-trunk");
        if (vlanTrunk != null) {
            onVlanTrunk((VlanTrunk)vlanTrunk);
        }
        
        final Element vlanSupport = nodes.getFirstChild("vlan-support");
        if (vlanSupport != null) {
            onVlanSupport((VlanSupport)vlanSupport);
        }
        
        final Element priorityByDscp = nodes.getFirstChild("priority-by-dscp");
        if (priorityByDscp != null) {
            onPriorityByDscp((PriorityByDscp)priorityByDscp);
        }
        
        final Element securityMode = nodes.getFirstChild("security-mode");
        if (securityMode != null) {
            onSecurityMode((SecurityMode)securityMode);
        }
        
        final Element hidden = nodes.getFirstChild("hidden");
        if (hidden != null) {
            onHidden((Hidden)hidden);
        }
        
        final Element staLimit = nodes.getFirstChild("sta-limit");
        if (staLimit != null) {
            onStaLimit((StaLimit)staLimit);
        }
        
        final Element iapp = nodes.getFirstChild("iapp");
        if (iapp != null) {
            onIapp((Iapp)iapp);
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
