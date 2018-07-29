
package com.netconfessor.gen.apConfig.monitoring;

import com.netconfessor.gen.apConfig.monitoring.ethernet.Duplex;
import com.netconfessor.gen.apConfig.monitoring.ethernet.Link;
import com.netconfessor.gen.apConfig.monitoring.ethernet.RxBytes;
import com.netconfessor.gen.apConfig.monitoring.ethernet.Speed;
import com.netconfessor.gen.apConfig.monitoring.ethernet.TxBytes;

import io.netconfessor.Element;
import io.netconfessor.LeafYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangDataType;
import io.netconfessor.YangString;

/**
 * Visitor of container ethernet
 *
 * @author jnc.py
 */
public abstract class EthernetVisitor {

    public abstract void setupLink(LeafYangData<YangString> data);

    public abstract void setupSpeed(LeafYangData<YangString> data);

    public abstract void setupDuplex(LeafYangData<YangString> data);

    public abstract void setupTxBytes(LeafYangData<YangString> data);

    public abstract void setupRxBytes(LeafYangData<YangString> data);

    public abstract void onLink(Link leaf);

    public abstract void onSpeed(Speed leaf);

    public abstract void onDuplex(Duplex leaf);

    public abstract void onTxBytes(TxBytes leaf);

    public abstract void onRxBytes(RxBytes leaf);

    public void setup() {
        setupLink(new LeafYangData<>("link", "/ap-config:monitoring/ap-config:ethernet/ap-config:link", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupSpeed(new LeafYangData<>("speed", "/ap-config:monitoring/ap-config:ethernet/ap-config:speed", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupDuplex(new LeafYangData<>("duplex", "/ap-config:monitoring/ap-config:ethernet/ap-config:duplex", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupTxBytes(new LeafYangData<>("tx-bytes", "/ap-config:monitoring/ap-config:ethernet/ap-config:tx-bytes", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupRxBytes(new LeafYangData<>("rx-bytes", "/ap-config:monitoring/ap-config:ethernet/ap-config:rx-bytes", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
    }


    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element link = nodes.getFirstChild("link");
        if (link != null) {
            onLink((Link)link);
        }
        
        final Element speed = nodes.getFirstChild("speed");
        if (speed != null) {
            onSpeed((Speed)speed);
        }
        
        final Element duplex = nodes.getFirstChild("duplex");
        if (duplex != null) {
            onDuplex((Duplex)duplex);
        }
        
        final Element txBytes = nodes.getFirstChild("tx-bytes");
        if (txBytes != null) {
            onTxBytes((TxBytes)txBytes);
        }
        
        final Element rxBytes = nodes.getFirstChild("rx-bytes");
        if (rxBytes != null) {
            onRxBytes((RxBytes)rxBytes);
        }
    }

}
