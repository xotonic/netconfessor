
package io.netconfessor.gen.apConfig.config.interface_.wlan.ap;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.Enum_auto_0_1_2_3_4_5_6_7;

/**
 * VLAN priority
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class VlanPriority extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_auto_0_1_2_3_4_5_6_7 value() {
        return (Enum_auto_0_1_2_3_4_5_6_7) getValue();
    }

    /**
     * Sets the value  leaf "vlan-priority",
     * @param vlanPriorityValue used during instantiation.
     */
    public void value(Enum_auto_0_1_2_3_4_5_6_7 vlanPriorityValue)
            throws JNCException {
        setValue(vlanPriorityValue);
    }

    public Enum_auto_0_1_2_3_4_5_6_7 defaultValue() throws JNCException {
        return null;
    }

    public boolean hasDefaultValue() {
        return false;
    }

    public void instantiateValue(String stringRepresentation)
            throws JNCException {
        value(new Enum_auto_0_1_2_3_4_5_6_7(stringRepresentation));
    }

    public Enum_auto_0_1_2_3_4_5_6_7 createValue(String stringRepresentation)
            throws JNCException {
        return new Enum_auto_0_1_2_3_4_5_6_7(stringRepresentation);
    }

    public Class<Enum_auto_0_1_2_3_4_5_6_7> valueClass() {
        return Enum_auto_0_1_2_3_4_5_6_7.class;
    }

    /**
     * Constructor for an empty VlanPriority object.
     */
    public VlanPriority() {
        super(ApConfigSchema.NAMESPACE, "vlan-priority");
    }

    /**
     * Constructor for an empty VlanPriority object.
     */
    public VlanPriority(Enum_auto_0_1_2_3_4_5_6_7 value) {
        super(ApConfigSchema.NAMESPACE, "vlan-priority");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public VlanPriority clone() {
        return (VlanPriority)cloneContent(new VlanPriority());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public VlanPriority cloneShallow() {
        return (VlanPriority)cloneShallowContent(new VlanPriority());
    }

    public VlanPriority cloneWithoutChildren() {
        return new VlanPriority();
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
