
package com.netconfessor.gen.apConfig.config.interface_.common.accessRules;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.Enum_0_1;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;

/**
 * Interface specific access rule for NETCONF
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Netconf extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_0_1 value() {
        return (Enum_0_1) getValue();
    }

    /**
     * Sets the value  leaf "netconf",
     * @param netconfValue used during instantiation.
     */
    public void value(Enum_0_1 netconfValue) throws JNCException {
        setValue(netconfValue);
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
     * Constructor for an empty Netconf object.
     */
    public Netconf() {
        super(ApConfigSchema.NAMESPACE, "netconf");
    }

    /**
     * Constructor for an empty Netconf object.
     */
    public Netconf(Enum_0_1 value) {
        super(ApConfigSchema.NAMESPACE, "netconf");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Netconf clone() {
        return (Netconf)cloneContent(new Netconf());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Netconf cloneShallow() {
        return (Netconf)cloneShallowContent(new Netconf());
    }

    public Netconf cloneWithoutChildren() {
        return new Netconf();
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
