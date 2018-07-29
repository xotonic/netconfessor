
package com.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.edcaSta.be;

import com.netconfessor.gen.apConfig.ApConfigSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangInt32;

/**
 * Admission Control Mandatory
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Acm extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangInt32 value() {
        return (YangInt32) getValue();
    }

    /**
     * Sets the value  leaf "acm",
     * @param acmValue used during instantiation.
     */
    public void value(YangInt32 acmValue) throws JNCException {
        setValue(acmValue);
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
     * Constructor for an empty Acm object.
     */
    public Acm() {
        super(ApConfigSchema.NAMESPACE, "acm");
    }

    /**
     * Constructor for an empty Acm object.
     */
    public Acm(YangInt32 value) {
        super(ApConfigSchema.NAMESPACE, "acm");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Acm clone() {
        return (Acm)cloneContent(new Acm());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Acm cloneShallow() {
        return (Acm)cloneShallowContent(new Acm());
    }

    public Acm cloneWithoutChildren() {
        return new Acm();
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
