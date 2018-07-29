
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
public class FactoryWanMac extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "factory-wan-mac",
     * @param factoryWanMacValue used during instantiation.
     */
    public void value(YangString factoryWanMacValue) throws JNCException {
        setValue(factoryWanMacValue);
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
     * Constructor for an empty FactoryWanMac object.
     */
    public FactoryWanMac() {
        super(ApConfigSchema.NAMESPACE, "factory-wan-mac");
    }

    /**
     * Constructor for an empty FactoryWanMac object.
     */
    public FactoryWanMac(YangString value) {
        super(ApConfigSchema.NAMESPACE, "factory-wan-mac");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public FactoryWanMac clone() {
        return (FactoryWanMac)cloneContent(new FactoryWanMac());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public FactoryWanMac cloneShallow() {
        return (FactoryWanMac)cloneShallowContent(new FactoryWanMac());
    }

    public FactoryWanMac cloneWithoutChildren() {
        return new FactoryWanMac();
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
