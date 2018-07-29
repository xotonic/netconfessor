
package com.netconfessor.gen.apConfig.config.interface_;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.config.interface_.vlan.Basic;
import com.netconfessor.gen.apConfig.config.interface_.vlan.VlanId;

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
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Vlan extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "basic".
     */
    public Basic basic = null;

    /**
     * Field for child leaf "vlan-id".
     */
    public VlanId vlanId = null;

    /**
     * Constructor for an empty Vlan object.
     */
    public Vlan() {
        super(ApConfigSchema.NAMESPACE, "vlan");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Vlan clone() {
        return (Vlan)cloneContent(new Vlan());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Vlan cloneShallow() {
        return (Vlan)cloneShallowContent(new Vlan());
    }

    public Vlan cloneWithoutChildren() {
        return new Vlan();
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
            "basic",
            "vlan-id",
        };
    }

    /* Access methods for optional leaf child: "basic". */

    /**
     * Adds leaf entry "basic", using an existing object.
     * @param basic The object to add.
     * @return The added child.
     */
    public Basic addBasic(Basic basic) throws JNCException {
        this.basic = basic;
        insertChild(basic, childrenNames());
        return basic;
    }

    /**
     * Adds leaf entry "basic".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Basic addBasic() throws JNCException {
        Basic basic = new Basic();
        this.basic = basic;
        insertChild(basic, childrenNames());
        return basic;
    }

    /**
     * Deletes leaf entry "basic".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteBasic() throws JNCException {
        this.basic = null;
        String path = "basic";
        return delete(path);
    }

    /* Access methods for optional leaf child: "vlan-id". */

    /**
     * Adds leaf entry "vlanId", using an existing object.
     * @param vlanId The object to add.
     * @return The added child.
     */
    public VlanId addVlanId(VlanId vlanId) throws JNCException {
        this.vlanId = vlanId;
        insertChild(vlanId, childrenNames());
        return vlanId;
    }

    /**
     * Adds leaf entry "vlanId".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public VlanId addVlanId() throws JNCException {
        VlanId vlanId = new VlanId();
        this.vlanId = vlanId;
        insertChild(vlanId, childrenNames());
        return vlanId;
    }

    /**
     * Deletes leaf entry "vlanId".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteVlanId() throws JNCException {
        this.vlanId = null;
        String path = "vlan-id";
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
        if (child instanceof Basic) basic = (Basic)child;
        else if (child instanceof VlanId) vlanId = (VlanId)child;
    }

}
