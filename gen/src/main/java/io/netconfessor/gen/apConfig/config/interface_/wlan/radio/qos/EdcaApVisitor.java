
package io.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos;

import io.netconfessor.Element;
import io.netconfessor.NodeSet;
import io.netconfessor.YangData;
import io.netconfessor.YangDataType;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.EdcaAp;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.edcaAp.Be;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.edcaAp.BeVisitor;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.edcaAp.Bk;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.edcaAp.BkVisitor;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.edcaAp.Vi;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.edcaAp.ViVisitor;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.edcaAp.Vo;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.edcaAp.VoVisitor;

/**
 * Visitor of container edca-ap
 *
 * @author jnc.py
 */
public abstract class EdcaApVisitor {

    private BkVisitor bkVisitor;

    public abstract BkVisitor setupBk(YangData data);

    private BeVisitor beVisitor;

    public abstract BeVisitor setupBe(YangData data);

    private ViVisitor viVisitor;

    public abstract ViVisitor setupVi(YangData data);

    private VoVisitor voVisitor;

    public abstract VoVisitor setupVo(YangData data);

    public abstract void onBk(Bk container);

    public abstract void onBe(Be container);

    public abstract void onVi(Vi container);

    public abstract void onVo(Vo container);

    public void setup() {
        bkVisitor = setupBk(new YangData("bk", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:qos/ap-config:edca-ap/ap-config:bk", null, true, YangDataType.container));
        if (bkVisitor != null) {
            bkVisitor.setup();
        }
        beVisitor = setupBe(new YangData("be", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:qos/ap-config:edca-ap/ap-config:be", null, true, YangDataType.container));
        if (beVisitor != null) {
            beVisitor.setup();
        }
        viVisitor = setupVi(new YangData("vi", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:qos/ap-config:edca-ap/ap-config:vi", null, true, YangDataType.container));
        if (viVisitor != null) {
            viVisitor.setup();
        }
        voVisitor = setupVo(new YangData("vo", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:qos/ap-config:edca-ap/ap-config:vo", null, true, YangDataType.container));
        if (voVisitor != null) {
            voVisitor.setup();
        }
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public EdcaAp collectConfig() {
        EdcaAp edcaAp = new EdcaAp();
        if (bkVisitor != null) {
            Bk bk = bkVisitor.collectConfig();
            if (bk != null) {
                edcaAp.addBk(bk);
            }
        }
        if (beVisitor != null) {
            Be be = beVisitor.collectConfig();
            if (be != null) {
                edcaAp.addBe(be);
            }
        }
        if (viVisitor != null) {
            Vi vi = viVisitor.collectConfig();
            if (vi != null) {
                edcaAp.addVi(vi);
            }
        }
        if (voVisitor != null) {
            Vo vo = voVisitor.collectConfig();
            if (vo != null) {
                edcaAp.addVo(vo);
            }
        }
        if (edcaAp.hasChildren()) {
           return edcaAp;
        } else {
           return null;
        }
    }

    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element bk = nodes.getFirstChild("bk");
        if (bk != null) {
            onBk((Bk)bk);
            if (bkVisitor != null) {
                if (bk.hasChildren()) {
                    bkVisitor.visit(bk.getChildren());
                }
            }
        }
        
        final Element be = nodes.getFirstChild("be");
        if (be != null) {
            onBe((Be)be);
            if (beVisitor != null) {
                if (be.hasChildren()) {
                    beVisitor.visit(be.getChildren());
                }
            }
        }
        
        final Element vi = nodes.getFirstChild("vi");
        if (vi != null) {
            onVi((Vi)vi);
            if (viVisitor != null) {
                if (vi.hasChildren()) {
                    viVisitor.visit(vi.getChildren());
                }
            }
        }
        
        final Element vo = nodes.getFirstChild("vo");
        if (vo != null) {
            onVo((Vo)vo);
            if (voVisitor != null) {
                if (vo.hasChildren()) {
                    voVisitor.visit(vo.getChildren());
                }
            }
        }
    }

}
