
package com.netconfessor.gen.apConfig.monitoring.wanStatus;

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
public class Protocol extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "protocol",
     * @param protocolValue used during instantiation.
     */
    public void value(YangString protocolValue) throws JNCException {
        setValue(protocolValue);
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
     * Constructor for an empty Protocol object.
     */
    public Protocol() {
        super(ApConfigSchema.NAMESPACE, "protocol");
    }

    /**
     * Constructor for an empty Protocol object.
     */
    public Protocol(YangString value) {
        super(ApConfigSchema.NAMESPACE, "protocol");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Protocol clone() {
        return (Protocol)cloneContent(new Protocol());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Protocol cloneShallow() {
        return (Protocol)cloneShallowContent(new Protocol());
    }

    public Protocol cloneWithoutChildren() {
        return new Protocol();
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
