
package com.netconfessor.gen.apConfig.config;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.config.trace.Networkd;

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
public class Trace extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child container "networkd".
     */
    public Networkd networkd = null;

    /**
     * Constructor for an empty Trace object.
     */
    public Trace() {
        super(ApConfigSchema.NAMESPACE, "trace");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Trace clone() {
        return (Trace)cloneContent(new Trace());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Trace cloneShallow() {
        return (Trace)cloneShallowContent(new Trace());
    }

    public Trace cloneWithoutChildren() {
        return new Trace();
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
            "networkd",
        };
    }

    /* Access methods for container child: "networkd". */

    /**
     * Adds container entry "networkd", using an existing object.
     * @param networkd The object to add.
     * @return The added child.
     */
    public Networkd addNetworkd(Networkd networkd) throws JNCException {
        this.networkd = networkd;
        insertChild(networkd, childrenNames());
        return networkd;
    }

    /**
     * Adds container entry "networkd".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Networkd addNetworkd() throws JNCException {
        Networkd networkd = new Networkd();
        this.networkd = networkd;
        insertChild(networkd, childrenNames());
        return networkd;
    }

    /**
     * Deletes container entry "networkd".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteNetworkd() throws JNCException {
        this.networkd = null;
        String path = "networkd";
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
        if (child instanceof Networkd) networkd = (Networkd)child;
    }

}
