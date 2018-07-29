
package io.netconfessor.gen.apConfig.config.dateTime;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.NodeSet;
import io.netconfessor.YangContainer;
import io.netconfessor.YangElement;
import io.netconfessor.gen.apConfig.ApConfigSchema;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Manual extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty Manual object.
     */
    public Manual() {
        super(ApConfigSchema.NAMESPACE, "manual");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Manual clone() {
        return (Manual)cloneContent(new Manual());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Manual cloneShallow() {
        return (Manual)cloneShallowContent(new Manual());
    }

    public Manual cloneWithoutChildren() {
        return new Manual();
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
