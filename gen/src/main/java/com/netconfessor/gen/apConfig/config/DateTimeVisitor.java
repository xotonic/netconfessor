
package com.netconfessor.gen.apConfig.config;

import com.netconfessor.gen.apConfig.Enum_manual_ntp;
import com.netconfessor.gen.apConfig.config.DateTime;
import com.netconfessor.gen.apConfig.config.dateTime.Common;
import com.netconfessor.gen.apConfig.config.dateTime.CommonVisitor;
import com.netconfessor.gen.apConfig.config.dateTime.Manual;
import com.netconfessor.gen.apConfig.config.dateTime.ManualVisitor;
import com.netconfessor.gen.apConfig.config.dateTime.Mode;
import com.netconfessor.gen.apConfig.config.dateTime.Ntp;
import com.netconfessor.gen.apConfig.config.dateTime.NtpVisitor;

import io.netconfessor.Element;
import io.netconfessor.EnumYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangData;
import io.netconfessor.YangDataType;

/**
 * Visitor of container date-time
 *
 * @author jnc.py
 */
public abstract class DateTimeVisitor {

    public abstract void setupMode(EnumYangData<Enum_manual_ntp> data);

    private CommonVisitor commonVisitor;

    public abstract CommonVisitor setupCommon(YangData data);

    private ManualVisitor manualVisitor;

    public abstract ManualVisitor setupManual(YangData data);

    private NtpVisitor ntpVisitor;

    public abstract NtpVisitor setupNtp(YangData data);

    public abstract void onMode(Mode leaf);

    public abstract Mode getMode();

    public abstract void onCommon(Common container);

    public abstract void onManual(Manual container);

    public abstract void onNtp(Ntp container);

    public void setup() {
        setupMode(new EnumYangData<>("mode", "/ap-config:config/ap-config:date-time/ap-config:mode", "Setup date-time mode", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_manual_ntp", s -> new Enum_manual_ntp(s), Enum_manual_ntp.enums()));
        commonVisitor = setupCommon(new YangData("common", "/ap-config:config/ap-config:date-time/ap-config:common", null, true, YangDataType.container));
        if (commonVisitor != null) {
            commonVisitor.setup();
        }
        manualVisitor = setupManual(new YangData("manual", "/ap-config:config/ap-config:date-time/ap-config:manual", null, true, YangDataType.container));
        if (manualVisitor != null) {
            manualVisitor.setup();
        }
        ntpVisitor = setupNtp(new YangData("ntp", "/ap-config:config/ap-config:date-time/ap-config:ntp", null, true, YangDataType.container));
        if (ntpVisitor != null) {
            ntpVisitor.setup();
        }
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public DateTime collectConfig() {
        DateTime dateTime = new DateTime();
        Mode mode = getMode();
        if (mode != null) {
            dateTime.addMode(mode);
        }
        if (commonVisitor != null) {
            Common common = commonVisitor.collectConfig();
            if (common != null) {
                dateTime.addCommon(common);
            }
        }
        if (manualVisitor != null) {
            Manual manual = manualVisitor.collectConfig();
            if (manual != null) {
                dateTime.addManual(manual);
            }
        }
        if (ntpVisitor != null) {
            Ntp ntp = ntpVisitor.collectConfig();
            if (ntp != null) {
                dateTime.addNtp(ntp);
            }
        }
        if (dateTime.hasChildren()) {
           return dateTime;
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
        
        final Element common = nodes.getFirstChild("common");
        if (common != null) {
            onCommon((Common)common);
            if (commonVisitor != null) {
                if (common.hasChildren()) {
                    commonVisitor.visit(common.getChildren());
                }
            }
        }
        
        final Element manual = nodes.getFirstChild("manual");
        if (manual != null) {
            onManual((Manual)manual);
            if (manualVisitor != null) {
                if (manual.hasChildren()) {
                    manualVisitor.visit(manual.getChildren());
                }
            }
        }
        
        final Element ntp = nodes.getFirstChild("ntp");
        if (ntp != null) {
            onNtp((Ntp)ntp);
            if (ntpVisitor != null) {
                if (ntp.hasChildren()) {
                    ntpVisitor.visit(ntp.getChildren());
                }
            }
        }
    }

}
