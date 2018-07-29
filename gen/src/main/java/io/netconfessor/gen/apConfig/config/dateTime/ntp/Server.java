
package io.netconfessor.gen.apConfig.config.dateTime.ntp;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.ietfInetTypes.Host;

/**
 * NTP server address
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Server extends Leaf {

    private static final long serialVersionUID = 1L;

    public Host value() {
        return (Host) getValue();
    }

    /**
     * Sets the value  leaf "server",
     * @param serverValue used during instantiation.
     */
    public void value(Host serverValue) throws JNCException {
        setValue(serverValue);
    }

    public Host defaultValue() throws JNCException {
        return null;
    }

    public boolean hasDefaultValue() {
        return false;
    }

    public void instantiateValue(String stringRepresentation)
            throws JNCException {
        value(new Host(stringRepresentation));
    }

    public Host createValue(String stringRepresentation) throws JNCException {
        return new Host(stringRepresentation);
    }

    public Class<Host> valueClass() {
        return Host.class;
    }

    /**
     * Constructor for an empty Server object.
     */
    public Server() {
        super(ApConfigSchema.NAMESPACE, "server");
    }

    /**
     * Constructor for an empty Server object.
     */
    public Server(Host value) {
        super(ApConfigSchema.NAMESPACE, "server");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Server clone() {
        return (Server)cloneContent(new Server());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Server cloneShallow() {
        return (Server)cloneShallowContent(new Server());
    }

    public Server cloneWithoutChildren() {
        return new Server();
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
