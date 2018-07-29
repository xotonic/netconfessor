
package com.netconfessor.gen.apConfig;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.upgradeFirmwareFinished.Status;

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
public class UpgradeFirmwareFinished extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "status".
     */
    public Status status = null;

    /**
     * Constructor for an empty UpgradeFirmwareFinished object.
     */
    public UpgradeFirmwareFinished() {
        super(ApConfigSchema.NAMESPACE, "upgrade-firmware-finished");
        setDefaultPrefix();
        setPrefix(ApConfigSchema.PREFIX);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public UpgradeFirmwareFinished clone() {
        return (UpgradeFirmwareFinished)cloneContent(new UpgradeFirmwareFinished());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public UpgradeFirmwareFinished cloneShallow() {
        return (UpgradeFirmwareFinished)cloneShallowContent(new UpgradeFirmwareFinished());
    }

    public UpgradeFirmwareFinished cloneWithoutChildren() {
        return new UpgradeFirmwareFinished();
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
            "status",
        };
    }

    /* Access methods for optional leaf child: "status". */

    /**
     * Adds leaf entry "status", using an existing object.
     * @param status The object to add.
     * @return The added child.
     */
    public Status addStatus(Status status) throws JNCException {
        this.status = status;
        insertChild(status, childrenNames());
        return status;
    }

    /**
     * Adds leaf entry "status".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Status addStatus() throws JNCException {
        Status status = new Status();
        this.status = status;
        insertChild(status, childrenNames());
        return status;
    }

    /**
     * Deletes leaf entry "status".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteStatus() throws JNCException {
        this.status = null;
        String path = "status";
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
        if (child instanceof Status) status = (Status)child;
    }

}
