
package io.netconfessor.gen.apConfig.monitoring.wanStatus;

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
public class IpAddress extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "ip-address",
     * @param ipAddressValue used during instantiation.
     */
    public void value(YangString ipAddressValue) throws JNCException {
        setValue(ipAddressValue);
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
     * Constructor for an empty IpAddress object.
     */
    public IpAddress() {
        super(ApConfigSchema.NAMESPACE, "ip-address");
    }

    /**
     * Constructor for an empty IpAddress object.
     */
    public IpAddress(YangString value) {
        super(ApConfigSchema.NAMESPACE, "ip-address");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public IpAddress clone() {
        return (IpAddress)cloneContent(new IpAddress());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public IpAddress cloneShallow() {
        return (IpAddress)cloneShallowContent(new IpAddress());
    }

    public IpAddress cloneWithoutChildren() {
        return new IpAddress();
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
