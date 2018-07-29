
package io.netconfessor.gen.apConfig.config.snmp;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangString;
import io.netconfessor.gen.apConfig.ApConfigSchema;

/**
 * System contact
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Syscontact extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "syscontact",
     * @param syscontactValue used during instantiation.
     */
    public void value(YangString syscontactValue) throws JNCException {
        setValue(syscontactValue);
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
     * Constructor for an empty Syscontact object.
     */
    public Syscontact() {
        super(ApConfigSchema.NAMESPACE, "syscontact");
    }

    /**
     * Constructor for an empty Syscontact object.
     */
    public Syscontact(YangString value) {
        super(ApConfigSchema.NAMESPACE, "syscontact");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Syscontact clone() {
        return (Syscontact)cloneContent(new Syscontact());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Syscontact cloneShallow() {
        return (Syscontact)cloneShallowContent(new Syscontact());
    }

    public Syscontact cloneWithoutChildren() {
        return new Syscontact();
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
