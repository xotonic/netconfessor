
package com.netconfessor.gen.apConfig.config;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.config.route.Destination;
import com.netconfessor.gen.apConfig.config.route.Gateway;
import com.netconfessor.gen.apConfig.config.route.Name;
import com.netconfessor.gen.apConfig.config.route.Netmask;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.NodeSet;
import io.netconfessor.YangElement;
import io.netconfessor.YangString;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Route extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "name".
     */
    public Name name = null;

    /**
     * Field for child leaf "destination".
     */
    public Destination destination = null;

    /**
     * Field for child leaf "netmask".
     */
    public Netmask netmask = null;

    /**
     * Field for child leaf "gateway".
     */
    public Gateway gateway = null;

    /**
     * Constructor for an empty Route object.
     */
    public Route() {
        super(ApConfigSchema.NAMESPACE, "route");
    }

    /**
     * Constructor for an initialized Route object,
     * 
     * @param nameValue Key argument of child.
     */
    public Route(YangString nameValue) throws JNCException {
        super(ApConfigSchema.NAMESPACE, "route");
        Name name = new Name();
        name.setValue(nameValue);
        this.name = name;
        insertChild(name, childrenNames());
    }

    /**
     * Constructor for an initialized Route object,
     * with String keys.
     * @param nameValue Key argument of child.
     */
    public Route(String nameValue) throws JNCException {
        super(ApConfigSchema.NAMESPACE, "route");
        Name name = new Name();
        name.setValue(new YangString(nameValue));
        this.name = name;
        insertChild(name, childrenNames());
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Route clone() {
        Route copy;
        try {
            copy = new Route(name.getValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (Route)cloneContent(copy);
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Route cloneShallow() {
        Route copy;
        try {
            copy = new Route(name.getValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (Route)cloneShallowContent(copy);
    }

    public Route cloneWithoutChildren() {
        return new Route();
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
            "destination",
            "netmask",
            "gateway",
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

    /* Access methods for optional leaf child: "destination". */

    /**
     * Adds leaf entry "destination", using an existing object.
     * @param destination The object to add.
     * @return The added child.
     */
    public Destination addDestination(Destination destination)
            throws JNCException {
        this.destination = destination;
        insertChild(destination, childrenNames());
        return destination;
    }

    /**
     * Adds leaf entry "destination".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Destination addDestination() throws JNCException {
        Destination destination = new Destination();
        this.destination = destination;
        insertChild(destination, childrenNames());
        return destination;
    }

    /**
     * Deletes leaf entry "destination".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteDestination() throws JNCException {
        this.destination = null;
        String path = "destination";
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

    /* Access methods for optional leaf child: "gateway". */

    /**
     * Adds leaf entry "gateway", using an existing object.
     * @param gateway The object to add.
     * @return The added child.
     */
    public Gateway addGateway(Gateway gateway) throws JNCException {
        this.gateway = gateway;
        insertChild(gateway, childrenNames());
        return gateway;
    }

    /**
     * Adds leaf entry "gateway".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Gateway addGateway() throws JNCException {
        Gateway gateway = new Gateway();
        this.gateway = gateway;
        insertChild(gateway, childrenNames());
        return gateway;
    }

    /**
     * Deletes leaf entry "gateway".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteGateway() throws JNCException {
        this.gateway = null;
        String path = "gateway";
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
        else if (child instanceof Destination) destination = (Destination)child;
        else if (child instanceof Netmask) netmask = (Netmask)child;
        else if (child instanceof Gateway) gateway = (Gateway)child;
    }

}
