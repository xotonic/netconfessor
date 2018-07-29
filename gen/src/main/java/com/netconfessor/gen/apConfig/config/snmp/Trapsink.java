
package com.netconfessor.gen.apConfig.config.snmp;

import com.netconfessor.gen.apConfig.ApConfigSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangString;

/**
 * trapsink
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Trapsink extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "trapsink",
     * @param trapsinkValue used during instantiation.
     */
    public void value(YangString trapsinkValue) throws JNCException {
        setValue(trapsinkValue);
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
     * Constructor for an empty Trapsink object.
     */
    public Trapsink() {
        super(ApConfigSchema.NAMESPACE, "trapsink");
    }

    /**
     * Constructor for an empty Trapsink object.
     */
    public Trapsink(YangString value) {
        super(ApConfigSchema.NAMESPACE, "trapsink");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Trapsink clone() {
        return (Trapsink)cloneContent(new Trapsink());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Trapsink cloneShallow() {
        return (Trapsink)cloneShallowContent(new Trapsink());
    }

    public Trapsink cloneWithoutChildren() {
        return new Trapsink();
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
