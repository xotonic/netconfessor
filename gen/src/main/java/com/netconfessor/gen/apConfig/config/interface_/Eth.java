
package com.netconfessor.gen.apConfig.config.interface_;

import com.netconfessor.gen.apConfig.ApConfigSchema;

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
public class Eth extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty Eth object.
     */
    public Eth() {
        super(ApConfigSchema.NAMESPACE, "eth");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Eth clone() {
        return (Eth)cloneContent(new Eth());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Eth cloneShallow() {
        return (Eth)cloneShallowContent(new Eth());
    }

    public Eth cloneWithoutChildren() {
        return new Eth();
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
        };
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
    }

}
