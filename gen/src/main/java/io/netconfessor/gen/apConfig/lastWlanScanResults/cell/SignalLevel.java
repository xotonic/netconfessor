
package io.netconfessor.gen.apConfig.lastWlanScanResults.cell;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangInt32;
import io.netconfessor.gen.apConfig.ApConfigSchema;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class SignalLevel extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangInt32 value() {
        return (YangInt32) getValue();
    }

    /**
     * Sets the value  leaf "signal-level",
     * @param signalLevelValue used during instantiation.
     */
    public void value(YangInt32 signalLevelValue) throws JNCException {
        setValue(signalLevelValue);
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
     * Constructor for an empty SignalLevel object.
     */
    public SignalLevel() {
        super(ApConfigSchema.NAMESPACE, "signal-level");
    }

    /**
     * Constructor for an empty SignalLevel object.
     */
    public SignalLevel(YangInt32 value) {
        super(ApConfigSchema.NAMESPACE, "signal-level");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public SignalLevel clone() {
        return (SignalLevel)cloneContent(new SignalLevel());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public SignalLevel cloneShallow() {
        return (SignalLevel)cloneShallowContent(new SignalLevel());
    }

    public SignalLevel cloneWithoutChildren() {
        return new SignalLevel();
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
