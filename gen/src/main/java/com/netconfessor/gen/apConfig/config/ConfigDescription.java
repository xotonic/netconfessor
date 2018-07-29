
package com.netconfessor.gen.apConfig.config;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.config.configDescription.Version;

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
public class ConfigDescription extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "version".
     */
    public Version version = null;

    /**
     * Constructor for an empty ConfigDescription object.
     */
    public ConfigDescription() {
        super(ApConfigSchema.NAMESPACE, "config-description");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public ConfigDescription clone() {
        return (ConfigDescription)cloneContent(new ConfigDescription());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public ConfigDescription cloneShallow() {
        return (ConfigDescription)cloneShallowContent(new ConfigDescription());
    }

    public ConfigDescription cloneWithoutChildren() {
        return new ConfigDescription();
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
            "version",
        };
    }

    /* Access methods for optional leaf child: "version". */

    /**
     * Adds leaf entry "version", using an existing object.
     * @param version The object to add.
     * @return The added child.
     */
    public Version addVersion(Version version) throws JNCException {
        this.version = version;
        insertChild(version, childrenNames());
        return version;
    }

    /**
     * Adds leaf entry "version".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Version addVersion() throws JNCException {
        Version version = new Version();
        this.version = version;
        insertChild(version, childrenNames());
        return version;
    }

    /**
     * Deletes leaf entry "version".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteVersion() throws JNCException {
        this.version = null;
        String path = "version";
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
        if (child instanceof Version) version = (Version)child;
    }

}
