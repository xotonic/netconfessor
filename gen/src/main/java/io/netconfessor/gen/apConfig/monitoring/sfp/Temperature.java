
package io.netconfessor.gen.apConfig.monitoring.sfp;

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
public class Temperature extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "temperature",
     * @param temperatureValue used during instantiation.
     */
    public void value(YangString temperatureValue) throws JNCException {
        setValue(temperatureValue);
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
     * Constructor for an empty Temperature object.
     */
    public Temperature() {
        super(ApConfigSchema.NAMESPACE, "temperature");
    }

    /**
     * Constructor for an empty Temperature object.
     */
    public Temperature(YangString value) {
        super(ApConfigSchema.NAMESPACE, "temperature");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Temperature clone() {
        return (Temperature)cloneContent(new Temperature());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Temperature cloneShallow() {
        return (Temperature)cloneShallowContent(new Temperature());
    }

    public Temperature cloneWithoutChildren() {
        return new Temperature();
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