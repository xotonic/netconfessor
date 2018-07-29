
package io.netconfessor.gen.apConfig.config.interface_.wlan.radio;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangInt32;
import io.netconfessor.gen.apConfig.ApConfigSchema;

/**
 * ACK timeout
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class AckTimeout extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangInt32 value() {
        return (YangInt32) getValue();
    }

    /**
     * Sets the value  leaf "ack-timeout",
     * @param ackTimeoutValue used during instantiation.
     */
    public void value(YangInt32 ackTimeoutValue) throws JNCException {
        setValue(ackTimeoutValue);
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
     * Constructor for an empty AckTimeout object.
     */
    public AckTimeout() {
        super(ApConfigSchema.NAMESPACE, "ack-timeout");
    }

    /**
     * Constructor for an empty AckTimeout object.
     */
    public AckTimeout(YangInt32 value) {
        super(ApConfigSchema.NAMESPACE, "ack-timeout");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public AckTimeout clone() {
        return (AckTimeout)cloneContent(new AckTimeout());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public AckTimeout cloneShallow() {
        return (AckTimeout)cloneShallowContent(new AckTimeout());
    }

    public AckTimeout cloneWithoutChildren() {
        return new AckTimeout();
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
