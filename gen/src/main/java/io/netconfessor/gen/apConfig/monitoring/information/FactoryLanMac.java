
package io.netconfessor.gen.apConfig.monitoring.information;

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
public class FactoryLanMac extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "factory-lan-mac",
     * @param factoryLanMacValue used during instantiation.
     */
    public void value(YangString factoryLanMacValue) throws JNCException {
        setValue(factoryLanMacValue);
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
     * Constructor for an empty FactoryLanMac object.
     */
    public FactoryLanMac() {
        super(ApConfigSchema.NAMESPACE, "factory-lan-mac");
    }

    /**
     * Constructor for an empty FactoryLanMac object.
     */
    public FactoryLanMac(YangString value) {
        super(ApConfigSchema.NAMESPACE, "factory-lan-mac");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public FactoryLanMac clone() {
        return (FactoryLanMac)cloneContent(new FactoryLanMac());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public FactoryLanMac cloneShallow() {
        return (FactoryLanMac)cloneShallowContent(new FactoryLanMac());
    }

    public FactoryLanMac cloneWithoutChildren() {
        return new FactoryLanMac();
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
