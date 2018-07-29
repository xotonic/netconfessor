package io.netconfessor.robocop;

import io.netconfessor.gen.robocop.Ammo;
import io.netconfessor.gen.robocop.PrimeDirectives;
import io.netconfessor.gen.robocop.primeDirectives.Directive;
import io.netconfessor.NodeSet;


import io.netconfessor.YangBoolean;
import io.netconfessor.YangInt32;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorsTest {

    @Rule
    public RobocopSession robocop = new RobocopSession();

    @Test
    public void setupVisitCollectTest() throws Exception {

        final NodeSet serverReply = new NodeSet();
        final Ammo ammo = new Ammo();
        ammo.addPistolAmmo().value(new YangInt32(10));
        ammo.addRocketAmmo().value(new YangInt32(5));
        serverReply.add(ammo);
        final PrimeDirectives pd = new PrimeDirectives();
        pd.addDirective("serve").addEnabled().value(new YangBoolean(true));
        pd.addDirective("protect").addEnabled().value(new YangBoolean(false));
        serverReply.add(pd);

        RobocopPrinter printer = new RobocopPrinter();

        robocop.transport().setGetReply(serverReply);
        final NodeSet clientReply = robocop.session().get();

        // test traverse yang tree
        // we log only leaves here

        printer.setup();
        assertEquals("pistol-ammo->rocket-ammo->code->enabled", printer.spec());

        // test populate algorithm

        printer.visit(clientReply);
        assertEquals("ammo->pistol-ammo->rocket-ammo->prime-directives->[->directive->directive->]", printer.reply());

        // test collect algorithm

        final NodeSet collected = printer.collectConfig();

        PrimeDirectives expected = new PrimeDirectives();

        Directive dir;

        dir = expected.addDirective("deleteme1");
        dir.markDelete();

        dir = expected.addDirective("deleteme2");
        dir.markDelete();

        dir = expected.addDirective("createme1");
        dir.addEnabled().value(new YangBoolean(false));
        dir.markCreate();

        dir = expected.addDirective("createme2");
        dir.addEnabled().value(new YangBoolean(false));
        dir.markCreate();

        dir = expected.addDirective("createme3");
        dir.addEnabled().value(new YangBoolean(false));
        dir.markCreate();

        dir = expected.addDirective("createme4");
        dir.addEnabled().value(new YangBoolean(false));
        dir.markCreate();

        dir = expected.addDirective("createme5");
        dir.addEnabled().value(new YangBoolean(false));
        dir.markCreate();


        assertEquals(expected.toXMLString(), collected.toXMLString());
    }

//    @Test
//    public void syncTest() throws Exception {
//
//        String editConfigExpected =
//                "<prime-directives xmlns=\"jnc:test:robocop\" xmlns:robocop=\"jnc:test:robocop\">\n"
//                        + "  <directive nc:operation=\"delete\">\n"
//                        + "    <code>serve</code>\n"
//                        + "  </directive>\n"
//                        + "  <directive nc:operation=\"create\">\n"
//                        + "    <code>newDirective</code>\n"
//                        + "    <enabled>true</enabled>\n"
//                        + "  </directive>\n"
//                        + "</prime-directives>\n";
//
//        NodeSet editConfigExpected2 = new NodeSet();
//        PrimeDirectives primes = new PrimeDirectives();
//        primes.addDirective("deleteme0").markDelete();
//        final Directive newDirective = primes.addDirective("createme0");
//        newDirective.addEnabled().value(new YangBoolean(true));
//        newDirective.markCreate();
//        editConfigExpected2.add(primes);
//
//        final NodeSet serverReply = new NodeSet();
//        final PrimeDirectives pd = new PrimeDirectives();
//        pd.addDirective("serve").addEnabled().value(new YangBoolean(false)); // device directive
//        serverReply.add(pd);
//        RobocopPrinter printer = new RobocopPrinter();
//        //printer.addNewDirective("newDirective", true);
//        printer.setup();
//        robocop.transport().setGetReply(serverReply);
//
//        final NodeSet clientReply = robocop.session().get();
//        printer.visit(clientReply);
//        final NodeSet changed = printer.collectConfig();
//
//        //final NodeSet sync = YangElement.sync(clientReply, changed);
//
////        assertEquals(editConfigExpected, changed.toXMLString());
//        assertEquals(editConfigExpected2.toXMLString(), changed.toXMLString());
//    }


    @Test(timeout = 1_000)
    public void hasNextTest() throws Exception {
        final EmptyListRobocopPrinter printer = new EmptyListRobocopPrinter();
        printer.setup();
        printer.collectConfig();
    }
}
