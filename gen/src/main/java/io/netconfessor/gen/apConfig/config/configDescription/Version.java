
package io.netconfessor.gen.apConfig.config.configDescription;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangString;
import io.netconfessor.gen.apConfig.ApConfigSchema;

/**
 * Configuration version
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Version extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "version",
     * @param versionValue used during instantiation.
     */
    public void value(YangString versionValue) throws JNCException {
        setValue(versionValue);
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
     * Constructor for an empty Version object.
     */
    public Version() {
        super(ApConfigSchema.NAMESPACE, "version");
    }

    /**
     * Constructor for an empty Version object.
     */
    public Version(YangString value) {
        super(ApConfigSchema.NAMESPACE, "version");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Version clone() {
        return (Version)cloneContent(new Version());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Version cloneShallow() {
        return (Version)cloneShallowContent(new Version());
    }

    public Version cloneWithoutChildren() {
        return new Version();
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
