
package com.netconfessor.gen.apConfig.config.interface_.wlan;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.Enum_ap_sta_radio;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;

/**
 * AP/STA mode of WLAN interface
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Mode extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_ap_sta_radio value() {
        return (Enum_ap_sta_radio) getValue();
    }

    /**
     * Sets the value  leaf "mode",
     * @param modeValue used during instantiation.
     */
    public void value(Enum_ap_sta_radio modeValue) throws JNCException {
        setValue(modeValue);
    }

    public Enum_ap_sta_radio defaultValue() throws JNCException {
        return null;
    }

    public boolean hasDefaultValue() {
        return false;
    }

    public void instantiateValue(String stringRepresentation)
            throws JNCException {
        value(new Enum_ap_sta_radio(stringRepresentation));
    }

    public Enum_ap_sta_radio createValue(String stringRepresentation)
            throws JNCException {
        return new Enum_ap_sta_radio(stringRepresentation);
    }

    public Class<Enum_ap_sta_radio> valueClass() {
        return Enum_ap_sta_radio.class;
    }

    /**
     * Constructor for an empty Mode object.
     */
    public Mode() {
        super(ApConfigSchema.NAMESPACE, "mode");
    }

    /**
     * Constructor for an empty Mode object.
     */
    public Mode(Enum_ap_sta_radio value) {
        super(ApConfigSchema.NAMESPACE, "mode");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Mode clone() {
        return (Mode)cloneContent(new Mode());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Mode cloneShallow() {
        return (Mode)cloneShallowContent(new Mode());
    }

    public Mode cloneWithoutChildren() {
        return new Mode();
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
