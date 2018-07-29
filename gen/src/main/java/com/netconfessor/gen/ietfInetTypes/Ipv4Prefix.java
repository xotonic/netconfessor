
package com.netconfessor.gen.ietfInetTypes;

import io.netconfessor.YangException;
import io.netconfessor.YangString;

/**
 * The ipv4-prefix type represents an IPv4 address prefix.
 * The prefix length is given by the number following the
 * slash character and must be less than or equal to 32.
 * 
 * A prefix length value of n corresponds to an IP address
 * mask that has n contiguous 1-bits from the most
 * significant bit (MSB) and all other bits set to 0.
 * 
 * The canonical format of an IPv4 prefix has all bits of
 * the IPv4 address set to zero that are not part of the
 * IPv4 prefix.
 * <br/>
 * Namespace: 
 *
 * @author jnc.py
 */
public class Ipv4Prefix extends YangString {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for Ipv4Prefix object from a string.
     * @param value Value to construct the Ipv4Prefix from.
     */
    public Ipv4Prefix(String value) throws YangException {
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
