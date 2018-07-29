
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
public class Enum_auto_0_1_2_3_4_5_6_7 extends YangEnumeration {

    private static final long serialVersionUID = 1L;

    public static final String AUTO = "auto";

    public static final String _0 = "0";

    public static final String _1 = "1";

    public static final String _2 = "2";

    public static final String _3 = "3";

    public static final String _4 = "4";

    public static final String _5 = "5";

    public static final String _6 = "6";

    public static final String _7 = "7";

    /**
     * Constructor for Enum_auto_0_1_2_3_4_5_6_7 object from a string.
     * @param value Value to construct the Enum_auto_0_1_2_3_4_5_6_7 from.
     */
    public Enum_auto_0_1_2_3_4_5_6_7(String value) throws YangException {
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
                AUTO,
                _0,
                _1,
                _2,
                _3,
                _4,
                _5,
                _6,
                _7,
            };
    }

}
