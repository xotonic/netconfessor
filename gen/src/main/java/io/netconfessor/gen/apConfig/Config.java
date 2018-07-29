
package io.netconfessor.gen.apConfig;

import io.netconfessor.Element;
import io.netconfessor.ElementChildrenIterator;
import io.netconfessor.JNCException;
import io.netconfessor.NodeSet;
import io.netconfessor.YangContainer;
import io.netconfessor.YangElement;
import io.netconfessor.YangString;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.config.Authentication;
import io.netconfessor.gen.apConfig.config.ConfigDescription;
import io.netconfessor.gen.apConfig.config.DateTime;
import io.netconfessor.gen.apConfig.config.JInterface;
import io.netconfessor.gen.apConfig.config.Netconf;
import io.netconfessor.gen.apConfig.config.Route;
import io.netconfessor.gen.apConfig.config.Snmp;
import io.netconfessor.gen.apConfig.config.System;
import io.netconfessor.gen.apConfig.config.Trace;
import io.netconfessor.gen.apConfig.config.WebConfigurator;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Config extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child container "config-description".
     */
    public ConfigDescription configDescription = null;

    /**
     * Field for child container "web-configurator".
     */
    public WebConfigurator webConfigurator = null;

    /**
     * Field for child container "authentication".
     */
    public Authentication authentication = null;

    /**
     * Field for child container "snmp".
     */
    public Snmp snmp = null;

    /**
     * Field for child container "netconf".
     */
    public Netconf netconf = null;

    /**
     * Field for child container "date-time".
     */
    public DateTime dateTime = null;

    /**
     * Field for child container "trace".
     */
    public Trace trace = null;

    /**
     * Field for child container "system".
     */
    public System system = null;

    /**
     * Constructor for an empty Config object.
     */
    public Config() {
        super(ApConfigSchema.NAMESPACE, "config");
        setDefaultPrefix();
        setPrefix(ApConfigSchema.PREFIX);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Config clone() {
        return (Config)cloneContent(new Config());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Config cloneShallow() {
        return (Config)cloneShallowContent(new Config());
    }

    public Config cloneWithoutChildren() {
        return new Config();
    }

    /**
     * @return An array with the identifiers of any key children
     */
    public String[] keyNames() {
        return null;
    }

    /**
     * @return An array with the identifiers of any children, in order.
     */
    public String[] childrenNames() {
        return new String[] {
            "config-description",
            "interface",
            "web-configurator",
            "authentication",
            "snmp",
            "netconf",
            "date-time",
            "trace",
            "system",
            "route",
        };
    }

    /* Access methods for container child: "config-description". */

    /**
     * Adds container entry "configDescription", using an existing object.
     * @param configDescription The object to add.
     * @return The added child.
     */
    public ConfigDescription addConfigDescription(ConfigDescription configDescription)
            throws JNCException {
        this.configDescription = configDescription;
        insertChild(configDescription, childrenNames());
        return configDescription;
    }

    /**
     * Adds container entry "configDescription".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public ConfigDescription addConfigDescription() throws JNCException {
        ConfigDescription configDescription = new ConfigDescription();
        this.configDescription = configDescription;
        insertChild(configDescription, childrenNames());
        return configDescription;
    }

    /**
     * Deletes container entry "configDescription".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteConfigDescription() throws JNCException {
        this.configDescription = null;
        String path = "config-description";
        return delete(path);
    }

    /* Access methods for list child: "interface". */

    /**
     * Gets list entry "interface_", with specified keys.
     * @param nameValue Key argument of child.
     */
    public JInterface getJInterface(YangString nameValue) throws JNCException {
        String path = "interface[name='" + nameValue + "']";
        return (JInterface)searchOne(path);
    }

    /**
     * Gets list entry "interface_", with specified keys.
     * The keys are specified as strings.
     * @param nameValue Key argument of child.
     */
    public JInterface getJInterface(String nameValue) throws JNCException {
        String path = "interface[name='" + nameValue + "']";
        return (JInterface)searchOne(path);
    }

    /**
     * Iterator method for the list "interface".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator<JInterface> interface_Iterator() {
        return new ElementChildrenIterator(children, "interface");
    }

    /**
     * Adds list entry "interface_", using an existing object.
     * @param interface_ The object to add.
     * @return The added child.
     */
    public JInterface addJInterface(JInterface interface_) throws JNCException {
        insertChild(interface_, childrenNames());
        return interface_;
    }

    /**
     * Adds list entry "interface_", with specified keys.
     * @param nameValue Key argument of child.
     * @return The added child.
     */
    public JInterface addJInterface(YangString nameValue) throws JNCException {
        JInterface interface_ = new JInterface(nameValue);
        return addJInterface(interface_);
    }

    /**
     * Adds list entry "interface_", with specified keys.
     * The keys are specified as strings.
     * @param nameValue Key argument of child.
     * @return The added child.
     */
    public JInterface addJInterface(String nameValue) throws JNCException {
        JInterface interface_ = new JInterface(nameValue);
        return addJInterface(interface_);
    }

    /**
     * Adds list entry "interface_".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public JInterface addJInterface() throws JNCException {
        JInterface interface_ = new JInterface();
        insertChild(interface_, childrenNames());
        return interface_;
    }

    /**
     * Deletes list entry "interface_", with specified keys.
     * @param nameValue Key argument of child.
     */
    public void deleteJInterface(YangString nameValue) throws JNCException {
        String path = "interface[name='" + nameValue + "']";
        delete(path);
    }

    /**
     * Deletes list entry "interface_", with specified keys.
     * The keys are specified as strings.
     * @param nameValue Key argument of child.
     */
    public void deleteJInterface(String nameValue) throws JNCException {
        String path = "interface[name='" + nameValue + "']";
        delete(path);
    }

    /* Access methods for container child: "web-configurator". */

    /**
     * Adds container entry "webConfigurator", using an existing object.
     * @param webConfigurator The object to add.
     * @return The added child.
     */
    public WebConfigurator addWebConfigurator(WebConfigurator webConfigurator)
            throws JNCException {
        this.webConfigurator = webConfigurator;
        insertChild(webConfigurator, childrenNames());
        return webConfigurator;
    }

    /**
     * Adds container entry "webConfigurator".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public WebConfigurator addWebConfigurator() throws JNCException {
        WebConfigurator webConfigurator = new WebConfigurator();
        this.webConfigurator = webConfigurator;
        insertChild(webConfigurator, childrenNames());
        return webConfigurator;
    }

    /**
     * Deletes container entry "webConfigurator".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteWebConfigurator() throws JNCException {
        this.webConfigurator = null;
        String path = "web-configurator";
        return delete(path);
    }

    /* Access methods for container child: "authentication". */

    /**
     * Adds container entry "authentication", using an existing object.
     * @param authentication The object to add.
     * @return The added child.
     */
    public Authentication addAuthentication(Authentication authentication)
            throws JNCException {
        this.authentication = authentication;
        insertChild(authentication, childrenNames());
        return authentication;
    }

    /**
     * Adds container entry "authentication".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Authentication addAuthentication() throws JNCException {
        Authentication authentication = new Authentication();
        this.authentication = authentication;
        insertChild(authentication, childrenNames());
        return authentication;
    }

    /**
     * Deletes container entry "authentication".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteAuthentication() throws JNCException {
        this.authentication = null;
        String path = "authentication";
        return delete(path);
    }

    /* Access methods for container child: "snmp". */

    /**
     * Adds container entry "snmp", using an existing object.
     * @param snmp The object to add.
     * @return The added child.
     */
    public Snmp addSnmp(Snmp snmp) throws JNCException {
        this.snmp = snmp;
        insertChild(snmp, childrenNames());
        return snmp;
    }

    /**
     * Adds container entry "snmp".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Snmp addSnmp() throws JNCException {
        Snmp snmp = new Snmp();
        this.snmp = snmp;
        insertChild(snmp, childrenNames());
        return snmp;
    }

    /**
     * Deletes container entry "snmp".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteSnmp() throws JNCException {
        this.snmp = null;
        String path = "snmp";
        return delete(path);
    }

    /* Access methods for container child: "netconf". */

    /**
     * Adds container entry "netconf", using an existing object.
     * @param netconf The object to add.
     * @return The added child.
     */
    public Netconf addNetconf(Netconf netconf) throws JNCException {
        this.netconf = netconf;
        insertChild(netconf, childrenNames());
        return netconf;
    }

    /**
     * Adds container entry "netconf".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Netconf addNetconf() throws JNCException {
        Netconf netconf = new Netconf();
        this.netconf = netconf;
        insertChild(netconf, childrenNames());
        return netconf;
    }

    /**
     * Deletes container entry "netconf".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteNetconf() throws JNCException {
        this.netconf = null;
        String path = "netconf";
        return delete(path);
    }

    /* Access methods for container child: "date-time". */

    /**
     * Adds container entry "dateTime", using an existing object.
     * @param dateTime The object to add.
     * @return The added child.
     */
    public DateTime addDateTime(DateTime dateTime) throws JNCException {
        this.dateTime = dateTime;
        insertChild(dateTime, childrenNames());
        return dateTime;
    }

    /**
     * Adds container entry "dateTime".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public DateTime addDateTime() throws JNCException {
        DateTime dateTime = new DateTime();
        this.dateTime = dateTime;
        insertChild(dateTime, childrenNames());
        return dateTime;
    }

    /**
     * Deletes container entry "dateTime".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteDateTime() throws JNCException {
        this.dateTime = null;
        String path = "date-time";
        return delete(path);
    }

    /* Access methods for container child: "trace". */

    /**
     * Adds container entry "trace", using an existing object.
     * @param trace The object to add.
     * @return The added child.
     */
    public Trace addTrace(Trace trace) throws JNCException {
        this.trace = trace;
        insertChild(trace, childrenNames());
        return trace;
    }

    /**
     * Adds container entry "trace".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Trace addTrace() throws JNCException {
        Trace trace = new Trace();
        this.trace = trace;
        insertChild(trace, childrenNames());
        return trace;
    }

    /**
     * Deletes container entry "trace".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteTrace() throws JNCException {
        this.trace = null;
        String path = "trace";
        return delete(path);
    }

    /* Access methods for container child: "system". */

    /**
     * Adds container entry "system", using an existing object.
     * @param system The object to add.
     * @return The added child.
     */
    public System addSystem(System system) throws JNCException {
        this.system = system;
        insertChild(system, childrenNames());
        return system;
    }

    /**
     * Adds container entry "system".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public System addSystem() throws JNCException {
        System system = new System();
        this.system = system;
        insertChild(system, childrenNames());
        return system;
    }

    /**
     * Deletes container entry "system".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteSystem() throws JNCException {
        this.system = null;
        String path = "system";
        return delete(path);
    }

    /* Access methods for list child: "route". */

    /**
     * Gets list entry "route", with specified keys.
     * @param nameValue Key argument of child.
     */
    public Route getRoute(YangString nameValue) throws JNCException {
        String path = "route[name='" + nameValue + "']";
        return (Route)searchOne(path);
    }

    /**
     * Gets list entry "route", with specified keys.
     * The keys are specified as strings.
     * @param nameValue Key argument of child.
     */
    public Route getRoute(String nameValue) throws JNCException {
        String path = "route[name='" + nameValue + "']";
        return (Route)searchOne(path);
    }

    /**
     * Iterator method for the list "route".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator<Route> routeIterator() {
        return new ElementChildrenIterator(children, "route");
    }

    /**
     * Adds list entry "route", using an existing object.
     * @param route The object to add.
     * @return The added child.
     */
    public Route addRoute(Route route) throws JNCException {
        insertChild(route, childrenNames());
        return route;
    }

    /**
     * Adds list entry "route", with specified keys.
     * @param nameValue Key argument of child.
     * @return The added child.
     */
    public Route addRoute(YangString nameValue) throws JNCException {
        Route route = new Route(nameValue);
        return addRoute(route);
    }

    /**
     * Adds list entry "route", with specified keys.
     * The keys are specified as strings.
     * @param nameValue Key argument of child.
     * @return The added child.
     */
    public Route addRoute(String nameValue) throws JNCException {
        Route route = new Route(nameValue);
        return addRoute(route);
    }

    /**
     * Adds list entry "route".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Route addRoute() throws JNCException {
        Route route = new Route();
        insertChild(route, childrenNames());
        return route;
    }

    /**
     * Deletes list entry "route", with specified keys.
     * @param nameValue Key argument of child.
     */
    public void deleteRoute(YangString nameValue) throws JNCException {
        String path = "route[name='" + nameValue + "']";
        delete(path);
    }

    /**
     * Deletes list entry "route", with specified keys.
     * The keys are specified as strings.
     * @param nameValue Key argument of child.
     */
    public void deleteRoute(String nameValue) throws JNCException {
        String path = "route[name='" + nameValue + "']";
        delete(path);
    }

    @Override
    public boolean hasLists() {
        return true;
    }

    @Override
    public List<NodeSet> getLists() throws JNCException {
        List<NodeSet> lists = new LinkedList<>();
        lists.add(get("interface"));
        lists.add(get("route"));
        return lists;
    }

    /**
     * Support method for addChild.
     * Adds a child to this object.
     * 
     * @param child The child to add
     */
    public void addChild(Element child) {
        super.addChild(child);
        if (child instanceof ConfigDescription) configDescription = (ConfigDescription)child;
        else if (child instanceof WebConfigurator) webConfigurator = (WebConfigurator)child;
        else if (child instanceof Authentication) authentication = (Authentication)child;
        else if (child instanceof Snmp) snmp = (Snmp)child;
        else if (child instanceof Netconf) netconf = (Netconf)child;
        else if (child instanceof DateTime) dateTime = (DateTime)child;
        else if (child instanceof Trace) trace = (Trace)child;
        else if (child instanceof System) system = (System)child;
    }

}
