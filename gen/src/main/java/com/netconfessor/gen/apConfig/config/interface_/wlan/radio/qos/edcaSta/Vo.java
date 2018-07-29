
package com.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.edcaSta;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.edcaSta.vo.Acm;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.edcaSta.vo.Aifs;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.edcaSta.vo.Cwmax;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.edcaSta.vo.Cwmin;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.edcaSta.vo.Txop;

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
public class Vo extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "acm".
     */
    public Acm acm = null;

    /**
     * Field for child leaf "aifs".
     */
    public Aifs aifs = null;

    /**
     * Field for child leaf "cwmin".
     */
    public Cwmin cwmin = null;

    /**
     * Field for child leaf "cwmax".
     */
    public Cwmax cwmax = null;

    /**
     * Field for child leaf "txop".
     */
    public Txop txop = null;

    /**
     * Constructor for an empty Vo object.
     */
    public Vo() {
        super(ApConfigSchema.NAMESPACE, "vo");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Vo clone() {
        return (Vo)cloneContent(new Vo());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Vo cloneShallow() {
        return (Vo)cloneShallowContent(new Vo());
    }

    public Vo cloneWithoutChildren() {
        return new Vo();
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
            "acm",
            "aifs",
            "cwmin",
            "cwmax",
            "txop",
        };
    }

    /* Access methods for optional leaf child: "acm". */

    /**
     * Adds leaf entry "acm", using an existing object.
     * @param acm The object to add.
     * @return The added child.
     */
    public Acm addAcm(Acm acm) throws JNCException {
        this.acm = acm;
        insertChild(acm, childrenNames());
        return acm;
    }

    /**
     * Adds leaf entry "acm".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Acm addAcm() throws JNCException {
        Acm acm = new Acm();
        this.acm = acm;
        insertChild(acm, childrenNames());
        return acm;
    }

    /**
     * Deletes leaf entry "acm".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteAcm() throws JNCException {
        this.acm = null;
        String path = "acm";
        return delete(path);
    }

    /* Access methods for optional leaf child: "aifs". */

    /**
     * Adds leaf entry "aifs", using an existing object.
     * @param aifs The object to add.
     * @return The added child.
     */
    public Aifs addAifs(Aifs aifs) throws JNCException {
        this.aifs = aifs;
        insertChild(aifs, childrenNames());
        return aifs;
    }

    /**
     * Adds leaf entry "aifs".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Aifs addAifs() throws JNCException {
        Aifs aifs = new Aifs();
        this.aifs = aifs;
        insertChild(aifs, childrenNames());
        return aifs;
    }

    /**
     * Deletes leaf entry "aifs".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteAifs() throws JNCException {
        this.aifs = null;
        String path = "aifs";
        return delete(path);
    }

    /* Access methods for optional leaf child: "cwmin". */

    /**
     * Adds leaf entry "cwmin", using an existing object.
     * @param cwmin The object to add.
     * @return The added child.
     */
    public Cwmin addCwmin(Cwmin cwmin) throws JNCException {
        this.cwmin = cwmin;
        insertChild(cwmin, childrenNames());
        return cwmin;
    }

    /**
     * Adds leaf entry "cwmin".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Cwmin addCwmin() throws JNCException {
        Cwmin cwmin = new Cwmin();
        this.cwmin = cwmin;
        insertChild(cwmin, childrenNames());
        return cwmin;
    }

    /**
     * Deletes leaf entry "cwmin".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteCwmin() throws JNCException {
        this.cwmin = null;
        String path = "cwmin";
        return delete(path);
    }

    /* Access methods for optional leaf child: "cwmax". */

    /**
     * Adds leaf entry "cwmax", using an existing object.
     * @param cwmax The object to add.
     * @return The added child.
     */
    public Cwmax addCwmax(Cwmax cwmax) throws JNCException {
        this.cwmax = cwmax;
        insertChild(cwmax, childrenNames());
        return cwmax;
    }

    /**
     * Adds leaf entry "cwmax".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Cwmax addCwmax() throws JNCException {
        Cwmax cwmax = new Cwmax();
        this.cwmax = cwmax;
        insertChild(cwmax, childrenNames());
        return cwmax;
    }

    /**
     * Deletes leaf entry "cwmax".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteCwmax() throws JNCException {
        this.cwmax = null;
        String path = "cwmax";
        return delete(path);
    }

    /* Access methods for optional leaf child: "txop". */

    /**
     * Adds leaf entry "txop", using an existing object.
     * @param txop The object to add.
     * @return The added child.
     */
    public Txop addTxop(Txop txop) throws JNCException {
        this.txop = txop;
        insertChild(txop, childrenNames());
        return txop;
    }

    /**
     * Adds leaf entry "txop".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Txop addTxop() throws JNCException {
        Txop txop = new Txop();
        this.txop = txop;
        insertChild(txop, childrenNames());
        return txop;
    }

    /**
     * Deletes leaf entry "txop".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteTxop() throws JNCException {
        this.txop = null;
        String path = "txop";
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
        if (child instanceof Acm) acm = (Acm)child;
        else if (child instanceof Aifs) aifs = (Aifs)child;
        else if (child instanceof Cwmin) cwmin = (Cwmin)child;
        else if (child instanceof Cwmax) cwmax = (Cwmax)child;
        else if (child instanceof Txop) txop = (Txop)child;
    }

}
