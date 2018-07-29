
package com.netconfessor.gen.apConfig.monitoring;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.monitoring.wanStatus.IpAddress;
import com.netconfessor.gen.apConfig.monitoring.wanStatus.JInterface;
import com.netconfessor.gen.apConfig.monitoring.wanStatus.Protocol;
import com.netconfessor.gen.apConfig.monitoring.wanStatus.RxBytes;
import com.netconfessor.gen.apConfig.monitoring.wanStatus.TxBytes;

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
public class WanStatus extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "interface".
     */
    public JInterface interface_ = null;

    /**
     * Field for child leaf "protocol".
     */
    public Protocol protocol = null;

    /**
     * Field for child leaf "ip-address".
     */
    public IpAddress ipAddress = null;

    /**
     * Field for child leaf "tx-bytes".
     */
    public TxBytes txBytes = null;

    /**
     * Field for child leaf "rx-bytes".
     */
    public RxBytes rxBytes = null;

    /**
     * Constructor for an empty WanStatus object.
     */
    public WanStatus() {
        super(ApConfigSchema.NAMESPACE, "wan-status");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public WanStatus clone() {
        return (WanStatus)cloneContent(new WanStatus());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public WanStatus cloneShallow() {
        return (WanStatus)cloneShallowContent(new WanStatus());
    }

    public WanStatus cloneWithoutChildren() {
        return new WanStatus();
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
            "interface",
            "protocol",
            "ip-address",
            "tx-bytes",
            "rx-bytes",
        };
    }

    /* Access methods for optional leaf child: "interface". */

    /**
     * Adds leaf entry "interface_", using an existing object.
     * @param interface_ The object to add.
     * @return The added child.
     */
    public JInterface addJInterface(JInterface interface_) throws JNCException {
        this.interface_ = interface_;
        insertChild(interface_, childrenNames());
        return interface_;
    }

    /**
     * Adds leaf entry "interface_".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public JInterface addJInterface() throws JNCException {
        JInterface interface_ = new JInterface();
        this.interface_ = interface_;
        insertChild(interface_, childrenNames());
        return interface_;
    }

    /**
     * Deletes leaf entry "interface_".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteJInterface() throws JNCException {
        this.interface_ = null;
        String path = "interface";
        return delete(path);
    }

    /* Access methods for optional leaf child: "protocol". */

    /**
     * Adds leaf entry "protocol", using an existing object.
     * @param protocol The object to add.
     * @return The added child.
     */
    public Protocol addProtocol(Protocol protocol) throws JNCException {
        this.protocol = protocol;
        insertChild(protocol, childrenNames());
        return protocol;
    }

    /**
     * Adds leaf entry "protocol".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Protocol addProtocol() throws JNCException {
        Protocol protocol = new Protocol();
        this.protocol = protocol;
        insertChild(protocol, childrenNames());
        return protocol;
    }

    /**
     * Deletes leaf entry "protocol".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteProtocol() throws JNCException {
        this.protocol = null;
        String path = "protocol";
        return delete(path);
    }

    /* Access methods for optional leaf child: "ip-address". */

    /**
     * Adds leaf entry "ipAddress", using an existing object.
     * @param ipAddress The object to add.
     * @return The added child.
     */
    public IpAddress addIpAddress(IpAddress ipAddress) throws JNCException {
        this.ipAddress = ipAddress;
        insertChild(ipAddress, childrenNames());
        return ipAddress;
    }

    /**
     * Adds leaf entry "ipAddress".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public IpAddress addIpAddress() throws JNCException {
        IpAddress ipAddress = new IpAddress();
        this.ipAddress = ipAddress;
        insertChild(ipAddress, childrenNames());
        return ipAddress;
    }

    /**
     * Deletes leaf entry "ipAddress".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteIpAddress() throws JNCException {
        this.ipAddress = null;
        String path = "ip-address";
        return delete(path);
    }

    /* Access methods for optional leaf child: "tx-bytes". */

    /**
     * Adds leaf entry "txBytes", using an existing object.
     * @param txBytes The object to add.
     * @return The added child.
     */
    public TxBytes addTxBytes(TxBytes txBytes) throws JNCException {
        this.txBytes = txBytes;
        insertChild(txBytes, childrenNames());
        return txBytes;
    }

    /**
     * Adds leaf entry "txBytes".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public TxBytes addTxBytes() throws JNCException {
        TxBytes txBytes = new TxBytes();
        this.txBytes = txBytes;
        insertChild(txBytes, childrenNames());
        return txBytes;
    }

    /**
     * Deletes leaf entry "txBytes".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteTxBytes() throws JNCException {
        this.txBytes = null;
        String path = "tx-bytes";
        return delete(path);
    }

    /* Access methods for optional leaf child: "rx-bytes". */

    /**
     * Adds leaf entry "rxBytes", using an existing object.
     * @param rxBytes The object to add.
     * @return The added child.
     */
    public RxBytes addRxBytes(RxBytes rxBytes) throws JNCException {
        this.rxBytes = rxBytes;
        insertChild(rxBytes, childrenNames());
        return rxBytes;
    }

    /**
     * Adds leaf entry "rxBytes".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public RxBytes addRxBytes() throws JNCException {
        RxBytes rxBytes = new RxBytes();
        this.rxBytes = rxBytes;
        insertChild(rxBytes, childrenNames());
        return rxBytes;
    }

    /**
     * Deletes leaf entry "rxBytes".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteRxBytes() throws JNCException {
        this.rxBytes = null;
        String path = "rx-bytes";
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
        if (child instanceof JInterface) interface_ = (JInterface)child;
        else if (child instanceof Protocol) protocol = (Protocol)child;
        else if (child instanceof IpAddress) ipAddress = (IpAddress)child;
        else if (child instanceof TxBytes) txBytes = (TxBytes)child;
        else if (child instanceof RxBytes) rxBytes = (RxBytes)child;
    }

}
