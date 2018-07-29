package io.netconfessor;

import org.junit.Assert;
import org.junit.Test;

public class RpcErrorTest {

    @Test
    public void resolvePath() throws Exception {
        final String reply =
                " <nc:rpc-reply xmlns:nc=\"urn:ietf:params:xml:ns:netconf:base:1.0\" "
                        + "xmlns:ap-config=\"http://eltex.org/ap\" "
                        + "xmlns:ncx=\"http://netconfcentral.org/ns/yuma-ncx\" "
                        + "xmlns=\"urn:ietf:params:xml:ns:netconf:base:1.0\" "
                        + "nc:message-id=\"2\">\n"
                        + "  <nc:rpc-error>\n"
                        + "    <nc:error-type>protocol</nc:error-type>\n"
                        + "    <nc:error-tag>invalid-value</nc:error-tag>\n"
                        + "    <nc:error-severity>error</nc:error-severity>\n"
                        + "    <nc:error-app-tag>not-in-range</nc:error-app-tag>\n"
                        + "    <nc:error-path>/nc:rpc/nc:edit-config/nc:config/ap-config:config/ap-config:web-configurator/ap-config:http-port</nc:error-path>\n"
                        + "    <nc:error-message>value not in range</nc:error-message>\n"
                        + "    <nc:error-info>\n"
                        + "      <bad-value xmlns=\"http://netconfcentral.org/ns/yuma-ncx\">80000</bad-value>\n"
                        + "      <error-number xmlns=\"http://netconfcentral.org/ns/yuma-ncx\">288</error-number>\n"
                        + "    </nc:error-info>\n"
                        + "  </nc:rpc-error>\n"
                        + "</nc:rpc-reply>";

        XMLParser parser = new XMLParser();
        final JNCException jncException = new JNCException(JNCException.RPC_REPLY_ERROR, parser.parse(reply));
        Assert.assertEquals(new PrefixMap(new Prefix[] {new Prefix("nc", "urn:ietf:params:xml:ns:netconf:base:1.0"),
                        new Prefix("ap-config", "http://eltex.org/ap"),
                        new Prefix("ncx", "http://netconfcentral.org/ns/yuma-ncx"),
                        new Prefix("", "urn:ietf:params:xml:ns:netconf:base:1.0"), }).toString(),
                jncException.getRpcErrors()[0].prefixes().toString());

    }
}
