
package com.netconfessor.gen.apConfig.config.interface_.wlan.sta;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.config.interface_.wlan.sta.radius.Password;
import com.netconfessor.gen.apConfig.config.interface_.wlan.sta.radius.Username;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.NodeSet;
import io.netconfessor.YangContainer;
import io.netconfessor.YangElement;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Radius extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "username".
     */
    public Username username = null;

    /**
     * Field for child leaf "password".
     */
    public Password password = null;

    /**
     * Constructor for an empty Radius object.
     */
    public Radius() {
        super(ApConfigSchema.NAMESPACE, "radius");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Radius clone() {
        return (Radius)cloneContent(new Radius());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Radius cloneShallow() {
        return (Radius)cloneShallowContent(new Radius());
    }

    public Radius cloneWithoutChildren() {
        return new Radius();
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
            "username",
            "password",
        };
    }

    /* Access methods for optional leaf child: "username". */

    /**
     * Adds leaf entry "username", using an existing object.
     * @param username The object to add.
     * @return The added child.
     */
    public Username addUsername(Username username) throws JNCException {
        this.username = username;
        insertChild(username, childrenNames());
        return username;
    }

    /**
     * Adds leaf entry "username".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Username addUsername() throws JNCException {
        Username username = new Username();
        this.username = username;
        insertChild(username, childrenNames());
        return username;
    }

    /**
     * Deletes leaf entry "username".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteUsername() throws JNCException {
        this.username = null;
        String path = "username";
        return delete(path);
    }

    /* Access methods for optional leaf child: "password". */

    /**
     * Adds leaf entry "password", using an existing object.
     * @param password The object to add.
     * @return The added child.
     */
    public Password addPassword(Password password) throws JNCException {
        this.password = password;
        insertChild(password, childrenNames());
        return password;
    }

    /**
     * Adds leaf entry "password".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Password addPassword() throws JNCException {
        Password password = new Password();
        this.password = password;
        insertChild(password, childrenNames());
        return password;
    }

    /**
     * Deletes leaf entry "password".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deletePassword() throws JNCException {
        this.password = null;
        String path = "password";
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
        if (child instanceof Username) username = (Username)child;
        else if (child instanceof Password) password = (Password)child;
    }

}
