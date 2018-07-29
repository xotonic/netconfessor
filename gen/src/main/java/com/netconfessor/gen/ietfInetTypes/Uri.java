
package com.netconfessor.gen.ietfInetTypes;

import io.netconfessor.YangException;
import io.netconfessor.YangString;

/**
 * The uri type represents a Uniform Resource Identifier
 * (URI) as defined by STD 66.
 * 
 * Objects using the uri type MUST be in US-ASCII encoding,
 * and MUST be normalized as described by RFC 3986 Sections
 * 6.2.1, 6.2.2.1, and 6.2.2.2.  All unnecessary
 * percent-encoding is removed, and all case-insensitive
 * characters are set to lowercase except for hexadecimal
 * digits, which are normalized to uppercase as described in
 * Section 6.2.2.1.
 * 
 * The purpose of this normalization is to help provide
 * unique URIs.  Note that this normalization is not
 * sufficient to provide uniqueness.  Two URIs that are
 * textually distinct after this normalization may still be
 * equivalent.
 * 
 * Objects using the uri type may restrict the schemes that
 * they permit.  For example, 'data:' and 'urn:' schemes
 * might not be appropriate.
 * 
 * A zero-length URI is not a valid URI.  This can be used to
 * express 'URI absent' where required.
 * 
 * In the value set and its semantics, this type is equivalent
 * to the Uri SMIv2 textual convention defined in RFC 5017.
 * <br/>
 * Namespace: 
 *
 * @author jnc.py
 */
public class Uri extends YangString {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for Uri object from a string.
     * @param value Value to construct the Uri from.
     */
    public Uri(String value) throws YangException {
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
     * Checks all restrictions (if any).
     */
    public void check() throws YangException {
    }


}
