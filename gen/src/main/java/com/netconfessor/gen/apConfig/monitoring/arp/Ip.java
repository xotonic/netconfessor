
package com.netconfessor.gen.apConfig.monitoring.arp;

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
public class Ip extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "ip",
     * @param ipValue used during instantiation.
     */
    public void value(YangString ipValue) throws JNCException {
        setValue(ipValue);
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
     * Constructor for an empty Ip object.
     */
    public Ip() {
        super(ApConfigSchema.NAMESPACE, "ip");
    }

    /**
     * Constructor for an empty Ip object.
     */
    public Ip(YangString value) {
        super(ApConfigSchema.NAMESPACE, "ip");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Ip clone() {
        return (Ip)cloneContent(new Ip());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Ip cloneShallow() {
        return (Ip)cloneShallowContent(new Ip());
    }

    public Ip cloneWithoutChildren() {
        return new Ip();
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
