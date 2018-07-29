
package com.netconfessor.gen.apConfig.config.dateTime.common;

import com.netconfessor.gen.apConfig.ApConfigSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangString;

/**
 * Daylight saving time stop
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Dstend extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "dstend",
     * @param dstendValue used during instantiation.
     */
    public void value(YangString dstendValue) throws JNCException {
        setValue(dstendValue);
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
     * Constructor for an empty Dstend object.
     */
    public Dstend() {
        super(ApConfigSchema.NAMESPACE, "dstend");
    }

    /**
     * Constructor for an empty Dstend object.
     */
    public Dstend(YangString value) {
        super(ApConfigSchema.NAMESPACE, "dstend");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Dstend clone() {
        return (Dstend)cloneContent(new Dstend());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Dstend cloneShallow() {
        return (Dstend)cloneShallowContent(new Dstend());
    }

    public Dstend cloneWithoutChildren() {
        return new Dstend();
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
