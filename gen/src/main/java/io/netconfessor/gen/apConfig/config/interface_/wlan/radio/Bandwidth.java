
package io.netconfessor.gen.apConfig.config.interface_.wlan.radio;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.Enum_5_10_20_40_80;

/**
 * Channel bandwidth
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Bandwidth extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_5_10_20_40_80 value() {
        return (Enum_5_10_20_40_80) getValue();
    }

    /**
     * Sets the value  leaf "bandwidth",
     * @param bandwidthValue used during instantiation.
     */
    public void value(Enum_5_10_20_40_80 bandwidthValue) throws JNCException {
        setValue(bandwidthValue);
    }

    public Enum_5_10_20_40_80 defaultValue() throws JNCException {
        return null;
    }

    public boolean hasDefaultValue() {
        return false;
    }

    public void instantiateValue(String stringRepresentation)
            throws JNCException {
        value(new Enum_5_10_20_40_80(stringRepresentation));
    }

    public Enum_5_10_20_40_80 createValue(String stringRepresentation)
            throws JNCException {
        return new Enum_5_10_20_40_80(stringRepresentation);
    }

    public Class<Enum_5_10_20_40_80> valueClass() {
        return Enum_5_10_20_40_80.class;
    }

    /**
     * Constructor for an empty Bandwidth object.
     */
    public Bandwidth() {
        super(ApConfigSchema.NAMESPACE, "bandwidth");
    }

    /**
     * Constructor for an empty Bandwidth object.
     */
    public Bandwidth(Enum_5_10_20_40_80 value) {
        super(ApConfigSchema.NAMESPACE, "bandwidth");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Bandwidth clone() {
        return (Bandwidth)cloneContent(new Bandwidth());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Bandwidth cloneShallow() {
        return (Bandwidth)cloneShallowContent(new Bandwidth());
    }

    public Bandwidth cloneWithoutChildren() {
        return new Bandwidth();
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
