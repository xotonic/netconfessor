
package io.netconfessor.gen.apConfig.config.interface_.wlan.radio;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.Enum_upper_lower;

/**
 * Primary channel (applicable when bandwidth is 40 MHz)
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class ControlSideband extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_upper_lower value() {
        return (Enum_upper_lower) getValue();
    }

    /**
     * Sets the value  leaf "control-sideband",
     * @param controlSidebandValue used during instantiation.
     */
    public void value(Enum_upper_lower controlSidebandValue)
            throws JNCException {
        setValue(controlSidebandValue);
    }

    public Enum_upper_lower defaultValue() throws JNCException {
        return null;
    }

    public boolean hasDefaultValue() {
        return false;
    }

    public void instantiateValue(String stringRepresentation)
            throws JNCException {
        value(new Enum_upper_lower(stringRepresentation));
    }

    public Enum_upper_lower createValue(String stringRepresentation)
            throws JNCException {
        return new Enum_upper_lower(stringRepresentation);
    }

    public Class<Enum_upper_lower> valueClass() {
        return Enum_upper_lower.class;
    }

    /**
     * Constructor for an empty ControlSideband object.
     */
    public ControlSideband() {
        super(ApConfigSchema.NAMESPACE, "control-sideband");
    }

    /**
     * Constructor for an empty ControlSideband object.
     */
    public ControlSideband(Enum_upper_lower value) {
        super(ApConfigSchema.NAMESPACE, "control-sideband");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public ControlSideband clone() {
        return (ControlSideband)cloneContent(new ControlSideband());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public ControlSideband cloneShallow() {
        return (ControlSideband)cloneShallowContent(new ControlSideband());
    }

    public ControlSideband cloneWithoutChildren() {
        return new ControlSideband();
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
