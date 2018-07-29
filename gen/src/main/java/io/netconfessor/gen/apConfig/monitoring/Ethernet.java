
package io.netconfessor.gen.apConfig.monitoring;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.NodeSet;
import io.netconfessor.YangContainer;
import io.netconfessor.YangElement;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.monitoring.ethernet.Duplex;
import io.netconfessor.gen.apConfig.monitoring.ethernet.Link;
import io.netconfessor.gen.apConfig.monitoring.ethernet.RxBytes;
import io.netconfessor.gen.apConfig.monitoring.ethernet.Speed;
import io.netconfessor.gen.apConfig.monitoring.ethernet.TxBytes;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Ethernet extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "link".
     */
    public Link link = null;

    /**
     * Field for child leaf "speed".
     */
    public Speed speed = null;

    /**
     * Field for child leaf "duplex".
     */
    public Duplex duplex = null;

    /**
     * Field for child leaf "tx-bytes".
     */
    public TxBytes txBytes = null;

    /**
     * Field for child leaf "rx-bytes".
     */
    public RxBytes rxBytes = null;

    /**
     * Constructor for an empty Ethernet object.
     */
    public Ethernet() {
        super(ApConfigSchema.NAMESPACE, "ethernet");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Ethernet clone() {
        return (Ethernet)cloneContent(new Ethernet());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Ethernet cloneShallow() {
        return (Ethernet)cloneShallowContent(new Ethernet());
    }

    public Ethernet cloneWithoutChildren() {
        return new Ethernet();
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
            "link",
            "speed",
            "duplex",
            "tx-bytes",
            "rx-bytes",
        };
    }

    /* Access methods for optional leaf child: "link". */

    /**
     * Adds leaf entry "link", using an existing object.
     * @param link The object to add.
     * @return The added child.
     */
    public Link addLink(Link link) throws JNCException {
        this.link = link;
        insertChild(link, childrenNames());
        return link;
    }

    /**
     * Adds leaf entry "link".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Link addLink() throws JNCException {
        Link link = new Link();
        this.link = link;
        insertChild(link, childrenNames());
        return link;
    }

    /**
     * Deletes leaf entry "link".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteLink() throws JNCException {
        this.link = null;
        String path = "link";
        return delete(path);
    }

    /* Access methods for optional leaf child: "speed". */

    /**
     * Adds leaf entry "speed", using an existing object.
     * @param speed The object to add.
     * @return The added child.
     */
    public Speed addSpeed(Speed speed) throws JNCException {
        this.speed = speed;
        insertChild(speed, childrenNames());
        return speed;
    }

    /**
     * Adds leaf entry "speed".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Speed addSpeed() throws JNCException {
        Speed speed = new Speed();
        this.speed = speed;
        insertChild(speed, childrenNames());
        return speed;
    }

    /**
     * Deletes leaf entry "speed".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteSpeed() throws JNCException {
        this.speed = null;
        String path = "speed";
        return delete(path);
    }

    /* Access methods for optional leaf child: "duplex". */

    /**
     * Adds leaf entry "duplex", using an existing object.
     * @param duplex The object to add.
     * @return The added child.
     */
    public Duplex addDuplex(Duplex duplex) throws JNCException {
        this.duplex = duplex;
        insertChild(duplex, childrenNames());
        return duplex;
    }

    /**
     * Adds leaf entry "duplex".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Duplex addDuplex() throws JNCException {
        Duplex duplex = new Duplex();
        this.duplex = duplex;
        insertChild(duplex, childrenNames());
        return duplex;
    }

    /**
     * Deletes leaf entry "duplex".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteDuplex() throws JNCException {
        this.duplex = null;
        String path = "duplex";
        return delete(path);
    }

    /* Access methods for optional leaf child: "tx-bytes". */

    /**
     * Adds leaf entry "txBytes", using an existing object.
     * @param txBytes The object to add.
     * @return The added child.
     */
    public TxBytes addTxBytes(TxBytes txBytes) throws JNCException {
        this.txBytes = txBytes;
        insertChild(txBytes, childrenNames());
        return txBytes;
    }

    /**
     * Adds leaf entry "txBytes".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public TxBytes addTxBytes() throws JNCException {
        TxBytes txBytes = new TxBytes();
        this.txBytes = txBytes;
        insertChild(txBytes, childrenNames());
        return txBytes;
    }

    /**
     * Deletes leaf entry "txBytes".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteTxBytes() throws JNCException {
        this.txBytes = null;
        String path = "tx-bytes";
        return delete(path);
    }

    /* Access methods for optional leaf child: "rx-bytes". */

    /**
     * Adds leaf entry "rxBytes", using an existing object.
     * @param rxBytes The object to add.
     * @return The added child.
     */
    public RxBytes addRxBytes(RxBytes rxBytes) throws JNCException {
        this.rxBytes = rxBytes;
        insertChild(rxBytes, childrenNames());
        return rxBytes;
    }

    /**
     * Adds leaf entry "rxBytes".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public RxBytes addRxBytes() throws JNCException {
        RxBytes rxBytes = new RxBytes();
        this.rxBytes = rxBytes;
        insertChild(rxBytes, childrenNames());
        return rxBytes;
    }

    /**
     * Deletes leaf entry "rxBytes".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteRxBytes() throws JNCException {
        this.rxBytes = null;
        String path = "rx-bytes";
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
        if (child instanceof Link) link = (Link)child;
        else if (child instanceof Speed) speed = (Speed)child;
        else if (child instanceof Duplex) duplex = (Duplex)child;
        else if (child instanceof TxBytes) txBytes = (TxBytes)child;
        else if (child instanceof RxBytes) rxBytes = (RxBytes)child;
    }

}
