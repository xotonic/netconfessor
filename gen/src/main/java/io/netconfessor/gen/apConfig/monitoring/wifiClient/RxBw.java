
package io.netconfessor.gen.apConfig.monitoring.wifiClient;

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
public class RxBw extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "rx-bw",
     * @param rxBwValue used during instantiation.
     */
    public void value(YangString rxBwValue) throws JNCException {
        setValue(rxBwValue);
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
     * Constructor for an empty RxBw object.
     */
    public RxBw() {
        super(ApConfigSchema.NAMESPACE, "rx-bw");
    }

    /**
     * Constructor for an empty RxBw object.
     */
    public RxBw(YangString value) {
        super(ApConfigSchema.NAMESPACE, "rx-bw");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public RxBw clone() {
        return (RxBw)cloneContent(new RxBw());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public RxBw cloneShallow() {
        return (RxBw)cloneShallowContent(new RxBw());
    }

    public RxBw cloneWithoutChildren() {
        return new RxBw();
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
