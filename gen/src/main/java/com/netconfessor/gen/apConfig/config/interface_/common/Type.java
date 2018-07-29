
package com.netconfessor.gen.apConfig.config.interface_.common;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.Enum_eth_vlan_wlan_bridge_vap_gre;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;

/**
 * Interface type
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Type extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_eth_vlan_wlan_bridge_vap_gre value() {
        return (Enum_eth_vlan_wlan_bridge_vap_gre) getValue();
    }

    /**
     * Sets the value  leaf "type",
     * @param typeValue used during instantiation.
     */
    public void value(Enum_eth_vlan_wlan_bridge_vap_gre typeValue)
            throws JNCException {
        setValue(typeValue);
    }

    public Enum_eth_vlan_wlan_bridge_vap_gre defaultValue() throws JNCException {
        return null;
    }

    public boolean hasDefaultValue() {
        return false;
    }

    public void instantiateValue(String stringRepresentation)
            throws JNCException {
        value(new Enum_eth_vlan_wlan_bridge_vap_gre(stringRepresentation));
    }

    public Enum_eth_vlan_wlan_bridge_vap_gre createValue(String stringRepresentation)
            throws JNCException {
        return new Enum_eth_vlan_wlan_bridge_vap_gre(stringRepresentation);
    }

    public Class<Enum_eth_vlan_wlan_bridge_vap_gre> valueClass() {
        return Enum_eth_vlan_wlan_bridge_vap_gre.class;
    }

    /**
     * Constructor for an empty Type object.
     */
    public Type() {
        super(ApConfigSchema.NAMESPACE, "type");
    }

    /**
     * Constructor for an empty Type object.
     */
    public Type(Enum_eth_vlan_wlan_bridge_vap_gre value) {
        super(ApConfigSchema.NAMESPACE, "type");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Type clone() {
        return (Type)cloneContent(new Type());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Type cloneShallow() {
        return (Type)cloneShallowContent(new Type());
    }

    public Type cloneWithoutChildren() {
        return new Type();
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
