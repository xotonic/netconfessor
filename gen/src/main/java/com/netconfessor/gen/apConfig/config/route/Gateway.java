
package com.netconfessor.gen.apConfig.config.route;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.ietfInetTypes.IpAddress;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;

/**
 * Route gateway
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Gateway extends Leaf {

    private static final long serialVersionUID = 1L;

    public IpAddress value() {
        return (IpAddress) getValue();
    }

    /**
     * Sets the value  leaf "gateway",
     * @param gatewayValue used during instantiation.
     */
    public void value(IpAddress gatewayValue) throws JNCException {
        setValue(gatewayValue);
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
     * Constructor for an empty Gateway object.
     */
    public Gateway() {
        super(ApConfigSchema.NAMESPACE, "gateway");
    }

    /**
     * Constructor for an empty Gateway object.
     */
    public Gateway(IpAddress value) {
        super(ApConfigSchema.NAMESPACE, "gateway");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Gateway clone() {
        return (Gateway)cloneContent(new Gateway());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Gateway cloneShallow() {
        return (Gateway)cloneShallowContent(new Gateway());
    }

    public Gateway cloneWithoutChildren() {
        return new Gateway();
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
