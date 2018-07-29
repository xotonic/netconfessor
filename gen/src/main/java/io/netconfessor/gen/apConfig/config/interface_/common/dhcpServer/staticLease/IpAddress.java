
package io.netconfessor.gen.apConfig.config.interface_.common.dhcpServer.staticLease;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.gen.apConfig.ApConfigSchema;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class IpAddress extends Leaf {

    private static final long serialVersionUID = 1L;

    public io.netconfessor.gen.ietfInetTypes.IpAddress value() {
        return (io.netconfessor.gen.ietfInetTypes.IpAddress) getValue();
    }

    /**
     * Sets the value  leaf "ip-address",
     * @param ipAddressValue used during instantiation.
     */
    public void value(io.netconfessor.gen.ietfInetTypes.IpAddress ipAddressValue)
            throws JNCException {
        setValue(ipAddressValue);
    }

    public io.netconfessor.gen.ietfInetTypes.IpAddress defaultValue()
            throws JNCException {
        return null;
    }

    public boolean hasDefaultValue() {
        return false;
    }

    public void instantiateValue(String stringRepresentation)
            throws JNCException {
        value(new io.netconfessor.gen.ietfInetTypes.IpAddress(stringRepresentation));
    }

    public io.netconfessor.gen.ietfInetTypes.IpAddress createValue(String stringRepresentation)
            throws JNCException {
        return new io.netconfessor.gen.ietfInetTypes.IpAddress(stringRepresentation);
    }

    public Class<io.netconfessor.gen.ietfInetTypes.IpAddress> valueClass() {
        return io.netconfessor.gen.ietfInetTypes.IpAddress.class;
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
    public IpAddress(io.netconfessor.gen.ietfInetTypes.IpAddress value) {
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
