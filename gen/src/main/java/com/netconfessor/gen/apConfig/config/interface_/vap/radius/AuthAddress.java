
package com.netconfessor.gen.apConfig.config.interface_.vap.radius;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.ietfInetTypes.Host;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;

/**
 * RADIUS authentication server address
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class AuthAddress extends Leaf {

    private static final long serialVersionUID = 1L;

    public Host value() {
        return (Host) getValue();
    }

    /**
     * Sets the value  leaf "auth-address",
     * @param authAddressValue used during instantiation.
     */
    public void value(Host authAddressValue) throws JNCException {
        setValue(authAddressValue);
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
     * Constructor for an empty AuthAddress object.
     */
    public AuthAddress() {
        super(ApConfigSchema.NAMESPACE, "auth-address");
    }

    /**
     * Constructor for an empty AuthAddress object.
     */
    public AuthAddress(Host value) {
        super(ApConfigSchema.NAMESPACE, "auth-address");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public AuthAddress clone() {
        return (AuthAddress)cloneContent(new AuthAddress());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public AuthAddress cloneShallow() {
        return (AuthAddress)cloneShallowContent(new AuthAddress());
    }

    public AuthAddress cloneWithoutChildren() {
        return new AuthAddress();
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
