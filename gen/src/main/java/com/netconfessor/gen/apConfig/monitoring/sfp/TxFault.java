
package com.netconfessor.gen.apConfig.monitoring.sfp;

import com.netconfessor.gen.apConfig.ApConfigSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangString;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class TxFault extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "tx-fault",
     * @param txFaultValue used during instantiation.
     */
    public void value(YangString txFaultValue) throws JNCException {
        setValue(txFaultValue);
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
     * Constructor for an empty TxFault object.
     */
    public TxFault() {
        super(ApConfigSchema.NAMESPACE, "tx-fault");
    }

    /**
     * Constructor for an empty TxFault object.
     */
    public TxFault(YangString value) {
        super(ApConfigSchema.NAMESPACE, "tx-fault");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public TxFault clone() {
        return (TxFault)cloneContent(new TxFault());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public TxFault cloneShallow() {
        return (TxFault)cloneShallowContent(new TxFault());
    }

    public TxFault cloneWithoutChildren() {
        return new TxFault();
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
