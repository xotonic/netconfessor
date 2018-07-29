
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
public class Router extends Leaf {

    private static final long serialVersionUID = 1L;

    public IpAddress value() {
        return (IpAddress) getValue();
    }

    /**
     * Sets the value  leaf "router",
     * @param routerValue used during instantiation.
     */
    public void value(IpAddress routerValue) throws JNCException {
        setValue(routerValue);
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
     * Constructor for an empty Router object.
     */
    public Router() {
        super(ApConfigSchema.NAMESPACE, "router");
    }

    /**
     * Constructor for an empty Router object.
     */
    public Router(IpAddress value) {
        super(ApConfigSchema.NAMESPACE, "router");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Router clone() {
        return (Router)cloneContent(new Router());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Router cloneShallow() {
        return (Router)cloneShallowContent(new Router());
    }

    public Router cloneWithoutChildren() {
        return new Router();
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
