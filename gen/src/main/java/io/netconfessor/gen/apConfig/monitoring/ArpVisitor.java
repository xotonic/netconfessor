
package io.netconfessor.gen.apConfig.monitoring;

import io.netconfessor.Element;
import io.netconfessor.LeafYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangDataType;
import io.netconfessor.YangString;
import io.netconfessor.gen.apConfig.monitoring.arp.Ip;
import io.netconfessor.gen.apConfig.monitoring.arp.Mac;
import io.netconfessor.gen.apConfig.monitoring.arp.Name;

/**
 * Visitor of list arp
 *
 * @author jnc.py
 */
public abstract class ArpVisitor {

    public abstract void setupName(LeafYangData<YangString> data);

    public abstract void setupIp(LeafYangData<YangString> data);

    public abstract void setupMac(LeafYangData<YangString> data);

    public abstract void onName(Name leaf);

    public abstract void onIp(Ip leaf);

    public abstract void onMac(Mac leaf);

    public void setup() {
        setupName(new LeafYangData<>("name", "/ap-config:monitoring/ap-config:arp/ap-config:name", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupIp(new LeafYangData<>("ip", "/ap-config:monitoring/ap-config:arp/ap-config:ip", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupMac(new LeafYangData<>("mac", "/ap-config:monitoring/ap-config:arp/ap-config:mac", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
    }


    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element name = nodes.getFirstChild("name");
        if (name != null) {
            onName((Name)name);
        }
        
        final Element ip = nodes.getFirstChild("ip");
        if (ip != null) {
            onIp((Ip)ip);
        }
        
        final Element mac = nodes.getFirstChild("mac");
        if (mac != null) {
            onMac((Mac)mac);
        }
    }

}
