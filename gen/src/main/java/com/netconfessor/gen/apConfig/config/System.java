
package com.netconfessor.gen.apConfig.config;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.config.system.GlobalStationIsolation;

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
public class System extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "global-station-isolation".
     */
    public GlobalStationIsolation globalStationIsolation = null;

    /**
     * Constructor for an empty System object.
     */
    public System() {
        super(ApConfigSchema.NAMESPACE, "system");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public System clone() {
        return (System)cloneContent(new System());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public System cloneShallow() {
        return (System)cloneShallowContent(new System());
    }

    public System cloneWithoutChildren() {
        return new System();
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
            "global-station-isolation",
        };
    }

    /* Access methods for optional leaf child: "global-station-isolation". */

    /**
     * Adds leaf entry "globalStationIsolation", using an existing object.
     * @param globalStationIsolation The object to add.
     * @return The added child.
     */
    public GlobalStationIsolation addGlobalStationIsolation(GlobalStationIsolation globalStationIsolation)
            throws JNCException {
        this.globalStationIsolation = globalStationIsolation;
        insertChild(globalStationIsolation, childrenNames());
        return globalStationIsolation;
    }

    /**
     * Adds leaf entry "globalStationIsolation".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public GlobalStationIsolation addGlobalStationIsolation()
            throws JNCException {
        GlobalStationIsolation globalStationIsolation = new GlobalStationIsolation();
        this.globalStationIsolation = globalStationIsolation;
        insertChild(globalStationIsolation, childrenNames());
        return globalStationIsolation;
    }

    /**
     * Deletes leaf entry "globalStationIsolation".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteGlobalStationIsolation() throws JNCException {
        this.globalStationIsolation = null;
        String path = "global-station-isolation";
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
        if (child instanceof GlobalStationIsolation) globalStationIsolation = (GlobalStationIsolation)child;
    }

}
