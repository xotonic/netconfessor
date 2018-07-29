
package com.netconfessor.gen.apConfig.config.interface_;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.config.interface_.common.AccessRules;
import com.netconfessor.gen.apConfig.config.interface_.common.DhcpServer;
import com.netconfessor.gen.apConfig.config.interface_.common.DisableBroadcastDhcp;
import com.netconfessor.gen.apConfig.config.interface_.common.DnsServer1;
import com.netconfessor.gen.apConfig.config.interface_.common.DnsServer2;
import com.netconfessor.gen.apConfig.config.interface_.common.Enabled;
import com.netconfessor.gen.apConfig.config.interface_.common.MacAddr;
import com.netconfessor.gen.apConfig.config.interface_.common.Masquerade;
import com.netconfessor.gen.apConfig.config.interface_.common.Netmask;
import com.netconfessor.gen.apConfig.config.interface_.common.Protocol;
import com.netconfessor.gen.apConfig.config.interface_.common.RouteTable;
import com.netconfessor.gen.apConfig.config.interface_.common.StaticIp;
import com.netconfessor.gen.apConfig.config.interface_.common.Type;
import com.netconfessor.gen.apConfig.config.interface_.common.Wan;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.NodeSet;
import io.netconfessor.YangContainer;
import io.netconfessor.YangElement;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Common extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "type".
     */
    public Type type = null;

    /**
     * Field for child leaf "route-table".
     */
    public RouteTable routeTable = null;

    /**
     * Field for child leaf "mac-addr".
     */
    public MacAddr macAddr = null;

    /**
     * Field for child leaf "enabled".
     */
    public Enabled enabled = null;

    /**
     * Field for child leaf "wan".
     */
    public Wan wan = null;

    /**
     * Field for child leaf "masquerade".
     */
    public Masquerade masquerade = null;

    /**
     * Field for child leaf "protocol".
     */
    public Protocol protocol = null;

    /**
     * Field for child leaf "disable-broadcast-dhcp".
     */
    public DisableBroadcastDhcp disableBroadcastDhcp = null;

    /**
     * Field for child leaf "static-ip".
     */
    public StaticIp staticIp = null;

    /**
     * Field for child leaf "netmask".
     */
    public Netmask netmask = null;

    /**
     * Field for child leaf "dns-server-1".
     */
    public DnsServer1 dnsServer1 = null;

    /**
     * Field for child leaf "dns-server-2".
     */
    public DnsServer2 dnsServer2 = null;

    /**
     * Field for child container "dhcp-server".
     */
    public DhcpServer dhcpServer = null;

    /**
     * Field for child container "access-rules".
     */
    public AccessRules accessRules = null;

    /**
     * Constructor for an empty Common object.
     */
    public Common() {
        super(ApConfigSchema.NAMESPACE, "common");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Common clone() {
        return (Common)cloneContent(new Common());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Common cloneShallow() {
        return (Common)cloneShallowContent(new Common());
    }

    public Common cloneWithoutChildren() {
        return new Common();
    }

    /**
     * @return An array with the identifiers of any key children
     */
    public String[] keyNames() {
        return null;
    }

    /**
     * @return An array with the identifiers of any children, in order.
     */
    public String[] childrenNames() {
        return new String[] {
            "type",
            "route-table",
            "mac-addr",
            "enabled",
            "wan",
            "masquerade",
            "protocol",
            "disable-broadcast-dhcp",
            "static-ip",
            "netmask",
            "dns-server-1",
            "dns-server-2",
            "dhcp-server",
            "access-rules",
        };
    }

    /* Access methods for optional leaf child: "type". */

    /**
     * Adds leaf entry "type", using an existing object.
     * @param type The object to add.
     * @return The added child.
     */
    public Type addType(Type type) throws JNCException {
        this.type = type;
        insertChild(type, childrenNames());
        return type;
    }

    /**
     * Adds leaf entry "type".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Type addType() throws JNCException {
        Type type = new Type();
        this.type = type;
        insertChild(type, childrenNames());
        return type;
    }

    /**
     * Deletes leaf entry "type".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteType() throws JNCException {
        this.type = null;
        String path = "type";
        return delete(path);
    }

    /* Access methods for optional leaf child: "route-table". */

    /**
     * Adds leaf entry "routeTable", using an existing object.
     * @param routeTable The object to add.
     * @return The added child.
     */
    public RouteTable addRouteTable(RouteTable routeTable) throws JNCException {
        this.routeTable = routeTable;
        insertChild(routeTable, childrenNames());
        return routeTable;
    }

    /**
     * Adds leaf entry "routeTable".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public RouteTable addRouteTable() throws JNCException {
        RouteTable routeTable = new RouteTable();
        this.routeTable = routeTable;
        insertChild(routeTable, childrenNames());
        return routeTable;
    }

    /**
     * Deletes leaf entry "routeTable".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteRouteTable() throws JNCException {
        this.routeTable = null;
        String path = "route-table";
        return delete(path);
    }

    /* Access methods for optional leaf child: "mac-addr". */

    /**
     * Adds leaf entry "macAddr", using an existing object.
     * @param macAddr The object to add.
     * @return The added child.
     */
    public MacAddr addMacAddr(MacAddr macAddr) throws JNCException {
        this.macAddr = macAddr;
        insertChild(macAddr, childrenNames());
        return macAddr;
    }

    /**
     * Adds leaf entry "macAddr".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public MacAddr addMacAddr() throws JNCException {
        MacAddr macAddr = new MacAddr();
        this.macAddr = macAddr;
        insertChild(macAddr, childrenNames());
        return macAddr;
    }

    /**
     * Deletes leaf entry "macAddr".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteMacAddr() throws JNCException {
        this.macAddr = null;
        String path = "mac-addr";
        return delete(path);
    }

    /* Access methods for optional leaf child: "enabled". */

    /**
     * Adds leaf entry "enabled", using an existing object.
     * @param enabled The object to add.
     * @return The added child.
     */
    public Enabled addEnabled(Enabled enabled) throws JNCException {
        this.enabled = enabled;
        insertChild(enabled, childrenNames());
        return enabled;
    }

    /**
     * Adds leaf entry "enabled".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Enabled addEnabled() throws JNCException {
        Enabled enabled = new Enabled();
        this.enabled = enabled;
        insertChild(enabled, childrenNames());
        return enabled;
    }

    /**
     * Deletes leaf entry "enabled".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteEnabled() throws JNCException {
        this.enabled = null;
        String path = "enabled";
        return delete(path);
    }

    /* Access methods for optional leaf child: "wan". */

    /**
     * Adds leaf entry "wan", using an existing object.
     * @param wan The object to add.
     * @return The added child.
     */
    public Wan addWan(Wan wan) throws JNCException {
        this.wan = wan;
        insertChild(wan, childrenNames());
        return wan;
    }

    /**
     * Adds leaf entry "wan".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Wan addWan() throws JNCException {
        Wan wan = new Wan();
        this.wan = wan;
        insertChild(wan, childrenNames());
        return wan;
    }

    /**
     * Deletes leaf entry "wan".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteWan() throws JNCException {
        this.wan = null;
        String path = "wan";
        return delete(path);
    }

    /* Access methods for optional leaf child: "masquerade". */

    /**
     * Adds leaf entry "masquerade", using an existing object.
     * @param masquerade The object to add.
     * @return The added child.
     */
    public Masquerade addMasquerade(Masquerade masquerade) throws JNCException {
        this.masquerade = masquerade;
        insertChild(masquerade, childrenNames());
        return masquerade;
    }

    /**
     * Adds leaf entry "masquerade".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Masquerade addMasquerade() throws JNCException {
        Masquerade masquerade = new Masquerade();
        this.masquerade = masquerade;
        insertChild(masquerade, childrenNames());
        return masquerade;
    }

    /**
     * Deletes leaf entry "masquerade".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteMasquerade() throws JNCException {
        this.masquerade = null;
        String path = "masquerade";
        return delete(path);
    }

    /* Access methods for optional leaf child: "protocol". */

    /**
     * Adds leaf entry "protocol", using an existing object.
     * @param protocol The object to add.
     * @return The added child.
     */
    public Protocol addProtocol(Protocol protocol) throws JNCException {
        this.protocol = protocol;
        insertChild(protocol, childrenNames());
        return protocol;
    }

    /**
     * Adds leaf entry "protocol".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Protocol addProtocol() throws JNCException {
        Protocol protocol = new Protocol();
        this.protocol = protocol;
        insertChild(protocol, childrenNames());
        return protocol;
    }

    /**
     * Deletes leaf entry "protocol".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteProtocol() throws JNCException {
        this.protocol = null;
        String path = "protocol";
        return delete(path);
    }

    /* Access methods for optional leaf child: "disable-broadcast-dhcp". */

    /**
     * Adds leaf entry "disableBroadcastDhcp", using an existing object.
     * @param disableBroadcastDhcp The object to add.
     * @return The added child.
     */
    public DisableBroadcastDhcp addDisableBroadcastDhcp(DisableBroadcastDhcp disableBroadcastDhcp)
            throws JNCException {
        this.disableBroadcastDhcp = disableBroadcastDhcp;
        insertChild(disableBroadcastDhcp, childrenNames());
        return disableBroadcastDhcp;
    }

    /**
     * Adds leaf entry "disableBroadcastDhcp".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public DisableBroadcastDhcp addDisableBroadcastDhcp() throws JNCException {
        DisableBroadcastDhcp disableBroadcastDhcp = new DisableBroadcastDhcp();
        this.disableBroadcastDhcp = disableBroadcastDhcp;
        insertChild(disableBroadcastDhcp, childrenNames());
        return disableBroadcastDhcp;
    }

    /**
     * Deletes leaf entry "disableBroadcastDhcp".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteDisableBroadcastDhcp() throws JNCException {
        this.disableBroadcastDhcp = null;
        String path = "disable-broadcast-dhcp";
        return delete(path);
    }

    /* Access methods for optional leaf child: "static-ip". */

    /**
     * Adds leaf entry "staticIp", using an existing object.
     * @param staticIp The object to add.
     * @return The added child.
     */
    public StaticIp addStaticIp(StaticIp staticIp) throws JNCException {
        this.staticIp = staticIp;
        insertChild(staticIp, childrenNames());
        return staticIp;
    }

    /**
     * Adds leaf entry "staticIp".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public StaticIp addStaticIp() throws JNCException {
        StaticIp staticIp = new StaticIp();
        this.staticIp = staticIp;
        insertChild(staticIp, childrenNames());
        return staticIp;
    }

    /**
     * Deletes leaf entry "staticIp".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteStaticIp() throws JNCException {
        this.staticIp = null;
        String path = "static-ip";
        return delete(path);
    }

    /* Access methods for optional leaf child: "netmask". */

    /**
     * Adds leaf entry "netmask", using an existing object.
     * @param netmask The object to add.
     * @return The added child.
     */
    public Netmask addNetmask(Netmask netmask) throws JNCException {
        this.netmask = netmask;
        insertChild(netmask, childrenNames());
        return netmask;
    }

    /**
     * Adds leaf entry "netmask".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Netmask addNetmask() throws JNCException {
        Netmask netmask = new Netmask();
        this.netmask = netmask;
        insertChild(netmask, childrenNames());
        return netmask;
    }

    /**
     * Deletes leaf entry "netmask".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteNetmask() throws JNCException {
        this.netmask = null;
        String path = "netmask";
        return delete(path);
    }

    /* Access methods for optional leaf child: "dns-server-1". */

    /**
     * Adds leaf entry "dnsServer1", using an existing object.
     * @param dnsServer1 The object to add.
     * @return The added child.
     */
    public DnsServer1 addDnsServer1(DnsServer1 dnsServer1) throws JNCException {
        this.dnsServer1 = dnsServer1;
        insertChild(dnsServer1, childrenNames());
        return dnsServer1;
    }

    /**
     * Adds leaf entry "dnsServer1".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public DnsServer1 addDnsServer1() throws JNCException {
        DnsServer1 dnsServer1 = new DnsServer1();
        this.dnsServer1 = dnsServer1;
        insertChild(dnsServer1, childrenNames());
        return dnsServer1;
    }

    /**
     * Deletes leaf entry "dnsServer1".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteDnsServer1() throws JNCException {
        this.dnsServer1 = null;
        String path = "dns-server-1";
        return delete(path);
    }

    /* Access methods for optional leaf child: "dns-server-2". */

    /**
     * Adds leaf entry "dnsServer2", using an existing object.
     * @param dnsServer2 The object to add.
     * @return The added child.
     */
    public DnsServer2 addDnsServer2(DnsServer2 dnsServer2) throws JNCException {
        this.dnsServer2 = dnsServer2;
        insertChild(dnsServer2, childrenNames());
        return dnsServer2;
    }

    /**
     * Adds leaf entry "dnsServer2".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public DnsServer2 addDnsServer2() throws JNCException {
        DnsServer2 dnsServer2 = new DnsServer2();
        this.dnsServer2 = dnsServer2;
        insertChild(dnsServer2, childrenNames());
        return dnsServer2;
    }

    /**
     * Deletes leaf entry "dnsServer2".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteDnsServer2() throws JNCException {
        this.dnsServer2 = null;
        String path = "dns-server-2";
        return delete(path);
    }

    /* Access methods for container child: "dhcp-server". */

    /**
     * Adds container entry "dhcpServer", using an existing object.
     * @param dhcpServer The object to add.
     * @return The added child.
     */
    public DhcpServer addDhcpServer(DhcpServer dhcpServer) throws JNCException {
        this.dhcpServer = dhcpServer;
        insertChild(dhcpServer, childrenNames());
        return dhcpServer;
    }

    /**
     * Adds container entry "dhcpServer".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public DhcpServer addDhcpServer() throws JNCException {
        DhcpServer dhcpServer = new DhcpServer();
        this.dhcpServer = dhcpServer;
        insertChild(dhcpServer, childrenNames());
        return dhcpServer;
    }

    /**
     * Deletes container entry "dhcpServer".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteDhcpServer() throws JNCException {
        this.dhcpServer = null;
        String path = "dhcp-server";
        return delete(path);
    }

    /* Access methods for container child: "access-rules". */

    /**
     * Adds container entry "accessRules", using an existing object.
     * @param accessRules The object to add.
     * @return The added child.
     */
    public AccessRules addAccessRules(AccessRules accessRules)
            throws JNCException {
        this.accessRules = accessRules;
        insertChild(accessRules, childrenNames());
        return accessRules;
    }

    /**
     * Adds container entry "accessRules".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public AccessRules addAccessRules() throws JNCException {
        AccessRules accessRules = new AccessRules();
        this.accessRules = accessRules;
        insertChild(accessRules, childrenNames());
        return accessRules;
    }

    /**
     * Deletes container entry "accessRules".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteAccessRules() throws JNCException {
        this.accessRules = null;
        String path = "access-rules";
        return delete(path);
    }

    @Override
    public boolean hasLists() {
        return false;
    }

    @Override
    public List<NodeSet> getLists() throws JNCException {
        List<NodeSet> lists = new LinkedList<>();
        return lists;
    }

    /**
     * Support method for addChild.
     * Adds a child to this object.
     * 
     * @param child The child to add
     */
    public void addChild(Element child) {
        super.addChild(child);
        if (child instanceof Type) type = (Type)child;
        else if (child instanceof RouteTable) routeTable = (RouteTable)child;
        else if (child instanceof MacAddr) macAddr = (MacAddr)child;
        else if (child instanceof Enabled) enabled = (Enabled)child;
        else if (child instanceof Wan) wan = (Wan)child;
        else if (child instanceof Masquerade) masquerade = (Masquerade)child;
        else if (child instanceof Protocol) protocol = (Protocol)child;
        else if (child instanceof DisableBroadcastDhcp) disableBroadcastDhcp = (DisableBroadcastDhcp)child;
        else if (child instanceof StaticIp) staticIp = (StaticIp)child;
        else if (child instanceof Netmask) netmask = (Netmask)child;
        else if (child instanceof DnsServer1) dnsServer1 = (DnsServer1)child;
        else if (child instanceof DnsServer2) dnsServer2 = (DnsServer2)child;
        else if (child instanceof DhcpServer) dhcpServer = (DhcpServer)child;
        else if (child instanceof AccessRules) accessRules = (AccessRules)child;
    }

}
