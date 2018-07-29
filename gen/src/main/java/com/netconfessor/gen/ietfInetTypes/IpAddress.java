
package com.netconfessor.gen.ietfInetTypes;

import io.netconfessor.YangException;
import io.netconfessor.YangUnion;

/**
 * The ip-address type represents an IP address and is IP
 * version neutral.  The format of the textual representation
 * implies the IP version.  This type supports scoped addresses
 * by allowing zone identifiers in the address format.
 * <br/>
 * Namespace: 
 *
 * @author jnc.py
 */
public class IpAddress extends YangUnion {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for IpAddress object from a string.
     * @param value Value to construct the IpAddress from.
     */
    public IpAddress(String value) throws YangException {
        super(value,
            new String[] {
                "com.netconfessor.gen.ietfInetTypes.Ipv4Address",
                "com.netconfessor.gen.ietfInetTypes.Ipv6Address",
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
