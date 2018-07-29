
package io.netconfessor.gen.ietfInetTypes;

import io.netconfessor.YangException;
import io.netconfessor.YangUnion;

/**
 * The host type represents either an IP address or a DNS
 * domain name.
 * <br/>
 * Namespace: 
 *
 * @author jnc.py
 */
public class Host extends YangUnion {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for Host object from a string.
     * @param value Value to construct the Host from.
     */
    public Host(String value) throws YangException {
        super(value,
            new String[] {
                "io.netconfessor.gen.ietfInetTypes.IpAddress",
                "io.netconfessor.gen.ietfInetTypes.DomainName",
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
