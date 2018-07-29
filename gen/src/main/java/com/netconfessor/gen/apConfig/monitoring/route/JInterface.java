
package com.netconfessor.gen.apConfig.monitoring.route;

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
public class JInterface extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "interface",
     * @param interface_Value used during instantiation.
     */
    public void value(YangString interface_Value) throws JNCException {
        setValue(interface_Value);
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
     * Constructor for an empty JInterface object.
     */
    public JInterface() {
        super(ApConfigSchema.NAMESPACE, "interface");
    }

    /**
     * Constructor for an empty JInterface object.
     */
    public JInterface(YangString value) {
        super(ApConfigSchema.NAMESPACE, "interface");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public JInterface clone() {
        return (JInterface)cloneContent(new JInterface());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public JInterface cloneShallow() {
        return (JInterface)cloneShallowContent(new JInterface());
    }

    public JInterface cloneWithoutChildren() {
        return new JInterface();
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
