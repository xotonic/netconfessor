
package io.netconfessor.gen.apConfig.config.interface_.wlan.ap.shaperPerVapTx;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangInt32;
import io.netconfessor.gen.apConfig.ApConfigSchema;

/**
 * Shaper value
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class JValue extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangInt32 value() {
        return (YangInt32) getValue();
    }

    /**
     * Sets the value  leaf "value",
     * @param value_Value used during instantiation.
     */
    public void value(YangInt32 value_Value) throws JNCException {
        setValue(value_Value);
    }

    public YangInt32 defaultValue() throws JNCException {
        return null;
    }

    public boolean hasDefaultValue() {
        return false;
    }

    public void instantiateValue(String stringRepresentation)
            throws JNCException {
        value(new YangInt32(stringRepresentation));
    }

    public YangInt32 createValue(String stringRepresentation)
            throws JNCException {
        return new YangInt32(stringRepresentation);
    }

    public Class<YangInt32> valueClass() {
        return YangInt32.class;
    }

    /**
     * Constructor for an empty JValue object.
     */
    public JValue() {
        super(ApConfigSchema.NAMESPACE, "value");
    }

    /**
     * Constructor for an empty JValue object.
     */
    public JValue(YangInt32 value) {
        super(ApConfigSchema.NAMESPACE, "value");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public JValue clone() {
        return (JValue)cloneContent(new JValue());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public JValue cloneShallow() {
        return (JValue)cloneShallowContent(new JValue());
    }

    public JValue cloneWithoutChildren() {
        return new JValue();
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
