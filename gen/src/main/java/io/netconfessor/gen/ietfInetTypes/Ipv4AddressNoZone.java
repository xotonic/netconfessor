
package io.netconfessor.gen.ietfInetTypes;

import io.netconfessor.YangException;
import io.netconfessor.gen.ietfInetTypes.Ipv4Address;

/**
 * An IPv4 address without a zone index.  This type, derived from
 * ipv4-address, may be used in situations where the zone is
 * known from the context and hence no zone index is needed.
 * <br/>
 * Namespace: 
 *
 * @author jnc.py
 */
public class Ipv4AddressNoZone extends Ipv4Address {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for Ipv4AddressNoZone object from a string.
     * @param value Value to construct the Ipv4AddressNoZone from.
     */
    public Ipv4AddressNoZone(String value) throws YangException {
        super(value);
        check();
    }

    /**
     * Sets the value using a string value.
     * @param value The value to set.
     */
    public void setValue(String value) throws YangException {
        super.setValue(value);
        check();
    }

    /**
     * Checks all restrictions (if any).
     */
    public void check() throws YangException {
    }


}
