
package io.netconfessor.gen.apConfig.config.interface_.common;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.Enum_staticIp_dhcp;

/**
 * Setup protocol for configuring IP params
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Protocol extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_staticIp_dhcp value() {
        return (Enum_staticIp_dhcp) getValue();
    }

    /**
     * Sets the value  leaf "protocol",
     * @param protocolValue used during instantiation.
     */
    public void value(Enum_staticIp_dhcp protocolValue) throws JNCException {
        setValue(protocolValue);
    }

    public Enum_staticIp_dhcp defaultValue() throws JNCException {
        return null;
    }

    public boolean hasDefaultValue() {
        return false;
    }

    public void instantiateValue(String stringRepresentation)
            throws JNCException {
        value(new Enum_staticIp_dhcp(stringRepresentation));
    }

    public Enum_staticIp_dhcp createValue(String stringRepresentation)
            throws JNCException {
        return new Enum_staticIp_dhcp(stringRepresentation);
    }

    public Class<Enum_staticIp_dhcp> valueClass() {
        return Enum_staticIp_dhcp.class;
    }

    /**
     * Constructor for an empty Protocol object.
     */
    public Protocol() {
        super(ApConfigSchema.NAMESPACE, "protocol");
    }

    /**
     * Constructor for an empty Protocol object.
     */
    public Protocol(Enum_staticIp_dhcp value) {
        super(ApConfigSchema.NAMESPACE, "protocol");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Protocol clone() {
        return (Protocol)cloneContent(new Protocol());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Protocol cloneShallow() {
        return (Protocol)cloneShallowContent(new Protocol());
    }

    public Protocol cloneWithoutChildren() {
        return new Protocol();
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
