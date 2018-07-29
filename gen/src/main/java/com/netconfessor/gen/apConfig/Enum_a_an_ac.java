
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
public class Enum_a_an_ac extends YangEnumeration {

    private static final long serialVersionUID = 1L;

    public static final String A = "a";

    public static final String AN = "an";

    public static final String AC = "ac";

    /**
     * Constructor for Enum_a_an_ac object from a string.
     * @param value Value to construct the Enum_a_an_ac from.
     */
    public Enum_a_an_ac(String value) throws YangException {
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
                A,
                AN,
                AC,
            };
    }

}
