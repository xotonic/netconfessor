
package com.netconfessor.gen.ietfInetTypes;

import io.netconfessor.YangException;
import io.netconfessor.YangUInt32;

/**
 * The as-number type represents autonomous system numbers
 * which identify an Autonomous System (AS).  An AS is a set
 * of routers under a single technical administration, using
 * an interior gateway protocol and common metrics to route
 * packets within the AS, and using an exterior gateway
 * protocol to route packets to other ASes.  IANA maintains
 * the AS number space and has delegated large parts to the
 * regional registries.
 * 
 * Autonomous system numbers were originally limited to 16
 * bits.  BGP extensions have enlarged the autonomous system
 * number space to 32 bits.  This type therefore uses an uint32
 * base type without a range restriction in order to support
 * a larger autonomous system number space.
 * 
 * In the value set and its semantics, this type is equivalent
 * to the InetAutonomousSystemNumber textual convention of
 * the SMIv2.
 * <br/>
 * Namespace: 
 *
 * @author jnc.py
 */
public class AsNumber extends YangUInt32 {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for AsNumber object from a string.
     * @param value Value to construct the AsNumber from.
     */
    public AsNumber(String value) throws YangException {
        super(value);
        check();
    }

    /**
     * Constructor for AsNumber object from a long.
     * @param value Value to construct the AsNumber from.
     */
    public AsNumber(long value) throws YangException {
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
     * Sets the value using a value of type long.
     * @param value The value to set.
     */
    public void setValue(long value) throws YangException {
        super.setValue(value);
        check();
    }

    /**
     * Checks all restrictions (if any).
     */
    public void check() throws YangException {
    }


}
