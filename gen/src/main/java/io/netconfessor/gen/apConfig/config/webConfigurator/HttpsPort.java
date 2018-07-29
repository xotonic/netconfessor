
package io.netconfessor.gen.apConfig.config.webConfigurator;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangInt32;
import io.netconfessor.gen.apConfig.ApConfigSchema;

/**
 * HTTPS port
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class HttpsPort extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangInt32 value() {
        return (YangInt32) getValue();
    }

    /**
     * Sets the value  leaf "https-port",
     * @param httpsPortValue used during instantiation.
     */
    public void value(YangInt32 httpsPortValue) throws JNCException {
        setValue(httpsPortValue);
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
     * Constructor for an empty HttpsPort object.
     */
    public HttpsPort() {
        super(ApConfigSchema.NAMESPACE, "https-port");
    }

    /**
     * Constructor for an empty HttpsPort object.
     */
    public HttpsPort(YangInt32 value) {
        super(ApConfigSchema.NAMESPACE, "https-port");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public HttpsPort clone() {
        return (HttpsPort)cloneContent(new HttpsPort());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public HttpsPort cloneShallow() {
        return (HttpsPort)cloneShallowContent(new HttpsPort());
    }

    public HttpsPort cloneWithoutChildren() {
        return new HttpsPort();
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
