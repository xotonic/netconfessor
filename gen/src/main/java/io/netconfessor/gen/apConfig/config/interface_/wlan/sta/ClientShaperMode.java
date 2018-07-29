
package io.netconfessor.gen.apConfig.config.interface_.wlan.sta;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.Enum_off_manual_auto;

/**
 * Client side shaper mode
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class ClientShaperMode extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_off_manual_auto value() {
        return (Enum_off_manual_auto) getValue();
    }

    /**
     * Sets the value  leaf "client-shaper-mode",
     * @param clientShaperModeValue used during instantiation.
     */
    public void value(Enum_off_manual_auto clientShaperModeValue)
            throws JNCException {
        setValue(clientShaperModeValue);
    }

    public Enum_off_manual_auto defaultValue() throws JNCException {
        return null;
    }

    public boolean hasDefaultValue() {
        return false;
    }

    public void instantiateValue(String stringRepresentation)
            throws JNCException {
        value(new Enum_off_manual_auto(stringRepresentation));
    }

    public Enum_off_manual_auto createValue(String stringRepresentation)
            throws JNCException {
        return new Enum_off_manual_auto(stringRepresentation);
    }

    public Class<Enum_off_manual_auto> valueClass() {
        return Enum_off_manual_auto.class;
    }

    /**
     * Constructor for an empty ClientShaperMode object.
     */
    public ClientShaperMode() {
        super(ApConfigSchema.NAMESPACE, "client-shaper-mode");
    }

    /**
     * Constructor for an empty ClientShaperMode object.
     */
    public ClientShaperMode(Enum_off_manual_auto value) {
        super(ApConfigSchema.NAMESPACE, "client-shaper-mode");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public ClientShaperMode clone() {
        return (ClientShaperMode)cloneContent(new ClientShaperMode());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public ClientShaperMode cloneShallow() {
        return (ClientShaperMode)cloneShallowContent(new ClientShaperMode());
    }

    public ClientShaperMode cloneWithoutChildren() {
        return new ClientShaperMode();
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
