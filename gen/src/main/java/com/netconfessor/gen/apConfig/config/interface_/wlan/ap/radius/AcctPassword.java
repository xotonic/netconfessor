
package com.netconfessor.gen.apConfig.config.interface_.wlan.ap.radius;

import com.netconfessor.gen.apConfig.ApConfigSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangString;

/**
 * RADIUS accounting shared secret
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class AcctPassword extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "acct-password",
     * @param acctPasswordValue used during instantiation.
     */
    public void value(YangString acctPasswordValue) throws JNCException {
        setValue(acctPasswordValue);
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
     * Constructor for an empty AcctPassword object.
     */
    public AcctPassword() {
        super(ApConfigSchema.NAMESPACE, "acct-password");
    }

    /**
     * Constructor for an empty AcctPassword object.
     */
    public AcctPassword(YangString value) {
        super(ApConfigSchema.NAMESPACE, "acct-password");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public AcctPassword clone() {
        return (AcctPassword)cloneContent(new AcctPassword());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public AcctPassword cloneShallow() {
        return (AcctPassword)cloneShallowContent(new AcctPassword());
    }

    public AcctPassword cloneWithoutChildren() {
        return new AcctPassword();
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
