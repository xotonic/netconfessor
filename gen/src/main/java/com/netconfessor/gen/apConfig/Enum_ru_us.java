
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
public class Enum_ru_us extends YangEnumeration {

    private static final long serialVersionUID = 1L;

    public static final String RU = "RU";

    public static final String US = "US";

    /**
     * Constructor for Enum_ru_us object from a string.
     * @param value Value to construct the Enum_ru_us from.
     */
    public Enum_ru_us(String value) throws YangException {
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
                RU,
                US,
            };
    }

}
