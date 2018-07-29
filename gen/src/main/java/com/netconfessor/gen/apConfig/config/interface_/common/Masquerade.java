
package com.netconfessor.gen.apConfig.config.interface_.common;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.Enum_0_1;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;

/**
 * enable masquerading on interface
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Masquerade extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_0_1 value() {
        return (Enum_0_1) getValue();
    }

    /**
     * Sets the value  leaf "masquerade",
     * @param masqueradeValue used during instantiation.
     */
    public void value(Enum_0_1 masqueradeValue) throws JNCException {
        setValue(masqueradeValue);
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
     * Constructor for an empty Masquerade object.
     */
    public Masquerade() {
        super(ApConfigSchema.NAMESPACE, "masquerade");
    }

    /**
     * Constructor for an empty Masquerade object.
     */
    public Masquerade(Enum_0_1 value) {
        super(ApConfigSchema.NAMESPACE, "masquerade");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Masquerade clone() {
        return (Masquerade)cloneContent(new Masquerade());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Masquerade cloneShallow() {
        return (Masquerade)cloneShallowContent(new Masquerade());
    }

    public Masquerade cloneWithoutChildren() {
        return new Masquerade();
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
