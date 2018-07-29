
package com.netconfessor.gen.apConfig.config.interface_.vap.radius;

import com.netconfessor.gen.apConfig.ApConfigSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangString;

/**
 * RADIUS authentication shared secret
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class AuthPassword extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "auth-password",
     * @param authPasswordValue used during instantiation.
     */
    public void value(YangString authPasswordValue) throws JNCException {
        setValue(authPasswordValue);
    }

    public YangString defaultValue() throws JNCException {
        return null;
    }

    public boolean hasDefaultValue() {
        return false;
    }

    public void instantiateValue(String stringRepresentation)
            throws JNCException {
        value(new YangString(stringRepresentation));
    }

    public YangString createValue(String stringRepresentation)
            throws JNCException {
        return new YangString(stringRepresentation);
    }

    public Class<YangString> valueClass() {
        return YangString.class;
    }

    /**
     * Constructor for an empty AuthPassword object.
     */
    public AuthPassword() {
        super(ApConfigSchema.NAMESPACE, "auth-password");
    }

    /**
     * Constructor for an empty AuthPassword object.
     */
    public AuthPassword(YangString value) {
        super(ApConfigSchema.NAMESPACE, "auth-password");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public AuthPassword clone() {
        return (AuthPassword)cloneContent(new AuthPassword());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public AuthPassword cloneShallow() {
        return (AuthPassword)cloneShallowContent(new AuthPassword());
    }

    public AuthPassword cloneWithoutChildren() {
        return new AuthPassword();
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
