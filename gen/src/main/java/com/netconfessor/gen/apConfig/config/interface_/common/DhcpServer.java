
package com.netconfessor.gen.apConfig.config.interface_.common;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.config.interface_.common.dhcpServer.Dns;
import com.netconfessor.gen.apConfig.config.interface_.common.dhcpServer.Enable;
import com.netconfessor.gen.apConfig.config.interface_.common.dhcpServer.EndIp;
import com.netconfessor.gen.apConfig.config.interface_.common.dhcpServer.LeaseTime;
import com.netconfessor.gen.apConfig.config.interface_.common.dhcpServer.Netmask;
import com.netconfessor.gen.apConfig.config.interface_.common.dhcpServer.Router;
import com.netconfessor.gen.apConfig.config.interface_.common.dhcpServer.StartIp;
import com.netconfessor.gen.apConfig.config.interface_.common.dhcpServer.StaticLease;

import io.netconfessor.Element;
import io.netconfessor.ElementChildrenIterator;
import io.netconfessor.JNCException;
import io.netconfessor.NodeSet;
import io.netconfessor.YangContainer;
import io.netconfessor.YangElement;
import io.netconfessor.YangString;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class DhcpServer extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "enable".
     */
    public Enable enable = null;

    /**
     * Field for child leaf "start-ip".
     */
    public StartIp startIp = null;

    /**
     * Field for child leaf "end-ip".
     */
    public EndIp endIp = null;

    /**
     * Field for child leaf "netmask".
     */
    public Netmask netmask = null;

    /**
     * Field for child leaf "dns".
     */
    public Dns dns = null;

    /**
     * Field for child leaf "router".
     */
    public Router router = null;

    /**
     * Field for child leaf "lease-time".
     */
    public LeaseTime leaseTime = null;

    /**
     * Constructor for an empty DhcpServer object.
     */
    public DhcpServer() {
        super(ApConfigSchema.NAMESPACE, "dhcp-server");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public DhcpServer clone() {
        return (DhcpServer)cloneContent(new DhcpServer());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public DhcpServer cloneShallow() {
        return (DhcpServer)cloneShallowContent(new DhcpServer());
    }

    public DhcpServer cloneWithoutChildren() {
        return new DhcpServer();
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
            "enable",
            "start-ip",
            "end-ip",
            "netmask",
            "dns",
            "router",
            "lease-time",
            "static-lease",
        };
    }

    /* Access methods for optional leaf child: "enable". */

    /**
     * Adds leaf entry "enable", using an existing object.
     * @param enable The object to add.
     * @return The added child.
     */
    public Enable addEnable(Enable enable) throws JNCException {
        this.enable = enable;
        insertChild(enable, childrenNames());
        return enable;
    }

    /**
     * Adds leaf entry "enable".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Enable addEnable() throws JNCException {
        Enable enable = new Enable();
        this.enable = enable;
        insertChild(enable, childrenNames());
        return enable;
    }

    /**
     * Deletes leaf entry "enable".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteEnable() throws JNCException {
        this.enable = null;
        String path = "enable";
        return delete(path);
    }

    /* Access methods for optional leaf child: "start-ip". */

    /**
     * Adds leaf entry "startIp", using an existing object.
     * @param startIp The object to add.
     * @return The added child.
     */
    public StartIp addStartIp(StartIp startIp) throws JNCException {
        this.startIp = startIp;
        insertChild(startIp, childrenNames());
        return startIp;
    }

    /**
     * Adds leaf entry "startIp".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public StartIp addStartIp() throws JNCException {
        StartIp startIp = new StartIp();
        this.startIp = startIp;
        insertChild(startIp, childrenNames());
        return startIp;
    }

    /**
     * Deletes leaf entry "startIp".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteStartIp() throws JNCException {
        this.startIp = null;
        String path = "start-ip";
        return delete(path);
    }

    /* Access methods for optional leaf child: "end-ip". */

    /**
     * Adds leaf entry "endIp", using an existing object.
     * @param endIp The object to add.
     * @return The added child.
     */
    public EndIp addEndIp(EndIp endIp) throws JNCException {
        this.endIp = endIp;
        insertChild(endIp, childrenNames());
        return endIp;
    }

    /**
     * Adds leaf entry "endIp".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public EndIp addEndIp() throws JNCException {
        EndIp endIp = new EndIp();
        this.endIp = endIp;
        insertChild(endIp, childrenNames());
        return endIp;
    }

    /**
     * Deletes leaf entry "endIp".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteEndIp() throws JNCException {
        this.endIp = null;
        String path = "end-ip";
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

    /* Access methods for optional leaf child: "dns". */

    /**
     * Adds leaf entry "dns", using an existing object.
     * @param dns The object to add.
     * @return The added child.
     */
    public Dns addDns(Dns dns) throws JNCException {
        this.dns = dns;
        insertChild(dns, childrenNames());
        return dns;
    }

    /**
     * Adds leaf entry "dns".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Dns addDns() throws JNCException {
        Dns dns = new Dns();
        this.dns = dns;
        insertChild(dns, childrenNames());
        return dns;
    }

    /**
     * Deletes leaf entry "dns".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteDns() throws JNCException {
        this.dns = null;
        String path = "dns";
        return delete(path);
    }

    /* Access methods for optional leaf child: "router". */

    /**
     * Adds leaf entry "router", using an existing object.
     * @param router The object to add.
     * @return The added child.
     */
    public Router addRouter(Router router) throws JNCException {
        this.router = router;
        insertChild(router, childrenNames());
        return router;
    }

    /**
     * Adds leaf entry "router".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Router addRouter() throws JNCException {
        Router router = new Router();
        this.router = router;
        insertChild(router, childrenNames());
        return router;
    }

    /**
     * Deletes leaf entry "router".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteRouter() throws JNCException {
        this.router = null;
        String path = "router";
        return delete(path);
    }

    /* Access methods for optional leaf child: "lease-time". */

    /**
     * Adds leaf entry "leaseTime", using an existing object.
     * @param leaseTime The object to add.
     * @return The added child.
     */
    public LeaseTime addLeaseTime(LeaseTime leaseTime) throws JNCException {
        this.leaseTime = leaseTime;
        insertChild(leaseTime, childrenNames());
        return leaseTime;
    }

    /**
     * Adds leaf entry "leaseTime".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public LeaseTime addLeaseTime() throws JNCException {
        LeaseTime leaseTime = new LeaseTime();
        this.leaseTime = leaseTime;
        insertChild(leaseTime, childrenNames());
        return leaseTime;
    }

    /**
     * Deletes leaf entry "leaseTime".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteLeaseTime() throws JNCException {
        this.leaseTime = null;
        String path = "lease-time";
        return delete(path);
    }

    /* Access methods for list child: "static-lease". */

    /**
     * Gets list entry "staticLease", with specified keys.
     * @param nameValue Key argument of child.
     */
    public StaticLease getStaticLease(YangString nameValue) throws JNCException {
        String path = "static-lease[name='" + nameValue + "']";
        return (StaticLease)searchOne(path);
    }

    /**
     * Gets list entry "staticLease", with specified keys.
     * The keys are specified as strings.
     * @param nameValue Key argument of child.
     */
    public StaticLease getStaticLease(String nameValue) throws JNCException {
        String path = "static-lease[name='" + nameValue + "']";
        return (StaticLease)searchOne(path);
    }

    /**
     * Iterator method for the list "static-lease".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator<StaticLease> staticLeaseIterator() {
        return new ElementChildrenIterator(children, "static-lease");
    }

    /**
     * Adds list entry "staticLease", using an existing object.
     * @param staticLease The object to add.
     * @return The added child.
     */
    public StaticLease addStaticLease(StaticLease staticLease)
            throws JNCException {
        insertChild(staticLease, childrenNames());
        return staticLease;
    }

    /**
     * Adds list entry "staticLease", with specified keys.
     * @param nameValue Key argument of child.
     * @return The added child.
     */
    public StaticLease addStaticLease(YangString nameValue) throws JNCException {
        StaticLease staticLease = new StaticLease(nameValue);
        return addStaticLease(staticLease);
    }

    /**
     * Adds list entry "staticLease", with specified keys.
     * The keys are specified as strings.
     * @param nameValue Key argument of child.
     * @return The added child.
     */
    public StaticLease addStaticLease(String nameValue) throws JNCException {
        StaticLease staticLease = new StaticLease(nameValue);
        return addStaticLease(staticLease);
    }

    /**
     * Adds list entry "staticLease".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public StaticLease addStaticLease() throws JNCException {
        StaticLease staticLease = new StaticLease();
        insertChild(staticLease, childrenNames());
        return staticLease;
    }

    /**
     * Deletes list entry "staticLease", with specified keys.
     * @param nameValue Key argument of child.
     */
    public void deleteStaticLease(YangString nameValue) throws JNCException {
        String path = "static-lease[name='" + nameValue + "']";
        delete(path);
    }

    /**
     * Deletes list entry "staticLease", with specified keys.
     * The keys are specified as strings.
     * @param nameValue Key argument of child.
     */
    public void deleteStaticLease(String nameValue) throws JNCException {
        String path = "static-lease[name='" + nameValue + "']";
        delete(path);
    }

    @Override
    public boolean hasLists() {
        return true;
    }

    @Override
    public List<NodeSet> getLists() throws JNCException {
        List<NodeSet> lists = new LinkedList<>();
        lists.add(get("static-lease"));
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
        if (child instanceof Enable) enable = (Enable)child;
        else if (child instanceof StartIp) startIp = (StartIp)child;
        else if (child instanceof EndIp) endIp = (EndIp)child;
        else if (child instanceof Netmask) netmask = (Netmask)child;
        else if (child instanceof Dns) dns = (Dns)child;
        else if (child instanceof Router) router = (Router)child;
        else if (child instanceof LeaseTime) leaseTime = (LeaseTime)child;
    }

}
