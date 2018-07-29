
package com.netconfessor.gen.apConfig.lastWlanScanResults;

import com.netconfessor.gen.apConfig.lastWlanScanResults.cell.Bssid;
import com.netconfessor.gen.apConfig.lastWlanScanResults.cell.Channel;
import com.netconfessor.gen.apConfig.lastWlanScanResults.cell.Name;
import com.netconfessor.gen.apConfig.lastWlanScanResults.cell.Security;
import com.netconfessor.gen.apConfig.lastWlanScanResults.cell.SignalLevel;
import com.netconfessor.gen.apConfig.lastWlanScanResults.cell.Ssid;

import io.netconfessor.Element;
import io.netconfessor.LeafYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangDataType;
import io.netconfessor.YangInt32;
import io.netconfessor.YangString;

/**
 * Visitor of list cell
 *
 * @author jnc.py
 */
public abstract class CellVisitor {

    public abstract void setupName(LeafYangData<YangString> data);

    public abstract void setupBssid(LeafYangData<YangString> data);

    public abstract void setupSsid(LeafYangData<YangString> data);

    public abstract void setupChannel(LeafYangData<YangString> data);

    public abstract void setupSignalLevel(LeafYangData<YangInt32> data);

    public abstract void setupSecurity(LeafYangData<YangString> data);

    public abstract void onName(Name leaf);

    public abstract void onBssid(Bssid leaf);

    public abstract void onSsid(Ssid leaf);

    public abstract void onChannel(Channel leaf);

    public abstract void onSignalLevel(SignalLevel leaf);

    public abstract void onSecurity(Security leaf);

    public void setup() {
        setupName(new LeafYangData<>("name", "/ap-config:last-wlan-scan-results/ap-config:cell/ap-config:name", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupBssid(new LeafYangData<>("bssid", "/ap-config:last-wlan-scan-results/ap-config:cell/ap-config:bssid", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupSsid(new LeafYangData<>("ssid", "/ap-config:last-wlan-scan-results/ap-config:cell/ap-config:ssid", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupChannel(new LeafYangData<>("channel", "/ap-config:last-wlan-scan-results/ap-config:cell/ap-config:channel", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupSignalLevel(new LeafYangData<>("signal-level", "/ap-config:last-wlan-scan-results/ap-config:cell/ap-config:signal-level", null, false, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
        setupSecurity(new LeafYangData<>("security", "/ap-config:last-wlan-scan-results/ap-config:cell/ap-config:security", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
    }


    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element name = nodes.getFirstChild("name");
        if (name != null) {
            onName((Name)name);
        }
        
        final Element bssid = nodes.getFirstChild("bssid");
        if (bssid != null) {
            onBssid((Bssid)bssid);
        }
        
        final Element ssid = nodes.getFirstChild("ssid");
        if (ssid != null) {
            onSsid((Ssid)ssid);
        }
        
        final Element channel = nodes.getFirstChild("channel");
        if (channel != null) {
            onChannel((Channel)channel);
        }
        
        final Element signalLevel = nodes.getFirstChild("signal-level");
        if (signalLevel != null) {
            onSignalLevel((SignalLevel)signalLevel);
        }
        
        final Element security = nodes.getFirstChild("security");
        if (security != null) {
            onSecurity((Security)security);
        }
    }

}
