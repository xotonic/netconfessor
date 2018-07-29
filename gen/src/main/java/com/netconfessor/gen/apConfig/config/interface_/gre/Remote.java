
package com.netconfessor.gen.apConfig.config.interface_.gre;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.ietfInetTypes.IpAddress;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;

/**
 * Remote IP address
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Remote extends Leaf {

    private static final long serialVersionUID = 1L;

    public IpAddress value() {
        return (IpAddress) getValue();
    }

    /**
     * Sets the value  leaf "remote",
     * @param remoteValue used during instantiation.
     */
    public void value(IpAddress remoteValue) throws JNCException {
        setValue(remoteValue);
    }

    public IpAddress defaultValue() throws JNCException {
        return null;
    }

    public boolean hasDefaultValue() {
        return false;
    }

    public void instantiateValue(String stringRepresentation)
            throws JNCException {
        value(new IpAddress(stringRepresentation));
    }

    public IpAddress createValue(String stringRepresentation)
            throws JNCException {
        return new IpAddress(stringRepresentation);
    }

    public Class<IpAddress> valueClass() {
        return IpAddress.class;
    }

    /**
     * Constructor for an empty Remote object.
     */
    public Remote() {
        super(ApConfigSchema.NAMESPACE, "remote");
    }

    /**
     * Constructor for an empty Remote object.
     */
    public Remote(IpAddress value) {
        super(ApConfigSchema.NAMESPACE, "remote");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Remote clone() {
        return (Remote)cloneContent(new Remote());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Remote cloneShallow() {
        return (Remote)cloneShallowContent(new Remote());
    }

    public Remote cloneWithoutChildren() {
        return new Remote();
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
