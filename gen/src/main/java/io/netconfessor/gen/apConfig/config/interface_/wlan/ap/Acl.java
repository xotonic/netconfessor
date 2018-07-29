
package io.netconfessor.gen.apConfig.config.interface_.wlan.ap;

import io.netconfessor.Element;
import io.netconfessor.ElementChildrenIterator;
import io.netconfessor.JNCException;
import io.netconfessor.NodeSet;
import io.netconfessor.YangContainer;
import io.netconfessor.YangElement;
import io.netconfessor.YangString;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.acl.Mac;
import io.netconfessor.gen.apConfig.config.interface_.wlan.ap.acl.Mode;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Acl extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "mode".
     */
    public Mode mode = null;

    /**
     * Constructor for an empty Acl object.
     */
    public Acl() {
        super(ApConfigSchema.NAMESPACE, "acl");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Acl clone() {
        return (Acl)cloneContent(new Acl());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Acl cloneShallow() {
        return (Acl)cloneShallowContent(new Acl());
    }

    public Acl cloneWithoutChildren() {
        return new Acl();
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
            "mode",
            "mac",
        };
    }

    /* Access methods for optional leaf child: "mode". */

    /**
     * Adds leaf entry "mode", using an existing object.
     * @param mode The object to add.
     * @return The added child.
     */
    public Mode addMode(Mode mode) throws JNCException {
        this.mode = mode;
        insertChild(mode, childrenNames());
        return mode;
    }

    /**
     * Adds leaf entry "mode".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Mode addMode() throws JNCException {
        Mode mode = new Mode();
        this.mode = mode;
        insertChild(mode, childrenNames());
        return mode;
    }

    /**
     * Deletes leaf entry "mode".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteMode() throws JNCException {
        this.mode = null;
        String path = "mode";
        return delete(path);
    }

    /* Access methods for list child: "mac". */

    /**
     * Gets list entry "mac", with specified keys.
     * @param nameValue Key argument of child.
     */
    public Mac getMac(YangString nameValue) throws JNCException {
        String path = "mac[name='" + nameValue + "']";
        return (Mac)searchOne(path);
    }

    /**
     * Gets list entry "mac", with specified keys.
     * The keys are specified as strings.
     * @param nameValue Key argument of child.
     */
    public Mac getMac(String nameValue) throws JNCException {
        String path = "mac[name='" + nameValue + "']";
        return (Mac)searchOne(path);
    }

    /**
     * Iterator method for the list "mac".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator<Mac> macIterator() {
        return new ElementChildrenIterator(children, "mac");
    }

    /**
     * Adds list entry "mac", using an existing object.
     * @param mac The object to add.
     * @return The added child.
     */
    public Mac addMac(Mac mac) throws JNCException {
        insertChild(mac, childrenNames());
        return mac;
    }

    /**
     * Adds list entry "mac", with specified keys.
     * @param nameValue Key argument of child.
     * @return The added child.
     */
    public Mac addMac(YangString nameValue) throws JNCException {
        Mac mac = new Mac(nameValue);
        return addMac(mac);
    }

    /**
     * Adds list entry "mac", with specified keys.
     * The keys are specified as strings.
     * @param nameValue Key argument of child.
     * @return The added child.
     */
    public Mac addMac(String nameValue) throws JNCException {
        Mac mac = new Mac(nameValue);
        return addMac(mac);
    }

    /**
     * Adds list entry "mac".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Mac addMac() throws JNCException {
        Mac mac = new Mac();
        insertChild(mac, childrenNames());
        return mac;
    }

    /**
     * Deletes list entry "mac", with specified keys.
     * @param nameValue Key argument of child.
     */
    public void deleteMac(YangString nameValue) throws JNCException {
        String path = "mac[name='" + nameValue + "']";
        delete(path);
    }

    /**
     * Deletes list entry "mac", with specified keys.
     * The keys are specified as strings.
     * @param nameValue Key argument of child.
     */
    public void deleteMac(String nameValue) throws JNCException {
        String path = "mac[name='" + nameValue + "']";
        delete(path);
    }

    @Override
    public boolean hasLists() {
        return true;
    }

    @Override
    public List<NodeSet> getLists() throws JNCException {
        List<NodeSet> lists = new LinkedList<>();
        lists.add(get("mac"));
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
        if (child instanceof Mode) mode = (Mode)child;
    }

}
