
package com.netconfessor.gen.apConfig.monitoring.information;

import com.netconfessor.gen.apConfig.ApConfigSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangString;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class BoardType extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "board-type",
     * @param boardTypeValue used during instantiation.
     */
    public void value(YangString boardTypeValue) throws JNCException {
        setValue(boardTypeValue);
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
     * Constructor for an empty BoardType object.
     */
    public BoardType() {
        super(ApConfigSchema.NAMESPACE, "board-type");
    }

    /**
     * Constructor for an empty BoardType object.
     */
    public BoardType(YangString value) {
        super(ApConfigSchema.NAMESPACE, "board-type");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public BoardType clone() {
        return (BoardType)cloneContent(new BoardType());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public BoardType cloneShallow() {
        return (BoardType)cloneShallowContent(new BoardType());
    }

    public BoardType cloneWithoutChildren() {
        return new BoardType();
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
