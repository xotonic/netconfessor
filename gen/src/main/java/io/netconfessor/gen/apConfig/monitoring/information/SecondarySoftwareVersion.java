
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
public class SecondarySoftwareVersion extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "secondary-software-version",
     * @param secondarySoftwareVersionValue used during instantiation.
     */
    public void value(YangString secondarySoftwareVersionValue)
            throws JNCException {
        setValue(secondarySoftwareVersionValue);
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
     * Constructor for an empty SecondarySoftwareVersion object.
     */
    public SecondarySoftwareVersion() {
        super(ApConfigSchema.NAMESPACE, "secondary-software-version");
    }

    /**
     * Constructor for an empty SecondarySoftwareVersion object.
     */
    public SecondarySoftwareVersion(YangString value) {
        super(ApConfigSchema.NAMESPACE, "secondary-software-version");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public SecondarySoftwareVersion clone() {
        return (SecondarySoftwareVersion)cloneContent(new SecondarySoftwareVersion());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public SecondarySoftwareVersion cloneShallow() {
        return (SecondarySoftwareVersion)cloneShallowContent(new SecondarySoftwareVersion());
    }

    public SecondarySoftwareVersion cloneWithoutChildren() {
        return new SecondarySoftwareVersion();
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
