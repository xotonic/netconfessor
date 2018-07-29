
package com.netconfessor.gen.apConfig.config.interface_.vap.radius;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.Enum_0_1;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;

/**
 * Enable accounting
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class AcctEnable extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_0_1 value() {
        return (Enum_0_1) getValue();
    }

    /**
     * Sets the value  leaf "acct-enable",
     * @param acctEnableValue used during instantiation.
     */
    public void value(Enum_0_1 acctEnableValue) throws JNCException {
        setValue(acctEnableValue);
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
     * Constructor for an empty AcctEnable object.
     */
    public AcctEnable() {
        super(ApConfigSchema.NAMESPACE, "acct-enable");
    }

    /**
     * Constructor for an empty AcctEnable object.
     */
    public AcctEnable(Enum_0_1 value) {
        super(ApConfigSchema.NAMESPACE, "acct-enable");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public AcctEnable clone() {
        return (AcctEnable)cloneContent(new AcctEnable());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public AcctEnable cloneShallow() {
        return (AcctEnable)cloneShallowContent(new AcctEnable());
    }

    public AcctEnable cloneWithoutChildren() {
        return new AcctEnable();
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
