
package com.netconfessor.gen.apConfig.config.interface_.wlan.radio;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.Enum_ru_us;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;

/**
 * Country code
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Country extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_ru_us value() {
        return (Enum_ru_us) getValue();
    }

    /**
     * Sets the value  leaf "country",
     * @param countryValue used during instantiation.
     */
    public void value(Enum_ru_us countryValue) throws JNCException {
        setValue(countryValue);
    }

    public Enum_ru_us defaultValue() throws JNCException {
        return null;
    }

    public boolean hasDefaultValue() {
        return false;
    }

    public void instantiateValue(String stringRepresentation)
            throws JNCException {
        value(new Enum_ru_us(stringRepresentation));
    }

    public Enum_ru_us createValue(String stringRepresentation)
            throws JNCException {
        return new Enum_ru_us(stringRepresentation);
    }

    public Class<Enum_ru_us> valueClass() {
        return Enum_ru_us.class;
    }

    /**
     * Constructor for an empty Country object.
     */
    public Country() {
        super(ApConfigSchema.NAMESPACE, "country");
    }

    /**
     * Constructor for an empty Country object.
     */
    public Country(Enum_ru_us value) {
        super(ApConfigSchema.NAMESPACE, "country");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Country clone() {
        return (Country)cloneContent(new Country());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Country cloneShallow() {
        return (Country)cloneShallowContent(new Country());
    }

    public Country cloneWithoutChildren() {
        return new Country();
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
