
package com.netconfessor.gen.apConfig.config.interface_.vap.acl;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.Enum_blacklist_whitelist_off;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;

/**
 * ACL work-mode
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Mode extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_blacklist_whitelist_off value() {
        return (Enum_blacklist_whitelist_off) getValue();
    }

    /**
     * Sets the value  leaf "mode",
     * @param modeValue used during instantiation.
     */
    public void value(Enum_blacklist_whitelist_off modeValue)
            throws JNCException {
        setValue(modeValue);
    }

    public Enum_blacklist_whitelist_off defaultValue() throws JNCException {
        return null;
    }

    public boolean hasDefaultValue() {
        return false;
    }

    public void instantiateValue(String stringRepresentation)
            throws JNCException {
        value(new Enum_blacklist_whitelist_off(stringRepresentation));
    }

    public Enum_blacklist_whitelist_off createValue(String stringRepresentation)
            throws JNCException {
        return new Enum_blacklist_whitelist_off(stringRepresentation);
    }

    public Class<Enum_blacklist_whitelist_off> valueClass() {
        return Enum_blacklist_whitelist_off.class;
    }

    /**
     * Constructor for an empty Mode object.
     */
    public Mode() {
        super(ApConfigSchema.NAMESPACE, "mode");
    }

    /**
     * Constructor for an empty Mode object.
     */
    public Mode(Enum_blacklist_whitelist_off value) {
        super(ApConfigSchema.NAMESPACE, "mode");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Mode clone() {
        return (Mode)cloneContent(new Mode());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Mode cloneShallow() {
        return (Mode)cloneShallowContent(new Mode());
    }

    public Mode cloneWithoutChildren() {
        return new Mode();
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
