
package io.netconfessor.gen.apConfig.config.webConfigurator;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangInt32;
import io.netconfessor.gen.apConfig.ApConfigSchema;

/**
 * HTTP port
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class HttpPort extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangInt32 value() {
        return (YangInt32) getValue();
    }

    /**
     * Sets the value  leaf "http-port",
     * @param httpPortValue used during instantiation.
     */
    public void value(YangInt32 httpPortValue) throws JNCException {
        setValue(httpPortValue);
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
     * Constructor for an empty HttpPort object.
     */
    public HttpPort() {
        super(ApConfigSchema.NAMESPACE, "http-port");
    }

    /**
     * Constructor for an empty HttpPort object.
     */
    public HttpPort(YangInt32 value) {
        super(ApConfigSchema.NAMESPACE, "http-port");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public HttpPort clone() {
        return (HttpPort)cloneContent(new HttpPort());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public HttpPort cloneShallow() {
        return (HttpPort)cloneShallowContent(new HttpPort());
    }

    public HttpPort cloneWithoutChildren() {
        return new HttpPort();
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
