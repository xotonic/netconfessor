package io.netconfessor;

public interface RpcErrorDescriber<DESCRIPTION> {
    DESCRIPTION describe(RpcError rpcError);
}
