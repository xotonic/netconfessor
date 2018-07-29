
package io.netconfessor.gen.apConfig.config.dateTime;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.Enum_manual_ntp;

/**
 * Setup date-time mode
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Mode extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_manual_ntp value() {
        return (Enum_manual_ntp) getValue();
    }

    /**
     * Sets the value  leaf "mode",
     * @param modeValue used during instantiation.
     */
    public void value(Enum_manual_ntp modeValue) throws JNCException {
        setValue(modeValue);
    }

    public Enum_manual_ntp defaultValue() throws JNCException {
        return null;
    }

    public boolean hasDefaultValue() {
        return false;
    }

    public void instantiateValue(String stringRepresentation)
            throws JNCException {
        value(new Enum_manual_ntp(stringRepresentation));
    }

    public Enum_manual_ntp createValue(String stringRepresentation)
            throws JNCException {
        return new Enum_manual_ntp(stringRepresentation);
    }

    public Class<Enum_manual_ntp> valueClass() {
        return Enum_manual_ntp.class;
    }

    /**
     * Constructor for an empty Mode object.
     */
    public Mode() {
        super(ApConfigSchema.NAMESPACE, "mode");
    }

    /**
     * Constructor for an empty Mode object.
     */
    public Mode(Enum_manual_ntp value) {
        super(ApConfigSchema.NAMESPACE, "mode");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Mode clone() {
        return (Mode)cloneContent(new Mode());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Mode cloneShallow() {
        return (Mode)cloneShallowContent(new Mode());
    }

    public Mode cloneWithoutChildren() {
        return new Mode();
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
