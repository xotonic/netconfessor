
package io.netconfessor.gen.apConfig.config.dateTime;

import io.netconfessor.Element;
import io.netconfessor.LeafYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangDataType;
import io.netconfessor.gen.apConfig.config.dateTime.Ntp;
import io.netconfessor.gen.apConfig.config.dateTime.ntp.Server;
import io.netconfessor.gen.ietfInetTypes.Host;

/**
 * Visitor of container ntp
 *
 * @author jnc.py
 */
public abstract class NtpVisitor {

    public abstract void setupServer(LeafYangData<Host> data);

    public abstract void onServer(Server leaf);

    public abstract Server getServer();

    public void setup() {
        setupServer(new LeafYangData<>("server", "/ap-config:config/ap-config:date-time/ap-config:ntp/ap-config:server", "NTP server address", true, YangDataType.leaf, "io.netconfessor.gen.ietfInetTypes.Host", s -> new Host(s)));
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public Ntp collectConfig() {
        Ntp ntp = new Ntp();
        Server server = getServer();
        if (server != null) {
            ntp.addServer(server);
        }
        if (ntp.hasChildren()) {
           return ntp;
        } else {
           return null;
        }
    }

    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element server = nodes.getFirstChild("server");
        if (server != null) {
            onServer((Server)server);
        }
    }

}
