
package com.netconfessor.gen.apConfig.config.dateTime.common;

import com.netconfessor.gen.apConfig.ApConfigSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangInt32;

/**
 * Daylight saving time offset
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Dstoffset extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangInt32 value() {
        return (YangInt32) getValue();
    }

    /**
     * Sets the value  leaf "dstoffset",
     * @param dstoffsetValue used during instantiation.
     */
    public void value(YangInt32 dstoffsetValue) throws JNCException {
        setValue(dstoffsetValue);
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
     * Constructor for an empty Dstoffset object.
     */
    public Dstoffset() {
        super(ApConfigSchema.NAMESPACE, "dstoffset");
    }

    /**
     * Constructor for an empty Dstoffset object.
     */
    public Dstoffset(YangInt32 value) {
        super(ApConfigSchema.NAMESPACE, "dstoffset");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Dstoffset clone() {
        return (Dstoffset)cloneContent(new Dstoffset());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Dstoffset cloneShallow() {
        return (Dstoffset)cloneShallowContent(new Dstoffset());
    }

    public Dstoffset cloneWithoutChildren() {
        return new Dstoffset();
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
