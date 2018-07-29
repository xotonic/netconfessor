
package com.netconfessor.gen.apConfig.config.interface_.vap;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.config.interface_.vap.radius.AcctAddress;
import com.netconfessor.gen.apConfig.config.interface_.vap.radius.AcctEnable;
import com.netconfessor.gen.apConfig.config.interface_.vap.radius.AcctInterval;
import com.netconfessor.gen.apConfig.config.interface_.vap.radius.AcctPassword;
import com.netconfessor.gen.apConfig.config.interface_.vap.radius.AcctPeriodic;
import com.netconfessor.gen.apConfig.config.interface_.vap.radius.AcctPort;
import com.netconfessor.gen.apConfig.config.interface_.vap.radius.AuthAddress;
import com.netconfessor.gen.apConfig.config.interface_.vap.radius.AuthPassword;
import com.netconfessor.gen.apConfig.config.interface_.vap.radius.AuthPort;
import com.netconfessor.gen.apConfig.config.interface_.vap.radius.Domain;

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
public class Radius extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "auth-port".
     */
    public AuthPort authPort = null;

    /**
     * Field for child leaf "auth-address".
     */
    public AuthAddress authAddress = null;

    /**
     * Field for child leaf "auth-password".
     */
    public AuthPassword authPassword = null;

    /**
     * Field for child leaf "acct-enable".
     */
    public AcctEnable acctEnable = null;

    /**
     * Field for child leaf "acct-port".
     */
    public AcctPort acctPort = null;

    /**
     * Field for child leaf "acct-address".
     */
    public AcctAddress acctAddress = null;

    /**
     * Field for child leaf "acct-password".
     */
    public AcctPassword acctPassword = null;

    /**
     * Field for child leaf "acct-periodic".
     */
    public AcctPeriodic acctPeriodic = null;

    /**
     * Field for child leaf "acct-interval".
     */
    public AcctInterval acctInterval = null;

    /**
     * Field for child leaf "domain".
     */
    public Domain domain = null;

    /**
     * Constructor for an empty Radius object.
     */
    public Radius() {
        super(ApConfigSchema.NAMESPACE, "radius");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Radius clone() {
        return (Radius)cloneContent(new Radius());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Radius cloneShallow() {
        return (Radius)cloneShallowContent(new Radius());
    }

    public Radius cloneWithoutChildren() {
        return new Radius();
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
            "auth-port",
            "auth-address",
            "auth-password",
            "acct-enable",
            "acct-port",
            "acct-address",
            "acct-password",
            "acct-periodic",
            "acct-interval",
            "domain",
        };
    }

    /* Access methods for optional leaf child: "auth-port". */

    /**
     * Adds leaf entry "authPort", using an existing object.
     * @param authPort The object to add.
     * @return The added child.
     */
    public AuthPort addAuthPort(AuthPort authPort) throws JNCException {
        this.authPort = authPort;
        insertChild(authPort, childrenNames());
        return authPort;
    }

    /**
     * Adds leaf entry "authPort".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public AuthPort addAuthPort() throws JNCException {
        AuthPort authPort = new AuthPort();
        this.authPort = authPort;
        insertChild(authPort, childrenNames());
        return authPort;
    }

    /**
     * Deletes leaf entry "authPort".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteAuthPort() throws JNCException {
        this.authPort = null;
        String path = "auth-port";
        return delete(path);
    }

    /* Access methods for optional leaf child: "auth-address". */

    /**
     * Adds leaf entry "authAddress", using an existing object.
     * @param authAddress The object to add.
     * @return The added child.
     */
    public AuthAddress addAuthAddress(AuthAddress authAddress)
            throws JNCException {
        this.authAddress = authAddress;
        insertChild(authAddress, childrenNames());
        return authAddress;
    }

    /**
     * Adds leaf entry "authAddress".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public AuthAddress addAuthAddress() throws JNCException {
        AuthAddress authAddress = new AuthAddress();
        this.authAddress = authAddress;
        insertChild(authAddress, childrenNames());
        return authAddress;
    }

    /**
     * Deletes leaf entry "authAddress".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteAuthAddress() throws JNCException {
        this.authAddress = null;
        String path = "auth-address";
        return delete(path);
    }

    /* Access methods for optional leaf child: "auth-password". */

    /**
     * Adds leaf entry "authPassword", using an existing object.
     * @param authPassword The object to add.
     * @return The added child.
     */
    public AuthPassword addAuthPassword(AuthPassword authPassword)
            throws JNCException {
        this.authPassword = authPassword;
        insertChild(authPassword, childrenNames());
        return authPassword;
    }

    /**
     * Adds leaf entry "authPassword".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public AuthPassword addAuthPassword() throws JNCException {
        AuthPassword authPassword = new AuthPassword();
        this.authPassword = authPassword;
        insertChild(authPassword, childrenNames());
        return authPassword;
    }

    /**
     * Deletes leaf entry "authPassword".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteAuthPassword() throws JNCException {
        this.authPassword = null;
        String path = "auth-password";
        return delete(path);
    }

    /* Access methods for optional leaf child: "acct-enable". */

    /**
     * Adds leaf entry "acctEnable", using an existing object.
     * @param acctEnable The object to add.
     * @return The added child.
     */
    public AcctEnable addAcctEnable(AcctEnable acctEnable) throws JNCException {
        this.acctEnable = acctEnable;
        insertChild(acctEnable, childrenNames());
        return acctEnable;
    }

    /**
     * Adds leaf entry "acctEnable".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public AcctEnable addAcctEnable() throws JNCException {
        AcctEnable acctEnable = new AcctEnable();
        this.acctEnable = acctEnable;
        insertChild(acctEnable, childrenNames());
        return acctEnable;
    }

    /**
     * Deletes leaf entry "acctEnable".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteAcctEnable() throws JNCException {
        this.acctEnable = null;
        String path = "acct-enable";
        return delete(path);
    }

    /* Access methods for optional leaf child: "acct-port". */

    /**
     * Adds leaf entry "acctPort", using an existing object.
     * @param acctPort The object to add.
     * @return The added child.
     */
    public AcctPort addAcctPort(AcctPort acctPort) throws JNCException {
        this.acctPort = acctPort;
        insertChild(acctPort, childrenNames());
        return acctPort;
    }

    /**
     * Adds leaf entry "acctPort".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public AcctPort addAcctPort() throws JNCException {
        AcctPort acctPort = new AcctPort();
        this.acctPort = acctPort;
        insertChild(acctPort, childrenNames());
        return acctPort;
    }

    /**
     * Deletes leaf entry "acctPort".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteAcctPort() throws JNCException {
        this.acctPort = null;
        String path = "acct-port";
        return delete(path);
    }

    /* Access methods for optional leaf child: "acct-address". */

    /**
     * Adds leaf entry "acctAddress", using an existing object.
     * @param acctAddress The object to add.
     * @return The added child.
     */
    public AcctAddress addAcctAddress(AcctAddress acctAddress)
            throws JNCException {
        this.acctAddress = acctAddress;
        insertChild(acctAddress, childrenNames());
        return acctAddress;
    }

    /**
     * Adds leaf entry "acctAddress".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public AcctAddress addAcctAddress() throws JNCException {
        AcctAddress acctAddress = new AcctAddress();
        this.acctAddress = acctAddress;
        insertChild(acctAddress, childrenNames());
        return acctAddress;
    }

    /**
     * Deletes leaf entry "acctAddress".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteAcctAddress() throws JNCException {
        this.acctAddress = null;
        String path = "acct-address";
        return delete(path);
    }

    /* Access methods for optional leaf child: "acct-password". */

    /**
     * Adds leaf entry "acctPassword", using an existing object.
     * @param acctPassword The object to add.
     * @return The added child.
     */
    public AcctPassword addAcctPassword(AcctPassword acctPassword)
            throws JNCException {
        this.acctPassword = acctPassword;
        insertChild(acctPassword, childrenNames());
        return acctPassword;
    }

    /**
     * Adds leaf entry "acctPassword".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public AcctPassword addAcctPassword() throws JNCException {
        AcctPassword acctPassword = new AcctPassword();
        this.acctPassword = acctPassword;
        insertChild(acctPassword, childrenNames());
        return acctPassword;
    }

    /**
     * Deletes leaf entry "acctPassword".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteAcctPassword() throws JNCException {
        this.acctPassword = null;
        String path = "acct-password";
        return delete(path);
    }

    /* Access methods for optional leaf child: "acct-periodic". */

    /**
     * Adds leaf entry "acctPeriodic", using an existing object.
     * @param acctPeriodic The object to add.
     * @return The added child.
     */
    public AcctPeriodic addAcctPeriodic(AcctPeriodic acctPeriodic)
            throws JNCException {
        this.acctPeriodic = acctPeriodic;
        insertChild(acctPeriodic, childrenNames());
        return acctPeriodic;
    }

    /**
     * Adds leaf entry "acctPeriodic".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public AcctPeriodic addAcctPeriodic() throws JNCException {
        AcctPeriodic acctPeriodic = new AcctPeriodic();
        this.acctPeriodic = acctPeriodic;
        insertChild(acctPeriodic, childrenNames());
        return acctPeriodic;
    }

    /**
     * Deletes leaf entry "acctPeriodic".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteAcctPeriodic() throws JNCException {
        this.acctPeriodic = null;
        String path = "acct-periodic";
        return delete(path);
    }

    /* Access methods for optional leaf child: "acct-interval". */

    /**
     * Adds leaf entry "acctInterval", using an existing object.
     * @param acctInterval The object to add.
     * @return The added child.
     */
    public AcctInterval addAcctInterval(AcctInterval acctInterval)
            throws JNCException {
        this.acctInterval = acctInterval;
        insertChild(acctInterval, childrenNames());
        return acctInterval;
    }

    /**
     * Adds leaf entry "acctInterval".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public AcctInterval addAcctInterval() throws JNCException {
        AcctInterval acctInterval = new AcctInterval();
        this.acctInterval = acctInterval;
        insertChild(acctInterval, childrenNames());
        return acctInterval;
    }

    /**
     * Deletes leaf entry "acctInterval".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteAcctInterval() throws JNCException {
        this.acctInterval = null;
        String path = "acct-interval";
        return delete(path);
    }

    /* Access methods for optional leaf child: "domain". */

    /**
     * Adds leaf entry "domain", using an existing object.
     * @param domain The object to add.
     * @return The added child.
     */
    public Domain addDomain(Domain domain) throws JNCException {
        this.domain = domain;
        insertChild(domain, childrenNames());
        return domain;
    }

    /**
     * Adds leaf entry "domain".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Domain addDomain() throws JNCException {
        Domain domain = new Domain();
        this.domain = domain;
        insertChild(domain, childrenNames());
        return domain;
    }

    /**
     * Deletes leaf entry "domain".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteDomain() throws JNCException {
        this.domain = null;
        String path = "domain";
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
        if (child instanceof AuthPort) authPort = (AuthPort)child;
        else if (child instanceof AuthAddress) authAddress = (AuthAddress)child;
        else if (child instanceof AuthPassword) authPassword = (AuthPassword)child;
        else if (child instanceof AcctEnable) acctEnable = (AcctEnable)child;
        else if (child instanceof AcctPort) acctPort = (AcctPort)child;
        else if (child instanceof AcctAddress) acctAddress = (AcctAddress)child;
        else if (child instanceof AcctPassword) acctPassword = (AcctPassword)child;
        else if (child instanceof AcctPeriodic) acctPeriodic = (AcctPeriodic)child;
        else if (child instanceof AcctInterval) acctInterval = (AcctInterval)child;
        else if (child instanceof Domain) domain = (Domain)child;
    }

}
