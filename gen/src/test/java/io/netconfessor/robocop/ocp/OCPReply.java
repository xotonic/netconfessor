package io.netconfessor.robocop.ocp;

import io.netconfessor.NodeSet;

public class OCPReply {

    private int messageId = -1;

    public OCPReply(int messageId) {
        this.messageId = messageId;
    }

    public static String hello(int sessionId) {
        return String.format("<nc:hello xmlns:nc=\"urn:ietf:params:xml:ns:netconf:base:1.0\" "
                + "xmlns=\"urn:ietf:params:xml:ns:netconf:base:1.0\">\n" + "  <nc:capabilities>\n"
                + "    <nc:capability>urn:ietf:params:netconf:base:1.0</nc:capability>\n"
                + "    <nc:capability>jnc:test:robocop?module=robocop</nc:capability>\n"
                + "    <nc:capability>urn:ietf:params:netconf:capability:candidate:1.0</nc:capability>\n"
                + "    <nc:capability>urn:ietf:params:netconf:capability:confirmed-commit:1.0</nc:capability>\n"
                + "    <nc:capability>urn:ietf:params:netconf:capability:rollback-on-error:1.0</nc:capability>\n"
                + "    <nc:capability>urn:ietf:params:netconf:capability:validate:1.0</nc:capability>\n"
                + "    <nc:capability>urn:ietf:params:netconf:capability:url:1.0?scheme=file</nc:capability>\n"
                + "    <nc:capability>urn:ietf:params:netconf:capability:xpath:1.0</nc:capability>\n"
                + "    <nc:capability>urn:ietf:params:netconf:capability:notification:1.0</nc:capability>\n"
                + "    <nc:capability>urn:ietf:params:netconf:capability:interleave:1.0</nc:capability>\n"
                + "    <nc:capability>urn:ietf:params:netconf:capability:partial-lock:1.0</nc:capability>\n"
                + "    <nc:capability>urn:ietf:params:xml:ns:netconf:partial-lock:1.0"
                + "?module=ietf-netconf-partial-lock&amp;revision=2009-10-19</nc:capability>\n"
                + "    <nc:capability>urn:ietf:params:xml:ns:netmod:notification"
                + "?module=nc-notifications&amp;revision=2008-07-14</nc:capability>\n"
                + "    <nc:capability>urn:ietf:params:xml:ns:netconf:notification:1.0"
                + "?module=notifications&amp;revision=2008-07-14</nc:capability>\n" + "  </nc:capabilities>\n"
                + "  <nc:session-id>%s</nc:session-id>\n" + "</nc:hello>", sessionId);
    }

    public String rpcReplyOk() {
        return String.format("<rpc-reply message-id=\"%s\" xmlns=\"urn:ietf:params:xml:ns:netconf:base:1.0\">" + "<ok/>"
                + "</rpc-reply>", messageId);
    }

    public String rpcReply(NodeSet contents) {
        return String.format("<rpc-reply message-id=\"%s\" xmlns=\"urn:ietf:params:xml:ns:netconf:base:1.0\">"
                + "\n<data>\n%s\n</data>\n" + "</rpc-reply>", messageId, contents.toXMLString());
    }

}
