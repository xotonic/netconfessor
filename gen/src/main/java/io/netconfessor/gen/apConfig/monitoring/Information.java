
package io.netconfessor.gen.apConfig.monitoring;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.NodeSet;
import io.netconfessor.YangContainer;
import io.netconfessor.YangElement;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.monitoring.information.BoardType;
import io.netconfessor.gen.apConfig.monitoring.information.BootVersion;
import io.netconfessor.gen.apConfig.monitoring.information.FactoryLanMac;
import io.netconfessor.gen.apConfig.monitoring.information.FactorySerialNumber;
import io.netconfessor.gen.apConfig.monitoring.information.FactoryWanMac;
import io.netconfessor.gen.apConfig.monitoring.information.HwPlatform;
import io.netconfessor.gen.apConfig.monitoring.information.HwRevision;
import io.netconfessor.gen.apConfig.monitoring.information.InternetConnectionStatus;
import io.netconfessor.gen.apConfig.monitoring.information.SecondarySoftwareVersion;
import io.netconfessor.gen.apConfig.monitoring.information.SoftwareVersion;
import io.netconfessor.gen.apConfig.monitoring.information.SystemTime;
import io.netconfessor.gen.apConfig.monitoring.information.Uptime;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Information extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "system-time".
     */
    public SystemTime systemTime = null;

    /**
     * Field for child leaf "uptime".
     */
    public Uptime uptime = null;

    /**
     * Field for child leaf "software-version".
     */
    public SoftwareVersion softwareVersion = null;

    /**
     * Field for child leaf "secondary-software-version".
     */
    public SecondarySoftwareVersion secondarySoftwareVersion = null;

    /**
     * Field for child leaf "boot-version".
     */
    public BootVersion bootVersion = null;

    /**
     * Field for child leaf "board-type".
     */
    public BoardType boardType = null;

    /**
     * Field for child leaf "hw-platform".
     */
    public HwPlatform hwPlatform = null;

    /**
     * Field for child leaf "factory-wan-mac".
     */
    public FactoryWanMac factoryWanMac = null;

    /**
     * Field for child leaf "factory-lan-mac".
     */
    public FactoryLanMac factoryLanMac = null;

    /**
     * Field for child leaf "factory-serial-number".
     */
    public FactorySerialNumber factorySerialNumber = null;

    /**
     * Field for child leaf "hw-revision".
     */
    public HwRevision hwRevision = null;

    /**
     * Field for child leaf "internet-connection-status".
     */
    public InternetConnectionStatus internetConnectionStatus = null;

    /**
     * Constructor for an empty Information object.
     */
    public Information() {
        super(ApConfigSchema.NAMESPACE, "information");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Information clone() {
        return (Information)cloneContent(new Information());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Information cloneShallow() {
        return (Information)cloneShallowContent(new Information());
    }

    public Information cloneWithoutChildren() {
        return new Information();
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
            "system-time",
            "uptime",
            "software-version",
            "secondary-software-version",
            "boot-version",
            "board-type",
            "hw-platform",
            "factory-wan-mac",
            "factory-lan-mac",
            "factory-serial-number",
            "hw-revision",
            "internet-connection-status",
        };
    }

    /* Access methods for optional leaf child: "system-time". */

    /**
     * Adds leaf entry "systemTime", using an existing object.
     * @param systemTime The object to add.
     * @return The added child.
     */
    public SystemTime addSystemTime(SystemTime systemTime) throws JNCException {
        this.systemTime = systemTime;
        insertChild(systemTime, childrenNames());
        return systemTime;
    }

    /**
     * Adds leaf entry "systemTime".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public SystemTime addSystemTime() throws JNCException {
        SystemTime systemTime = new SystemTime();
        this.systemTime = systemTime;
        insertChild(systemTime, childrenNames());
        return systemTime;
    }

    /**
     * Deletes leaf entry "systemTime".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteSystemTime() throws JNCException {
        this.systemTime = null;
        String path = "system-time";
        return delete(path);
    }

    /* Access methods for optional leaf child: "uptime". */

    /**
     * Adds leaf entry "uptime", using an existing object.
     * @param uptime The object to add.
     * @return The added child.
     */
    public Uptime addUptime(Uptime uptime) throws JNCException {
        this.uptime = uptime;
        insertChild(uptime, childrenNames());
        return uptime;
    }

    /**
     * Adds leaf entry "uptime".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Uptime addUptime() throws JNCException {
        Uptime uptime = new Uptime();
        this.uptime = uptime;
        insertChild(uptime, childrenNames());
        return uptime;
    }

    /**
     * Deletes leaf entry "uptime".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteUptime() throws JNCException {
        this.uptime = null;
        String path = "uptime";
        return delete(path);
    }

    /* Access methods for optional leaf child: "software-version". */

    /**
     * Adds leaf entry "softwareVersion", using an existing object.
     * @param softwareVersion The object to add.
     * @return The added child.
     */
    public SoftwareVersion addSoftwareVersion(SoftwareVersion softwareVersion)
            throws JNCException {
        this.softwareVersion = softwareVersion;
        insertChild(softwareVersion, childrenNames());
        return softwareVersion;
    }

    /**
     * Adds leaf entry "softwareVersion".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public SoftwareVersion addSoftwareVersion() throws JNCException {
        SoftwareVersion softwareVersion = new SoftwareVersion();
        this.softwareVersion = softwareVersion;
        insertChild(softwareVersion, childrenNames());
        return softwareVersion;
    }

    /**
     * Deletes leaf entry "softwareVersion".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteSoftwareVersion() throws JNCException {
        this.softwareVersion = null;
        String path = "software-version";
        return delete(path);
    }

    /* Access methods for optional leaf child: "secondary-software-version". */

    /**
     * Adds leaf entry "secondarySoftwareVersion", using an existing object.
     * @param secondarySoftwareVersion The object to add.
     * @return The added child.
     */
    public SecondarySoftwareVersion addSecondarySoftwareVersion(SecondarySoftwareVersion secondarySoftwareVersion)
            throws JNCException {
        this.secondarySoftwareVersion = secondarySoftwareVersion;
        insertChild(secondarySoftwareVersion, childrenNames());
        return secondarySoftwareVersion;
    }

    /**
     * Adds leaf entry "secondarySoftwareVersion".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public SecondarySoftwareVersion addSecondarySoftwareVersion()
            throws JNCException {
        SecondarySoftwareVersion secondarySoftwareVersion = new SecondarySoftwareVersion();
        this.secondarySoftwareVersion = secondarySoftwareVersion;
        insertChild(secondarySoftwareVersion, childrenNames());
        return secondarySoftwareVersion;
    }

    /**
     * Deletes leaf entry "secondarySoftwareVersion".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteSecondarySoftwareVersion() throws JNCException {
        this.secondarySoftwareVersion = null;
        String path = "secondary-software-version";
        return delete(path);
    }

    /* Access methods for optional leaf child: "boot-version". */

    /**
     * Adds leaf entry "bootVersion", using an existing object.
     * @param bootVersion The object to add.
     * @return The added child.
     */
    public BootVersion addBootVersion(BootVersion bootVersion)
            throws JNCException {
        this.bootVersion = bootVersion;
        insertChild(bootVersion, childrenNames());
        return bootVersion;
    }

    /**
     * Adds leaf entry "bootVersion".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public BootVersion addBootVersion() throws JNCException {
        BootVersion bootVersion = new BootVersion();
        this.bootVersion = bootVersion;
        insertChild(bootVersion, childrenNames());
        return bootVersion;
    }

    /**
     * Deletes leaf entry "bootVersion".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteBootVersion() throws JNCException {
        this.bootVersion = null;
        String path = "boot-version";
        return delete(path);
    }

    /* Access methods for optional leaf child: "board-type". */

    /**
     * Adds leaf entry "boardType", using an existing object.
     * @param boardType The object to add.
     * @return The added child.
     */
    public BoardType addBoardType(BoardType boardType) throws JNCException {
        this.boardType = boardType;
        insertChild(boardType, childrenNames());
        return boardType;
    }

    /**
     * Adds leaf entry "boardType".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public BoardType addBoardType() throws JNCException {
        BoardType boardType = new BoardType();
        this.boardType = boardType;
        insertChild(boardType, childrenNames());
        return boardType;
    }

    /**
     * Deletes leaf entry "boardType".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteBoardType() throws JNCException {
        this.boardType = null;
        String path = "board-type";
        return delete(path);
    }

    /* Access methods for optional leaf child: "hw-platform". */

    /**
     * Adds leaf entry "hwPlatform", using an existing object.
     * @param hwPlatform The object to add.
     * @return The added child.
     */
    public HwPlatform addHwPlatform(HwPlatform hwPlatform) throws JNCException {
        this.hwPlatform = hwPlatform;
        insertChild(hwPlatform, childrenNames());
        return hwPlatform;
    }

    /**
     * Adds leaf entry "hwPlatform".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public HwPlatform addHwPlatform() throws JNCException {
        HwPlatform hwPlatform = new HwPlatform();
        this.hwPlatform = hwPlatform;
        insertChild(hwPlatform, childrenNames());
        return hwPlatform;
    }

    /**
     * Deletes leaf entry "hwPlatform".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteHwPlatform() throws JNCException {
        this.hwPlatform = null;
        String path = "hw-platform";
        return delete(path);
    }

    /* Access methods for optional leaf child: "factory-wan-mac". */

    /**
     * Adds leaf entry "factoryWanMac", using an existing object.
     * @param factoryWanMac The object to add.
     * @return The added child.
     */
    public FactoryWanMac addFactoryWanMac(FactoryWanMac factoryWanMac)
            throws JNCException {
        this.factoryWanMac = factoryWanMac;
        insertChild(factoryWanMac, childrenNames());
        return factoryWanMac;
    }

    /**
     * Adds leaf entry "factoryWanMac".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public FactoryWanMac addFactoryWanMac() throws JNCException {
        FactoryWanMac factoryWanMac = new FactoryWanMac();
        this.factoryWanMac = factoryWanMac;
        insertChild(factoryWanMac, childrenNames());
        return factoryWanMac;
    }

    /**
     * Deletes leaf entry "factoryWanMac".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteFactoryWanMac() throws JNCException {
        this.factoryWanMac = null;
        String path = "factory-wan-mac";
        return delete(path);
    }

    /* Access methods for optional leaf child: "factory-lan-mac". */

    /**
     * Adds leaf entry "factoryLanMac", using an existing object.
     * @param factoryLanMac The object to add.
     * @return The added child.
     */
    public FactoryLanMac addFactoryLanMac(FactoryLanMac factoryLanMac)
            throws JNCException {
        this.factoryLanMac = factoryLanMac;
        insertChild(factoryLanMac, childrenNames());
        return factoryLanMac;
    }

    /**
     * Adds leaf entry "factoryLanMac".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public FactoryLanMac addFactoryLanMac() throws JNCException {
        FactoryLanMac factoryLanMac = new FactoryLanMac();
        this.factoryLanMac = factoryLanMac;
        insertChild(factoryLanMac, childrenNames());
        return factoryLanMac;
    }

    /**
     * Deletes leaf entry "factoryLanMac".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteFactoryLanMac() throws JNCException {
        this.factoryLanMac = null;
        String path = "factory-lan-mac";
        return delete(path);
    }

    /* Access methods for optional leaf child: "factory-serial-number". */

    /**
     * Adds leaf entry "factorySerialNumber", using an existing object.
     * @param factorySerialNumber The object to add.
     * @return The added child.
     */
    public FactorySerialNumber addFactorySerialNumber(FactorySerialNumber factorySerialNumber)
            throws JNCException {
        this.factorySerialNumber = factorySerialNumber;
        insertChild(factorySerialNumber, childrenNames());
        return factorySerialNumber;
    }

    /**
     * Adds leaf entry "factorySerialNumber".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public FactorySerialNumber addFactorySerialNumber() throws JNCException {
        FactorySerialNumber factorySerialNumber = new FactorySerialNumber();
        this.factorySerialNumber = factorySerialNumber;
        insertChild(factorySerialNumber, childrenNames());
        return factorySerialNumber;
    }

    /**
     * Deletes leaf entry "factorySerialNumber".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteFactorySerialNumber() throws JNCException {
        this.factorySerialNumber = null;
        String path = "factory-serial-number";
        return delete(path);
    }

    /* Access methods for optional leaf child: "hw-revision". */

    /**
     * Adds leaf entry "hwRevision", using an existing object.
     * @param hwRevision The object to add.
     * @return The added child.
     */
    public HwRevision addHwRevision(HwRevision hwRevision) throws JNCException {
        this.hwRevision = hwRevision;
        insertChild(hwRevision, childrenNames());
        return hwRevision;
    }

    /**
     * Adds leaf entry "hwRevision".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public HwRevision addHwRevision() throws JNCException {
        HwRevision hwRevision = new HwRevision();
        this.hwRevision = hwRevision;
        insertChild(hwRevision, childrenNames());
        return hwRevision;
    }

    /**
     * Deletes leaf entry "hwRevision".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteHwRevision() throws JNCException {
        this.hwRevision = null;
        String path = "hw-revision";
        return delete(path);
    }

    /* Access methods for optional leaf child: "internet-connection-status". */

    /**
     * Adds leaf entry "internetConnectionStatus", using an existing object.
     * @param internetConnectionStatus The object to add.
     * @return The added child.
     */
    public InternetConnectionStatus addInternetConnectionStatus(InternetConnectionStatus internetConnectionStatus)
            throws JNCException {
        this.internetConnectionStatus = internetConnectionStatus;
        insertChild(internetConnectionStatus, childrenNames());
        return internetConnectionStatus;
    }

    /**
     * Adds leaf entry "internetConnectionStatus".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public InternetConnectionStatus addInternetConnectionStatus()
            throws JNCException {
        InternetConnectionStatus internetConnectionStatus = new InternetConnectionStatus();
        this.internetConnectionStatus = internetConnectionStatus;
        insertChild(internetConnectionStatus, childrenNames());
        return internetConnectionStatus;
    }

    /**
     * Deletes leaf entry "internetConnectionStatus".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteInternetConnectionStatus() throws JNCException {
        this.internetConnectionStatus = null;
        String path = "internet-connection-status";
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
        if (child instanceof SystemTime) systemTime = (SystemTime)child;
        else if (child instanceof Uptime) uptime = (Uptime)child;
        else if (child instanceof SoftwareVersion) softwareVersion = (SoftwareVersion)child;
        else if (child instanceof SecondarySoftwareVersion) secondarySoftwareVersion = (SecondarySoftwareVersion)child;
        else if (child instanceof BootVersion) bootVersion = (BootVersion)child;
        else if (child instanceof BoardType) boardType = (BoardType)child;
        else if (child instanceof HwPlatform) hwPlatform = (HwPlatform)child;
        else if (child instanceof FactoryWanMac) factoryWanMac = (FactoryWanMac)child;
        else if (child instanceof FactoryLanMac) factoryLanMac = (FactoryLanMac)child;
        else if (child instanceof FactorySerialNumber) factorySerialNumber = (FactorySerialNumber)child;
        else if (child instanceof HwRevision) hwRevision = (HwRevision)child;
        else if (child instanceof InternetConnectionStatus) internetConnectionStatus = (InternetConnectionStatus)child;
    }

}
