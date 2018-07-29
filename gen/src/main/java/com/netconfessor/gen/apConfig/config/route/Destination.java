
package com.netconfessor.gen.apConfig.config.route;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.ietfInetTypes.IpAddress;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;

/**
 * Route destination address
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Destination extends Leaf {

    private static final long serialVersionUID = 1L;

    public IpAddress value() {
        return (IpAddress) getValue();
    }

    /**
     * Sets the value  leaf "destination",
     * @param destinationValue used during instantiation.
     */
    public void value(IpAddress destinationValue) throws JNCException {
        setValue(destinationValue);
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
     * Constructor for an empty Destination object.
     */
    public Destination() {
        super(ApConfigSchema.NAMESPACE, "destination");
    }

    /**
     * Constructor for an empty Destination object.
     */
    public Destination(IpAddress value) {
        super(ApConfigSchema.NAMESPACE, "destination");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Destination clone() {
        return (Destination)cloneContent(new Destination());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Destination cloneShallow() {
        return (Destination)cloneShallowContent(new Destination());
    }

    public Destination cloneWithoutChildren() {
        return new Destination();
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
