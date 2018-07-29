
package com.netconfessor.gen.apConfig.config.interface_.wlan;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.config.interface_.wlan.ap.Acl;
import com.netconfessor.gen.apConfig.config.interface_.wlan.ap.Hidden;
import com.netconfessor.gen.apConfig.config.interface_.wlan.ap.Iapp;
import com.netconfessor.gen.apConfig.config.interface_.wlan.ap.InactivityTimeout;
import com.netconfessor.gen.apConfig.config.interface_.wlan.ap.KeyWep;
import com.netconfessor.gen.apConfig.config.interface_.wlan.ap.KeyWpa;
import com.netconfessor.gen.apConfig.config.interface_.wlan.ap.PriorityByDscp;
import com.netconfessor.gen.apConfig.config.interface_.wlan.ap.Radius;
import com.netconfessor.gen.apConfig.config.interface_.wlan.ap.SecurityMode;
import com.netconfessor.gen.apConfig.config.interface_.wlan.ap.ShaperPerStaRx;
import com.netconfessor.gen.apConfig.config.interface_.wlan.ap.ShaperPerStaTx;
import com.netconfessor.gen.apConfig.config.interface_.wlan.ap.ShaperPerVapRx;
import com.netconfessor.gen.apConfig.config.interface_.wlan.ap.ShaperPerVapTx;
import com.netconfessor.gen.apConfig.config.interface_.wlan.ap.Ssid;
import com.netconfessor.gen.apConfig.config.interface_.wlan.ap.StaLimit;
import com.netconfessor.gen.apConfig.config.interface_.wlan.ap.StationIsolation;
import com.netconfessor.gen.apConfig.config.interface_.wlan.ap.VlanId;
import com.netconfessor.gen.apConfig.config.interface_.wlan.ap.VlanPriority;
import com.netconfessor.gen.apConfig.config.interface_.wlan.ap.VlanSupport;
import com.netconfessor.gen.apConfig.config.interface_.wlan.ap.VlanTrunk;

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
public class Ap extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child container "acl".
     */
    public Acl acl = null;

    /**
     * Field for child leaf "station-isolation".
     */
    public StationIsolation stationIsolation = null;

    /**
     * Field for child leaf "inactivity-timeout".
     */
    public InactivityTimeout inactivityTimeout = null;

    /**
     * Field for child container "shaper-per-vap-tx".
     */
    public ShaperPerVapTx shaperPerVapTx = null;

    /**
     * Field for child container "shaper-per-vap-rx".
     */
    public ShaperPerVapRx shaperPerVapRx = null;

    /**
     * Field for child container "shaper-per-sta-tx".
     */
    public ShaperPerStaTx shaperPerStaTx = null;

    /**
     * Field for child container "shaper-per-sta-rx".
     */
    public ShaperPerStaRx shaperPerStaRx = null;

    /**
     * Field for child leaf "vlan-id".
     */
    public VlanId vlanId = null;

    /**
     * Field for child leaf "vlan-priority".
     */
    public VlanPriority vlanPriority = null;

    /**
     * Field for child leaf "vlan-trunk".
     */
    public VlanTrunk vlanTrunk = null;

    /**
     * Field for child leaf "vlan-support".
     */
    public VlanSupport vlanSupport = null;

    /**
     * Field for child leaf "priority-by-dscp".
     */
    public PriorityByDscp priorityByDscp = null;

    /**
     * Field for child leaf "security-mode".
     */
    public SecurityMode securityMode = null;

    /**
     * Field for child leaf "hidden".
     */
    public Hidden hidden = null;

    /**
     * Field for child leaf "sta-limit".
     */
    public StaLimit staLimit = null;

    /**
     * Field for child leaf "iapp".
     */
    public Iapp iapp = null;

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
     * Field for child container "radius".
     */
    public Radius radius = null;

    /**
     * Constructor for an empty Ap object.
     */
    public Ap() {
        super(ApConfigSchema.NAMESPACE, "ap");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Ap clone() {
        return (Ap)cloneContent(new Ap());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Ap cloneShallow() {
        return (Ap)cloneShallowContent(new Ap());
    }

    public Ap cloneWithoutChildren() {
        return new Ap();
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
            "acl",
            "station-isolation",
            "inactivity-timeout",
            "shaper-per-vap-tx",
            "shaper-per-vap-rx",
            "shaper-per-sta-tx",
            "shaper-per-sta-rx",
            "vlan-id",
            "vlan-priority",
            "vlan-trunk",
            "vlan-support",
            "priority-by-dscp",
            "security-mode",
            "hidden",
            "sta-limit",
            "iapp",
            "key-wep",
            "key-wpa",
            "ssid",
            "radius",
        };
    }

    /* Access methods for container child: "acl". */

    /**
     * Adds container entry "acl", using an existing object.
     * @param acl The object to add.
     * @return The added child.
     */
    public Acl addAcl(Acl acl) throws JNCException {
        this.acl = acl;
        insertChild(acl, childrenNames());
        return acl;
    }

    /**
     * Adds container entry "acl".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Acl addAcl() throws JNCException {
        Acl acl = new Acl();
        this.acl = acl;
        insertChild(acl, childrenNames());
        return acl;
    }

    /**
     * Deletes container entry "acl".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteAcl() throws JNCException {
        this.acl = null;
        String path = "acl";
        return delete(path);
    }

    /* Access methods for optional leaf child: "station-isolation". */

    /**
     * Adds leaf entry "stationIsolation", using an existing object.
     * @param stationIsolation The object to add.
     * @return The added child.
     */
    public StationIsolation addStationIsolation(StationIsolation stationIsolation)
            throws JNCException {
        this.stationIsolation = stationIsolation;
        insertChild(stationIsolation, childrenNames());
        return stationIsolation;
    }

    /**
     * Adds leaf entry "stationIsolation".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public StationIsolation addStationIsolation() throws JNCException {
        StationIsolation stationIsolation = new StationIsolation();
        this.stationIsolation = stationIsolation;
        insertChild(stationIsolation, childrenNames());
        return stationIsolation;
    }

    /**
     * Deletes leaf entry "stationIsolation".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteStationIsolation() throws JNCException {
        this.stationIsolation = null;
        String path = "station-isolation";
        return delete(path);
    }

    /* Access methods for optional leaf child: "inactivity-timeout". */

    /**
     * Adds leaf entry "inactivityTimeout", using an existing object.
     * @param inactivityTimeout The object to add.
     * @return The added child.
     */
    public InactivityTimeout addInactivityTimeout(InactivityTimeout inactivityTimeout)
            throws JNCException {
        this.inactivityTimeout = inactivityTimeout;
        insertChild(inactivityTimeout, childrenNames());
        return inactivityTimeout;
    }

    /**
     * Adds leaf entry "inactivityTimeout".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public InactivityTimeout addInactivityTimeout() throws JNCException {
        InactivityTimeout inactivityTimeout = new InactivityTimeout();
        this.inactivityTimeout = inactivityTimeout;
        insertChild(inactivityTimeout, childrenNames());
        return inactivityTimeout;
    }

    /**
     * Deletes leaf entry "inactivityTimeout".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteInactivityTimeout() throws JNCException {
        this.inactivityTimeout = null;
        String path = "inactivity-timeout";
        return delete(path);
    }

    /* Access methods for container child: "shaper-per-vap-tx". */

    /**
     * Adds container entry "shaperPerVapTx", using an existing object.
     * @param shaperPerVapTx The object to add.
     * @return The added child.
     */
    public ShaperPerVapTx addShaperPerVapTx(ShaperPerVapTx shaperPerVapTx)
            throws JNCException {
        this.shaperPerVapTx = shaperPerVapTx;
        insertChild(shaperPerVapTx, childrenNames());
        return shaperPerVapTx;
    }

    /**
     * Adds container entry "shaperPerVapTx".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public ShaperPerVapTx addShaperPerVapTx() throws JNCException {
        ShaperPerVapTx shaperPerVapTx = new ShaperPerVapTx();
        this.shaperPerVapTx = shaperPerVapTx;
        insertChild(shaperPerVapTx, childrenNames());
        return shaperPerVapTx;
    }

    /**
     * Deletes container entry "shaperPerVapTx".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteShaperPerVapTx() throws JNCException {
        this.shaperPerVapTx = null;
        String path = "shaper-per-vap-tx";
        return delete(path);
    }

    /* Access methods for container child: "shaper-per-vap-rx". */

    /**
     * Adds container entry "shaperPerVapRx", using an existing object.
     * @param shaperPerVapRx The object to add.
     * @return The added child.
     */
    public ShaperPerVapRx addShaperPerVapRx(ShaperPerVapRx shaperPerVapRx)
            throws JNCException {
        this.shaperPerVapRx = shaperPerVapRx;
        insertChild(shaperPerVapRx, childrenNames());
        return shaperPerVapRx;
    }

    /**
     * Adds container entry "shaperPerVapRx".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public ShaperPerVapRx addShaperPerVapRx() throws JNCException {
        ShaperPerVapRx shaperPerVapRx = new ShaperPerVapRx();
        this.shaperPerVapRx = shaperPerVapRx;
        insertChild(shaperPerVapRx, childrenNames());
        return shaperPerVapRx;
    }

    /**
     * Deletes container entry "shaperPerVapRx".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteShaperPerVapRx() throws JNCException {
        this.shaperPerVapRx = null;
        String path = "shaper-per-vap-rx";
        return delete(path);
    }

    /* Access methods for container child: "shaper-per-sta-tx". */

    /**
     * Adds container entry "shaperPerStaTx", using an existing object.
     * @param shaperPerStaTx The object to add.
     * @return The added child.
     */
    public ShaperPerStaTx addShaperPerStaTx(ShaperPerStaTx shaperPerStaTx)
            throws JNCException {
        this.shaperPerStaTx = shaperPerStaTx;
        insertChild(shaperPerStaTx, childrenNames());
        return shaperPerStaTx;
    }

    /**
     * Adds container entry "shaperPerStaTx".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public ShaperPerStaTx addShaperPerStaTx() throws JNCException {
        ShaperPerStaTx shaperPerStaTx = new ShaperPerStaTx();
        this.shaperPerStaTx = shaperPerStaTx;
        insertChild(shaperPerStaTx, childrenNames());
        return shaperPerStaTx;
    }

    /**
     * Deletes container entry "shaperPerStaTx".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteShaperPerStaTx() throws JNCException {
        this.shaperPerStaTx = null;
        String path = "shaper-per-sta-tx";
        return delete(path);
    }

    /* Access methods for container child: "shaper-per-sta-rx". */

    /**
     * Adds container entry "shaperPerStaRx", using an existing object.
     * @param shaperPerStaRx The object to add.
     * @return The added child.
     */
    public ShaperPerStaRx addShaperPerStaRx(ShaperPerStaRx shaperPerStaRx)
            throws JNCException {
        this.shaperPerStaRx = shaperPerStaRx;
        insertChild(shaperPerStaRx, childrenNames());
        return shaperPerStaRx;
    }

    /**
     * Adds container entry "shaperPerStaRx".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public ShaperPerStaRx addShaperPerStaRx() throws JNCException {
        ShaperPerStaRx shaperPerStaRx = new ShaperPerStaRx();
        this.shaperPerStaRx = shaperPerStaRx;
        insertChild(shaperPerStaRx, childrenNames());
        return shaperPerStaRx;
    }

    /**
     * Deletes container entry "shaperPerStaRx".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteShaperPerStaRx() throws JNCException {
        this.shaperPerStaRx = null;
        String path = "shaper-per-sta-rx";
        return delete(path);
    }

    /* Access methods for optional leaf child: "vlan-id". */

    /**
     * Adds leaf entry "vlanId", using an existing object.
     * @param vlanId The object to add.
     * @return The added child.
     */
    public VlanId addVlanId(VlanId vlanId) throws JNCException {
        this.vlanId = vlanId;
        insertChild(vlanId, childrenNames());
        return vlanId;
    }

    /**
     * Adds leaf entry "vlanId".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public VlanId addVlanId() throws JNCException {
        VlanId vlanId = new VlanId();
        this.vlanId = vlanId;
        insertChild(vlanId, childrenNames());
        return vlanId;
    }

    /**
     * Deletes leaf entry "vlanId".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteVlanId() throws JNCException {
        this.vlanId = null;
        String path = "vlan-id";
        return delete(path);
    }

    /* Access methods for optional leaf child: "vlan-priority". */

    /**
     * Adds leaf entry "vlanPriority", using an existing object.
     * @param vlanPriority The object to add.
     * @return The added child.
     */
    public VlanPriority addVlanPriority(VlanPriority vlanPriority)
            throws JNCException {
        this.vlanPriority = vlanPriority;
        insertChild(vlanPriority, childrenNames());
        return vlanPriority;
    }

    /**
     * Adds leaf entry "vlanPriority".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public VlanPriority addVlanPriority() throws JNCException {
        VlanPriority vlanPriority = new VlanPriority();
        this.vlanPriority = vlanPriority;
        insertChild(vlanPriority, childrenNames());
        return vlanPriority;
    }

    /**
     * Deletes leaf entry "vlanPriority".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteVlanPriority() throws JNCException {
        this.vlanPriority = null;
        String path = "vlan-priority";
        return delete(path);
    }

    /* Access methods for optional leaf child: "vlan-trunk". */

    /**
     * Adds leaf entry "vlanTrunk", using an existing object.
     * @param vlanTrunk The object to add.
     * @return The added child.
     */
    public VlanTrunk addVlanTrunk(VlanTrunk vlanTrunk) throws JNCException {
        this.vlanTrunk = vlanTrunk;
        insertChild(vlanTrunk, childrenNames());
        return vlanTrunk;
    }

    /**
     * Adds leaf entry "vlanTrunk".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public VlanTrunk addVlanTrunk() throws JNCException {
        VlanTrunk vlanTrunk = new VlanTrunk();
        this.vlanTrunk = vlanTrunk;
        insertChild(vlanTrunk, childrenNames());
        return vlanTrunk;
    }

    /**
     * Deletes leaf entry "vlanTrunk".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteVlanTrunk() throws JNCException {
        this.vlanTrunk = null;
        String path = "vlan-trunk";
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

    /* Access methods for optional leaf child: "priority-by-dscp". */

    /**
     * Adds leaf entry "priorityByDscp", using an existing object.
     * @param priorityByDscp The object to add.
     * @return The added child.
     */
    public PriorityByDscp addPriorityByDscp(PriorityByDscp priorityByDscp)
            throws JNCException {
        this.priorityByDscp = priorityByDscp;
        insertChild(priorityByDscp, childrenNames());
        return priorityByDscp;
    }

    /**
     * Adds leaf entry "priorityByDscp".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public PriorityByDscp addPriorityByDscp() throws JNCException {
        PriorityByDscp priorityByDscp = new PriorityByDscp();
        this.priorityByDscp = priorityByDscp;
        insertChild(priorityByDscp, childrenNames());
        return priorityByDscp;
    }

    /**
     * Deletes leaf entry "priorityByDscp".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deletePriorityByDscp() throws JNCException {
        this.priorityByDscp = null;
        String path = "priority-by-dscp";
        return delete(path);
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

    /* Access methods for optional leaf child: "hidden". */

    /**
     * Adds leaf entry "hidden", using an existing object.
     * @param hidden The object to add.
     * @return The added child.
     */
    public Hidden addHidden(Hidden hidden) throws JNCException {
        this.hidden = hidden;
        insertChild(hidden, childrenNames());
        return hidden;
    }

    /**
     * Adds leaf entry "hidden".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Hidden addHidden() throws JNCException {
        Hidden hidden = new Hidden();
        this.hidden = hidden;
        insertChild(hidden, childrenNames());
        return hidden;
    }

    /**
     * Deletes leaf entry "hidden".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteHidden() throws JNCException {
        this.hidden = null;
        String path = "hidden";
        return delete(path);
    }

    /* Access methods for optional leaf child: "sta-limit". */

    /**
     * Adds leaf entry "staLimit", using an existing object.
     * @param staLimit The object to add.
     * @return The added child.
     */
    public StaLimit addStaLimit(StaLimit staLimit) throws JNCException {
        this.staLimit = staLimit;
        insertChild(staLimit, childrenNames());
        return staLimit;
    }

    /**
     * Adds leaf entry "staLimit".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public StaLimit addStaLimit() throws JNCException {
        StaLimit staLimit = new StaLimit();
        this.staLimit = staLimit;
        insertChild(staLimit, childrenNames());
        return staLimit;
    }

    /**
     * Deletes leaf entry "staLimit".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteStaLimit() throws JNCException {
        this.staLimit = null;
        String path = "sta-limit";
        return delete(path);
    }

    /* Access methods for optional leaf child: "iapp". */

    /**
     * Adds leaf entry "iapp", using an existing object.
     * @param iapp The object to add.
     * @return The added child.
     */
    public Iapp addIapp(Iapp iapp) throws JNCException {
        this.iapp = iapp;
        insertChild(iapp, childrenNames());
        return iapp;
    }

    /**
     * Adds leaf entry "iapp".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Iapp addIapp() throws JNCException {
        Iapp iapp = new Iapp();
        this.iapp = iapp;
        insertChild(iapp, childrenNames());
        return iapp;
    }

    /**
     * Deletes leaf entry "iapp".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteIapp() throws JNCException {
        this.iapp = null;
        String path = "iapp";
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
        if (child instanceof Acl) acl = (Acl)child;
        else if (child instanceof StationIsolation) stationIsolation = (StationIsolation)child;
        else if (child instanceof InactivityTimeout) inactivityTimeout = (InactivityTimeout)child;
        else if (child instanceof ShaperPerVapTx) shaperPerVapTx = (ShaperPerVapTx)child;
        else if (child instanceof ShaperPerVapRx) shaperPerVapRx = (ShaperPerVapRx)child;
        else if (child instanceof ShaperPerStaTx) shaperPerStaTx = (ShaperPerStaTx)child;
        else if (child instanceof ShaperPerStaRx) shaperPerStaRx = (ShaperPerStaRx)child;
        else if (child instanceof VlanId) vlanId = (VlanId)child;
        else if (child instanceof VlanPriority) vlanPriority = (VlanPriority)child;
        else if (child instanceof VlanTrunk) vlanTrunk = (VlanTrunk)child;
        else if (child instanceof VlanSupport) vlanSupport = (VlanSupport)child;
        else if (child instanceof PriorityByDscp) priorityByDscp = (PriorityByDscp)child;
        else if (child instanceof SecurityMode) securityMode = (SecurityMode)child;
        else if (child instanceof Hidden) hidden = (Hidden)child;
        else if (child instanceof StaLimit) staLimit = (StaLimit)child;
        else if (child instanceof Iapp) iapp = (Iapp)child;
        else if (child instanceof KeyWep) keyWep = (KeyWep)child;
        else if (child instanceof KeyWpa) keyWpa = (KeyWpa)child;
        else if (child instanceof Ssid) ssid = (Ssid)child;
        else if (child instanceof Radius) radius = (Radius)child;
    }

}
