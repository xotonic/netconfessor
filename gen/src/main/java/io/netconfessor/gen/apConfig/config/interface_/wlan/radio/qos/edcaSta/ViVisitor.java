
package io.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.edcaSta;

import io.netconfessor.Element;
import io.netconfessor.EnumYangData;
import io.netconfessor.LeafYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangDataType;
import io.netconfessor.YangInt32;
import io.netconfessor.gen.apConfig.Enum_1_3_7_15_31_63_127_255_511_1023;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.edcaSta.Vi;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.edcaSta.vi.Acm;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.edcaSta.vi.Aifs;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.edcaSta.vi.Cwmax;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.edcaSta.vi.Cwmin;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.edcaSta.vi.Txop;

/**
 * Visitor of container vi
 *
 * @author jnc.py
 */
public abstract class ViVisitor {

    public abstract void setupAcm(LeafYangData<YangInt32> data);

    public abstract void setupAifs(LeafYangData<YangInt32> data);

    public abstract void setupCwmin(EnumYangData<Enum_1_3_7_15_31_63_127_255_511_1023> data);

    public abstract void setupCwmax(EnumYangData<Enum_1_3_7_15_31_63_127_255_511_1023> data);

    public abstract void setupTxop(LeafYangData<YangInt32> data);

    public abstract void onAcm(Acm leaf);

    public abstract Acm getAcm();

    public abstract void onAifs(Aifs leaf);

    public abstract Aifs getAifs();

    public abstract void onCwmin(Cwmin leaf);

    public abstract Cwmin getCwmin();

    public abstract void onCwmax(Cwmax leaf);

    public abstract Cwmax getCwmax();

    public abstract void onTxop(Txop leaf);

    public abstract Txop getTxop();

    public void setup() {
        setupAcm(new LeafYangData<>("acm", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:qos/ap-config:edca-sta/ap-config:vi/ap-config:acm", "Admission Control Mandatory", true, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
        setupAifs(new LeafYangData<>("aifs", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:qos/ap-config:edca-sta/ap-config:vi/ap-config:aifs", "Arbitration inter-frame space", true, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
        setupCwmin(new EnumYangData<>("cwmin", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:qos/ap-config:edca-sta/ap-config:vi/ap-config:cwmin", "Contention window minimum", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_1_3_7_15_31_63_127_255_511_1023", s -> new Enum_1_3_7_15_31_63_127_255_511_1023(s), Enum_1_3_7_15_31_63_127_255_511_1023.enums()));
        setupCwmax(new EnumYangData<>("cwmax", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:qos/ap-config:edca-sta/ap-config:vi/ap-config:cwmax", "Contention window maximum", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_1_3_7_15_31_63_127_255_511_1023", s -> new Enum_1_3_7_15_31_63_127_255_511_1023(s), Enum_1_3_7_15_31_63_127_255_511_1023.enums()));
        setupTxop(new LeafYangData<>("txop", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:qos/ap-config:edca-sta/ap-config:vi/ap-config:txop", "Transmit Opportunity", true, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public Vi collectConfig() {
        Vi vi = new Vi();
        Acm acm = getAcm();
        if (acm != null) {
            vi.addAcm(acm);
        }
        Aifs aifs = getAifs();
        if (aifs != null) {
            vi.addAifs(aifs);
        }
        Cwmin cwmin = getCwmin();
        if (cwmin != null) {
            vi.addCwmin(cwmin);
        }
        Cwmax cwmax = getCwmax();
        if (cwmax != null) {
            vi.addCwmax(cwmax);
        }
        Txop txop = getTxop();
        if (txop != null) {
            vi.addTxop(txop);
        }
        if (vi.hasChildren()) {
           return vi;
        } else {
           return null;
        }
    }

    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element acm = nodes.getFirstChild("acm");
        if (acm != null) {
            onAcm((Acm)acm);
        }
        
        final Element aifs = nodes.getFirstChild("aifs");
        if (aifs != null) {
            onAifs((Aifs)aifs);
        }
        
        final Element cwmin = nodes.getFirstChild("cwmin");
        if (cwmin != null) {
            onCwmin((Cwmin)cwmin);
        }
        
        final Element cwmax = nodes.getFirstChild("cwmax");
        if (cwmax != null) {
            onCwmax((Cwmax)cwmax);
        }
        
        final Element txop = nodes.getFirstChild("txop");
        if (txop != null) {
            onTxop((Txop)txop);
        }
    }

}