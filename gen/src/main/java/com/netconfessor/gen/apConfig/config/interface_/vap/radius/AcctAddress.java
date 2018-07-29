
package com.netconfessor.gen.apConfig.config.interface_.vap.radius;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.ietfInetTypes.Host;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;

/**
 * RADIUS accounting server address
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class AcctAddress extends Leaf {

    private static final long serialVersionUID = 1L;

    public Host value() {
        return (Host) getValue();
    }

    /**
     * Sets the value  leaf "acct-address",
     * @param acctAddressValue used during instantiation.
     */
    public void value(Host acctAddressValue) throws JNCException {
        setValue(acctAddressValue);
    }

    public Host defaultValue() throws JNCException {
        return null;
    }

    public boolean hasDefaultValue() {
        return false;
    }

    public void instantiateValue(String stringRepresentation)
            throws JNCException {
        value(new Host(stringRepresentation));
    }

    public Host createValue(String stringRepresentation) throws JNCException {
        return new Host(stringRepresentation);
    }

    public Class<Host> valueClass() {
        return Host.class;
    }

    /**
     * Constructor for an empty AcctAddress object.
     */
    public AcctAddress() {
        super(ApConfigSchema.NAMESPACE, "acct-address");
    }

    /**
     * Constructor for an empty AcctAddress object.
     */
    public AcctAddress(Host value) {
        super(ApConfigSchema.NAMESPACE, "acct-address");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public AcctAddress clone() {
        return (AcctAddress)cloneContent(new AcctAddress());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public AcctAddress cloneShallow() {
        return (AcctAddress)cloneShallowContent(new AcctAddress());
    }

    public AcctAddress cloneWithoutChildren() {
        return new AcctAddress();
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
