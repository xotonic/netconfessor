
package com.netconfessor.gen.apConfig.config.interface_.common.dhcpServer.staticLease;

import com.netconfessor.gen.apConfig.ApConfigSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class IpAddress extends Leaf {

    private static final long serialVersionUID = 1L;

    public com.netconfessor.gen.ietfInetTypes.IpAddress value() {
        return (com.netconfessor.gen.ietfInetTypes.IpAddress) getValue();
    }

    /**
     * Sets the value  leaf "ip-address",
     * @param ipAddressValue used during instantiation.
     */
    public void value(com.netconfessor.gen.ietfInetTypes.IpAddress ipAddressValue)
            throws JNCException {
        setValue(ipAddressValue);
    }

    public com.netconfessor.gen.ietfInetTypes.IpAddress defaultValue()
            throws JNCException {
        return null;
    }

    public boolean hasDefaultValue() {
        return false;
    }

    public void instantiateValue(String stringRepresentation)
            throws JNCException {
        value(new com.netconfessor.gen.ietfInetTypes.IpAddress(stringRepresentation));
    }

    public com.netconfessor.gen.ietfInetTypes.IpAddress createValue(String stringRepresentation)
            throws JNCException {
        return new com.netconfessor.gen.ietfInetTypes.IpAddress(stringRepresentation);
    }

    public Class<com.netconfessor.gen.ietfInetTypes.IpAddress> valueClass() {
        return com.netconfessor.gen.ietfInetTypes.IpAddress.class;
    }

    /**
     * Constructor for an empty IpAddress object.
     */
    public IpAddress() {
        super(ApConfigSchema.NAMESPACE, "ip-address");
    }

    /**
     * Constructor for an empty IpAddress object.
     */
    public IpAddress(com.netconfessor.gen.ietfInetTypes.IpAddress value) {
        super(ApConfigSchema.NAMESPACE, "ip-address");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public IpAddress clone() {
        return (IpAddress)cloneContent(new IpAddress());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public IpAddress cloneShallow() {
        return (IpAddress)cloneShallowContent(new IpAddress());
    }

    public IpAddress cloneWithoutChildren() {
        return new IpAddress();
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
