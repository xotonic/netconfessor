
package io.netconfessor.gen.apConfig.config.interface_.common.accessRules;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.Enum_0_1;

/**
 * Interface specific access rule for SSH
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Ssh extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_0_1 value() {
        return (Enum_0_1) getValue();
    }

    /**
     * Sets the value  leaf "ssh",
     * @param sshValue used during instantiation.
     */
    public void value(Enum_0_1 sshValue) throws JNCException {
        setValue(sshValue);
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
     * Constructor for an empty Ssh object.
     */
    public Ssh() {
        super(ApConfigSchema.NAMESPACE, "ssh");
    }

    /**
     * Constructor for an empty Ssh object.
     */
    public Ssh(Enum_0_1 value) {
        super(ApConfigSchema.NAMESPACE, "ssh");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Ssh clone() {
        return (Ssh)cloneContent(new Ssh());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Ssh cloneShallow() {
        return (Ssh)cloneShallowContent(new Ssh());
    }

    public Ssh cloneWithoutChildren() {
        return new Ssh();
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
