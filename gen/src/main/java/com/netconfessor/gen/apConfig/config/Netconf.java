
package com.netconfessor.gen.apConfig.config;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.config.netconf.Enable;

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
public class Netconf extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "enable".
     */
    public Enable enable = null;

    /**
     * Constructor for an empty Netconf object.
     */
    public Netconf() {
        super(ApConfigSchema.NAMESPACE, "netconf");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Netconf clone() {
        return (Netconf)cloneContent(new Netconf());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Netconf cloneShallow() {
        return (Netconf)cloneShallowContent(new Netconf());
    }

    public Netconf cloneWithoutChildren() {
        return new Netconf();
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
            "enable",
        };
    }

    /* Access methods for optional leaf child: "enable". */

    /**
     * Adds leaf entry "enable", using an existing object.
     * @param enable The object to add.
     * @return The added child.
     */
    public Enable addEnable(Enable enable) throws JNCException {
        this.enable = enable;
        insertChild(enable, childrenNames());
        return enable;
    }

    /**
     * Adds leaf entry "enable".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Enable addEnable() throws JNCException {
        Enable enable = new Enable();
        this.enable = enable;
        insertChild(enable, childrenNames());
        return enable;
    }

    /**
     * Deletes leaf entry "enable".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteEnable() throws JNCException {
        this.enable = null;
        String path = "enable";
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
        if (child instanceof Enable) enable = (Enable)child;
    }

}
