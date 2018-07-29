
package io.netconfessor.gen.apConfig.config;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.NodeSet;
import io.netconfessor.YangContainer;
import io.netconfessor.YangElement;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.config.webConfigurator.Enable;
import io.netconfessor.gen.apConfig.config.webConfigurator.HttpPort;
import io.netconfessor.gen.apConfig.config.webConfigurator.HttpsPort;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class WebConfigurator extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "enable".
     */
    public Enable enable = null;

    /**
     * Field for child leaf "http-port".
     */
    public HttpPort httpPort = null;

    /**
     * Field for child leaf "https-port".
     */
    public HttpsPort httpsPort = null;

    /**
     * Constructor for an empty WebConfigurator object.
     */
    public WebConfigurator() {
        super(ApConfigSchema.NAMESPACE, "web-configurator");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public WebConfigurator clone() {
        return (WebConfigurator)cloneContent(new WebConfigurator());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public WebConfigurator cloneShallow() {
        return (WebConfigurator)cloneShallowContent(new WebConfigurator());
    }

    public WebConfigurator cloneWithoutChildren() {
        return new WebConfigurator();
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
            "enable",
            "http-port",
            "https-port",
        };
    }

    /* Access methods for optional leaf child: "enable". */

    /**
     * Adds leaf entry "enable", using an existing object.
     * @param enable The object to add.
     * @return The added child.
     */
    public Enable addEnable(Enable enable) throws JNCException {
        this.enable = enable;
        insertChild(enable, childrenNames());
        return enable;
    }

    /**
     * Adds leaf entry "enable".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Enable addEnable() throws JNCException {
        Enable enable = new Enable();
        this.enable = enable;
        insertChild(enable, childrenNames());
        return enable;
    }

    /**
     * Deletes leaf entry "enable".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteEnable() throws JNCException {
        this.enable = null;
        String path = "enable";
        return delete(path);
    }

    /* Access methods for optional leaf child: "http-port". */

    /**
     * Adds leaf entry "httpPort", using an existing object.
     * @param httpPort The object to add.
     * @return The added child.
     */
    public HttpPort addHttpPort(HttpPort httpPort) throws JNCException {
        this.httpPort = httpPort;
        insertChild(httpPort, childrenNames());
        return httpPort;
    }

    /**
     * Adds leaf entry "httpPort".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public HttpPort addHttpPort() throws JNCException {
        HttpPort httpPort = new HttpPort();
        this.httpPort = httpPort;
        insertChild(httpPort, childrenNames());
        return httpPort;
    }

    /**
     * Deletes leaf entry "httpPort".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteHttpPort() throws JNCException {
        this.httpPort = null;
        String path = "http-port";
        return delete(path);
    }

    /* Access methods for optional leaf child: "https-port". */

    /**
     * Adds leaf entry "httpsPort", using an existing object.
     * @param httpsPort The object to add.
     * @return The added child.
     */
    public HttpsPort addHttpsPort(HttpsPort httpsPort) throws JNCException {
        this.httpsPort = httpsPort;
        insertChild(httpsPort, childrenNames());
        return httpsPort;
    }

    /**
     * Adds leaf entry "httpsPort".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public HttpsPort addHttpsPort() throws JNCException {
        HttpsPort httpsPort = new HttpsPort();
        this.httpsPort = httpsPort;
        insertChild(httpsPort, childrenNames());
        return httpsPort;
    }

    /**
     * Deletes leaf entry "httpsPort".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteHttpsPort() throws JNCException {
        this.httpsPort = null;
        String path = "https-port";
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
        if (child instanceof Enable) enable = (Enable)child;
        else if (child instanceof HttpPort) httpPort = (HttpPort)child;
        else if (child instanceof HttpsPort) httpsPort = (HttpsPort)child;
    }

}
