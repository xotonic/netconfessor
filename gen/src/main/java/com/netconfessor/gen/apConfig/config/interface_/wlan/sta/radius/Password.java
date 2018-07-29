
package com.netconfessor.gen.apConfig.config.interface_.wlan.sta.radius;

import com.netconfessor.gen.apConfig.ApConfigSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangString;

/**
 * RADIUS authentication password
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Password extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "password",
     * @param passwordValue used during instantiation.
     */
    public void value(YangString passwordValue) throws JNCException {
        setValue(passwordValue);
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
     * Constructor for an empty Password object.
     */
    public Password() {
        super(ApConfigSchema.NAMESPACE, "password");
    }

    /**
     * Constructor for an empty Password object.
     */
    public Password(YangString value) {
        super(ApConfigSchema.NAMESPACE, "password");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Password clone() {
        return (Password)cloneContent(new Password());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Password cloneShallow() {
        return (Password)cloneShallowContent(new Password());
    }

    public Password cloneWithoutChildren() {
        return new Password();
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
