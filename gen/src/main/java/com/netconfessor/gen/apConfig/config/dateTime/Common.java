
package com.netconfessor.gen.apConfig.config.dateTime;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.config.dateTime.common.Dstenable;
import com.netconfessor.gen.apConfig.config.dateTime.common.Dstend;
import com.netconfessor.gen.apConfig.config.dateTime.common.Dstoffset;
import com.netconfessor.gen.apConfig.config.dateTime.common.Dststart;
import com.netconfessor.gen.apConfig.config.dateTime.common.Timezone;

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
public class Common extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "timezone".
     */
    public Timezone timezone = null;

    /**
     * Field for child leaf "dstenable".
     */
    public Dstenable dstenable = null;

    /**
     * Field for child leaf "dststart".
     */
    public Dststart dststart = null;

    /**
     * Field for child leaf "dstend".
     */
    public Dstend dstend = null;

    /**
     * Field for child leaf "dstoffset".
     */
    public Dstoffset dstoffset = null;

    /**
     * Constructor for an empty Common object.
     */
    public Common() {
        super(ApConfigSchema.NAMESPACE, "common");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Common clone() {
        return (Common)cloneContent(new Common());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Common cloneShallow() {
        return (Common)cloneShallowContent(new Common());
    }

    public Common cloneWithoutChildren() {
        return new Common();
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
            "timezone",
            "dstenable",
            "dststart",
            "dstend",
            "dstoffset",
        };
    }

    /* Access methods for optional leaf child: "timezone". */

    /**
     * Adds leaf entry "timezone", using an existing object.
     * @param timezone The object to add.
     * @return The added child.
     */
    public Timezone addTimezone(Timezone timezone) throws JNCException {
        this.timezone = timezone;
        insertChild(timezone, childrenNames());
        return timezone;
    }

    /**
     * Adds leaf entry "timezone".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Timezone addTimezone() throws JNCException {
        Timezone timezone = new Timezone();
        this.timezone = timezone;
        insertChild(timezone, childrenNames());
        return timezone;
    }

    /**
     * Deletes leaf entry "timezone".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteTimezone() throws JNCException {
        this.timezone = null;
        String path = "timezone";
        return delete(path);
    }

    /* Access methods for optional leaf child: "dstenable". */

    /**
     * Adds leaf entry "dstenable", using an existing object.
     * @param dstenable The object to add.
     * @return The added child.
     */
    public Dstenable addDstenable(Dstenable dstenable) throws JNCException {
        this.dstenable = dstenable;
        insertChild(dstenable, childrenNames());
        return dstenable;
    }

    /**
     * Adds leaf entry "dstenable".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Dstenable addDstenable() throws JNCException {
        Dstenable dstenable = new Dstenable();
        this.dstenable = dstenable;
        insertChild(dstenable, childrenNames());
        return dstenable;
    }

    /**
     * Deletes leaf entry "dstenable".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteDstenable() throws JNCException {
        this.dstenable = null;
        String path = "dstenable";
        return delete(path);
    }

    /* Access methods for optional leaf child: "dststart". */

    /**
     * Adds leaf entry "dststart", using an existing object.
     * @param dststart The object to add.
     * @return The added child.
     */
    public Dststart addDststart(Dststart dststart) throws JNCException {
        this.dststart = dststart;
        insertChild(dststart, childrenNames());
        return dststart;
    }

    /**
     * Adds leaf entry "dststart".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Dststart addDststart() throws JNCException {
        Dststart dststart = new Dststart();
        this.dststart = dststart;
        insertChild(dststart, childrenNames());
        return dststart;
    }

    /**
     * Deletes leaf entry "dststart".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteDststart() throws JNCException {
        this.dststart = null;
        String path = "dststart";
        return delete(path);
    }

    /* Access methods for optional leaf child: "dstend". */

    /**
     * Adds leaf entry "dstend", using an existing object.
     * @param dstend The object to add.
     * @return The added child.
     */
    public Dstend addDstend(Dstend dstend) throws JNCException {
        this.dstend = dstend;
        insertChild(dstend, childrenNames());
        return dstend;
    }

    /**
     * Adds leaf entry "dstend".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Dstend addDstend() throws JNCException {
        Dstend dstend = new Dstend();
        this.dstend = dstend;
        insertChild(dstend, childrenNames());
        return dstend;
    }

    /**
     * Deletes leaf entry "dstend".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteDstend() throws JNCException {
        this.dstend = null;
        String path = "dstend";
        return delete(path);
    }

    /* Access methods for optional leaf child: "dstoffset". */

    /**
     * Adds leaf entry "dstoffset", using an existing object.
     * @param dstoffset The object to add.
     * @return The added child.
     */
    public Dstoffset addDstoffset(Dstoffset dstoffset) throws JNCException {
        this.dstoffset = dstoffset;
        insertChild(dstoffset, childrenNames());
        return dstoffset;
    }

    /**
     * Adds leaf entry "dstoffset".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Dstoffset addDstoffset() throws JNCException {
        Dstoffset dstoffset = new Dstoffset();
        this.dstoffset = dstoffset;
        insertChild(dstoffset, childrenNames());
        return dstoffset;
    }

    /**
     * Deletes leaf entry "dstoffset".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteDstoffset() throws JNCException {
        this.dstoffset = null;
        String path = "dstoffset";
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
        if (child instanceof Timezone) timezone = (Timezone)child;
        else if (child instanceof Dstenable) dstenable = (Dstenable)child;
        else if (child instanceof Dststart) dststart = (Dststart)child;
        else if (child instanceof Dstend) dstend = (Dstend)child;
        else if (child instanceof Dstoffset) dstoffset = (Dstoffset)child;
    }

}
