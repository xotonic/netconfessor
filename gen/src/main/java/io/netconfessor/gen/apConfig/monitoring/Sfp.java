
package io.netconfessor.gen.apConfig.monitoring;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.NodeSet;
import io.netconfessor.YangContainer;
import io.netconfessor.YangElement;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.monitoring.sfp.Current;
import io.netconfessor.gen.apConfig.monitoring.sfp.I2cData;
import io.netconfessor.gen.apConfig.monitoring.sfp.Link;
import io.netconfessor.gen.apConfig.monitoring.sfp.Los;
import io.netconfessor.gen.apConfig.monitoring.sfp.Prx;
import io.netconfessor.gen.apConfig.monitoring.sfp.Ptx;
import io.netconfessor.gen.apConfig.monitoring.sfp.Speed;
import io.netconfessor.gen.apConfig.monitoring.sfp.Status;
import io.netconfessor.gen.apConfig.monitoring.sfp.Temperature;
import io.netconfessor.gen.apConfig.monitoring.sfp.TxFault;
import io.netconfessor.gen.apConfig.monitoring.sfp.Volt;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Sfp extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "status".
     */
    public Status status = null;

    /**
     * Field for child leaf "link".
     */
    public Link link = null;

    /**
     * Field for child leaf "tx-fault".
     */
    public TxFault txFault = null;

    /**
     * Field for child leaf "los".
     */
    public Los los = null;

    /**
     * Field for child leaf "i2c-data".
     */
    public I2cData i2cData = null;

    /**
     * Field for child leaf "speed".
     */
    public Speed speed = null;

    /**
     * Field for child leaf "volt".
     */
    public Volt volt = null;

    /**
     * Field for child leaf "temperature".
     */
    public Temperature temperature = null;

    /**
     * Field for child leaf "current".
     */
    public Current current = null;

    /**
     * Field for child leaf "ptx".
     */
    public Ptx ptx = null;

    /**
     * Field for child leaf "prx".
     */
    public Prx prx = null;

    /**
     * Constructor for an empty Sfp object.
     */
    public Sfp() {
        super(ApConfigSchema.NAMESPACE, "sfp");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Sfp clone() {
        return (Sfp)cloneContent(new Sfp());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Sfp cloneShallow() {
        return (Sfp)cloneShallowContent(new Sfp());
    }

    public Sfp cloneWithoutChildren() {
        return new Sfp();
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
            "status",
            "link",
            "tx-fault",
            "los",
            "i2c-data",
            "speed",
            "volt",
            "temperature",
            "current",
            "ptx",
            "prx",
        };
    }

    /* Access methods for optional leaf child: "status". */

    /**
     * Adds leaf entry "status", using an existing object.
     * @param status The object to add.
     * @return The added child.
     */
    public Status addStatus(Status status) throws JNCException {
        this.status = status;
        insertChild(status, childrenNames());
        return status;
    }

    /**
     * Adds leaf entry "status".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Status addStatus() throws JNCException {
        Status status = new Status();
        this.status = status;
        insertChild(status, childrenNames());
        return status;
    }

    /**
     * Deletes leaf entry "status".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteStatus() throws JNCException {
        this.status = null;
        String path = "status";
        return delete(path);
    }

    /* Access methods for optional leaf child: "link". */

    /**
     * Adds leaf entry "link", using an existing object.
     * @param link The object to add.
     * @return The added child.
     */
    public Link addLink(Link link) throws JNCException {
        this.link = link;
        insertChild(link, childrenNames());
        return link;
    }

    /**
     * Adds leaf entry "link".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Link addLink() throws JNCException {
        Link link = new Link();
        this.link = link;
        insertChild(link, childrenNames());
        return link;
    }

    /**
     * Deletes leaf entry "link".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteLink() throws JNCException {
        this.link = null;
        String path = "link";
        return delete(path);
    }

    /* Access methods for optional leaf child: "tx-fault". */

    /**
     * Adds leaf entry "txFault", using an existing object.
     * @param txFault The object to add.
     * @return The added child.
     */
    public TxFault addTxFault(TxFault txFault) throws JNCException {
        this.txFault = txFault;
        insertChild(txFault, childrenNames());
        return txFault;
    }

    /**
     * Adds leaf entry "txFault".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public TxFault addTxFault() throws JNCException {
        TxFault txFault = new TxFault();
        this.txFault = txFault;
        insertChild(txFault, childrenNames());
        return txFault;
    }

    /**
     * Deletes leaf entry "txFault".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteTxFault() throws JNCException {
        this.txFault = null;
        String path = "tx-fault";
        return delete(path);
    }

    /* Access methods for optional leaf child: "los". */

    /**
     * Adds leaf entry "los", using an existing object.
     * @param los The object to add.
     * @return The added child.
     */
    public Los addLos(Los los) throws JNCException {
        this.los = los;
        insertChild(los, childrenNames());
        return los;
    }

    /**
     * Adds leaf entry "los".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Los addLos() throws JNCException {
        Los los = new Los();
        this.los = los;
        insertChild(los, childrenNames());
        return los;
    }

    /**
     * Deletes leaf entry "los".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteLos() throws JNCException {
        this.los = null;
        String path = "los";
        return delete(path);
    }

    /* Access methods for optional leaf child: "i2c-data". */

    /**
     * Adds leaf entry "i2cData", using an existing object.
     * @param i2cData The object to add.
     * @return The added child.
     */
    public I2cData addI2cData(I2cData i2cData) throws JNCException {
        this.i2cData = i2cData;
        insertChild(i2cData, childrenNames());
        return i2cData;
    }

    /**
     * Adds leaf entry "i2cData".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public I2cData addI2cData() throws JNCException {
        I2cData i2cData = new I2cData();
        this.i2cData = i2cData;
        insertChild(i2cData, childrenNames());
        return i2cData;
    }

    /**
     * Deletes leaf entry "i2cData".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteI2cData() throws JNCException {
        this.i2cData = null;
        String path = "i2c-data";
        return delete(path);
    }

    /* Access methods for optional leaf child: "speed". */

    /**
     * Adds leaf entry "speed", using an existing object.
     * @param speed The object to add.
     * @return The added child.
     */
    public Speed addSpeed(Speed speed) throws JNCException {
        this.speed = speed;
        insertChild(speed, childrenNames());
        return speed;
    }

    /**
     * Adds leaf entry "speed".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Speed addSpeed() throws JNCException {
        Speed speed = new Speed();
        this.speed = speed;
        insertChild(speed, childrenNames());
        return speed;
    }

    /**
     * Deletes leaf entry "speed".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteSpeed() throws JNCException {
        this.speed = null;
        String path = "speed";
        return delete(path);
    }

    /* Access methods for optional leaf child: "volt". */

    /**
     * Adds leaf entry "volt", using an existing object.
     * @param volt The object to add.
     * @return The added child.
     */
    public Volt addVolt(Volt volt) throws JNCException {
        this.volt = volt;
        insertChild(volt, childrenNames());
        return volt;
    }

    /**
     * Adds leaf entry "volt".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Volt addVolt() throws JNCException {
        Volt volt = new Volt();
        this.volt = volt;
        insertChild(volt, childrenNames());
        return volt;
    }

    /**
     * Deletes leaf entry "volt".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteVolt() throws JNCException {
        this.volt = null;
        String path = "volt";
        return delete(path);
    }

    /* Access methods for optional leaf child: "temperature". */

    /**
     * Adds leaf entry "temperature", using an existing object.
     * @param temperature The object to add.
     * @return The added child.
     */
    public Temperature addTemperature(Temperature temperature)
            throws JNCException {
        this.temperature = temperature;
        insertChild(temperature, childrenNames());
        return temperature;
    }

    /**
     * Adds leaf entry "temperature".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Temperature addTemperature() throws JNCException {
        Temperature temperature = new Temperature();
        this.temperature = temperature;
        insertChild(temperature, childrenNames());
        return temperature;
    }

    /**
     * Deletes leaf entry "temperature".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteTemperature() throws JNCException {
        this.temperature = null;
        String path = "temperature";
        return delete(path);
    }

    /* Access methods for optional leaf child: "current". */

    /**
     * Adds leaf entry "current", using an existing object.
     * @param current The object to add.
     * @return The added child.
     */
    public Current addCurrent(Current current) throws JNCException {
        this.current = current;
        insertChild(current, childrenNames());
        return current;
    }

    /**
     * Adds leaf entry "current".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Current addCurrent() throws JNCException {
        Current current = new Current();
        this.current = current;
        insertChild(current, childrenNames());
        return current;
    }

    /**
     * Deletes leaf entry "current".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteCurrent() throws JNCException {
        this.current = null;
        String path = "current";
        return delete(path);
    }

    /* Access methods for optional leaf child: "ptx". */

    /**
     * Adds leaf entry "ptx", using an existing object.
     * @param ptx The object to add.
     * @return The added child.
     */
    public Ptx addPtx(Ptx ptx) throws JNCException {
        this.ptx = ptx;
        insertChild(ptx, childrenNames());
        return ptx;
    }

    /**
     * Adds leaf entry "ptx".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Ptx addPtx() throws JNCException {
        Ptx ptx = new Ptx();
        this.ptx = ptx;
        insertChild(ptx, childrenNames());
        return ptx;
    }

    /**
     * Deletes leaf entry "ptx".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deletePtx() throws JNCException {
        this.ptx = null;
        String path = "ptx";
        return delete(path);
    }

    /* Access methods for optional leaf child: "prx". */

    /**
     * Adds leaf entry "prx", using an existing object.
     * @param prx The object to add.
     * @return The added child.
     */
    public Prx addPrx(Prx prx) throws JNCException {
        this.prx = prx;
        insertChild(prx, childrenNames());
        return prx;
    }

    /**
     * Adds leaf entry "prx".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Prx addPrx() throws JNCException {
        Prx prx = new Prx();
        this.prx = prx;
        insertChild(prx, childrenNames());
        return prx;
    }

    /**
     * Deletes leaf entry "prx".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deletePrx() throws JNCException {
        this.prx = null;
        String path = "prx";
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
        if (child instanceof Status) status = (Status)child;
        else if (child instanceof Link) link = (Link)child;
        else if (child instanceof TxFault) txFault = (TxFault)child;
        else if (child instanceof Los) los = (Los)child;
        else if (child instanceof I2cData) i2cData = (I2cData)child;
        else if (child instanceof Speed) speed = (Speed)child;
        else if (child instanceof Volt) volt = (Volt)child;
        else if (child instanceof Temperature) temperature = (Temperature)child;
        else if (child instanceof Current) current = (Current)child;
        else if (child instanceof Ptx) ptx = (Ptx)child;
        else if (child instanceof Prx) prx = (Prx)child;
    }

}
