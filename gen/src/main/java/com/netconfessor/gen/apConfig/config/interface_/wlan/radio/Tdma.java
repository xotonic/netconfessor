
package com.netconfessor.gen.apConfig.config.interface_.wlan.radio;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.Enum_0_1;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;

/**
 * TDMA mode
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Tdma extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_0_1 value() {
        return (Enum_0_1) getValue();
    }

    /**
     * Sets the value  leaf "tdma",
     * @param tdmaValue used during instantiation.
     */
    public void value(Enum_0_1 tdmaValue) throws JNCException {
        setValue(tdmaValue);
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
     * Constructor for an empty Tdma object.
     */
    public Tdma() {
        super(ApConfigSchema.NAMESPACE, "tdma");
    }

    /**
     * Constructor for an empty Tdma object.
     */
    public Tdma(Enum_0_1 value) {
        super(ApConfigSchema.NAMESPACE, "tdma");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Tdma clone() {
        return (Tdma)cloneContent(new Tdma());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Tdma cloneShallow() {
        return (Tdma)cloneShallowContent(new Tdma());
    }

    public Tdma cloneWithoutChildren() {
        return new Tdma();
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
