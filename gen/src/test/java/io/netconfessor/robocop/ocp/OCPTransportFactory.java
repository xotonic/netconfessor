package io.netconfessor.robocop.ocp;

import io.netconfessor.DeviceUser;
import io.netconfessor.JNCException;
import io.netconfessor.Transport;
import io.netconfessor.TransportFactory;

import java.io.IOException;

public class OCPTransportFactory implements TransportFactory {


    private OCPTransport transport;

    public OCPTransportFactory(OCPTransport transport) {
        this.transport = transport;
    }

    @Override
    public void initialize(String ip, int port, int connectTimeout) throws IOException, JNCException {
        // we dont need connections
        System.out.println(String.format("Requested connection to %s:%s with timeout %s", ip, port, connectTimeout));
    }

    @Override
    public void auth(DeviceUser currentUser) throws IOException, JNCException {
        System.out.println("Authenticate " + currentUser);
        // do nothing
    }

    @Override
    public Transport createTransport() throws IOException, JNCException {
        return transport;
    }

    @Override
    public void close() {
        // nope
    }
}
