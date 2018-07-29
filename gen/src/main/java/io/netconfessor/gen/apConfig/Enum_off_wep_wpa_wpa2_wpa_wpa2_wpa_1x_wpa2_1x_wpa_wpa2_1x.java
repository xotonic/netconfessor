
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
public class Enum_off_wep_wpa_wpa2_wpa_wpa2_wpa_1x_wpa2_1x_wpa_wpa2_1x extends YangEnumeration {

    private static final long serialVersionUID = 1L;

    public static final String OFF = "off";

    public static final String WEP = "WEP";

    public static final String WPA = "WPA";

    public static final String WPA2 = "WPA2";

    public static final String WPA_WPA2 = "WPA_WPA2";

    public static final String WPA_1X = "WPA_1X";

    public static final String WPA2_1X = "WPA2_1X";

    public static final String WPA_WPA2_1X = "WPA_WPA2_1X";

    /**
     * Constructor for Enum_off_wep_wpa_wpa2_wpa_wpa2_wpa_1x_wpa2_1x_wpa_wpa2_1x object from a string.
     * @param value Value to construct the Enum_off_wep_wpa_wpa2_wpa_wpa2_wpa_1x_wpa2_1x_wpa_wpa2_1x from.
     */
    public Enum_off_wep_wpa_wpa2_wpa_wpa2_wpa_1x_wpa2_1x_wpa_wpa2_1x(String value)
            throws YangException {
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
                WEP,
                WPA,
                WPA2,
                WPA_WPA2,
                WPA_1X,
                WPA2_1X,
                WPA_WPA2_1X,
            };
    }

}
