
package io.netconfessor.gen.apConfig.config.interface_.wlan;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.Enum_0_1;

/**
 * Indicate RSSI from current interface by RSSI LEDs
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class RssiIndication extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_0_1 value() {
        return (Enum_0_1) getValue();
    }

    /**
     * Sets the value  leaf "rssi-indication",
     * @param rssiIndicationValue used during instantiation.
     */
    public void value(Enum_0_1 rssiIndicationValue) throws JNCException {
        setValue(rssiIndicationValue);
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
     * Constructor for an empty RssiIndication object.
     */
    public RssiIndication() {
        super(ApConfigSchema.NAMESPACE, "rssi-indication");
    }

    /**
     * Constructor for an empty RssiIndication object.
     */
    public RssiIndication(Enum_0_1 value) {
        super(ApConfigSchema.NAMESPACE, "rssi-indication");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public RssiIndication clone() {
        return (RssiIndication)cloneContent(new RssiIndication());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public RssiIndication cloneShallow() {
        return (RssiIndication)cloneShallowContent(new RssiIndication());
    }

    public RssiIndication cloneWithoutChildren() {
        return new RssiIndication();
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
