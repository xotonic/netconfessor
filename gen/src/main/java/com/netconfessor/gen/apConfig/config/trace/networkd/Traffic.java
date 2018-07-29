
package com.netconfessor.gen.apConfig.config.trace.networkd;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.Enum_0_1;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;

/**
 * Toggle messages about traffic
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Traffic extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_0_1 value() {
        return (Enum_0_1) getValue();
    }

    /**
     * Sets the value  leaf "traffic",
     * @param trafficValue used during instantiation.
     */
    public void value(Enum_0_1 trafficValue) throws JNCException {
        setValue(trafficValue);
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
     * Constructor for an empty Traffic object.
     */
    public Traffic() {
        super(ApConfigSchema.NAMESPACE, "traffic");
    }

    /**
     * Constructor for an empty Traffic object.
     */
    public Traffic(Enum_0_1 value) {
        super(ApConfigSchema.NAMESPACE, "traffic");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Traffic clone() {
        return (Traffic)cloneContent(new Traffic());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Traffic cloneShallow() {
        return (Traffic)cloneShallowContent(new Traffic());
    }

    public Traffic cloneWithoutChildren() {
        return new Traffic();
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
