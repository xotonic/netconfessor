
package com.netconfessor.gen.apConfig.config.interface_;

import com.netconfessor.gen.apConfig.Enum_0_1;
import com.netconfessor.gen.apConfig.Enum_ap_sta_radio;
import com.netconfessor.gen.apConfig.config.interface_.Wlan;
import com.netconfessor.gen.apConfig.config.interface_.wlan.Ap;
import com.netconfessor.gen.apConfig.config.interface_.wlan.ApVisitor;
import com.netconfessor.gen.apConfig.config.interface_.wlan.Mode;
import com.netconfessor.gen.apConfig.config.interface_.wlan.Radio;
import com.netconfessor.gen.apConfig.config.interface_.wlan.RadioVisitor;
import com.netconfessor.gen.apConfig.config.interface_.wlan.RssiIndication;
import com.netconfessor.gen.apConfig.config.interface_.wlan.Sta;
import com.netconfessor.gen.apConfig.config.interface_.wlan.StaVisitor;

import io.netconfessor.Element;
import io.netconfessor.EnumYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangData;
import io.netconfessor.YangDataType;

/**
 * Visitor of container wlan
 *
 * @author jnc.py
 */
public abstract class WlanVisitor {

    public abstract void setupMode(EnumYangData<Enum_ap_sta_radio> data);

    public abstract void setupRssiIndication(EnumYangData<Enum_0_1> data);

    private RadioVisitor radioVisitor;

    public abstract RadioVisitor setupRadio(YangData data);

    private StaVisitor staVisitor;

    public abstract StaVisitor setupSta(YangData data);

    private ApVisitor apVisitor;

    public abstract ApVisitor setupAp(YangData data);

    public abstract void onMode(Mode leaf);

    public abstract Mode getMode();

    public abstract void onRssiIndication(RssiIndication leaf);

    public abstract RssiIndication getRssiIndication();

    public abstract void onRadio(Radio container);

    public abstract void onSta(Sta container);

    public abstract void onAp(Ap container);

    public void setup() {
        setupMode(new EnumYangData<>("mode", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:mode", "AP/STA mode of WLAN interface", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_ap_sta_radio", s -> new Enum_ap_sta_radio(s), Enum_ap_sta_radio.enums()));
        setupRssiIndication(new EnumYangData<>("rssi-indication", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:rssi-indication", "Indicate RSSI from current interface by RSSI LEDs", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        radioVisitor = setupRadio(new YangData("radio", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio", null, true, YangDataType.container));
        if (radioVisitor != null) {
            radioVisitor.setup();
        }
        staVisitor = setupSta(new YangData("sta", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:sta", null, true, YangDataType.container));
        if (staVisitor != null) {
            staVisitor.setup();
        }
        apVisitor = setupAp(new YangData("ap", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:ap", null, true, YangDataType.container));
        if (apVisitor != null) {
            apVisitor.setup();
        }
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public Wlan collectConfig() {
        Wlan wlan = new Wlan();
        Mode mode = getMode();
        if (mode != null) {
            wlan.addMode(mode);
        }
        RssiIndication rssiIndication = getRssiIndication();
        if (rssiIndication != null) {
            wlan.addRssiIndication(rssiIndication);
        }
        if (radioVisitor != null) {
            Radio radio = radioVisitor.collectConfig();
            if (radio != null) {
                wlan.addRadio(radio);
            }
        }
        if (staVisitor != null) {
            Sta sta = staVisitor.collectConfig();
            if (sta != null) {
                wlan.addSta(sta);
            }
        }
        if (apVisitor != null) {
            Ap ap = apVisitor.collectConfig();
            if (ap != null) {
                wlan.addAp(ap);
            }
        }
        if (wlan.hasChildren()) {
           return wlan;
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
        
        final Element rssiIndication = nodes.getFirstChild("rssi-indication");
        if (rssiIndication != null) {
            onRssiIndication((RssiIndication)rssiIndication);
        }
        
        final Element radio = nodes.getFirstChild("radio");
        if (radio != null) {
            onRadio((Radio)radio);
            if (radioVisitor != null) {
                if (radio.hasChildren()) {
                    radioVisitor.visit(radio.getChildren());
                }
            }
        }
        
        final Element sta = nodes.getFirstChild("sta");
        if (sta != null) {
            onSta((Sta)sta);
            if (staVisitor != null) {
                if (sta.hasChildren()) {
                    staVisitor.visit(sta.getChildren());
                }
            }
        }
        
        final Element ap = nodes.getFirstChild("ap");
        if (ap != null) {
            onAp((Ap)ap);
            if (apVisitor != null) {
                if (ap.hasChildren()) {
                    apVisitor.visit(ap.getChildren());
                }
            }
        }
    }

}
