
package com.netconfessor.gen.apConfig.config.interface_.common.dhcpServer;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.Enum_0_1;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;

/**
 * enable DHCP server on current interface
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Enable extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_0_1 value() {
        return (Enum_0_1) getValue();
    }

    /**
     * Sets the value  leaf "enable",
     * @param enableValue used during instantiation.
     */
    public void value(Enum_0_1 enableValue) throws JNCException {
        setValue(enableValue);
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
     * Constructor for an empty Enable object.
     */
    public Enable() {
        super(ApConfigSchema.NAMESPACE, "enable");
    }

    /**
     * Constructor for an empty Enable object.
     */
    public Enable(Enum_0_1 value) {
        super(ApConfigSchema.NAMESPACE, "enable");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Enable clone() {
        return (Enable)cloneContent(new Enable());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Enable cloneShallow() {
        return (Enable)cloneShallowContent(new Enable());
    }

    public Enable cloneWithoutChildren() {
        return new Enable();
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
