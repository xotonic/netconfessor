
package com.netconfessor.gen.apConfig.lastWlanScanResults;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.lastWlanScanResults.cell.Bssid;
import com.netconfessor.gen.apConfig.lastWlanScanResults.cell.Channel;
import com.netconfessor.gen.apConfig.lastWlanScanResults.cell.Name;
import com.netconfessor.gen.apConfig.lastWlanScanResults.cell.Security;
import com.netconfessor.gen.apConfig.lastWlanScanResults.cell.SignalLevel;
import com.netconfessor.gen.apConfig.lastWlanScanResults.cell.Ssid;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.NodeSet;
import io.netconfessor.YangElement;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Cell extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "name".
     */
    public Name name = null;

    /**
     * Field for child leaf "bssid".
     */
    public Bssid bssid = null;

    /**
     * Field for child leaf "ssid".
     */
    public Ssid ssid = null;

    /**
     * Field for child leaf "channel".
     */
    public Channel channel = null;

    /**
     * Field for child leaf "signal-level".
     */
    public SignalLevel signalLevel = null;

    /**
     * Field for child leaf "security".
     */
    public Security security = null;

    /**
     * Constructor for an empty Cell object.
     */
    public Cell() {
        super(ApConfigSchema.NAMESPACE, "cell");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Cell clone() {
        return (Cell)cloneContent(new Cell());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Cell cloneShallow() {
        return (Cell)cloneShallowContent(new Cell());
    }

    public Cell cloneWithoutChildren() {
        return new Cell();
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
            "name",
            "bssid",
            "ssid",
            "channel",
            "signal-level",
            "security",
        };
    }

    /* Access methods for leaf child: "name". */

    /**
     * Adds leaf entry "name", using an existing object.
     * @param name The object to add.
     * @return The added child.
     */
    public Name addName(Name name) throws JNCException {
        this.name = name;
        insertChild(name, childrenNames());
        return name;
    }

    /**
     * Adds leaf entry "name".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Name addName() throws JNCException {
        Name name = new Name();
        this.name = name;
        insertChild(name, childrenNames());
        return name;
    }

    /**
     * Deletes leaf entry "name".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteName() throws JNCException {
        this.name = null;
        String path = "name";
        return delete(path);
    }

    /* Access methods for optional leaf child: "bssid". */

    /**
     * Adds leaf entry "bssid", using an existing object.
     * @param bssid The object to add.
     * @return The added child.
     */
    public Bssid addBssid(Bssid bssid) throws JNCException {
        this.bssid = bssid;
        insertChild(bssid, childrenNames());
        return bssid;
    }

    /**
     * Adds leaf entry "bssid".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Bssid addBssid() throws JNCException {
        Bssid bssid = new Bssid();
        this.bssid = bssid;
        insertChild(bssid, childrenNames());
        return bssid;
    }

    /**
     * Deletes leaf entry "bssid".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteBssid() throws JNCException {
        this.bssid = null;
        String path = "bssid";
        return delete(path);
    }

    /* Access methods for optional leaf child: "ssid". */

    /**
     * Adds leaf entry "ssid", using an existing object.
     * @param ssid The object to add.
     * @return The added child.
     */
    public Ssid addSsid(Ssid ssid) throws JNCException {
        this.ssid = ssid;
        insertChild(ssid, childrenNames());
        return ssid;
    }

    /**
     * Adds leaf entry "ssid".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Ssid addSsid() throws JNCException {
        Ssid ssid = new Ssid();
        this.ssid = ssid;
        insertChild(ssid, childrenNames());
        return ssid;
    }

    /**
     * Deletes leaf entry "ssid".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteSsid() throws JNCException {
        this.ssid = null;
        String path = "ssid";
        return delete(path);
    }

    /* Access methods for optional leaf child: "channel". */

    /**
     * Adds leaf entry "channel", using an existing object.
     * @param channel The object to add.
     * @return The added child.
     */
    public Channel addChannel(Channel channel) throws JNCException {
        this.channel = channel;
        insertChild(channel, childrenNames());
        return channel;
    }

    /**
     * Adds leaf entry "channel".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Channel addChannel() throws JNCException {
        Channel channel = new Channel();
        this.channel = channel;
        insertChild(channel, childrenNames());
        return channel;
    }

    /**
     * Deletes leaf entry "channel".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteChannel() throws JNCException {
        this.channel = null;
        String path = "channel";
        return delete(path);
    }

    /* Access methods for optional leaf child: "signal-level". */

    /**
     * Adds leaf entry "signalLevel", using an existing object.
     * @param signalLevel The object to add.
     * @return The added child.
     */
    public SignalLevel addSignalLevel(SignalLevel signalLevel)
            throws JNCException {
        this.signalLevel = signalLevel;
        insertChild(signalLevel, childrenNames());
        return signalLevel;
    }

    /**
     * Adds leaf entry "signalLevel".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public SignalLevel addSignalLevel() throws JNCException {
        SignalLevel signalLevel = new SignalLevel();
        this.signalLevel = signalLevel;
        insertChild(signalLevel, childrenNames());
        return signalLevel;
    }

    /**
     * Deletes leaf entry "signalLevel".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteSignalLevel() throws JNCException {
        this.signalLevel = null;
        String path = "signal-level";
        return delete(path);
    }

    /* Access methods for optional leaf child: "security". */

    /**
     * Adds leaf entry "security", using an existing object.
     * @param security The object to add.
     * @return The added child.
     */
    public Security addSecurity(Security security) throws JNCException {
        this.security = security;
        insertChild(security, childrenNames());
        return security;
    }

    /**
     * Adds leaf entry "security".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Security addSecurity() throws JNCException {
        Security security = new Security();
        this.security = security;
        insertChild(security, childrenNames());
        return security;
    }

    /**
     * Deletes leaf entry "security".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteSecurity() throws JNCException {
        this.security = null;
        String path = "security";
        return delete(path);
    }

    /**
     * Support method for addChild.
     * Adds a child to this object.
     * 
     * @param child The child to add
     */
    public void addChild(Element child) {
        super.addChild(child);
        if (child instanceof Name) name = (Name)child;
        else if (child instanceof Bssid) bssid = (Bssid)child;
        else if (child instanceof Ssid) ssid = (Ssid)child;
        else if (child instanceof Channel) channel = (Channel)child;
        else if (child instanceof SignalLevel) signalLevel = (SignalLevel)child;
        else if (child instanceof Security) security = (Security)child;
    }

}
