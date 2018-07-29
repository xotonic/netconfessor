
package io.netconfessor.gen.apConfig.config.interface_.common.dhcpServer;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangInt32;
import io.netconfessor.gen.apConfig.ApConfigSchema;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class LeaseTime extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangInt32 value() {
        return (YangInt32) getValue();
    }

    /**
     * Sets the value  leaf "lease-time",
     * @param leaseTimeValue used during instantiation.
     */
    public void value(YangInt32 leaseTimeValue) throws JNCException {
        setValue(leaseTimeValue);
    }

    public YangInt32 defaultValue() throws JNCException {
        return null;
    }

    public boolean hasDefaultValue() {
        return false;
    }

    public void instantiateValue(String stringRepresentation)
            throws JNCException {
        value(new YangInt32(stringRepresentation));
    }

    public YangInt32 createValue(String stringRepresentation)
            throws JNCException {
        return new YangInt32(stringRepresentation);
    }

    public Class<YangInt32> valueClass() {
        return YangInt32.class;
    }

    /**
     * Constructor for an empty LeaseTime object.
     */
    public LeaseTime() {
        super(ApConfigSchema.NAMESPACE, "lease-time");
    }

    /**
     * Constructor for an empty LeaseTime object.
     */
    public LeaseTime(YangInt32 value) {
        super(ApConfigSchema.NAMESPACE, "lease-time");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public LeaseTime clone() {
        return (LeaseTime)cloneContent(new LeaseTime());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public LeaseTime cloneShallow() {
        return (LeaseTime)cloneShallowContent(new LeaseTime());
    }

    public LeaseTime cloneWithoutChildren() {
        return new LeaseTime();
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
