
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
public class HwPlatform extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "hw-platform",
     * @param hwPlatformValue used during instantiation.
     */
    public void value(YangString hwPlatformValue) throws JNCException {
        setValue(hwPlatformValue);
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
     * Constructor for an empty HwPlatform object.
     */
    public HwPlatform() {
        super(ApConfigSchema.NAMESPACE, "hw-platform");
    }

    /**
     * Constructor for an empty HwPlatform object.
     */
    public HwPlatform(YangString value) {
        super(ApConfigSchema.NAMESPACE, "hw-platform");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public HwPlatform clone() {
        return (HwPlatform)cloneContent(new HwPlatform());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public HwPlatform cloneShallow() {
        return (HwPlatform)cloneShallowContent(new HwPlatform());
    }

    public HwPlatform cloneWithoutChildren() {
        return new HwPlatform();
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
