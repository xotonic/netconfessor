
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
public class TxPackets extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangInt32 value() {
        return (YangInt32) getValue();
    }

    /**
     * Sets the value  leaf "tx-packets",
     * @param txPacketsValue used during instantiation.
     */
    public void value(YangInt32 txPacketsValue) throws JNCException {
        setValue(txPacketsValue);
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
     * Constructor for an empty TxPackets object.
     */
    public TxPackets() {
        super(ApConfigSchema.NAMESPACE, "tx-packets");
    }

    /**
     * Constructor for an empty TxPackets object.
     */
    public TxPackets(YangInt32 value) {
        super(ApConfigSchema.NAMESPACE, "tx-packets");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public TxPackets clone() {
        return (TxPackets)cloneContent(new TxPackets());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public TxPackets cloneShallow() {
        return (TxPackets)cloneShallowContent(new TxPackets());
    }

    public TxPackets cloneWithoutChildren() {
        return new TxPackets();
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
