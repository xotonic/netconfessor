
package io.netconfessor.gen.apConfig.config.interface_.gre;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangString;
import io.netconfessor.gen.apConfig.ApConfigSchema;

/**
 * OS interface name
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Linkname extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "linkname",
     * @param linknameValue used during instantiation.
     */
    public void value(YangString linknameValue) throws JNCException {
        setValue(linknameValue);
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
     * Constructor for an empty Linkname object.
     */
    public Linkname() {
        super(ApConfigSchema.NAMESPACE, "linkname");
    }

    /**
     * Constructor for an empty Linkname object.
     */
    public Linkname(YangString value) {
        super(ApConfigSchema.NAMESPACE, "linkname");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Linkname clone() {
        return (Linkname)cloneContent(new Linkname());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Linkname cloneShallow() {
        return (Linkname)cloneShallowContent(new Linkname());
    }

    public Linkname cloneWithoutChildren() {
        return new Linkname();
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
