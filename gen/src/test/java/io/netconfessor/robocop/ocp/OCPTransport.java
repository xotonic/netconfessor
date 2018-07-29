package io.netconfessor.robocop.ocp;

import io.netconfessor.IOSubscriber;
import io.netconfessor.JNCException;
import io.netconfessor.NodeSet;
import io.netconfessor.Transport;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.fail;

public class OCPTransport implements Transport {

    private int sessionIdCounter = 0;
    private OCPRequest currentRequest = new OCPRequest("<!-- No any request -->");
    private ByteArrayOutputStream baos = null;
    private PrintStream buffer = null;
    private TransportState state;


    private NodeSet getReply = new NodeSet();

    public OCPTransport() {
        try {
            baos = new ByteArrayOutputStream();
            buffer = new PrintStream(baos, true, "UTF-8");
            state = TransportState.initial;
        } catch (Exception e) {
            fail();
        }
    }

    @Override
    public boolean ready() throws IOException {
        return true;
    }

    @Override
    public StringBuffer readOne() throws IOException, JNCException {

        final StringBuffer reply = createReply();
        System.out.println("<!-- Reply: -->");
        System.out.println(reply);
        System.out.println("<!-- Reply end -->");
        return reply;

    }

    private StringBuffer createReply() {
        OCPReply reply = new OCPReply(currentRequest.messageId());
        switch (state) {

            case helloRequested:
                state = TransportState.helloReplied;
                sessionIdCounter++;
                return new StringBuffer(OCPReply.hello(sessionIdCounter));

            case closeRequested:

                state = TransportState.closeReplied;
                return new StringBuffer(reply.rpcReplyOk());

            case getRequested:
                return new StringBuffer(reply.rpcReply(getReply));

            case initial:
            case helloReplied:
            case createSubRequested:
            case createSubReplied:
            case closeReplied:
            default:
                return new StringBuffer();
        }
    }

    @Override
    public void print(long i) {
        buffer.print(i);
    }

    @Override
    public void print(String s) {
        buffer.print(s);
    }

    @Override
    public void println(int i) {
        buffer.println(i);
    }

    @Override
    public void println(String s) {
        buffer.println(s);
    }

    @Override
    public void flush() {
        System.out.flush();
        buffer.flush();

        currentRequest = new OCPRequest(baos.toString());

        System.out.println("\n<!-- Flush event -->");
        System.out.println(currentRequest.body());
        System.out.println("<!-- Request end -->\n");

        // test hello request
        if (state == TransportState.initial) {
            currentRequest.assertIsHello();
            state = TransportState.helloRequested;
        } else {
            if (currentRequest.isCloseRpc()) {
                state = TransportState.closeRequested;
            } else if (currentRequest.isGetRpc()) {
                state = TransportState.getRequested;
            }
        }

        baos.reset();
    }

    @Override
    public void close() {
        System.out.println("<!-- Close -->");
        buffer.close();
    }

    @Override
    public long getReadTimeout() {
        return 0;
    }

    @Override
    public void setReadTimeout(int readTimeout) {

    }

    @Override
    public void addSubscriber(IOSubscriber s) {

    }

    @Override
    public void delSubscriber(IOSubscriber s) {

    }

    public void setGetReply(NodeSet getReply) {
        this.getReply = getReply;
    }

    enum TransportState {
        initial,
        helloRequested,
        helloReplied,
        getRequested,
        createSubRequested,
        createSubReplied,
        closeRequested,
        closeReplied
    }
}
