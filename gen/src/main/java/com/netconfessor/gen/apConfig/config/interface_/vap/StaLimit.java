
package com.netconfessor.gen.apConfig.config.interface_.vap;

import com.netconfessor.gen.apConfig.ApConfigSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangInt32;

/**
 * STA count limit
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class StaLimit extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangInt32 value() {
        return (YangInt32) getValue();
    }

    /**
     * Sets the value  leaf "sta-limit",
     * @param staLimitValue used during instantiation.
     */
    public void value(YangInt32 staLimitValue) throws JNCException {
        setValue(staLimitValue);
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
     * Constructor for an empty StaLimit object.
     */
    public StaLimit() {
        super(ApConfigSchema.NAMESPACE, "sta-limit");
    }

    /**
     * Constructor for an empty StaLimit object.
     */
    public StaLimit(YangInt32 value) {
        super(ApConfigSchema.NAMESPACE, "sta-limit");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public StaLimit clone() {
        return (StaLimit)cloneContent(new StaLimit());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public StaLimit cloneShallow() {
        return (StaLimit)cloneShallowContent(new StaLimit());
    }

    public StaLimit cloneWithoutChildren() {
        return new StaLimit();
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
