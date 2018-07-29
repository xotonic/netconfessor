
package io.netconfessor.gen.apConfig.monitoring.information;

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
public class SystemTime extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "system-time",
     * @param systemTimeValue used during instantiation.
     */
    public void value(YangString systemTimeValue) throws JNCException {
        setValue(systemTimeValue);
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
     * Constructor for an empty SystemTime object.
     */
    public SystemTime() {
        super(ApConfigSchema.NAMESPACE, "system-time");
    }

    /**
     * Constructor for an empty SystemTime object.
     */
    public SystemTime(YangString value) {
        super(ApConfigSchema.NAMESPACE, "system-time");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public SystemTime clone() {
        return (SystemTime)cloneContent(new SystemTime());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public SystemTime cloneShallow() {
        return (SystemTime)cloneShallowContent(new SystemTime());
    }

    public SystemTime cloneWithoutChildren() {
        return new SystemTime();
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