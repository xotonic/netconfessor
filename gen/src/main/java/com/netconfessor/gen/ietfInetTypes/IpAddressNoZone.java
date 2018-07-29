
package com.netconfessor.gen.ietfInetTypes;

import io.netconfessor.YangException;
import io.netconfessor.YangUnion;

/**
 * The ip-address-no-zone type represents an IP address and is
 * IP version neutral.  The format of the textual representation
 * implies the IP version.  This type does not support scoped
 * addresses since it does not allow zone identifiers in the
 * address format.
 * <br/>
 * Namespace: 
 *
 * @author jnc.py
 */
public class IpAddressNoZone extends YangUnion {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for IpAddressNoZone object from a string.
     * @param value Value to construct the IpAddressNoZone from.
     */
    public IpAddressNoZone(String value) throws YangException {
        super(value,
            new String[] {
                "com.netconfessor.gen.ietfInetTypes.Ipv4AddressNoZone",
                "com.netconfessor.gen.ietfInetTypes.Ipv6AddressNoZone",
            }
        );
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
