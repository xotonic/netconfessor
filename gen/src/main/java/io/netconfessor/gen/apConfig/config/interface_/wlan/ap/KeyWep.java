
package io.netconfessor.gen.apConfig.config.interface_.wlan.ap;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangString;
import io.netconfessor.gen.apConfig.ApConfigSchema;

/**
 * Key for WEP mode
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class KeyWep extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "key-wep",
     * @param keyWepValue used during instantiation.
     */
    public void value(YangString keyWepValue) throws JNCException {
        setValue(keyWepValue);
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
     * Constructor for an empty KeyWep object.
     */
    public KeyWep() {
        super(ApConfigSchema.NAMESPACE, "key-wep");
    }

    /**
     * Constructor for an empty KeyWep object.
     */
    public KeyWep(YangString value) {
        super(ApConfigSchema.NAMESPACE, "key-wep");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public KeyWep clone() {
        return (KeyWep)cloneContent(new KeyWep());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public KeyWep cloneShallow() {
        return (KeyWep)cloneShallowContent(new KeyWep());
    }

    public KeyWep cloneWithoutChildren() {
        return new KeyWep();
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
