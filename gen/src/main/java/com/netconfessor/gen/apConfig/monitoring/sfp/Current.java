
package com.netconfessor.gen.apConfig.monitoring.sfp;

import com.netconfessor.gen.apConfig.ApConfigSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangString;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Current extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "current",
     * @param currentValue used during instantiation.
     */
    public void value(YangString currentValue) throws JNCException {
        setValue(currentValue);
    }

    public YangString defaultValue() throws JNCException {
        return null;
    }

    public boolean hasDefaultValue() {
        return false;
    }

    public void instantiateValue(String stringRepresentation)
            throws JNCException {
        value(new YangString(stringRepresentation));
    }

    public YangString createValue(String stringRepresentation)
            throws JNCException {
        return new YangString(stringRepresentation);
    }

    public Class<YangString> valueClass() {
        return YangString.class;
    }

    /**
     * Constructor for an empty Current object.
     */
    public Current() {
        super(ApConfigSchema.NAMESPACE, "current");
    }

    /**
     * Constructor for an empty Current object.
     */
    public Current(YangString value) {
        super(ApConfigSchema.NAMESPACE, "current");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Current clone() {
        return (Current)cloneContent(new Current());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Current cloneShallow() {
        return (Current)cloneShallowContent(new Current());
    }

    public Current cloneWithoutChildren() {
        return new Current();
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
