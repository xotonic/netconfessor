
package com.netconfessor.gen.apConfig;

import io.netconfessor.YangEnumeration;
import io.netconfessor.YangException;

/**
 * 
 * <br/>
 * Namespace: 
 *
 * @author jnc.py
 */
public class Enum_off_manual_auto extends YangEnumeration {

    private static final long serialVersionUID = 1L;

    public static final String OFF = "off";

    public static final String MANUAL = "manual";

    public static final String AUTO = "auto";

    /**
     * Constructor for Enum_off_manual_auto object from a string.
     * @param value Value to construct the Enum_off_manual_auto from.
     */
    public Enum_off_manual_auto(String value) throws YangException {
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
                MANUAL,
                AUTO,
            };
    }

}
