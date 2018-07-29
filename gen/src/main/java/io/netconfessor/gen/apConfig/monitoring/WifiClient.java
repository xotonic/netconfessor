
package io.netconfessor.gen.apConfig.monitoring;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.NodeSet;
import io.netconfessor.YangElement;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.monitoring.wifiClient.HwAddr;
import io.netconfessor.gen.apConfig.monitoring.wifiClient.Name;
import io.netconfessor.gen.apConfig.monitoring.wifiClient.Rssi;
import io.netconfessor.gen.apConfig.monitoring.wifiClient.RxBw;
import io.netconfessor.gen.apConfig.monitoring.wifiClient.RxBytes;
import io.netconfessor.gen.apConfig.monitoring.wifiClient.RxPackets;
import io.netconfessor.gen.apConfig.monitoring.wifiClient.RxRate;
import io.netconfessor.gen.apConfig.monitoring.wifiClient.Snr;
import io.netconfessor.gen.apConfig.monitoring.wifiClient.TxBw;
import io.netconfessor.gen.apConfig.monitoring.wifiClient.TxBytes;
import io.netconfessor.gen.apConfig.monitoring.wifiClient.TxPackets;
import io.netconfessor.gen.apConfig.monitoring.wifiClient.TxRate;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class WifiClient extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "name".
     */
    public Name name = null;

    /**
     * Field for child leaf "hw-addr".
     */
    public HwAddr hwAddr = null;

    /**
     * Field for child leaf "rssi".
     */
    public Rssi rssi = null;

    /**
     * Field for child leaf "snr".
     */
    public Snr snr = null;

    /**
     * Field for child leaf "tx-rate".
     */
    public TxRate txRate = null;

    /**
     * Field for child leaf "rx-rate".
     */
    public RxRate rxRate = null;

    /**
     * Field for child leaf "tx-bw".
     */
    public TxBw txBw = null;

    /**
     * Field for child leaf "rx-bw".
     */
    public RxBw rxBw = null;

    /**
     * Field for child leaf "tx-bytes".
     */
    public TxBytes txBytes = null;

    /**
     * Field for child leaf "rx-bytes".
     */
    public RxBytes rxBytes = null;

    /**
     * Field for child leaf "tx-packets".
     */
    public TxPackets txPackets = null;

    /**
     * Field for child leaf "rx-packets".
     */
    public RxPackets rxPackets = null;

    /**
     * Constructor for an empty WifiClient object.
     */
    public WifiClient() {
        super(ApConfigSchema.NAMESPACE, "wifi-client");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public WifiClient clone() {
        return (WifiClient)cloneContent(new WifiClient());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public WifiClient cloneShallow() {
        return (WifiClient)cloneShallowContent(new WifiClient());
    }

    public WifiClient cloneWithoutChildren() {
        return new WifiClient();
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
            "name",
            "hw-addr",
            "rssi",
            "snr",
            "tx-rate",
            "rx-rate",
            "tx-bw",
            "rx-bw",
            "tx-bytes",
            "rx-bytes",
            "tx-packets",
            "rx-packets",
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

    /* Access methods for optional leaf child: "hw-addr". */

    /**
     * Adds leaf entry "hwAddr", using an existing object.
     * @param hwAddr The object to add.
     * @return The added child.
     */
    public HwAddr addHwAddr(HwAddr hwAddr) throws JNCException {
        this.hwAddr = hwAddr;
        insertChild(hwAddr, childrenNames());
        return hwAddr;
    }

    /**
     * Adds leaf entry "hwAddr".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public HwAddr addHwAddr() throws JNCException {
        HwAddr hwAddr = new HwAddr();
        this.hwAddr = hwAddr;
        insertChild(hwAddr, childrenNames());
        return hwAddr;
    }

    /**
     * Deletes leaf entry "hwAddr".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteHwAddr() throws JNCException {
        this.hwAddr = null;
        String path = "hw-addr";
        return delete(path);
    }

    /* Access methods for optional leaf child: "rssi". */

    /**
     * Adds leaf entry "rssi", using an existing object.
     * @param rssi The object to add.
     * @return The added child.
     */
    public Rssi addRssi(Rssi rssi) throws JNCException {
        this.rssi = rssi;
        insertChild(rssi, childrenNames());
        return rssi;
    }

    /**
     * Adds leaf entry "rssi".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Rssi addRssi() throws JNCException {
        Rssi rssi = new Rssi();
        this.rssi = rssi;
        insertChild(rssi, childrenNames());
        return rssi;
    }

    /**
     * Deletes leaf entry "rssi".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteRssi() throws JNCException {
        this.rssi = null;
        String path = "rssi";
        return delete(path);
    }

    /* Access methods for optional leaf child: "snr". */

    /**
     * Adds leaf entry "snr", using an existing object.
     * @param snr The object to add.
     * @return The added child.
     */
    public Snr addSnr(Snr snr) throws JNCException {
        this.snr = snr;
        insertChild(snr, childrenNames());
        return snr;
    }

    /**
     * Adds leaf entry "snr".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Snr addSnr() throws JNCException {
        Snr snr = new Snr();
        this.snr = snr;
        insertChild(snr, childrenNames());
        return snr;
    }

    /**
     * Deletes leaf entry "snr".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteSnr() throws JNCException {
        this.snr = null;
        String path = "snr";
        return delete(path);
    }

    /* Access methods for optional leaf child: "tx-rate". */

    /**
     * Adds leaf entry "txRate", using an existing object.
     * @param txRate The object to add.
     * @return The added child.
     */
    public TxRate addTxRate(TxRate txRate) throws JNCException {
        this.txRate = txRate;
        insertChild(txRate, childrenNames());
        return txRate;
    }

    /**
     * Adds leaf entry "txRate".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public TxRate addTxRate() throws JNCException {
        TxRate txRate = new TxRate();
        this.txRate = txRate;
        insertChild(txRate, childrenNames());
        return txRate;
    }

    /**
     * Deletes leaf entry "txRate".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteTxRate() throws JNCException {
        this.txRate = null;
        String path = "tx-rate";
        return delete(path);
    }

    /* Access methods for optional leaf child: "rx-rate". */

    /**
     * Adds leaf entry "rxRate", using an existing object.
     * @param rxRate The object to add.
     * @return The added child.
     */
    public RxRate addRxRate(RxRate rxRate) throws JNCException {
        this.rxRate = rxRate;
        insertChild(rxRate, childrenNames());
        return rxRate;
    }

    /**
     * Adds leaf entry "rxRate".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public RxRate addRxRate() throws JNCException {
        RxRate rxRate = new RxRate();
        this.rxRate = rxRate;
        insertChild(rxRate, childrenNames());
        return rxRate;
    }

    /**
     * Deletes leaf entry "rxRate".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteRxRate() throws JNCException {
        this.rxRate = null;
        String path = "rx-rate";
        return delete(path);
    }

    /* Access methods for optional leaf child: "tx-bw". */

    /**
     * Adds leaf entry "txBw", using an existing object.
     * @param txBw The object to add.
     * @return The added child.
     */
    public TxBw addTxBw(TxBw txBw) throws JNCException {
        this.txBw = txBw;
        insertChild(txBw, childrenNames());
        return txBw;
    }

    /**
     * Adds leaf entry "txBw".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public TxBw addTxBw() throws JNCException {
        TxBw txBw = new TxBw();
        this.txBw = txBw;
        insertChild(txBw, childrenNames());
        return txBw;
    }

    /**
     * Deletes leaf entry "txBw".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteTxBw() throws JNCException {
        this.txBw = null;
        String path = "tx-bw";
        return delete(path);
    }

    /* Access methods for optional leaf child: "rx-bw". */

    /**
     * Adds leaf entry "rxBw", using an existing object.
     * @param rxBw The object to add.
     * @return The added child.
     */
    public RxBw addRxBw(RxBw rxBw) throws JNCException {
        this.rxBw = rxBw;
        insertChild(rxBw, childrenNames());
        return rxBw;
    }

    /**
     * Adds leaf entry "rxBw".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public RxBw addRxBw() throws JNCException {
        RxBw rxBw = new RxBw();
        this.rxBw = rxBw;
        insertChild(rxBw, childrenNames());
        return rxBw;
    }

    /**
     * Deletes leaf entry "rxBw".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteRxBw() throws JNCException {
        this.rxBw = null;
        String path = "rx-bw";
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

    /* Access methods for optional leaf child: "tx-packets". */

    /**
     * Adds leaf entry "txPackets", using an existing object.
     * @param txPackets The object to add.
     * @return The added child.
     */
    public TxPackets addTxPackets(TxPackets txPackets) throws JNCException {
        this.txPackets = txPackets;
        insertChild(txPackets, childrenNames());
        return txPackets;
    }

    /**
     * Adds leaf entry "txPackets".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public TxPackets addTxPackets() throws JNCException {
        TxPackets txPackets = new TxPackets();
        this.txPackets = txPackets;
        insertChild(txPackets, childrenNames());
        return txPackets;
    }

    /**
     * Deletes leaf entry "txPackets".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteTxPackets() throws JNCException {
        this.txPackets = null;
        String path = "tx-packets";
        return delete(path);
    }

    /* Access methods for optional leaf child: "rx-packets". */

    /**
     * Adds leaf entry "rxPackets", using an existing object.
     * @param rxPackets The object to add.
     * @return The added child.
     */
    public RxPackets addRxPackets(RxPackets rxPackets) throws JNCException {
        this.rxPackets = rxPackets;
        insertChild(rxPackets, childrenNames());
        return rxPackets;
    }

    /**
     * Adds leaf entry "rxPackets".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public RxPackets addRxPackets() throws JNCException {
        RxPackets rxPackets = new RxPackets();
        this.rxPackets = rxPackets;
        insertChild(rxPackets, childrenNames());
        return rxPackets;
    }

    /**
     * Deletes leaf entry "rxPackets".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteRxPackets() throws JNCException {
        this.rxPackets = null;
        String path = "rx-packets";
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
        else if (child instanceof HwAddr) hwAddr = (HwAddr)child;
        else if (child instanceof Rssi) rssi = (Rssi)child;
        else if (child instanceof Snr) snr = (Snr)child;
        else if (child instanceof TxRate) txRate = (TxRate)child;
        else if (child instanceof RxRate) rxRate = (RxRate)child;
        else if (child instanceof TxBw) txBw = (TxBw)child;
        else if (child instanceof RxBw) rxBw = (RxBw)child;
        else if (child instanceof TxBytes) txBytes = (TxBytes)child;
        else if (child instanceof RxBytes) rxBytes = (RxBytes)child;
        else if (child instanceof TxPackets) txPackets = (TxPackets)child;
        else if (child instanceof RxPackets) rxPackets = (RxPackets)child;
    }

}
