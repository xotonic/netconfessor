
package io.netconfessor.gen.apConfig.config.dateTime.common;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.Enum_0_1;

/**
 * Daylight saving time enable
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Dstenable extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_0_1 value() {
        return (Enum_0_1) getValue();
    }

    /**
     * Sets the value  leaf "dstenable",
     * @param dstenableValue used during instantiation.
     */
    public void value(Enum_0_1 dstenableValue) throws JNCException {
        setValue(dstenableValue);
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
     * Constructor for an empty Dstenable object.
     */
    public Dstenable() {
        super(ApConfigSchema.NAMESPACE, "dstenable");
    }

    /**
     * Constructor for an empty Dstenable object.
     */
    public Dstenable(Enum_0_1 value) {
        super(ApConfigSchema.NAMESPACE, "dstenable");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Dstenable clone() {
        return (Dstenable)cloneContent(new Dstenable());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Dstenable cloneShallow() {
        return (Dstenable)cloneShallowContent(new Dstenable());
    }

    public Dstenable cloneWithoutChildren() {
        return new Dstenable();
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
