
package io.netconfessor.gen.ietfInetTypes;

import io.netconfessor.YangException;
import io.netconfessor.YangString;

/**
 * The ipv6-address type represents an IPv6 address in full,
 * mixed, shortened, and shortened-mixed notation.  The IPv6
 * address may include a zone index, separated by a % sign.
 * 
 * The zone index is used to disambiguate identical address
 * values.  For link-local addresses, the zone index will
 * typically be the interface index number or the name of an
 * interface.  If the zone index is not present, the default
 * zone of the device will be used.
 * 
 * 
 * 
 * The canonical format of IPv6 addresses uses the textual
 * representation defined in Section 4 of RFC 5952.  The
 * canonical format for the zone index is the numerical
 * format as described in Section 11.2 of RFC 4007.
 * <br/>
 * Namespace: 
 *
 * @author jnc.py
 */
public class Ipv6Address extends YangString {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for Ipv6Address object from a string.
     * @param value Value to construct the Ipv6Address from.
     */
    public Ipv6Address(String value) throws YangException {
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
