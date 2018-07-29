
package io.netconfessor.gen.apConfig;

import io.netconfessor.Element;
import io.netconfessor.NodeSet;
import io.netconfessor.YangData;
import io.netconfessor.YangDataType;
import io.netconfessor.gen.apConfig.lastWlanScanResults.Cell;
import io.netconfessor.gen.apConfig.lastWlanScanResults.CellVisitor;

/**
 * Visitor of container last-wlan-scan-results
 *
 * @author jnc.py
 */
public abstract class LastWlanScanResultsVisitor {

    public abstract CellVisitor setupCell(YangData data);

    private CellVisitor cellVisitor;

    public abstract void onNextCell(Cell item);

    protected void onStartCellList() {
    }

    protected void onStopCellList() {
    }

    public void setup() {
        cellVisitor = setupCell(new YangData("cell", "/ap-config:last-wlan-scan-results/ap-config:cell", null, false, YangDataType.list));
        if (cellVisitor != null) {
            cellVisitor.setup();
        }
    }


    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        onStartCellList();
        for (Element node : nodes.getChildren("cell")) {
            onNextCell((Cell)node);
            if (cellVisitor != null) {
                if (node.hasChildren()) {
                    cellVisitor.visit(node.getChildren());
                }
            }
        }
        onStopCellList();
    }

}
