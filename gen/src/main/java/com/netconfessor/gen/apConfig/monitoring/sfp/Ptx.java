
package com.netconfessor.gen.apConfig.monitoring.sfp;

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
public class Ptx extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "ptx",
     * @param ptxValue used during instantiation.
     */
    public void value(YangString ptxValue) throws JNCException {
        setValue(ptxValue);
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
     * Constructor for an empty Ptx object.
     */
    public Ptx() {
        super(ApConfigSchema.NAMESPACE, "ptx");
    }

    /**
     * Constructor for an empty Ptx object.
     */
    public Ptx(YangString value) {
        super(ApConfigSchema.NAMESPACE, "ptx");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Ptx clone() {
        return (Ptx)cloneContent(new Ptx());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Ptx cloneShallow() {
        return (Ptx)cloneShallowContent(new Ptx());
    }

    public Ptx cloneWithoutChildren() {
        return new Ptx();
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
