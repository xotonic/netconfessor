
package io.netconfessor.gen.apConfig.config.interface_.common;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.Enum_0_1;

/**
 * Request unicast replies for DHCP
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class DisableBroadcastDhcp extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_0_1 value() {
        return (Enum_0_1) getValue();
    }

    /**
     * Sets the value  leaf "disable-broadcast-dhcp",
     * @param disableBroadcastDhcpValue used during instantiation.
     */
    public void value(Enum_0_1 disableBroadcastDhcpValue) throws JNCException {
        setValue(disableBroadcastDhcpValue);
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
     * Constructor for an empty DisableBroadcastDhcp object.
     */
    public DisableBroadcastDhcp() {
        super(ApConfigSchema.NAMESPACE, "disable-broadcast-dhcp");
    }

    /**
     * Constructor for an empty DisableBroadcastDhcp object.
     */
    public DisableBroadcastDhcp(Enum_0_1 value) {
        super(ApConfigSchema.NAMESPACE, "disable-broadcast-dhcp");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public DisableBroadcastDhcp clone() {
        return (DisableBroadcastDhcp)cloneContent(new DisableBroadcastDhcp());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public DisableBroadcastDhcp cloneShallow() {
        return (DisableBroadcastDhcp)cloneShallowContent(new DisableBroadcastDhcp());
    }

    public DisableBroadcastDhcp cloneWithoutChildren() {
        return new DisableBroadcastDhcp();
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
