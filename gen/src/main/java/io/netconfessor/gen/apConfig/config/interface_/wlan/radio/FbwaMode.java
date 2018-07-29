
package io.netconfessor.gen.apConfig.config.interface_.wlan.radio;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.Enum_0_1;

/**
 * Fixed broadband wireless access mode
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class FbwaMode extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_0_1 value() {
        return (Enum_0_1) getValue();
    }

    /**
     * Sets the value  leaf "fbwa-mode",
     * @param fbwaModeValue used during instantiation.
     */
    public void value(Enum_0_1 fbwaModeValue) throws JNCException {
        setValue(fbwaModeValue);
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
     * Constructor for an empty FbwaMode object.
     */
    public FbwaMode() {
        super(ApConfigSchema.NAMESPACE, "fbwa-mode");
    }

    /**
     * Constructor for an empty FbwaMode object.
     */
    public FbwaMode(Enum_0_1 value) {
        super(ApConfigSchema.NAMESPACE, "fbwa-mode");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public FbwaMode clone() {
        return (FbwaMode)cloneContent(new FbwaMode());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public FbwaMode cloneShallow() {
        return (FbwaMode)cloneShallowContent(new FbwaMode());
    }

    public FbwaMode cloneWithoutChildren() {
        return new FbwaMode();
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
