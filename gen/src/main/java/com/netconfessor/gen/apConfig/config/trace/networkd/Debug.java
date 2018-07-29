
package com.netconfessor.gen.apConfig.config.trace.networkd;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.Enum_0_1;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;

/**
 * Toggle debug messages
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Debug extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_0_1 value() {
        return (Enum_0_1) getValue();
    }

    /**
     * Sets the value  leaf "debug",
     * @param debugValue used during instantiation.
     */
    public void value(Enum_0_1 debugValue) throws JNCException {
        setValue(debugValue);
    }

    public Enum_0_1 defaultValue() throws JNCException {
        return null;
    }

    public boolean hasDefaultValue() {
        return false;
    }

    public void instantiateValue(String stringRepresentation)
            throws JNCException {
        value(new Enum_0_1(stringRepresentation));
    }

    public Enum_0_1 createValue(String stringRepresentation)
            throws JNCException {
        return new Enum_0_1(stringRepresentation);
    }

    public Class<Enum_0_1> valueClass() {
        return Enum_0_1.class;
    }

    /**
     * Constructor for an empty Debug object.
     */
    public Debug() {
        super(ApConfigSchema.NAMESPACE, "debug");
    }

    /**
     * Constructor for an empty Debug object.
     */
    public Debug(Enum_0_1 value) {
        super(ApConfigSchema.NAMESPACE, "debug");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Debug clone() {
        return (Debug)cloneContent(new Debug());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Debug cloneShallow() {
        return (Debug)cloneShallowContent(new Debug());
    }

    public Debug cloneWithoutChildren() {
        return new Debug();
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
