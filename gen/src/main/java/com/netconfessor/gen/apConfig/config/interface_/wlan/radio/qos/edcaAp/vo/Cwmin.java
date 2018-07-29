
package com.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.edcaAp.vo;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.Enum_1_3_7_15_31_63_127_255_511_1023;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;

/**
 * Contention window minimum
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Cwmin extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_1_3_7_15_31_63_127_255_511_1023 value() {
        return (Enum_1_3_7_15_31_63_127_255_511_1023) getValue();
    }

    /**
     * Sets the value  leaf "cwmin",
     * @param cwminValue used during instantiation.
     */
    public void value(Enum_1_3_7_15_31_63_127_255_511_1023 cwminValue)
            throws JNCException {
        setValue(cwminValue);
    }

    public Enum_1_3_7_15_31_63_127_255_511_1023 defaultValue()
            throws JNCException {
        return null;
    }

    public boolean hasDefaultValue() {
        return false;
    }

    public void instantiateValue(String stringRepresentation)
            throws JNCException {
        value(new Enum_1_3_7_15_31_63_127_255_511_1023(stringRepresentation));
    }

    public Enum_1_3_7_15_31_63_127_255_511_1023 createValue(String stringRepresentation)
            throws JNCException {
        return new Enum_1_3_7_15_31_63_127_255_511_1023(stringRepresentation);
    }

    public Class<Enum_1_3_7_15_31_63_127_255_511_1023> valueClass() {
        return Enum_1_3_7_15_31_63_127_255_511_1023.class;
    }

    /**
     * Constructor for an empty Cwmin object.
     */
    public Cwmin() {
        super(ApConfigSchema.NAMESPACE, "cwmin");
    }

    /**
     * Constructor for an empty Cwmin object.
     */
    public Cwmin(Enum_1_3_7_15_31_63_127_255_511_1023 value) {
        super(ApConfigSchema.NAMESPACE, "cwmin");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Cwmin clone() {
        return (Cwmin)cloneContent(new Cwmin());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Cwmin cloneShallow() {
        return (Cwmin)cloneShallowContent(new Cwmin());
    }

    public Cwmin cloneWithoutChildren() {
        return new Cwmin();
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
