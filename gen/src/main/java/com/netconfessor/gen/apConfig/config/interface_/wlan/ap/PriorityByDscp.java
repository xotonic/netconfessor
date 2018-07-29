
package com.netconfessor.gen.apConfig.config.interface_.wlan.ap;

import com.netconfessor.gen.apConfig.ApConfigSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangInt32;

/**
 * Use DSCP for priority packets
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class PriorityByDscp extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangInt32 value() {
        return (YangInt32) getValue();
    }

    /**
     * Sets the value  leaf "priority-by-dscp",
     * @param priorityByDscpValue used during instantiation.
     */
    public void value(YangInt32 priorityByDscpValue) throws JNCException {
        setValue(priorityByDscpValue);
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
     * Constructor for an empty PriorityByDscp object.
     */
    public PriorityByDscp() {
        super(ApConfigSchema.NAMESPACE, "priority-by-dscp");
    }

    /**
     * Constructor for an empty PriorityByDscp object.
     */
    public PriorityByDscp(YangInt32 value) {
        super(ApConfigSchema.NAMESPACE, "priority-by-dscp");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public PriorityByDscp clone() {
        return (PriorityByDscp)cloneContent(new PriorityByDscp());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public PriorityByDscp cloneShallow() {
        return (PriorityByDscp)cloneShallowContent(new PriorityByDscp());
    }

    public PriorityByDscp cloneWithoutChildren() {
        return new PriorityByDscp();
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
