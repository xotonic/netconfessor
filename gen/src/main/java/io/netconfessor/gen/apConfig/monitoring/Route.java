
package io.netconfessor.gen.apConfig.monitoring;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.NodeSet;
import io.netconfessor.YangElement;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.monitoring.route.Destination;
import io.netconfessor.gen.apConfig.monitoring.route.Flags;
import io.netconfessor.gen.apConfig.monitoring.route.Gateway;
import io.netconfessor.gen.apConfig.monitoring.route.JInterface;
import io.netconfessor.gen.apConfig.monitoring.route.Mask;
import io.netconfessor.gen.apConfig.monitoring.route.Name;

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
     * Field for child leaf "interface".
     */
    public JInterface interface_ = null;

    /**
     * Field for child leaf "destination".
     */
    public Destination destination = null;

    /**
     * Field for child leaf "gateway".
     */
    public Gateway gateway = null;

    /**
     * Field for child leaf "mask".
     */
    public Mask mask = null;

    /**
     * Field for child leaf "flags".
     */
    public Flags flags = null;

    /**
     * Constructor for an empty Route object.
     */
    public Route() {
        super(ApConfigSchema.NAMESPACE, "route");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Route clone() {
        return (Route)cloneContent(new Route());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Route cloneShallow() {
        return (Route)cloneShallowContent(new Route());
    }

    public Route cloneWithoutChildren() {
        return new Route();
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
            "interface",
            "destination",
            "gateway",
            "mask",
            "flags",
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

    /* Access methods for optional leaf child: "interface". */

    /**
     * Adds leaf entry "interface_", using an existing object.
     * @param interface_ The object to add.
     * @return The added child.
     */
    public JInterface addJInterface(JInterface interface_) throws JNCException {
        this.interface_ = interface_;
        insertChild(interface_, childrenNames());
        return interface_;
    }

    /**
     * Adds leaf entry "interface_".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public JInterface addJInterface() throws JNCException {
        JInterface interface_ = new JInterface();
        this.interface_ = interface_;
        insertChild(interface_, childrenNames());
        return interface_;
    }

    /**
     * Deletes leaf entry "interface_".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteJInterface() throws JNCException {
        this.interface_ = null;
        String path = "interface";
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

    /* Access methods for optional leaf child: "mask". */

    /**
     * Adds leaf entry "mask", using an existing object.
     * @param mask The object to add.
     * @return The added child.
     */
    public Mask addMask(Mask mask) throws JNCException {
        this.mask = mask;
        insertChild(mask, childrenNames());
        return mask;
    }

    /**
     * Adds leaf entry "mask".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Mask addMask() throws JNCException {
        Mask mask = new Mask();
        this.mask = mask;
        insertChild(mask, childrenNames());
        return mask;
    }

    /**
     * Deletes leaf entry "mask".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteMask() throws JNCException {
        this.mask = null;
        String path = "mask";
        return delete(path);
    }

    /* Access methods for optional leaf child: "flags". */

    /**
     * Adds leaf entry "flags", using an existing object.
     * @param flags The object to add.
     * @return The added child.
     */
    public Flags addFlags(Flags flags) throws JNCException {
        this.flags = flags;
        insertChild(flags, childrenNames());
        return flags;
    }

    /**
     * Adds leaf entry "flags".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Flags addFlags() throws JNCException {
        Flags flags = new Flags();
        this.flags = flags;
        insertChild(flags, childrenNames());
        return flags;
    }

    /**
     * Deletes leaf entry "flags".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteFlags() throws JNCException {
        this.flags = null;
        String path = "flags";
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
        else if (child instanceof JInterface) interface_ = (JInterface)child;
        else if (child instanceof Destination) destination = (Destination)child;
        else if (child instanceof Gateway) gateway = (Gateway)child;
        else if (child instanceof Mask) mask = (Mask)child;
        else if (child instanceof Flags) flags = (Flags)child;
    }

}
