
package io.netconfessor.gen.apConfig.monitoring;

import io.netconfessor.Element;
import io.netconfessor.LeafYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangDataType;
import io.netconfessor.YangString;
import io.netconfessor.gen.apConfig.monitoring.sfp.Current;
import io.netconfessor.gen.apConfig.monitoring.sfp.I2cData;
import io.netconfessor.gen.apConfig.monitoring.sfp.Link;
import io.netconfessor.gen.apConfig.monitoring.sfp.Los;
import io.netconfessor.gen.apConfig.monitoring.sfp.Prx;
import io.netconfessor.gen.apConfig.monitoring.sfp.Ptx;
import io.netconfessor.gen.apConfig.monitoring.sfp.Speed;
import io.netconfessor.gen.apConfig.monitoring.sfp.Status;
import io.netconfessor.gen.apConfig.monitoring.sfp.Temperature;
import io.netconfessor.gen.apConfig.monitoring.sfp.TxFault;
import io.netconfessor.gen.apConfig.monitoring.sfp.Volt;

/**
 * Visitor of container sfp
 *
 * @author jnc.py
 */
public abstract class SfpVisitor {

    public abstract void setupStatus(LeafYangData<YangString> data);

    public abstract void setupLink(LeafYangData<YangString> data);

    public abstract void setupTxFault(LeafYangData<YangString> data);

    public abstract void setupLos(LeafYangData<YangString> data);

    public abstract void setupI2cData(LeafYangData<YangString> data);

    public abstract void setupSpeed(LeafYangData<YangString> data);

    public abstract void setupVolt(LeafYangData<YangString> data);

    public abstract void setupTemperature(LeafYangData<YangString> data);

    public abstract void setupCurrent(LeafYangData<YangString> data);

    public abstract void setupPtx(LeafYangData<YangString> data);

    public abstract void setupPrx(LeafYangData<YangString> data);

    public abstract void onStatus(Status leaf);

    public abstract void onLink(Link leaf);

    public abstract void onTxFault(TxFault leaf);

    public abstract void onLos(Los leaf);

    public abstract void onI2cData(I2cData leaf);

    public abstract void onSpeed(Speed leaf);

    public abstract void onVolt(Volt leaf);

    public abstract void onTemperature(Temperature leaf);

    public abstract void onCurrent(Current leaf);

    public abstract void onPtx(Ptx leaf);

    public abstract void onPrx(Prx leaf);

    public void setup() {
        setupStatus(new LeafYangData<>("status", "/ap-config:monitoring/ap-config:sfp/ap-config:status", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupLink(new LeafYangData<>("link", "/ap-config:monitoring/ap-config:sfp/ap-config:link", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupTxFault(new LeafYangData<>("tx-fault", "/ap-config:monitoring/ap-config:sfp/ap-config:tx-fault", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupLos(new LeafYangData<>("los", "/ap-config:monitoring/ap-config:sfp/ap-config:los", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupI2cData(new LeafYangData<>("i2c-data", "/ap-config:monitoring/ap-config:sfp/ap-config:i2c-data", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupSpeed(new LeafYangData<>("speed", "/ap-config:monitoring/ap-config:sfp/ap-config:speed", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupVolt(new LeafYangData<>("volt", "/ap-config:monitoring/ap-config:sfp/ap-config:volt", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupTemperature(new LeafYangData<>("temperature", "/ap-config:monitoring/ap-config:sfp/ap-config:temperature", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupCurrent(new LeafYangData<>("current", "/ap-config:monitoring/ap-config:sfp/ap-config:current", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupPtx(new LeafYangData<>("ptx", "/ap-config:monitoring/ap-config:sfp/ap-config:ptx", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupPrx(new LeafYangData<>("prx", "/ap-config:monitoring/ap-config:sfp/ap-config:prx", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
    }


    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element status = nodes.getFirstChild("status");
        if (status != null) {
            onStatus((Status)status);
        }
        
        final Element link = nodes.getFirstChild("link");
        if (link != null) {
            onLink((Link)link);
        }
        
        final Element txFault = nodes.getFirstChild("tx-fault");
        if (txFault != null) {
            onTxFault((TxFault)txFault);
        }
        
        final Element los = nodes.getFirstChild("los");
        if (los != null) {
            onLos((Los)los);
        }
        
        final Element i2cData = nodes.getFirstChild("i2c-data");
        if (i2cData != null) {
            onI2cData((I2cData)i2cData);
        }
        
        final Element speed = nodes.getFirstChild("speed");
        if (speed != null) {
            onSpeed((Speed)speed);
        }
        
        final Element volt = nodes.getFirstChild("volt");
        if (volt != null) {
            onVolt((Volt)volt);
        }
        
        final Element temperature = nodes.getFirstChild("temperature");
        if (temperature != null) {
            onTemperature((Temperature)temperature);
        }
        
        final Element current = nodes.getFirstChild("current");
        if (current != null) {
            onCurrent((Current)current);
        }
        
        final Element ptx = nodes.getFirstChild("ptx");
        if (ptx != null) {
            onPtx((Ptx)ptx);
        }
        
        final Element prx = nodes.getFirstChild("prx");
        if (prx != null) {
            onPrx((Prx)prx);
        }
    }

}
