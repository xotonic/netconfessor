
package com.netconfessor.gen.apConfig.config.interface_.vap.radius;

import com.netconfessor.gen.apConfig.ApConfigSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangInt32;

/**
 * RADIUS periodic accounting update interval
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class AcctInterval extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangInt32 value() {
        return (YangInt32) getValue();
    }

    /**
     * Sets the value  leaf "acct-interval",
     * @param acctIntervalValue used during instantiation.
     */
    public void value(YangInt32 acctIntervalValue) throws JNCException {
        setValue(acctIntervalValue);
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
     * Constructor for an empty AcctInterval object.
     */
    public AcctInterval() {
        super(ApConfigSchema.NAMESPACE, "acct-interval");
    }

    /**
     * Constructor for an empty AcctInterval object.
     */
    public AcctInterval(YangInt32 value) {
        super(ApConfigSchema.NAMESPACE, "acct-interval");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public AcctInterval clone() {
        return (AcctInterval)cloneContent(new AcctInterval());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public AcctInterval cloneShallow() {
        return (AcctInterval)cloneShallowContent(new AcctInterval());
    }

    public AcctInterval cloneWithoutChildren() {
        return new AcctInterval();
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
