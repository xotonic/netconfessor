
package com.netconfessor.gen.robocop.primeDirectives.directive;

import com.netconfessor.gen.robocop.RobocopSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangBoolean;

/**
 * 
 * <br/>
 * Namespace: jnc:test:robocop
 *
 * @author jnc.py
 */
public class Enabled extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangBoolean value() {
        return (YangBoolean) getValue();
    }

    /**
     * Sets the value  leaf "enabled",
     * @param enabledValue used during instantiation.
     */
    public void value(YangBoolean enabledValue) throws JNCException {
        setValue(enabledValue);
    }

    public YangBoolean defaultValue() throws JNCException {
        return null;
    }

    public boolean hasDefaultValue() {
        return false;
    }

    public void instantiateValue(String stringRepresentation)
            throws JNCException {
        value(new YangBoolean(stringRepresentation));
    }

    public YangBoolean createValue(String stringRepresentation)
            throws JNCException {
        return new YangBoolean(stringRepresentation);
    }

    public Class<YangBoolean> valueClass() {
        return YangBoolean.class;
    }

    /**
     * Constructor for an empty Enabled object.
     */
    public Enabled() {
        super(RobocopSchema.NAMESPACE, "enabled");
    }

    /**
     * Constructor for an empty Enabled object.
     */
    public Enabled(YangBoolean value) {
        super(RobocopSchema.NAMESPACE, "enabled");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Enabled clone() {
        return (Enabled)cloneContent(new Enabled());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Enabled cloneShallow() {
        return (Enabled)cloneShallowContent(new Enabled());
    }

    public Enabled cloneWithoutChildren() {
        return new Enabled();
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
