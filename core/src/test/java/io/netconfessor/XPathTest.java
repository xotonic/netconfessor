package io.netconfessor;


import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class XPathTest {

    @Test
    public void twoDimensionListTest() throws Exception {
        TestApConfigSchema.enable();


        YangElement data = new YangXMLParser().readFile("src/test/resources/rpc-reply-config.xml");
        final NodeSet anInterface = data.getChildren("interface");
        final Element portEth0InBr0 = anInterface.stream()
                .filter(e -> e.getChild("name").getValue().toString().equals("br0"))
                .findFirst().orElseThrow(() -> new Exception("br0 not found"))
                .getChild("bridge")
                .getChildren()
                    .stream()
                    .filter(e -> e.getChild("name").getValue().toString().equals("eth0"))
                    .findFirst()
                    .orElseThrow(() -> new Exception("eth0 not found"));
        Assert.assertEquals(
                "/config/interface[name='br0']/bridge/port[name='eth0']",
                new XPath(portEth0InBr0).toString());
    }

    @Test
    public void twoDimensionListWithShadowParentsTest() throws Exception {
        TestApConfigSchema.enable();


        YangElement data = new YangXMLParser().readFile("src/test/resources/rpc-reply-config.xml");
        data.shadowed = true;
        final Element br0 = data.getChildren("interface").stream()
                .filter(e -> e.getChild("name").getValue().toString().equals("br0")).findFirst()
                .orElseThrow(() -> new Exception("br0 not found"));
        br0.shadowed = true;
        final Element portEth0InBr0 = br0
                .getChild("bridge")
                .getChildren()
                    .stream()
                    .filter(e -> e.getChild("name").getValue().toString().equals("eth0"))
                    .findFirst()
                    .orElseThrow(() -> new Exception("eth0 not found"));
        Assert.assertEquals(
                "/bridge/port[name='eth0']",
                new XPath(portEth0InBr0).toString());

        Assert.assertEquals("/config/interface[name='br0']/bridge/port[name='eth0']",
                new XPath(portEth0InBr0, true).toString());


        Assert.assertEquals(new XPath(portEth0InBr0), new XPath(portEth0InBr0));
    }


    @Test
    public void stringElementEqualityTest() throws Exception {
        TestApConfigSchema.enable();


        YangElement data = new YangXMLParser().readFile("src/test/resources/rpc-reply-config.xml");
        final NodeSet anInterface = data.getChildren("interface");
        final Element portEth0InBr0 = anInterface.stream()
                .filter(e -> e.getChild("name").getValue().toString().equals("br0"))
                .findFirst().orElseThrow(() -> new Exception("br0 not found"))
                .getChild("bridge")
                .getChildren().stream().filter(e -> e.getChild("name").getValue().toString().equals("eth0"))
                .findFirst().orElseThrow(() -> new Exception("eth0 not found"));
        final XPath fromString = new XPath("/config/interface[name='br0']/bridge/port[name='eth0']");
        final XPath fromElement = new XPath(portEth0InBr0);
        Assert.assertEquals(fromString, fromElement);
        Assert.assertEquals(fromElement.tagpath(), portEth0InBr0.tagpath());
        Assert.assertEquals("/config/interface/bridge/port", fromString.withoutPredicates().toString());
        Assert.assertEquals("/config/interface[name='br0']/bridge/port", fromString.withoutLastPredicate().toString());


        final XPath longXPath =
                new XPath("/test1[name='obj1']/test2[name='obj2']/test3[name='obj3']/test4[name='obj4']");
        Assert.assertEquals("/test1[name='obj1']/test2[name='obj2']/test3/test4",
                longXPath.withoutPredicatesAfterTag("test2").toString());
    }

    @Test public void cutNs() throws Exception {
      Assert.assertEquals(
              new XPath("/rpc/edit-config/config/config/web-configurator/http-port"),
              XPath.cutNamespaces("/nc:rpc/nc:edit-config/nc:config"
                      + "/ap-config:config/ap-config:web-configurator/ap-config:http-port"));
    }


    @Test
    public void ns() throws Exception {
        Assert.assertEquals(
                "/nc:rpc/nc:edit-config/nc:config/ap-config:config/ap-config:web-configurator/ap-config:http-port",
                new XPath("/nc:rpc/nc:edit-config/nc:config/ap-config:config"
                        + "/ap-config:web-configurator/ap-config:http-port").toString());

        // another namespace ns:web-configurator
        Assert.assertNotEquals(
                "/nc:rpc/nc:edit-config/nc:config/ap-config:config/ns:web-configurator/ap-config:http-port",
                new XPath("/nc:rpc/nc:edit-config/nc:config/ap-config:config"
                        + "/ap-config:web-configurator/ap-config:http-port").toString());
    }


    @Test public void nsOfLast() throws Exception {
      Assert.assertEquals("ap-config",
              new XPath("/nc:rpc/nc:edit-config/nc:config/ap-config:config"
              + "/ap-config:web-configurator/ap-config:http-port").tailNamespace());
    }
}
