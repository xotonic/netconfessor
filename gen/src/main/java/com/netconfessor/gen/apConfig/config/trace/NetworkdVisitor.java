
package com.netconfessor.gen.apConfig.config.trace;

import com.netconfessor.gen.apConfig.Enum_0_1;
import com.netconfessor.gen.apConfig.config.trace.Networkd;
import com.netconfessor.gen.apConfig.config.trace.networkd.Debug;
import com.netconfessor.gen.apConfig.config.trace.networkd.Error;
import com.netconfessor.gen.apConfig.config.trace.networkd.Info;
import com.netconfessor.gen.apConfig.config.trace.networkd.Traffic;
import com.netconfessor.gen.apConfig.config.trace.networkd.Warn;

import io.netconfessor.Element;
import io.netconfessor.EnumYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangDataType;

/**
 * Visitor of container networkd
 *
 * @author jnc.py
 */
public abstract class NetworkdVisitor {

    public abstract void setupError(EnumYangData<Enum_0_1> data);

    public abstract void setupWarn(EnumYangData<Enum_0_1> data);

    public abstract void setupInfo(EnumYangData<Enum_0_1> data);

    public abstract void setupDebug(EnumYangData<Enum_0_1> data);

    public abstract void setupTraffic(EnumYangData<Enum_0_1> data);

    public abstract void onError(Error leaf);

    public abstract Error getError();

    public abstract void onWarn(Warn leaf);

    public abstract Warn getWarn();

    public abstract void onInfo(Info leaf);

    public abstract Info getInfo();

    public abstract void onDebug(Debug leaf);

    public abstract Debug getDebug();

    public abstract void onTraffic(Traffic leaf);

    public abstract Traffic getTraffic();

    public void setup() {
        setupError(new EnumYangData<>("error", "/ap-config:config/ap-config:trace/ap-config:networkd/ap-config:error", "Toggle error messages", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupWarn(new EnumYangData<>("warn", "/ap-config:config/ap-config:trace/ap-config:networkd/ap-config:warn", "Toggle warning messages", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupInfo(new EnumYangData<>("info", "/ap-config:config/ap-config:trace/ap-config:networkd/ap-config:info", "Toggle info messages", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupDebug(new EnumYangData<>("debug", "/ap-config:config/ap-config:trace/ap-config:networkd/ap-config:debug", "Toggle debug messages", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupTraffic(new EnumYangData<>("traffic", "/ap-config:config/ap-config:trace/ap-config:networkd/ap-config:traffic", "Toggle messages about traffic", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public Networkd collectConfig() {
        Networkd networkd = new Networkd();
        Error error = getError();
        if (error != null) {
            networkd.addError(error);
        }
        Warn warn = getWarn();
        if (warn != null) {
            networkd.addWarn(warn);
        }
        Info info = getInfo();
        if (info != null) {
            networkd.addInfo(info);
        }
        Debug debug = getDebug();
        if (debug != null) {
            networkd.addDebug(debug);
        }
        Traffic traffic = getTraffic();
        if (traffic != null) {
            networkd.addTraffic(traffic);
        }
        if (networkd.hasChildren()) {
           return networkd;
        } else {
           return null;
        }
    }

    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element error = nodes.getFirstChild("error");
        if (error != null) {
            onError((Error)error);
        }
        
        final Element warn = nodes.getFirstChild("warn");
        if (warn != null) {
            onWarn((Warn)warn);
        }
        
        final Element info = nodes.getFirstChild("info");
        if (info != null) {
            onInfo((Info)info);
        }
        
        final Element debug = nodes.getFirstChild("debug");
        if (debug != null) {
            onDebug((Debug)debug);
        }
        
        final Element traffic = nodes.getFirstChild("traffic");
        if (traffic != null) {
            onTraffic((Traffic)traffic);
        }
    }

}
