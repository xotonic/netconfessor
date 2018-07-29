
package io.netconfessor.gen.apConfig.lastWlanScanResults.cell;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangString;
import io.netconfessor.gen.apConfig.ApConfigSchema;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Channel extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "channel",
     * @param channelValue used during instantiation.
     */
    public void value(YangString channelValue) throws JNCException {
        setValue(channelValue);
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
     * Constructor for an empty Channel object.
     */
    public Channel() {
        super(ApConfigSchema.NAMESPACE, "channel");
    }

    /**
     * Constructor for an empty Channel object.
     */
    public Channel(YangString value) {
        super(ApConfigSchema.NAMESPACE, "channel");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Channel clone() {
        return (Channel)cloneContent(new Channel());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Channel cloneShallow() {
        return (Channel)cloneShallowContent(new Channel());
    }

    public Channel cloneWithoutChildren() {
        return new Channel();
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
