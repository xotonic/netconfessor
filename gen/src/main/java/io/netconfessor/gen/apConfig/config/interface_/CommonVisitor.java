
package io.netconfessor.gen.apConfig.config.interface_;

import io.netconfessor.Element;
import io.netconfessor.EnumYangData;
import io.netconfessor.LeafYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangData;
import io.netconfessor.YangDataType;
import io.netconfessor.YangInt32;
import io.netconfessor.YangString;
import io.netconfessor.gen.apConfig.Enum_0_1;
import io.netconfessor.gen.apConfig.Enum_eth_vlan_wlan_bridge_vap_gre;
import io.netconfessor.gen.apConfig.Enum_staticIp_dhcp;
import io.netconfessor.gen.apConfig.config.interface_.Common;
import io.netconfessor.gen.apConfig.config.interface_.common.AccessRules;
import io.netconfessor.gen.apConfig.config.interface_.common.AccessRulesVisitor;
import io.netconfessor.gen.apConfig.config.interface_.common.DhcpServer;
import io.netconfessor.gen.apConfig.config.interface_.common.DhcpServerVisitor;
import io.netconfessor.gen.apConfig.config.interface_.common.DisableBroadcastDhcp;
import io.netconfessor.gen.apConfig.config.interface_.common.DnsServer1;
import io.netconfessor.gen.apConfig.config.interface_.common.DnsServer2;
import io.netconfessor.gen.apConfig.config.interface_.common.Enabled;
import io.netconfessor.gen.apConfig.config.interface_.common.MacAddr;
import io.netconfessor.gen.apConfig.config.interface_.common.Masquerade;
import io.netconfessor.gen.apConfig.config.interface_.common.Netmask;
import io.netconfessor.gen.apConfig.config.interface_.common.Protocol;
import io.netconfessor.gen.apConfig.config.interface_.common.RouteTable;
import io.netconfessor.gen.apConfig.config.interface_.common.StaticIp;
import io.netconfessor.gen.apConfig.config.interface_.common.Type;
import io.netconfessor.gen.apConfig.config.interface_.common.Wan;
import io.netconfessor.gen.ietfInetTypes.IpAddress;

/**
 * Visitor of container common
 *
 * @author jnc.py
 */
public abstract class CommonVisitor {

    public abstract void setupType(EnumYangData<Enum_eth_vlan_wlan_bridge_vap_gre> data);

    public abstract void setupRouteTable(LeafYangData<YangInt32> data);

    public abstract void setupMacAddr(LeafYangData<YangString> data);

    public abstract void setupEnabled(EnumYangData<Enum_0_1> data);

    public abstract void setupWan(EnumYangData<Enum_0_1> data);

    public abstract void setupMasquerade(EnumYangData<Enum_0_1> data);

    public abstract void setupProtocol(EnumYangData<Enum_staticIp_dhcp> data);

    public abstract void setupDisableBroadcastDhcp(EnumYangData<Enum_0_1> data);

    public abstract void setupStaticIp(LeafYangData<IpAddress> data);

    public abstract void setupNetmask(LeafYangData<IpAddress> data);

    public abstract void setupDnsServer1(LeafYangData<IpAddress> data);

    public abstract void setupDnsServer2(LeafYangData<IpAddress> data);

    private DhcpServerVisitor dhcpServerVisitor;

    public abstract DhcpServerVisitor setupDhcpServer(YangData data);

    private AccessRulesVisitor accessRulesVisitor;

    public abstract AccessRulesVisitor setupAccessRules(YangData data);

    public abstract void onType(Type leaf);

    public abstract Type getType();

    public abstract void onRouteTable(RouteTable leaf);

    public abstract RouteTable getRouteTable();

    public abstract void onMacAddr(MacAddr leaf);

    public abstract MacAddr getMacAddr();

    public abstract void onEnabled(Enabled leaf);

    public abstract Enabled getEnabled();

    public abstract void onWan(Wan leaf);

    public abstract Wan getWan();

    public abstract void onMasquerade(Masquerade leaf);

    public abstract Masquerade getMasquerade();

    public abstract void onProtocol(Protocol leaf);

    public abstract Protocol getProtocol();

    public abstract void onDisableBroadcastDhcp(DisableBroadcastDhcp leaf);

    public abstract DisableBroadcastDhcp getDisableBroadcastDhcp();

    public abstract void onStaticIp(StaticIp leaf);

    public abstract StaticIp getStaticIp();

    public abstract void onNetmask(Netmask leaf);

    public abstract Netmask getNetmask();

    public abstract void onDnsServer1(DnsServer1 leaf);

    public abstract DnsServer1 getDnsServer1();

    public abstract void onDnsServer2(DnsServer2 leaf);

    public abstract DnsServer2 getDnsServer2();

    public abstract void onDhcpServer(DhcpServer container);

    public abstract void onAccessRules(AccessRules container);

    public void setup() {
        setupType(new EnumYangData<>("type", "/ap-config:config/ap-config:interface/ap-config:common/ap-config:type", "Interface type", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_eth_vlan_wlan_bridge_vap_gre", s -> new Enum_eth_vlan_wlan_bridge_vap_gre(s), Enum_eth_vlan_wlan_bridge_vap_gre.enums()));
        setupRouteTable(new LeafYangData<>("route-table", "/ap-config:config/ap-config:interface/ap-config:common/ap-config:route-table", null, true, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
        setupMacAddr(new LeafYangData<>("mac-addr", "/ap-config:config/ap-config:interface/ap-config:common/ap-config:mac-addr", null, true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupEnabled(new EnumYangData<>("enabled", "/ap-config:config/ap-config:interface/ap-config:common/ap-config:enabled", "Enable interface", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupWan(new EnumYangData<>("wan", "/ap-config:config/ap-config:interface/ap-config:common/ap-config:wan", "WAN mode on interface", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupMasquerade(new EnumYangData<>("masquerade", "/ap-config:config/ap-config:interface/ap-config:common/ap-config:masquerade", "enable masquerading on interface", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupProtocol(new EnumYangData<>("protocol", "/ap-config:config/ap-config:interface/ap-config:common/ap-config:protocol", "Setup protocol for configuring IP params", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_staticIp_dhcp", s -> new Enum_staticIp_dhcp(s), Enum_staticIp_dhcp.enums()));
        setupDisableBroadcastDhcp(new EnumYangData<>("disable-broadcast-dhcp", "/ap-config:config/ap-config:interface/ap-config:common/ap-config:disable-broadcast-dhcp", "Request unicast replies for DHCP", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupStaticIp(new LeafYangData<>("static-ip", "/ap-config:config/ap-config:interface/ap-config:common/ap-config:static-ip", "Static IP address", true, YangDataType.leaf, "io.netconfessor.gen.ietfInetTypes.IpAddress", s -> new IpAddress(s)));
        setupNetmask(new LeafYangData<>("netmask", "/ap-config:config/ap-config:interface/ap-config:common/ap-config:netmask", "Netmask for static IP mode", true, YangDataType.leaf, "io.netconfessor.gen.ietfInetTypes.IpAddress", s -> new IpAddress(s)));
        setupDnsServer1(new LeafYangData<>("dns-server-1", "/ap-config:config/ap-config:interface/ap-config:common/ap-config:dns-server-1", "DNS server IP address", true, YangDataType.leaf, "io.netconfessor.gen.ietfInetTypes.IpAddress", s -> new IpAddress(s)));
        setupDnsServer2(new LeafYangData<>("dns-server-2", "/ap-config:config/ap-config:interface/ap-config:common/ap-config:dns-server-2", "DNS server IP address", true, YangDataType.leaf, "io.netconfessor.gen.ietfInetTypes.IpAddress", s -> new IpAddress(s)));
        dhcpServerVisitor = setupDhcpServer(new YangData("dhcp-server", "/ap-config:config/ap-config:interface/ap-config:common/ap-config:dhcp-server", null, true, YangDataType.container));
        if (dhcpServerVisitor != null) {
            dhcpServerVisitor.setup();
        }
        accessRulesVisitor = setupAccessRules(new YangData("access-rules", "/ap-config:config/ap-config:interface/ap-config:common/ap-config:access-rules", null, true, YangDataType.container));
        if (accessRulesVisitor != null) {
            accessRulesVisitor.setup();
        }
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public Common collectConfig() {
        Common common = new Common();
        Type type = getType();
        if (type != null) {
            common.addType(type);
        }
        RouteTable routeTable = getRouteTable();
        if (routeTable != null) {
            common.addRouteTable(routeTable);
        }
        MacAddr macAddr = getMacAddr();
        if (macAddr != null) {
            common.addMacAddr(macAddr);
        }
        Enabled enabled = getEnabled();
        if (enabled != null) {
            common.addEnabled(enabled);
        }
        Wan wan = getWan();
        if (wan != null) {
            common.addWan(wan);
        }
        Masquerade masquerade = getMasquerade();
        if (masquerade != null) {
            common.addMasquerade(masquerade);
        }
        Protocol protocol = getProtocol();
        if (protocol != null) {
            common.addProtocol(protocol);
        }
        DisableBroadcastDhcp disableBroadcastDhcp = getDisableBroadcastDhcp();
        if (disableBroadcastDhcp != null) {
            common.addDisableBroadcastDhcp(disableBroadcastDhcp);
        }
        StaticIp staticIp = getStaticIp();
        if (staticIp != null) {
            common.addStaticIp(staticIp);
        }
        Netmask netmask = getNetmask();
        if (netmask != null) {
            common.addNetmask(netmask);
        }
        DnsServer1 dnsServer1 = getDnsServer1();
        if (dnsServer1 != null) {
            common.addDnsServer1(dnsServer1);
        }
        DnsServer2 dnsServer2 = getDnsServer2();
        if (dnsServer2 != null) {
            common.addDnsServer2(dnsServer2);
        }
        if (dhcpServerVisitor != null) {
            DhcpServer dhcpServer = dhcpServerVisitor.collectConfig();
            if (dhcpServer != null) {
                common.addDhcpServer(dhcpServer);
            }
        }
        if (accessRulesVisitor != null) {
            AccessRules accessRules = accessRulesVisitor.collectConfig();
            if (accessRules != null) {
                common.addAccessRules(accessRules);
            }
        }
        if (common.hasChildren()) {
           return common;
        } else {
           return null;
        }
    }

    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element type = nodes.getFirstChild("type");
        if (type != null) {
            onType((Type)type);
        }
        
        final Element routeTable = nodes.getFirstChild("route-table");
        if (routeTable != null) {
            onRouteTable((RouteTable)routeTable);
        }
        
        final Element macAddr = nodes.getFirstChild("mac-addr");
        if (macAddr != null) {
            onMacAddr((MacAddr)macAddr);
        }
        
        final Element enabled = nodes.getFirstChild("enabled");
        if (enabled != null) {
            onEnabled((Enabled)enabled);
        }
        
        final Element wan = nodes.getFirstChild("wan");
        if (wan != null) {
            onWan((Wan)wan);
        }
        
        final Element masquerade = nodes.getFirstChild("masquerade");
        if (masquerade != null) {
            onMasquerade((Masquerade)masquerade);
        }
        
        final Element protocol = nodes.getFirstChild("protocol");
        if (protocol != null) {
            onProtocol((Protocol)protocol);
        }
        
        final Element disableBroadcastDhcp = nodes.getFirstChild("disable-broadcast-dhcp");
        if (disableBroadcastDhcp != null) {
            onDisableBroadcastDhcp((DisableBroadcastDhcp)disableBroadcastDhcp);
        }
        
        final Element staticIp = nodes.getFirstChild("static-ip");
        if (staticIp != null) {
            onStaticIp((StaticIp)staticIp);
        }
        
        final Element netmask = nodes.getFirstChild("netmask");
        if (netmask != null) {
            onNetmask((Netmask)netmask);
        }
        
        final Element dnsServer1 = nodes.getFirstChild("dns-server-1");
        if (dnsServer1 != null) {
            onDnsServer1((DnsServer1)dnsServer1);
        }
        
        final Element dnsServer2 = nodes.getFirstChild("dns-server-2");
        if (dnsServer2 != null) {
            onDnsServer2((DnsServer2)dnsServer2);
        }
        
        final Element dhcpServer = nodes.getFirstChild("dhcp-server");
        if (dhcpServer != null) {
            onDhcpServer((DhcpServer)dhcpServer);
            if (dhcpServerVisitor != null) {
                if (dhcpServer.hasChildren()) {
                    dhcpServerVisitor.visit(dhcpServer.getChildren());
                }
            }
        }
        
        final Element accessRules = nodes.getFirstChild("access-rules");
        if (accessRules != null) {
            onAccessRules((AccessRules)accessRules);
            if (accessRulesVisitor != null) {
                if (accessRules.hasChildren()) {
                    accessRulesVisitor.visit(accessRules.getChildren());
                }
            }
        }
    }

}
