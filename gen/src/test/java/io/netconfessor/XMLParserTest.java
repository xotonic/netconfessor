package io.netconfessor;


import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.ietfInetTypes.InetSchema;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class XMLParserTest {


    @Before
    public void tearUp() throws Exception {
        ApConfigSchema.enable();
        InetSchema.enable();
    }


    @Test
    public void parse2() throws Exception {
        // because this reply has leaf-list in schema
        YangElement data = new YangXMLParser().readFile("src/test/resources/rpc-reply-config.xml");

        final Object versionValue = data.get("config-description").get("version").first().getValue();
        assertTrue(versionValue instanceof YangString);
    }
}
