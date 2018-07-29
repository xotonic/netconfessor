
package io.netconfessor.gen.apConfig.config;

import io.netconfessor.Element;
import io.netconfessor.EnumYangData;
import io.netconfessor.LeafYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangDataType;
import io.netconfessor.YangInt32;
import io.netconfessor.gen.apConfig.Enum_0_1;
import io.netconfessor.gen.apConfig.config.WebConfigurator;
import io.netconfessor.gen.apConfig.config.webConfigurator.Enable;
import io.netconfessor.gen.apConfig.config.webConfigurator.HttpPort;
import io.netconfessor.gen.apConfig.config.webConfigurator.HttpsPort;

/**
 * Visitor of container web-configurator
 *
 * @author jnc.py
 */
public abstract class WebConfiguratorVisitor {

    public abstract void setupEnable(EnumYangData<Enum_0_1> data);

    public abstract void setupHttpPort(LeafYangData<YangInt32> data);

    public abstract void setupHttpsPort(LeafYangData<YangInt32> data);

    public abstract void onEnable(Enable leaf);

    public abstract Enable getEnable();

    public abstract void onHttpPort(HttpPort leaf);

    public abstract HttpPort getHttpPort();

    public abstract void onHttpsPort(HttpsPort leaf);

    public abstract HttpsPort getHttpsPort();

    public void setup() {
        setupEnable(new EnumYangData<>("enable", "/ap-config:config/ap-config:web-configurator/ap-config:enable", "Enable or disable web interface", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupHttpPort(new LeafYangData<>("http-port", "/ap-config:config/ap-config:web-configurator/ap-config:http-port", "HTTP port", true, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
        setupHttpsPort(new LeafYangData<>("https-port", "/ap-config:config/ap-config:web-configurator/ap-config:https-port", "HTTPS port", true, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public WebConfigurator collectConfig() {
        WebConfigurator webConfigurator = new WebConfigurator();
        Enable enable = getEnable();
        if (enable != null) {
            webConfigurator.addEnable(enable);
        }
        HttpPort httpPort = getHttpPort();
        if (httpPort != null) {
            webConfigurator.addHttpPort(httpPort);
        }
        HttpsPort httpsPort = getHttpsPort();
        if (httpsPort != null) {
            webConfigurator.addHttpsPort(httpsPort);
        }
        if (webConfigurator.hasChildren()) {
           return webConfigurator;
        } else {
           return null;
        }
    }

    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element enable = nodes.getFirstChild("enable");
        if (enable != null) {
            onEnable((Enable)enable);
        }
        
        final Element httpPort = nodes.getFirstChild("http-port");
        if (httpPort != null) {
            onHttpPort((HttpPort)httpPort);
        }
        
        final Element httpsPort = nodes.getFirstChild("https-port");
        if (httpsPort != null) {
            onHttpsPort((HttpsPort)httpsPort);
        }
    }

}
