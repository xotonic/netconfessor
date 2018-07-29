
package io.netconfessor.gen.apConfig.config.dateTime.common;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangString;
import io.netconfessor.gen.apConfig.ApConfigSchema;

/**
 * Daylight saving time start
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Dststart extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "dststart",
     * @param dststartValue used during instantiation.
     */
    public void value(YangString dststartValue) throws JNCException {
        setValue(dststartValue);
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
     * Constructor for an empty Dststart object.
     */
    public Dststart() {
        super(ApConfigSchema.NAMESPACE, "dststart");
    }

    /**
     * Constructor for an empty Dststart object.
     */
    public Dststart(YangString value) {
        super(ApConfigSchema.NAMESPACE, "dststart");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Dststart clone() {
        return (Dststart)cloneContent(new Dststart());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Dststart cloneShallow() {
        return (Dststart)cloneShallowContent(new Dststart());
    }

    public Dststart cloneWithoutChildren() {
        return new Dststart();
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
