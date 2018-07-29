
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
public class HwRevision extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "hw-revision",
     * @param hwRevisionValue used during instantiation.
     */
    public void value(YangString hwRevisionValue) throws JNCException {
        setValue(hwRevisionValue);
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
     * Constructor for an empty HwRevision object.
     */
    public HwRevision() {
        super(ApConfigSchema.NAMESPACE, "hw-revision");
    }

    /**
     * Constructor for an empty HwRevision object.
     */
    public HwRevision(YangString value) {
        super(ApConfigSchema.NAMESPACE, "hw-revision");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public HwRevision clone() {
        return (HwRevision)cloneContent(new HwRevision());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public HwRevision cloneShallow() {
        return (HwRevision)cloneShallowContent(new HwRevision());
    }

    public HwRevision cloneWithoutChildren() {
        return new HwRevision();
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
