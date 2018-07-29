
package com.netconfessor.gen.apConfig;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.monitoring.Arp;
import com.netconfessor.gen.apConfig.monitoring.Ethernet;
import com.netconfessor.gen.apConfig.monitoring.Information;
import com.netconfessor.gen.apConfig.monitoring.Route;
import com.netconfessor.gen.apConfig.monitoring.Sfp;
import com.netconfessor.gen.apConfig.monitoring.WanStatus;
import com.netconfessor.gen.apConfig.monitoring.WifiClient;

import io.netconfessor.Element;
import io.netconfessor.ElementChildrenIterator;
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
public class Monitoring extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child container "wan-status".
     */
    public WanStatus wanStatus = null;

    /**
     * Field for child container "ethernet".
     */
    public Ethernet ethernet = null;

    /**
     * Field for child container "sfp".
     */
    public Sfp sfp = null;

    /**
     * Field for child container "information".
     */
    public Information information = null;

    /**
     * Constructor for an empty Monitoring object.
     */
    public Monitoring() {
        super(ApConfigSchema.NAMESPACE, "monitoring");
        setDefaultPrefix();
        setPrefix(ApConfigSchema.PREFIX);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Monitoring clone() {
        return (Monitoring)cloneContent(new Monitoring());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Monitoring cloneShallow() {
        return (Monitoring)cloneShallowContent(new Monitoring());
    }

    public Monitoring cloneWithoutChildren() {
        return new Monitoring();
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
            "arp",
            "route",
            "wifi-client",
            "wan-status",
            "ethernet",
            "sfp",
            "information",
        };
    }

    /* Access methods for list child: "arp". */

    /**
     * Gets list entry "arp", with specified keys.
     */
    public Arp getArp() throws JNCException {
        String path = "arp";
        return (Arp)searchOne(path);
    }

    /**
     * Iterator method for the list "arp".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator<Arp> arpIterator() {
        return new ElementChildrenIterator(children, "arp");
    }

    /**
     * Adds list entry "arp", using an existing object.
     * @param arp The object to add.
     * @return The added child.
     */
    public Arp addArp(Arp arp) throws JNCException {
        insertChild(arp, childrenNames());
        return arp;
    }

    /**
     * Adds list entry "arp".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Arp addArp() throws JNCException {
        Arp arp = new Arp();
        insertChild(arp, childrenNames());
        return arp;
    }

    /**
     * Deletes list entry "arp", with specified keys.
     */
    public void deleteArp() throws JNCException {
        String path = "arp";
        delete(path);
    }

    /* Access methods for list child: "route". */

    /**
     * Gets list entry "route", with specified keys.
     */
    public Route getRoute() throws JNCException {
        String path = "route";
        return (Route)searchOne(path);
    }

    /**
     * Iterator method for the list "route".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator<Route> routeIterator() {
        return new ElementChildrenIterator(children, "route");
    }

    /**
     * Adds list entry "route", using an existing object.
     * @param route The object to add.
     * @return The added child.
     */
    public Route addRoute(Route route) throws JNCException {
        insertChild(route, childrenNames());
        return route;
    }

    /**
     * Adds list entry "route".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Route addRoute() throws JNCException {
        Route route = new Route();
        insertChild(route, childrenNames());
        return route;
    }

    /**
     * Deletes list entry "route", with specified keys.
     */
    public void deleteRoute() throws JNCException {
        String path = "route";
        delete(path);
    }

    /* Access methods for list child: "wifi-client". */

    /**
     * Gets list entry "wifiClient", with specified keys.
     */
    public WifiClient getWifiClient() throws JNCException {
        String path = "wifi-client";
        return (WifiClient)searchOne(path);
    }

    /**
     * Iterator method for the list "wifi-client".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator<WifiClient> wifiClientIterator() {
        return new ElementChildrenIterator(children, "wifi-client");
    }

    /**
     * Adds list entry "wifiClient", using an existing object.
     * @param wifiClient The object to add.
     * @return The added child.
     */
    public WifiClient addWifiClient(WifiClient wifiClient) throws JNCException {
        insertChild(wifiClient, childrenNames());
        return wifiClient;
    }

    /**
     * Adds list entry "wifiClient".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public WifiClient addWifiClient() throws JNCException {
        WifiClient wifiClient = new WifiClient();
        insertChild(wifiClient, childrenNames());
        return wifiClient;
    }

    /**
     * Deletes list entry "wifiClient", with specified keys.
     */
    public void deleteWifiClient() throws JNCException {
        String path = "wifi-client";
        delete(path);
    }

    /* Access methods for container child: "wan-status". */

    /**
     * Adds container entry "wanStatus", using an existing object.
     * @param wanStatus The object to add.
     * @return The added child.
     */
    public WanStatus addWanStatus(WanStatus wanStatus) throws JNCException {
        this.wanStatus = wanStatus;
        insertChild(wanStatus, childrenNames());
        return wanStatus;
    }

    /**
     * Adds container entry "wanStatus".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public WanStatus addWanStatus() throws JNCException {
        WanStatus wanStatus = new WanStatus();
        this.wanStatus = wanStatus;
        insertChild(wanStatus, childrenNames());
        return wanStatus;
    }

    /**
     * Deletes container entry "wanStatus".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteWanStatus() throws JNCException {
        this.wanStatus = null;
        String path = "wan-status";
        return delete(path);
    }

    /* Access methods for container child: "ethernet". */

    /**
     * Adds container entry "ethernet", using an existing object.
     * @param ethernet The object to add.
     * @return The added child.
     */
    public Ethernet addEthernet(Ethernet ethernet) throws JNCException {
        this.ethernet = ethernet;
        insertChild(ethernet, childrenNames());
        return ethernet;
    }

    /**
     * Adds container entry "ethernet".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Ethernet addEthernet() throws JNCException {
        Ethernet ethernet = new Ethernet();
        this.ethernet = ethernet;
        insertChild(ethernet, childrenNames());
        return ethernet;
    }

    /**
     * Deletes container entry "ethernet".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteEthernet() throws JNCException {
        this.ethernet = null;
        String path = "ethernet";
        return delete(path);
    }

    /* Access methods for container child: "sfp". */

    /**
     * Adds container entry "sfp", using an existing object.
     * @param sfp The object to add.
     * @return The added child.
     */
    public Sfp addSfp(Sfp sfp) throws JNCException {
        this.sfp = sfp;
        insertChild(sfp, childrenNames());
        return sfp;
    }

    /**
     * Adds container entry "sfp".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Sfp addSfp() throws JNCException {
        Sfp sfp = new Sfp();
        this.sfp = sfp;
        insertChild(sfp, childrenNames());
        return sfp;
    }

    /**
     * Deletes container entry "sfp".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteSfp() throws JNCException {
        this.sfp = null;
        String path = "sfp";
        return delete(path);
    }

    /* Access methods for container child: "information". */

    /**
     * Adds container entry "information", using an existing object.
     * @param information The object to add.
     * @return The added child.
     */
    public Information addInformation(Information information)
            throws JNCException {
        this.information = information;
        insertChild(information, childrenNames());
        return information;
    }

    /**
     * Adds container entry "information".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Information addInformation() throws JNCException {
        Information information = new Information();
        this.information = information;
        insertChild(information, childrenNames());
        return information;
    }

    /**
     * Deletes container entry "information".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteInformation() throws JNCException {
        this.information = null;
        String path = "information";
        return delete(path);
    }

    @Override
    public boolean hasLists() {
        return true;
    }

    @Override
    public List<NodeSet> getLists() throws JNCException {
        List<NodeSet> lists = new LinkedList<>();
        lists.add(get("arp"));
        lists.add(get("route"));
        lists.add(get("wifi-client"));
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
        if (child instanceof WanStatus) wanStatus = (WanStatus)child;
        else if (child instanceof Ethernet) ethernet = (Ethernet)child;
        else if (child instanceof Sfp) sfp = (Sfp)child;
        else if (child instanceof Information) information = (Information)child;
    }

}
