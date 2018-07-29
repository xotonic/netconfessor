
package com.netconfessor.gen.apConfig.config.interface_.wlan.radio;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.Enum_0_1;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;

/**
 * Aggregation
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Aggregation extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_0_1 value() {
        return (Enum_0_1) getValue();
    }

    /**
     * Sets the value  leaf "aggregation",
     * @param aggregationValue used during instantiation.
     */
    public void value(Enum_0_1 aggregationValue) throws JNCException {
        setValue(aggregationValue);
    }

    public Enum_0_1 defaultValue() throws JNCException {
        return null;
    }

    public boolean hasDefaultValue() {
        return false;
    }

    public void instantiateValue(String stringRepresentation)
            throws JNCException {
        value(new Enum_0_1(stringRepresentation));
    }

    public Enum_0_1 createValue(String stringRepresentation)
            throws JNCException {
        return new Enum_0_1(stringRepresentation);
    }

    public Class<Enum_0_1> valueClass() {
        return Enum_0_1.class;
    }

    /**
     * Constructor for an empty Aggregation object.
     */
    public Aggregation() {
        super(ApConfigSchema.NAMESPACE, "aggregation");
    }

    /**
     * Constructor for an empty Aggregation object.
     */
    public Aggregation(Enum_0_1 value) {
        super(ApConfigSchema.NAMESPACE, "aggregation");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Aggregation clone() {
        return (Aggregation)cloneContent(new Aggregation());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Aggregation cloneShallow() {
        return (Aggregation)cloneShallowContent(new Aggregation());
    }

    public Aggregation cloneWithoutChildren() {
        return new Aggregation();
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
