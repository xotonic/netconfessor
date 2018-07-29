
package io.netconfessor.gen.apConfig.config;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.NodeSet;
import io.netconfessor.YangElement;
import io.netconfessor.YangString;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.config.interface_.Bridge;
import io.netconfessor.gen.apConfig.config.interface_.Common;
import io.netconfessor.gen.apConfig.config.interface_.Eth;
import io.netconfessor.gen.apConfig.config.interface_.Gre;
import io.netconfessor.gen.apConfig.config.interface_.Name;
import io.netconfessor.gen.apConfig.config.interface_.Vap;
import io.netconfessor.gen.apConfig.config.interface_.Vlan;
import io.netconfessor.gen.apConfig.config.interface_.Wlan;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class JInterface extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "name".
     */
    public Name name = null;

    /**
     * Field for child container "common".
     */
    public Common common = null;

    /**
     * Field for child container "eth".
     */
    public Eth eth = null;

    /**
     * Field for child container "bridge".
     */
    public Bridge bridge = null;

    /**
     * Field for child container "gre".
     */
    public Gre gre = null;

    /**
     * Field for child container "vlan".
     */
    public Vlan vlan = null;

    /**
     * Field for child container "vap".
     */
    public Vap vap = null;

    /**
     * Field for child container "wlan".
     */
    public Wlan wlan = null;

    /**
     * Constructor for an empty JInterface object.
     */
    public JInterface() {
        super(ApConfigSchema.NAMESPACE, "interface");
    }

    /**
     * Constructor for an initialized JInterface object,
     * 
     * @param nameValue Key argument of child.
     */
    public JInterface(YangString nameValue) throws JNCException {
        super(ApConfigSchema.NAMESPACE, "interface");
        Name name = new Name();
        name.setValue(nameValue);
        this.name = name;
        insertChild(name, childrenNames());
    }

    /**
     * Constructor for an initialized JInterface object,
     * with String keys.
     * @param nameValue Key argument of child.
     */
    public JInterface(String nameValue) throws JNCException {
        super(ApConfigSchema.NAMESPACE, "interface");
        Name name = new Name();
        name.setValue(new YangString(nameValue));
        this.name = name;
        insertChild(name, childrenNames());
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public JInterface clone() {
        JInterface copy;
        try {
            copy = new JInterface(name.getValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (JInterface)cloneContent(copy);
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public JInterface cloneShallow() {
        JInterface copy;
        try {
            copy = new JInterface(name.getValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (JInterface)cloneShallowContent(copy);
    }

    public JInterface cloneWithoutChildren() {
        return new JInterface();
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
            "common",
            "eth",
            "bridge",
            "gre",
            "vlan",
            "vap",
            "wlan",
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

    /* Access methods for container child: "common". */

    /**
     * Adds container entry "common", using an existing object.
     * @param common The object to add.
     * @return The added child.
     */
    public Common addCommon(Common common) throws JNCException {
        this.common = common;
        insertChild(common, childrenNames());
        return common;
    }

    /**
     * Adds container entry "common".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Common addCommon() throws JNCException {
        Common common = new Common();
        this.common = common;
        insertChild(common, childrenNames());
        return common;
    }

    /**
     * Deletes container entry "common".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteCommon() throws JNCException {
        this.common = null;
        String path = "common";
        return delete(path);
    }

    /* Access methods for container child: "eth". */

    /**
     * Adds container entry "eth", using an existing object.
     * @param eth The object to add.
     * @return The added child.
     */
    public Eth addEth(Eth eth) throws JNCException {
        this.eth = eth;
        insertChild(eth, childrenNames());
        return eth;
    }

    /**
     * Adds container entry "eth".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Eth addEth() throws JNCException {
        Eth eth = new Eth();
        this.eth = eth;
        insertChild(eth, childrenNames());
        return eth;
    }

    /**
     * Deletes container entry "eth".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteEth() throws JNCException {
        this.eth = null;
        String path = "eth";
        return delete(path);
    }

    /* Access methods for container child: "bridge". */

    /**
     * Adds container entry "bridge", using an existing object.
     * @param bridge The object to add.
     * @return The added child.
     */
    public Bridge addBridge(Bridge bridge) throws JNCException {
        this.bridge = bridge;
        insertChild(bridge, childrenNames());
        return bridge;
    }

    /**
     * Adds container entry "bridge".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Bridge addBridge() throws JNCException {
        Bridge bridge = new Bridge();
        this.bridge = bridge;
        insertChild(bridge, childrenNames());
        return bridge;
    }

    /**
     * Deletes container entry "bridge".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteBridge() throws JNCException {
        this.bridge = null;
        String path = "bridge";
        return delete(path);
    }

    /* Access methods for container child: "gre". */

    /**
     * Adds container entry "gre", using an existing object.
     * @param gre The object to add.
     * @return The added child.
     */
    public Gre addGre(Gre gre) throws JNCException {
        this.gre = gre;
        insertChild(gre, childrenNames());
        return gre;
    }

    /**
     * Adds container entry "gre".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Gre addGre() throws JNCException {
        Gre gre = new Gre();
        this.gre = gre;
        insertChild(gre, childrenNames());
        return gre;
    }

    /**
     * Deletes container entry "gre".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteGre() throws JNCException {
        this.gre = null;
        String path = "gre";
        return delete(path);
    }

    /* Access methods for container child: "vlan". */

    /**
     * Adds container entry "vlan", using an existing object.
     * @param vlan The object to add.
     * @return The added child.
     */
    public Vlan addVlan(Vlan vlan) throws JNCException {
        this.vlan = vlan;
        insertChild(vlan, childrenNames());
        return vlan;
    }

    /**
     * Adds container entry "vlan".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Vlan addVlan() throws JNCException {
        Vlan vlan = new Vlan();
        this.vlan = vlan;
        insertChild(vlan, childrenNames());
        return vlan;
    }

    /**
     * Deletes container entry "vlan".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteVlan() throws JNCException {
        this.vlan = null;
        String path = "vlan";
        return delete(path);
    }

    /* Access methods for container child: "vap". */

    /**
     * Adds container entry "vap", using an existing object.
     * @param vap The object to add.
     * @return The added child.
     */
    public Vap addVap(Vap vap) throws JNCException {
        this.vap = vap;
        insertChild(vap, childrenNames());
        return vap;
    }

    /**
     * Adds container entry "vap".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Vap addVap() throws JNCException {
        Vap vap = new Vap();
        this.vap = vap;
        insertChild(vap, childrenNames());
        return vap;
    }

    /**
     * Deletes container entry "vap".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteVap() throws JNCException {
        this.vap = null;
        String path = "vap";
        return delete(path);
    }

    /* Access methods for container child: "wlan". */

    /**
     * Adds container entry "wlan", using an existing object.
     * @param wlan The object to add.
     * @return The added child.
     */
    public Wlan addWlan(Wlan wlan) throws JNCException {
        this.wlan = wlan;
        insertChild(wlan, childrenNames());
        return wlan;
    }

    /**
     * Adds container entry "wlan".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Wlan addWlan() throws JNCException {
        Wlan wlan = new Wlan();
        this.wlan = wlan;
        insertChild(wlan, childrenNames());
        return wlan;
    }

    /**
     * Deletes container entry "wlan".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteWlan() throws JNCException {
        this.wlan = null;
        String path = "wlan";
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
        else if (child instanceof Common) common = (Common)child;
        else if (child instanceof Eth) eth = (Eth)child;
        else if (child instanceof Bridge) bridge = (Bridge)child;
        else if (child instanceof Gre) gre = (Gre)child;
        else if (child instanceof Vlan) vlan = (Vlan)child;
        else if (child instanceof Vap) vap = (Vap)child;
        else if (child instanceof Wlan) wlan = (Wlan)child;
    }

}
