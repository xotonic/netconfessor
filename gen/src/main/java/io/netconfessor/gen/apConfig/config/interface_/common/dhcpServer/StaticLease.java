
package io.netconfessor.gen.apConfig.config.interface_.common.dhcpServer;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.NodeSet;
import io.netconfessor.YangElement;
import io.netconfessor.YangString;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.config.interface_.common.dhcpServer.staticLease.IpAddress;
import io.netconfessor.gen.apConfig.config.interface_.common.dhcpServer.staticLease.Name;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class StaticLease extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "name".
     */
    public Name name = null;

    /**
     * Field for child leaf "ip-address".
     */
    public IpAddress ipAddress = null;

    /**
     * Constructor for an empty StaticLease object.
     */
    public StaticLease() {
        super(ApConfigSchema.NAMESPACE, "static-lease");
    }

    /**
     * Constructor for an initialized StaticLease object,
     * 
     * @param nameValue Key argument of child.
     */
    public StaticLease(YangString nameValue) throws JNCException {
        super(ApConfigSchema.NAMESPACE, "static-lease");
        Name name = new Name();
        name.setValue(nameValue);
        this.name = name;
        insertChild(name, childrenNames());
    }

    /**
     * Constructor for an initialized StaticLease object,
     * with String keys.
     * @param nameValue Key argument of child.
     */
    public StaticLease(String nameValue) throws JNCException {
        super(ApConfigSchema.NAMESPACE, "static-lease");
        Name name = new Name();
        name.setValue(new YangString(nameValue));
        this.name = name;
        insertChild(name, childrenNames());
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public StaticLease clone() {
        StaticLease copy;
        try {
            copy = new StaticLease(name.getValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (StaticLease)cloneContent(copy);
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public StaticLease cloneShallow() {
        StaticLease copy;
        try {
            copy = new StaticLease(name.getValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (StaticLease)cloneShallowContent(copy);
    }

    public StaticLease cloneWithoutChildren() {
        return new StaticLease();
    }

    /**
     * @return An array with the identifiers of any key children
     */
    public String[] keyNames() {
        return new String[] {
            "name",
        };
    }

    /**
     * @return An array with the identifiers of any children, in order.
     */
    public String[] childrenNames() {
        return new String[] {
            "name",
            "ip-address",
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

    /* Access methods for optional leaf child: "ip-address". */

    /**
     * Adds leaf entry "ipAddress", using an existing object.
     * @param ipAddress The object to add.
     * @return The added child.
     */
    public IpAddress addIpAddress(IpAddress ipAddress) throws JNCException {
        this.ipAddress = ipAddress;
        insertChild(ipAddress, childrenNames());
        return ipAddress;
    }

    /**
     * Adds leaf entry "ipAddress".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public IpAddress addIpAddress() throws JNCException {
        IpAddress ipAddress = new IpAddress();
        this.ipAddress = ipAddress;
        insertChild(ipAddress, childrenNames());
        return ipAddress;
    }

    /**
     * Deletes leaf entry "ipAddress".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteIpAddress() throws JNCException {
        this.ipAddress = null;
        String path = "ip-address";
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
        else if (child instanceof IpAddress) ipAddress = (IpAddress)child;
    }

}
