
package com.netconfessor.gen.apConfig.config.interface_.common;

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
public class MacAddr extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "mac-addr",
     * @param macAddrValue used during instantiation.
     */
    public void value(YangString macAddrValue) throws JNCException {
        setValue(macAddrValue);
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
     * Constructor for an empty MacAddr object.
     */
    public MacAddr() {
        super(ApConfigSchema.NAMESPACE, "mac-addr");
    }

    /**
     * Constructor for an empty MacAddr object.
     */
    public MacAddr(YangString value) {
        super(ApConfigSchema.NAMESPACE, "mac-addr");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public MacAddr clone() {
        return (MacAddr)cloneContent(new MacAddr());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public MacAddr cloneShallow() {
        return (MacAddr)cloneShallowContent(new MacAddr());
    }

    public MacAddr cloneWithoutChildren() {
        return new MacAddr();
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
