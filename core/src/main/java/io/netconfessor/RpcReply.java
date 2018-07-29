package io.netconfessor;

public class RpcReply {

    private NodeSet reply;

    public RpcReply(NodeSet reply) {
        this.reply = reply;
    }

    public boolean isError() {
        return reply.stream()
                .anyMatch(e -> e.name.equals("rpc-error") && Element.NETCONF_NAMESPACE.equals(e.namespace));
    }

    public RpcError[] getErrors() {
        return reply.stream()
                .map(e -> new RpcError(e, e.prefixes))
                .toArray(i -> new RpcError[i]);
    }

    public NodeSet getReply() {
        return reply;
    }

}
