
package io.netconfessor.gen.apConfig.config.interface_.wlan.radio;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.NodeSet;
import io.netconfessor.YangContainer;
import io.netconfessor.YangElement;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.EdcaAp;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.EdcaSta;
import io.netconfessor.gen.apConfig.config.interface_.wlan.radio.qos.Enable;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Qos extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "enable".
     */
    public Enable enable = null;

    /**
     * Field for child container "edca-ap".
     */
    public EdcaAp edcaAp = null;

    /**
     * Field for child container "edca-sta".
     */
    public EdcaSta edcaSta = null;

    /**
     * Constructor for an empty Qos object.
     */
    public Qos() {
        super(ApConfigSchema.NAMESPACE, "qos");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Qos clone() {
        return (Qos)cloneContent(new Qos());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Qos cloneShallow() {
        return (Qos)cloneShallowContent(new Qos());
    }

    public Qos cloneWithoutChildren() {
        return new Qos();
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
            "edca-ap",
            "edca-sta",
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

    /* Access methods for container child: "edca-ap". */

    /**
     * Adds container entry "edcaAp", using an existing object.
     * @param edcaAp The object to add.
     * @return The added child.
     */
    public EdcaAp addEdcaAp(EdcaAp edcaAp) throws JNCException {
        this.edcaAp = edcaAp;
        insertChild(edcaAp, childrenNames());
        return edcaAp;
    }

    /**
     * Adds container entry "edcaAp".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public EdcaAp addEdcaAp() throws JNCException {
        EdcaAp edcaAp = new EdcaAp();
        this.edcaAp = edcaAp;
        insertChild(edcaAp, childrenNames());
        return edcaAp;
    }

    /**
     * Deletes container entry "edcaAp".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteEdcaAp() throws JNCException {
        this.edcaAp = null;
        String path = "edca-ap";
        return delete(path);
    }

    /* Access methods for container child: "edca-sta". */

    /**
     * Adds container entry "edcaSta", using an existing object.
     * @param edcaSta The object to add.
     * @return The added child.
     */
    public EdcaSta addEdcaSta(EdcaSta edcaSta) throws JNCException {
        this.edcaSta = edcaSta;
        insertChild(edcaSta, childrenNames());
        return edcaSta;
    }

    /**
     * Adds container entry "edcaSta".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public EdcaSta addEdcaSta() throws JNCException {
        EdcaSta edcaSta = new EdcaSta();
        this.edcaSta = edcaSta;
        insertChild(edcaSta, childrenNames());
        return edcaSta;
    }

    /**
     * Deletes container entry "edcaSta".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteEdcaSta() throws JNCException {
        this.edcaSta = null;
        String path = "edca-sta";
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
        else if (child instanceof EdcaAp) edcaAp = (EdcaAp)child;
        else if (child instanceof EdcaSta) edcaSta = (EdcaSta)child;
    }

}
