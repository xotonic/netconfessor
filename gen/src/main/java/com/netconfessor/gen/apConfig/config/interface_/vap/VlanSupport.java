
package com.netconfessor.gen.apConfig.config.interface_.vap;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.Enum_0_1;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;

/**
 * Realtek specific option, need always 1 for VLAN support
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class VlanSupport extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_0_1 value() {
        return (Enum_0_1) getValue();
    }

    /**
     * Sets the value  leaf "vlan-support",
     * @param vlanSupportValue used during instantiation.
     */
    public void value(Enum_0_1 vlanSupportValue) throws JNCException {
        setValue(vlanSupportValue);
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
     * Constructor for an empty VlanSupport object.
     */
    public VlanSupport() {
        super(ApConfigSchema.NAMESPACE, "vlan-support");
    }

    /**
     * Constructor for an empty VlanSupport object.
     */
    public VlanSupport(Enum_0_1 value) {
        super(ApConfigSchema.NAMESPACE, "vlan-support");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public VlanSupport clone() {
        return (VlanSupport)cloneContent(new VlanSupport());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public VlanSupport cloneShallow() {
        return (VlanSupport)cloneShallowContent(new VlanSupport());
    }

    public VlanSupport cloneWithoutChildren() {
        return new VlanSupport();
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
