
package io.netconfessor.gen.ietfInetTypes;

import io.netconfessor.YangException;
import io.netconfessor.YangString;

/**
 * The ipv4-address type represents an IPv4 address in
 * dotted-quad notation.  The IPv4 address may include a zone
 * index, separated by a % sign.
 * 
 * The zone index is used to disambiguate identical address
 * values.  For link-local addresses, the zone index will
 * typically be the interface index number or the name of an
 * interface.  If the zone index is not present, the default
 * zone of the device will be used.
 * 
 * The canonical format for the zone index is the numerical
 * format
 * <br/>
 * Namespace: 
 *
 * @author jnc.py
 */
public class Ipv4Address extends YangString {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for Ipv4Address object from a string.
     * @param value Value to construct the Ipv4Address from.
     */
    public Ipv4Address(String value) throws YangException {
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
