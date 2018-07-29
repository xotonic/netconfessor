package io.netconfessor;

import java.util.List;

public interface YangContainer {
    boolean hasLists();

    List<NodeSet> getLists() throws JNCException;
}
