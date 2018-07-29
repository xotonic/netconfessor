
package io.netconfessor.gen.apConfig.config.dateTime;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.NodeSet;
import io.netconfessor.YangContainer;
import io.netconfessor.YangElement;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.config.dateTime.ntp.Server;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Ntp extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "server".
     */
    public Server server = null;

    /**
     * Constructor for an empty Ntp object.
     */
    public Ntp() {
        super(ApConfigSchema.NAMESPACE, "ntp");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Ntp clone() {
        return (Ntp)cloneContent(new Ntp());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Ntp cloneShallow() {
        return (Ntp)cloneShallowContent(new Ntp());
    }

    public Ntp cloneWithoutChildren() {
        return new Ntp();
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
            "server",
        };
    }

    /* Access methods for optional leaf child: "server". */

    /**
     * Adds leaf entry "server", using an existing object.
     * @param server The object to add.
     * @return The added child.
     */
    public Server addServer(Server server) throws JNCException {
        this.server = server;
        insertChild(server, childrenNames());
        return server;
    }

    /**
     * Adds leaf entry "server".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Server addServer() throws JNCException {
        Server server = new Server();
        this.server = server;
        insertChild(server, childrenNames());
        return server;
    }

    /**
     * Deletes leaf entry "server".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteServer() throws JNCException {
        this.server = null;
        String path = "server";
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
        if (child instanceof Server) server = (Server)child;
    }

}
