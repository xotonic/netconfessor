
package com.netconfessor.gen.apConfig.config.interface_.wlan.sta;

import com.netconfessor.gen.apConfig.ApConfigSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangInt32;

/**
 * Client side shaper limit
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class ShaperLimit extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangInt32 value() {
        return (YangInt32) getValue();
    }

    /**
     * Sets the value  leaf "shaper-limit",
     * @param shaperLimitValue used during instantiation.
     */
    public void value(YangInt32 shaperLimitValue) throws JNCException {
        setValue(shaperLimitValue);
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
     * Constructor for an empty ShaperLimit object.
     */
    public ShaperLimit() {
        super(ApConfigSchema.NAMESPACE, "shaper-limit");
    }

    /**
     * Constructor for an empty ShaperLimit object.
     */
    public ShaperLimit(YangInt32 value) {
        super(ApConfigSchema.NAMESPACE, "shaper-limit");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public ShaperLimit clone() {
        return (ShaperLimit)cloneContent(new ShaperLimit());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public ShaperLimit cloneShallow() {
        return (ShaperLimit)cloneShallowContent(new ShaperLimit());
    }

    public ShaperLimit cloneWithoutChildren() {
        return new ShaperLimit();
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
