
package com.netconfessor.gen.apConfig.config.interface_.common.dhcpServer;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.ietfInetTypes.IpAddress;

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
public class Dns extends Leaf {

    private static final long serialVersionUID = 1L;

    public IpAddress value() {
        return (IpAddress) getValue();
    }

    /**
     * Sets the value  leaf "dns",
     * @param dnsValue used during instantiation.
     */
    public void value(IpAddress dnsValue) throws JNCException {
        setValue(dnsValue);
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
     * Constructor for an empty Dns object.
     */
    public Dns() {
        super(ApConfigSchema.NAMESPACE, "dns");
    }

    /**
     * Constructor for an empty Dns object.
     */
    public Dns(IpAddress value) {
        super(ApConfigSchema.NAMESPACE, "dns");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Dns clone() {
        return (Dns)cloneContent(new Dns());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Dns cloneShallow() {
        return (Dns)cloneShallowContent(new Dns());
    }

    public Dns cloneWithoutChildren() {
        return new Dns();
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
