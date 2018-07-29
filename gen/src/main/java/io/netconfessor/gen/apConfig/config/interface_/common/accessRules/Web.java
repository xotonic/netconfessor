
package io.netconfessor.gen.apConfig.config.interface_.common.accessRules;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.Enum_0_1;

/**
 * Interface specific access rule for Web
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Web extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_0_1 value() {
        return (Enum_0_1) getValue();
    }

    /**
     * Sets the value  leaf "web",
     * @param webValue used during instantiation.
     */
    public void value(Enum_0_1 webValue) throws JNCException {
        setValue(webValue);
    }

    public Enum_0_1 defaultValue() throws JNCException {
        return null;
    }

    public boolean hasDefaultValue() {
        return false;
    }

    public void instantiateValue(String stringRepresentation)
            throws JNCException {
        value(new Enum_0_1(stringRepresentation));
    }

    public Enum_0_1 createValue(String stringRepresentation)
            throws JNCException {
        return new Enum_0_1(stringRepresentation);
    }

    public Class<Enum_0_1> valueClass() {
        return Enum_0_1.class;
    }

    /**
     * Constructor for an empty Web object.
     */
    public Web() {
        super(ApConfigSchema.NAMESPACE, "web");
    }

    /**
     * Constructor for an empty Web object.
     */
    public Web(Enum_0_1 value) {
        super(ApConfigSchema.NAMESPACE, "web");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Web clone() {
        return (Web)cloneContent(new Web());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Web cloneShallow() {
        return (Web)cloneShallowContent(new Web());
    }

    public Web cloneWithoutChildren() {
        return new Web();
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
