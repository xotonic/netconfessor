
package com.netconfessor.gen.apConfig.config.interface_.common;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.ietfInetTypes.IpAddress;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;

/**
 * Static IP address
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class StaticIp extends Leaf {

    private static final long serialVersionUID = 1L;

    public IpAddress value() {
        return (IpAddress) getValue();
    }

    /**
     * Sets the value  leaf "static-ip",
     * @param staticIpValue used during instantiation.
     */
    public void value(IpAddress staticIpValue) throws JNCException {
        setValue(staticIpValue);
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
     * Constructor for an empty StaticIp object.
     */
    public StaticIp() {
        super(ApConfigSchema.NAMESPACE, "static-ip");
    }

    /**
     * Constructor for an empty StaticIp object.
     */
    public StaticIp(IpAddress value) {
        super(ApConfigSchema.NAMESPACE, "static-ip");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public StaticIp clone() {
        return (StaticIp)cloneContent(new StaticIp());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public StaticIp cloneShallow() {
        return (StaticIp)cloneShallowContent(new StaticIp());
    }

    public StaticIp cloneWithoutChildren() {
        return new StaticIp();
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
