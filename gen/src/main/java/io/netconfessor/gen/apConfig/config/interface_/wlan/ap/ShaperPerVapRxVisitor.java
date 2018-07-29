
package io.netconfessor.gen.apConfig.config.interface_.wlan.ap;

import io.netconfessor.Element;
import io.netconfessor.EnumYangData;
import io.netconfessor.LeafYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangDataType;
import io.netconfessor.YangInt32;
import io.netconfessor.gen.apConfig.Enum_off_pps_kbps;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.ShaperPerVapRx;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.shaperPerVapRx.JValue;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.shaperPerVapRx.Mode;

/**
 * Visitor of container shaper-per-vap-rx
 *
 * @author jnc.py
 */
public abstract class ShaperPerVapRxVisitor {

    public abstract void setupMode(EnumYangData<Enum_off_pps_kbps> data);

    public abstract void setupJValue(LeafYangData<YangInt32> data);

    public abstract void onMode(Mode leaf);

    public abstract Mode getMode();

    public abstract void onJValue(JValue leaf);

    public abstract JValue getJValue();

    public void setup() {
        setupMode(new EnumYangData<>("mode", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:ap/ap-config:shaper-per-vap-rx/ap-config:mode", "Shaper work-mode", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_off_pps_kbps", s -> new Enum_off_pps_kbps(s), Enum_off_pps_kbps.enums()));
        setupJValue(new LeafYangData<>("value", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:ap/ap-config:shaper-per-vap-rx/ap-config:value", "Shaper value", true, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public ShaperPerVapRx collectConfig() {
        ShaperPerVapRx shaperPerVapRx = new ShaperPerVapRx();
        Mode mode = getMode();
        if (mode != null) {
            shaperPerVapRx.addMode(mode);
        }
        JValue value_ = getJValue();
        if (value_ != null) {
            shaperPerVapRx.addJValue(value_);
        }
        if (shaperPerVapRx.hasChildren()) {
           return shaperPerVapRx;
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
        
        final Element value_ = nodes.getFirstChild("value");
        if (value_ != null) {
            onJValue((JValue)value_);
        }
    }

}
