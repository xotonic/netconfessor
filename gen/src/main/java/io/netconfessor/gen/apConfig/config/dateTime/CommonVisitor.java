
package io.netconfessor.gen.apConfig.config.dateTime;

import io.netconfessor.Element;
import io.netconfessor.EnumYangData;
import io.netconfessor.LeafYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangDataType;
import io.netconfessor.YangInt32;
import io.netconfessor.YangString;
import io.netconfessor.gen.apConfig.Enum_0_1;
import io.netconfessor.gen.apConfig.config.dateTime.Common;
import io.netconfessor.gen.apConfig.config.dateTime.common.Dstenable;
import io.netconfessor.gen.apConfig.config.dateTime.common.Dstend;
import io.netconfessor.gen.apConfig.config.dateTime.common.Dstoffset;
import io.netconfessor.gen.apConfig.config.dateTime.common.Dststart;
import io.netconfessor.gen.apConfig.config.dateTime.common.Timezone;

/**
 * Visitor of container common
 *
 * @author jnc.py
 */
public abstract class CommonVisitor {

    public abstract void setupTimezone(LeafYangData<YangString> data);

    public abstract void setupDstenable(EnumYangData<Enum_0_1> data);

    public abstract void setupDststart(LeafYangData<YangString> data);

    public abstract void setupDstend(LeafYangData<YangString> data);

    public abstract void setupDstoffset(LeafYangData<YangInt32> data);

    public abstract void onTimezone(Timezone leaf);

    public abstract Timezone getTimezone();

    public abstract void onDstenable(Dstenable leaf);

    public abstract Dstenable getDstenable();

    public abstract void onDststart(Dststart leaf);

    public abstract Dststart getDststart();

    public abstract void onDstend(Dstend leaf);

    public abstract Dstend getDstend();

    public abstract void onDstoffset(Dstoffset leaf);

    public abstract Dstoffset getDstoffset();

    public void setup() {
        setupTimezone(new LeafYangData<>("timezone", "/ap-config:config/ap-config:date-time/ap-config:common/ap-config:timezone", "Timezone of the system", true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupDstenable(new EnumYangData<>("dstenable", "/ap-config:config/ap-config:date-time/ap-config:common/ap-config:dstenable", "Daylight saving time enable", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupDststart(new LeafYangData<>("dststart", "/ap-config:config/ap-config:date-time/ap-config:common/ap-config:dststart", "Daylight saving time start", true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupDstend(new LeafYangData<>("dstend", "/ap-config:config/ap-config:date-time/ap-config:common/ap-config:dstend", "Daylight saving time stop", true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupDstoffset(new LeafYangData<>("dstoffset", "/ap-config:config/ap-config:date-time/ap-config:common/ap-config:dstoffset", "Daylight saving time offset", true, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public Common collectConfig() {
        Common common = new Common();
        Timezone timezone = getTimezone();
        if (timezone != null) {
            common.addTimezone(timezone);
        }
        Dstenable dstenable = getDstenable();
        if (dstenable != null) {
            common.addDstenable(dstenable);
        }
        Dststart dststart = getDststart();
        if (dststart != null) {
            common.addDststart(dststart);
        }
        Dstend dstend = getDstend();
        if (dstend != null) {
            common.addDstend(dstend);
        }
        Dstoffset dstoffset = getDstoffset();
        if (dstoffset != null) {
            common.addDstoffset(dstoffset);
        }
        if (common.hasChildren()) {
           return common;
        } else {
           return null;
        }
    }

    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element timezone = nodes.getFirstChild("timezone");
        if (timezone != null) {
            onTimezone((Timezone)timezone);
        }
        
        final Element dstenable = nodes.getFirstChild("dstenable");
        if (dstenable != null) {
            onDstenable((Dstenable)dstenable);
        }
        
        final Element dststart = nodes.getFirstChild("dststart");
        if (dststart != null) {
            onDststart((Dststart)dststart);
        }
        
        final Element dstend = nodes.getFirstChild("dstend");
        if (dstend != null) {
            onDstend((Dstend)dstend);
        }
        
        final Element dstoffset = nodes.getFirstChild("dstoffset");
        if (dstoffset != null) {
            onDstoffset((Dstoffset)dstoffset);
        }
    }

}
