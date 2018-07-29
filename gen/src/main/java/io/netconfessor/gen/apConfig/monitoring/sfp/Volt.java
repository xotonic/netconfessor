
package io.netconfessor.gen.apConfig.monitoring.sfp;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangString;
import io.netconfessor.gen.apConfig.ApConfigSchema;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Volt extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "volt",
     * @param voltValue used during instantiation.
     */
    public void value(YangString voltValue) throws JNCException {
        setValue(voltValue);
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
     * Constructor for an empty Volt object.
     */
    public Volt() {
        super(ApConfigSchema.NAMESPACE, "volt");
    }

    /**
     * Constructor for an empty Volt object.
     */
    public Volt(YangString value) {
        super(ApConfigSchema.NAMESPACE, "volt");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Volt clone() {
        return (Volt)cloneContent(new Volt());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Volt cloneShallow() {
        return (Volt)cloneShallowContent(new Volt());
    }

    public Volt cloneWithoutChildren() {
        return new Volt();
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
