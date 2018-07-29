
package io.netconfessor.gen.ietfInetTypes;

import io.netconfessor.YangException;
import io.netconfessor.YangUInt32;

/**
 * The ipv6-flow-label type represents the flow identifier or Flow
 * Label in an IPv6 packet header that may be used to
 * discriminate traffic flows.
 * 
 * In the value set and its semantics, this type is equivalent
 * to the IPv6FlowLabel textual convention of the SMIv2.
 * <br/>
 * Namespace: 
 *
 * @author jnc.py
 */
public class Ipv6FlowLabel extends YangUInt32 {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for Ipv6FlowLabel object from a string.
     * @param value Value to construct the Ipv6FlowLabel from.
     */
    public Ipv6FlowLabel(String value) throws YangException {
        super(value);
        check();
    }

    /**
     * Constructor for Ipv6FlowLabel object from a long.
     * @param value Value to construct the Ipv6FlowLabel from.
     */
    public Ipv6FlowLabel(long value) throws YangException {
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
