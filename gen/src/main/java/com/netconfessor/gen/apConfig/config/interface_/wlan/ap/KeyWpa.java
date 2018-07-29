
package com.netconfessor.gen.apConfig.config.interface_.wlan.ap;

import com.netconfessor.gen.apConfig.ApConfigSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangString;

/**
 * Key for WPA PSK mode
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class KeyWpa extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "key-wpa",
     * @param keyWpaValue used during instantiation.
     */
    public void value(YangString keyWpaValue) throws JNCException {
        setValue(keyWpaValue);
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
     * Constructor for an empty KeyWpa object.
     */
    public KeyWpa() {
        super(ApConfigSchema.NAMESPACE, "key-wpa");
    }

    /**
     * Constructor for an empty KeyWpa object.
     */
    public KeyWpa(YangString value) {
        super(ApConfigSchema.NAMESPACE, "key-wpa");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public KeyWpa clone() {
        return (KeyWpa)cloneContent(new KeyWpa());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public KeyWpa cloneShallow() {
        return (KeyWpa)cloneShallowContent(new KeyWpa());
    }

    public KeyWpa cloneWithoutChildren() {
        return new KeyWpa();
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
