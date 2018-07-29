
package io.netconfessor.gen.apConfig.config.interface_.common;

import io.netconfessor.Element;
import io.netconfessor.EnumYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangDataType;
import io.netconfessor.gen.apConfig.Enum_0_1;
import io.netconfessor.gen.apConfig.config.interface_.common.AccessRules;
import io.netconfessor.gen.apConfig.config.interface_.common.accessRules.Netconf;
import io.netconfessor.gen.apConfig.config.interface_.common.accessRules.Snmp;
import io.netconfessor.gen.apConfig.config.interface_.common.accessRules.Ssh;
import io.netconfessor.gen.apConfig.config.interface_.common.accessRules.Telnet;
import io.netconfessor.gen.apConfig.config.interface_.common.accessRules.Web;
import io.netconfessor.gen.apConfig.config.interface_.common.accessRules.WebHttps;

/**
 * Visitor of container access-rules
 *
 * @author jnc.py
 */
public abstract class AccessRulesVisitor {

    public abstract void setupTelnet(EnumYangData<Enum_0_1> data);

    public abstract void setupSsh(EnumYangData<Enum_0_1> data);

    public abstract void setupSnmp(EnumYangData<Enum_0_1> data);

    public abstract void setupNetconf(EnumYangData<Enum_0_1> data);

    public abstract void setupWeb(EnumYangData<Enum_0_1> data);

    public abstract void setupWebHttps(EnumYangData<Enum_0_1> data);

    public abstract void onTelnet(Telnet leaf);

    public abstract Telnet getTelnet();

    public abstract void onSsh(Ssh leaf);

    public abstract Ssh getSsh();

    public abstract void onSnmp(Snmp leaf);

    public abstract Snmp getSnmp();

    public abstract void onNetconf(Netconf leaf);

    public abstract Netconf getNetconf();

    public abstract void onWeb(Web leaf);

    public abstract Web getWeb();

    public abstract void onWebHttps(WebHttps leaf);

    public abstract WebHttps getWebHttps();

    public void setup() {
        setupTelnet(new EnumYangData<>("telnet", "/ap-config:config/ap-config:interface/ap-config:common/ap-config:access-rules/ap-config:telnet", "Interface specific access rule for Telnet", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupSsh(new EnumYangData<>("ssh", "/ap-config:config/ap-config:interface/ap-config:common/ap-config:access-rules/ap-config:ssh", "Interface specific access rule for SSH", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupSnmp(new EnumYangData<>("snmp", "/ap-config:config/ap-config:interface/ap-config:common/ap-config:access-rules/ap-config:snmp", "Interface specific access rule for SNMP", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupNetconf(new EnumYangData<>("netconf", "/ap-config:config/ap-config:interface/ap-config:common/ap-config:access-rules/ap-config:netconf", "Interface specific access rule for NETCONF", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupWeb(new EnumYangData<>("web", "/ap-config:config/ap-config:interface/ap-config:common/ap-config:access-rules/ap-config:web", "Interface specific access rule for Web", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupWebHttps(new EnumYangData<>("web-https", "/ap-config:config/ap-config:interface/ap-config:common/ap-config:access-rules/ap-config:web-https", "Interface specific access rule for Web https-port", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public AccessRules collectConfig() {
        AccessRules accessRules = new AccessRules();
        Telnet telnet = getTelnet();
        if (telnet != null) {
            accessRules.addTelnet(telnet);
        }
        Ssh ssh = getSsh();
        if (ssh != null) {
            accessRules.addSsh(ssh);
        }
        Snmp snmp = getSnmp();
        if (snmp != null) {
            accessRules.addSnmp(snmp);
        }
        Netconf netconf = getNetconf();
        if (netconf != null) {
            accessRules.addNetconf(netconf);
        }
        Web web = getWeb();
        if (web != null) {
            accessRules.addWeb(web);
        }
        WebHttps webHttps = getWebHttps();
        if (webHttps != null) {
            accessRules.addWebHttps(webHttps);
        }
        if (accessRules.hasChildren()) {
           return accessRules;
        } else {
           return null;
        }
    }

    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element telnet = nodes.getFirstChild("telnet");
        if (telnet != null) {
            onTelnet((Telnet)telnet);
        }
        
        final Element ssh = nodes.getFirstChild("ssh");
        if (ssh != null) {
            onSsh((Ssh)ssh);
        }
        
        final Element snmp = nodes.getFirstChild("snmp");
        if (snmp != null) {
            onSnmp((Snmp)snmp);
        }
        
        final Element netconf = nodes.getFirstChild("netconf");
        if (netconf != null) {
            onNetconf((Netconf)netconf);
        }
        
        final Element web = nodes.getFirstChild("web");
        if (web != null) {
            onWeb((Web)web);
        }
        
        final Element webHttps = nodes.getFirstChild("web-https");
        if (webHttps != null) {
            onWebHttps((WebHttps)webHttps);
        }
    }

}
