
package com.netconfessor.gen.robocop.primeDirectives.directive;

import com.netconfessor.gen.robocop.RobocopSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangString;

/**
 * 
 * <br/>
 * Namespace: jnc:test:robocop
 *
 * @author jnc.py
 */
public class Code extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "code",
     * @param codeValue used during instantiation.
     */
    public void value(YangString codeValue) throws JNCException {
        setValue(codeValue);
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

    public boolean isKey() {
        return true;
    }

    /**
     * Constructor for an empty Code object.
     */
    public Code() {
        super(RobocopSchema.NAMESPACE, "code");
    }

    /**
     * Constructor for an empty Code object.
     */
    public Code(YangString value) {
        super(RobocopSchema.NAMESPACE, "code");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Code clone() {
        return (Code)cloneContent(new Code());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Code cloneShallow() {
        return (Code)cloneShallowContent(new Code());
    }

    public Code cloneWithoutChildren() {
        return new Code();
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
