
package com.netconfessor.gen.apConfig.monitoring.ethernet;

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
public class Duplex extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "duplex",
     * @param duplexValue used during instantiation.
     */
    public void value(YangString duplexValue) throws JNCException {
        setValue(duplexValue);
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
     * Constructor for an empty Duplex object.
     */
    public Duplex() {
        super(ApConfigSchema.NAMESPACE, "duplex");
    }

    /**
     * Constructor for an empty Duplex object.
     */
    public Duplex(YangString value) {
        super(ApConfigSchema.NAMESPACE, "duplex");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Duplex clone() {
        return (Duplex)cloneContent(new Duplex());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Duplex cloneShallow() {
        return (Duplex)cloneShallowContent(new Duplex());
    }

    public Duplex cloneWithoutChildren() {
        return new Duplex();
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
