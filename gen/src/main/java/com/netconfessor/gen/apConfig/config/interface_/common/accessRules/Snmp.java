
package com.netconfessor.gen.apConfig.config.interface_.common.accessRules;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.Enum_0_1;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;

/**
 * Interface specific access rule for SNMP
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Snmp extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_0_1 value() {
        return (Enum_0_1) getValue();
    }

    /**
     * Sets the value  leaf "snmp",
     * @param snmpValue used during instantiation.
     */
    public void value(Enum_0_1 snmpValue) throws JNCException {
        setValue(snmpValue);
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
     * Constructor for an empty Snmp object.
     */
    public Snmp() {
        super(ApConfigSchema.NAMESPACE, "snmp");
    }

    /**
     * Constructor for an empty Snmp object.
     */
    public Snmp(Enum_0_1 value) {
        super(ApConfigSchema.NAMESPACE, "snmp");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Snmp clone() {
        return (Snmp)cloneContent(new Snmp());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Snmp cloneShallow() {
        return (Snmp)cloneShallowContent(new Snmp());
    }

    public Snmp cloneWithoutChildren() {
        return new Snmp();
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
