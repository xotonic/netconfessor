
package io.netconfessor.gen.apConfig.config.interface_.wlan.radio;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.NodeSet;
import io.netconfessor.YangContainer;
import io.netconfessor.YangElement;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.Basic;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.rates.Supported;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Rates extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child container "basic".
     */
    public Basic basic = null;

    /**
     * Field for child container "supported".
     */
    public Supported supported = null;

    /**
     * Constructor for an empty Rates object.
     */
    public Rates() {
        super(ApConfigSchema.NAMESPACE, "rates");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Rates clone() {
        return (Rates)cloneContent(new Rates());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Rates cloneShallow() {
        return (Rates)cloneShallowContent(new Rates());
    }

    public Rates cloneWithoutChildren() {
        return new Rates();
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
            "supported",
        };
    }

    /* Access methods for container child: "basic". */

    /**
     * Adds container entry "basic", using an existing object.
     * @param basic The object to add.
     * @return The added child.
     */
    public Basic addBasic(Basic basic) throws JNCException {
        this.basic = basic;
        insertChild(basic, childrenNames());
        return basic;
    }

    /**
     * Adds container entry "basic".
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
     * Deletes container entry "basic".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteBasic() throws JNCException {
        this.basic = null;
        String path = "basic";
        return delete(path);
    }

    /* Access methods for container child: "supported". */

    /**
     * Adds container entry "supported", using an existing object.
     * @param supported The object to add.
     * @return The added child.
     */
    public Supported addSupported(Supported supported) throws JNCException {
        this.supported = supported;
        insertChild(supported, childrenNames());
        return supported;
    }

    /**
     * Adds container entry "supported".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Supported addSupported() throws JNCException {
        Supported supported = new Supported();
        this.supported = supported;
        insertChild(supported, childrenNames());
        return supported;
    }

    /**
     * Deletes container entry "supported".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteSupported() throws JNCException {
        this.supported = null;
        String path = "supported";
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
        else if (child instanceof Supported) supported = (Supported)child;
    }

}
