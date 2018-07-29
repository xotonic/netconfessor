
package com.netconfessor.gen.apConfig.config.interface_.wlan.radio;

import com.netconfessor.gen.apConfig.ApConfigSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangInt32;

/**
 * ATF iftime
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class AtfIftime extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangInt32 value() {
        return (YangInt32) getValue();
    }

    /**
     * Sets the value  leaf "atf-iftime",
     * @param atfIftimeValue used during instantiation.
     */
    public void value(YangInt32 atfIftimeValue) throws JNCException {
        setValue(atfIftimeValue);
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
     * Constructor for an empty AtfIftime object.
     */
    public AtfIftime() {
        super(ApConfigSchema.NAMESPACE, "atf-iftime");
    }

    /**
     * Constructor for an empty AtfIftime object.
     */
    public AtfIftime(YangInt32 value) {
        super(ApConfigSchema.NAMESPACE, "atf-iftime");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public AtfIftime clone() {
        return (AtfIftime)cloneContent(new AtfIftime());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public AtfIftime cloneShallow() {
        return (AtfIftime)cloneShallowContent(new AtfIftime());
    }

    public AtfIftime cloneWithoutChildren() {
        return new AtfIftime();
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
