
package com.netconfessor.gen.apConfig.monitoring.information;

import com.netconfessor.gen.apConfig.ApConfigSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangString;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class InternetConnectionStatus extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "internet-connection-status",
     * @param internetConnectionStatusValue used during instantiation.
     */
    public void value(YangString internetConnectionStatusValue)
            throws JNCException {
        setValue(internetConnectionStatusValue);
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
     * Constructor for an empty InternetConnectionStatus object.
     */
    public InternetConnectionStatus() {
        super(ApConfigSchema.NAMESPACE, "internet-connection-status");
    }

    /**
     * Constructor for an empty InternetConnectionStatus object.
     */
    public InternetConnectionStatus(YangString value) {
        super(ApConfigSchema.NAMESPACE, "internet-connection-status");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public InternetConnectionStatus clone() {
        return (InternetConnectionStatus)cloneContent(new InternetConnectionStatus());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public InternetConnectionStatus cloneShallow() {
        return (InternetConnectionStatus)cloneShallowContent(new InternetConnectionStatus());
    }

    public InternetConnectionStatus cloneWithoutChildren() {
        return new InternetConnectionStatus();
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
