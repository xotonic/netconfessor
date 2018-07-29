
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
public class Enum_5_10_20_40_80 extends YangEnumeration {

    private static final long serialVersionUID = 1L;

    public static final String _5 = "5";

    public static final String _10 = "10";

    public static final String _20 = "20";

    public static final String _40 = "40";

    public static final String _80 = "80";

    /**
     * Constructor for Enum_5_10_20_40_80 object from a string.
     * @param value Value to construct the Enum_5_10_20_40_80 from.
     */
    public Enum_5_10_20_40_80(String value) throws YangException {
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
                _5,
                _10,
                _20,
                _40,
                _80,
            };
    }

}
