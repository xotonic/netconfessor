
package com.netconfessor.gen.apConfig.config.interface_.wlan;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.config.interface_.wlan.sta.ClientShaperMode;
import com.netconfessor.gen.apConfig.config.interface_.wlan.sta.KeyWep;
import com.netconfessor.gen.apConfig.config.interface_.wlan.sta.KeyWpa;
import com.netconfessor.gen.apConfig.config.interface_.wlan.sta.Radius;
import com.netconfessor.gen.apConfig.config.interface_.wlan.sta.SecurityMode;
import com.netconfessor.gen.apConfig.config.interface_.wlan.sta.ShaperLimit;
import com.netconfessor.gen.apConfig.config.interface_.wlan.sta.Ssid;
import com.netconfessor.gen.apConfig.config.interface_.wlan.sta.VlanSupport;

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
public class Sta extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "security-mode".
     */
    public SecurityMode securityMode = null;

    /**
     * Field for child leaf "client-shaper-mode".
     */
    public ClientShaperMode clientShaperMode = null;

    /**
     * Field for child leaf "shaper-limit".
     */
    public ShaperLimit shaperLimit = null;

    /**
     * Field for child leaf "key-wep".
     */
    public KeyWep keyWep = null;

    /**
     * Field for child leaf "key-wpa".
     */
    public KeyWpa keyWpa = null;

    /**
     * Field for child leaf "ssid".
     */
    public Ssid ssid = null;

    /**
     * Field for child leaf "vlan-support".
     */
    public VlanSupport vlanSupport = null;

    /**
     * Field for child container "radius".
     */
    public Radius radius = null;

    /**
     * Constructor for an empty Sta object.
     */
    public Sta() {
        super(ApConfigSchema.NAMESPACE, "sta");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Sta clone() {
        return (Sta)cloneContent(new Sta());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Sta cloneShallow() {
        return (Sta)cloneShallowContent(new Sta());
    }

    public Sta cloneWithoutChildren() {
        return new Sta();
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
            "security-mode",
            "client-shaper-mode",
            "shaper-limit",
            "key-wep",
            "key-wpa",
            "ssid",
            "vlan-support",
            "radius",
        };
    }

    /* Access methods for optional leaf child: "security-mode". */

    /**
     * Adds leaf entry "securityMode", using an existing object.
     * @param securityMode The object to add.
     * @return The added child.
     */
    public SecurityMode addSecurityMode(SecurityMode securityMode)
            throws JNCException {
        this.securityMode = securityMode;
        insertChild(securityMode, childrenNames());
        return securityMode;
    }

    /**
     * Adds leaf entry "securityMode".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public SecurityMode addSecurityMode() throws JNCException {
        SecurityMode securityMode = new SecurityMode();
        this.securityMode = securityMode;
        insertChild(securityMode, childrenNames());
        return securityMode;
    }

    /**
     * Deletes leaf entry "securityMode".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteSecurityMode() throws JNCException {
        this.securityMode = null;
        String path = "security-mode";
        return delete(path);
    }

    /* Access methods for optional leaf child: "client-shaper-mode". */

    /**
     * Adds leaf entry "clientShaperMode", using an existing object.
     * @param clientShaperMode The object to add.
     * @return The added child.
     */
    public ClientShaperMode addClientShaperMode(ClientShaperMode clientShaperMode)
            throws JNCException {
        this.clientShaperMode = clientShaperMode;
        insertChild(clientShaperMode, childrenNames());
        return clientShaperMode;
    }

    /**
     * Adds leaf entry "clientShaperMode".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public ClientShaperMode addClientShaperMode() throws JNCException {
        ClientShaperMode clientShaperMode = new ClientShaperMode();
        this.clientShaperMode = clientShaperMode;
        insertChild(clientShaperMode, childrenNames());
        return clientShaperMode;
    }

    /**
     * Deletes leaf entry "clientShaperMode".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteClientShaperMode() throws JNCException {
        this.clientShaperMode = null;
        String path = "client-shaper-mode";
        return delete(path);
    }

    /* Access methods for optional leaf child: "shaper-limit". */

    /**
     * Adds leaf entry "shaperLimit", using an existing object.
     * @param shaperLimit The object to add.
     * @return The added child.
     */
    public ShaperLimit addShaperLimit(ShaperLimit shaperLimit)
            throws JNCException {
        this.shaperLimit = shaperLimit;
        insertChild(shaperLimit, childrenNames());
        return shaperLimit;
    }

    /**
     * Adds leaf entry "shaperLimit".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public ShaperLimit addShaperLimit() throws JNCException {
        ShaperLimit shaperLimit = new ShaperLimit();
        this.shaperLimit = shaperLimit;
        insertChild(shaperLimit, childrenNames());
        return shaperLimit;
    }

    /**
     * Deletes leaf entry "shaperLimit".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteShaperLimit() throws JNCException {
        this.shaperLimit = null;
        String path = "shaper-limit";
        return delete(path);
    }

    /* Access methods for optional leaf child: "key-wep". */

    /**
     * Adds leaf entry "keyWep", using an existing object.
     * @param keyWep The object to add.
     * @return The added child.
     */
    public KeyWep addKeyWep(KeyWep keyWep) throws JNCException {
        this.keyWep = keyWep;
        insertChild(keyWep, childrenNames());
        return keyWep;
    }

    /**
     * Adds leaf entry "keyWep".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public KeyWep addKeyWep() throws JNCException {
        KeyWep keyWep = new KeyWep();
        this.keyWep = keyWep;
        insertChild(keyWep, childrenNames());
        return keyWep;
    }

    /**
     * Deletes leaf entry "keyWep".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteKeyWep() throws JNCException {
        this.keyWep = null;
        String path = "key-wep";
        return delete(path);
    }

    /* Access methods for optional leaf child: "key-wpa". */

    /**
     * Adds leaf entry "keyWpa", using an existing object.
     * @param keyWpa The object to add.
     * @return The added child.
     */
    public KeyWpa addKeyWpa(KeyWpa keyWpa) throws JNCException {
        this.keyWpa = keyWpa;
        insertChild(keyWpa, childrenNames());
        return keyWpa;
    }

    /**
     * Adds leaf entry "keyWpa".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public KeyWpa addKeyWpa() throws JNCException {
        KeyWpa keyWpa = new KeyWpa();
        this.keyWpa = keyWpa;
        insertChild(keyWpa, childrenNames());
        return keyWpa;
    }

    /**
     * Deletes leaf entry "keyWpa".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteKeyWpa() throws JNCException {
        this.keyWpa = null;
        String path = "key-wpa";
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

    /* Access methods for optional leaf child: "vlan-support". */

    /**
     * Adds leaf entry "vlanSupport", using an existing object.
     * @param vlanSupport The object to add.
     * @return The added child.
     */
    public VlanSupport addVlanSupport(VlanSupport vlanSupport)
            throws JNCException {
        this.vlanSupport = vlanSupport;
        insertChild(vlanSupport, childrenNames());
        return vlanSupport;
    }

    /**
     * Adds leaf entry "vlanSupport".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public VlanSupport addVlanSupport() throws JNCException {
        VlanSupport vlanSupport = new VlanSupport();
        this.vlanSupport = vlanSupport;
        insertChild(vlanSupport, childrenNames());
        return vlanSupport;
    }

    /**
     * Deletes leaf entry "vlanSupport".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteVlanSupport() throws JNCException {
        this.vlanSupport = null;
        String path = "vlan-support";
        return delete(path);
    }

    /* Access methods for container child: "radius". */

    /**
     * Adds container entry "radius", using an existing object.
     * @param radius The object to add.
     * @return The added child.
     */
    public Radius addRadius(Radius radius) throws JNCException {
        this.radius = radius;
        insertChild(radius, childrenNames());
        return radius;
    }

    /**
     * Adds container entry "radius".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Radius addRadius() throws JNCException {
        Radius radius = new Radius();
        this.radius = radius;
        insertChild(radius, childrenNames());
        return radius;
    }

    /**
     * Deletes container entry "radius".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteRadius() throws JNCException {
        this.radius = null;
        String path = "radius";
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
        if (child instanceof SecurityMode) securityMode = (SecurityMode)child;
        else if (child instanceof ClientShaperMode) clientShaperMode = (ClientShaperMode)child;
        else if (child instanceof ShaperLimit) shaperLimit = (ShaperLimit)child;
        else if (child instanceof KeyWep) keyWep = (KeyWep)child;
        else if (child instanceof KeyWpa) keyWpa = (KeyWpa)child;
        else if (child instanceof Ssid) ssid = (Ssid)child;
        else if (child instanceof VlanSupport) vlanSupport = (VlanSupport)child;
        else if (child instanceof Radius) radius = (Radius)child;
    }

}
