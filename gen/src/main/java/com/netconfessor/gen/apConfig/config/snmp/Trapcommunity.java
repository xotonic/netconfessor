
package com.netconfessor.gen.apConfig.config.snmp;

import com.netconfessor.gen.apConfig.ApConfigSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangString;

/**
 * Trap community
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Trapcommunity extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "trapcommunity",
     * @param trapcommunityValue used during instantiation.
     */
    public void value(YangString trapcommunityValue) throws JNCException {
        setValue(trapcommunityValue);
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
     * Constructor for an empty Trapcommunity object.
     */
    public Trapcommunity() {
        super(ApConfigSchema.NAMESPACE, "trapcommunity");
    }

    /**
     * Constructor for an empty Trapcommunity object.
     */
    public Trapcommunity(YangString value) {
        super(ApConfigSchema.NAMESPACE, "trapcommunity");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Trapcommunity clone() {
        return (Trapcommunity)cloneContent(new Trapcommunity());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Trapcommunity cloneShallow() {
        return (Trapcommunity)cloneShallowContent(new Trapcommunity());
    }

    public Trapcommunity cloneWithoutChildren() {
        return new Trapcommunity();
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
