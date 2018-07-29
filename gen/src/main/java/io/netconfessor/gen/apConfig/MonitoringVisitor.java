
package io.netconfessor.gen.apConfig;

import io.netconfessor.Element;
import io.netconfessor.NodeSet;
import io.netconfessor.YangData;
import io.netconfessor.YangDataType;
import io.netconfessor.gen.apConfig.monitoring.Arp;
import io.netconfessor.gen.apConfig.monitoring.ArpVisitor;
import io.netconfessor.gen.apConfig.monitoring.Ethernet;
import io.netconfessor.gen.apConfig.monitoring.EthernetVisitor;
import io.netconfessor.gen.apConfig.monitoring.Information;
import io.netconfessor.gen.apConfig.monitoring.InformationVisitor;
import io.netconfessor.gen.apConfig.monitoring.Route;
import io.netconfessor.gen.apConfig.monitoring.RouteVisitor;
import io.netconfessor.gen.apConfig.monitoring.Sfp;
import io.netconfessor.gen.apConfig.monitoring.SfpVisitor;
import io.netconfessor.gen.apConfig.monitoring.WanStatus;
import io.netconfessor.gen.apConfig.monitoring.WanStatusVisitor;
import io.netconfessor.gen.apConfig.monitoring.WifiClient;
import io.netconfessor.gen.apConfig.monitoring.WifiClientVisitor;

/**
 * Visitor of container monitoring
 *
 * @author jnc.py
 */
public abstract class MonitoringVisitor {

    public abstract ArpVisitor setupArp(YangData data);

    private ArpVisitor arpVisitor;

    public abstract RouteVisitor setupRoute(YangData data);

    private RouteVisitor routeVisitor;

    public abstract WifiClientVisitor setupWifiClient(YangData data);

    private WifiClientVisitor wifiClientVisitor;

    private WanStatusVisitor wanStatusVisitor;

    public abstract WanStatusVisitor setupWanStatus(YangData data);

    private EthernetVisitor ethernetVisitor;

    public abstract EthernetVisitor setupEthernet(YangData data);

    private SfpVisitor sfpVisitor;

    public abstract SfpVisitor setupSfp(YangData data);

    private InformationVisitor informationVisitor;

    public abstract InformationVisitor setupInformation(YangData data);

    public abstract void onNextArp(Arp item);

    protected void onStartArpList() {
    }

    protected void onStopArpList() {
    }

    public abstract void onNextRoute(Route item);

    protected void onStartRouteList() {
    }

    protected void onStopRouteList() {
    }

    public abstract void onNextWifiClient(WifiClient item);

    protected void onStartWifiClientList() {
    }

    protected void onStopWifiClientList() {
    }

    public abstract void onWanStatus(WanStatus container);

    public abstract void onEthernet(Ethernet container);

    public abstract void onSfp(Sfp container);

    public abstract void onInformation(Information container);

    public void setup() {
        arpVisitor = setupArp(new YangData("arp", "/ap-config:monitoring/ap-config:arp", null, false, YangDataType.list));
        if (arpVisitor != null) {
            arpVisitor.setup();
        }
        routeVisitor = setupRoute(new YangData("route", "/ap-config:monitoring/ap-config:route", null, false, YangDataType.list));
        if (routeVisitor != null) {
            routeVisitor.setup();
        }
        wifiClientVisitor = setupWifiClient(new YangData("wifi-client", "/ap-config:monitoring/ap-config:wifi-client", null, false, YangDataType.list));
        if (wifiClientVisitor != null) {
            wifiClientVisitor.setup();
        }
        wanStatusVisitor = setupWanStatus(new YangData("wan-status", "/ap-config:monitoring/ap-config:wan-status", null, false, YangDataType.container));
        if (wanStatusVisitor != null) {
            wanStatusVisitor.setup();
        }
        ethernetVisitor = setupEthernet(new YangData("ethernet", "/ap-config:monitoring/ap-config:ethernet", null, false, YangDataType.container));
        if (ethernetVisitor != null) {
            ethernetVisitor.setup();
        }
        sfpVisitor = setupSfp(new YangData("sfp", "/ap-config:monitoring/ap-config:sfp", null, false, YangDataType.container));
        if (sfpVisitor != null) {
            sfpVisitor.setup();
        }
        informationVisitor = setupInformation(new YangData("information", "/ap-config:monitoring/ap-config:information", null, false, YangDataType.container));
        if (informationVisitor != null) {
            informationVisitor.setup();
        }
    }


    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        onStartArpList();
        for (Element node : nodes.getChildren("arp")) {
            onNextArp((Arp)node);
            if (arpVisitor != null) {
                if (node.hasChildren()) {
                    arpVisitor.visit(node.getChildren());
                }
            }
        }
        onStopArpList();
        
        onStartRouteList();
        for (Element node : nodes.getChildren("route")) {
            onNextRoute((Route)node);
            if (routeVisitor != null) {
                if (node.hasChildren()) {
                    routeVisitor.visit(node.getChildren());
                }
            }
        }
        onStopRouteList();
        
        onStartWifiClientList();
        for (Element node : nodes.getChildren("wifi-client")) {
            onNextWifiClient((WifiClient)node);
            if (wifiClientVisitor != null) {
                if (node.hasChildren()) {
                    wifiClientVisitor.visit(node.getChildren());
                }
            }
        }
        onStopWifiClientList();
        
        final Element wanStatus = nodes.getFirstChild("wan-status");
        if (wanStatus != null) {
            onWanStatus((WanStatus)wanStatus);
            if (wanStatusVisitor != null) {
                if (wanStatus.hasChildren()) {
                    wanStatusVisitor.visit(wanStatus.getChildren());
                }
            }
        }
        
        final Element ethernet = nodes.getFirstChild("ethernet");
        if (ethernet != null) {
            onEthernet((Ethernet)ethernet);
            if (ethernetVisitor != null) {
                if (ethernet.hasChildren()) {
                    ethernetVisitor.visit(ethernet.getChildren());
                }
            }
        }
        
        final Element sfp = nodes.getFirstChild("sfp");
        if (sfp != null) {
            onSfp((Sfp)sfp);
            if (sfpVisitor != null) {
                if (sfp.hasChildren()) {
                    sfpVisitor.visit(sfp.getChildren());
                }
            }
        }
        
        final Element information = nodes.getFirstChild("information");
        if (information != null) {
            onInformation((Information)information);
            if (informationVisitor != null) {
                if (information.hasChildren()) {
                    informationVisitor.visit(information.getChildren());
                }
            }
        }
    }

}
