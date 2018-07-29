
package io.netconfessor.gen.apConfig.config.interface_.vap;

import io.netconfessor.Element;
import io.netconfessor.EnumYangData;
import io.netconfessor.LeafYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangDataType;
import io.netconfessor.YangInt32;
import io.netconfessor.gen.apConfig.Enum_off_pps_kbps;
import io.netconfessor.gen.apConfig.config.interface_.vap.ShaperPerStaTx;
import io.netconfessor.gen.apConfig.config.interface_.vap.shaperPerStaTx.JValue;
import io.netconfessor.gen.apConfig.config.interface_.vap.shaperPerStaTx.Mode;

/**
 * Visitor of container shaper-per-sta-tx
 *
 * @author jnc.py
 */
public abstract class ShaperPerStaTxVisitor {

    public abstract void setupMode(EnumYangData<Enum_off_pps_kbps> data);

    public abstract void setupJValue(LeafYangData<YangInt32> data);

    public abstract void onMode(Mode leaf);

    public abstract Mode getMode();

    public abstract void onJValue(JValue leaf);

    public abstract JValue getJValue();

    public void setup() {
        setupMode(new EnumYangData<>("mode", "/ap-config:config/ap-config:interface/ap-config:vap/ap-config:shaper-per-sta-tx/ap-config:mode", "Shaper work-mode", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_off_pps_kbps", s -> new Enum_off_pps_kbps(s), Enum_off_pps_kbps.enums()));
        setupJValue(new LeafYangData<>("value", "/ap-config:config/ap-config:interface/ap-config:vap/ap-config:shaper-per-sta-tx/ap-config:value", "Shaper value", true, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public ShaperPerStaTx collectConfig() {
        ShaperPerStaTx shaperPerStaTx = new ShaperPerStaTx();
        Mode mode = getMode();
        if (mode != null) {
            shaperPerStaTx.addMode(mode);
        }
        JValue value_ = getJValue();
        if (value_ != null) {
            shaperPerStaTx.addJValue(value_);
        }
        if (shaperPerStaTx.hasChildren()) {
           return shaperPerStaTx;
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
