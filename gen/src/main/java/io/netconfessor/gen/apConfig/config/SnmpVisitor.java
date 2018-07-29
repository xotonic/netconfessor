
package io.netconfessor.gen.apConfig.config;

import io.netconfessor.Element;
import io.netconfessor.EnumYangData;
import io.netconfessor.LeafYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangDataType;
import io.netconfessor.YangString;
import io.netconfessor.gen.apConfig.Enum_0_1;
import io.netconfessor.gen.apConfig.config.Snmp;
import io.netconfessor.gen.apConfig.config.snmp.Enable;
import io.netconfessor.gen.apConfig.config.snmp.Informsink;
import io.netconfessor.gen.apConfig.config.snmp.Rocommunity;
import io.netconfessor.gen.apConfig.config.snmp.Rwcommunity;
import io.netconfessor.gen.apConfig.config.snmp.Syscontact;
import io.netconfessor.gen.apConfig.config.snmp.Syslocation;
import io.netconfessor.gen.apConfig.config.snmp.Sysname;
import io.netconfessor.gen.apConfig.config.snmp.Trap2sink;
import io.netconfessor.gen.apConfig.config.snmp.Trapcommunity;
import io.netconfessor.gen.apConfig.config.snmp.Trapsink;

/**
 * Visitor of container snmp
 *
 * @author jnc.py
 */
public abstract class SnmpVisitor {

    public abstract void setupEnable(EnumYangData<Enum_0_1> data);

    public abstract void setupRocommunity(LeafYangData<YangString> data);

    public abstract void setupRwcommunity(LeafYangData<YangString> data);

    public abstract void setupTrapsink(LeafYangData<YangString> data);

    public abstract void setupTrap2sink(LeafYangData<YangString> data);

    public abstract void setupInformsink(LeafYangData<YangString> data);

    public abstract void setupSysname(LeafYangData<YangString> data);

    public abstract void setupSyscontact(LeafYangData<YangString> data);

    public abstract void setupSyslocation(LeafYangData<YangString> data);

    public abstract void setupTrapcommunity(LeafYangData<YangString> data);

    public abstract void onEnable(Enable leaf);

    public abstract Enable getEnable();

    public abstract void onRocommunity(Rocommunity leaf);

    public abstract Rocommunity getRocommunity();

    public abstract void onRwcommunity(Rwcommunity leaf);

    public abstract Rwcommunity getRwcommunity();

    public abstract void onTrapsink(Trapsink leaf);

    public abstract Trapsink getTrapsink();

    public abstract void onTrap2sink(Trap2sink leaf);

    public abstract Trap2sink getTrap2sink();

    public abstract void onInformsink(Informsink leaf);

    public abstract Informsink getInformsink();

    public abstract void onSysname(Sysname leaf);

    public abstract Sysname getSysname();

    public abstract void onSyscontact(Syscontact leaf);

    public abstract Syscontact getSyscontact();

    public abstract void onSyslocation(Syslocation leaf);

    public abstract Syslocation getSyslocation();

    public abstract void onTrapcommunity(Trapcommunity leaf);

    public abstract Trapcommunity getTrapcommunity();

    public void setup() {
        setupEnable(new EnumYangData<>("enable", "/ap-config:config/ap-config:snmp/ap-config:enable", "Enable SNMP", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupRocommunity(new LeafYangData<>("rocommunity", "/ap-config:config/ap-config:snmp/ap-config:rocommunity", "RO community", true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupRwcommunity(new LeafYangData<>("rwcommunity", "/ap-config:config/ap-config:snmp/ap-config:rwcommunity", "RW community", true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupTrapsink(new LeafYangData<>("trapsink", "/ap-config:config/ap-config:snmp/ap-config:trapsink", "trapsink", true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupTrap2sink(new LeafYangData<>("trap2sink", "/ap-config:config/ap-config:snmp/ap-config:trap2sink", "trap2sink", true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupInformsink(new LeafYangData<>("informsink", "/ap-config:config/ap-config:snmp/ap-config:informsink", "informsink", true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupSysname(new LeafYangData<>("sysname", "/ap-config:config/ap-config:snmp/ap-config:sysname", "System name", true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupSyscontact(new LeafYangData<>("syscontact", "/ap-config:config/ap-config:snmp/ap-config:syscontact", "System contact", true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupSyslocation(new LeafYangData<>("syslocation", "/ap-config:config/ap-config:snmp/ap-config:syslocation", "System location", true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupTrapcommunity(new LeafYangData<>("trapcommunity", "/ap-config:config/ap-config:snmp/ap-config:trapcommunity", "Trap community", true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public Snmp collectConfig() {
        Snmp snmp = new Snmp();
        Enable enable = getEnable();
        if (enable != null) {
            snmp.addEnable(enable);
        }
        Rocommunity rocommunity = getRocommunity();
        if (rocommunity != null) {
            snmp.addRocommunity(rocommunity);
        }
        Rwcommunity rwcommunity = getRwcommunity();
        if (rwcommunity != null) {
            snmp.addRwcommunity(rwcommunity);
        }
        Trapsink trapsink = getTrapsink();
        if (trapsink != null) {
            snmp.addTrapsink(trapsink);
        }
        Trap2sink trap2sink = getTrap2sink();
        if (trap2sink != null) {
            snmp.addTrap2sink(trap2sink);
        }
        Informsink informsink = getInformsink();
        if (informsink != null) {
            snmp.addInformsink(informsink);
        }
        Sysname sysname = getSysname();
        if (sysname != null) {
            snmp.addSysname(sysname);
        }
        Syscontact syscontact = getSyscontact();
        if (syscontact != null) {
            snmp.addSyscontact(syscontact);
        }
        Syslocation syslocation = getSyslocation();
        if (syslocation != null) {
            snmp.addSyslocation(syslocation);
        }
        Trapcommunity trapcommunity = getTrapcommunity();
        if (trapcommunity != null) {
            snmp.addTrapcommunity(trapcommunity);
        }
        if (snmp.hasChildren()) {
           return snmp;
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
        
        final Element rocommunity = nodes.getFirstChild("rocommunity");
        if (rocommunity != null) {
            onRocommunity((Rocommunity)rocommunity);
        }
        
        final Element rwcommunity = nodes.getFirstChild("rwcommunity");
        if (rwcommunity != null) {
            onRwcommunity((Rwcommunity)rwcommunity);
        }
        
        final Element trapsink = nodes.getFirstChild("trapsink");
        if (trapsink != null) {
            onTrapsink((Trapsink)trapsink);
        }
        
        final Element trap2sink = nodes.getFirstChild("trap2sink");
        if (trap2sink != null) {
            onTrap2sink((Trap2sink)trap2sink);
        }
        
        final Element informsink = nodes.getFirstChild("informsink");
        if (informsink != null) {
            onInformsink((Informsink)informsink);
        }
        
        final Element sysname = nodes.getFirstChild("sysname");
        if (sysname != null) {
            onSysname((Sysname)sysname);
        }
        
        final Element syscontact = nodes.getFirstChild("syscontact");
        if (syscontact != null) {
            onSyscontact((Syscontact)syscontact);
        }
        
        final Element syslocation = nodes.getFirstChild("syslocation");
        if (syslocation != null) {
            onSyslocation((Syslocation)syslocation);
        }
        
        final Element trapcommunity = nodes.getFirstChild("trapcommunity");
        if (trapcommunity != null) {
            onTrapcommunity((Trapcommunity)trapcommunity);
        }
    }

}
