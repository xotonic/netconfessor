
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
public class HwAddr extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "hw-addr",
     * @param hwAddrValue used during instantiation.
     */
    public void value(YangString hwAddrValue) throws JNCException {
        setValue(hwAddrValue);
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
     * Constructor for an empty HwAddr object.
     */
    public HwAddr() {
        super(ApConfigSchema.NAMESPACE, "hw-addr");
    }

    /**
     * Constructor for an empty HwAddr object.
     */
    public HwAddr(YangString value) {
        super(ApConfigSchema.NAMESPACE, "hw-addr");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public HwAddr clone() {
        return (HwAddr)cloneContent(new HwAddr());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public HwAddr cloneShallow() {
        return (HwAddr)cloneShallowContent(new HwAddr());
    }

    public HwAddr cloneWithoutChildren() {
        return new HwAddr();
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
