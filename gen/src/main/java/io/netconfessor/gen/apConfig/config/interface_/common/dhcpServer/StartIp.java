
package io.netconfessor.gen.apConfig.config.interface_.common.dhcpServer;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.ietfInetTypes.IpAddress;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class StartIp extends Leaf {

    private static final long serialVersionUID = 1L;

    public IpAddress value() {
        return (IpAddress) getValue();
    }

    /**
     * Sets the value  leaf "start-ip",
     * @param startIpValue used during instantiation.
     */
    public void value(IpAddress startIpValue) throws JNCException {
        setValue(startIpValue);
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
     * Constructor for an empty StartIp object.
     */
    public StartIp() {
        super(ApConfigSchema.NAMESPACE, "start-ip");
    }

    /**
     * Constructor for an empty StartIp object.
     */
    public StartIp(IpAddress value) {
        super(ApConfigSchema.NAMESPACE, "start-ip");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public StartIp clone() {
        return (StartIp)cloneContent(new StartIp());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public StartIp cloneShallow() {
        return (StartIp)cloneShallowContent(new StartIp());
    }

    public StartIp cloneWithoutChildren() {
        return new StartIp();
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
