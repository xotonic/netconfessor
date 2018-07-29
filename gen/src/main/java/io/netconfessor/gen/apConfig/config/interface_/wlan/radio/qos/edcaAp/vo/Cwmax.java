
package io.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.edcaAp.vo;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.Enum_1_3_7_15_31_63_127_255_511_1023;

/**
 * Contention window maximum
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Cwmax extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_1_3_7_15_31_63_127_255_511_1023 value() {
        return (Enum_1_3_7_15_31_63_127_255_511_1023) getValue();
    }

    /**
     * Sets the value  leaf "cwmax",
     * @param cwmaxValue used during instantiation.
     */
    public void value(Enum_1_3_7_15_31_63_127_255_511_1023 cwmaxValue)
            throws JNCException {
        setValue(cwmaxValue);
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
     * Constructor for an empty Cwmax object.
     */
    public Cwmax() {
        super(ApConfigSchema.NAMESPACE, "cwmax");
    }

    /**
     * Constructor for an empty Cwmax object.
     */
    public Cwmax(Enum_1_3_7_15_31_63_127_255_511_1023 value) {
        super(ApConfigSchema.NAMESPACE, "cwmax");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Cwmax clone() {
        return (Cwmax)cloneContent(new Cwmax());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Cwmax cloneShallow() {
        return (Cwmax)cloneShallowContent(new Cwmax());
    }

    public Cwmax cloneWithoutChildren() {
        return new Cwmax();
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
