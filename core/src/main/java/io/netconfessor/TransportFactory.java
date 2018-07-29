package io.netconfessor;

import java.io.IOException;

/**
 * Essense that handles transport protocol specifics.
 */
public interface TransportFactory {

    /**
     * Initialize connection or anything else.
     */
    void initialize(String ip, int port, int connectTimeout) throws IOException, JNCException;

    /**
     * Handle authentication. You can throw an exception if something gone wrong.
     *
     * @see JNCException#AUTH_FAILED
     */
    void auth(DeviceUser currentUser) throws IOException, JNCException;


    /**
     * Create main accessor which Netconf protocol layer will use.
     */
    Transport createTransport() throws IOException, JNCException;

    /**
     * Close connection.
     */
    void close();
}
