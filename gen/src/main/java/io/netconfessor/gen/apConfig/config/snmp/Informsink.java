
package io.netconfessor.gen.apConfig.config.snmp;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangString;
import io.netconfessor.gen.apConfig.ApConfigSchema;

/**
 * informsink
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Informsink extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "informsink",
     * @param informsinkValue used during instantiation.
     */
    public void value(YangString informsinkValue) throws JNCException {
        setValue(informsinkValue);
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
     * Constructor for an empty Informsink object.
     */
    public Informsink() {
        super(ApConfigSchema.NAMESPACE, "informsink");
    }

    /**
     * Constructor for an empty Informsink object.
     */
    public Informsink(YangString value) {
        super(ApConfigSchema.NAMESPACE, "informsink");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Informsink clone() {
        return (Informsink)cloneContent(new Informsink());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Informsink cloneShallow() {
        return (Informsink)cloneShallowContent(new Informsink());
    }

    public Informsink cloneWithoutChildren() {
        return new Informsink();
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
