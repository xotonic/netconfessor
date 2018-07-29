
package com.netconfessor.gen.apConfig.config.snmp;

import com.netconfessor.gen.apConfig.ApConfigSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangString;

/**
 * RW community
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Rwcommunity extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "rwcommunity",
     * @param rwcommunityValue used during instantiation.
     */
    public void value(YangString rwcommunityValue) throws JNCException {
        setValue(rwcommunityValue);
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
     * Constructor for an empty Rwcommunity object.
     */
    public Rwcommunity() {
        super(ApConfigSchema.NAMESPACE, "rwcommunity");
    }

    /**
     * Constructor for an empty Rwcommunity object.
     */
    public Rwcommunity(YangString value) {
        super(ApConfigSchema.NAMESPACE, "rwcommunity");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Rwcommunity clone() {
        return (Rwcommunity)cloneContent(new Rwcommunity());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Rwcommunity cloneShallow() {
        return (Rwcommunity)cloneShallowContent(new Rwcommunity());
    }

    public Rwcommunity cloneWithoutChildren() {
        return new Rwcommunity();
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
