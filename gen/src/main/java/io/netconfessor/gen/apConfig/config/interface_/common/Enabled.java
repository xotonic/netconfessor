
package io.netconfessor.gen.apConfig.config.interface_.common;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.Enum_0_1;

/**
 * Enable interface
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Enabled extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_0_1 value() {
        return (Enum_0_1) getValue();
    }

    /**
     * Sets the value  leaf "enabled",
     * @param enabledValue used during instantiation.
     */
    public void value(Enum_0_1 enabledValue) throws JNCException {
        setValue(enabledValue);
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
     * Constructor for an empty Enabled object.
     */
    public Enabled() {
        super(ApConfigSchema.NAMESPACE, "enabled");
    }

    /**
     * Constructor for an empty Enabled object.
     */
    public Enabled(Enum_0_1 value) {
        super(ApConfigSchema.NAMESPACE, "enabled");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Enabled clone() {
        return (Enabled)cloneContent(new Enabled());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Enabled cloneShallow() {
        return (Enabled)cloneShallowContent(new Enabled());
    }

    public Enabled cloneWithoutChildren() {
        return new Enabled();
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
