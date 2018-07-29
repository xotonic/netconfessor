
package io.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.supported;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.Enum_0_1;

/**
 * 9 mbps rate
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Rate9 extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_0_1 value() {
        return (Enum_0_1) getValue();
    }

    /**
     * Sets the value  leaf "rate-9",
     * @param rate9Value used during instantiation.
     */
    public void value(Enum_0_1 rate9Value) throws JNCException {
        setValue(rate9Value);
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
     * Constructor for an empty Rate9 object.
     */
    public Rate9() {
        super(ApConfigSchema.NAMESPACE, "rate-9");
    }

    /**
     * Constructor for an empty Rate9 object.
     */
    public Rate9(Enum_0_1 value) {
        super(ApConfigSchema.NAMESPACE, "rate-9");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Rate9 clone() {
        return (Rate9)cloneContent(new Rate9());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Rate9 cloneShallow() {
        return (Rate9)cloneShallowContent(new Rate9());
    }

    public Rate9 cloneWithoutChildren() {
        return new Rate9();
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
