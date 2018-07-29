
package com.netconfessor.gen.apConfig.config.interface_.vlan;

import com.netconfessor.gen.apConfig.ApConfigSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangString;

/**
 * Basic interface name
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Basic extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "basic",
     * @param basicValue used during instantiation.
     */
    public void value(YangString basicValue) throws JNCException {
        setValue(basicValue);
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
     * Constructor for an empty Basic object.
     */
    public Basic() {
        super(ApConfigSchema.NAMESPACE, "basic");
    }

    /**
     * Constructor for an empty Basic object.
     */
    public Basic(YangString value) {
        super(ApConfigSchema.NAMESPACE, "basic");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Basic clone() {
        return (Basic)cloneContent(new Basic());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Basic cloneShallow() {
        return (Basic)cloneShallowContent(new Basic());
    }

    public Basic cloneWithoutChildren() {
        return new Basic();
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
