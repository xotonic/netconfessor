
package io.netconfessor.gen.apConfig.config.interface_.wlan.sta;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.Enum_off_wep_wpa_wpa2_wpa_wpa2_wpa_1x_wpa2_1x_wpa_wpa2_1x;

/**
 * Security mode
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class SecurityMode extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_off_wep_wpa_wpa2_wpa_wpa2_wpa_1x_wpa2_1x_wpa_wpa2_1x value() {
        return (Enum_off_wep_wpa_wpa2_wpa_wpa2_wpa_1x_wpa2_1x_wpa_wpa2_1x) getValue();
    }

    /**
     * Sets the value  leaf "security-mode",
     * @param securityModeValue used during instantiation.
     */
    public void value(Enum_off_wep_wpa_wpa2_wpa_wpa2_wpa_1x_wpa2_1x_wpa_wpa2_1x securityModeValue)
            throws JNCException {
        setValue(securityModeValue);
    }

    public Enum_off_wep_wpa_wpa2_wpa_wpa2_wpa_1x_wpa2_1x_wpa_wpa2_1x defaultValue()
            throws JNCException {
        return null;
    }

    public boolean hasDefaultValue() {
        return false;
    }

    public void instantiateValue(String stringRepresentation)
            throws JNCException {
        value(new Enum_off_wep_wpa_wpa2_wpa_wpa2_wpa_1x_wpa2_1x_wpa_wpa2_1x(stringRepresentation));
    }

    public Enum_off_wep_wpa_wpa2_wpa_wpa2_wpa_1x_wpa2_1x_wpa_wpa2_1x createValue(String stringRepresentation)
            throws JNCException {
        return new Enum_off_wep_wpa_wpa2_wpa_wpa2_wpa_1x_wpa2_1x_wpa_wpa2_1x(stringRepresentation);
    }

    public Class<Enum_off_wep_wpa_wpa2_wpa_wpa2_wpa_1x_wpa2_1x_wpa_wpa2_1x> valueClass() {
        return Enum_off_wep_wpa_wpa2_wpa_wpa2_wpa_1x_wpa2_1x_wpa_wpa2_1x.class;
    }

    /**
     * Constructor for an empty SecurityMode object.
     */
    public SecurityMode() {
        super(ApConfigSchema.NAMESPACE, "security-mode");
    }

    /**
     * Constructor for an empty SecurityMode object.
     */
    public SecurityMode(Enum_off_wep_wpa_wpa2_wpa_wpa2_wpa_1x_wpa2_1x_wpa_wpa2_1x value) {
        super(ApConfigSchema.NAMESPACE, "security-mode");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public SecurityMode clone() {
        return (SecurityMode)cloneContent(new SecurityMode());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public SecurityMode cloneShallow() {
        return (SecurityMode)cloneShallowContent(new SecurityMode());
    }

    public SecurityMode cloneWithoutChildren() {
        return new SecurityMode();
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
