package io.netconfessor;

public interface YangTypeFactory<T extends YangType> {
    T createFromString(String representation);

}
