
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
public class Bssid extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangString value() {
        return (YangString) getValue();
    }

    /**
     * Sets the value  leaf "bssid",
     * @param bssidValue used during instantiation.
     */
    public void value(YangString bssidValue) throws JNCException {
        setValue(bssidValue);
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
     * Constructor for an empty Bssid object.
     */
    public Bssid() {
        super(ApConfigSchema.NAMESPACE, "bssid");
    }

    /**
     * Constructor for an empty Bssid object.
     */
    public Bssid(YangString value) {
        super(ApConfigSchema.NAMESPACE, "bssid");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Bssid clone() {
        return (Bssid)cloneContent(new Bssid());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Bssid cloneShallow() {
        return (Bssid)cloneShallowContent(new Bssid());
    }

    public Bssid cloneWithoutChildren() {
        return new Bssid();
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
