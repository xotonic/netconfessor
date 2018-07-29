
package com.netconfessor.gen.apConfig.config.interface_.vap.radius;

import com.netconfessor.gen.apConfig.ApConfigSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangInt32;

/**
 * RADIUS accounting server port
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class AcctPort extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangInt32 value() {
        return (YangInt32) getValue();
    }

    /**
     * Sets the value  leaf "acct-port",
     * @param acctPortValue used during instantiation.
     */
    public void value(YangInt32 acctPortValue) throws JNCException {
        setValue(acctPortValue);
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
     * Constructor for an empty AcctPort object.
     */
    public AcctPort() {
        super(ApConfigSchema.NAMESPACE, "acct-port");
    }

    /**
     * Constructor for an empty AcctPort object.
     */
    public AcctPort(YangInt32 value) {
        super(ApConfigSchema.NAMESPACE, "acct-port");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public AcctPort clone() {
        return (AcctPort)cloneContent(new AcctPort());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public AcctPort cloneShallow() {
        return (AcctPort)cloneShallowContent(new AcctPort());
    }

    public AcctPort cloneWithoutChildren() {
        return new AcctPort();
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
