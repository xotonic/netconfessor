
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
public class SoftwareVersion extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "software-version",
     * @param softwareVersionValue used during instantiation.
     */
    public void value(YangString softwareVersionValue) throws JNCException {
        setValue(softwareVersionValue);
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
     * Constructor for an empty SoftwareVersion object.
     */
    public SoftwareVersion() {
        super(ApConfigSchema.NAMESPACE, "software-version");
    }

    /**
     * Constructor for an empty SoftwareVersion object.
     */
    public SoftwareVersion(YangString value) {
        super(ApConfigSchema.NAMESPACE, "software-version");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public SoftwareVersion clone() {
        return (SoftwareVersion)cloneContent(new SoftwareVersion());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public SoftwareVersion cloneShallow() {
        return (SoftwareVersion)cloneShallowContent(new SoftwareVersion());
    }

    public SoftwareVersion cloneWithoutChildren() {
        return new SoftwareVersion();
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
