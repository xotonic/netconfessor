
package io.netconfessor.gen.apConfig.monitoring.route;

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
public class Mask extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "mask",
     * @param maskValue used during instantiation.
     */
    public void value(YangString maskValue) throws JNCException {
        setValue(maskValue);
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
     * Constructor for an empty Mask object.
     */
    public Mask() {
        super(ApConfigSchema.NAMESPACE, "mask");
    }

    /**
     * Constructor for an empty Mask object.
     */
    public Mask(YangString value) {
        super(ApConfigSchema.NAMESPACE, "mask");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Mask clone() {
        return (Mask)cloneContent(new Mask());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Mask cloneShallow() {
        return (Mask)cloneShallowContent(new Mask());
    }

    public Mask cloneWithoutChildren() {
        return new Mask();
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
