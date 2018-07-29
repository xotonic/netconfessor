
package com.netconfessor.gen.apConfig.config.interface_.wlan.radio;

import com.netconfessor.gen.apConfig.ApConfigSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangInt32;

/**
 * Fragmentation threshold
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class FragmentationThreshold extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangInt32 value() {
        return (YangInt32) getValue();
    }

    /**
     * Sets the value  leaf "fragmentation-threshold",
     * @param fragmentationThresholdValue used during instantiation.
     */
    public void value(YangInt32 fragmentationThresholdValue)
            throws JNCException {
        setValue(fragmentationThresholdValue);
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
     * Constructor for an empty FragmentationThreshold object.
     */
    public FragmentationThreshold() {
        super(ApConfigSchema.NAMESPACE, "fragmentation-threshold");
    }

    /**
     * Constructor for an empty FragmentationThreshold object.
     */
    public FragmentationThreshold(YangInt32 value) {
        super(ApConfigSchema.NAMESPACE, "fragmentation-threshold");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public FragmentationThreshold clone() {
        return (FragmentationThreshold)cloneContent(new FragmentationThreshold());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public FragmentationThreshold cloneShallow() {
        return (FragmentationThreshold)cloneShallowContent(new FragmentationThreshold());
    }

    public FragmentationThreshold cloneWithoutChildren() {
        return new FragmentationThreshold();
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
