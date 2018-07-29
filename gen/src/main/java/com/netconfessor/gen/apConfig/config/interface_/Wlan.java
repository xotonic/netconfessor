
package com.netconfessor.gen.apConfig.config.interface_;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.config.interface_.wlan.Ap;
import com.netconfessor.gen.apConfig.config.interface_.wlan.Mode;
import com.netconfessor.gen.apConfig.config.interface_.wlan.Radio;
import com.netconfessor.gen.apConfig.config.interface_.wlan.RssiIndication;
import com.netconfessor.gen.apConfig.config.interface_.wlan.Sta;

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
public class Wlan extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "mode".
     */
    public Mode mode = null;

    /**
     * Field for child leaf "rssi-indication".
     */
    public RssiIndication rssiIndication = null;

    /**
     * Field for child container "radio".
     */
    public Radio radio = null;

    /**
     * Field for child container "sta".
     */
    public Sta sta = null;

    /**
     * Field for child container "ap".
     */
    public Ap ap = null;

    /**
     * Constructor for an empty Wlan object.
     */
    public Wlan() {
        super(ApConfigSchema.NAMESPACE, "wlan");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Wlan clone() {
        return (Wlan)cloneContent(new Wlan());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Wlan cloneShallow() {
        return (Wlan)cloneShallowContent(new Wlan());
    }

    public Wlan cloneWithoutChildren() {
        return new Wlan();
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
            "rssi-indication",
            "radio",
            "sta",
            "ap",
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

    /* Access methods for optional leaf child: "rssi-indication". */

    /**
     * Adds leaf entry "rssiIndication", using an existing object.
     * @param rssiIndication The object to add.
     * @return The added child.
     */
    public RssiIndication addRssiIndication(RssiIndication rssiIndication)
            throws JNCException {
        this.rssiIndication = rssiIndication;
        insertChild(rssiIndication, childrenNames());
        return rssiIndication;
    }

    /**
     * Adds leaf entry "rssiIndication".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public RssiIndication addRssiIndication() throws JNCException {
        RssiIndication rssiIndication = new RssiIndication();
        this.rssiIndication = rssiIndication;
        insertChild(rssiIndication, childrenNames());
        return rssiIndication;
    }

    /**
     * Deletes leaf entry "rssiIndication".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteRssiIndication() throws JNCException {
        this.rssiIndication = null;
        String path = "rssi-indication";
        return delete(path);
    }

    /* Access methods for container child: "radio". */

    /**
     * Adds container entry "radio", using an existing object.
     * @param radio The object to add.
     * @return The added child.
     */
    public Radio addRadio(Radio radio) throws JNCException {
        this.radio = radio;
        insertChild(radio, childrenNames());
        return radio;
    }

    /**
     * Adds container entry "radio".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Radio addRadio() throws JNCException {
        Radio radio = new Radio();
        this.radio = radio;
        insertChild(radio, childrenNames());
        return radio;
    }

    /**
     * Deletes container entry "radio".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteRadio() throws JNCException {
        this.radio = null;
        String path = "radio";
        return delete(path);
    }

    /* Access methods for container child: "sta". */

    /**
     * Adds container entry "sta", using an existing object.
     * @param sta The object to add.
     * @return The added child.
     */
    public Sta addSta(Sta sta) throws JNCException {
        this.sta = sta;
        insertChild(sta, childrenNames());
        return sta;
    }

    /**
     * Adds container entry "sta".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Sta addSta() throws JNCException {
        Sta sta = new Sta();
        this.sta = sta;
        insertChild(sta, childrenNames());
        return sta;
    }

    /**
     * Deletes container entry "sta".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteSta() throws JNCException {
        this.sta = null;
        String path = "sta";
        return delete(path);
    }

    /* Access methods for container child: "ap". */

    /**
     * Adds container entry "ap", using an existing object.
     * @param ap The object to add.
     * @return The added child.
     */
    public Ap addAp(Ap ap) throws JNCException {
        this.ap = ap;
        insertChild(ap, childrenNames());
        return ap;
    }

    /**
     * Adds container entry "ap".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Ap addAp() throws JNCException {
        Ap ap = new Ap();
        this.ap = ap;
        insertChild(ap, childrenNames());
        return ap;
    }

    /**
     * Deletes container entry "ap".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteAp() throws JNCException {
        this.ap = null;
        String path = "ap";
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
        else if (child instanceof RssiIndication) rssiIndication = (RssiIndication)child;
        else if (child instanceof Radio) radio = (Radio)child;
        else if (child instanceof Sta) sta = (Sta)child;
        else if (child instanceof Ap) ap = (Ap)child;
    }

}
