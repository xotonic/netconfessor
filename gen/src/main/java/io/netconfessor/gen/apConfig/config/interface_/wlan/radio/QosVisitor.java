
package io.netconfessor.gen.apConfig.config.interface_.wlan.radio;

import io.netconfessor.Element;
import io.netconfessor.EnumYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangData;
import io.netconfessor.YangDataType;
import io.netconfessor.gen.apConfig.Enum_0_1;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.Qos;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.EdcaAp;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.EdcaApVisitor;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.EdcaSta;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.EdcaStaVisitor;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.Enable;

/**
 * Visitor of container qos
 *
 * @author jnc.py
 */
public abstract class QosVisitor {

    public abstract void setupEnable(EnumYangData<Enum_0_1> data);

    private EdcaApVisitor edcaApVisitor;

    public abstract EdcaApVisitor setupEdcaAp(YangData data);

    private EdcaStaVisitor edcaStaVisitor;

    public abstract EdcaStaVisitor setupEdcaSta(YangData data);

    public abstract void onEnable(Enable leaf);

    public abstract Enable getEnable();

    public abstract void onEdcaAp(EdcaAp container);

    public abstract void onEdcaSta(EdcaSta container);

    public void setup() {
        setupEnable(new EnumYangData<>("enable", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:qos/ap-config:enable", "Enable/disable QoS", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        edcaApVisitor = setupEdcaAp(new YangData("edca-ap", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:qos/ap-config:edca-ap", null, true, YangDataType.container));
        if (edcaApVisitor != null) {
            edcaApVisitor.setup();
        }
        edcaStaVisitor = setupEdcaSta(new YangData("edca-sta", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:qos/ap-config:edca-sta", null, true, YangDataType.container));
        if (edcaStaVisitor != null) {
            edcaStaVisitor.setup();
        }
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public Qos collectConfig() {
        Qos qos = new Qos();
        Enable enable = getEnable();
        if (enable != null) {
            qos.addEnable(enable);
        }
        if (edcaApVisitor != null) {
            EdcaAp edcaAp = edcaApVisitor.collectConfig();
            if (edcaAp != null) {
                qos.addEdcaAp(edcaAp);
            }
        }
        if (edcaStaVisitor != null) {
            EdcaSta edcaSta = edcaStaVisitor.collectConfig();
            if (edcaSta != null) {
                qos.addEdcaSta(edcaSta);
            }
        }
        if (qos.hasChildren()) {
           return qos;
        } else {
           return null;
        }
    }

    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element enable = nodes.getFirstChild("enable");
        if (enable != null) {
            onEnable((Enable)enable);
        }
        
        final Element edcaAp = nodes.getFirstChild("edca-ap");
        if (edcaAp != null) {
            onEdcaAp((EdcaAp)edcaAp);
            if (edcaApVisitor != null) {
                if (edcaAp.hasChildren()) {
                    edcaApVisitor.visit(edcaAp.getChildren());
                }
            }
        }
        
        final Element edcaSta = nodes.getFirstChild("edca-sta");
        if (edcaSta != null) {
            onEdcaSta((EdcaSta)edcaSta);
            if (edcaStaVisitor != null) {
                if (edcaSta.hasChildren()) {
                    edcaStaVisitor.visit(edcaSta.getChildren());
                }
            }
        }
    }

}
