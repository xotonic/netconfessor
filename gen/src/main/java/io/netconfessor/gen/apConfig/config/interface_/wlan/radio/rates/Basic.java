
package io.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.NodeSet;
import io.netconfessor.YangContainer;
import io.netconfessor.YangElement;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.basic.Rate12;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.basic.Rate18;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.basic.Rate24;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.basic.Rate36;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.basic.Rate48;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.basic.Rate54;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.basic.Rate6;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.basic.Rate9;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Basic extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "rate-6".
     */
    public Rate6 rate6 = null;

    /**
     * Field for child leaf "rate-9".
     */
    public Rate9 rate9 = null;

    /**
     * Field for child leaf "rate-12".
     */
    public Rate12 rate12 = null;

    /**
     * Field for child leaf "rate-18".
     */
    public Rate18 rate18 = null;

    /**
     * Field for child leaf "rate-24".
     */
    public Rate24 rate24 = null;

    /**
     * Field for child leaf "rate-36".
     */
    public Rate36 rate36 = null;

    /**
     * Field for child leaf "rate-48".
     */
    public Rate48 rate48 = null;

    /**
     * Field for child leaf "rate-54".
     */
    public Rate54 rate54 = null;

    /**
     * Constructor for an empty Basic object.
     */
    public Basic() {
        super(ApConfigSchema.NAMESPACE, "basic");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Basic clone() {
        return (Basic)cloneContent(new Basic());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Basic cloneShallow() {
        return (Basic)cloneShallowContent(new Basic());
    }

    public Basic cloneWithoutChildren() {
        return new Basic();
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
            "rate-6",
            "rate-9",
            "rate-12",
            "rate-18",
            "rate-24",
            "rate-36",
            "rate-48",
            "rate-54",
        };
    }

    /* Access methods for optional leaf child: "rate-6". */

    /**
     * Adds leaf entry "rate6", using an existing object.
     * @param rate6 The object to add.
     * @return The added child.
     */
    public Rate6 addRate6(Rate6 rate6) throws JNCException {
        this.rate6 = rate6;
        insertChild(rate6, childrenNames());
        return rate6;
    }

    /**
     * Adds leaf entry "rate6".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Rate6 addRate6() throws JNCException {
        Rate6 rate6 = new Rate6();
        this.rate6 = rate6;
        insertChild(rate6, childrenNames());
        return rate6;
    }

    /**
     * Deletes leaf entry "rate6".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteRate6() throws JNCException {
        this.rate6 = null;
        String path = "rate-6";
        return delete(path);
    }

    /* Access methods for optional leaf child: "rate-9". */

    /**
     * Adds leaf entry "rate9", using an existing object.
     * @param rate9 The object to add.
     * @return The added child.
     */
    public Rate9 addRate9(Rate9 rate9) throws JNCException {
        this.rate9 = rate9;
        insertChild(rate9, childrenNames());
        return rate9;
    }

    /**
     * Adds leaf entry "rate9".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Rate9 addRate9() throws JNCException {
        Rate9 rate9 = new Rate9();
        this.rate9 = rate9;
        insertChild(rate9, childrenNames());
        return rate9;
    }

    /**
     * Deletes leaf entry "rate9".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteRate9() throws JNCException {
        this.rate9 = null;
        String path = "rate-9";
        return delete(path);
    }

    /* Access methods for optional leaf child: "rate-12". */

    /**
     * Adds leaf entry "rate12", using an existing object.
     * @param rate12 The object to add.
     * @return The added child.
     */
    public Rate12 addRate12(Rate12 rate12) throws JNCException {
        this.rate12 = rate12;
        insertChild(rate12, childrenNames());
        return rate12;
    }

    /**
     * Adds leaf entry "rate12".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Rate12 addRate12() throws JNCException {
        Rate12 rate12 = new Rate12();
        this.rate12 = rate12;
        insertChild(rate12, childrenNames());
        return rate12;
    }

    /**
     * Deletes leaf entry "rate12".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteRate12() throws JNCException {
        this.rate12 = null;
        String path = "rate-12";
        return delete(path);
    }

    /* Access methods for optional leaf child: "rate-18". */

    /**
     * Adds leaf entry "rate18", using an existing object.
     * @param rate18 The object to add.
     * @return The added child.
     */
    public Rate18 addRate18(Rate18 rate18) throws JNCException {
        this.rate18 = rate18;
        insertChild(rate18, childrenNames());
        return rate18;
    }

    /**
     * Adds leaf entry "rate18".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Rate18 addRate18() throws JNCException {
        Rate18 rate18 = new Rate18();
        this.rate18 = rate18;
        insertChild(rate18, childrenNames());
        return rate18;
    }

    /**
     * Deletes leaf entry "rate18".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteRate18() throws JNCException {
        this.rate18 = null;
        String path = "rate-18";
        return delete(path);
    }

    /* Access methods for optional leaf child: "rate-24". */

    /**
     * Adds leaf entry "rate24", using an existing object.
     * @param rate24 The object to add.
     * @return The added child.
     */
    public Rate24 addRate24(Rate24 rate24) throws JNCException {
        this.rate24 = rate24;
        insertChild(rate24, childrenNames());
        return rate24;
    }

    /**
     * Adds leaf entry "rate24".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Rate24 addRate24() throws JNCException {
        Rate24 rate24 = new Rate24();
        this.rate24 = rate24;
        insertChild(rate24, childrenNames());
        return rate24;
    }

    /**
     * Deletes leaf entry "rate24".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteRate24() throws JNCException {
        this.rate24 = null;
        String path = "rate-24";
        return delete(path);
    }

    /* Access methods for optional leaf child: "rate-36". */

    /**
     * Adds leaf entry "rate36", using an existing object.
     * @param rate36 The object to add.
     * @return The added child.
     */
    public Rate36 addRate36(Rate36 rate36) throws JNCException {
        this.rate36 = rate36;
        insertChild(rate36, childrenNames());
        return rate36;
    }

    /**
     * Adds leaf entry "rate36".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Rate36 addRate36() throws JNCException {
        Rate36 rate36 = new Rate36();
        this.rate36 = rate36;
        insertChild(rate36, childrenNames());
        return rate36;
    }

    /**
     * Deletes leaf entry "rate36".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteRate36() throws JNCException {
        this.rate36 = null;
        String path = "rate-36";
        return delete(path);
    }

    /* Access methods for optional leaf child: "rate-48". */

    /**
     * Adds leaf entry "rate48", using an existing object.
     * @param rate48 The object to add.
     * @return The added child.
     */
    public Rate48 addRate48(Rate48 rate48) throws JNCException {
        this.rate48 = rate48;
        insertChild(rate48, childrenNames());
        return rate48;
    }

    /**
     * Adds leaf entry "rate48".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Rate48 addRate48() throws JNCException {
        Rate48 rate48 = new Rate48();
        this.rate48 = rate48;
        insertChild(rate48, childrenNames());
        return rate48;
    }

    /**
     * Deletes leaf entry "rate48".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteRate48() throws JNCException {
        this.rate48 = null;
        String path = "rate-48";
        return delete(path);
    }

    /* Access methods for optional leaf child: "rate-54". */

    /**
     * Adds leaf entry "rate54", using an existing object.
     * @param rate54 The object to add.
     * @return The added child.
     */
    public Rate54 addRate54(Rate54 rate54) throws JNCException {
        this.rate54 = rate54;
        insertChild(rate54, childrenNames());
        return rate54;
    }

    /**
     * Adds leaf entry "rate54".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Rate54 addRate54() throws JNCException {
        Rate54 rate54 = new Rate54();
        this.rate54 = rate54;
        insertChild(rate54, childrenNames());
        return rate54;
    }

    /**
     * Deletes leaf entry "rate54".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteRate54() throws JNCException {
        this.rate54 = null;
        String path = "rate-54";
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
        if (child instanceof Rate6) rate6 = (Rate6)child;
        else if (child instanceof Rate9) rate9 = (Rate9)child;
        else if (child instanceof Rate12) rate12 = (Rate12)child;
        else if (child instanceof Rate18) rate18 = (Rate18)child;
        else if (child instanceof Rate24) rate24 = (Rate24)child;
        else if (child instanceof Rate36) rate36 = (Rate36)child;
        else if (child instanceof Rate48) rate48 = (Rate48)child;
        else if (child instanceof Rate54) rate54 = (Rate54)child;
    }

}
