
package com.netconfessor.gen.apConfig.config.interface_.wlan.radio;

import com.netconfessor.gen.apConfig.ApConfigSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangInt32;

/**
 * Beacon interval
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class BeaconInterval extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangInt32 value() {
        return (YangInt32) getValue();
    }

    /**
     * Sets the value  leaf "beacon-interval",
     * @param beaconIntervalValue used during instantiation.
     */
    public void value(YangInt32 beaconIntervalValue) throws JNCException {
        setValue(beaconIntervalValue);
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
     * Constructor for an empty BeaconInterval object.
     */
    public BeaconInterval() {
        super(ApConfigSchema.NAMESPACE, "beacon-interval");
    }

    /**
     * Constructor for an empty BeaconInterval object.
     */
    public BeaconInterval(YangInt32 value) {
        super(ApConfigSchema.NAMESPACE, "beacon-interval");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public BeaconInterval clone() {
        return (BeaconInterval)cloneContent(new BeaconInterval());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public BeaconInterval cloneShallow() {
        return (BeaconInterval)cloneShallowContent(new BeaconInterval());
    }

    public BeaconInterval cloneWithoutChildren() {
        return new BeaconInterval();
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
