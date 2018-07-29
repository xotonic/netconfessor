
package io.netconfessor.gen.apConfig.monitoring.arp;

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
public class Mac extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "mac",
     * @param macValue used during instantiation.
     */
    public void value(YangString macValue) throws JNCException {
        setValue(macValue);
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
     * Constructor for an empty Mac object.
     */
    public Mac() {
        super(ApConfigSchema.NAMESPACE, "mac");
    }

    /**
     * Constructor for an empty Mac object.
     */
    public Mac(YangString value) {
        super(ApConfigSchema.NAMESPACE, "mac");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Mac clone() {
        return (Mac)cloneContent(new Mac());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Mac cloneShallow() {
        return (Mac)cloneShallowContent(new Mac());
    }

    public Mac cloneWithoutChildren() {
        return new Mac();
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
