
package io.netconfessor.gen.apConfig.monitoring.information;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangString;
import io.netconfessor.gen.apConfig.ApConfigSchema;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class FactorySerialNumber extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "factory-serial-number",
     * @param factorySerialNumberValue used during instantiation.
     */
    public void value(YangString factorySerialNumberValue) throws JNCException {
        setValue(factorySerialNumberValue);
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
     * Constructor for an empty FactorySerialNumber object.
     */
    public FactorySerialNumber() {
        super(ApConfigSchema.NAMESPACE, "factory-serial-number");
    }

    /**
     * Constructor for an empty FactorySerialNumber object.
     */
    public FactorySerialNumber(YangString value) {
        super(ApConfigSchema.NAMESPACE, "factory-serial-number");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public FactorySerialNumber clone() {
        return (FactorySerialNumber)cloneContent(new FactorySerialNumber());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public FactorySerialNumber cloneShallow() {
        return (FactorySerialNumber)cloneShallowContent(new FactorySerialNumber());
    }

    public FactorySerialNumber cloneWithoutChildren() {
        return new FactorySerialNumber();
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
