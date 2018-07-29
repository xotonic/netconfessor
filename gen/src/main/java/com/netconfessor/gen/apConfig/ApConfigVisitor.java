
package com.netconfessor.gen.apConfig;

import com.netconfessor.gen.apConfig.Config;
import com.netconfessor.gen.apConfig.ConfigVisitor;
import com.netconfessor.gen.apConfig.LastWlanScanResults;
import com.netconfessor.gen.apConfig.LastWlanScanResultsVisitor;
import com.netconfessor.gen.apConfig.Monitoring;
import com.netconfessor.gen.apConfig.MonitoringVisitor;

import io.netconfessor.Element;
import io.netconfessor.NodeSet;
import io.netconfessor.YangData;
import io.netconfessor.YangDataType;

/**
 * Visitor of module ap-config(http://eltex.org/ap)
 *
 * @author jnc.py
 */
public abstract class ApConfigVisitor {

    private ConfigVisitor configVisitor;

    public abstract ConfigVisitor setupConfig(YangData data);

    private MonitoringVisitor monitoringVisitor;

    public abstract MonitoringVisitor setupMonitoring(YangData data);

    private LastWlanScanResultsVisitor lastWlanScanResultsVisitor;

    public abstract LastWlanScanResultsVisitor setupLastWlanScanResults(YangData data);

    public abstract void onConfig(Config container);

    public abstract void onMonitoring(Monitoring container);

    public abstract void onLastWlanScanResults(LastWlanScanResults container);

    public void setup() {
        configVisitor = setupConfig(new YangData("config", "/ap-config:config", null, true, YangDataType.container));
        if (configVisitor != null) {
            configVisitor.setup();
        }
        monitoringVisitor = setupMonitoring(new YangData("monitoring", "/ap-config:monitoring", null, false, YangDataType.container));
        if (monitoringVisitor != null) {
            monitoringVisitor.setup();
        }
        lastWlanScanResultsVisitor = setupLastWlanScanResults(new YangData("last-wlan-scan-results", "/ap-config:last-wlan-scan-results", null, false, YangDataType.container));
        if (lastWlanScanResultsVisitor != null) {
            lastWlanScanResultsVisitor.setup();
        }
    }

    /**
     * Retrieve all config values in registered visitors
     * Before send to device you need sync result with older nodeset (empty allowed)
     */
    public NodeSet collectConfig() {
        NodeSet nodes = new NodeSet();
        if (configVisitor != null) {
            Config config = configVisitor.collectConfig();
            if (config != null) {
                nodes.add(config);
            }
        }
        return nodes;
    }

    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element config = nodes.getFirstChild("config");
        if (config != null) {
            onConfig((Config)config);
            if (configVisitor != null) {
                if (config.hasChildren()) {
                    configVisitor.visit(config.getChildren());
                }
            }
        }
        
        final Element monitoring = nodes.getFirstChild("monitoring");
        if (monitoring != null) {
            onMonitoring((Monitoring)monitoring);
            if (monitoringVisitor != null) {
                if (monitoring.hasChildren()) {
                    monitoringVisitor.visit(monitoring.getChildren());
                }
            }
        }
        
        final Element lastWlanScanResults = nodes.getFirstChild("last-wlan-scan-results");
        if (lastWlanScanResults != null) {
            onLastWlanScanResults((LastWlanScanResults)lastWlanScanResults);
            if (lastWlanScanResultsVisitor != null) {
                if (lastWlanScanResults.hasChildren()) {
                    lastWlanScanResultsVisitor.visit(lastWlanScanResults.getChildren());
                }
            }
        }
    }

}
