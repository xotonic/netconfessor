
package com.netconfessor.gen.robocop;

import com.netconfessor.gen.robocop.RobocopSchema;
import com.netconfessor.gen.robocop.ammo.PistolAmmo;
import com.netconfessor.gen.robocop.ammo.RocketAmmo;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.NodeSet;
import io.netconfessor.YangContainer;
import io.netconfessor.YangElement;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * <br/>
 * Namespace: jnc:test:robocop
 *
 * @author jnc.py
 */
public class Ammo extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "pistol-ammo".
     */
    public PistolAmmo pistolAmmo = null;

    /**
     * Field for child leaf "rocket-ammo".
     */
    public RocketAmmo rocketAmmo = null;

    /**
     * Constructor for an empty Ammo object.
     */
    public Ammo() {
        super(RobocopSchema.NAMESPACE, "ammo");
        setDefaultPrefix();
        setPrefix(RobocopSchema.PREFIX);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Ammo clone() {
        return (Ammo)cloneContent(new Ammo());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Ammo cloneShallow() {
        return (Ammo)cloneShallowContent(new Ammo());
    }

    public Ammo cloneWithoutChildren() {
        return new Ammo();
    }

    /**
     * @return An array with the identifiers of any key children
     */
    public String[] keyNames() {
        return null;
    }

    /**
     * @return An array with the identifiers of any children, in order.
     */
    public String[] childrenNames() {
        return new String[] {
            "pistol-ammo",
            "rocket-ammo",
        };
    }

    /* Access methods for optional leaf child: "pistol-ammo". */

    /**
     * Adds leaf entry "pistolAmmo", using an existing object.
     * @param pistolAmmo The object to add.
     * @return The added child.
     */
    public PistolAmmo addPistolAmmo(PistolAmmo pistolAmmo) throws JNCException {
        this.pistolAmmo = pistolAmmo;
        insertChild(pistolAmmo, childrenNames());
        return pistolAmmo;
    }

    /**
     * Adds leaf entry "pistolAmmo".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public PistolAmmo addPistolAmmo() throws JNCException {
        PistolAmmo pistolAmmo = new PistolAmmo();
        this.pistolAmmo = pistolAmmo;
        insertChild(pistolAmmo, childrenNames());
        return pistolAmmo;
    }

    /**
     * Deletes leaf entry "pistolAmmo".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deletePistolAmmo() throws JNCException {
        this.pistolAmmo = null;
        String path = "pistol-ammo";
        return delete(path);
    }

    /* Access methods for optional leaf child: "rocket-ammo". */

    /**
     * Adds leaf entry "rocketAmmo", using an existing object.
     * @param rocketAmmo The object to add.
     * @return The added child.
     */
    public RocketAmmo addRocketAmmo(RocketAmmo rocketAmmo) throws JNCException {
        this.rocketAmmo = rocketAmmo;
        insertChild(rocketAmmo, childrenNames());
        return rocketAmmo;
    }

    /**
     * Adds leaf entry "rocketAmmo".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public RocketAmmo addRocketAmmo() throws JNCException {
        RocketAmmo rocketAmmo = new RocketAmmo();
        this.rocketAmmo = rocketAmmo;
        insertChild(rocketAmmo, childrenNames());
        return rocketAmmo;
    }

    /**
     * Deletes leaf entry "rocketAmmo".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteRocketAmmo() throws JNCException {
        this.rocketAmmo = null;
        String path = "rocket-ammo";
        return delete(path);
    }

    @Override
    public boolean hasLists() {
        return false;
    }

    @Override
    public List<NodeSet> getLists() throws JNCException {
        List<NodeSet> lists = new LinkedList<>();
        return lists;
    }

    /**
     * Support method for addChild.
     * Adds a child to this object.
     * 
     * @param child The child to add
     */
    public void addChild(Element child) {
        super.addChild(child);
        if (child instanceof PistolAmmo) pistolAmmo = (PistolAmmo)child;
        else if (child instanceof RocketAmmo) rocketAmmo = (RocketAmmo)child;
    }

}
