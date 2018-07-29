
package io.netconfessor.gen.ietfInetTypes;

import io.netconfessor.YangException;
import io.netconfessor.YangUInt16;

/**
 * The port-number type represents a 16-bit port number of an
 * Internet transport-layer protocol such as UDP, TCP, DCCP, or
 * SCTP.  Port numbers are assigned by IANA.  A current list of
 * all assignments is available from <http://www.iana.org/>.
 * 
 * Note that the port number value zero is reserved by IANA.  In
 * situations where the value zero does not make sense, it can
 * be excluded by subtyping the port-number type.
 * In the value set and its semantics, this type is equivalent
 * to the InetPortNumber textual convention of the SMIv2.
 * <br/>
 * Namespace: 
 *
 * @author jnc.py
 */
public class PortNumber extends YangUInt16 {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for PortNumber object from a string.
     * @param value Value to construct the PortNumber from.
     */
    public PortNumber(String value) throws YangException {
        super(value);
        check();
    }

    /**
     * Constructor for PortNumber object from a int.
     * @param value Value to construct the PortNumber from.
     */
    public PortNumber(int value) throws YangException {
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
     * Sets the value using a value of type int.
     * @param value The value to set.
     */
    public void setValue(int value) throws YangException {
        super.setValue(value);
        check();
    }

    /**
     * Checks all restrictions (if any).
     */
    public void check() throws YangException {
    }


}
