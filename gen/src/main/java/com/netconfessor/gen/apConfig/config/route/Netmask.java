
package com.netconfessor.gen.apConfig.config.route;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.ietfInetTypes.IpAddress;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;

/**
 * Route netmask
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Netmask extends Leaf {

    private static final long serialVersionUID = 1L;

    public IpAddress value() {
        return (IpAddress) getValue();
    }

    /**
     * Sets the value  leaf "netmask",
     * @param netmaskValue used during instantiation.
     */
    public void value(IpAddress netmaskValue) throws JNCException {
        setValue(netmaskValue);
    }

    public IpAddress defaultValue() throws JNCException {
        return null;
    }

    public boolean hasDefaultValue() {
        return false;
    }

    public void instantiateValue(String stringRepresentation)
            throws JNCException {
        value(new IpAddress(stringRepresentation));
    }

    public IpAddress createValue(String stringRepresentation)
            throws JNCException {
        return new IpAddress(stringRepresentation);
    }

    public Class<IpAddress> valueClass() {
        return IpAddress.class;
    }

    /**
     * Constructor for an empty Netmask object.
     */
    public Netmask() {
        super(ApConfigSchema.NAMESPACE, "netmask");
    }

    /**
     * Constructor for an empty Netmask object.
     */
    public Netmask(IpAddress value) {
        super(ApConfigSchema.NAMESPACE, "netmask");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Netmask clone() {
        return (Netmask)cloneContent(new Netmask());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Netmask cloneShallow() {
        return (Netmask)cloneShallowContent(new Netmask());
    }

    public Netmask cloneWithoutChildren() {
        return new Netmask();
    }


    /**
     * Support method for addChild.
     * Adds a child to this object.
     * 
     * @param child The child to add
     */
    public void addChild(Element child) {
        super.addChild(child);
    }

}
