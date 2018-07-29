
package com.netconfessor.gen.apConfig.config.snmp;

import com.netconfessor.gen.apConfig.ApConfigSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangString;

/**
 * trap2sink
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Trap2sink extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "trap2sink",
     * @param trap2sinkValue used during instantiation.
     */
    public void value(YangString trap2sinkValue) throws JNCException {
        setValue(trap2sinkValue);
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
     * Constructor for an empty Trap2sink object.
     */
    public Trap2sink() {
        super(ApConfigSchema.NAMESPACE, "trap2sink");
    }

    /**
     * Constructor for an empty Trap2sink object.
     */
    public Trap2sink(YangString value) {
        super(ApConfigSchema.NAMESPACE, "trap2sink");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Trap2sink clone() {
        return (Trap2sink)cloneContent(new Trap2sink());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Trap2sink cloneShallow() {
        return (Trap2sink)cloneShallowContent(new Trap2sink());
    }

    public Trap2sink cloneWithoutChildren() {
        return new Trap2sink();
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
