
package com.netconfessor.gen.apConfig.config.snmp;

import com.netconfessor.gen.apConfig.ApConfigSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangString;

/**
 * System name
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Sysname extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "sysname",
     * @param sysnameValue used during instantiation.
     */
    public void value(YangString sysnameValue) throws JNCException {
        setValue(sysnameValue);
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
     * Constructor for an empty Sysname object.
     */
    public Sysname() {
        super(ApConfigSchema.NAMESPACE, "sysname");
    }

    /**
     * Constructor for an empty Sysname object.
     */
    public Sysname(YangString value) {
        super(ApConfigSchema.NAMESPACE, "sysname");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Sysname clone() {
        return (Sysname)cloneContent(new Sysname());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Sysname cloneShallow() {
        return (Sysname)cloneShallowContent(new Sysname());
    }

    public Sysname cloneWithoutChildren() {
        return new Sysname();
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
