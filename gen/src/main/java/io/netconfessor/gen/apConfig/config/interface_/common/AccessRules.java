
package io.netconfessor.gen.apConfig.config.interface_.common;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.NodeSet;
import io.netconfessor.YangContainer;
import io.netconfessor.YangElement;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.config.interface_.common.accessRules.Netconf;
import io.netconfessor.gen.apConfig.config.interface_.common.accessRules.Snmp;
import io.netconfessor.gen.apConfig.config.interface_.common.accessRules.Ssh;
import io.netconfessor.gen.apConfig.config.interface_.common.accessRules.Telnet;
import io.netconfessor.gen.apConfig.config.interface_.common.accessRules.Web;
import io.netconfessor.gen.apConfig.config.interface_.common.accessRules.WebHttps;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class AccessRules extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "telnet".
     */
    public Telnet telnet = null;

    /**
     * Field for child leaf "ssh".
     */
    public Ssh ssh = null;

    /**
     * Field for child leaf "snmp".
     */
    public Snmp snmp = null;

    /**
     * Field for child leaf "netconf".
     */
    public Netconf netconf = null;

    /**
     * Field for child leaf "web".
     */
    public Web web = null;

    /**
     * Field for child leaf "web-https".
     */
    public WebHttps webHttps = null;

    /**
     * Constructor for an empty AccessRules object.
     */
    public AccessRules() {
        super(ApConfigSchema.NAMESPACE, "access-rules");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public AccessRules clone() {
        return (AccessRules)cloneContent(new AccessRules());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public AccessRules cloneShallow() {
        return (AccessRules)cloneShallowContent(new AccessRules());
    }

    public AccessRules cloneWithoutChildren() {
        return new AccessRules();
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
            "telnet",
            "ssh",
            "snmp",
            "netconf",
            "web",
            "web-https",
        };
    }

    /* Access methods for optional leaf child: "telnet". */

    /**
     * Adds leaf entry "telnet", using an existing object.
     * @param telnet The object to add.
     * @return The added child.
     */
    public Telnet addTelnet(Telnet telnet) throws JNCException {
        this.telnet = telnet;
        insertChild(telnet, childrenNames());
        return telnet;
    }

    /**
     * Adds leaf entry "telnet".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Telnet addTelnet() throws JNCException {
        Telnet telnet = new Telnet();
        this.telnet = telnet;
        insertChild(telnet, childrenNames());
        return telnet;
    }

    /**
     * Deletes leaf entry "telnet".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteTelnet() throws JNCException {
        this.telnet = null;
        String path = "telnet";
        return delete(path);
    }

    /* Access methods for optional leaf child: "ssh". */

    /**
     * Adds leaf entry "ssh", using an existing object.
     * @param ssh The object to add.
     * @return The added child.
     */
    public Ssh addSsh(Ssh ssh) throws JNCException {
        this.ssh = ssh;
        insertChild(ssh, childrenNames());
        return ssh;
    }

    /**
     * Adds leaf entry "ssh".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Ssh addSsh() throws JNCException {
        Ssh ssh = new Ssh();
        this.ssh = ssh;
        insertChild(ssh, childrenNames());
        return ssh;
    }

    /**
     * Deletes leaf entry "ssh".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteSsh() throws JNCException {
        this.ssh = null;
        String path = "ssh";
        return delete(path);
    }

    /* Access methods for optional leaf child: "snmp". */

    /**
     * Adds leaf entry "snmp", using an existing object.
     * @param snmp The object to add.
     * @return The added child.
     */
    public Snmp addSnmp(Snmp snmp) throws JNCException {
        this.snmp = snmp;
        insertChild(snmp, childrenNames());
        return snmp;
    }

    /**
     * Adds leaf entry "snmp".
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
     * Deletes leaf entry "snmp".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteSnmp() throws JNCException {
        this.snmp = null;
        String path = "snmp";
        return delete(path);
    }

    /* Access methods for optional leaf child: "netconf". */

    /**
     * Adds leaf entry "netconf", using an existing object.
     * @param netconf The object to add.
     * @return The added child.
     */
    public Netconf addNetconf(Netconf netconf) throws JNCException {
        this.netconf = netconf;
        insertChild(netconf, childrenNames());
        return netconf;
    }

    /**
     * Adds leaf entry "netconf".
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
     * Deletes leaf entry "netconf".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteNetconf() throws JNCException {
        this.netconf = null;
        String path = "netconf";
        return delete(path);
    }

    /* Access methods for optional leaf child: "web". */

    /**
     * Adds leaf entry "web", using an existing object.
     * @param web The object to add.
     * @return The added child.
     */
    public Web addWeb(Web web) throws JNCException {
        this.web = web;
        insertChild(web, childrenNames());
        return web;
    }

    /**
     * Adds leaf entry "web".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Web addWeb() throws JNCException {
        Web web = new Web();
        this.web = web;
        insertChild(web, childrenNames());
        return web;
    }

    /**
     * Deletes leaf entry "web".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteWeb() throws JNCException {
        this.web = null;
        String path = "web";
        return delete(path);
    }

    /* Access methods for optional leaf child: "web-https". */

    /**
     * Adds leaf entry "webHttps", using an existing object.
     * @param webHttps The object to add.
     * @return The added child.
     */
    public WebHttps addWebHttps(WebHttps webHttps) throws JNCException {
        this.webHttps = webHttps;
        insertChild(webHttps, childrenNames());
        return webHttps;
    }

    /**
     * Adds leaf entry "webHttps".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public WebHttps addWebHttps() throws JNCException {
        WebHttps webHttps = new WebHttps();
        this.webHttps = webHttps;
        insertChild(webHttps, childrenNames());
        return webHttps;
    }

    /**
     * Deletes leaf entry "webHttps".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteWebHttps() throws JNCException {
        this.webHttps = null;
        String path = "web-https";
        return delete(path);
    }

    @Override
    public boolean hasLists() {
        return false;
    }

    @Override
    public List<NodeSet> getLists() throws JNCException {
        List<NodeSet> lists = new LinkedList<>();
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
        if (child instanceof Telnet) telnet = (Telnet)child;
        else if (child instanceof Ssh) ssh = (Ssh)child;
        else if (child instanceof Snmp) snmp = (Snmp)child;
        else if (child instanceof Netconf) netconf = (Netconf)child;
        else if (child instanceof Web) web = (Web)child;
        else if (child instanceof WebHttps) webHttps = (WebHttps)child;
    }

}
