package io.netconfessor;

public class RFCErrorDescriber implements RpcErrorDescriber<RFCErrorDescriber.ErrorDescription> {

    @Override
    public ErrorDescription describe(RpcError rpcError) {
        for (ErrorDescription errorDescription : ErrorDescription.values()) {
            if (errorDescription.errorTag.equals(rpcError.errorTag())) {
                return errorDescription;
            }
        }
        return ErrorDescription.jnc_unknown;
    }

    public enum ErrorType {
        protocol, application, transport, rpc
    }

    public enum ErrorDescription {


        in_use("in-use",
                new ErrorType[] {ErrorType.protocol, ErrorType.application},
                "The request requires a resource that already is in use."),

        invalid_value("invalid-value",
                new ErrorType[] {ErrorType.protocol, ErrorType.application},
                "The request specifies an unacceptable value for one or more parameters."),

        too_big("too-big",
                new ErrorType[] {ErrorType.transport, ErrorType.rpc, ErrorType.protocol, ErrorType.application},
                "The request or response (that would be generated) is too large for the implementation to handle."),

        missing_attribute("missing-attribute",
                new ErrorType[] {ErrorType.rpc, ErrorType.protocol, ErrorType.application},
                "An expected attribute is missing."),

        bad_attribute("bad-attribute",
                new ErrorType[] {ErrorType.rpc, ErrorType.protocol, ErrorType.application},
                "An attribute value is not correct; e.g., wrong type, out of range, pattern mismatch."),

        unknown_attribute("unknown-attribute",
                new ErrorType[] {ErrorType.rpc, ErrorType.protocol, ErrorType.application},
                "An unexpected attribute is present."),

        missing_element("missing-element",
                new ErrorType[] {ErrorType.protocol, ErrorType.application}, "An expected element is missing."),

        bad_element("bad-element",
                new ErrorType[] {ErrorType.protocol, ErrorType.application},
                "An element value is not correct; e.g., wrong type, out of range, pattern mismatch."),

        unknown_element("unknown-element",
                new ErrorType[] {ErrorType.protocol, ErrorType.application}, "An unexpected element is present."),

        unknown_namespace("unknown-namespace",
                new ErrorType[] {ErrorType.protocol, ErrorType.application}, "An unexpected namespace is present."),

        access_denied("access-denied",
                new ErrorType[] {ErrorType.protocol, ErrorType.application},
                "Access to the requested protocol operation or data model is denied because authorization failed."),

        lock_denied("lock-denied",
                new ErrorType[] {ErrorType.protocol},
                "Access to the requested lock is denied because the lock is currently held by another entity."),

        resource_denied("resource-denied",
                new ErrorType[] {ErrorType.transport, ErrorType.rpc, ErrorType.protocol, ErrorType.application},
                "Request could not be completed because of insufficient resources."),

        rollback_failed("rollback-failed",
                new ErrorType[] {ErrorType.protocol, ErrorType.application},
                "Request to roll back some configuration change (via rollback-on-error or <discard-changes> "
                        + "operations) was not " + "completed for some reason."),

        data_exists("data-exists",
                new ErrorType[] {ErrorType.application},
                "Request could not be completed because the relevant data model content already exists.  For example,"
                        + " a 'create' " + "operation was attempted on data that already exists."),

        data_missing("data-missing",
                new ErrorType[] {ErrorType.application},
                "Request could not be completed because the relevant data model content does not exist.  For example,"
                        + " a 'delete' " + "operation was attempted on data that does not exist."),

        operation_not_supported("operation-not-supported",
                new ErrorType[] {ErrorType.protocol, ErrorType.application},
                "Request could not be completed because the requested operation is not supported by this "
                        + "implementation."),

        operation_failed("operation-failed",
                new ErrorType[] {ErrorType.rpc, ErrorType.protocol, ErrorType.application},
                "Request could not be completed because the requested operation failed for some reason not covered by"
                        + " any other error" + " condition."),

        partial_operation("partial-operation",
                new ErrorType[] {ErrorType.application},
                "This error-tag is obsolete, and SHOULD NOT be sent by servers conforming to this document."),

        malformed_message("malformed-message",
                new ErrorType[] {ErrorType.rpc},
                "A message could not be handled because it failed to be parsed correctly.  For example, the message "
                        + "is not "
                        + "well-formed XML or it uses an set. This error-tag is new in :base:1.1 and MUST NOT be sent"
                        + " to old clients."),

        jnc_unknown("", new ErrorType[] {}, "Unknown rpc-error")

        ;

        private String errorTag;
        private String description;
        private ErrorType[] errorType;

        ErrorDescription(String errorTag, ErrorType[] errorType, String description) {
            this.errorTag = errorTag;
            this.description = description;
            this.errorType = errorType;
        }

        public String errorTag() {
            return errorTag;
        }

        public String description() {
            return description;
        }

        public ErrorType[] errorType() {
            return errorType;
        }
    }
}
