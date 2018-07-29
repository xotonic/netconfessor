
package io.netconfessor.gen.apConfig.config.snmp;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangString;
import io.netconfessor.gen.apConfig.ApConfigSchema;

/**
 * System location
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Syslocation extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "syslocation",
     * @param syslocationValue used during instantiation.
     */
    public void value(YangString syslocationValue) throws JNCException {
        setValue(syslocationValue);
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
     * Constructor for an empty Syslocation object.
     */
    public Syslocation() {
        super(ApConfigSchema.NAMESPACE, "syslocation");
    }

    /**
     * Constructor for an empty Syslocation object.
     */
    public Syslocation(YangString value) {
        super(ApConfigSchema.NAMESPACE, "syslocation");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Syslocation clone() {
        return (Syslocation)cloneContent(new Syslocation());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Syslocation cloneShallow() {
        return (Syslocation)cloneShallowContent(new Syslocation());
    }

    public Syslocation cloneWithoutChildren() {
        return new Syslocation();
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
