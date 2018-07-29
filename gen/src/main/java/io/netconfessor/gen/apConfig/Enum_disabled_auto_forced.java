
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
public class Enum_disabled_auto_forced extends YangEnumeration {

    private static final long serialVersionUID = 1L;

    public static final String DISABLED = "disabled";

    public static final String AUTO = "auto";

    public static final String FORCED = "forced";

    /**
     * Constructor for Enum_disabled_auto_forced object from a string.
     * @param value Value to construct the Enum_disabled_auto_forced from.
     */
    public Enum_disabled_auto_forced(String value) throws YangException {
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
                DISABLED,
                AUTO,
                FORCED,
            };
    }

}
