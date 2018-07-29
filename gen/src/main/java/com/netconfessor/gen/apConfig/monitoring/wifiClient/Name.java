
package com.netconfessor.gen.apConfig.monitoring.wifiClient;

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
public class Name extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "name",
     * @param nameValue used during instantiation.
     */
    public void value(YangString nameValue) throws JNCException {
        setValue(nameValue);
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
     * Constructor for an empty Name object.
     */
    public Name() {
        super(ApConfigSchema.NAMESPACE, "name");
    }

    /**
     * Constructor for an empty Name object.
     */
    public Name(YangString value) {
        super(ApConfigSchema.NAMESPACE, "name");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Name clone() {
        return (Name)cloneContent(new Name());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Name cloneShallow() {
        return (Name)cloneShallowContent(new Name());
    }

    public Name cloneWithoutChildren() {
        return new Name();
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
