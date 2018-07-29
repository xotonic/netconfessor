
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
public class EndIp extends Leaf {

    private static final long serialVersionUID = 1L;

    public IpAddress value() {
        return (IpAddress) getValue();
    }

    /**
     * Sets the value  leaf "end-ip",
     * @param endIpValue used during instantiation.
     */
    public void value(IpAddress endIpValue) throws JNCException {
        setValue(endIpValue);
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
     * Constructor for an empty EndIp object.
     */
    public EndIp() {
        super(ApConfigSchema.NAMESPACE, "end-ip");
    }

    /**
     * Constructor for an empty EndIp object.
     */
    public EndIp(IpAddress value) {
        super(ApConfigSchema.NAMESPACE, "end-ip");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public EndIp clone() {
        return (EndIp)cloneContent(new EndIp());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public EndIp cloneShallow() {
        return (EndIp)cloneShallowContent(new EndIp());
    }

    public EndIp cloneWithoutChildren() {
        return new EndIp();
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
