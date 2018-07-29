
package io.netconfessor.gen.apConfig.config.dateTime.common;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangString;
import io.netconfessor.gen.apConfig.ApConfigSchema;

/**
 * Timezone of the system
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Timezone extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "timezone",
     * @param timezoneValue used during instantiation.
     */
    public void value(YangString timezoneValue) throws JNCException {
        setValue(timezoneValue);
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
     * Constructor for an empty Timezone object.
     */
    public Timezone() {
        super(ApConfigSchema.NAMESPACE, "timezone");
    }

    /**
     * Constructor for an empty Timezone object.
     */
    public Timezone(YangString value) {
        super(ApConfigSchema.NAMESPACE, "timezone");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Timezone clone() {
        return (Timezone)cloneContent(new Timezone());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Timezone cloneShallow() {
        return (Timezone)cloneShallowContent(new Timezone());
    }

    public Timezone cloneWithoutChildren() {
        return new Timezone();
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
