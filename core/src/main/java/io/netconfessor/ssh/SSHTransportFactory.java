package io.netconfessor.ssh;

import io.netconfessor.*;

import java.io.IOException;

public class SSHTransportFactory implements TransportFactory {

    /**
     * Time to wait for read, in milliseconds.
     */
    protected int defaultReadTimeout = 0;

    protected transient SSHConnection con = null;

    @Override
    public void initialize(String ip, int port, int connectTimeout) throws IOException, JNCException {
        con = new SSHConnection(ip, port, connectTimeout);
    }

    @Override
    public void auth(DeviceUser currentUser) throws IOException, JNCException {

        if (currentUser.getPassword() != null) {
            con.authenticateWithPassword(currentUser.getRemoteuser(), currentUser.getPassword());
        } else if (currentUser.getPemPrivateKey() != null) {
            con.authenticateWithPublicKey(currentUser.getRemoteuser(), currentUser.getPemPrivateKey(),
                    currentUser.getKeyPassPhrase());
        } else if (currentUser.getPemFile() != null) {
            con.authenticateWithPublicKeyFile(currentUser.getRemoteuser(), currentUser.getPemFile(),
                    currentUser.getKeyPassPhrase());
        }
    }

    @Override
    public Transport createTransport() throws IOException, JNCException {
        return new SSHSession(con, defaultReadTimeout);
    }

    @Override
    public void close() {
        if (con != null) {
            con.close();
            con = null;
        }
    }


    /**
     * Whenever new {@link NetconfSession} objects are created through {@link #createTransport()) set
     * this timeout value (milliseconds) as the readTimeout value
     */
    public void setDefaultReadTimeout(int defaultReadTimeout) {
        this.defaultReadTimeout = defaultReadTimeout;
    }
}
