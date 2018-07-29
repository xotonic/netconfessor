
package com.netconfessor.gen.robocop.ammo;

import com.netconfessor.gen.robocop.RobocopSchema;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangInt32;

/**
 * Rocket launcher ammo count
 * <br/>
 * Namespace: jnc:test:robocop
 *
 * @author jnc.py
 */
public class RocketAmmo extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangInt32 value() {
        return (YangInt32) getValue();
    }

    /**
     * Sets the value  leaf "rocket-ammo",
     * @param rocketAmmoValue used during instantiation.
     */
    public void value(YangInt32 rocketAmmoValue) throws JNCException {
        setValue(rocketAmmoValue);
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
     * Constructor for an empty RocketAmmo object.
     */
    public RocketAmmo() {
        super(RobocopSchema.NAMESPACE, "rocket-ammo");
    }

    /**
     * Constructor for an empty RocketAmmo object.
     */
    public RocketAmmo(YangInt32 value) {
        super(RobocopSchema.NAMESPACE, "rocket-ammo");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public RocketAmmo clone() {
        return (RocketAmmo)cloneContent(new RocketAmmo());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public RocketAmmo cloneShallow() {
        return (RocketAmmo)cloneShallowContent(new RocketAmmo());
    }

    public RocketAmmo cloneWithoutChildren() {
        return new RocketAmmo();
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
