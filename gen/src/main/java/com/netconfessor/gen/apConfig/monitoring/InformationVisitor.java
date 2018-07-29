
package com.netconfessor.gen.apConfig.monitoring;

import com.netconfessor.gen.apConfig.monitoring.information.BoardType;
import com.netconfessor.gen.apConfig.monitoring.information.BootVersion;
import com.netconfessor.gen.apConfig.monitoring.information.FactoryLanMac;
import com.netconfessor.gen.apConfig.monitoring.information.FactorySerialNumber;
import com.netconfessor.gen.apConfig.monitoring.information.FactoryWanMac;
import com.netconfessor.gen.apConfig.monitoring.information.HwPlatform;
import com.netconfessor.gen.apConfig.monitoring.information.HwRevision;
import com.netconfessor.gen.apConfig.monitoring.information.InternetConnectionStatus;
import com.netconfessor.gen.apConfig.monitoring.information.SecondarySoftwareVersion;
import com.netconfessor.gen.apConfig.monitoring.information.SoftwareVersion;
import com.netconfessor.gen.apConfig.monitoring.information.SystemTime;
import com.netconfessor.gen.apConfig.monitoring.information.Uptime;

import io.netconfessor.Element;
import io.netconfessor.LeafYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangDataType;
import io.netconfessor.YangString;

/**
 * Visitor of container information
 *
 * @author jnc.py
 */
public abstract class InformationVisitor {

    public abstract void setupSystemTime(LeafYangData<YangString> data);

    public abstract void setupUptime(LeafYangData<YangString> data);

    public abstract void setupSoftwareVersion(LeafYangData<YangString> data);

    public abstract void setupSecondarySoftwareVersion(LeafYangData<YangString> data);

    public abstract void setupBootVersion(LeafYangData<YangString> data);

    public abstract void setupBoardType(LeafYangData<YangString> data);

    public abstract void setupHwPlatform(LeafYangData<YangString> data);

    public abstract void setupFactoryWanMac(LeafYangData<YangString> data);

    public abstract void setupFactoryLanMac(LeafYangData<YangString> data);

    public abstract void setupFactorySerialNumber(LeafYangData<YangString> data);

    public abstract void setupHwRevision(LeafYangData<YangString> data);

    public abstract void setupInternetConnectionStatus(LeafYangData<YangString> data);

    public abstract void onSystemTime(SystemTime leaf);

    public abstract void onUptime(Uptime leaf);

    public abstract void onSoftwareVersion(SoftwareVersion leaf);

    public abstract void onSecondarySoftwareVersion(SecondarySoftwareVersion leaf);

    public abstract void onBootVersion(BootVersion leaf);

    public abstract void onBoardType(BoardType leaf);

    public abstract void onHwPlatform(HwPlatform leaf);

    public abstract void onFactoryWanMac(FactoryWanMac leaf);

    public abstract void onFactoryLanMac(FactoryLanMac leaf);

    public abstract void onFactorySerialNumber(FactorySerialNumber leaf);

    public abstract void onHwRevision(HwRevision leaf);

    public abstract void onInternetConnectionStatus(InternetConnectionStatus leaf);

    public void setup() {
        setupSystemTime(new LeafYangData<>("system-time", "/ap-config:monitoring/ap-config:information/ap-config:system-time", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupUptime(new LeafYangData<>("uptime", "/ap-config:monitoring/ap-config:information/ap-config:uptime", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupSoftwareVersion(new LeafYangData<>("software-version", "/ap-config:monitoring/ap-config:information/ap-config:software-version", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupSecondarySoftwareVersion(new LeafYangData<>("secondary-software-version", "/ap-config:monitoring/ap-config:information/ap-config:secondary-software-version", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupBootVersion(new LeafYangData<>("boot-version", "/ap-config:monitoring/ap-config:information/ap-config:boot-version", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupBoardType(new LeafYangData<>("board-type", "/ap-config:monitoring/ap-config:information/ap-config:board-type", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupHwPlatform(new LeafYangData<>("hw-platform", "/ap-config:monitoring/ap-config:information/ap-config:hw-platform", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupFactoryWanMac(new LeafYangData<>("factory-wan-mac", "/ap-config:monitoring/ap-config:information/ap-config:factory-wan-mac", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupFactoryLanMac(new LeafYangData<>("factory-lan-mac", "/ap-config:monitoring/ap-config:information/ap-config:factory-lan-mac", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupFactorySerialNumber(new LeafYangData<>("factory-serial-number", "/ap-config:monitoring/ap-config:information/ap-config:factory-serial-number", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupHwRevision(new LeafYangData<>("hw-revision", "/ap-config:monitoring/ap-config:information/ap-config:hw-revision", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupInternetConnectionStatus(new LeafYangData<>("internet-connection-status", "/ap-config:monitoring/ap-config:information/ap-config:internet-connection-status", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
    }


    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element systemTime = nodes.getFirstChild("system-time");
        if (systemTime != null) {
            onSystemTime((SystemTime)systemTime);
        }
        
        final Element uptime = nodes.getFirstChild("uptime");
        if (uptime != null) {
            onUptime((Uptime)uptime);
        }
        
        final Element softwareVersion = nodes.getFirstChild("software-version");
        if (softwareVersion != null) {
            onSoftwareVersion((SoftwareVersion)softwareVersion);
        }
        
        final Element secondarySoftwareVersion = nodes.getFirstChild("secondary-software-version");
        if (secondarySoftwareVersion != null) {
            onSecondarySoftwareVersion((SecondarySoftwareVersion)secondarySoftwareVersion);
        }
        
        final Element bootVersion = nodes.getFirstChild("boot-version");
        if (bootVersion != null) {
            onBootVersion((BootVersion)bootVersion);
        }
        
        final Element boardType = nodes.getFirstChild("board-type");
        if (boardType != null) {
            onBoardType((BoardType)boardType);
        }
        
        final Element hwPlatform = nodes.getFirstChild("hw-platform");
        if (hwPlatform != null) {
            onHwPlatform((HwPlatform)hwPlatform);
        }
        
        final Element factoryWanMac = nodes.getFirstChild("factory-wan-mac");
        if (factoryWanMac != null) {
            onFactoryWanMac((FactoryWanMac)factoryWanMac);
        }
        
        final Element factoryLanMac = nodes.getFirstChild("factory-lan-mac");
        if (factoryLanMac != null) {
            onFactoryLanMac((FactoryLanMac)factoryLanMac);
        }
        
        final Element factorySerialNumber = nodes.getFirstChild("factory-serial-number");
        if (factorySerialNumber != null) {
            onFactorySerialNumber((FactorySerialNumber)factorySerialNumber);
        }
        
        final Element hwRevision = nodes.getFirstChild("hw-revision");
        if (hwRevision != null) {
            onHwRevision((HwRevision)hwRevision);
        }
        
        final Element internetConnectionStatus = nodes.getFirstChild("internet-connection-status");
        if (internetConnectionStatus != null) {
            onInternetConnectionStatus((InternetConnectionStatus)internetConnectionStatus);
        }
    }

}
