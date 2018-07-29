
package com.netconfessor.gen.apConfig.config.interface_.wlan;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.AckTimeout;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.Aggregation;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.AtfIftime;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.Bandwidth;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.BeaconInterval;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.Beamforming;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.Channel;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.ControlSideband;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.Country;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.Dfs;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.DisableAtf;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.EnableFixedRate;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.FbwaMode;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.FixedRate;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.FragmentationThreshold;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.ObssCoex;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.ProtectionDisabled;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.Qos;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.Rates;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.RtsThreshold;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.Sgi;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.ShortPreamble;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.Stbc;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.Tdma;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.TdmaTxDuration;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.TxBroadcastLimit;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.TxPower;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.VapEnable;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.Wmm;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.WorkMode;

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
public class Radio extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "country".
     */
    public Country country = null;

    /**
     * Field for child leaf "work-mode".
     */
    public WorkMode workMode = null;

    /**
     * Field for child leaf "bandwidth".
     */
    public Bandwidth bandwidth = null;

    /**
     * Field for child leaf "disable-atf".
     */
    public DisableAtf disableAtf = null;

    /**
     * Field for child leaf "tdma".
     */
    public Tdma tdma = null;

    /**
     * Field for child leaf "tdma-tx-duration".
     */
    public TdmaTxDuration tdmaTxDuration = null;

    /**
     * Field for child leaf "atf-iftime".
     */
    public AtfIftime atfIftime = null;

    /**
     * Field for child leaf "control-sideband".
     */
    public ControlSideband controlSideband = null;

    /**
     * Field for child leaf "tx-power".
     */
    public TxPower txPower = null;

    /**
     * Field for child leaf "wmm".
     */
    public Wmm wmm = null;

    /**
     * Field for child leaf "vap-enable".
     */
    public VapEnable vapEnable = null;

    /**
     * Field for child leaf "fragmentation-threshold".
     */
    public FragmentationThreshold fragmentationThreshold = null;

    /**
     * Field for child leaf "rts-threshold".
     */
    public RtsThreshold rtsThreshold = null;

    /**
     * Field for child leaf "short-preamble".
     */
    public ShortPreamble shortPreamble = null;

    /**
     * Field for child leaf "aggregation".
     */
    public Aggregation aggregation = null;

    /**
     * Field for child leaf "sgi".
     */
    public Sgi sgi = null;

    /**
     * Field for child leaf "stbc".
     */
    public Stbc stbc = null;

    /**
     * Field for child leaf "obss-coex".
     */
    public ObssCoex obssCoex = null;

    /**
     * Field for child leaf "beamforming".
     */
    public Beamforming beamforming = null;

    /**
     * Field for child leaf "ack-timeout".
     */
    public AckTimeout ackTimeout = null;

    /**
     * Field for child leaf "protection-disabled".
     */
    public ProtectionDisabled protectionDisabled = null;

    /**
     * Field for child leaf "channel".
     */
    public Channel channel = null;

    /**
     * Field for child leaf "enable-fixed-rate".
     */
    public EnableFixedRate enableFixedRate = null;

    /**
     * Field for child leaf "fixed-rate".
     */
    public FixedRate fixedRate = null;

    /**
     * Field for child container "rates".
     */
    public Rates rates = null;

    /**
     * Field for child leaf "tx-broadcast-limit".
     */
    public TxBroadcastLimit txBroadcastLimit = null;

    /**
     * Field for child leaf "dfs".
     */
    public Dfs dfs = null;

    /**
     * Field for child leaf "fbwa-mode".
     */
    public FbwaMode fbwaMode = null;

    /**
     * Field for child leaf "beacon-interval".
     */
    public BeaconInterval beaconInterval = null;

    /**
     * Field for child container "qos".
     */
    public Qos qos = null;

    /**
     * Constructor for an empty Radio object.
     */
    public Radio() {
        super(ApConfigSchema.NAMESPACE, "radio");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Radio clone() {
        return (Radio)cloneContent(new Radio());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Radio cloneShallow() {
        return (Radio)cloneShallowContent(new Radio());
    }

    public Radio cloneWithoutChildren() {
        return new Radio();
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
            "country",
            "work-mode",
            "bandwidth",
            "disable-atf",
            "tdma",
            "tdma-tx-duration",
            "atf-iftime",
            "control-sideband",
            "tx-power",
            "wmm",
            "vap-enable",
            "fragmentation-threshold",
            "rts-threshold",
            "short-preamble",
            "aggregation",
            "sgi",
            "stbc",
            "obss-coex",
            "beamforming",
            "ack-timeout",
            "protection-disabled",
            "channel",
            "enable-fixed-rate",
            "fixed-rate",
            "rates",
            "tx-broadcast-limit",
            "dfs",
            "fbwa-mode",
            "beacon-interval",
            "qos",
        };
    }

    /* Access methods for optional leaf child: "country". */

    /**
     * Adds leaf entry "country", using an existing object.
     * @param country The object to add.
     * @return The added child.
     */
    public Country addCountry(Country country) throws JNCException {
        this.country = country;
        insertChild(country, childrenNames());
        return country;
    }

    /**
     * Adds leaf entry "country".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Country addCountry() throws JNCException {
        Country country = new Country();
        this.country = country;
        insertChild(country, childrenNames());
        return country;
    }

    /**
     * Deletes leaf entry "country".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteCountry() throws JNCException {
        this.country = null;
        String path = "country";
        return delete(path);
    }

    /* Access methods for optional leaf child: "work-mode". */

    /**
     * Adds leaf entry "workMode", using an existing object.
     * @param workMode The object to add.
     * @return The added child.
     */
    public WorkMode addWorkMode(WorkMode workMode) throws JNCException {
        this.workMode = workMode;
        insertChild(workMode, childrenNames());
        return workMode;
    }

    /**
     * Adds leaf entry "workMode".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public WorkMode addWorkMode() throws JNCException {
        WorkMode workMode = new WorkMode();
        this.workMode = workMode;
        insertChild(workMode, childrenNames());
        return workMode;
    }

    /**
     * Deletes leaf entry "workMode".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteWorkMode() throws JNCException {
        this.workMode = null;
        String path = "work-mode";
        return delete(path);
    }

    /* Access methods for optional leaf child: "bandwidth". */

    /**
     * Adds leaf entry "bandwidth", using an existing object.
     * @param bandwidth The object to add.
     * @return The added child.
     */
    public Bandwidth addBandwidth(Bandwidth bandwidth) throws JNCException {
        this.bandwidth = bandwidth;
        insertChild(bandwidth, childrenNames());
        return bandwidth;
    }

    /**
     * Adds leaf entry "bandwidth".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Bandwidth addBandwidth() throws JNCException {
        Bandwidth bandwidth = new Bandwidth();
        this.bandwidth = bandwidth;
        insertChild(bandwidth, childrenNames());
        return bandwidth;
    }

    /**
     * Deletes leaf entry "bandwidth".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteBandwidth() throws JNCException {
        this.bandwidth = null;
        String path = "bandwidth";
        return delete(path);
    }

    /* Access methods for optional leaf child: "disable-atf". */

    /**
     * Adds leaf entry "disableAtf", using an existing object.
     * @param disableAtf The object to add.
     * @return The added child.
     */
    public DisableAtf addDisableAtf(DisableAtf disableAtf) throws JNCException {
        this.disableAtf = disableAtf;
        insertChild(disableAtf, childrenNames());
        return disableAtf;
    }

    /**
     * Adds leaf entry "disableAtf".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public DisableAtf addDisableAtf() throws JNCException {
        DisableAtf disableAtf = new DisableAtf();
        this.disableAtf = disableAtf;
        insertChild(disableAtf, childrenNames());
        return disableAtf;
    }

    /**
     * Deletes leaf entry "disableAtf".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteDisableAtf() throws JNCException {
        this.disableAtf = null;
        String path = "disable-atf";
        return delete(path);
    }

    /* Access methods for optional leaf child: "tdma". */

    /**
     * Adds leaf entry "tdma", using an existing object.
     * @param tdma The object to add.
     * @return The added child.
     */
    public Tdma addTdma(Tdma tdma) throws JNCException {
        this.tdma = tdma;
        insertChild(tdma, childrenNames());
        return tdma;
    }

    /**
     * Adds leaf entry "tdma".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Tdma addTdma() throws JNCException {
        Tdma tdma = new Tdma();
        this.tdma = tdma;
        insertChild(tdma, childrenNames());
        return tdma;
    }

    /**
     * Deletes leaf entry "tdma".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteTdma() throws JNCException {
        this.tdma = null;
        String path = "tdma";
        return delete(path);
    }

    /* Access methods for optional leaf child: "tdma-tx-duration". */

    /**
     * Adds leaf entry "tdmaTxDuration", using an existing object.
     * @param tdmaTxDuration The object to add.
     * @return The added child.
     */
    public TdmaTxDuration addTdmaTxDuration(TdmaTxDuration tdmaTxDuration)
            throws JNCException {
        this.tdmaTxDuration = tdmaTxDuration;
        insertChild(tdmaTxDuration, childrenNames());
        return tdmaTxDuration;
    }

    /**
     * Adds leaf entry "tdmaTxDuration".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public TdmaTxDuration addTdmaTxDuration() throws JNCException {
        TdmaTxDuration tdmaTxDuration = new TdmaTxDuration();
        this.tdmaTxDuration = tdmaTxDuration;
        insertChild(tdmaTxDuration, childrenNames());
        return tdmaTxDuration;
    }

    /**
     * Deletes leaf entry "tdmaTxDuration".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteTdmaTxDuration() throws JNCException {
        this.tdmaTxDuration = null;
        String path = "tdma-tx-duration";
        return delete(path);
    }

    /* Access methods for optional leaf child: "atf-iftime". */

    /**
     * Adds leaf entry "atfIftime", using an existing object.
     * @param atfIftime The object to add.
     * @return The added child.
     */
    public AtfIftime addAtfIftime(AtfIftime atfIftime) throws JNCException {
        this.atfIftime = atfIftime;
        insertChild(atfIftime, childrenNames());
        return atfIftime;
    }

    /**
     * Adds leaf entry "atfIftime".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public AtfIftime addAtfIftime() throws JNCException {
        AtfIftime atfIftime = new AtfIftime();
        this.atfIftime = atfIftime;
        insertChild(atfIftime, childrenNames());
        return atfIftime;
    }

    /**
     * Deletes leaf entry "atfIftime".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteAtfIftime() throws JNCException {
        this.atfIftime = null;
        String path = "atf-iftime";
        return delete(path);
    }

    /* Access methods for optional leaf child: "control-sideband". */

    /**
     * Adds leaf entry "controlSideband", using an existing object.
     * @param controlSideband The object to add.
     * @return The added child.
     */
    public ControlSideband addControlSideband(ControlSideband controlSideband)
            throws JNCException {
        this.controlSideband = controlSideband;
        insertChild(controlSideband, childrenNames());
        return controlSideband;
    }

    /**
     * Adds leaf entry "controlSideband".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public ControlSideband addControlSideband() throws JNCException {
        ControlSideband controlSideband = new ControlSideband();
        this.controlSideband = controlSideband;
        insertChild(controlSideband, childrenNames());
        return controlSideband;
    }

    /**
     * Deletes leaf entry "controlSideband".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteControlSideband() throws JNCException {
        this.controlSideband = null;
        String path = "control-sideband";
        return delete(path);
    }

    /* Access methods for optional leaf child: "tx-power". */

    /**
     * Adds leaf entry "txPower", using an existing object.
     * @param txPower The object to add.
     * @return The added child.
     */
    public TxPower addTxPower(TxPower txPower) throws JNCException {
        this.txPower = txPower;
        insertChild(txPower, childrenNames());
        return txPower;
    }

    /**
     * Adds leaf entry "txPower".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public TxPower addTxPower() throws JNCException {
        TxPower txPower = new TxPower();
        this.txPower = txPower;
        insertChild(txPower, childrenNames());
        return txPower;
    }

    /**
     * Deletes leaf entry "txPower".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteTxPower() throws JNCException {
        this.txPower = null;
        String path = "tx-power";
        return delete(path);
    }

    /* Access methods for optional leaf child: "wmm". */

    /**
     * Adds leaf entry "wmm", using an existing object.
     * @param wmm The object to add.
     * @return The added child.
     */
    public Wmm addWmm(Wmm wmm) throws JNCException {
        this.wmm = wmm;
        insertChild(wmm, childrenNames());
        return wmm;
    }

    /**
     * Adds leaf entry "wmm".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Wmm addWmm() throws JNCException {
        Wmm wmm = new Wmm();
        this.wmm = wmm;
        insertChild(wmm, childrenNames());
        return wmm;
    }

    /**
     * Deletes leaf entry "wmm".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteWmm() throws JNCException {
        this.wmm = null;
        String path = "wmm";
        return delete(path);
    }

    /* Access methods for optional leaf child: "vap-enable". */

    /**
     * Adds leaf entry "vapEnable", using an existing object.
     * @param vapEnable The object to add.
     * @return The added child.
     */
    public VapEnable addVapEnable(VapEnable vapEnable) throws JNCException {
        this.vapEnable = vapEnable;
        insertChild(vapEnable, childrenNames());
        return vapEnable;
    }

    /**
     * Adds leaf entry "vapEnable".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public VapEnable addVapEnable() throws JNCException {
        VapEnable vapEnable = new VapEnable();
        this.vapEnable = vapEnable;
        insertChild(vapEnable, childrenNames());
        return vapEnable;
    }

    /**
     * Deletes leaf entry "vapEnable".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteVapEnable() throws JNCException {
        this.vapEnable = null;
        String path = "vap-enable";
        return delete(path);
    }

    /* Access methods for optional leaf child: "fragmentation-threshold". */

    /**
     * Adds leaf entry "fragmentationThreshold", using an existing object.
     * @param fragmentationThreshold The object to add.
     * @return The added child.
     */
    public FragmentationThreshold addFragmentationThreshold(FragmentationThreshold fragmentationThreshold)
            throws JNCException {
        this.fragmentationThreshold = fragmentationThreshold;
        insertChild(fragmentationThreshold, childrenNames());
        return fragmentationThreshold;
    }

    /**
     * Adds leaf entry "fragmentationThreshold".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public FragmentationThreshold addFragmentationThreshold()
            throws JNCException {
        FragmentationThreshold fragmentationThreshold = new FragmentationThreshold();
        this.fragmentationThreshold = fragmentationThreshold;
        insertChild(fragmentationThreshold, childrenNames());
        return fragmentationThreshold;
    }

    /**
     * Deletes leaf entry "fragmentationThreshold".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteFragmentationThreshold() throws JNCException {
        this.fragmentationThreshold = null;
        String path = "fragmentation-threshold";
        return delete(path);
    }

    /* Access methods for optional leaf child: "rts-threshold". */

    /**
     * Adds leaf entry "rtsThreshold", using an existing object.
     * @param rtsThreshold The object to add.
     * @return The added child.
     */
    public RtsThreshold addRtsThreshold(RtsThreshold rtsThreshold)
            throws JNCException {
        this.rtsThreshold = rtsThreshold;
        insertChild(rtsThreshold, childrenNames());
        return rtsThreshold;
    }

    /**
     * Adds leaf entry "rtsThreshold".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public RtsThreshold addRtsThreshold() throws JNCException {
        RtsThreshold rtsThreshold = new RtsThreshold();
        this.rtsThreshold = rtsThreshold;
        insertChild(rtsThreshold, childrenNames());
        return rtsThreshold;
    }

    /**
     * Deletes leaf entry "rtsThreshold".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteRtsThreshold() throws JNCException {
        this.rtsThreshold = null;
        String path = "rts-threshold";
        return delete(path);
    }

    /* Access methods for optional leaf child: "short-preamble". */

    /**
     * Adds leaf entry "shortPreamble", using an existing object.
     * @param shortPreamble The object to add.
     * @return The added child.
     */
    public ShortPreamble addShortPreamble(ShortPreamble shortPreamble)
            throws JNCException {
        this.shortPreamble = shortPreamble;
        insertChild(shortPreamble, childrenNames());
        return shortPreamble;
    }

    /**
     * Adds leaf entry "shortPreamble".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public ShortPreamble addShortPreamble() throws JNCException {
        ShortPreamble shortPreamble = new ShortPreamble();
        this.shortPreamble = shortPreamble;
        insertChild(shortPreamble, childrenNames());
        return shortPreamble;
    }

    /**
     * Deletes leaf entry "shortPreamble".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteShortPreamble() throws JNCException {
        this.shortPreamble = null;
        String path = "short-preamble";
        return delete(path);
    }

    /* Access methods for optional leaf child: "aggregation". */

    /**
     * Adds leaf entry "aggregation", using an existing object.
     * @param aggregation The object to add.
     * @return The added child.
     */
    public Aggregation addAggregation(Aggregation aggregation)
            throws JNCException {
        this.aggregation = aggregation;
        insertChild(aggregation, childrenNames());
        return aggregation;
    }

    /**
     * Adds leaf entry "aggregation".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Aggregation addAggregation() throws JNCException {
        Aggregation aggregation = new Aggregation();
        this.aggregation = aggregation;
        insertChild(aggregation, childrenNames());
        return aggregation;
    }

    /**
     * Deletes leaf entry "aggregation".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteAggregation() throws JNCException {
        this.aggregation = null;
        String path = "aggregation";
        return delete(path);
    }

    /* Access methods for optional leaf child: "sgi". */

    /**
     * Adds leaf entry "sgi", using an existing object.
     * @param sgi The object to add.
     * @return The added child.
     */
    public Sgi addSgi(Sgi sgi) throws JNCException {
        this.sgi = sgi;
        insertChild(sgi, childrenNames());
        return sgi;
    }

    /**
     * Adds leaf entry "sgi".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Sgi addSgi() throws JNCException {
        Sgi sgi = new Sgi();
        this.sgi = sgi;
        insertChild(sgi, childrenNames());
        return sgi;
    }

    /**
     * Deletes leaf entry "sgi".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteSgi() throws JNCException {
        this.sgi = null;
        String path = "sgi";
        return delete(path);
    }

    /* Access methods for optional leaf child: "stbc". */

    /**
     * Adds leaf entry "stbc", using an existing object.
     * @param stbc The object to add.
     * @return The added child.
     */
    public Stbc addStbc(Stbc stbc) throws JNCException {
        this.stbc = stbc;
        insertChild(stbc, childrenNames());
        return stbc;
    }

    /**
     * Adds leaf entry "stbc".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Stbc addStbc() throws JNCException {
        Stbc stbc = new Stbc();
        this.stbc = stbc;
        insertChild(stbc, childrenNames());
        return stbc;
    }

    /**
     * Deletes leaf entry "stbc".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteStbc() throws JNCException {
        this.stbc = null;
        String path = "stbc";
        return delete(path);
    }

    /* Access methods for optional leaf child: "obss-coex". */

    /**
     * Adds leaf entry "obssCoex", using an existing object.
     * @param obssCoex The object to add.
     * @return The added child.
     */
    public ObssCoex addObssCoex(ObssCoex obssCoex) throws JNCException {
        this.obssCoex = obssCoex;
        insertChild(obssCoex, childrenNames());
        return obssCoex;
    }

    /**
     * Adds leaf entry "obssCoex".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public ObssCoex addObssCoex() throws JNCException {
        ObssCoex obssCoex = new ObssCoex();
        this.obssCoex = obssCoex;
        insertChild(obssCoex, childrenNames());
        return obssCoex;
    }

    /**
     * Deletes leaf entry "obssCoex".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteObssCoex() throws JNCException {
        this.obssCoex = null;
        String path = "obss-coex";
        return delete(path);
    }

    /* Access methods for optional leaf child: "beamforming". */

    /**
     * Adds leaf entry "beamforming", using an existing object.
     * @param beamforming The object to add.
     * @return The added child.
     */
    public Beamforming addBeamforming(Beamforming beamforming)
            throws JNCException {
        this.beamforming = beamforming;
        insertChild(beamforming, childrenNames());
        return beamforming;
    }

    /**
     * Adds leaf entry "beamforming".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Beamforming addBeamforming() throws JNCException {
        Beamforming beamforming = new Beamforming();
        this.beamforming = beamforming;
        insertChild(beamforming, childrenNames());
        return beamforming;
    }

    /**
     * Deletes leaf entry "beamforming".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteBeamforming() throws JNCException {
        this.beamforming = null;
        String path = "beamforming";
        return delete(path);
    }

    /* Access methods for optional leaf child: "ack-timeout". */

    /**
     * Adds leaf entry "ackTimeout", using an existing object.
     * @param ackTimeout The object to add.
     * @return The added child.
     */
    public AckTimeout addAckTimeout(AckTimeout ackTimeout) throws JNCException {
        this.ackTimeout = ackTimeout;
        insertChild(ackTimeout, childrenNames());
        return ackTimeout;
    }

    /**
     * Adds leaf entry "ackTimeout".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public AckTimeout addAckTimeout() throws JNCException {
        AckTimeout ackTimeout = new AckTimeout();
        this.ackTimeout = ackTimeout;
        insertChild(ackTimeout, childrenNames());
        return ackTimeout;
    }

    /**
     * Deletes leaf entry "ackTimeout".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteAckTimeout() throws JNCException {
        this.ackTimeout = null;
        String path = "ack-timeout";
        return delete(path);
    }

    /* Access methods for optional leaf child: "protection-disabled". */

    /**
     * Adds leaf entry "protectionDisabled", using an existing object.
     * @param protectionDisabled The object to add.
     * @return The added child.
     */
    public ProtectionDisabled addProtectionDisabled(ProtectionDisabled protectionDisabled)
            throws JNCException {
        this.protectionDisabled = protectionDisabled;
        insertChild(protectionDisabled, childrenNames());
        return protectionDisabled;
    }

    /**
     * Adds leaf entry "protectionDisabled".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public ProtectionDisabled addProtectionDisabled() throws JNCException {
        ProtectionDisabled protectionDisabled = new ProtectionDisabled();
        this.protectionDisabled = protectionDisabled;
        insertChild(protectionDisabled, childrenNames());
        return protectionDisabled;
    }

    /**
     * Deletes leaf entry "protectionDisabled".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteProtectionDisabled() throws JNCException {
        this.protectionDisabled = null;
        String path = "protection-disabled";
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

    /* Access methods for optional leaf child: "enable-fixed-rate". */

    /**
     * Adds leaf entry "enableFixedRate", using an existing object.
     * @param enableFixedRate The object to add.
     * @return The added child.
     */
    public EnableFixedRate addEnableFixedRate(EnableFixedRate enableFixedRate)
            throws JNCException {
        this.enableFixedRate = enableFixedRate;
        insertChild(enableFixedRate, childrenNames());
        return enableFixedRate;
    }

    /**
     * Adds leaf entry "enableFixedRate".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public EnableFixedRate addEnableFixedRate() throws JNCException {
        EnableFixedRate enableFixedRate = new EnableFixedRate();
        this.enableFixedRate = enableFixedRate;
        insertChild(enableFixedRate, childrenNames());
        return enableFixedRate;
    }

    /**
     * Deletes leaf entry "enableFixedRate".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteEnableFixedRate() throws JNCException {
        this.enableFixedRate = null;
        String path = "enable-fixed-rate";
        return delete(path);
    }

    /* Access methods for optional leaf child: "fixed-rate". */

    /**
     * Adds leaf entry "fixedRate", using an existing object.
     * @param fixedRate The object to add.
     * @return The added child.
     */
    public FixedRate addFixedRate(FixedRate fixedRate) throws JNCException {
        this.fixedRate = fixedRate;
        insertChild(fixedRate, childrenNames());
        return fixedRate;
    }

    /**
     * Adds leaf entry "fixedRate".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public FixedRate addFixedRate() throws JNCException {
        FixedRate fixedRate = new FixedRate();
        this.fixedRate = fixedRate;
        insertChild(fixedRate, childrenNames());
        return fixedRate;
    }

    /**
     * Deletes leaf entry "fixedRate".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteFixedRate() throws JNCException {
        this.fixedRate = null;
        String path = "fixed-rate";
        return delete(path);
    }

    /* Access methods for container child: "rates". */

    /**
     * Adds container entry "rates", using an existing object.
     * @param rates The object to add.
     * @return The added child.
     */
    public Rates addRates(Rates rates) throws JNCException {
        this.rates = rates;
        insertChild(rates, childrenNames());
        return rates;
    }

    /**
     * Adds container entry "rates".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Rates addRates() throws JNCException {
        Rates rates = new Rates();
        this.rates = rates;
        insertChild(rates, childrenNames());
        return rates;
    }

    /**
     * Deletes container entry "rates".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteRates() throws JNCException {
        this.rates = null;
        String path = "rates";
        return delete(path);
    }

    /* Access methods for optional leaf child: "tx-broadcast-limit". */

    /**
     * Adds leaf entry "txBroadcastLimit", using an existing object.
     * @param txBroadcastLimit The object to add.
     * @return The added child.
     */
    public TxBroadcastLimit addTxBroadcastLimit(TxBroadcastLimit txBroadcastLimit)
            throws JNCException {
        this.txBroadcastLimit = txBroadcastLimit;
        insertChild(txBroadcastLimit, childrenNames());
        return txBroadcastLimit;
    }

    /**
     * Adds leaf entry "txBroadcastLimit".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public TxBroadcastLimit addTxBroadcastLimit() throws JNCException {
        TxBroadcastLimit txBroadcastLimit = new TxBroadcastLimit();
        this.txBroadcastLimit = txBroadcastLimit;
        insertChild(txBroadcastLimit, childrenNames());
        return txBroadcastLimit;
    }

    /**
     * Deletes leaf entry "txBroadcastLimit".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteTxBroadcastLimit() throws JNCException {
        this.txBroadcastLimit = null;
        String path = "tx-broadcast-limit";
        return delete(path);
    }

    /* Access methods for optional leaf child: "dfs". */

    /**
     * Adds leaf entry "dfs", using an existing object.
     * @param dfs The object to add.
     * @return The added child.
     */
    public Dfs addDfs(Dfs dfs) throws JNCException {
        this.dfs = dfs;
        insertChild(dfs, childrenNames());
        return dfs;
    }

    /**
     * Adds leaf entry "dfs".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Dfs addDfs() throws JNCException {
        Dfs dfs = new Dfs();
        this.dfs = dfs;
        insertChild(dfs, childrenNames());
        return dfs;
    }

    /**
     * Deletes leaf entry "dfs".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteDfs() throws JNCException {
        this.dfs = null;
        String path = "dfs";
        return delete(path);
    }

    /* Access methods for optional leaf child: "fbwa-mode". */

    /**
     * Adds leaf entry "fbwaMode", using an existing object.
     * @param fbwaMode The object to add.
     * @return The added child.
     */
    public FbwaMode addFbwaMode(FbwaMode fbwaMode) throws JNCException {
        this.fbwaMode = fbwaMode;
        insertChild(fbwaMode, childrenNames());
        return fbwaMode;
    }

    /**
     * Adds leaf entry "fbwaMode".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public FbwaMode addFbwaMode() throws JNCException {
        FbwaMode fbwaMode = new FbwaMode();
        this.fbwaMode = fbwaMode;
        insertChild(fbwaMode, childrenNames());
        return fbwaMode;
    }

    /**
     * Deletes leaf entry "fbwaMode".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteFbwaMode() throws JNCException {
        this.fbwaMode = null;
        String path = "fbwa-mode";
        return delete(path);
    }

    /* Access methods for optional leaf child: "beacon-interval". */

    /**
     * Adds leaf entry "beaconInterval", using an existing object.
     * @param beaconInterval The object to add.
     * @return The added child.
     */
    public BeaconInterval addBeaconInterval(BeaconInterval beaconInterval)
            throws JNCException {
        this.beaconInterval = beaconInterval;
        insertChild(beaconInterval, childrenNames());
        return beaconInterval;
    }

    /**
     * Adds leaf entry "beaconInterval".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public BeaconInterval addBeaconInterval() throws JNCException {
        BeaconInterval beaconInterval = new BeaconInterval();
        this.beaconInterval = beaconInterval;
        insertChild(beaconInterval, childrenNames());
        return beaconInterval;
    }

    /**
     * Deletes leaf entry "beaconInterval".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteBeaconInterval() throws JNCException {
        this.beaconInterval = null;
        String path = "beacon-interval";
        return delete(path);
    }

    /* Access methods for container child: "qos". */

    /**
     * Adds container entry "qos", using an existing object.
     * @param qos The object to add.
     * @return The added child.
     */
    public Qos addQos(Qos qos) throws JNCException {
        this.qos = qos;
        insertChild(qos, childrenNames());
        return qos;
    }

    /**
     * Adds container entry "qos".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Qos addQos() throws JNCException {
        Qos qos = new Qos();
        this.qos = qos;
        insertChild(qos, childrenNames());
        return qos;
    }

    /**
     * Deletes container entry "qos".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteQos() throws JNCException {
        this.qos = null;
        String path = "qos";
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
        if (child instanceof Country) country = (Country)child;
        else if (child instanceof WorkMode) workMode = (WorkMode)child;
        else if (child instanceof Bandwidth) bandwidth = (Bandwidth)child;
        else if (child instanceof DisableAtf) disableAtf = (DisableAtf)child;
        else if (child instanceof Tdma) tdma = (Tdma)child;
        else if (child instanceof TdmaTxDuration) tdmaTxDuration = (TdmaTxDuration)child;
        else if (child instanceof AtfIftime) atfIftime = (AtfIftime)child;
        else if (child instanceof ControlSideband) controlSideband = (ControlSideband)child;
        else if (child instanceof TxPower) txPower = (TxPower)child;
        else if (child instanceof Wmm) wmm = (Wmm)child;
        else if (child instanceof VapEnable) vapEnable = (VapEnable)child;
        else if (child instanceof FragmentationThreshold) fragmentationThreshold = (FragmentationThreshold)child;
        else if (child instanceof RtsThreshold) rtsThreshold = (RtsThreshold)child;
        else if (child instanceof ShortPreamble) shortPreamble = (ShortPreamble)child;
        else if (child instanceof Aggregation) aggregation = (Aggregation)child;
        else if (child instanceof Sgi) sgi = (Sgi)child;
        else if (child instanceof Stbc) stbc = (Stbc)child;
        else if (child instanceof ObssCoex) obssCoex = (ObssCoex)child;
        else if (child instanceof Beamforming) beamforming = (Beamforming)child;
        else if (child instanceof AckTimeout) ackTimeout = (AckTimeout)child;
        else if (child instanceof ProtectionDisabled) protectionDisabled = (ProtectionDisabled)child;
        else if (child instanceof Channel) channel = (Channel)child;
        else if (child instanceof EnableFixedRate) enableFixedRate = (EnableFixedRate)child;
        else if (child instanceof FixedRate) fixedRate = (FixedRate)child;
        else if (child instanceof Rates) rates = (Rates)child;
        else if (child instanceof TxBroadcastLimit) txBroadcastLimit = (TxBroadcastLimit)child;
        else if (child instanceof Dfs) dfs = (Dfs)child;
        else if (child instanceof FbwaMode) fbwaMode = (FbwaMode)child;
        else if (child instanceof BeaconInterval) beaconInterval = (BeaconInterval)child;
        else if (child instanceof Qos) qos = (Qos)child;
    }

}
