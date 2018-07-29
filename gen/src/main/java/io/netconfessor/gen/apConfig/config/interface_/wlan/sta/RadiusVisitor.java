
package io.netconfessor.gen.apConfig.config.interface_.wlan.sta;

import io.netconfessor.Element;
import io.netconfessor.LeafYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangDataType;
import io.netconfessor.YangString;
import io.netconfessor.gen.apConfig.config.interface_.wlan.sta.Radius;
import io.netconfessor.gen.apConfig.config.interface_.wlan.sta.radius.Password;
import io.netconfessor.gen.apConfig.config.interface_.wlan.sta.radius.Username;

/**
 * Visitor of container radius
 *
 * @author jnc.py
 */
public abstract class RadiusVisitor {

    public abstract void setupUsername(LeafYangData<YangString> data);

    public abstract void setupPassword(LeafYangData<YangString> data);

    public abstract void onUsername(Username leaf);

    public abstract Username getUsername();

    public abstract void onPassword(Password leaf);

    public abstract Password getPassword();

    public void setup() {
        setupUsername(new LeafYangData<>("username", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:sta/ap-config:radius/ap-config:username", "RADIUS authentication username", true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupPassword(new LeafYangData<>("password", "/ap-config:config/ap-config:interface/ap-config:wlan/ap-config:sta/ap-config:radius/ap-config:password", "RADIUS authentication password", true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public Radius collectConfig() {
        Radius radius = new Radius();
        Username username = getUsername();
        if (username != null) {
            radius.addUsername(username);
        }
        Password password = getPassword();
        if (password != null) {
            radius.addPassword(password);
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
        
        final Element username = nodes.getFirstChild("username");
        if (username != null) {
            onUsername((Username)username);
        }
        
        final Element password = nodes.getFirstChild("password");
        if (password != null) {
            onPassword((Password)password);
        }
    }

}
