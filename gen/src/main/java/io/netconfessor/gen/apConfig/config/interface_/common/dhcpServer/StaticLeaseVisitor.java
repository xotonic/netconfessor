
package io.netconfessor.gen.apConfig.config.interface_.common.dhcpServer;

import io.netconfessor.Element;
import io.netconfessor.LeafYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangDataType;
import io.netconfessor.YangString;
import io.netconfessor.gen.apConfig.config.interface_.common.dhcpServer.StaticLease;
import io.netconfessor.gen.apConfig.config.interface_.common.dhcpServer.staticLease.IpAddress;
import io.netconfessor.gen.apConfig.config.interface_.common.dhcpServer.staticLease.Name;

/**
 * Visitor of list static-lease
 *
 * @author jnc.py
 */
public abstract class StaticLeaseVisitor {

    public abstract void setupName(LeafYangData<YangString> data);

    public abstract void setupIpAddress(LeafYangData<io.netconfessor.gen.ietfInetTypes.IpAddress> data);

    public abstract void onName(Name leaf);

    public abstract Name getName();

    public abstract void onIpAddress(IpAddress leaf);

    public abstract IpAddress getIpAddress();

    public void setup() {
        setupName(new LeafYangData<>("name", "/ap-config:config/ap-config:interface/ap-config:common/ap-config:dhcp-server/ap-config:static-lease/ap-config:name", null, true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupIpAddress(new LeafYangData<>("ip-address", "/ap-config:config/ap-config:interface/ap-config:common/ap-config:dhcp-server/ap-config:static-lease/ap-config:ip-address", null, true, YangDataType.leaf, "io.netconfessor.gen.ietfInetTypes.IpAddress", s -> new io.netconfessor.gen.ietfInetTypes.IpAddress(s)));
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public StaticLease collectConfig(StaticLease staticLease) {
        if (staticLease == null) {
            return null;
        }
        Name name = getName();
        if (name != null) {
            staticLease.addName(name);
        }
        IpAddress ipAddress = getIpAddress();
        if (ipAddress != null) {
            staticLease.addIpAddress(ipAddress);
        }
        if (staticLease.hasChildren()) {
           return staticLease;
        } else {
           return null;
        }
    }

    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element name = nodes.getFirstChild("name");
        if (name != null) {
            onName((Name)name);
        }
        
        final Element ipAddress = nodes.getFirstChild("ip-address");
        if (ipAddress != null) {
            onIpAddress((IpAddress)ipAddress);
        }
    }

}
