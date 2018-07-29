
package com.netconfessor.gen.apConfig.config;

import com.netconfessor.gen.apConfig.config.Route;
import com.netconfessor.gen.apConfig.config.route.Destination;
import com.netconfessor.gen.apConfig.config.route.Gateway;
import com.netconfessor.gen.apConfig.config.route.Name;
import com.netconfessor.gen.apConfig.config.route.Netmask;
import com.netconfessor.gen.ietfInetTypes.IpAddress;

import io.netconfessor.Element;
import io.netconfessor.LeafYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangDataType;
import io.netconfessor.YangString;

/**
 * Visitor of list route
 *
 * @author jnc.py
 */
public abstract class RouteVisitor {

    public abstract void setupName(LeafYangData<YangString> data);

    public abstract void setupDestination(LeafYangData<IpAddress> data);

    public abstract void setupNetmask(LeafYangData<IpAddress> data);

    public abstract void setupGateway(LeafYangData<IpAddress> data);

    public abstract void onName(Name leaf);

    public abstract Name getName();

    public abstract void onDestination(Destination leaf);

    public abstract Destination getDestination();

    public abstract void onNetmask(Netmask leaf);

    public abstract Netmask getNetmask();

    public abstract void onGateway(Gateway leaf);

    public abstract Gateway getGateway();

    public void setup() {
        setupName(new LeafYangData<>("name", "/ap-config:config/ap-config:route/ap-config:name", "Route name", true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupDestination(new LeafYangData<>("destination", "/ap-config:config/ap-config:route/ap-config:destination", "Route destination address", true, YangDataType.leaf, "com.netconfessor.gen.ietfInetTypes.IpAddress", s -> new IpAddress(s)));
        setupNetmask(new LeafYangData<>("netmask", "/ap-config:config/ap-config:route/ap-config:netmask", "Route netmask", true, YangDataType.leaf, "com.netconfessor.gen.ietfInetTypes.IpAddress", s -> new IpAddress(s)));
        setupGateway(new LeafYangData<>("gateway", "/ap-config:config/ap-config:route/ap-config:gateway", "Route gateway", true, YangDataType.leaf, "com.netconfessor.gen.ietfInetTypes.IpAddress", s -> new IpAddress(s)));
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public Route collectConfig(Route route) {
        if (route == null) {
            return null;
        }
        Name name = getName();
        if (name != null) {
            route.addName(name);
        }
        Destination destination = getDestination();
        if (destination != null) {
            route.addDestination(destination);
        }
        Netmask netmask = getNetmask();
        if (netmask != null) {
            route.addNetmask(netmask);
        }
        Gateway gateway = getGateway();
        if (gateway != null) {
            route.addGateway(gateway);
        }
        if (route.hasChildren()) {
           return route;
        } else {
           return null;
        }
    }

    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element name = nodes.getFirstChild("name");
        if (name != null) {
            onName((Name)name);
        }
        
        final Element destination = nodes.getFirstChild("destination");
        if (destination != null) {
            onDestination((Destination)destination);
        }
        
        final Element netmask = nodes.getFirstChild("netmask");
        if (netmask != null) {
            onNetmask((Netmask)netmask);
        }
        
        final Element gateway = nodes.getFirstChild("gateway");
        if (gateway != null) {
            onGateway((Gateway)gateway);
        }
    }

}
