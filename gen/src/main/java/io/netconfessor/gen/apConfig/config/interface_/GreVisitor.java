
package io.netconfessor.gen.apConfig.config.interface_;

import io.netconfessor.Element;
import io.netconfessor.LeafYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangDataType;
import io.netconfessor.YangString;
import io.netconfessor.gen.apConfig.config.interface_.Gre;
import io.netconfessor.gen.apConfig.config.interface_.gre.Basic;
import io.netconfessor.gen.apConfig.config.interface_.gre.Linkname;
import io.netconfessor.gen.apConfig.config.interface_.gre.Remote;
import io.netconfessor.gen.ietfInetTypes.IpAddress;

/**
 * Visitor of container gre
 *
 * @author jnc.py
 */
public abstract class GreVisitor {

    public abstract void setupBasic(LeafYangData<YangString> data);

    public abstract void setupRemote(LeafYangData<IpAddress> data);

    public abstract void setupLinkname(LeafYangData<YangString> data);

    public abstract void onBasic(Basic leaf);

    public abstract Basic getBasic();

    public abstract void onRemote(Remote leaf);

    public abstract Remote getRemote();

    public abstract void onLinkname(Linkname leaf);

    public abstract Linkname getLinkname();

    public void setup() {
        setupBasic(new LeafYangData<>("basic", "/ap-config:config/ap-config:interface/ap-config:gre/ap-config:basic", "Basic interface name", true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupRemote(new LeafYangData<>("remote", "/ap-config:config/ap-config:interface/ap-config:gre/ap-config:remote", "Remote IP address", true, YangDataType.leaf, "io.netconfessor.gen.ietfInetTypes.IpAddress", s -> new IpAddress(s)));
        setupLinkname(new LeafYangData<>("linkname", "/ap-config:config/ap-config:interface/ap-config:gre/ap-config:linkname", "OS interface name", true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public Gre collectConfig() {
        Gre gre = new Gre();
        Basic basic = getBasic();
        if (basic != null) {
            gre.addBasic(basic);
        }
        Remote remote = getRemote();
        if (remote != null) {
            gre.addRemote(remote);
        }
        Linkname linkname = getLinkname();
        if (linkname != null) {
            gre.addLinkname(linkname);
        }
        if (gre.hasChildren()) {
           return gre;
        } else {
           return null;
        }
    }

    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element basic = nodes.getFirstChild("basic");
        if (basic != null) {
            onBasic((Basic)basic);
        }
        
        final Element remote = nodes.getFirstChild("remote");
        if (remote != null) {
            onRemote((Remote)remote);
        }
        
        final Element linkname = nodes.getFirstChild("linkname");
        if (linkname != null) {
            onLinkname((Linkname)linkname);
        }
    }

}
