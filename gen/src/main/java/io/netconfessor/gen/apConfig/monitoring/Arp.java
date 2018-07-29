
package io.netconfessor.gen.apConfig.monitoring;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.NodeSet;
import io.netconfessor.YangElement;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.monitoring.arp.Ip;
import io.netconfessor.gen.apConfig.monitoring.arp.Mac;
import io.netconfessor.gen.apConfig.monitoring.arp.Name;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Arp extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "name".
     */
    public Name name = null;

    /**
     * Field for child leaf "ip".
     */
    public Ip ip = null;

    /**
     * Field for child leaf "mac".
     */
    public Mac mac = null;

    /**
     * Constructor for an empty Arp object.
     */
    public Arp() {
        super(ApConfigSchema.NAMESPACE, "arp");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Arp clone() {
        return (Arp)cloneContent(new Arp());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Arp cloneShallow() {
        return (Arp)cloneShallowContent(new Arp());
    }

    public Arp cloneWithoutChildren() {
        return new Arp();
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
            "name",
            "ip",
            "mac",
        };
    }

    /* Access methods for leaf child: "name". */

    /**
     * Adds leaf entry "name", using an existing object.
     * @param name The object to add.
     * @return The added child.
     */
    public Name addName(Name name) throws JNCException {
        this.name = name;
        insertChild(name, childrenNames());
        return name;
    }

    /**
     * Adds leaf entry "name".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Name addName() throws JNCException {
        Name name = new Name();
        this.name = name;
        insertChild(name, childrenNames());
        return name;
    }

    /**
     * Deletes leaf entry "name".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteName() throws JNCException {
        this.name = null;
        String path = "name";
        return delete(path);
    }

    /* Access methods for optional leaf child: "ip". */

    /**
     * Adds leaf entry "ip", using an existing object.
     * @param ip The object to add.
     * @return The added child.
     */
    public Ip addIp(Ip ip) throws JNCException {
        this.ip = ip;
        insertChild(ip, childrenNames());
        return ip;
    }

    /**
     * Adds leaf entry "ip".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Ip addIp() throws JNCException {
        Ip ip = new Ip();
        this.ip = ip;
        insertChild(ip, childrenNames());
        return ip;
    }

    /**
     * Deletes leaf entry "ip".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteIp() throws JNCException {
        this.ip = null;
        String path = "ip";
        return delete(path);
    }

    /* Access methods for optional leaf child: "mac". */

    /**
     * Adds leaf entry "mac", using an existing object.
     * @param mac The object to add.
     * @return The added child.
     */
    public Mac addMac(Mac mac) throws JNCException {
        this.mac = mac;
        insertChild(mac, childrenNames());
        return mac;
    }

    /**
     * Adds leaf entry "mac".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Mac addMac() throws JNCException {
        Mac mac = new Mac();
        this.mac = mac;
        insertChild(mac, childrenNames());
        return mac;
    }

    /**
     * Deletes leaf entry "mac".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteMac() throws JNCException {
        this.mac = null;
        String path = "mac";
        return delete(path);
    }

    /**
     * Support method for addChild.
     * Adds a child to this object.
     * 
     * @param child The child to add
     */
    public void addChild(Element child) {
        super.addChild(child);
        if (child instanceof Name) name = (Name)child;
        else if (child instanceof Ip) ip = (Ip)child;
        else if (child instanceof Mac) mac = (Mac)child;
    }

}
