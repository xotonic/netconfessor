
package com.netconfessor.gen.apConfig.monitoring.wifiClient;

import com.netconfessor.gen.apConfig.ApConfigSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangInt32;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class RxBytes extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangInt32 value() {
        return (YangInt32) getValue();
    }

    /**
     * Sets the value  leaf "rx-bytes",
     * @param rxBytesValue used during instantiation.
     */
    public void value(YangInt32 rxBytesValue) throws JNCException {
        setValue(rxBytesValue);
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
     * Constructor for an empty RxBytes object.
     */
    public RxBytes() {
        super(ApConfigSchema.NAMESPACE, "rx-bytes");
    }

    /**
     * Constructor for an empty RxBytes object.
     */
    public RxBytes(YangInt32 value) {
        super(ApConfigSchema.NAMESPACE, "rx-bytes");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public RxBytes clone() {
        return (RxBytes)cloneContent(new RxBytes());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public RxBytes cloneShallow() {
        return (RxBytes)cloneShallowContent(new RxBytes());
    }

    public RxBytes cloneWithoutChildren() {
        return new RxBytes();
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
