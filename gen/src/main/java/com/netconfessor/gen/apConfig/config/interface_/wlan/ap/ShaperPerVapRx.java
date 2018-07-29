
package com.netconfessor.gen.apConfig.config.interface_.wlan.ap;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.config.interface_.wlan.ap.shaperPerVapRx.JValue;
import com.netconfessor.gen.apConfig.config.interface_.wlan.ap.shaperPerVapRx.Mode;

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
public class ShaperPerVapRx extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "mode".
     */
    public Mode mode = null;

    /**
     * Field for child leaf "value".
     */
    public JValue value_ = null;

    /**
     * Constructor for an empty ShaperPerVapRx object.
     */
    public ShaperPerVapRx() {
        super(ApConfigSchema.NAMESPACE, "shaper-per-vap-rx");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public ShaperPerVapRx clone() {
        return (ShaperPerVapRx)cloneContent(new ShaperPerVapRx());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public ShaperPerVapRx cloneShallow() {
        return (ShaperPerVapRx)cloneShallowContent(new ShaperPerVapRx());
    }

    public ShaperPerVapRx cloneWithoutChildren() {
        return new ShaperPerVapRx();
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
            "value",
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

    /* Access methods for optional leaf child: "value". */

    /**
     * Adds leaf entry "value_", using an existing object.
     * @param value_ The object to add.
     * @return The added child.
     */
    public JValue addJValue(JValue value_) throws JNCException {
        this.value_ = value_;
        insertChild(value_, childrenNames());
        return value_;
    }

    /**
     * Adds leaf entry "value_".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public JValue addJValue() throws JNCException {
        JValue value_ = new JValue();
        this.value_ = value_;
        insertChild(value_, childrenNames());
        return value_;
    }

    /**
     * Deletes leaf entry "value_".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteJValue() throws JNCException {
        this.value_ = null;
        String path = "value";
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
        else if (child instanceof JValue) value_ = (JValue)child;
    }

}
