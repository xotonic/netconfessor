
package io.netconfessor.gen.apConfig.config;

import io.netconfessor.Element;
import io.netconfessor.LeafYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangDataType;
import io.netconfessor.YangString;
import io.netconfessor.gen.apConfig.config.ConfigDescription;
import io.netconfessor.gen.apConfig.config.configDescription.Version;

/**
 * Visitor of container config-description
 *
 * @author jnc.py
 */
public abstract class ConfigDescriptionVisitor {

    public abstract void setupVersion(LeafYangData<YangString> data);

    public abstract void onVersion(Version leaf);

    public abstract Version getVersion();

    public void setup() {
        setupVersion(new LeafYangData<>("version", "/ap-config:config/ap-config:config-description/ap-config:version", "Configuration version", true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public ConfigDescription collectConfig() {
        ConfigDescription configDescription = new ConfigDescription();
        Version version = getVersion();
        if (version != null) {
            configDescription.addVersion(version);
        }
        if (configDescription.hasChildren()) {
           return configDescription;
        } else {
           return null;
        }
    }

    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element version = nodes.getFirstChild("version");
        if (version != null) {
            onVersion((Version)version);
        }
    }

}
