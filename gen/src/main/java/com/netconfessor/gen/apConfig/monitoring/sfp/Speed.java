
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
public class Speed extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "speed",
     * @param speedValue used during instantiation.
     */
    public void value(YangString speedValue) throws JNCException {
        setValue(speedValue);
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
     * Constructor for an empty Speed object.
     */
    public Speed() {
        super(ApConfigSchema.NAMESPACE, "speed");
    }

    /**
     * Constructor for an empty Speed object.
     */
    public Speed(YangString value) {
        super(ApConfigSchema.NAMESPACE, "speed");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Speed clone() {
        return (Speed)cloneContent(new Speed());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Speed cloneShallow() {
        return (Speed)cloneShallowContent(new Speed());
    }

    public Speed cloneWithoutChildren() {
        return new Speed();
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
