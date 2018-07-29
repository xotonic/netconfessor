
package io.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.NodeSet;
import io.netconfessor.YangContainer;
import io.netconfessor.YangElement;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.edcaSta.Be;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.edcaSta.Bk;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.edcaSta.Vi;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.edcaSta.Vo;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class EdcaSta extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child container "bk".
     */
    public Bk bk = null;

    /**
     * Field for child container "be".
     */
    public Be be = null;

    /**
     * Field for child container "vi".
     */
    public Vi vi = null;

    /**
     * Field for child container "vo".
     */
    public Vo vo = null;

    /**
     * Constructor for an empty EdcaSta object.
     */
    public EdcaSta() {
        super(ApConfigSchema.NAMESPACE, "edca-sta");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public EdcaSta clone() {
        return (EdcaSta)cloneContent(new EdcaSta());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public EdcaSta cloneShallow() {
        return (EdcaSta)cloneShallowContent(new EdcaSta());
    }

    public EdcaSta cloneWithoutChildren() {
        return new EdcaSta();
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
            "bk",
            "be",
            "vi",
            "vo",
        };
    }

    /* Access methods for container child: "bk". */

    /**
     * Adds container entry "bk", using an existing object.
     * @param bk The object to add.
     * @return The added child.
     */
    public Bk addBk(Bk bk) throws JNCException {
        this.bk = bk;
        insertChild(bk, childrenNames());
        return bk;
    }

    /**
     * Adds container entry "bk".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Bk addBk() throws JNCException {
        Bk bk = new Bk();
        this.bk = bk;
        insertChild(bk, childrenNames());
        return bk;
    }

    /**
     * Deletes container entry "bk".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteBk() throws JNCException {
        this.bk = null;
        String path = "bk";
        return delete(path);
    }

    /* Access methods for container child: "be". */

    /**
     * Adds container entry "be", using an existing object.
     * @param be The object to add.
     * @return The added child.
     */
    public Be addBe(Be be) throws JNCException {
        this.be = be;
        insertChild(be, childrenNames());
        return be;
    }

    /**
     * Adds container entry "be".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Be addBe() throws JNCException {
        Be be = new Be();
        this.be = be;
        insertChild(be, childrenNames());
        return be;
    }

    /**
     * Deletes container entry "be".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteBe() throws JNCException {
        this.be = null;
        String path = "be";
        return delete(path);
    }

    /* Access methods for container child: "vi". */

    /**
     * Adds container entry "vi", using an existing object.
     * @param vi The object to add.
     * @return The added child.
     */
    public Vi addVi(Vi vi) throws JNCException {
        this.vi = vi;
        insertChild(vi, childrenNames());
        return vi;
    }

    /**
     * Adds container entry "vi".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Vi addVi() throws JNCException {
        Vi vi = new Vi();
        this.vi = vi;
        insertChild(vi, childrenNames());
        return vi;
    }

    /**
     * Deletes container entry "vi".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteVi() throws JNCException {
        this.vi = null;
        String path = "vi";
        return delete(path);
    }

    /* Access methods for container child: "vo". */

    /**
     * Adds container entry "vo", using an existing object.
     * @param vo The object to add.
     * @return The added child.
     */
    public Vo addVo(Vo vo) throws JNCException {
        this.vo = vo;
        insertChild(vo, childrenNames());
        return vo;
    }

    /**
     * Adds container entry "vo".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Vo addVo() throws JNCException {
        Vo vo = new Vo();
        this.vo = vo;
        insertChild(vo, childrenNames());
        return vo;
    }

    /**
     * Deletes container entry "vo".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteVo() throws JNCException {
        this.vo = null;
        String path = "vo";
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
        if (child instanceof Bk) bk = (Bk)child;
        else if (child instanceof Be) be = (Be)child;
        else if (child instanceof Vi) vi = (Vi)child;
        else if (child instanceof Vo) vo = (Vo)child;
    }

}
