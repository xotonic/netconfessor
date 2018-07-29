
package com.netconfessor.gen.apConfig.config.interface_.vap;

import com.netconfessor.gen.apConfig.ApConfigSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangString;

/**
 * SSID
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Ssid extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "ssid",
     * @param ssidValue used during instantiation.
     */
    public void value(YangString ssidValue) throws JNCException {
        setValue(ssidValue);
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
     * Constructor for an empty Ssid object.
     */
    public Ssid() {
        super(ApConfigSchema.NAMESPACE, "ssid");
    }

    /**
     * Constructor for an empty Ssid object.
     */
    public Ssid(YangString value) {
        super(ApConfigSchema.NAMESPACE, "ssid");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Ssid clone() {
        return (Ssid)cloneContent(new Ssid());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Ssid cloneShallow() {
        return (Ssid)cloneShallowContent(new Ssid());
    }

    public Ssid cloneWithoutChildren() {
        return new Ssid();
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
