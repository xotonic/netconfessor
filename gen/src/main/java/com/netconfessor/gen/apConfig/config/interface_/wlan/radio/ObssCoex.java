
package com.netconfessor.gen.apConfig.config.interface_.wlan.radio;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.Enum_0_1;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;

/**
 * OBSS coexistance
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class ObssCoex extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_0_1 value() {
        return (Enum_0_1) getValue();
    }

    /**
     * Sets the value  leaf "obss-coex",
     * @param obssCoexValue used during instantiation.
     */
    public void value(Enum_0_1 obssCoexValue) throws JNCException {
        setValue(obssCoexValue);
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
     * Constructor for an empty ObssCoex object.
     */
    public ObssCoex() {
        super(ApConfigSchema.NAMESPACE, "obss-coex");
    }

    /**
     * Constructor for an empty ObssCoex object.
     */
    public ObssCoex(Enum_0_1 value) {
        super(ApConfigSchema.NAMESPACE, "obss-coex");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public ObssCoex clone() {
        return (ObssCoex)cloneContent(new ObssCoex());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public ObssCoex cloneShallow() {
        return (ObssCoex)cloneShallowContent(new ObssCoex());
    }

    public ObssCoex cloneWithoutChildren() {
        return new ObssCoex();
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
