
package com.netconfessor.gen.apConfig.config.interface_;

import com.netconfessor.gen.apConfig.Enum_0_1;
import com.netconfessor.gen.apConfig.Enum_auto_0_1_2_3_4_5_6_7;
import com.netconfessor.gen.apConfig.Enum_off_wep_wpa_wpa2_wpa_wpa2_wpa_1x_wpa2_1x_wpa_wpa2_1x;
import com.netconfessor.gen.apConfig.config.interface_.Vap;
import com.netconfessor.gen.apConfig.config.interface_.vap.Acl;
import com.netconfessor.gen.apConfig.config.interface_.vap.AclVisitor;
import com.netconfessor.gen.apConfig.config.interface_.vap.Basic;
import com.netconfessor.gen.apConfig.config.interface_.vap.Hidden;
import com.netconfessor.gen.apConfig.config.interface_.vap.InactivityTimeout;
import com.netconfessor.gen.apConfig.config.interface_.vap.KeyWep;
import com.netconfessor.gen.apConfig.config.interface_.vap.KeyWpa;
import com.netconfessor.gen.apConfig.config.interface_.vap.PriorityByDscp;
import com.netconfessor.gen.apConfig.config.interface_.vap.Radius;
import com.netconfessor.gen.apConfig.config.interface_.vap.RadiusVisitor;
import com.netconfessor.gen.apConfig.config.interface_.vap.SecurityMode;
import com.netconfessor.gen.apConfig.config.interface_.vap.ShaperPerStaRx;
import com.netconfessor.gen.apConfig.config.interface_.vap.ShaperPerStaRxVisitor;
import com.netconfessor.gen.apConfig.config.interface_.vap.ShaperPerStaTx;
import com.netconfessor.gen.apConfig.config.interface_.vap.ShaperPerStaTxVisitor;
import com.netconfessor.gen.apConfig.config.interface_.vap.ShaperPerVapRx;
import com.netconfessor.gen.apConfig.config.interface_.vap.ShaperPerVapRxVisitor;
import com.netconfessor.gen.apConfig.config.interface_.vap.ShaperPerVapTx;
import com.netconfessor.gen.apConfig.config.interface_.vap.ShaperPerVapTxVisitor;
import com.netconfessor.gen.apConfig.config.interface_.vap.Ssid;
import com.netconfessor.gen.apConfig.config.interface_.vap.StaLimit;
import com.netconfessor.gen.apConfig.config.interface_.vap.StationIsolation;
import com.netconfessor.gen.apConfig.config.interface_.vap.VapId;
import com.netconfessor.gen.apConfig.config.interface_.vap.VlanId;
import com.netconfessor.gen.apConfig.config.interface_.vap.VlanPriority;
import com.netconfessor.gen.apConfig.config.interface_.vap.VlanSupport;
import com.netconfessor.gen.apConfig.config.interface_.vap.VlanTrunk;

import io.netconfessor.Element;
import io.netconfessor.EnumYangData;
import io.netconfessor.LeafYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangData;
import io.netconfessor.YangDataType;
import io.netconfessor.YangInt32;
import io.netconfessor.YangString;

/**
 * Visitor of container vap
 *
 * @author jnc.py
 */
public abstract class VapVisitor {

    public abstract void setupBasic(LeafYangData<YangString> data);

    public abstract void setupStaLimit(LeafYangData<YangInt32> data);

    public abstract void setupVapId(LeafYangData<YangInt32> data);

    private AclVisitor aclVisitor;

    public abstract AclVisitor setupAcl(YangData data);

    public abstract void setupInactivityTimeout(LeafYangData<YangInt32> data);

    private ShaperPerVapTxVisitor shaperPerVapTxVisitor;

    public abstract ShaperPerVapTxVisitor setupShaperPerVapTx(YangData data);

    private ShaperPerVapRxVisitor shaperPerVapRxVisitor;

    public abstract ShaperPerVapRxVisitor setupShaperPerVapRx(YangData data);

    private ShaperPerStaTxVisitor shaperPerStaTxVisitor;

    public abstract ShaperPerStaTxVisitor setupShaperPerStaTx(YangData data);

    private ShaperPerStaRxVisitor shaperPerStaRxVisitor;

    public abstract ShaperPerStaRxVisitor setupShaperPerStaRx(YangData data);

    public abstract void setupHidden(EnumYangData<Enum_0_1> data);

    public abstract void setupStationIsolation(EnumYangData<Enum_0_1> data);

    public abstract void setupVlanId(LeafYangData<YangInt32> data);

    public abstract void setupVlanPriority(EnumYangData<Enum_auto_0_1_2_3_4_5_6_7> data);

    public abstract void setupVlanTrunk(EnumYangData<Enum_0_1> data);

    public abstract void setupVlanSupport(EnumYangData<Enum_0_1> data);

    public abstract void setupPriorityByDscp(LeafYangData<YangInt32> data);

    public abstract void setupSecurityMode(EnumYangData<Enum_off_wep_wpa_wpa2_wpa_wpa2_wpa_1x_wpa2_1x_wpa_wpa2_1x> data);

    public abstract void setupKeyWep(LeafYangData<YangString> data);

    public abstract void setupKeyWpa(LeafYangData<YangString> data);

    public abstract void setupSsid(LeafYangData<YangString> data);

    private RadiusVisitor radiusVisitor;

    public abstract RadiusVisitor setupRadius(YangData data);

    public abstract void onBasic(Basic leaf);

    public abstract Basic getBasic();

    public abstract void onStaLimit(StaLimit leaf);

    public abstract StaLimit getStaLimit();

    public abstract void onVapId(VapId leaf);

    public abstract VapId getVapId();

    public abstract void onAcl(Acl container);

    public abstract void onInactivityTimeout(InactivityTimeout leaf);

    public abstract InactivityTimeout getInactivityTimeout();

    public abstract void onShaperPerVapTx(ShaperPerVapTx container);

    public abstract void onShaperPerVapRx(ShaperPerVapRx container);

    public abstract void onShaperPerStaTx(ShaperPerStaTx container);

    public abstract void onShaperPerStaRx(ShaperPerStaRx container);

    public abstract void onHidden(Hidden leaf);

    public abstract Hidden getHidden();

    public abstract void onStationIsolation(StationIsolation leaf);

    public abstract StationIsolation getStationIsolation();

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

    public abstract void onKeyWep(KeyWep leaf);

    public abstract KeyWep getKeyWep();

    public abstract void onKeyWpa(KeyWpa leaf);

    public abstract KeyWpa getKeyWpa();

    public abstract void onSsid(Ssid leaf);

    public abstract Ssid getSsid();

    public abstract void onRadius(Radius container);

    public void setup() {
        setupBasic(new LeafYangData<>("basic", "/ap-config:config/ap-config:interface/ap-config:vap/ap-config:basic", "Basic interface name", true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupStaLimit(new LeafYangData<>("sta-limit", "/ap-config:config/ap-config:interface/ap-config:vap/ap-config:sta-limit", "STA count limit", true, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
        setupVapId(new LeafYangData<>("vap-id", "/ap-config:config/ap-config:interface/ap-config:vap/ap-config:vap-id", "VAP ID", true, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
        aclVisitor = setupAcl(new YangData("acl", "/ap-config:config/ap-config:interface/ap-config:vap/ap-config:acl", null, true, YangDataType.container));
        if (aclVisitor != null) {
            aclVisitor.setup();
        }
        setupInactivityTimeout(new LeafYangData<>("inactivity-timeout", "/ap-config:config/ap-config:interface/ap-config:vap/ap-config:inactivity-timeout", "STA inactivity timeout", true, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
        shaperPerVapTxVisitor = setupShaperPerVapTx(new YangData("shaper-per-vap-tx", "/ap-config:config/ap-config:interface/ap-config:vap/ap-config:shaper-per-vap-tx", null, true, YangDataType.container));
        if (shaperPerVapTxVisitor != null) {
            shaperPerVapTxVisitor.setup();
        }
        shaperPerVapRxVisitor = setupShaperPerVapRx(new YangData("shaper-per-vap-rx", "/ap-config:config/ap-config:interface/ap-config:vap/ap-config:shaper-per-vap-rx", null, true, YangDataType.container));
        if (shaperPerVapRxVisitor != null) {
            shaperPerVapRxVisitor.setup();
        }
        shaperPerStaTxVisitor = setupShaperPerStaTx(new YangData("shaper-per-sta-tx", "/ap-config:config/ap-config:interface/ap-config:vap/ap-config:shaper-per-sta-tx", null, true, YangDataType.container));
        if (shaperPerStaTxVisitor != null) {
            shaperPerStaTxVisitor.setup();
        }
        shaperPerStaRxVisitor = setupShaperPerStaRx(new YangData("shaper-per-sta-rx", "/ap-config:config/ap-config:interface/ap-config:vap/ap-config:shaper-per-sta-rx", null, true, YangDataType.container));
        if (shaperPerStaRxVisitor != null) {
            shaperPerStaRxVisitor.setup();
        }
        setupHidden(new EnumYangData<>("hidden", "/ap-config:config/ap-config:interface/ap-config:vap/ap-config:hidden", "Hidden AP mode", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupStationIsolation(new EnumYangData<>("station-isolation", "/ap-config:config/ap-config:interface/ap-config:vap/ap-config:station-isolation", "Station isolation", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupVlanId(new LeafYangData<>("vlan-id", "/ap-config:config/ap-config:interface/ap-config:vap/ap-config:vlan-id", "VLAN ID", true, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
        setupVlanPriority(new EnumYangData<>("vlan-priority", "/ap-config:config/ap-config:interface/ap-config:vap/ap-config:vlan-priority", "VLAN priority", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_auto_0_1_2_3_4_5_6_7", s -> new Enum_auto_0_1_2_3_4_5_6_7(s), Enum_auto_0_1_2_3_4_5_6_7.enums()));
        setupVlanTrunk(new EnumYangData<>("vlan-trunk", "/ap-config:config/ap-config:interface/ap-config:vap/ap-config:vlan-trunk", "VLAN trunk feature", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupVlanSupport(new EnumYangData<>("vlan-support", "/ap-config:config/ap-config:interface/ap-config:vap/ap-config:vlan-support", "Realtek specific option, need always 1 for VLAN support", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupPriorityByDscp(new LeafYangData<>("priority-by-dscp", "/ap-config:config/ap-config:interface/ap-config:vap/ap-config:priority-by-dscp", "Use DSCP for priority packets", true, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
        setupSecurityMode(new EnumYangData<>("security-mode", "/ap-config:config/ap-config:interface/ap-config:vap/ap-config:security-mode", "Security mode", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_off_wep_wpa_wpa2_wpa_wpa2_wpa_1x_wpa2_1x_wpa_wpa2_1x", s -> new Enum_off_wep_wpa_wpa2_wpa_wpa2_wpa_1x_wpa2_1x_wpa_wpa2_1x(s), Enum_off_wep_wpa_wpa2_wpa_wpa2_wpa_1x_wpa2_1x_wpa_wpa2_1x.enums()));
        setupKeyWep(new LeafYangData<>("key-wep", "/ap-config:config/ap-config:interface/ap-config:vap/ap-config:key-wep", "Key for WEP mode", true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupKeyWpa(new LeafYangData<>("key-wpa", "/ap-config:config/ap-config:interface/ap-config:vap/ap-config:key-wpa", "Key for WPA PSK mode", true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupSsid(new LeafYangData<>("ssid", "/ap-config:config/ap-config:interface/ap-config:vap/ap-config:ssid", "SSID", true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        radiusVisitor = setupRadius(new YangData("radius", "/ap-config:config/ap-config:interface/ap-config:vap/ap-config:radius", null, true, YangDataType.container));
        if (radiusVisitor != null) {
            radiusVisitor.setup();
        }
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public Vap collectConfig() {
        Vap vap = new Vap();
        Basic basic = getBasic();
        if (basic != null) {
            vap.addBasic(basic);
        }
        StaLimit staLimit = getStaLimit();
        if (staLimit != null) {
            vap.addStaLimit(staLimit);
        }
        VapId vapId = getVapId();
        if (vapId != null) {
            vap.addVapId(vapId);
        }
        if (aclVisitor != null) {
            Acl acl = aclVisitor.collectConfig();
            if (acl != null) {
                vap.addAcl(acl);
            }
        }
        InactivityTimeout inactivityTimeout = getInactivityTimeout();
        if (inactivityTimeout != null) {
            vap.addInactivityTimeout(inactivityTimeout);
        }
        if (shaperPerVapTxVisitor != null) {
            ShaperPerVapTx shaperPerVapTx = shaperPerVapTxVisitor.collectConfig();
            if (shaperPerVapTx != null) {
                vap.addShaperPerVapTx(shaperPerVapTx);
            }
        }
        if (shaperPerVapRxVisitor != null) {
            ShaperPerVapRx shaperPerVapRx = shaperPerVapRxVisitor.collectConfig();
            if (shaperPerVapRx != null) {
                vap.addShaperPerVapRx(shaperPerVapRx);
            }
        }
        if (shaperPerStaTxVisitor != null) {
            ShaperPerStaTx shaperPerStaTx = shaperPerStaTxVisitor.collectConfig();
            if (shaperPerStaTx != null) {
                vap.addShaperPerStaTx(shaperPerStaTx);
            }
        }
        if (shaperPerStaRxVisitor != null) {
            ShaperPerStaRx shaperPerStaRx = shaperPerStaRxVisitor.collectConfig();
            if (shaperPerStaRx != null) {
                vap.addShaperPerStaRx(shaperPerStaRx);
            }
        }
        Hidden hidden = getHidden();
        if (hidden != null) {
            vap.addHidden(hidden);
        }
        StationIsolation stationIsolation = getStationIsolation();
        if (stationIsolation != null) {
            vap.addStationIsolation(stationIsolation);
        }
        VlanId vlanId = getVlanId();
        if (vlanId != null) {
            vap.addVlanId(vlanId);
        }
        VlanPriority vlanPriority = getVlanPriority();
        if (vlanPriority != null) {
            vap.addVlanPriority(vlanPriority);
        }
        VlanTrunk vlanTrunk = getVlanTrunk();
        if (vlanTrunk != null) {
            vap.addVlanTrunk(vlanTrunk);
        }
        VlanSupport vlanSupport = getVlanSupport();
        if (vlanSupport != null) {
            vap.addVlanSupport(vlanSupport);
        }
        PriorityByDscp priorityByDscp = getPriorityByDscp();
        if (priorityByDscp != null) {
            vap.addPriorityByDscp(priorityByDscp);
        }
        SecurityMode securityMode = getSecurityMode();
        if (securityMode != null) {
            vap.addSecurityMode(securityMode);
        }
        KeyWep keyWep = getKeyWep();
        if (keyWep != null) {
            vap.addKeyWep(keyWep);
        }
        KeyWpa keyWpa = getKeyWpa();
        if (keyWpa != null) {
            vap.addKeyWpa(keyWpa);
        }
        Ssid ssid = getSsid();
        if (ssid != null) {
            vap.addSsid(ssid);
        }
        if (radiusVisitor != null) {
            Radius radius = radiusVisitor.collectConfig();
            if (radius != null) {
                vap.addRadius(radius);
            }
        }
        if (vap.hasChildren()) {
           return vap;
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
        
        final Element staLimit = nodes.getFirstChild("sta-limit");
        if (staLimit != null) {
            onStaLimit((StaLimit)staLimit);
        }
        
        final Element vapId = nodes.getFirstChild("vap-id");
        if (vapId != null) {
            onVapId((VapId)vapId);
        }
        
        final Element acl = nodes.getFirstChild("acl");
        if (acl != null) {
            onAcl((Acl)acl);
            if (aclVisitor != null) {
                if (acl.hasChildren()) {
                    aclVisitor.visit(acl.getChildren());
                }
            }
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
        
        final Element hidden = nodes.getFirstChild("hidden");
        if (hidden != null) {
            onHidden((Hidden)hidden);
        }
        
        final Element stationIsolation = nodes.getFirstChild("station-isolation");
        if (stationIsolation != null) {
            onStationIsolation((StationIsolation)stationIsolation);
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
