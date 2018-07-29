
package io.netconfessor.gen.apConfig.config.trace.networkd;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.Enum_0_1;

/**
 * Toggle info messages
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Info extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_0_1 value() {
        return (Enum_0_1) getValue();
    }

    /**
     * Sets the value  leaf "info",
     * @param infoValue used during instantiation.
     */
    public void value(Enum_0_1 infoValue) throws JNCException {
        setValue(infoValue);
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
     * Constructor for an empty Info object.
     */
    public Info() {
        super(ApConfigSchema.NAMESPACE, "info");
    }

    /**
     * Constructor for an empty Info object.
     */
    public Info(Enum_0_1 value) {
        super(ApConfigSchema.NAMESPACE, "info");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Info clone() {
        return (Info)cloneContent(new Info());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Info cloneShallow() {
        return (Info)cloneShallowContent(new Info());
    }

    public Info cloneWithoutChildren() {
        return new Info();
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
