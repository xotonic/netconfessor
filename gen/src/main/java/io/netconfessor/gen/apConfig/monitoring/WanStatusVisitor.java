
package io.netconfessor.gen.apConfig.monitoring;

import io.netconfessor.Element;
import io.netconfessor.LeafYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangDataType;
import io.netconfessor.YangString;
import io.netconfessor.gen.apConfig.monitoring.wanStatus.IpAddress;
import io.netconfessor.gen.apConfig.monitoring.wanStatus.JInterface;
import io.netconfessor.gen.apConfig.monitoring.wanStatus.Protocol;
import io.netconfessor.gen.apConfig.monitoring.wanStatus.RxBytes;
import io.netconfessor.gen.apConfig.monitoring.wanStatus.TxBytes;

/**
 * Visitor of container wan-status
 *
 * @author jnc.py
 */
public abstract class WanStatusVisitor {

    public abstract void setupJInterface(LeafYangData<YangString> data);

    public abstract void setupProtocol(LeafYangData<YangString> data);

    public abstract void setupIpAddress(LeafYangData<YangString> data);

    public abstract void setupTxBytes(LeafYangData<YangString> data);

    public abstract void setupRxBytes(LeafYangData<YangString> data);

    public abstract void onJInterface(JInterface leaf);

    public abstract void onProtocol(Protocol leaf);

    public abstract void onIpAddress(IpAddress leaf);

    public abstract void onTxBytes(TxBytes leaf);

    public abstract void onRxBytes(RxBytes leaf);

    public void setup() {
        setupJInterface(new LeafYangData<>("interface", "/ap-config:monitoring/ap-config:wan-status/ap-config:interface", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupProtocol(new LeafYangData<>("protocol", "/ap-config:monitoring/ap-config:wan-status/ap-config:protocol", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupIpAddress(new LeafYangData<>("ip-address", "/ap-config:monitoring/ap-config:wan-status/ap-config:ip-address", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupTxBytes(new LeafYangData<>("tx-bytes", "/ap-config:monitoring/ap-config:wan-status/ap-config:tx-bytes", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupRxBytes(new LeafYangData<>("rx-bytes", "/ap-config:monitoring/ap-config:wan-status/ap-config:rx-bytes", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
    }


    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element interface_ = nodes.getFirstChild("interface");
        if (interface_ != null) {
            onJInterface((JInterface)interface_);
        }
        
        final Element protocol = nodes.getFirstChild("protocol");
        if (protocol != null) {
            onProtocol((Protocol)protocol);
        }
        
        final Element ipAddress = nodes.getFirstChild("ip-address");
        if (ipAddress != null) {
            onIpAddress((IpAddress)ipAddress);
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
