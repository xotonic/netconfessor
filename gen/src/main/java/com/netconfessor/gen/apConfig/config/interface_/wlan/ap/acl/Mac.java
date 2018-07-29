
package com.netconfessor.gen.apConfig.config.interface_.wlan.ap.acl;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.config.interface_.wlan.ap.acl.mac.Name;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.NodeSet;
import io.netconfessor.YangElement;
import io.netconfessor.YangString;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Mac extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "name".
     */
    public Name name = null;

    /**
     * Constructor for an empty Mac object.
     */
    public Mac() {
        super(ApConfigSchema.NAMESPACE, "mac");
    }

    /**
     * Constructor for an initialized Mac object,
     * 
     * @param nameValue Key argument of child.
     */
    public Mac(YangString nameValue) throws JNCException {
        super(ApConfigSchema.NAMESPACE, "mac");
        Name name = new Name();
        name.setValue(nameValue);
        this.name = name;
        insertChild(name, childrenNames());
    }

    /**
     * Constructor for an initialized Mac object,
     * with String keys.
     * @param nameValue Key argument of child.
     */
    public Mac(String nameValue) throws JNCException {
        super(ApConfigSchema.NAMESPACE, "mac");
        Name name = new Name();
        name.setValue(new YangString(nameValue));
        this.name = name;
        insertChild(name, childrenNames());
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Mac clone() {
        Mac copy;
        try {
            copy = new Mac(name.getValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (Mac)cloneContent(copy);
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Mac cloneShallow() {
        Mac copy;
        try {
            copy = new Mac(name.getValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (Mac)cloneShallowContent(copy);
    }

    public Mac cloneWithoutChildren() {
        return new Mac();
    }

    /**
     * @return An array with the identifiers of any key children
     */
    public String[] keyNames() {
        return new String[] {
            "name",
        };
    }

    /**
     * @return An array with the identifiers of any children, in order.
     */
    public String[] childrenNames() {
        return new String[] {
            "name",
        };
    }

    /* Access methods for leaf child: "name". */

    /**
     * Adds leaf entry "name", using an existing object.
     * @param name The object to add.
     * @return The added child.
     */
    public Name addName(Name name) throws JNCException {
        this.name = name;
        insertChild(name, childrenNames());
        return name;
    }

    /**
     * Adds leaf entry "name".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Name addName() throws JNCException {
        Name name = new Name();
        this.name = name;
        insertChild(name, childrenNames());
        return name;
    }

    /**
     * Deletes leaf entry "name".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteName() throws JNCException {
        this.name = null;
        String path = "name";
        return delete(path);
    }

    /**
     * Support method for addChild.
     * Adds a child to this object.
     * 
     * @param child The child to add
     */
    public void addChild(Element child) {
        super.addChild(child);
        if (child instanceof Name) name = (Name)child;
    }

}
