
package com.netconfessor.gen.apConfig.config.interface_.wlan.ap;

import com.netconfessor.gen.apConfig.ApConfigSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangInt32;

/**
 * VLAN ID
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class VlanId extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangInt32 value() {
        return (YangInt32) getValue();
    }

    /**
     * Sets the value  leaf "vlan-id",
     * @param vlanIdValue used during instantiation.
     */
    public void value(YangInt32 vlanIdValue) throws JNCException {
        setValue(vlanIdValue);
    }

    public YangInt32 defaultValue() throws JNCException {
        return null;
    }

    public boolean hasDefaultValue() {
        return false;
    }

    public void instantiateValue(String stringRepresentation)
            throws JNCException {
        value(new YangInt32(stringRepresentation));
    }

    public YangInt32 createValue(String stringRepresentation)
            throws JNCException {
        return new YangInt32(stringRepresentation);
    }

    public Class<YangInt32> valueClass() {
        return YangInt32.class;
    }

    /**
     * Constructor for an empty VlanId object.
     */
    public VlanId() {
        super(ApConfigSchema.NAMESPACE, "vlan-id");
    }

    /**
     * Constructor for an empty VlanId object.
     */
    public VlanId(YangInt32 value) {
        super(ApConfigSchema.NAMESPACE, "vlan-id");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public VlanId clone() {
        return (VlanId)cloneContent(new VlanId());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public VlanId cloneShallow() {
        return (VlanId)cloneShallowContent(new VlanId());
    }

    public VlanId cloneWithoutChildren() {
        return new VlanId();
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
