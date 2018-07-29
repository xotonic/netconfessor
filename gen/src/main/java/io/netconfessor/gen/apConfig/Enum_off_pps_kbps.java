
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
public class Enum_off_pps_kbps extends YangEnumeration {

    private static final long serialVersionUID = 1L;

    public static final String OFF = "off";

    public static final String PPS = "pps";

    public static final String KBPS = "kbps";

    /**
     * Constructor for Enum_off_pps_kbps object from a string.
     * @param value Value to construct the Enum_off_pps_kbps from.
     */
    public Enum_off_pps_kbps(String value) throws YangException {
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
                OFF,
                PPS,
                KBPS,
            };
    }

}
