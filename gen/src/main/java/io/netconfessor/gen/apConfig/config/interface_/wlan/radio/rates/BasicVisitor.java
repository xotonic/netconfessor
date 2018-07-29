
package io.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates;

import io.netconfessor.Element;
import io.netconfessor.EnumYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangDataType;
import io.netconfessor.gen.apConfig.Enum_0_1;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.Basic;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.basic.Rate12;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.basic.Rate18;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.basic.Rate24;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.basic.Rate36;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.basic.Rate48;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.basic.Rate54;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.basic.Rate6;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.basic.Rate9;

/**
 * Visitor of container basic
 *
 * @author jnc.py
 */
public abstract class BasicVisitor {

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
        setupRate6(new EnumYangData<>("rate-6", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:rates/ap-config:basic/ap-config:rate-6", "6 mbps rate", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupRate9(new EnumYangData<>("rate-9", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:rates/ap-config:basic/ap-config:rate-9", "9 mbps rate", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupRate12(new EnumYangData<>("rate-12", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:rates/ap-config:basic/ap-config:rate-12", "12 mbps rate", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupRate18(new EnumYangData<>("rate-18", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:rates/ap-config:basic/ap-config:rate-18", "18 mbps rate", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupRate24(new EnumYangData<>("rate-24", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:rates/ap-config:basic/ap-config:rate-24", "24 mbps rate", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupRate36(new EnumYangData<>("rate-36", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:rates/ap-config:basic/ap-config:rate-36", "36 mbps rate", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupRate48(new EnumYangData<>("rate-48", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:rates/ap-config:basic/ap-config:rate-48", "48 mbps rate", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
        setupRate54(new EnumYangData<>("rate-54", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:radio/ap-config:rates/ap-config:basic/ap-config:rate-54", "54 mbps rate", true, YangDataType.leaf, "io.netconfessor.gen.apConfig.Enum_0_1", s -> new Enum_0_1(s), Enum_0_1.enums()));
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public Basic collectConfig() {
        Basic basic = new Basic();
        Rate6 rate6 = getRate6();
        if (rate6 != null) {
            basic.addRate6(rate6);
        }
        Rate9 rate9 = getRate9();
        if (rate9 != null) {
            basic.addRate9(rate9);
        }
        Rate12 rate12 = getRate12();
        if (rate12 != null) {
            basic.addRate12(rate12);
        }
        Rate18 rate18 = getRate18();
        if (rate18 != null) {
            basic.addRate18(rate18);
        }
        Rate24 rate24 = getRate24();
        if (rate24 != null) {
            basic.addRate24(rate24);
        }
        Rate36 rate36 = getRate36();
        if (rate36 != null) {
            basic.addRate36(rate36);
        }
        Rate48 rate48 = getRate48();
        if (rate48 != null) {
            basic.addRate48(rate48);
        }
        Rate54 rate54 = getRate54();
        if (rate54 != null) {
            basic.addRate54(rate54);
        }
        if (basic.hasChildren()) {
           return basic;
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
