
package io.netconfessor.gen.ietfInetTypes;

import io.netconfessor.YangException;
import io.netconfessor.YangUnion;

/**
 * The ip-prefix type represents an IP prefix and is IP
 * version neutral.  The format of the textual representations
 * implies the IP version.
 * <br/>
 * Namespace: 
 *
 * @author jnc.py
 */
public class IpPrefix extends YangUnion {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for IpPrefix object from a string.
     * @param value Value to construct the IpPrefix from.
     */
    public IpPrefix(String value) throws YangException {
        super(value,
            new String[] {
                "io.netconfessor.gen.ietfInetTypes.Ipv4Prefix",
                "io.netconfessor.gen.ietfInetTypes.Ipv6Prefix",
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
