
package io.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.basic;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.Enum_0_1;

/**
 * 24 mbps rate
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Rate24 extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_0_1 value() {
        return (Enum_0_1) getValue();
    }

    /**
     * Sets the value  leaf "rate-24",
     * @param rate24Value used during instantiation.
     */
    public void value(Enum_0_1 rate24Value) throws JNCException {
        setValue(rate24Value);
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
     * Constructor for an empty Rate24 object.
     */
    public Rate24() {
        super(ApConfigSchema.NAMESPACE, "rate-24");
    }

    /**
     * Constructor for an empty Rate24 object.
     */
    public Rate24(Enum_0_1 value) {
        super(ApConfigSchema.NAMESPACE, "rate-24");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Rate24 clone() {
        return (Rate24)cloneContent(new Rate24());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Rate24 cloneShallow() {
        return (Rate24)cloneShallowContent(new Rate24());
    }

    public Rate24 cloneWithoutChildren() {
        return new Rate24();
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
