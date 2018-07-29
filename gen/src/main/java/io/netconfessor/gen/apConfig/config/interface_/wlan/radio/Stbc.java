
package io.netconfessor.gen.apConfig.config.interface_.wlan.radio;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.Enum_0_1;

/**
 * STBC encoding
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Stbc extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_0_1 value() {
        return (Enum_0_1) getValue();
    }

    /**
     * Sets the value  leaf "stbc",
     * @param stbcValue used during instantiation.
     */
    public void value(Enum_0_1 stbcValue) throws JNCException {
        setValue(stbcValue);
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
     * Constructor for an empty Stbc object.
     */
    public Stbc() {
        super(ApConfigSchema.NAMESPACE, "stbc");
    }

    /**
     * Constructor for an empty Stbc object.
     */
    public Stbc(Enum_0_1 value) {
        super(ApConfigSchema.NAMESPACE, "stbc");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Stbc clone() {
        return (Stbc)cloneContent(new Stbc());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Stbc cloneShallow() {
        return (Stbc)cloneShallowContent(new Stbc());
    }

    public Stbc cloneWithoutChildren() {
        return new Stbc();
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
