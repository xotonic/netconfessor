
package com.netconfessor.gen.apConfig.config.interface_.wlan.radio;

import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.Rates;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.Basic;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.BasicVisitor;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.Supported;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.SupportedVisitor;

import io.netconfessor.Element;
import io.netconfessor.NodeSet;
import io.netconfessor.YangData;
import io.netconfessor.YangDataType;

/**
 * Visitor of container rates
 *
 * @author jnc.py
 */
public abstract class RatesVisitor {

    private BasicVisitor basicVisitor;

    public abstract BasicVisitor setupBasic(YangData data);

    private SupportedVisitor supportedVisitor;

    public abstract SupportedVisitor setupSupported(YangData data);

    public abstract void onBasic(Basic container);

    public abstract void onSupported(Supported container);

    public void setup() {
        basicVisitor = setupBasic(new YangData("basic", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:rates/ap-config:basic", null, true, YangDataType.container));
        if (basicVisitor != null) {
            basicVisitor.setup();
        }
        supportedVisitor = setupSupported(new YangData("supported", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:rates/ap-config:supported", null, true, YangDataType.container));
        if (supportedVisitor != null) {
            supportedVisitor.setup();
        }
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public Rates collectConfig() {
        Rates rates = new Rates();
        if (basicVisitor != null) {
            Basic basic = basicVisitor.collectConfig();
            if (basic != null) {
                rates.addBasic(basic);
            }
        }
        if (supportedVisitor != null) {
            Supported supported = supportedVisitor.collectConfig();
            if (supported != null) {
                rates.addSupported(supported);
            }
        }
        if (rates.hasChildren()) {
           return rates;
        } else {
           return null;
        }
    }

    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element basic = nodes.getFirstChild("basic");
        if (basic != null) {
            onBasic((Basic)basic);
            if (basicVisitor != null) {
                if (basic.hasChildren()) {
                    basicVisitor.visit(basic.getChildren());
                }
            }
        }
        
        final Element supported = nodes.getFirstChild("supported");
        if (supported != null) {
            onSupported((Supported)supported);
            if (supportedVisitor != null) {
                if (supported.hasChildren()) {
                    supportedVisitor.visit(supported.getChildren());
                }
            }
        }
    }

}
