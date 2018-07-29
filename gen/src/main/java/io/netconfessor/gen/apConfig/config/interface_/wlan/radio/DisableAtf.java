
package io.netconfessor.gen.apConfig.config.interface_.wlan.radio;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.Enum_0_1;

/**
 * Disable ATF
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class DisableAtf extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_0_1 value() {
        return (Enum_0_1) getValue();
    }

    /**
     * Sets the value  leaf "disable-atf",
     * @param disableAtfValue used during instantiation.
     */
    public void value(Enum_0_1 disableAtfValue) throws JNCException {
        setValue(disableAtfValue);
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
     * Constructor for an empty DisableAtf object.
     */
    public DisableAtf() {
        super(ApConfigSchema.NAMESPACE, "disable-atf");
    }

    /**
     * Constructor for an empty DisableAtf object.
     */
    public DisableAtf(Enum_0_1 value) {
        super(ApConfigSchema.NAMESPACE, "disable-atf");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public DisableAtf clone() {
        return (DisableAtf)cloneContent(new DisableAtf());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public DisableAtf cloneShallow() {
        return (DisableAtf)cloneShallowContent(new DisableAtf());
    }

    public DisableAtf cloneWithoutChildren() {
        return new DisableAtf();
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
