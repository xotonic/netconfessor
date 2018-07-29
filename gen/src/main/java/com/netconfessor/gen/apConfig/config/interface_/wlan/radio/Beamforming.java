
package com.netconfessor.gen.apConfig.config.interface_.wlan.radio;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.Enum_0_1;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;

/**
 * Beamforming
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Beamforming extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_0_1 value() {
        return (Enum_0_1) getValue();
    }

    /**
     * Sets the value  leaf "beamforming",
     * @param beamformingValue used during instantiation.
     */
    public void value(Enum_0_1 beamformingValue) throws JNCException {
        setValue(beamformingValue);
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
     * Constructor for an empty Beamforming object.
     */
    public Beamforming() {
        super(ApConfigSchema.NAMESPACE, "beamforming");
    }

    /**
     * Constructor for an empty Beamforming object.
     */
    public Beamforming(Enum_0_1 value) {
        super(ApConfigSchema.NAMESPACE, "beamforming");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Beamforming clone() {
        return (Beamforming)cloneContent(new Beamforming());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Beamforming cloneShallow() {
        return (Beamforming)cloneShallowContent(new Beamforming());
    }

    public Beamforming cloneWithoutChildren() {
        return new Beamforming();
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
