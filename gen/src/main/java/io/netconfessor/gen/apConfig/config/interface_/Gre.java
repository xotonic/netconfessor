
package io.netconfessor.gen.apConfig.config.interface_;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.NodeSet;
import io.netconfessor.YangContainer;
import io.netconfessor.YangElement;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.config.interface_.gre.Basic;
import io.netconfessor.gen.apConfig.config.interface_.gre.Linkname;
import io.netconfessor.gen.apConfig.config.interface_.gre.Remote;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Gre extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "basic".
     */
    public Basic basic = null;

    /**
     * Field for child leaf "remote".
     */
    public Remote remote = null;

    /**
     * Field for child leaf "linkname".
     */
    public Linkname linkname = null;

    /**
     * Constructor for an empty Gre object.
     */
    public Gre() {
        super(ApConfigSchema.NAMESPACE, "gre");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Gre clone() {
        return (Gre)cloneContent(new Gre());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Gre cloneShallow() {
        return (Gre)cloneShallowContent(new Gre());
    }

    public Gre cloneWithoutChildren() {
        return new Gre();
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
            "basic",
            "remote",
            "linkname",
        };
    }

    /* Access methods for optional leaf child: "basic". */

    /**
     * Adds leaf entry "basic", using an existing object.
     * @param basic The object to add.
     * @return The added child.
     */
    public Basic addBasic(Basic basic) throws JNCException {
        this.basic = basic;
        insertChild(basic, childrenNames());
        return basic;
    }

    /**
     * Adds leaf entry "basic".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Basic addBasic() throws JNCException {
        Basic basic = new Basic();
        this.basic = basic;
        insertChild(basic, childrenNames());
        return basic;
    }

    /**
     * Deletes leaf entry "basic".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteBasic() throws JNCException {
        this.basic = null;
        String path = "basic";
        return delete(path);
    }

    /* Access methods for optional leaf child: "remote". */

    /**
     * Adds leaf entry "remote", using an existing object.
     * @param remote The object to add.
     * @return The added child.
     */
    public Remote addRemote(Remote remote) throws JNCException {
        this.remote = remote;
        insertChild(remote, childrenNames());
        return remote;
    }

    /**
     * Adds leaf entry "remote".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Remote addRemote() throws JNCException {
        Remote remote = new Remote();
        this.remote = remote;
        insertChild(remote, childrenNames());
        return remote;
    }

    /**
     * Deletes leaf entry "remote".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteRemote() throws JNCException {
        this.remote = null;
        String path = "remote";
        return delete(path);
    }

    /* Access methods for optional leaf child: "linkname". */

    /**
     * Adds leaf entry "linkname", using an existing object.
     * @param linkname The object to add.
     * @return The added child.
     */
    public Linkname addLinkname(Linkname linkname) throws JNCException {
        this.linkname = linkname;
        insertChild(linkname, childrenNames());
        return linkname;
    }

    /**
     * Adds leaf entry "linkname".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Linkname addLinkname() throws JNCException {
        Linkname linkname = new Linkname();
        this.linkname = linkname;
        insertChild(linkname, childrenNames());
        return linkname;
    }

    /**
     * Deletes leaf entry "linkname".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteLinkname() throws JNCException {
        this.linkname = null;
        String path = "linkname";
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
        if (child instanceof Basic) basic = (Basic)child;
        else if (child instanceof Remote) remote = (Remote)child;
        else if (child instanceof Linkname) linkname = (Linkname)child;
    }

}
