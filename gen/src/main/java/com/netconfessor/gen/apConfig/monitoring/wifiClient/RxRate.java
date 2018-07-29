
package com.netconfessor.gen.apConfig.monitoring.wifiClient;

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
public class RxRate extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "rx-rate",
     * @param rxRateValue used during instantiation.
     */
    public void value(YangString rxRateValue) throws JNCException {
        setValue(rxRateValue);
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
     * Constructor for an empty RxRate object.
     */
    public RxRate() {
        super(ApConfigSchema.NAMESPACE, "rx-rate");
    }

    /**
     * Constructor for an empty RxRate object.
     */
    public RxRate(YangString value) {
        super(ApConfigSchema.NAMESPACE, "rx-rate");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public RxRate clone() {
        return (RxRate)cloneContent(new RxRate());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public RxRate cloneShallow() {
        return (RxRate)cloneShallowContent(new RxRate());
    }

    public RxRate cloneWithoutChildren() {
        return new RxRate();
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
