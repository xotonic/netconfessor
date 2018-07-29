
package io.netconfessor.gen.apConfig.config;

import io.netconfessor.Element;
import io.netconfessor.LeafYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangDataType;
import io.netconfessor.YangString;
import io.netconfessor.gen.apConfig.config.Authentication;
import io.netconfessor.gen.apConfig.config.authentication.AdminPassword;

/**
 * Visitor of container authentication
 *
 * @author jnc.py
 */
public abstract class AuthenticationVisitor {

    public abstract void setupAdminPassword(LeafYangData<YangString> data);

    public abstract void onAdminPassword(AdminPassword leaf);

    public abstract AdminPassword getAdminPassword();

    public void setup() {
        setupAdminPassword(new LeafYangData<>("admin-password", "/ap-config:config/ap-config:authentication/ap-config:admin-password", "Admin password", true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public Authentication collectConfig() {
        Authentication authentication = new Authentication();
        AdminPassword adminPassword = getAdminPassword();
        if (adminPassword != null) {
            authentication.addAdminPassword(adminPassword);
        }
        if (authentication.hasChildren()) {
           return authentication;
        } else {
           return null;
        }
    }

    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element adminPassword = nodes.getFirstChild("admin-password");
        if (adminPassword != null) {
            onAdminPassword((AdminPassword)adminPassword);
        }
    }

}
