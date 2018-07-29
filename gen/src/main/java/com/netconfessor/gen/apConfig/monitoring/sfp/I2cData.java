
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
public class I2cData extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "i2c-data",
     * @param i2cDataValue used during instantiation.
     */
    public void value(YangString i2cDataValue) throws JNCException {
        setValue(i2cDataValue);
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
     * Constructor for an empty I2cData object.
     */
    public I2cData() {
        super(ApConfigSchema.NAMESPACE, "i2c-data");
    }

    /**
     * Constructor for an empty I2cData object.
     */
    public I2cData(YangString value) {
        super(ApConfigSchema.NAMESPACE, "i2c-data");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public I2cData clone() {
        return (I2cData)cloneContent(new I2cData());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public I2cData cloneShallow() {
        return (I2cData)cloneShallowContent(new I2cData());
    }

    public I2cData cloneWithoutChildren() {
        return new I2cData();
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
