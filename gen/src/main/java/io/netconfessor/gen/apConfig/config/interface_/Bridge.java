
package io.netconfessor.gen.apConfig.config.interface_;

import io.netconfessor.Element;
import io.netconfessor.ElementChildrenIterator;
import io.netconfessor.JNCException;
import io.netconfessor.NodeSet;
import io.netconfessor.YangContainer;
import io.netconfessor.YangElement;
import io.netconfessor.YangString;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.config.interface_.bridge.Port;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Bridge extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty Bridge object.
     */
    public Bridge() {
        super(ApConfigSchema.NAMESPACE, "bridge");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Bridge clone() {
        return (Bridge)cloneContent(new Bridge());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Bridge cloneShallow() {
        return (Bridge)cloneShallowContent(new Bridge());
    }

    public Bridge cloneWithoutChildren() {
        return new Bridge();
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
            "port",
        };
    }

    /* Access methods for list child: "port". */

    /**
     * Gets list entry "port", with specified keys.
     * @param nameValue Key argument of child.
     */
    public Port getPort(YangString nameValue) throws JNCException {
        String path = "port[name='" + nameValue + "']";
        return (Port)searchOne(path);
    }

    /**
     * Gets list entry "port", with specified keys.
     * The keys are specified as strings.
     * @param nameValue Key argument of child.
     */
    public Port getPort(String nameValue) throws JNCException {
        String path = "port[name='" + nameValue + "']";
        return (Port)searchOne(path);
    }

    /**
     * Iterator method for the list "port".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator<Port> portIterator() {
        return new ElementChildrenIterator(children, "port");
    }

    /**
     * Adds list entry "port", using an existing object.
     * @param port The object to add.
     * @return The added child.
     */
    public Port addPort(Port port) throws JNCException {
        insertChild(port, childrenNames());
        return port;
    }

    /**
     * Adds list entry "port", with specified keys.
     * @param nameValue Key argument of child.
     * @return The added child.
     */
    public Port addPort(YangString nameValue) throws JNCException {
        Port port = new Port(nameValue);
        return addPort(port);
    }

    /**
     * Adds list entry "port", with specified keys.
     * The keys are specified as strings.
     * @param nameValue Key argument of child.
     * @return The added child.
     */
    public Port addPort(String nameValue) throws JNCException {
        Port port = new Port(nameValue);
        return addPort(port);
    }

    /**
     * Adds list entry "port".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Port addPort() throws JNCException {
        Port port = new Port();
        insertChild(port, childrenNames());
        return port;
    }

    /**
     * Deletes list entry "port", with specified keys.
     * @param nameValue Key argument of child.
     */
    public void deletePort(YangString nameValue) throws JNCException {
        String path = "port[name='" + nameValue + "']";
        delete(path);
    }

    /**
     * Deletes list entry "port", with specified keys.
     * The keys are specified as strings.
     * @param nameValue Key argument of child.
     */
    public void deletePort(String nameValue) throws JNCException {
        String path = "port[name='" + nameValue + "']";
        delete(path);
    }

    @Override
    public boolean hasLists() {
        return true;
    }

    @Override
    public List<NodeSet> getLists() throws JNCException {
        List<NodeSet> lists = new LinkedList<>();
        lists.add(get("port"));
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
    }

}
