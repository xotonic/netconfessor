
package io.netconfessor.gen.apConfig.config.interface_.wlan.radio;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.Enum_0_1;

/**
 * Short preamble
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class ShortPreamble extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_0_1 value() {
        return (Enum_0_1) getValue();
    }

    /**
     * Sets the value  leaf "short-preamble",
     * @param shortPreambleValue used during instantiation.
     */
    public void value(Enum_0_1 shortPreambleValue) throws JNCException {
        setValue(shortPreambleValue);
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
     * Constructor for an empty ShortPreamble object.
     */
    public ShortPreamble() {
        super(ApConfigSchema.NAMESPACE, "short-preamble");
    }

    /**
     * Constructor for an empty ShortPreamble object.
     */
    public ShortPreamble(Enum_0_1 value) {
        super(ApConfigSchema.NAMESPACE, "short-preamble");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public ShortPreamble clone() {
        return (ShortPreamble)cloneContent(new ShortPreamble());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public ShortPreamble cloneShallow() {
        return (ShortPreamble)cloneShallowContent(new ShortPreamble());
    }

    public ShortPreamble cloneWithoutChildren() {
        return new ShortPreamble();
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
