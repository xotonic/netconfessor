
package io.netconfessor.gen.apConfig.monitoring.ethernet;

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
public class Link extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "link",
     * @param linkValue used during instantiation.
     */
    public void value(YangString linkValue) throws JNCException {
        setValue(linkValue);
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
     * Constructor for an empty Link object.
     */
    public Link() {
        super(ApConfigSchema.NAMESPACE, "link");
    }

    /**
     * Constructor for an empty Link object.
     */
    public Link(YangString value) {
        super(ApConfigSchema.NAMESPACE, "link");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Link clone() {
        return (Link)cloneContent(new Link());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Link cloneShallow() {
        return (Link)cloneShallowContent(new Link());
    }

    public Link cloneWithoutChildren() {
        return new Link();
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
