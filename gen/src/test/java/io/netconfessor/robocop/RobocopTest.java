package io.netconfessor.robocop;

import io.netconfessor.gen.robocop.Ammo;
import io.netconfessor.gen.robocop.PrimeDirectives;
import io.netconfessor.gen.robocop.RobocopSchema;
import io.netconfessor.*;

import io.netconfessor.robocop.ocp.OCPTransport;
import io.netconfessor.robocop.ocp.OCPTransportFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test using fake device - RoboCop and fake transport protocol - OCP (Omni Consumer Products).
 */
public class RobocopTest {

    @Test
    public void clientSendsHelloAndCloseRPC() throws Exception {
        final DeviceUser user = new DeviceUser("officer", "officer", "12345");
        final Device device =
                new Device(new OCPTransportFactory(new OCPTransport()), "robocop-1", user, "4.4.4.4", 830);
        RobocopSchema.enable();
        device.connect("officer");
        device.newSession("a-session");
        NetconfSession ncSession = device.getSession("a-session");
        ncSession.closeSession();
    }

    @Test
    public void getReplyIsIdenticalAtBothSides() throws Exception {

        final NodeSet serverReply = new NodeSet();
        final Ammo ammo = new Ammo();
        ammo.addPistolAmmo().value(new YangInt32(10));
        ammo.addRocketAmmo().value(new YangInt32(5));
        serverReply.add(ammo);
        final PrimeDirectives pd = new PrimeDirectives();
        pd.addDirective("serve").addEnabled().value(new YangBoolean(true));
        pd.addDirective("protect").addEnabled().value(new YangBoolean(false));
        serverReply.add(pd);

        final DeviceUser user = new DeviceUser("officer", "officer", "12345");
        final OCPTransport transport = new OCPTransport();
        transport.setGetReply(serverReply);
        final Device device = new Device(new OCPTransportFactory(transport), "robocop-1", user, "4.4.4.4", 830);
        RobocopSchema.enable();
        device.connect("officer");
        device.newSession("a-session");
        NetconfSession ncSession = device.getSession("a-session");
        final NodeSet clientReply = ncSession.get();
        ncSession.closeSession();

        assertEquals(serverReply.toXMLString(), clientReply.toXMLString());
    }

}
