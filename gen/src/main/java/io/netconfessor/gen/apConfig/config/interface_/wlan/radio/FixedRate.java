
package io.netconfessor.gen.apConfig.config.interface_.wlan.radio;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangString;
import io.netconfessor.gen.apConfig.ApConfigSchema;

/**
 * Fixed TX rate
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class FixedRate extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "fixed-rate",
     * @param fixedRateValue used during instantiation.
     */
    public void value(YangString fixedRateValue) throws JNCException {
        setValue(fixedRateValue);
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
     * Constructor for an empty FixedRate object.
     */
    public FixedRate() {
        super(ApConfigSchema.NAMESPACE, "fixed-rate");
    }

    /**
     * Constructor for an empty FixedRate object.
     */
    public FixedRate(YangString value) {
        super(ApConfigSchema.NAMESPACE, "fixed-rate");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public FixedRate clone() {
        return (FixedRate)cloneContent(new FixedRate());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public FixedRate cloneShallow() {
        return (FixedRate)cloneShallowContent(new FixedRate());
    }

    public FixedRate cloneWithoutChildren() {
        return new FixedRate();
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
