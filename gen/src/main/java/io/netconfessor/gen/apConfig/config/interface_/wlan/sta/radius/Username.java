
package io.netconfessor.gen.apConfig.config.interface_.wlan.sta.radius;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangString;
import io.netconfessor.gen.apConfig.ApConfigSchema;

/**
 * RADIUS authentication username
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Username extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "username",
     * @param usernameValue used during instantiation.
     */
    public void value(YangString usernameValue) throws JNCException {
        setValue(usernameValue);
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
     * Constructor for an empty Username object.
     */
    public Username() {
        super(ApConfigSchema.NAMESPACE, "username");
    }

    /**
     * Constructor for an empty Username object.
     */
    public Username(YangString value) {
        super(ApConfigSchema.NAMESPACE, "username");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Username clone() {
        return (Username)cloneContent(new Username());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Username cloneShallow() {
        return (Username)cloneShallowContent(new Username());
    }

    public Username cloneWithoutChildren() {
        return new Username();
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
