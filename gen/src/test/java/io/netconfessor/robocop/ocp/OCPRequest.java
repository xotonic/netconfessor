package io.netconfessor.robocop.ocp;

import java.util.regex.Pattern;

import static org.junit.Assert.assertTrue;

public class OCPRequest {

    private static final String MESSAGE_ID_REGEXP = "(?:.|\\n)*message-id=\"(\\d)\"(?:.|\\n)*";

    private String body;

    public OCPRequest(String body) {
        this.body = body;
    }

    private static String simpleTag(String tag) {
        return "<" + tag + "/>";
    }

    private static String openTag(String tag) {
        return "<" + tag + ">";
    }

    private static String closeTag(String tag) {
        return "</" + tag + ">";
    }

    private static String compositeTag(String tag, String content) {
        return openTag(tag) + content + closeTag(tag);
    }

    public String body() {
        return body;
    }

    public void body(String body) {
        this.body = body;
    }

    public int messageId() {
        final String messageIdStr = body.replaceFirst(MESSAGE_ID_REGEXP, "$1");
        try {
            return Integer.parseInt(messageIdStr);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public void assertIsHello() {
        assertTrue(body.startsWith("<hello xmlns=\"urn:ietf:params:xml:ns:netconf:base:1.0\">"));
        assertTrue(body.endsWith("</hello>"));
    }

    public boolean isCloseRpc() {
        return hasSimpleTag("nc:close-session");
    }

    public boolean isGetRpc() {
        return hasSimpleTag("nc:get");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OCPRequest{");
        sb.append("body='").append(body).append('\'');
        sb.append('}');
        return sb.toString();
    }

    private boolean hasSimpleTag(String tag) {
        final boolean simple = body.contains(simpleTag(tag));
        final String regex = compositeTag(tag, "[\\s\\n]*");
        final boolean compositeButEmpty = Pattern.compile(regex).matcher(body).find();
        return simple || compositeButEmpty;
    }


}
