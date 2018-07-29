
package io.netconfessor.gen.apConfig.config;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.NodeSet;
import io.netconfessor.YangContainer;
import io.netconfessor.YangElement;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.config.dateTime.Common;
import io.netconfessor.gen.apConfig.config.dateTime.Manual;
import io.netconfessor.gen.apConfig.config.dateTime.Mode;
import io.netconfessor.gen.apConfig.config.dateTime.Ntp;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class DateTime extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "mode".
     */
    public Mode mode = null;

    /**
     * Field for child container "common".
     */
    public Common common = null;

    /**
     * Field for child container "manual".
     */
    public Manual manual = null;

    /**
     * Field for child container "ntp".
     */
    public Ntp ntp = null;

    /**
     * Constructor for an empty DateTime object.
     */
    public DateTime() {
        super(ApConfigSchema.NAMESPACE, "date-time");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public DateTime clone() {
        return (DateTime)cloneContent(new DateTime());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public DateTime cloneShallow() {
        return (DateTime)cloneShallowContent(new DateTime());
    }

    public DateTime cloneWithoutChildren() {
        return new DateTime();
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
            "mode",
            "common",
            "manual",
            "ntp",
        };
    }

    /* Access methods for optional leaf child: "mode". */

    /**
     * Adds leaf entry "mode", using an existing object.
     * @param mode The object to add.
     * @return The added child.
     */
    public Mode addMode(Mode mode) throws JNCException {
        this.mode = mode;
        insertChild(mode, childrenNames());
        return mode;
    }

    /**
     * Adds leaf entry "mode".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Mode addMode() throws JNCException {
        Mode mode = new Mode();
        this.mode = mode;
        insertChild(mode, childrenNames());
        return mode;
    }

    /**
     * Deletes leaf entry "mode".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteMode() throws JNCException {
        this.mode = null;
        String path = "mode";
        return delete(path);
    }

    /* Access methods for container child: "common". */

    /**
     * Adds container entry "common", using an existing object.
     * @param common The object to add.
     * @return The added child.
     */
    public Common addCommon(Common common) throws JNCException {
        this.common = common;
        insertChild(common, childrenNames());
        return common;
    }

    /**
     * Adds container entry "common".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Common addCommon() throws JNCException {
        Common common = new Common();
        this.common = common;
        insertChild(common, childrenNames());
        return common;
    }

    /**
     * Deletes container entry "common".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteCommon() throws JNCException {
        this.common = null;
        String path = "common";
        return delete(path);
    }

    /* Access methods for container child: "manual". */

    /**
     * Adds container entry "manual", using an existing object.
     * @param manual The object to add.
     * @return The added child.
     */
    public Manual addManual(Manual manual) throws JNCException {
        this.manual = manual;
        insertChild(manual, childrenNames());
        return manual;
    }

    /**
     * Adds container entry "manual".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Manual addManual() throws JNCException {
        Manual manual = new Manual();
        this.manual = manual;
        insertChild(manual, childrenNames());
        return manual;
    }

    /**
     * Deletes container entry "manual".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteManual() throws JNCException {
        this.manual = null;
        String path = "manual";
        return delete(path);
    }

    /* Access methods for container child: "ntp". */

    /**
     * Adds container entry "ntp", using an existing object.
     * @param ntp The object to add.
     * @return The added child.
     */
    public Ntp addNtp(Ntp ntp) throws JNCException {
        this.ntp = ntp;
        insertChild(ntp, childrenNames());
        return ntp;
    }

    /**
     * Adds container entry "ntp".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Ntp addNtp() throws JNCException {
        Ntp ntp = new Ntp();
        this.ntp = ntp;
        insertChild(ntp, childrenNames());
        return ntp;
    }

    /**
     * Deletes container entry "ntp".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteNtp() throws JNCException {
        this.ntp = null;
        String path = "ntp";
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
        if (child instanceof Mode) mode = (Mode)child;
        else if (child instanceof Common) common = (Common)child;
        else if (child instanceof Manual) manual = (Manual)child;
        else if (child instanceof Ntp) ntp = (Ntp)child;
    }

}
