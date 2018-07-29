
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
public class Status extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "status",
     * @param statusValue used during instantiation.
     */
    public void value(YangString statusValue) throws JNCException {
        setValue(statusValue);
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
     * Constructor for an empty Status object.
     */
    public Status() {
        super(ApConfigSchema.NAMESPACE, "status");
    }

    /**
     * Constructor for an empty Status object.
     */
    public Status(YangString value) {
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
