
package io.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.supported;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.Enum_0_1;

/**
 * 48 mbps rate
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Rate48 extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_0_1 value() {
        return (Enum_0_1) getValue();
    }

    /**
     * Sets the value  leaf "rate-48",
     * @param rate48Value used during instantiation.
     */
    public void value(Enum_0_1 rate48Value) throws JNCException {
        setValue(rate48Value);
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
     * Constructor for an empty Rate48 object.
     */
    public Rate48() {
        super(ApConfigSchema.NAMESPACE, "rate-48");
    }

    /**
     * Constructor for an empty Rate48 object.
     */
    public Rate48(Enum_0_1 value) {
        super(ApConfigSchema.NAMESPACE, "rate-48");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Rate48 clone() {
        return (Rate48)cloneContent(new Rate48());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Rate48 cloneShallow() {
        return (Rate48)cloneShallowContent(new Rate48());
    }

    public Rate48 cloneWithoutChildren() {
        return new Rate48();
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