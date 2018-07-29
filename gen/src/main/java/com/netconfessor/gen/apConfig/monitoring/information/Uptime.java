
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
public class Uptime extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "uptime",
     * @param uptimeValue used during instantiation.
     */
    public void value(YangString uptimeValue) throws JNCException {
        setValue(uptimeValue);
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
     * Constructor for an empty Uptime object.
     */
    public Uptime() {
        super(ApConfigSchema.NAMESPACE, "uptime");
    }

    /**
     * Constructor for an empty Uptime object.
     */
    public Uptime(YangString value) {
        super(ApConfigSchema.NAMESPACE, "uptime");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Uptime clone() {
        return (Uptime)cloneContent(new Uptime());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Uptime cloneShallow() {
        return (Uptime)cloneShallowContent(new Uptime());
    }

    public Uptime cloneWithoutChildren() {
        return new Uptime();
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
