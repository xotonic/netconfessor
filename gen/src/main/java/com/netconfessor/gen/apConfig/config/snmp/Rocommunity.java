
package com.netconfessor.gen.apConfig.config.snmp;

import com.netconfessor.gen.apConfig.ApConfigSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangString;

/**
 * RO community
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Rocommunity extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "rocommunity",
     * @param rocommunityValue used during instantiation.
     */
    public void value(YangString rocommunityValue) throws JNCException {
        setValue(rocommunityValue);
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
     * Constructor for an empty Rocommunity object.
     */
    public Rocommunity() {
        super(ApConfigSchema.NAMESPACE, "rocommunity");
    }

    /**
     * Constructor for an empty Rocommunity object.
     */
    public Rocommunity(YangString value) {
        super(ApConfigSchema.NAMESPACE, "rocommunity");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Rocommunity clone() {
        return (Rocommunity)cloneContent(new Rocommunity());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Rocommunity cloneShallow() {
        return (Rocommunity)cloneShallowContent(new Rocommunity());
    }

    public Rocommunity cloneWithoutChildren() {
        return new Rocommunity();
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
