
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
public class Enum_blacklist_whitelist extends YangEnumeration {

    private static final long serialVersionUID = 1L;

    public static final String BLACKLIST = "blacklist";

    public static final String WHITELIST = "whitelist";

    /**
     * Constructor for Enum_blacklist_whitelist object from a string.
     * @param value Value to construct the Enum_blacklist_whitelist from.
     */
    public Enum_blacklist_whitelist(String value) throws YangException {
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
                BLACKLIST,
                WHITELIST,
            };
    }

}
