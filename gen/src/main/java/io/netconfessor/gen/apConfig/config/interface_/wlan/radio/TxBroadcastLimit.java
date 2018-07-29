
package io.netconfessor.gen.apConfig.config.interface_.wlan.radio;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangInt32;
import io.netconfessor.gen.apConfig.ApConfigSchema;

/**
 * TX broadcast limit
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class TxBroadcastLimit extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangInt32 value() {
        return (YangInt32) getValue();
    }

    /**
     * Sets the value  leaf "tx-broadcast-limit",
     * @param txBroadcastLimitValue used during instantiation.
     */
    public void value(YangInt32 txBroadcastLimitValue) throws JNCException {
        setValue(txBroadcastLimitValue);
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
     * Constructor for an empty TxBroadcastLimit object.
     */
    public TxBroadcastLimit() {
        super(ApConfigSchema.NAMESPACE, "tx-broadcast-limit");
    }

    /**
     * Constructor for an empty TxBroadcastLimit object.
     */
    public TxBroadcastLimit(YangInt32 value) {
        super(ApConfigSchema.NAMESPACE, "tx-broadcast-limit");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public TxBroadcastLimit clone() {
        return (TxBroadcastLimit)cloneContent(new TxBroadcastLimit());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public TxBroadcastLimit cloneShallow() {
        return (TxBroadcastLimit)cloneShallowContent(new TxBroadcastLimit());
    }

    public TxBroadcastLimit cloneWithoutChildren() {
        return new TxBroadcastLimit();
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
