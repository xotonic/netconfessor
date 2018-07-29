
package io.netconfessor.gen.apConfig.config.interface_.vap;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangInt32;
import io.netconfessor.gen.apConfig.ApConfigSchema;

/**
 * STA inactivity timeout
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class InactivityTimeout extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangInt32 value() {
        return (YangInt32) getValue();
    }

    /**
     * Sets the value  leaf "inactivity-timeout",
     * @param inactivityTimeoutValue used during instantiation.
     */
    public void value(YangInt32 inactivityTimeoutValue) throws JNCException {
        setValue(inactivityTimeoutValue);
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
     * Constructor for an empty InactivityTimeout object.
     */
    public InactivityTimeout() {
        super(ApConfigSchema.NAMESPACE, "inactivity-timeout");
    }

    /**
     * Constructor for an empty InactivityTimeout object.
     */
    public InactivityTimeout(YangInt32 value) {
        super(ApConfigSchema.NAMESPACE, "inactivity-timeout");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public InactivityTimeout clone() {
        return (InactivityTimeout)cloneContent(new InactivityTimeout());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public InactivityTimeout cloneShallow() {
        return (InactivityTimeout)cloneShallowContent(new InactivityTimeout());
    }

    public InactivityTimeout cloneWithoutChildren() {
        return new InactivityTimeout();
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
