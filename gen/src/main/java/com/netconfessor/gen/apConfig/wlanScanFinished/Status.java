
package com.netconfessor.gen.apConfig.wlanScanFinished;

import com.netconfessor.gen.apConfig.ApConfigSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangUInt32;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Status extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangUInt32 value() {
        return (YangUInt32) getValue();
    }

    /**
     * Sets the value  leaf "status",
     * @param statusValue used during instantiation.
     */
    public void value(YangUInt32 statusValue) throws JNCException {
        setValue(statusValue);
    }

    public YangUInt32 defaultValue() throws JNCException {
        return null;
    }

    public boolean hasDefaultValue() {
        return false;
    }

    public void instantiateValue(String stringRepresentation)
            throws JNCException {
        value(new YangUInt32(stringRepresentation));
    }

    public YangUInt32 createValue(String stringRepresentation)
            throws JNCException {
        return new YangUInt32(stringRepresentation);
    }

    public Class<YangUInt32> valueClass() {
        return YangUInt32.class;
    }

    /**
     * Constructor for an empty Status object.
     */
    public Status() {
        super(ApConfigSchema.NAMESPACE, "status");
    }

    /**
     * Constructor for an empty Status object.
     */
    public Status(YangUInt32 value) {
        super(ApConfigSchema.NAMESPACE, "status");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Status clone() {
        return (Status)cloneContent(new Status());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Status cloneShallow() {
        return (Status)cloneShallowContent(new Status());
    }

    public Status cloneWithoutChildren() {
        return new Status();
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
