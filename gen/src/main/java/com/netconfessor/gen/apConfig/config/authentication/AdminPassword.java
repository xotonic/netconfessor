
package com.netconfessor.gen.apConfig.config.authentication;

import com.netconfessor.gen.apConfig.ApConfigSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangString;

/**
 * Admin password
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class AdminPassword extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "admin-password",
     * @param adminPasswordValue used during instantiation.
     */
    public void value(YangString adminPasswordValue) throws JNCException {
        setValue(adminPasswordValue);
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
     * Constructor for an empty AdminPassword object.
     */
    public AdminPassword() {
        super(ApConfigSchema.NAMESPACE, "admin-password");
    }

    /**
     * Constructor for an empty AdminPassword object.
     */
    public AdminPassword(YangString value) {
        super(ApConfigSchema.NAMESPACE, "admin-password");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public AdminPassword clone() {
        return (AdminPassword)cloneContent(new AdminPassword());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public AdminPassword cloneShallow() {
        return (AdminPassword)cloneShallowContent(new AdminPassword());
    }

    public AdminPassword cloneWithoutChildren() {
        return new AdminPassword();
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
