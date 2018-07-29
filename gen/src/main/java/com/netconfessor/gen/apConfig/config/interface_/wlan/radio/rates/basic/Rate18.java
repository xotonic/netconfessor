
package com.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.basic;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.Enum_0_1;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;

/**
 * 18 mbps rate
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Rate18 extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_0_1 value() {
        return (Enum_0_1) getValue();
    }

    /**
     * Sets the value  leaf "rate-18",
     * @param rate18Value used during instantiation.
     */
    public void value(Enum_0_1 rate18Value) throws JNCException {
        setValue(rate18Value);
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
     * Constructor for an empty Rate18 object.
     */
    public Rate18() {
        super(ApConfigSchema.NAMESPACE, "rate-18");
    }

    /**
     * Constructor for an empty Rate18 object.
     */
    public Rate18(Enum_0_1 value) {
        super(ApConfigSchema.NAMESPACE, "rate-18");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Rate18 clone() {
        return (Rate18)cloneContent(new Rate18());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Rate18 cloneShallow() {
        return (Rate18)cloneShallowContent(new Rate18());
    }

    public Rate18 cloneWithoutChildren() {
        return new Rate18();
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
