
package com.netconfessor.gen.apConfig;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.lastWlanScanResults.Cell;

import io.netconfessor.Element;
import io.netconfessor.ElementChildrenIterator;
import io.netconfessor.JNCException;
import io.netconfessor.NodeSet;
import io.netconfessor.YangContainer;
import io.netconfessor.YangElement;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class LastWlanScanResults extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty LastWlanScanResults object.
     */
    public LastWlanScanResults() {
        super(ApConfigSchema.NAMESPACE, "last-wlan-scan-results");
        setDefaultPrefix();
        setPrefix(ApConfigSchema.PREFIX);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public LastWlanScanResults clone() {
        return (LastWlanScanResults)cloneContent(new LastWlanScanResults());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public LastWlanScanResults cloneShallow() {
        return (LastWlanScanResults)cloneShallowContent(new LastWlanScanResults());
    }

    public LastWlanScanResults cloneWithoutChildren() {
        return new LastWlanScanResults();
    }

    /**
     * @return An array with the identifiers of any key children
     */
    public String[] keyNames() {
        return null;
    }

    /**
     * @return An array with the identifiers of any children, in order.
     */
    public String[] childrenNames() {
        return new String[] {
            "cell",
        };
    }

    /* Access methods for list child: "cell". */

    /**
     * Gets list entry "cell", with specified keys.
     */
    public Cell getCell() throws JNCException {
        String path = "cell";
        return (Cell)searchOne(path);
    }

    /**
     * Iterator method for the list "cell".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator<Cell> cellIterator() {
        return new ElementChildrenIterator(children, "cell");
    }

    /**
     * Adds list entry "cell", using an existing object.
     * @param cell The object to add.
     * @return The added child.
     */
    public Cell addCell(Cell cell) throws JNCException {
        insertChild(cell, childrenNames());
        return cell;
    }

    /**
     * Adds list entry "cell".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Cell addCell() throws JNCException {
        Cell cell = new Cell();
        insertChild(cell, childrenNames());
        return cell;
    }

    /**
     * Deletes list entry "cell", with specified keys.
     */
    public void deleteCell() throws JNCException {
        String path = "cell";
        delete(path);
    }

    @Override
    public boolean hasLists() {
        return true;
    }

    @Override
    public List<NodeSet> getLists() throws JNCException {
        List<NodeSet> lists = new LinkedList<>();
        lists.add(get("cell"));
        return lists;
    }

    /**
     * Support method for addChild.
     * Adds a child to this object.
     * 
     * @param child The child to add
     */
    public void addChild(Element child) {
        super.addChild(child);
    }

}
