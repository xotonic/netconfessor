
package com.netconfessor.gen.apConfig.config;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.config.authentication.AdminPassword;

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
public class Authentication extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "admin-password".
     */
    public AdminPassword adminPassword = null;

    /**
     * Constructor for an empty Authentication object.
     */
    public Authentication() {
        super(ApConfigSchema.NAMESPACE, "authentication");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Authentication clone() {
        return (Authentication)cloneContent(new Authentication());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Authentication cloneShallow() {
        return (Authentication)cloneShallowContent(new Authentication());
    }

    public Authentication cloneWithoutChildren() {
        return new Authentication();
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
            "admin-password",
        };
    }

    /* Access methods for optional leaf child: "admin-password". */

    /**
     * Adds leaf entry "adminPassword", using an existing object.
     * @param adminPassword The object to add.
     * @return The added child.
     */
    public AdminPassword addAdminPassword(AdminPassword adminPassword)
            throws JNCException {
        this.adminPassword = adminPassword;
        insertChild(adminPassword, childrenNames());
        return adminPassword;
    }

    /**
     * Adds leaf entry "adminPassword".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public AdminPassword addAdminPassword() throws JNCException {
        AdminPassword adminPassword = new AdminPassword();
        this.adminPassword = adminPassword;
        insertChild(adminPassword, childrenNames());
        return adminPassword;
    }

    /**
     * Deletes leaf entry "adminPassword".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteAdminPassword() throws JNCException {
        this.adminPassword = null;
        String path = "admin-password";
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
        if (child instanceof AdminPassword) adminPassword = (AdminPassword)child;
    }

}
