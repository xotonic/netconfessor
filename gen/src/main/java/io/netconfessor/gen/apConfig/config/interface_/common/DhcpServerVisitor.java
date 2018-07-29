
package io.netconfessor.gen.apConfig.config.interface_.common;

import io.netconfessor.Element;
import io.netconfessor.EnumYangData;
import io.netconfessor.LeafYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangData;
import io.netconfessor.YangDataType;
import io.netconfessor.YangInt32;
import io.netconfessor.gen.apConfig.Enum_0_1;
import io.netconfessor.gen.apConfig.config.interface_.common.DhcpServer;
import io.netconfessor.gen.apConfig.config.interface_.common.dhcpServer.Dns;
import io.netconfessor.gen.apConfig.config.interface_.common.dhcpServer.Enable;
import io.netconfessor.gen.apConfig.config.interface_.common.dhcpServer.EndIp;
import io.netconfessor.gen.apConfig.config.interface_.common.dhcpServer.LeaseTime;
import io.netconfessor.gen.apConfig.config.interface_.common.dhcpServer.Netmask;
import io.netconfessor.gen.apConfig.config.interface_.common.dhcpServer.Router;
import io.netconfessor.gen.apConfig.config.interface_.common.dhcpServer.StartIp;
import io.netconfessor.gen.apConfig.config.interface_.common.dhcpServer.StaticLease;
import io.netconfessor.gen.apConfig.config.interface_.common.dhcpServer.StaticLeaseVisitor;
import io.netconfessor.gen.ietfInetTypes.IpAddress;

/**
 * Visitor of container dhcp-server
 *
 * @author jnc.py
 */
public abstract class DhcpServerVisitor {

    public abstract void setupEnable(EnumYangData<Enum_0_1> data);

    public abstract void setupStartIp(LeafYangData<IpAddress> data);

    public abstract void setupEndIp(LeafYangData<IpAddress> data);

    public abstract void setupNetmask(LeafYangData<IpAddress> data);

    public abstract void setupDns(LeafYangData<IpAddress> data);

    public abstract void setupRouter(LeafYangData<IpAddress> data);

    public abstract void setupLeaseTime(LeafYangData<YangInt32> data);

    public abstract StaticLeaseVisitor setupStaticLease(YangData data);

    private StaticLeaseVisitor staticLeaseVisitor;

    public abstract void onEnable(Enable leaf);

    public abstract Enable getEnable();

    public abstract void onStartIp(StartIp leaf);

    public abstract StartIp getStartIp();

    public abstract void onEndIp(EndIp leaf);

    public abstract EndIp getEndIp();

    public abstract void onNetmask(Netmask leaf);

    public abstract Netmask getNetmask();

    public abstract void onDns(Dns leaf);

    public abstract Dns getDns();

    public abstract void onRouter(Router leaf);

    public abstract Router getRouter();

    public abstract void onLeaseTime(LeaseTime leaf);

    public abstract LeaseTime getLeaseTime();

    public abstract void onNextStaticLease(StaticLease item);

    protected void onStartStaticLeaseList() {
    }

    protected void onStopStaticLeaseList() {
    }

    abstract protected StaticLease getNextStaticLease();

    public void setup() {
        setupEnable(new EnumYangData<>("enable", "/ap-config:config/ap-config:interface/ap-config:common/ap-config:dhcp-server/ap-config:enable", "enable DHCP server on current interface", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupStartIp(new LeafYangData<>("start-ip", "/ap-config:config/ap-config:interface/ap-config:common/ap-config:dhcp-server/ap-config:start-ip", null, true, YangDataType.leaf, "io.netconfessor.gen.ietfInetTypes.IpAddress", s -> new IpAddress(s)));
        setupEndIp(new LeafYangData<>("end-ip", "/ap-config:config/ap-config:interface/ap-config:common/ap-config:dhcp-server/ap-config:end-ip", null, true, YangDataType.leaf, "io.netconfessor.gen.ietfInetTypes.IpAddress", s -> new IpAddress(s)));
        setupNetmask(new LeafYangData<>("netmask", "/ap-config:config/ap-config:interface/ap-config:common/ap-config:dhcp-server/ap-config:netmask", null, true, YangDataType.leaf, "io.netconfessor.gen.ietfInetTypes.IpAddress", s -> new IpAddress(s)));
        setupDns(new LeafYangData<>("dns", "/ap-config:config/ap-config:interface/ap-config:common/ap-config:dhcp-server/ap-config:dns", null, true, YangDataType.leaf, "io.netconfessor.gen.ietfInetTypes.IpAddress", s -> new IpAddress(s)));
        setupRouter(new LeafYangData<>("router", "/ap-config:config/ap-config:interface/ap-config:common/ap-config:dhcp-server/ap-config:router", null, true, YangDataType.leaf, "io.netconfessor.gen.ietfInetTypes.IpAddress", s -> new IpAddress(s)));
        setupLeaseTime(new LeafYangData<>("lease-time", "/ap-config:config/ap-config:interface/ap-config:common/ap-config:dhcp-server/ap-config:lease-time", null, true, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
        staticLeaseVisitor = setupStaticLease(new YangData("static-lease", "/ap-config:config/ap-config:interface/ap-config:common/ap-config:dhcp-server/ap-config:static-lease", null, true, YangDataType.list));
        if (staticLeaseVisitor != null) {
            staticLeaseVisitor.setup();
        }
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public DhcpServer collectConfig() {
        DhcpServer dhcpServer = new DhcpServer();
        Enable enable = getEnable();
        if (enable != null) {
            dhcpServer.addEnable(enable);
        }
        StartIp startIp = getStartIp();
        if (startIp != null) {
            dhcpServer.addStartIp(startIp);
        }
        EndIp endIp = getEndIp();
        if (endIp != null) {
            dhcpServer.addEndIp(endIp);
        }
        Netmask netmask = getNetmask();
        if (netmask != null) {
            dhcpServer.addNetmask(netmask);
        }
        Dns dns = getDns();
        if (dns != null) {
            dhcpServer.addDns(dns);
        }
        Router router = getRouter();
        if (router != null) {
            dhcpServer.addRouter(router);
        }
        LeaseTime leaseTime = getLeaseTime();
        if (leaseTime != null) {
            dhcpServer.addLeaseTime(leaseTime);
        }
        StaticLease staticLease;
        while((staticLease = getNextStaticLease()) != null) {
            staticLease.removeNonKeysIfMarkedToDelete();
            dhcpServer.addStaticLease(staticLease);
        }
        if (dhcpServer.hasChildren()) {
           return dhcpServer;
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
        
        final Element startIp = nodes.getFirstChild("start-ip");
        if (startIp != null) {
            onStartIp((StartIp)startIp);
        }
        
        final Element endIp = nodes.getFirstChild("end-ip");
        if (endIp != null) {
            onEndIp((EndIp)endIp);
        }
        
        final Element netmask = nodes.getFirstChild("netmask");
        if (netmask != null) {
            onNetmask((Netmask)netmask);
        }
        
        final Element dns = nodes.getFirstChild("dns");
        if (dns != null) {
            onDns((Dns)dns);
        }
        
        final Element router = nodes.getFirstChild("router");
        if (router != null) {
            onRouter((Router)router);
        }
        
        final Element leaseTime = nodes.getFirstChild("lease-time");
        if (leaseTime != null) {
            onLeaseTime((LeaseTime)leaseTime);
        }
        
        onStartStaticLeaseList();
        for (Element node : nodes.getChildren("static-lease")) {
            onNextStaticLease((StaticLease)node);
            if (staticLeaseVisitor != null) {
                if (node.hasChildren()) {
                    staticLeaseVisitor.visit(node.getChildren());
                }
            }
        }
        onStopStaticLeaseList();
    }

}
