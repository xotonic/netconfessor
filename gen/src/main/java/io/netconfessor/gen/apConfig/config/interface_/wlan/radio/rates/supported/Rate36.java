
package io.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.supported;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.Enum_0_1;

/**
 * 36 mbps rate
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Rate36 extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_0_1 value() {
        return (Enum_0_1) getValue();
    }

    /**
     * Sets the value  leaf "rate-36",
     * @param rate36Value used during instantiation.
     */
    public void value(Enum_0_1 rate36Value) throws JNCException {
        setValue(rate36Value);
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
     * Constructor for an empty Rate36 object.
     */
    public Rate36() {
        super(ApConfigSchema.NAMESPACE, "rate-36");
    }

    /**
     * Constructor for an empty Rate36 object.
     */
    public Rate36(Enum_0_1 value) {
        super(ApConfigSchema.NAMESPACE, "rate-36");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Rate36 clone() {
        return (Rate36)cloneContent(new Rate36());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Rate36 cloneShallow() {
        return (Rate36)cloneShallowContent(new Rate36());
    }

    public Rate36 cloneWithoutChildren() {
        return new Rate36();
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
