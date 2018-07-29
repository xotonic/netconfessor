
package io.netconfessor.gen.apConfig.config.interface_.wlan.ap.radius;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangInt32;
import io.netconfessor.gen.apConfig.ApConfigSchema;

/**
 * RADIUS authentication server port
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class AuthPort extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangInt32 value() {
        return (YangInt32) getValue();
    }

    /**
     * Sets the value  leaf "auth-port",
     * @param authPortValue used during instantiation.
     */
    public void value(YangInt32 authPortValue) throws JNCException {
        setValue(authPortValue);
    }

    public YangInt32 defaultValue() throws JNCException {
        return null;
    }

    public boolean hasDefaultValue() {
        return false;
    }

    public void instantiateValue(String stringRepresentation)
            throws JNCException {
        value(new YangInt32(stringRepresentation));
    }

    public YangInt32 createValue(String stringRepresentation)
            throws JNCException {
        return new YangInt32(stringRepresentation);
    }

    public Class<YangInt32> valueClass() {
        return YangInt32.class;
    }

    /**
     * Constructor for an empty AuthPort object.
     */
    public AuthPort() {
        super(ApConfigSchema.NAMESPACE, "auth-port");
    }

    /**
     * Constructor for an empty AuthPort object.
     */
    public AuthPort(YangInt32 value) {
        super(ApConfigSchema.NAMESPACE, "auth-port");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public AuthPort clone() {
        return (AuthPort)cloneContent(new AuthPort());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public AuthPort cloneShallow() {
        return (AuthPort)cloneShallowContent(new AuthPort());
    }

    public AuthPort cloneWithoutChildren() {
        return new AuthPort();
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
