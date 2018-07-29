package io.netconfessor;

import java.io.Serializable;

/**
 * Class for 'rpc-error' elements returned in NETCONF 'rpc-reply' messages.
 * <p>
 * The 'rpc-error' includes the following information:
 * <ul>
 * <li> {@link #errorType}
 * <li> {@link #errorTag}
 * <li> {@link #errorSeverity}
 * <li> {@link #errorAppTag}
 * <li> {@link #errorPath}
 * <li> {@link #errorMessage}
 * <li> {@link #errorInfo}
 * </ul>
 */
public class RpcError implements Serializable {

    /**
     * The error type defines the conceptual layer that the error occurred.
     * Enumeration. One of:
     * <ul>
     * <li>transport
     * <li>rpc
     * <li>protocol
     * <li>application
     * </ul>
     */
    private String errorType;

    /**
     * Contains a string identifying the error condition. One of:
     * <ul>
     * <li>in-use
     * <li>invalid-value
     * <li>too-big
     * <li>missing-attribute
     * <li>bad-attribute
     * <li>unknown-attribute
     * <li>missing-element
     * <li>bad-element
     * <li>unknown-element
     * <li>unknown-namespace
     * <li>access-denied
     * <li>lock-denied
     * <li>resource-denied
     * <li>rollback-failed
     * <li>data-exists
     * <li>data-missing
     * <li>operation-not-supported
     * <li>operation-failed
     * <li>partial-operation
     * </ul>
     */
    private String errorTag;

    /**
     * Contains a string identifying the error severity, as determined by the
     * device. One of:
     * <ul>
     * <li>error
     * <li>warning
     * </ul>
     */
    private String errorSeverity;

    /**
     * Contains a string identifying the data-model-specific or
     * implementation-specific error condition, if one exists. This element
     * will not be present if no appropriate application error tag can be
     * associated with a particular error condition.
     */
    private String errorAppTag;

    /**
     * Contains the absolute XPath expression identifying the element path to
     * the node that is associated with the error being reported in a
     * particular rpc-error element. This element will not be present if no
     * appropriate payload element can be associated with a particular error
     * condition, or if the 'bad-element' string returned in the 'error-info'
     * container is sufficient to identify the node associated with the error.
     * When the XPath expression is interpreted, the set of namespace
     * declarations are those in scope on the rpc-error element, including the
     * default namespace.
     */
    private String errorPath;

    /**
     * Contains a string suitable for human display that describes the error
     * condition. This element will not be present if no appropriate message is
     * provided for a particular error condition.
     */
    private String errorMessage;

    /**
     * Contains protocol- or data-model-specific error content. This element
     * will not be present if no such error content is provided for a
     * particular error condition.
     */
    private NodeSet errorInfo;
    /**
     * The rpc-error element tree
     */
    private Element data;
    /**
     * prefix map is needed for resolving path if error-path
     */
    private PrefixMap prefixes;

    /**
     * Constructor, initialized with an rpc-error element tree.
     *
     * @param data The rpc-error element tree to initialize with.
     */
    public RpcError(Element data, PrefixMap prefixes) {
        // parse out the fields in data
        this.data = data;
        this.prefixes = prefixes;
        try {
            Element e = data.getFirst("self::rpc-error/error-type");
            if (e != null) {
                errorType = (String) e.getValue();
            }
            e = data.getFirst("self::rpc-error/error-tag");
            if (e != null) {
                errorTag = (String) e.getValue();
            }
            e = data.getFirst("self::rpc-error/error-severity");
            if (e != null) {
                errorSeverity = (String) e.getValue();
            }
            e = data.getFirst("self::rpc-error/error-info");
            if (e != null) {
                errorInfo = e.getChildren();
            }
            e = data.getFirst("self::rpc-error/error-message");
            if (e != null) {
                errorMessage = (String) e.getValue();
            }
            e = data.getFirst("self::rpc-error/error-app-tag");
            if (e != null) {
                errorAppTag = (String) e.getValue();
            }
            e = data.getFirst("self::rpc-error/error-path");
            if (e != null) {
                errorPath = (String) e.getValue();
            }
        } catch (final JNCException e1) {
            System.err.println("Error decoding rpc-error element: " + data.toXMLString() + "\ngot exception: " + e1);
            e1.printStackTrace();
        }
    }


    public String errorType() {
        return errorType;
    }

    public void errorType(String errorType) {
        this.errorType = errorType;
    }

    public String errorTag() {
        return errorTag;
    }

    public void errorTag(String errorTag) {
        this.errorTag = errorTag;
    }

    public String errorSeverity() {
        return errorSeverity;
    }

    public void errorSeverity(String errorSeverity) {
        this.errorSeverity = errorSeverity;
    }

    public String errorAppTag() {
        return errorAppTag;
    }

    public void errorAppTag(String errorAppTag) {
        this.errorAppTag = errorAppTag;
    }

    public String errorPath() {
        return errorPath;
    }

    public void errorPath(String errorPath) {
        this.errorPath = errorPath;
    }

    public String errorMessage() {
        return errorMessage;
    }

    public void errorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public NodeSet errorInfo() {
        return errorInfo;
    }

    public void errorInfo(NodeSet errorInfo) {
        this.errorInfo = errorInfo;
    }

    public Element data() {
        return data;
    }

    public void data(Element data) {
        this.data = data;
    }

    public void prefixes(PrefixMap prefixes) {
        this.prefixes = prefixes;
    }

    /**
     * @return the XML string representation of the rpc-error element tree.
     */
    @Override
    public String toString() {
        return data.toXMLString();
    }

    public Element element() {
        return data;
    }

    public PrefixMap prefixes() {
        return prefixes;
    }
}
