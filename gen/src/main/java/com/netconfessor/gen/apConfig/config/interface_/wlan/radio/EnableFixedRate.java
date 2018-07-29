
package com.netconfessor.gen.apConfig.config.interface_.wlan.radio;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.Enum_0_1;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;

/**
 * Enable fixed TX rate
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class EnableFixedRate extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_0_1 value() {
        return (Enum_0_1) getValue();
    }

    /**
     * Sets the value  leaf "enable-fixed-rate",
     * @param enableFixedRateValue used during instantiation.
     */
    public void value(Enum_0_1 enableFixedRateValue) throws JNCException {
        setValue(enableFixedRateValue);
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
     * Constructor for an empty EnableFixedRate object.
     */
    public EnableFixedRate() {
        super(ApConfigSchema.NAMESPACE, "enable-fixed-rate");
    }

    /**
     * Constructor for an empty EnableFixedRate object.
     */
    public EnableFixedRate(Enum_0_1 value) {
        super(ApConfigSchema.NAMESPACE, "enable-fixed-rate");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public EnableFixedRate clone() {
        return (EnableFixedRate)cloneContent(new EnableFixedRate());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public EnableFixedRate cloneShallow() {
        return (EnableFixedRate)cloneShallowContent(new EnableFixedRate());
    }

    public EnableFixedRate cloneWithoutChildren() {
        return new EnableFixedRate();
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
