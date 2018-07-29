
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
public class Enum_staticIp_dhcp extends YangEnumeration {

    private static final long serialVersionUID = 1L;

    public static final String STATIC_IP = "static-ip";

    public static final String DHCP = "dhcp";

    /**
     * Constructor for Enum_staticIp_dhcp object from a string.
     * @param value Value to construct the Enum_staticIp_dhcp from.
     */
    public Enum_staticIp_dhcp(String value) throws YangException {
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
                STATIC_IP,
                DHCP,
            };
    }

}
