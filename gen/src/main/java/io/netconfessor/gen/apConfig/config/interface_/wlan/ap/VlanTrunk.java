
package io.netconfessor.gen.apConfig.config.interface_.wlan.ap;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.Enum_0_1;

/**
 * VLAN trunk feature
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class VlanTrunk extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_0_1 value() {
        return (Enum_0_1) getValue();
    }

    /**
     * Sets the value  leaf "vlan-trunk",
     * @param vlanTrunkValue used during instantiation.
     */
    public void value(Enum_0_1 vlanTrunkValue) throws JNCException {
        setValue(vlanTrunkValue);
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
     * Constructor for an empty VlanTrunk object.
     */
    public VlanTrunk() {
        super(ApConfigSchema.NAMESPACE, "vlan-trunk");
    }

    /**
     * Constructor for an empty VlanTrunk object.
     */
    public VlanTrunk(Enum_0_1 value) {
        super(ApConfigSchema.NAMESPACE, "vlan-trunk");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public VlanTrunk clone() {
        return (VlanTrunk)cloneContent(new VlanTrunk());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public VlanTrunk cloneShallow() {
        return (VlanTrunk)cloneShallowContent(new VlanTrunk());
    }

    public VlanTrunk cloneWithoutChildren() {
        return new VlanTrunk();
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
