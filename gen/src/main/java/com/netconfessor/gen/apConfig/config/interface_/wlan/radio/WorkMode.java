
package com.netconfessor.gen.apConfig.config.interface_.wlan.radio;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.Enum_a_an_ac;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;

/**
 * IEEE 802.11 operation mode
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class WorkMode extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_a_an_ac value() {
        return (Enum_a_an_ac) getValue();
    }

    /**
     * Sets the value  leaf "work-mode",
     * @param workModeValue used during instantiation.
     */
    public void value(Enum_a_an_ac workModeValue) throws JNCException {
        setValue(workModeValue);
    }

    public Enum_a_an_ac defaultValue() throws JNCException {
        return null;
    }

    public boolean hasDefaultValue() {
        return false;
    }

    public void instantiateValue(String stringRepresentation)
            throws JNCException {
        value(new Enum_a_an_ac(stringRepresentation));
    }

    public Enum_a_an_ac createValue(String stringRepresentation)
            throws JNCException {
        return new Enum_a_an_ac(stringRepresentation);
    }

    public Class<Enum_a_an_ac> valueClass() {
        return Enum_a_an_ac.class;
    }

    /**
     * Constructor for an empty WorkMode object.
     */
    public WorkMode() {
        super(ApConfigSchema.NAMESPACE, "work-mode");
    }

    /**
     * Constructor for an empty WorkMode object.
     */
    public WorkMode(Enum_a_an_ac value) {
        super(ApConfigSchema.NAMESPACE, "work-mode");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public WorkMode clone() {
        return (WorkMode)cloneContent(new WorkMode());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public WorkMode cloneShallow() {
        return (WorkMode)cloneShallowContent(new WorkMode());
    }

    public WorkMode cloneWithoutChildren() {
        return new WorkMode();
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
