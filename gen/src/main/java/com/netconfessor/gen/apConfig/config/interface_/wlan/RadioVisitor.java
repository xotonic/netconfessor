
package com.netconfessor.gen.apConfig.config.interface_.wlan;

import com.netconfessor.gen.apConfig.Enum_0_1;
import com.netconfessor.gen.apConfig.Enum_5_10_20_40_80;
import com.netconfessor.gen.apConfig.Enum_a_an_ac;
import com.netconfessor.gen.apConfig.Enum_disabled_auto_forced;
import com.netconfessor.gen.apConfig.Enum_ru_us;
import com.netconfessor.gen.apConfig.Enum_upper_lower;
import com.netconfessor.gen.apConfig.config.interface_.wlan.Radio;
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
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.QosVisitor;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.Rates;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.RatesVisitor;
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
import io.netconfessor.EnumYangData;
import io.netconfessor.LeafYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangData;
import io.netconfessor.YangDataType;
import io.netconfessor.YangInt32;
import io.netconfessor.YangString;

/**
 * Visitor of container radio
 *
 * @author jnc.py
 */
public abstract class RadioVisitor {

    public abstract void setupCountry(EnumYangData<Enum_ru_us> data);

    public abstract void setupWorkMode(EnumYangData<Enum_a_an_ac> data);

    public abstract void setupBandwidth(EnumYangData<Enum_5_10_20_40_80> data);

    public abstract void setupDisableAtf(EnumYangData<Enum_0_1> data);

    public abstract void setupTdma(EnumYangData<Enum_0_1> data);

    public abstract void setupTdmaTxDuration(LeafYangData<YangInt32> data);

    public abstract void setupAtfIftime(LeafYangData<YangInt32> data);

    public abstract void setupControlSideband(EnumYangData<Enum_upper_lower> data);

    public abstract void setupTxPower(LeafYangData<YangInt32> data);

    public abstract void setupWmm(EnumYangData<Enum_0_1> data);

    public abstract void setupVapEnable(EnumYangData<Enum_0_1> data);

    public abstract void setupFragmentationThreshold(LeafYangData<YangInt32> data);

    public abstract void setupRtsThreshold(LeafYangData<YangInt32> data);

    public abstract void setupShortPreamble(EnumYangData<Enum_0_1> data);

    public abstract void setupAggregation(EnumYangData<Enum_0_1> data);

    public abstract void setupSgi(EnumYangData<Enum_0_1> data);

    public abstract void setupStbc(EnumYangData<Enum_0_1> data);

    public abstract void setupObssCoex(EnumYangData<Enum_0_1> data);

    public abstract void setupBeamforming(EnumYangData<Enum_0_1> data);

    public abstract void setupAckTimeout(LeafYangData<YangInt32> data);

    public abstract void setupProtectionDisabled(EnumYangData<Enum_0_1> data);

    public abstract void setupChannel(LeafYangData<YangInt32> data);

    public abstract void setupEnableFixedRate(EnumYangData<Enum_0_1> data);

    public abstract void setupFixedRate(LeafYangData<YangString> data);

    private RatesVisitor ratesVisitor;

    public abstract RatesVisitor setupRates(YangData data);

    public abstract void setupTxBroadcastLimit(LeafYangData<YangInt32> data);

    public abstract void setupDfs(EnumYangData<Enum_disabled_auto_forced> data);

    public abstract void setupFbwaMode(EnumYangData<Enum_0_1> data);

    public abstract void setupBeaconInterval(LeafYangData<YangInt32> data);

    private QosVisitor qosVisitor;

    public abstract QosVisitor setupQos(YangData data);

    public abstract void onCountry(Country leaf);

    public abstract Country getCountry();

    public abstract void onWorkMode(WorkMode leaf);

    public abstract WorkMode getWorkMode();

    public abstract void onBandwidth(Bandwidth leaf);

    public abstract Bandwidth getBandwidth();

    public abstract void onDisableAtf(DisableAtf leaf);

    public abstract DisableAtf getDisableAtf();

    public abstract void onTdma(Tdma leaf);

    public abstract Tdma getTdma();

    public abstract void onTdmaTxDuration(TdmaTxDuration leaf);

    public abstract TdmaTxDuration getTdmaTxDuration();

    public abstract void onAtfIftime(AtfIftime leaf);

    public abstract AtfIftime getAtfIftime();

    public abstract void onControlSideband(ControlSideband leaf);

    public abstract ControlSideband getControlSideband();

    public abstract void onTxPower(TxPower leaf);

    public abstract TxPower getTxPower();

    public abstract void onWmm(Wmm leaf);

    public abstract Wmm getWmm();

    public abstract void onVapEnable(VapEnable leaf);

    public abstract VapEnable getVapEnable();

    public abstract void onFragmentationThreshold(FragmentationThreshold leaf);

    public abstract FragmentationThreshold getFragmentationThreshold();

    public abstract void onRtsThreshold(RtsThreshold leaf);

    public abstract RtsThreshold getRtsThreshold();

    public abstract void onShortPreamble(ShortPreamble leaf);

    public abstract ShortPreamble getShortPreamble();

    public abstract void onAggregation(Aggregation leaf);

    public abstract Aggregation getAggregation();

    public abstract void onSgi(Sgi leaf);

    public abstract Sgi getSgi();

    public abstract void onStbc(Stbc leaf);

    public abstract Stbc getStbc();

    public abstract void onObssCoex(ObssCoex leaf);

    public abstract ObssCoex getObssCoex();

    public abstract void onBeamforming(Beamforming leaf);

    public abstract Beamforming getBeamforming();

    public abstract void onAckTimeout(AckTimeout leaf);

    public abstract AckTimeout getAckTimeout();

    public abstract void onProtectionDisabled(ProtectionDisabled leaf);

    public abstract ProtectionDisabled getProtectionDisabled();

    public abstract void onChannel(Channel leaf);

    public abstract Channel getChannel();

    public abstract void onEnableFixedRate(EnableFixedRate leaf);

    public abstract EnableFixedRate getEnableFixedRate();

    public abstract void onFixedRate(FixedRate leaf);

    public abstract FixedRate getFixedRate();

    public abstract void onRates(Rates container);

    public abstract void onTxBroadcastLimit(TxBroadcastLimit leaf);

    public abstract TxBroadcastLimit getTxBroadcastLimit();

    public abstract void onDfs(Dfs leaf);

    public abstract Dfs getDfs();

    public abstract void onFbwaMode(FbwaMode leaf);

    public abstract FbwaMode getFbwaMode();

    public abstract void onBeaconInterval(BeaconInterval leaf);

    public abstract BeaconInterval getBeaconInterval();

    public abstract void onQos(Qos container);

    public void setup() {
        setupCountry(new EnumYangData<>("country", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:country", "Country code", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_ru_us", s -> new Enum_ru_us(s), Enum_ru_us.enums()));
        setupWorkMode(new EnumYangData<>("work-mode", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:work-mode", "IEEE 802.11 operation mode", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_a_an_ac", s -> new Enum_a_an_ac(s), Enum_a_an_ac.enums()));
        setupBandwidth(new EnumYangData<>("bandwidth", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:bandwidth", "Channel bandwidth", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_5_10_20_40_80", s -> new Enum_5_10_20_40_80(s), Enum_5_10_20_40_80.enums()));
        setupDisableAtf(new EnumYangData<>("disable-atf", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:disable-atf", "Disable ATF", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupTdma(new EnumYangData<>("tdma", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:tdma", "TDMA mode", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupTdmaTxDuration(new LeafYangData<>("tdma-tx-duration", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:tdma-tx-duration", "TDMA TX duration", true, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
        setupAtfIftime(new LeafYangData<>("atf-iftime", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:atf-iftime", "ATF iftime", true, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
        setupControlSideband(new EnumYangData<>("control-sideband", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:control-sideband", "Primary channel (applicable when bandwidth is 40 MHz)", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_upper_lower", s -> new Enum_upper_lower(s), Enum_upper_lower.enums()));
        setupTxPower(new LeafYangData<>("tx-power", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:tx-power", "TX power", true, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
        setupWmm(new EnumYangData<>("wmm", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:wmm", "WMM feature", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupVapEnable(new EnumYangData<>("vap-enable", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:vap-enable", "Enable VAP support", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupFragmentationThreshold(new LeafYangData<>("fragmentation-threshold", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:fragmentation-threshold", "Fragmentation threshold", true, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
        setupRtsThreshold(new LeafYangData<>("rts-threshold", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:rts-threshold", "RTS threshold", true, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
        setupShortPreamble(new EnumYangData<>("short-preamble", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:short-preamble", "Short preamble", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupAggregation(new EnumYangData<>("aggregation", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:aggregation", "Aggregation", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupSgi(new EnumYangData<>("sgi", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:sgi", "Short guard interval", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupStbc(new EnumYangData<>("stbc", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:stbc", "STBC encoding", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupObssCoex(new EnumYangData<>("obss-coex", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:obss-coex", "OBSS coexistance", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupBeamforming(new EnumYangData<>("beamforming", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:beamforming", "Beamforming", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupAckTimeout(new LeafYangData<>("ack-timeout", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:ack-timeout", "ACK timeout", true, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
        setupProtectionDisabled(new EnumYangData<>("protection-disabled", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:protection-disabled", "Protection mode", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupChannel(new LeafYangData<>("channel", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:channel", "Channel", true, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
        setupEnableFixedRate(new EnumYangData<>("enable-fixed-rate", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:enable-fixed-rate", "Enable fixed TX rate", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupFixedRate(new LeafYangData<>("fixed-rate", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:fixed-rate", "Fixed TX rate", true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        ratesVisitor = setupRates(new YangData("rates", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:rates", null, true, YangDataType.container));
        if (ratesVisitor != null) {
            ratesVisitor.setup();
        }
        setupTxBroadcastLimit(new LeafYangData<>("tx-broadcast-limit", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:tx-broadcast-limit", "TX broadcast limit", true, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
        setupDfs(new EnumYangData<>("dfs", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:dfs", "DFS support", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_disabled_auto_forced", s -> new Enum_disabled_auto_forced(s), Enum_disabled_auto_forced.enums()));
        setupFbwaMode(new EnumYangData<>("fbwa-mode", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:fbwa-mode", "Fixed broadband wireless access mode", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupBeaconInterval(new LeafYangData<>("beacon-interval", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:beacon-interval", "Beacon interval", true, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
        qosVisitor = setupQos(new YangData("qos", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:qos", null, true, YangDataType.container));
        if (qosVisitor != null) {
            qosVisitor.setup();
        }
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public Radio collectConfig() {
        Radio radio = new Radio();
        Country country = getCountry();
        if (country != null) {
            radio.addCountry(country);
        }
        WorkMode workMode = getWorkMode();
        if (workMode != null) {
            radio.addWorkMode(workMode);
        }
        Bandwidth bandwidth = getBandwidth();
        if (bandwidth != null) {
            radio.addBandwidth(bandwidth);
        }
        DisableAtf disableAtf = getDisableAtf();
        if (disableAtf != null) {
            radio.addDisableAtf(disableAtf);
        }
        Tdma tdma = getTdma();
        if (tdma != null) {
            radio.addTdma(tdma);
        }
        TdmaTxDuration tdmaTxDuration = getTdmaTxDuration();
        if (tdmaTxDuration != null) {
            radio.addTdmaTxDuration(tdmaTxDuration);
        }
        AtfIftime atfIftime = getAtfIftime();
        if (atfIftime != null) {
            radio.addAtfIftime(atfIftime);
        }
        ControlSideband controlSideband = getControlSideband();
        if (controlSideband != null) {
            radio.addControlSideband(controlSideband);
        }
        TxPower txPower = getTxPower();
        if (txPower != null) {
            radio.addTxPower(txPower);
        }
        Wmm wmm = getWmm();
        if (wmm != null) {
            radio.addWmm(wmm);
        }
        VapEnable vapEnable = getVapEnable();
        if (vapEnable != null) {
            radio.addVapEnable(vapEnable);
        }
        FragmentationThreshold fragmentationThreshold = getFragmentationThreshold();
        if (fragmentationThreshold != null) {
            radio.addFragmentationThreshold(fragmentationThreshold);
        }
        RtsThreshold rtsThreshold = getRtsThreshold();
        if (rtsThreshold != null) {
            radio.addRtsThreshold(rtsThreshold);
        }
        ShortPreamble shortPreamble = getShortPreamble();
        if (shortPreamble != null) {
            radio.addShortPreamble(shortPreamble);
        }
        Aggregation aggregation = getAggregation();
        if (aggregation != null) {
            radio.addAggregation(aggregation);
        }
        Sgi sgi = getSgi();
        if (sgi != null) {
            radio.addSgi(sgi);
        }
        Stbc stbc = getStbc();
        if (stbc != null) {
            radio.addStbc(stbc);
        }
        ObssCoex obssCoex = getObssCoex();
        if (obssCoex != null) {
            radio.addObssCoex(obssCoex);
        }
        Beamforming beamforming = getBeamforming();
        if (beamforming != null) {
            radio.addBeamforming(beamforming);
        }
        AckTimeout ackTimeout = getAckTimeout();
        if (ackTimeout != null) {
            radio.addAckTimeout(ackTimeout);
        }
        ProtectionDisabled protectionDisabled = getProtectionDisabled();
        if (protectionDisabled != null) {
            radio.addProtectionDisabled(protectionDisabled);
        }
        Channel channel = getChannel();
        if (channel != null) {
            radio.addChannel(channel);
        }
        EnableFixedRate enableFixedRate = getEnableFixedRate();
        if (enableFixedRate != null) {
            radio.addEnableFixedRate(enableFixedRate);
        }
        FixedRate fixedRate = getFixedRate();
        if (fixedRate != null) {
            radio.addFixedRate(fixedRate);
        }
        if (ratesVisitor != null) {
            Rates rates = ratesVisitor.collectConfig();
            if (rates != null) {
                radio.addRates(rates);
            }
        }
        TxBroadcastLimit txBroadcastLimit = getTxBroadcastLimit();
        if (txBroadcastLimit != null) {
            radio.addTxBroadcastLimit(txBroadcastLimit);
        }
        Dfs dfs = getDfs();
        if (dfs != null) {
            radio.addDfs(dfs);
        }
        FbwaMode fbwaMode = getFbwaMode();
        if (fbwaMode != null) {
            radio.addFbwaMode(fbwaMode);
        }
        BeaconInterval beaconInterval = getBeaconInterval();
        if (beaconInterval != null) {
            radio.addBeaconInterval(beaconInterval);
        }
        if (qosVisitor != null) {
            Qos qos = qosVisitor.collectConfig();
            if (qos != null) {
                radio.addQos(qos);
            }
        }
        if (radio.hasChildren()) {
           return radio;
        } else {
           return null;
        }
    }

    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element country = nodes.getFirstChild("country");
        if (country != null) {
            onCountry((Country)country);
        }
        
        final Element workMode = nodes.getFirstChild("work-mode");
        if (workMode != null) {
            onWorkMode((WorkMode)workMode);
        }
        
        final Element bandwidth = nodes.getFirstChild("bandwidth");
        if (bandwidth != null) {
            onBandwidth((Bandwidth)bandwidth);
        }
        
        final Element disableAtf = nodes.getFirstChild("disable-atf");
        if (disableAtf != null) {
            onDisableAtf((DisableAtf)disableAtf);
        }
        
        final Element tdma = nodes.getFirstChild("tdma");
        if (tdma != null) {
            onTdma((Tdma)tdma);
        }
        
        final Element tdmaTxDuration = nodes.getFirstChild("tdma-tx-duration");
        if (tdmaTxDuration != null) {
            onTdmaTxDuration((TdmaTxDuration)tdmaTxDuration);
        }
        
        final Element atfIftime = nodes.getFirstChild("atf-iftime");
        if (atfIftime != null) {
            onAtfIftime((AtfIftime)atfIftime);
        }
        
        final Element controlSideband = nodes.getFirstChild("control-sideband");
        if (controlSideband != null) {
            onControlSideband((ControlSideband)controlSideband);
        }
        
        final Element txPower = nodes.getFirstChild("tx-power");
        if (txPower != null) {
            onTxPower((TxPower)txPower);
        }
        
        final Element wmm = nodes.getFirstChild("wmm");
        if (wmm != null) {
            onWmm((Wmm)wmm);
        }
        
        final Element vapEnable = nodes.getFirstChild("vap-enable");
        if (vapEnable != null) {
            onVapEnable((VapEnable)vapEnable);
        }
        
        final Element fragmentationThreshold = nodes.getFirstChild("fragmentation-threshold");
        if (fragmentationThreshold != null) {
            onFragmentationThreshold((FragmentationThreshold)fragmentationThreshold);
        }
        
        final Element rtsThreshold = nodes.getFirstChild("rts-threshold");
        if (rtsThreshold != null) {
            onRtsThreshold((RtsThreshold)rtsThreshold);
        }
        
        final Element shortPreamble = nodes.getFirstChild("short-preamble");
        if (shortPreamble != null) {
            onShortPreamble((ShortPreamble)shortPreamble);
        }
        
        final Element aggregation = nodes.getFirstChild("aggregation");
        if (aggregation != null) {
            onAggregation((Aggregation)aggregation);
        }
        
        final Element sgi = nodes.getFirstChild("sgi");
        if (sgi != null) {
            onSgi((Sgi)sgi);
        }
        
        final Element stbc = nodes.getFirstChild("stbc");
        if (stbc != null) {
            onStbc((Stbc)stbc);
        }
        
        final Element obssCoex = nodes.getFirstChild("obss-coex");
        if (obssCoex != null) {
            onObssCoex((ObssCoex)obssCoex);
        }
        
        final Element beamforming = nodes.getFirstChild("beamforming");
        if (beamforming != null) {
            onBeamforming((Beamforming)beamforming);
        }
        
        final Element ackTimeout = nodes.getFirstChild("ack-timeout");
        if (ackTimeout != null) {
            onAckTimeout((AckTimeout)ackTimeout);
        }
        
        final Element protectionDisabled = nodes.getFirstChild("protection-disabled");
        if (protectionDisabled != null) {
            onProtectionDisabled((ProtectionDisabled)protectionDisabled);
        }
        
        final Element channel = nodes.getFirstChild("channel");
        if (channel != null) {
            onChannel((Channel)channel);
        }
        
        final Element enableFixedRate = nodes.getFirstChild("enable-fixed-rate");
        if (enableFixedRate != null) {
            onEnableFixedRate((EnableFixedRate)enableFixedRate);
        }
        
        final Element fixedRate = nodes.getFirstChild("fixed-rate");
        if (fixedRate != null) {
            onFixedRate((FixedRate)fixedRate);
        }
        
        final Element rates = nodes.getFirstChild("rates");
        if (rates != null) {
            onRates((Rates)rates);
            if (ratesVisitor != null) {
                if (rates.hasChildren()) {
                    ratesVisitor.visit(rates.getChildren());
                }
            }
        }
        
        final Element txBroadcastLimit = nodes.getFirstChild("tx-broadcast-limit");
        if (txBroadcastLimit != null) {
            onTxBroadcastLimit((TxBroadcastLimit)txBroadcastLimit);
        }
        
        final Element dfs = nodes.getFirstChild("dfs");
        if (dfs != null) {
            onDfs((Dfs)dfs);
        }
        
        final Element fbwaMode = nodes.getFirstChild("fbwa-mode");
        if (fbwaMode != null) {
            onFbwaMode((FbwaMode)fbwaMode);
        }
        
        final Element beaconInterval = nodes.getFirstChild("beacon-interval");
        if (beaconInterval != null) {
            onBeaconInterval((BeaconInterval)beaconInterval);
        }
        
        final Element qos = nodes.getFirstChild("qos");
        if (qos != null) {
            onQos((Qos)qos);
            if (qosVisitor != null) {
                if (qos.hasChildren()) {
                    qosVisitor.visit(qos.getChildren());
                }
            }
        }
    }

}
