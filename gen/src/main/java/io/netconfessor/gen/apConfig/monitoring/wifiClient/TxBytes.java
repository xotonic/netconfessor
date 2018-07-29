
package io.netconfessor.gen.apConfig.monitoring.wifiClient;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangInt32;
import io.netconfessor.gen.apConfig.ApConfigSchema;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class TxBytes extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangInt32 value() {
        return (YangInt32) getValue();
    }

    /**
     * Sets the value  leaf "tx-bytes",
     * @param txBytesValue used during instantiation.
     */
    public void value(YangInt32 txBytesValue) throws JNCException {
        setValue(txBytesValue);
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
     * Constructor for an empty TxBytes object.
     */
    public TxBytes() {
        super(ApConfigSchema.NAMESPACE, "tx-bytes");
    }

    /**
     * Constructor for an empty TxBytes object.
     */
    public TxBytes(YangInt32 value) {
        super(ApConfigSchema.NAMESPACE, "tx-bytes");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public TxBytes clone() {
        return (TxBytes)cloneContent(new TxBytes());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public TxBytes cloneShallow() {
        return (TxBytes)cloneShallowContent(new TxBytes());
    }

    public TxBytes cloneWithoutChildren() {
        return new TxBytes();
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
