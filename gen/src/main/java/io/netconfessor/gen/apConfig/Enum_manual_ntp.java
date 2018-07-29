
package io.netconfessor.gen.apConfig;

import io.netconfessor.YangEnumeration;
import io.netconfessor.YangException;

/**
 * 
 * <br/>
 * Namespace: 
 *
 * @author jnc.py
 */
public class Enum_manual_ntp extends YangEnumeration {

    private static final long serialVersionUID = 1L;

    public static final String MANUAL = "manual";

    public static final String NTP = "ntp";

    /**
     * Constructor for Enum_manual_ntp object from a string.
     * @param value Value to construct the Enum_manual_ntp from.
     */
    public Enum_manual_ntp(String value) throws YangException {
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
                MANUAL,
                NTP,
            };
    }

}
