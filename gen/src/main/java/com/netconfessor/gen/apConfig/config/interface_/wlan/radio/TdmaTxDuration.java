
package com.netconfessor.gen.apConfig.config.interface_.wlan.radio;

import com.netconfessor.gen.apConfig.ApConfigSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangInt32;

/**
 * TDMA TX duration
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class TdmaTxDuration extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangInt32 value() {
        return (YangInt32) getValue();
    }

    /**
     * Sets the value  leaf "tdma-tx-duration",
     * @param tdmaTxDurationValue used during instantiation.
     */
    public void value(YangInt32 tdmaTxDurationValue) throws JNCException {
        setValue(tdmaTxDurationValue);
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
     * Constructor for an empty TdmaTxDuration object.
     */
    public TdmaTxDuration() {
        super(ApConfigSchema.NAMESPACE, "tdma-tx-duration");
    }

    /**
     * Constructor for an empty TdmaTxDuration object.
     */
    public TdmaTxDuration(YangInt32 value) {
        super(ApConfigSchema.NAMESPACE, "tdma-tx-duration");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public TdmaTxDuration clone() {
        return (TdmaTxDuration)cloneContent(new TdmaTxDuration());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public TdmaTxDuration cloneShallow() {
        return (TdmaTxDuration)cloneShallowContent(new TdmaTxDuration());
    }

    public TdmaTxDuration cloneWithoutChildren() {
        return new TdmaTxDuration();
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
