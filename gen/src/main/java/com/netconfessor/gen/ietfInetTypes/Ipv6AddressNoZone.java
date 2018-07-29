
package com.netconfessor.gen.ietfInetTypes;

import com.netconfessor.gen.ietfInetTypes.Ipv6Address;

import io.netconfessor.YangException;

/**
 * An IPv6 address without a zone index.  This type, derived from
 * ipv6-address, may be used in situations where the zone is
 * known from the context and hence no zone index is needed.
 * <br/>
 * Namespace: 
 *
 * @author jnc.py
 */
public class Ipv6AddressNoZone extends Ipv6Address {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for Ipv6AddressNoZone object from a string.
     * @param value Value to construct the Ipv6AddressNoZone from.
     */
    public Ipv6AddressNoZone(String value) throws YangException {
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
