
package io.netconfessor.gen.apConfig.monitoring;

import io.netconfessor.Element;
import io.netconfessor.LeafYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangDataType;
import io.netconfessor.YangString;
import io.netconfessor.gen.apConfig.monitoring.route.Destination;
import io.netconfessor.gen.apConfig.monitoring.route.Flags;
import io.netconfessor.gen.apConfig.monitoring.route.Gateway;
import io.netconfessor.gen.apConfig.monitoring.route.JInterface;
import io.netconfessor.gen.apConfig.monitoring.route.Mask;
import io.netconfessor.gen.apConfig.monitoring.route.Name;

/**
 * Visitor of list route
 *
 * @author jnc.py
 */
public abstract class RouteVisitor {

    public abstract void setupName(LeafYangData<YangString> data);

    public abstract void setupJInterface(LeafYangData<YangString> data);

    public abstract void setupDestination(LeafYangData<YangString> data);

    public abstract void setupGateway(LeafYangData<YangString> data);

    public abstract void setupMask(LeafYangData<YangString> data);

    public abstract void setupFlags(LeafYangData<YangString> data);

    public abstract void onName(Name leaf);

    public abstract void onJInterface(JInterface leaf);

    public abstract void onDestination(Destination leaf);

    public abstract void onGateway(Gateway leaf);

    public abstract void onMask(Mask leaf);

    public abstract void onFlags(Flags leaf);

    public void setup() {
        setupName(new LeafYangData<>("name", "/ap-config:monitoring/ap-config:route/ap-config:name", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupJInterface(new LeafYangData<>("interface", "/ap-config:monitoring/ap-config:route/ap-config:interface", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupDestination(new LeafYangData<>("destination", "/ap-config:monitoring/ap-config:route/ap-config:destination", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupGateway(new LeafYangData<>("gateway", "/ap-config:monitoring/ap-config:route/ap-config:gateway", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupMask(new LeafYangData<>("mask", "/ap-config:monitoring/ap-config:route/ap-config:mask", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupFlags(new LeafYangData<>("flags", "/ap-config:monitoring/ap-config:route/ap-config:flags", null, false, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
    }


    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element name = nodes.getFirstChild("name");
        if (name != null) {
            onName((Name)name);
        }
        
        final Element interface_ = nodes.getFirstChild("interface");
        if (interface_ != null) {
            onJInterface((JInterface)interface_);
        }
        
        final Element destination = nodes.getFirstChild("destination");
        if (destination != null) {
            onDestination((Destination)destination);
        }
        
        final Element gateway = nodes.getFirstChild("gateway");
        if (gateway != null) {
            onGateway((Gateway)gateway);
        }
        
        final Element mask = nodes.getFirstChild("mask");
        if (mask != null) {
            onMask((Mask)mask);
        }
        
        final Element flags = nodes.getFirstChild("flags");
        if (flags != null) {
            onFlags((Flags)flags);
        }
    }

}
