
package io.netconfessor.gen.robocop.offenseDetected;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangString;
import io.netconfessor.gen.robocop.RobocopSchema;

/**
 * The full name of the offender
 * <br/>
 * Namespace: jnc:test:robocop
 *
 * @author jnc.py
 */
public class Offender extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "offender",
     * @param offenderValue used during instantiation.
     */
    public void value(YangString offenderValue) throws JNCException {
        setValue(offenderValue);
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
     * Constructor for an empty Offender object.
     */
    public Offender() {
        super(RobocopSchema.NAMESPACE, "offender");
    }

    /**
     * Constructor for an empty Offender object.
     */
    public Offender(YangString value) {
        super(RobocopSchema.NAMESPACE, "offender");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Offender clone() {
        return (Offender)cloneContent(new Offender());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Offender cloneShallow() {
        return (Offender)cloneShallowContent(new Offender());
    }

    public Offender cloneWithoutChildren() {
        return new Offender();
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
