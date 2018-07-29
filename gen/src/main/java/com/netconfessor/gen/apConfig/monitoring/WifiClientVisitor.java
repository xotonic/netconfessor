
package com.netconfessor.gen.apConfig.monitoring;

import com.netconfessor.gen.apConfig.monitoring.wifiClient.HwAddr;
import com.netconfessor.gen.apConfig.monitoring.wifiClient.Name;
import com.netconfessor.gen.apConfig.monitoring.wifiClient.Rssi;
import com.netconfessor.gen.apConfig.monitoring.wifiClient.RxBw;
import com.netconfessor.gen.apConfig.monitoring.wifiClient.RxBytes;
import com.netconfessor.gen.apConfig.monitoring.wifiClient.RxPackets;
import com.netconfessor.gen.apConfig.monitoring.wifiClient.RxRate;
import com.netconfessor.gen.apConfig.monitoring.wifiClient.Snr;
import com.netconfessor.gen.apConfig.monitoring.wifiClient.TxBw;
import com.netconfessor.gen.apConfig.monitoring.wifiClient.TxBytes;
import com.netconfessor.gen.apConfig.monitoring.wifiClient.TxPackets;
import com.netconfessor.gen.apConfig.monitoring.wifiClient.TxRate;

import io.netconfessor.Element;
import io.netconfessor.LeafYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangDataType;
import io.netconfessor.YangInt32;
import io.netconfessor.YangString;

/**
 * Visitor of list wifi-client
 *
 * @author jnc.py
 */
public abstract class WifiClientVisitor {

    public abstract void setupName(LeafYangData<YangString> data);

    public abstract void setupHwAddr(LeafYangData<YangString> data);

    public abstract void setupRssi(LeafYangData<YangInt32> data);

    public abstract void setupSnr(LeafYangData<YangInt32> data);

    public abstract void setupTxRate(LeafYangData<YangString> data);

    public abstract void setupRxRate(LeafYangData<YangString> data);

    public abstract void setupTxBw(LeafYangData<YangString> data);

    public abstract void setupRxBw(LeafYangData<YangString> data);

    public abstract void setupTxBytes(LeafYangData<YangInt32> data);

    public abstract void setupRxBytes(LeafYangData<YangInt32> data);

    public abstract void setupTxPackets(LeafYangData<YangInt32> data);

    public abstract void setupRxPackets(LeafYangData<YangInt32> data);

    public abstract void onName(Name leaf);

    public abstract void onHwAddr(HwAddr leaf);

    public abstract void onRssi(Rssi leaf);

    public abstract void onSnr(Snr leaf);

    public abstract void onTxRate(TxRate leaf);

    public abstract void onRxRate(RxRate leaf);

    public abstract void onTxBw(TxBw leaf);

    public abstract void onRxBw(RxBw leaf);

    public abstract void onTxBytes(TxBytes leaf);

    public abstract void onRxBytes(RxBytes leaf);

    public abstract void onTxPackets(TxPackets leaf);

    public abstract void onRxPackets(RxPackets leaf);

    public void setup() {
        setupName(new LeafYangData<>("name", "/ap-config:monitoring/ap-config:wifi-client/ap-config:name", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupHwAddr(new LeafYangData<>("hw-addr", "/ap-config:monitoring/ap-config:wifi-client/ap-config:hw-addr", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupRssi(new LeafYangData<>("rssi", "/ap-config:monitoring/ap-config:wifi-client/ap-config:rssi", null, false, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
        setupSnr(new LeafYangData<>("snr", "/ap-config:monitoring/ap-config:wifi-client/ap-config:snr", null, false, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
        setupTxRate(new LeafYangData<>("tx-rate", "/ap-config:monitoring/ap-config:wifi-client/ap-config:tx-rate", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupRxRate(new LeafYangData<>("rx-rate", "/ap-config:monitoring/ap-config:wifi-client/ap-config:rx-rate", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupTxBw(new LeafYangData<>("tx-bw", "/ap-config:monitoring/ap-config:wifi-client/ap-config:tx-bw", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupRxBw(new LeafYangData<>("rx-bw", "/ap-config:monitoring/ap-config:wifi-client/ap-config:rx-bw", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupTxBytes(new LeafYangData<>("tx-bytes", "/ap-config:monitoring/ap-config:wifi-client/ap-config:tx-bytes", null, false, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
        setupRxBytes(new LeafYangData<>("rx-bytes", "/ap-config:monitoring/ap-config:wifi-client/ap-config:rx-bytes", null, false, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
        setupTxPackets(new LeafYangData<>("tx-packets", "/ap-config:monitoring/ap-config:wifi-client/ap-config:tx-packets", null, false, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
        setupRxPackets(new LeafYangData<>("rx-packets", "/ap-config:monitoring/ap-config:wifi-client/ap-config:rx-packets", null, false, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
    }


    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element name = nodes.getFirstChild("name");
        if (name != null) {
            onName((Name)name);
        }
        
        final Element hwAddr = nodes.getFirstChild("hw-addr");
        if (hwAddr != null) {
            onHwAddr((HwAddr)hwAddr);
        }
        
        final Element rssi = nodes.getFirstChild("rssi");
        if (rssi != null) {
            onRssi((Rssi)rssi);
        }
        
        final Element snr = nodes.getFirstChild("snr");
        if (snr != null) {
            onSnr((Snr)snr);
        }
        
        final Element txRate = nodes.getFirstChild("tx-rate");
        if (txRate != null) {
            onTxRate((TxRate)txRate);
        }
        
        final Element rxRate = nodes.getFirstChild("rx-rate");
        if (rxRate != null) {
            onRxRate((RxRate)rxRate);
        }
        
        final Element txBw = nodes.getFirstChild("tx-bw");
        if (txBw != null) {
            onTxBw((TxBw)txBw);
        }
        
        final Element rxBw = nodes.getFirstChild("rx-bw");
        if (rxBw != null) {
            onRxBw((RxBw)rxBw);
        }
        
        final Element txBytes = nodes.getFirstChild("tx-bytes");
        if (txBytes != null) {
            onTxBytes((TxBytes)txBytes);
        }
        
        final Element rxBytes = nodes.getFirstChild("rx-bytes");
        if (rxBytes != null) {
            onRxBytes((RxBytes)rxBytes);
        }
        
        final Element txPackets = nodes.getFirstChild("tx-packets");
        if (txPackets != null) {
            onTxPackets((TxPackets)txPackets);
        }
        
        final Element rxPackets = nodes.getFirstChild("rx-packets");
        if (rxPackets != null) {
            onRxPackets((RxPackets)rxPackets);
        }
    }

}
