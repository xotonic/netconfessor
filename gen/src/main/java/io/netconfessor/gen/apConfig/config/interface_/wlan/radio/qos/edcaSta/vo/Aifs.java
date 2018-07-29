
package io.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.edcaSta.vo;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangInt32;
import io.netconfessor.gen.apConfig.ApConfigSchema;

/**
 * Arbitration inter-frame space
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Aifs extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangInt32 value() {
        return (YangInt32) getValue();
    }

    /**
     * Sets the value  leaf "aifs",
     * @param aifsValue used during instantiation.
     */
    public void value(YangInt32 aifsValue) throws JNCException {
        setValue(aifsValue);
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
     * Constructor for an empty Aifs object.
     */
    public Aifs() {
        super(ApConfigSchema.NAMESPACE, "aifs");
    }

    /**
     * Constructor for an empty Aifs object.
     */
    public Aifs(YangInt32 value) {
        super(ApConfigSchema.NAMESPACE, "aifs");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Aifs clone() {
        return (Aifs)cloneContent(new Aifs());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Aifs cloneShallow() {
        return (Aifs)cloneShallowContent(new Aifs());
    }

    public Aifs cloneWithoutChildren() {
        return new Aifs();
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
