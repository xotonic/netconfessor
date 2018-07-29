
package com.netconfessor.gen.apConfig.config.interface_.common;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.ietfInetTypes.IpAddress;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;

/**
 * DNS server IP address
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class DnsServer1 extends Leaf {

    private static final long serialVersionUID = 1L;

    public IpAddress value() {
        return (IpAddress) getValue();
    }

    /**
     * Sets the value  leaf "dns-server-1",
     * @param dnsServer1Value used during instantiation.
     */
    public void value(IpAddress dnsServer1Value) throws JNCException {
        setValue(dnsServer1Value);
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
     * Constructor for an empty DnsServer1 object.
     */
    public DnsServer1() {
        super(ApConfigSchema.NAMESPACE, "dns-server-1");
    }

    /**
     * Constructor for an empty DnsServer1 object.
     */
    public DnsServer1(IpAddress value) {
        super(ApConfigSchema.NAMESPACE, "dns-server-1");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public DnsServer1 clone() {
        return (DnsServer1)cloneContent(new DnsServer1());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public DnsServer1 cloneShallow() {
        return (DnsServer1)cloneShallowContent(new DnsServer1());
    }

    public DnsServer1 cloneWithoutChildren() {
        return new DnsServer1();
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
