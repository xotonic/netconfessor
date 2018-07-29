
package com.netconfessor.gen.apConfig.config.interface_.vap;

import com.netconfessor.gen.apConfig.Enum_0_1;
import com.netconfessor.gen.apConfig.config.interface_.vap.Radius;
import com.netconfessor.gen.apConfig.config.interface_.vap.radius.AcctAddress;
import com.netconfessor.gen.apConfig.config.interface_.vap.radius.AcctEnable;
import com.netconfessor.gen.apConfig.config.interface_.vap.radius.AcctInterval;
import com.netconfessor.gen.apConfig.config.interface_.vap.radius.AcctPassword;
import com.netconfessor.gen.apConfig.config.interface_.vap.radius.AcctPeriodic;
import com.netconfessor.gen.apConfig.config.interface_.vap.radius.AcctPort;
import com.netconfessor.gen.apConfig.config.interface_.vap.radius.AuthAddress;
import com.netconfessor.gen.apConfig.config.interface_.vap.radius.AuthPassword;
import com.netconfessor.gen.apConfig.config.interface_.vap.radius.AuthPort;
import com.netconfessor.gen.apConfig.config.interface_.vap.radius.Domain;
import com.netconfessor.gen.ietfInetTypes.DomainName;
import com.netconfessor.gen.ietfInetTypes.Host;

import io.netconfessor.Element;
import io.netconfessor.EnumYangData;
import io.netconfessor.LeafYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangDataType;
import io.netconfessor.YangInt32;
import io.netconfessor.YangString;

/**
 * Visitor of container radius
 *
 * @author jnc.py
 */
public abstract class RadiusVisitor {

    public abstract void setupAuthPort(LeafYangData<YangInt32> data);

    public abstract void setupAuthAddress(LeafYangData<Host> data);

    public abstract void setupAuthPassword(LeafYangData<YangString> data);

    public abstract void setupAcctEnable(EnumYangData<Enum_0_1> data);

    public abstract void setupAcctPort(LeafYangData<YangInt32> data);

    public abstract void setupAcctAddress(LeafYangData<Host> data);

    public abstract void setupAcctPassword(LeafYangData<YangString> data);

    public abstract void setupAcctPeriodic(EnumYangData<Enum_0_1> data);

    public abstract void setupAcctInterval(LeafYangData<YangInt32> data);

    public abstract void setupDomain(LeafYangData<DomainName> data);

    public abstract void onAuthPort(AuthPort leaf);

    public abstract AuthPort getAuthPort();

    public abstract void onAuthAddress(AuthAddress leaf);

    public abstract AuthAddress getAuthAddress();

    public abstract void onAuthPassword(AuthPassword leaf);

    public abstract AuthPassword getAuthPassword();

    public abstract void onAcctEnable(AcctEnable leaf);

    public abstract AcctEnable getAcctEnable();

    public abstract void onAcctPort(AcctPort leaf);

    public abstract AcctPort getAcctPort();

    public abstract void onAcctAddress(AcctAddress leaf);

    public abstract AcctAddress getAcctAddress();

    public abstract void onAcctPassword(AcctPassword leaf);

    public abstract AcctPassword getAcctPassword();

    public abstract void onAcctPeriodic(AcctPeriodic leaf);

    public abstract AcctPeriodic getAcctPeriodic();

    public abstract void onAcctInterval(AcctInterval leaf);

    public abstract AcctInterval getAcctInterval();

    public abstract void onDomain(Domain leaf);

    public abstract Domain getDomain();

    public void setup() {
        setupAuthPort(new LeafYangData<>("auth-port", "/ap-config:config/ap-config:interface/ap-config:vap/ap-config:radius/ap-config:auth-port", "RADIUS authentication server port", true, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
        setupAuthAddress(new LeafYangData<>("auth-address", "/ap-config:config/ap-config:interface/ap-config:vap/ap-config:radius/ap-config:auth-address", "RADIUS authentication server address", true, YangDataType.leaf, "com.netconfessor.gen.ietfInetTypes.Host", s -> new Host(s)));
        setupAuthPassword(new LeafYangData<>("auth-password", "/ap-config:config/ap-config:interface/ap-config:vap/ap-config:radius/ap-config:auth-password", "RADIUS authentication shared secret", true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupAcctEnable(new EnumYangData<>("acct-enable", "/ap-config:config/ap-config:interface/ap-config:vap/ap-config:radius/ap-config:acct-enable", "Enable accounting", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupAcctPort(new LeafYangData<>("acct-port", "/ap-config:config/ap-config:interface/ap-config:vap/ap-config:radius/ap-config:acct-port", "RADIUS accounting server port", true, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
        setupAcctAddress(new LeafYangData<>("acct-address", "/ap-config:config/ap-config:interface/ap-config:vap/ap-config:radius/ap-config:acct-address", "RADIUS accounting server address", true, YangDataType.leaf, "com.netconfessor.gen.ietfInetTypes.Host", s -> new Host(s)));
        setupAcctPassword(new LeafYangData<>("acct-password", "/ap-config:config/ap-config:interface/ap-config:vap/ap-config:radius/ap-config:acct-password", "RADIUS accounting shared secret", true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupAcctPeriodic(new EnumYangData<>("acct-periodic", "/ap-config:config/ap-config:interface/ap-config:vap/ap-config:radius/ap-config:acct-periodic", "Enable periodic accounting updates", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupAcctInterval(new LeafYangData<>("acct-interval", "/ap-config:config/ap-config:interface/ap-config:vap/ap-config:radius/ap-config:acct-interval", "RADIUS periodic accounting update interval", true, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
        setupDomain(new LeafYangData<>("domain", "/ap-config:config/ap-config:interface/ap-config:vap/ap-config:radius/ap-config:domain", "RADIUS authentication domain", true, YangDataType.leaf, "com.netconfessor.gen.ietfInetTypes.DomainName", s -> new DomainName(s)));
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public Radius collectConfig() {
        Radius radius = new Radius();
        AuthPort authPort = getAuthPort();
        if (authPort != null) {
            radius.addAuthPort(authPort);
        }
        AuthAddress authAddress = getAuthAddress();
        if (authAddress != null) {
            radius.addAuthAddress(authAddress);
        }
        AuthPassword authPassword = getAuthPassword();
        if (authPassword != null) {
            radius.addAuthPassword(authPassword);
        }
        AcctEnable acctEnable = getAcctEnable();
        if (acctEnable != null) {
            radius.addAcctEnable(acctEnable);
        }
        AcctPort acctPort = getAcctPort();
        if (acctPort != null) {
            radius.addAcctPort(acctPort);
        }
        AcctAddress acctAddress = getAcctAddress();
        if (acctAddress != null) {
            radius.addAcctAddress(acctAddress);
        }
        AcctPassword acctPassword = getAcctPassword();
        if (acctPassword != null) {
            radius.addAcctPassword(acctPassword);
        }
        AcctPeriodic acctPeriodic = getAcctPeriodic();
        if (acctPeriodic != null) {
            radius.addAcctPeriodic(acctPeriodic);
        }
        AcctInterval acctInterval = getAcctInterval();
        if (acctInterval != null) {
            radius.addAcctInterval(acctInterval);
        }
        Domain domain = getDomain();
        if (domain != null) {
            radius.addDomain(domain);
        }
        if (radius.hasChildren()) {
           return radius;
        } else {
           return null;
        }
    }

    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element authPort = nodes.getFirstChild("auth-port");
        if (authPort != null) {
            onAuthPort((AuthPort)authPort);
        }
        
        final Element authAddress = nodes.getFirstChild("auth-address");
        if (authAddress != null) {
            onAuthAddress((AuthAddress)authAddress);
        }
        
        final Element authPassword = nodes.getFirstChild("auth-password");
        if (authPassword != null) {
            onAuthPassword((AuthPassword)authPassword);
        }
        
        final Element acctEnable = nodes.getFirstChild("acct-enable");
        if (acctEnable != null) {
            onAcctEnable((AcctEnable)acctEnable);
        }
        
        final Element acctPort = nodes.getFirstChild("acct-port");
        if (acctPort != null) {
            onAcctPort((AcctPort)acctPort);
        }
        
        final Element acctAddress = nodes.getFirstChild("acct-address");
        if (acctAddress != null) {
            onAcctAddress((AcctAddress)acctAddress);
        }
        
        final Element acctPassword = nodes.getFirstChild("acct-password");
        if (acctPassword != null) {
            onAcctPassword((AcctPassword)acctPassword);
        }
        
        final Element acctPeriodic = nodes.getFirstChild("acct-periodic");
        if (acctPeriodic != null) {
            onAcctPeriodic((AcctPeriodic)acctPeriodic);
        }
        
        final Element acctInterval = nodes.getFirstChild("acct-interval");
        if (acctInterval != null) {
            onAcctInterval((AcctInterval)acctInterval);
        }
        
        final Element domain = nodes.getFirstChild("domain");
        if (domain != null) {
            onDomain((Domain)domain);
        }
    }

}
