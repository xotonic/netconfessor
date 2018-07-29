
package com.netconfessor.gen.ietfInetTypes;

import io.netconfessor.YangEnumeration;
import io.netconfessor.YangException;

/**
 * This value represents the version of the IP protocol.
 * 
 * In the value set and its semantics, this type is equivalent
 * to the InetVersion textual convention of the SMIv2.
 * <br/>
 * Namespace: 
 *
 * @author jnc.py
 */
public class IpVersion extends YangEnumeration {

    private static final long serialVersionUID = 1L;

    public static final String UNKNOWN = "unknown";

    public static final String IPV4 = "ipv4";

    public static final String IPV6 = "ipv6";

    /**
     * Constructor for IpVersion object from a string.
     * @param value Value to construct the IpVersion from.
     */
    public IpVersion(String value) throws YangException {
        super(value, enums());
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
        super.check();
    }

    public static String[] enums() {
        return new String[] {
                UNKNOWN,
                IPV4,
                IPV6,
            };
    }

}
