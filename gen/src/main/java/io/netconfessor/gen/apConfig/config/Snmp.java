
package io.netconfessor.gen.apConfig.config;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.NodeSet;
import io.netconfessor.YangContainer;
import io.netconfessor.YangElement;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.config.snmp.Enable;
import io.netconfessor.gen.apConfig.config.snmp.Informsink;
import io.netconfessor.gen.apConfig.config.snmp.Rocommunity;
import io.netconfessor.gen.apConfig.config.snmp.Rwcommunity;
import io.netconfessor.gen.apConfig.config.snmp.Syscontact;
import io.netconfessor.gen.apConfig.config.snmp.Syslocation;
import io.netconfessor.gen.apConfig.config.snmp.Sysname;
import io.netconfessor.gen.apConfig.config.snmp.Trap2sink;
import io.netconfessor.gen.apConfig.config.snmp.Trapcommunity;
import io.netconfessor.gen.apConfig.config.snmp.Trapsink;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Snmp extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "enable".
     */
    public Enable enable = null;

    /**
     * Field for child leaf "rocommunity".
     */
    public Rocommunity rocommunity = null;

    /**
     * Field for child leaf "rwcommunity".
     */
    public Rwcommunity rwcommunity = null;

    /**
     * Field for child leaf "trapsink".
     */
    public Trapsink trapsink = null;

    /**
     * Field for child leaf "trap2sink".
     */
    public Trap2sink trap2sink = null;

    /**
     * Field for child leaf "informsink".
     */
    public Informsink informsink = null;

    /**
     * Field for child leaf "sysname".
     */
    public Sysname sysname = null;

    /**
     * Field for child leaf "syscontact".
     */
    public Syscontact syscontact = null;

    /**
     * Field for child leaf "syslocation".
     */
    public Syslocation syslocation = null;

    /**
     * Field for child leaf "trapcommunity".
     */
    public Trapcommunity trapcommunity = null;

    /**
     * Constructor for an empty Snmp object.
     */
    public Snmp() {
        super(ApConfigSchema.NAMESPACE, "snmp");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Snmp clone() {
        return (Snmp)cloneContent(new Snmp());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Snmp cloneShallow() {
        return (Snmp)cloneShallowContent(new Snmp());
    }

    public Snmp cloneWithoutChildren() {
        return new Snmp();
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
            "rocommunity",
            "rwcommunity",
            "trapsink",
            "trap2sink",
            "informsink",
            "sysname",
            "syscontact",
            "syslocation",
            "trapcommunity",
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

    /* Access methods for optional leaf child: "rocommunity". */

    /**
     * Adds leaf entry "rocommunity", using an existing object.
     * @param rocommunity The object to add.
     * @return The added child.
     */
    public Rocommunity addRocommunity(Rocommunity rocommunity)
            throws JNCException {
        this.rocommunity = rocommunity;
        insertChild(rocommunity, childrenNames());
        return rocommunity;
    }

    /**
     * Adds leaf entry "rocommunity".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Rocommunity addRocommunity() throws JNCException {
        Rocommunity rocommunity = new Rocommunity();
        this.rocommunity = rocommunity;
        insertChild(rocommunity, childrenNames());
        return rocommunity;
    }

    /**
     * Deletes leaf entry "rocommunity".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteRocommunity() throws JNCException {
        this.rocommunity = null;
        String path = "rocommunity";
        return delete(path);
    }

    /* Access methods for optional leaf child: "rwcommunity". */

    /**
     * Adds leaf entry "rwcommunity", using an existing object.
     * @param rwcommunity The object to add.
     * @return The added child.
     */
    public Rwcommunity addRwcommunity(Rwcommunity rwcommunity)
            throws JNCException {
        this.rwcommunity = rwcommunity;
        insertChild(rwcommunity, childrenNames());
        return rwcommunity;
    }

    /**
     * Adds leaf entry "rwcommunity".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Rwcommunity addRwcommunity() throws JNCException {
        Rwcommunity rwcommunity = new Rwcommunity();
        this.rwcommunity = rwcommunity;
        insertChild(rwcommunity, childrenNames());
        return rwcommunity;
    }

    /**
     * Deletes leaf entry "rwcommunity".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteRwcommunity() throws JNCException {
        this.rwcommunity = null;
        String path = "rwcommunity";
        return delete(path);
    }

    /* Access methods for optional leaf child: "trapsink". */

    /**
     * Adds leaf entry "trapsink", using an existing object.
     * @param trapsink The object to add.
     * @return The added child.
     */
    public Trapsink addTrapsink(Trapsink trapsink) throws JNCException {
        this.trapsink = trapsink;
        insertChild(trapsink, childrenNames());
        return trapsink;
    }

    /**
     * Adds leaf entry "trapsink".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Trapsink addTrapsink() throws JNCException {
        Trapsink trapsink = new Trapsink();
        this.trapsink = trapsink;
        insertChild(trapsink, childrenNames());
        return trapsink;
    }

    /**
     * Deletes leaf entry "trapsink".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteTrapsink() throws JNCException {
        this.trapsink = null;
        String path = "trapsink";
        return delete(path);
    }

    /* Access methods for optional leaf child: "trap2sink". */

    /**
     * Adds leaf entry "trap2sink", using an existing object.
     * @param trap2sink The object to add.
     * @return The added child.
     */
    public Trap2sink addTrap2sink(Trap2sink trap2sink) throws JNCException {
        this.trap2sink = trap2sink;
        insertChild(trap2sink, childrenNames());
        return trap2sink;
    }

    /**
     * Adds leaf entry "trap2sink".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Trap2sink addTrap2sink() throws JNCException {
        Trap2sink trap2sink = new Trap2sink();
        this.trap2sink = trap2sink;
        insertChild(trap2sink, childrenNames());
        return trap2sink;
    }

    /**
     * Deletes leaf entry "trap2sink".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteTrap2sink() throws JNCException {
        this.trap2sink = null;
        String path = "trap2sink";
        return delete(path);
    }

    /* Access methods for optional leaf child: "informsink". */

    /**
     * Adds leaf entry "informsink", using an existing object.
     * @param informsink The object to add.
     * @return The added child.
     */
    public Informsink addInformsink(Informsink informsink) throws JNCException {
        this.informsink = informsink;
        insertChild(informsink, childrenNames());
        return informsink;
    }

    /**
     * Adds leaf entry "informsink".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Informsink addInformsink() throws JNCException {
        Informsink informsink = new Informsink();
        this.informsink = informsink;
        insertChild(informsink, childrenNames());
        return informsink;
    }

    /**
     * Deletes leaf entry "informsink".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteInformsink() throws JNCException {
        this.informsink = null;
        String path = "informsink";
        return delete(path);
    }

    /* Access methods for optional leaf child: "sysname". */

    /**
     * Adds leaf entry "sysname", using an existing object.
     * @param sysname The object to add.
     * @return The added child.
     */
    public Sysname addSysname(Sysname sysname) throws JNCException {
        this.sysname = sysname;
        insertChild(sysname, childrenNames());
        return sysname;
    }

    /**
     * Adds leaf entry "sysname".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Sysname addSysname() throws JNCException {
        Sysname sysname = new Sysname();
        this.sysname = sysname;
        insertChild(sysname, childrenNames());
        return sysname;
    }

    /**
     * Deletes leaf entry "sysname".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteSysname() throws JNCException {
        this.sysname = null;
        String path = "sysname";
        return delete(path);
    }

    /* Access methods for optional leaf child: "syscontact". */

    /**
     * Adds leaf entry "syscontact", using an existing object.
     * @param syscontact The object to add.
     * @return The added child.
     */
    public Syscontact addSyscontact(Syscontact syscontact) throws JNCException {
        this.syscontact = syscontact;
        insertChild(syscontact, childrenNames());
        return syscontact;
    }

    /**
     * Adds leaf entry "syscontact".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Syscontact addSyscontact() throws JNCException {
        Syscontact syscontact = new Syscontact();
        this.syscontact = syscontact;
        insertChild(syscontact, childrenNames());
        return syscontact;
    }

    /**
     * Deletes leaf entry "syscontact".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteSyscontact() throws JNCException {
        this.syscontact = null;
        String path = "syscontact";
        return delete(path);
    }

    /* Access methods for optional leaf child: "syslocation". */

    /**
     * Adds leaf entry "syslocation", using an existing object.
     * @param syslocation The object to add.
     * @return The added child.
     */
    public Syslocation addSyslocation(Syslocation syslocation)
            throws JNCException {
        this.syslocation = syslocation;
        insertChild(syslocation, childrenNames());
        return syslocation;
    }

    /**
     * Adds leaf entry "syslocation".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Syslocation addSyslocation() throws JNCException {
        Syslocation syslocation = new Syslocation();
        this.syslocation = syslocation;
        insertChild(syslocation, childrenNames());
        return syslocation;
    }

    /**
     * Deletes leaf entry "syslocation".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteSyslocation() throws JNCException {
        this.syslocation = null;
        String path = "syslocation";
        return delete(path);
    }

    /* Access methods for optional leaf child: "trapcommunity". */

    /**
     * Adds leaf entry "trapcommunity", using an existing object.
     * @param trapcommunity The object to add.
     * @return The added child.
     */
    public Trapcommunity addTrapcommunity(Trapcommunity trapcommunity)
            throws JNCException {
        this.trapcommunity = trapcommunity;
        insertChild(trapcommunity, childrenNames());
        return trapcommunity;
    }

    /**
     * Adds leaf entry "trapcommunity".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Trapcommunity addTrapcommunity() throws JNCException {
        Trapcommunity trapcommunity = new Trapcommunity();
        this.trapcommunity = trapcommunity;
        insertChild(trapcommunity, childrenNames());
        return trapcommunity;
    }

    /**
     * Deletes leaf entry "trapcommunity".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteTrapcommunity() throws JNCException {
        this.trapcommunity = null;
        String path = "trapcommunity";
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
        else if (child instanceof Rocommunity) rocommunity = (Rocommunity)child;
        else if (child instanceof Rwcommunity) rwcommunity = (Rwcommunity)child;
        else if (child instanceof Trapsink) trapsink = (Trapsink)child;
        else if (child instanceof Trap2sink) trap2sink = (Trap2sink)child;
        else if (child instanceof Informsink) informsink = (Informsink)child;
        else if (child instanceof Sysname) sysname = (Sysname)child;
        else if (child instanceof Syscontact) syscontact = (Syscontact)child;
        else if (child instanceof Syslocation) syslocation = (Syslocation)child;
        else if (child instanceof Trapcommunity) trapcommunity = (Trapcommunity)child;
    }

}
