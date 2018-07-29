
package io.netconfessor.gen.robocop.ammo;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangInt32;
import io.netconfessor.gen.robocop.RobocopSchema;

/**
 * Pistol ammo count
 * <br/>
 * Namespace: jnc:test:robocop
 *
 * @author jnc.py
 */
public class PistolAmmo extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangInt32 value() {
        return (YangInt32) getValue();
    }

    /**
     * Sets the value  leaf "pistol-ammo",
     * @param pistolAmmoValue used during instantiation.
     */
    public void value(YangInt32 pistolAmmoValue) throws JNCException {
        setValue(pistolAmmoValue);
    }

    public YangInt32 defaultValue() throws JNCException {
        return null;
    }

    public boolean hasDefaultValue() {
        return false;
    }

    public void instantiateValue(String stringRepresentation)
            throws JNCException {
        value(new YangInt32(stringRepresentation));
    }

    public YangInt32 createValue(String stringRepresentation)
            throws JNCException {
        return new YangInt32(stringRepresentation);
    }

    public Class<YangInt32> valueClass() {
        return YangInt32.class;
    }

    /**
     * Constructor for an empty PistolAmmo object.
     */
    public PistolAmmo() {
        super(RobocopSchema.NAMESPACE, "pistol-ammo");
    }

    /**
     * Constructor for an empty PistolAmmo object.
     */
    public PistolAmmo(YangInt32 value) {
        super(RobocopSchema.NAMESPACE, "pistol-ammo");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public PistolAmmo clone() {
        return (PistolAmmo)cloneContent(new PistolAmmo());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public PistolAmmo cloneShallow() {
        return (PistolAmmo)cloneShallowContent(new PistolAmmo());
    }

    public PistolAmmo cloneWithoutChildren() {
        return new PistolAmmo();
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
