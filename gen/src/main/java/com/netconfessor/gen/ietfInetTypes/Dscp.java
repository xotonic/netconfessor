
package com.netconfessor.gen.ietfInetTypes;

import io.netconfessor.YangException;
import io.netconfessor.YangUInt8;

/**
 * The dscp type represents a Differentiated Services Code Point
 * that may be used for marking packets in a traffic stream.
 * In the value set and its semantics, this type is equivalent
 * to the Dscp textual convention of the SMIv2.
 * <br/>
 * Namespace: 
 *
 * @author jnc.py
 */
public class Dscp extends YangUInt8 {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for Dscp object from a string.
     * @param value Value to construct the Dscp from.
     */
    public Dscp(String value) throws YangException {
        super(value);
        check();
    }

    /**
     * Constructor for Dscp object from a short.
     * @param value Value to construct the Dscp from.
     */
    public Dscp(short value) throws YangException {
        super(value);
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
     * Sets the value using a value of type short.
     * @param value The value to set.
     */
    public void setValue(short value) throws YangException {
        super.setValue(value);
        check();
    }

    /**
     * Checks all restrictions (if any).
     */
    public void check() throws YangException {
    }


}
