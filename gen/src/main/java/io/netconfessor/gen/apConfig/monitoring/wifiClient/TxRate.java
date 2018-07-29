
package io.netconfessor.gen.apConfig.monitoring.wifiClient;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangString;
import io.netconfessor.gen.apConfig.ApConfigSchema;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class TxRate extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "tx-rate",
     * @param txRateValue used during instantiation.
     */
    public void value(YangString txRateValue) throws JNCException {
        setValue(txRateValue);
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
     * Constructor for an empty TxRate object.
     */
    public TxRate() {
        super(ApConfigSchema.NAMESPACE, "tx-rate");
    }

    /**
     * Constructor for an empty TxRate object.
     */
    public TxRate(YangString value) {
        super(ApConfigSchema.NAMESPACE, "tx-rate");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public TxRate clone() {
        return (TxRate)cloneContent(new TxRate());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public TxRate cloneShallow() {
        return (TxRate)cloneShallowContent(new TxRate());
    }

    public TxRate cloneWithoutChildren() {
        return new TxRate();
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
