
package io.netconfessor.gen.apConfig;

import io.netconfessor.Element;
import io.netconfessor.NodeSet;
import io.netconfessor.YangData;
import io.netconfessor.YangDataType;
import io.netconfessor.gen.apConfig.Config;
import io.netconfessor.gen.apConfig.config.Authentication;
import io.netconfessor.gen.apConfig.config.AuthenticationVisitor;
import io.netconfessor.gen.apConfig.config.ConfigDescription;
import io.netconfessor.gen.apConfig.config.ConfigDescriptionVisitor;
import io.netconfessor.gen.apConfig.config.DateTime;
import io.netconfessor.gen.apConfig.config.DateTimeVisitor;
import io.netconfessor.gen.apConfig.config.JInterface;
import io.netconfessor.gen.apConfig.config.JInterfaceVisitor;
import io.netconfessor.gen.apConfig.config.Netconf;
import io.netconfessor.gen.apConfig.config.NetconfVisitor;
import io.netconfessor.gen.apConfig.config.Route;
import io.netconfessor.gen.apConfig.config.RouteVisitor;
import io.netconfessor.gen.apConfig.config.Snmp;
import io.netconfessor.gen.apConfig.config.SnmpVisitor;
import io.netconfessor.gen.apConfig.config.SystemVisitor;
import io.netconfessor.gen.apConfig.config.Trace;
import io.netconfessor.gen.apConfig.config.TraceVisitor;
import io.netconfessor.gen.apConfig.config.WebConfigurator;
import io.netconfessor.gen.apConfig.config.WebConfiguratorVisitor;

/**
 * Visitor of container config
 *
 * @author jnc.py
 */
public abstract class ConfigVisitor {

    private ConfigDescriptionVisitor configDescriptionVisitor;

    public abstract ConfigDescriptionVisitor setupConfigDescription(YangData data);

    public abstract JInterfaceVisitor setupJInterface(YangData data);

    private JInterfaceVisitor interface_Visitor;

    private WebConfiguratorVisitor webConfiguratorVisitor;

    public abstract WebConfiguratorVisitor setupWebConfigurator(YangData data);

    private AuthenticationVisitor authenticationVisitor;

    public abstract AuthenticationVisitor setupAuthentication(YangData data);

    private SnmpVisitor snmpVisitor;

    public abstract SnmpVisitor setupSnmp(YangData data);

    private NetconfVisitor netconfVisitor;

    public abstract NetconfVisitor setupNetconf(YangData data);

    private DateTimeVisitor dateTimeVisitor;

    public abstract DateTimeVisitor setupDateTime(YangData data);

    private TraceVisitor traceVisitor;

    public abstract TraceVisitor setupTrace(YangData data);

    private SystemVisitor systemVisitor;

    public abstract SystemVisitor setupSystem(YangData data);

    public abstract RouteVisitor setupRoute(YangData data);

    private RouteVisitor routeVisitor;

    public abstract void onConfigDescription(ConfigDescription container);

    public abstract void onNextJInterface(JInterface item);

    protected void onStartJInterfaceList() {
    }

    protected void onStopJInterfaceList() {
    }

    abstract protected JInterface getNextJInterface();

    public abstract void onWebConfigurator(WebConfigurator container);

    public abstract void onAuthentication(Authentication container);

    public abstract void onSnmp(Snmp container);

    public abstract void onNetconf(Netconf container);

    public abstract void onDateTime(DateTime container);

    public abstract void onTrace(Trace container);

    public abstract void onSystem(io.netconfessor.gen.apConfig.config.System container);

    public abstract void onNextRoute(Route item);

    protected void onStartRouteList() {
    }

    protected void onStopRouteList() {
    }

    abstract protected Route getNextRoute();

    public void setup() {
        configDescriptionVisitor = setupConfigDescription(new YangData("config-description", "/ap-config:config/ap-config:config-description", null, true, YangDataType.container));
        if (configDescriptionVisitor != null) {
            configDescriptionVisitor.setup();
        }
        interface_Visitor = setupJInterface(new YangData("interface", "/ap-config:config/ap-config:interface", null, true, YangDataType.list));
        if (interface_Visitor != null) {
            interface_Visitor.setup();
        }
        webConfiguratorVisitor = setupWebConfigurator(new YangData("web-configurator", "/ap-config:config/ap-config:web-configurator", null, true, YangDataType.container));
        if (webConfiguratorVisitor != null) {
            webConfiguratorVisitor.setup();
        }
        authenticationVisitor = setupAuthentication(new YangData("authentication", "/ap-config:config/ap-config:authentication", null, true, YangDataType.container));
        if (authenticationVisitor != null) {
            authenticationVisitor.setup();
        }
        snmpVisitor = setupSnmp(new YangData("snmp", "/ap-config:config/ap-config:snmp", null, true, YangDataType.container));
        if (snmpVisitor != null) {
            snmpVisitor.setup();
        }
        netconfVisitor = setupNetconf(new YangData("netconf", "/ap-config:config/ap-config:netconf", null, true, YangDataType.container));
        if (netconfVisitor != null) {
            netconfVisitor.setup();
        }
        dateTimeVisitor = setupDateTime(new YangData("date-time", "/ap-config:config/ap-config:date-time", null, true, YangDataType.container));
        if (dateTimeVisitor != null) {
            dateTimeVisitor.setup();
        }
        traceVisitor = setupTrace(new YangData("trace", "/ap-config:config/ap-config:trace", null, true, YangDataType.container));
        if (traceVisitor != null) {
            traceVisitor.setup();
        }
        systemVisitor = setupSystem(new YangData("system", "/ap-config:config/ap-config:system", null, true, YangDataType.container));
        if (systemVisitor != null) {
            systemVisitor.setup();
        }
        routeVisitor = setupRoute(new YangData("route", "/ap-config:config/ap-config:route", null, true, YangDataType.list));
        if (routeVisitor != null) {
            routeVisitor.setup();
        }
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public Config collectConfig() {
        Config config = new Config();
        if (configDescriptionVisitor != null) {
            ConfigDescription configDescription = configDescriptionVisitor.collectConfig();
            if (configDescription != null) {
                config.addConfigDescription(configDescription);
            }
        }
        JInterface interface_;
        while((interface_ = getNextJInterface()) != null) {
            interface_.removeNonKeysIfMarkedToDelete();
            config.addJInterface(interface_);
        }
        if (webConfiguratorVisitor != null) {
            WebConfigurator webConfigurator = webConfiguratorVisitor.collectConfig();
            if (webConfigurator != null) {
                config.addWebConfigurator(webConfigurator);
            }
        }
        if (authenticationVisitor != null) {
            Authentication authentication = authenticationVisitor.collectConfig();
            if (authentication != null) {
                config.addAuthentication(authentication);
            }
        }
        if (snmpVisitor != null) {
            Snmp snmp = snmpVisitor.collectConfig();
            if (snmp != null) {
                config.addSnmp(snmp);
            }
        }
        if (netconfVisitor != null) {
            Netconf netconf = netconfVisitor.collectConfig();
            if (netconf != null) {
                config.addNetconf(netconf);
            }
        }
        if (dateTimeVisitor != null) {
            DateTime dateTime = dateTimeVisitor.collectConfig();
            if (dateTime != null) {
                config.addDateTime(dateTime);
            }
        }
        if (traceVisitor != null) {
            Trace trace = traceVisitor.collectConfig();
            if (trace != null) {
                config.addTrace(trace);
            }
        }
        if (systemVisitor != null) {
            io.netconfessor.gen.apConfig.config.System system = systemVisitor.collectConfig();
            if (system != null) {
                config.addSystem(system);
            }
        }
        Route route;
        while((route = getNextRoute()) != null) {
            route.removeNonKeysIfMarkedToDelete();
            config.addRoute(route);
        }
        if (config.hasChildren()) {
           return config;
        } else {
           return null;
        }
    }

    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element configDescription = nodes.getFirstChild("config-description");
        if (configDescription != null) {
            onConfigDescription((ConfigDescription)configDescription);
            if (configDescriptionVisitor != null) {
                if (configDescription.hasChildren()) {
                    configDescriptionVisitor.visit(configDescription.getChildren());
                }
            }
        }
        
        onStartJInterfaceList();
        for (Element node : nodes.getChildren("interface")) {
            onNextJInterface((JInterface)node);
            if (interface_Visitor != null) {
                if (node.hasChildren()) {
                    interface_Visitor.visit(node.getChildren());
                }
            }
        }
        onStopJInterfaceList();
        
        final Element webConfigurator = nodes.getFirstChild("web-configurator");
        if (webConfigurator != null) {
            onWebConfigurator((WebConfigurator)webConfigurator);
            if (webConfiguratorVisitor != null) {
                if (webConfigurator.hasChildren()) {
                    webConfiguratorVisitor.visit(webConfigurator.getChildren());
                }
            }
        }
        
        final Element authentication = nodes.getFirstChild("authentication");
        if (authentication != null) {
            onAuthentication((Authentication)authentication);
            if (authenticationVisitor != null) {
                if (authentication.hasChildren()) {
                    authenticationVisitor.visit(authentication.getChildren());
                }
            }
        }
        
        final Element snmp = nodes.getFirstChild("snmp");
        if (snmp != null) {
            onSnmp((Snmp)snmp);
            if (snmpVisitor != null) {
                if (snmp.hasChildren()) {
                    snmpVisitor.visit(snmp.getChildren());
                }
            }
        }
        
        final Element netconf = nodes.getFirstChild("netconf");
        if (netconf != null) {
            onNetconf((Netconf)netconf);
            if (netconfVisitor != null) {
                if (netconf.hasChildren()) {
                    netconfVisitor.visit(netconf.getChildren());
                }
            }
        }
        
        final Element dateTime = nodes.getFirstChild("date-time");
        if (dateTime != null) {
            onDateTime((DateTime)dateTime);
            if (dateTimeVisitor != null) {
                if (dateTime.hasChildren()) {
                    dateTimeVisitor.visit(dateTime.getChildren());
                }
            }
        }
        
        final Element trace = nodes.getFirstChild("trace");
        if (trace != null) {
            onTrace((Trace)trace);
            if (traceVisitor != null) {
                if (trace.hasChildren()) {
                    traceVisitor.visit(trace.getChildren());
                }
            }
        }
        
        final Element system = nodes.getFirstChild("system");
        if (system != null) {
            onSystem((io.netconfessor.gen.apConfig.config.System)system);
            if (systemVisitor != null) {
                if (system.hasChildren()) {
                    systemVisitor.visit(system.getChildren());
                }
            }
        }
        
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
    }

}
