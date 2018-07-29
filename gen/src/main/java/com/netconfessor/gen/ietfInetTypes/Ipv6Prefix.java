
package com.netconfessor.gen.ietfInetTypes;

import io.netconfessor.YangException;
import io.netconfessor.YangString;

/**
 * The ipv6-prefix type represents an IPv6 address prefix.
 * The prefix length is given by the number following the
 * slash character and must be less than or equal to 128.
 * 
 * A prefix length value of n corresponds to an IP address
 * mask that has n contiguous 1-bits from the most
 * significant bit (MSB) and all other bits set to 0.
 * 
 * The IPv6 address should have all bits that do not belong
 * to the prefix set to zero.
 * 
 * The canonical format of an IPv6 prefix has all bits of
 * the IPv6 address set to zero that are not part of the
 * IPv6 prefix.  Furthermore, the IPv6 address is represented
 * as defined in Section 4 of RFC 5952.
 * <br/>
 * Namespace: 
 *
 * @author jnc.py
 */
public class Ipv6Prefix extends YangString {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for Ipv6Prefix object from a string.
     * @param value Value to construct the Ipv6Prefix from.
     */
    public Ipv6Prefix(String value) throws YangException {
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
