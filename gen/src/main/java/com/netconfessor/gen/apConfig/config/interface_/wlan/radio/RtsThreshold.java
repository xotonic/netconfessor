
package com.netconfessor.gen.apConfig.config.interface_.wlan.radio;

import com.netconfessor.gen.apConfig.ApConfigSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangInt32;

/**
 * RTS threshold
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class RtsThreshold extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangInt32 value() {
        return (YangInt32) getValue();
    }

    /**
     * Sets the value  leaf "rts-threshold",
     * @param rtsThresholdValue used during instantiation.
     */
    public void value(YangInt32 rtsThresholdValue) throws JNCException {
        setValue(rtsThresholdValue);
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
     * Constructor for an empty RtsThreshold object.
     */
    public RtsThreshold() {
        super(ApConfigSchema.NAMESPACE, "rts-threshold");
    }

    /**
     * Constructor for an empty RtsThreshold object.
     */
    public RtsThreshold(YangInt32 value) {
        super(ApConfigSchema.NAMESPACE, "rts-threshold");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public RtsThreshold clone() {
        return (RtsThreshold)cloneContent(new RtsThreshold());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public RtsThreshold cloneShallow() {
        return (RtsThreshold)cloneShallowContent(new RtsThreshold());
    }

    public RtsThreshold cloneWithoutChildren() {
        return new RtsThreshold();
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
