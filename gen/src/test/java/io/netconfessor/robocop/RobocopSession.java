package io.netconfessor.robocop;

import com.netconfessor.gen.robocop.RobocopSchema;
import io.netconfessor.Device;

import io.netconfessor.DeviceUser;
import io.netconfessor.NetconfSession;
import io.netconfessor.robocop.ocp.OCPTransport;
import io.netconfessor.robocop.ocp.OCPTransportFactory;
import org.junit.rules.ExternalResource;

/**
 * Rule which setups session with a Robocop device.
 */
public class RobocopSession extends ExternalResource {

    private NetconfSession session;
    private OCPTransport transport;

    @Override
    protected void before() throws Throwable {
        final DeviceUser user = new DeviceUser("officer", "officer", "12345");
        transport = new OCPTransport();
        final Device device = new Device(new OCPTransportFactory(transport), "robocop-1", user, "4.4.4.4", 830);
        RobocopSchema.enable();
        device.connect("officer");
        device.newSession("a-session");
        session = device.getSession("a-session");
    }

    @Override
    protected void after() {
        try {
            session.closeSession();
        } catch (Exception e) {
        }
    }

    public NetconfSession session() {
        return session;
    }

    public OCPTransport transport() {
        return transport;
    }
}
