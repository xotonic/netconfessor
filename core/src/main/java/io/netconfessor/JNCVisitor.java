package io.netconfessor;

public interface JNCVisitor {
    default void visit(NodeSet nodes) {
    }
}
