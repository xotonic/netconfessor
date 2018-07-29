
package com.netconfessor.gen.apConfig.config.trace;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.config.trace.networkd.Debug;
import com.netconfessor.gen.apConfig.config.trace.networkd.Error;
import com.netconfessor.gen.apConfig.config.trace.networkd.Info;
import com.netconfessor.gen.apConfig.config.trace.networkd.Traffic;
import com.netconfessor.gen.apConfig.config.trace.networkd.Warn;

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
public class Networkd extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "error".
     */
    public Error error = null;

    /**
     * Field for child leaf "warn".
     */
    public Warn warn = null;

    /**
     * Field for child leaf "info".
     */
    public Info info = null;

    /**
     * Field for child leaf "debug".
     */
    public Debug debug = null;

    /**
     * Field for child leaf "traffic".
     */
    public Traffic traffic = null;

    /**
     * Constructor for an empty Networkd object.
     */
    public Networkd() {
        super(ApConfigSchema.NAMESPACE, "networkd");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Networkd clone() {
        return (Networkd)cloneContent(new Networkd());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Networkd cloneShallow() {
        return (Networkd)cloneShallowContent(new Networkd());
    }

    public Networkd cloneWithoutChildren() {
        return new Networkd();
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
            "error",
            "warn",
            "info",
            "debug",
            "traffic",
        };
    }

    /* Access methods for optional leaf child: "error". */

    /**
     * Adds leaf entry "error", using an existing object.
     * @param error The object to add.
     * @return The added child.
     */
    public Error addError(Error error) throws JNCException {
        this.error = error;
        insertChild(error, childrenNames());
        return error;
    }

    /**
     * Adds leaf entry "error".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Error addError() throws JNCException {
        Error error = new Error();
        this.error = error;
        insertChild(error, childrenNames());
        return error;
    }

    /**
     * Deletes leaf entry "error".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteError() throws JNCException {
        this.error = null;
        String path = "error";
        return delete(path);
    }

    /* Access methods for optional leaf child: "warn". */

    /**
     * Adds leaf entry "warn", using an existing object.
     * @param warn The object to add.
     * @return The added child.
     */
    public Warn addWarn(Warn warn) throws JNCException {
        this.warn = warn;
        insertChild(warn, childrenNames());
        return warn;
    }

    /**
     * Adds leaf entry "warn".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Warn addWarn() throws JNCException {
        Warn warn = new Warn();
        this.warn = warn;
        insertChild(warn, childrenNames());
        return warn;
    }

    /**
     * Deletes leaf entry "warn".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteWarn() throws JNCException {
        this.warn = null;
        String path = "warn";
        return delete(path);
    }

    /* Access methods for optional leaf child: "info". */

    /**
     * Adds leaf entry "info", using an existing object.
     * @param info The object to add.
     * @return The added child.
     */
    public Info addInfo(Info info) throws JNCException {
        this.info = info;
        insertChild(info, childrenNames());
        return info;
    }

    /**
     * Adds leaf entry "info".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Info addInfo() throws JNCException {
        Info info = new Info();
        this.info = info;
        insertChild(info, childrenNames());
        return info;
    }

    /**
     * Deletes leaf entry "info".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteInfo() throws JNCException {
        this.info = null;
        String path = "info";
        return delete(path);
    }

    /* Access methods for optional leaf child: "debug". */

    /**
     * Adds leaf entry "debug", using an existing object.
     * @param debug The object to add.
     * @return The added child.
     */
    public Debug addDebug(Debug debug) throws JNCException {
        this.debug = debug;
        insertChild(debug, childrenNames());
        return debug;
    }

    /**
     * Adds leaf entry "debug".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Debug addDebug() throws JNCException {
        Debug debug = new Debug();
        this.debug = debug;
        insertChild(debug, childrenNames());
        return debug;
    }

    /**
     * Deletes leaf entry "debug".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteDebug() throws JNCException {
        this.debug = null;
        String path = "debug";
        return delete(path);
    }

    /* Access methods for optional leaf child: "traffic". */

    /**
     * Adds leaf entry "traffic", using an existing object.
     * @param traffic The object to add.
     * @return The added child.
     */
    public Traffic addTraffic(Traffic traffic) throws JNCException {
        this.traffic = traffic;
        insertChild(traffic, childrenNames());
        return traffic;
    }

    /**
     * Adds leaf entry "traffic".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Traffic addTraffic() throws JNCException {
        Traffic traffic = new Traffic();
        this.traffic = traffic;
        insertChild(traffic, childrenNames());
        return traffic;
    }

    /**
     * Deletes leaf entry "traffic".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteTraffic() throws JNCException {
        this.traffic = null;
        String path = "traffic";
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
        if (child instanceof Error) error = (Error)child;
        else if (child instanceof Warn) warn = (Warn)child;
        else if (child instanceof Info) info = (Info)child;
        else if (child instanceof Debug) debug = (Debug)child;
        else if (child instanceof Traffic) traffic = (Traffic)child;
    }

}
