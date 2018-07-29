
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
public class Enum_ap_sta_radio extends YangEnumeration {

    private static final long serialVersionUID = 1L;

    public static final String AP = "ap";

    public static final String STA = "sta";

    public static final String RADIO = "radio";

    /**
     * Constructor for Enum_ap_sta_radio object from a string.
     * @param value Value to construct the Enum_ap_sta_radio from.
     */
    public Enum_ap_sta_radio(String value) throws YangException {
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
                AP,
                STA,
                RADIO,
            };
    }

}
