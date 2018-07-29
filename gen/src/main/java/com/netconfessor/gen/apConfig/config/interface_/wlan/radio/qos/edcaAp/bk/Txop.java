
package com.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.edcaAp.bk;

import com.netconfessor.gen.apConfig.ApConfigSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangInt32;

/**
 * Transmit Opportunity
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Txop extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangInt32 value() {
        return (YangInt32) getValue();
    }

    /**
     * Sets the value  leaf "txop",
     * @param txopValue used during instantiation.
     */
    public void value(YangInt32 txopValue) throws JNCException {
        setValue(txopValue);
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
     * Constructor for an empty Txop object.
     */
    public Txop() {
        super(ApConfigSchema.NAMESPACE, "txop");
    }

    /**
     * Constructor for an empty Txop object.
     */
    public Txop(YangInt32 value) {
        super(ApConfigSchema.NAMESPACE, "txop");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Txop clone() {
        return (Txop)cloneContent(new Txop());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Txop cloneShallow() {
        return (Txop)cloneShallowContent(new Txop());
    }

    public Txop cloneWithoutChildren() {
        return new Txop();
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
