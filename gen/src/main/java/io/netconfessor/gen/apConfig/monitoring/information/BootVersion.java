
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
public class BootVersion extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "boot-version",
     * @param bootVersionValue used during instantiation.
     */
    public void value(YangString bootVersionValue) throws JNCException {
        setValue(bootVersionValue);
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
     * Constructor for an empty BootVersion object.
     */
    public BootVersion() {
        super(ApConfigSchema.NAMESPACE, "boot-version");
    }

    /**
     * Constructor for an empty BootVersion object.
     */
    public BootVersion(YangString value) {
        super(ApConfigSchema.NAMESPACE, "boot-version");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public BootVersion clone() {
        return (BootVersion)cloneContent(new BootVersion());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public BootVersion cloneShallow() {
        return (BootVersion)cloneShallowContent(new BootVersion());
    }

    public BootVersion cloneWithoutChildren() {
        return new BootVersion();
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
