
package com.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates;

import com.netconfessor.gen.apConfig.Enum_0_1;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.Supported;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.supported.Rate12;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.supported.Rate18;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.supported.Rate24;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.supported.Rate36;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.supported.Rate48;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.supported.Rate54;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.supported.Rate6;
import com.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.supported.Rate9;

import io.netconfessor.Element;
import io.netconfessor.EnumYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangDataType;

/**
 * Visitor of container supported
 *
 * @author jnc.py
 */
public abstract class SupportedVisitor {

    public abstract void setupRate6(EnumYangData<Enum_0_1> data);

    public abstract void setupRate9(EnumYangData<Enum_0_1> data);

    public abstract void setupRate12(EnumYangData<Enum_0_1> data);

    public abstract void setupRate18(EnumYangData<Enum_0_1> data);

    public abstract void setupRate24(EnumYangData<Enum_0_1> data);

    public abstract void setupRate36(EnumYangData<Enum_0_1> data);

    public abstract void setupRate48(EnumYangData<Enum_0_1> data);

    public abstract void setupRate54(EnumYangData<Enum_0_1> data);

    public abstract void onRate6(Rate6 leaf);

    public abstract Rate6 getRate6();

    public abstract void onRate9(Rate9 leaf);

    public abstract Rate9 getRate9();

    public abstract void onRate12(Rate12 leaf);

    public abstract Rate12 getRate12();

    public abstract void onRate18(Rate18 leaf);

    public abstract Rate18 getRate18();

    public abstract void onRate24(Rate24 leaf);

    public abstract Rate24 getRate24();

    public abstract void onRate36(Rate36 leaf);

    public abstract Rate36 getRate36();

    public abstract void onRate48(Rate48 leaf);

    public abstract Rate48 getRate48();

    public abstract void onRate54(Rate54 leaf);

    public abstract Rate54 getRate54();

    public void setup() {
        setupRate6(new EnumYangData<>("rate-6", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:rates/ap-config:supported/ap-config:rate-6", "6 mbps rate", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupRate9(new EnumYangData<>("rate-9", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:rates/ap-config:supported/ap-config:rate-9", "9 mbps rate", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupRate12(new EnumYangData<>("rate-12", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:rates/ap-config:supported/ap-config:rate-12", "12 mbps rate", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupRate18(new EnumYangData<>("rate-18", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:rates/ap-config:supported/ap-config:rate-18", "18 mbps rate", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupRate24(new EnumYangData<>("rate-24", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:rates/ap-config:supported/ap-config:rate-24", "24 mbps rate", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupRate36(new EnumYangData<>("rate-36", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:rates/ap-config:supported/ap-config:rate-36", "36 mbps rate", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupRate48(new EnumYangData<>("rate-48", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:rates/ap-config:supported/ap-config:rate-48", "48 mbps rate", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupRate54(new EnumYangData<>("rate-54", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:rates/ap-config:supported/ap-config:rate-54", "54 mbps rate", true, YangDataType.leaf, "com.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public Supported collectConfig() {
        Supported supported = new Supported();
        Rate6 rate6 = getRate6();
        if (rate6 != null) {
            supported.addRate6(rate6);
        }
        Rate9 rate9 = getRate9();
        if (rate9 != null) {
            supported.addRate9(rate9);
        }
        Rate12 rate12 = getRate12();
        if (rate12 != null) {
            supported.addRate12(rate12);
        }
        Rate18 rate18 = getRate18();
        if (rate18 != null) {
            supported.addRate18(rate18);
        }
        Rate24 rate24 = getRate24();
        if (rate24 != null) {
            supported.addRate24(rate24);
        }
        Rate36 rate36 = getRate36();
        if (rate36 != null) {
            supported.addRate36(rate36);
        }
        Rate48 rate48 = getRate48();
        if (rate48 != null) {
            supported.addRate48(rate48);
        }
        Rate54 rate54 = getRate54();
        if (rate54 != null) {
            supported.addRate54(rate54);
        }
        if (supported.hasChildren()) {
           return supported;
        } else {
           return null;
        }
    }

    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element rate6 = nodes.getFirstChild("rate-6");
        if (rate6 != null) {
            onRate6((Rate6)rate6);
        }
        
        final Element rate9 = nodes.getFirstChild("rate-9");
        if (rate9 != null) {
            onRate9((Rate9)rate9);
        }
        
        final Element rate12 = nodes.getFirstChild("rate-12");
        if (rate12 != null) {
            onRate12((Rate12)rate12);
        }
        
        final Element rate18 = nodes.getFirstChild("rate-18");
        if (rate18 != null) {
            onRate18((Rate18)rate18);
        }
        
        final Element rate24 = nodes.getFirstChild("rate-24");
        if (rate24 != null) {
            onRate24((Rate24)rate24);
        }
        
        final Element rate36 = nodes.getFirstChild("rate-36");
        if (rate36 != null) {
            onRate36((Rate36)rate36);
        }
        
        final Element rate48 = nodes.getFirstChild("rate-48");
        if (rate48 != null) {
            onRate48((Rate48)rate48);
        }
        
        final Element rate54 = nodes.getFirstChild("rate-54");
        if (rate54 != null) {
            onRate54((Rate54)rate54);
        }
    }

}
