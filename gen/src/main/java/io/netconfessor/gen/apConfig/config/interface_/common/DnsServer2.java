
package io.netconfessor.gen.apConfig.config.interface_.common;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.ietfInetTypes.IpAddress;

/**
 * DNS server IP address
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class DnsServer2 extends Leaf {

    private static final long serialVersionUID = 1L;

    public IpAddress value() {
        return (IpAddress) getValue();
    }

    /**
     * Sets the value  leaf "dns-server-2",
     * @param dnsServer2Value used during instantiation.
     */
    public void value(IpAddress dnsServer2Value) throws JNCException {
        setValue(dnsServer2Value);
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
     * Constructor for an empty DnsServer2 object.
     */
    public DnsServer2() {
        super(ApConfigSchema.NAMESPACE, "dns-server-2");
    }

    /**
     * Constructor for an empty DnsServer2 object.
     */
    public DnsServer2(IpAddress value) {
        super(ApConfigSchema.NAMESPACE, "dns-server-2");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public DnsServer2 clone() {
        return (DnsServer2)cloneContent(new DnsServer2());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public DnsServer2 cloneShallow() {
        return (DnsServer2)cloneShallowContent(new DnsServer2());
    }

    public DnsServer2 cloneWithoutChildren() {
        return new DnsServer2();
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
