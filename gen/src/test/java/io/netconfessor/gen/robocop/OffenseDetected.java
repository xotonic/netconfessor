
package io.netconfessor.gen.robocop;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.NodeSet;
import io.netconfessor.YangContainer;
import io.netconfessor.YangElement;
import io.netconfessor.gen.robocop.RobocopSchema;
import io.netconfessor.gen.robocop.offenseDetected.Offender;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * <br/>
 * Namespace: jnc:test:robocop
 *
 * @author jnc.py
 */
public class OffenseDetected extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "offender".
     */
    public Offender offender = null;

    /**
     * Constructor for an empty OffenseDetected object.
     */
    public OffenseDetected() {
        super(RobocopSchema.NAMESPACE, "offense-detected");
        setDefaultPrefix();
        setPrefix(RobocopSchema.PREFIX);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public OffenseDetected clone() {
        return (OffenseDetected)cloneContent(new OffenseDetected());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public OffenseDetected cloneShallow() {
        return (OffenseDetected)cloneShallowContent(new OffenseDetected());
    }

    public OffenseDetected cloneWithoutChildren() {
        return new OffenseDetected();
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
            "offender",
        };
    }

    /* Access methods for optional leaf child: "offender". */

    /**
     * Adds leaf entry "offender", using an existing object.
     * @param offender The object to add.
     * @return The added child.
     */
    public Offender addOffender(Offender offender) throws JNCException {
        this.offender = offender;
        insertChild(offender, childrenNames());
        return offender;
    }

    /**
     * Adds leaf entry "offender".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Offender addOffender() throws JNCException {
        Offender offender = new Offender();
        this.offender = offender;
        insertChild(offender, childrenNames());
        return offender;
    }

    /**
     * Deletes leaf entry "offender".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteOffender() throws JNCException {
        this.offender = null;
        String path = "offender";
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
        if (child instanceof Offender) offender = (Offender)child;
    }

}
