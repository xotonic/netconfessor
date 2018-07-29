
package io.netconfessor.gen.robocop;

import io.netconfessor.Element;
import io.netconfessor.NodeSet;
import io.netconfessor.YangData;
import io.netconfessor.YangDataType;
import io.netconfessor.gen.robocop.PrimeDirectives;
import io.netconfessor.gen.robocop.primeDirectives.Directive;
import io.netconfessor.gen.robocop.primeDirectives.DirectiveVisitor;

/**
 * Visitor of container prime-directives
 *
 * @author jnc.py
 */
public abstract class PrimeDirectivesVisitor {

    public abstract DirectiveVisitor setupDirective(YangData data);

    private DirectiveVisitor directiveVisitor;

    public abstract void onNextDirective(Directive item);

    protected void onStartDirectiveList() {
    }

    protected void onStopDirectiveList() {
    }

    abstract protected Directive getNextDirective();

    public void setup() {
        directiveVisitor = setupDirective(new YangData("directive", "/robocop:prime-directives/robocop:directive", null, true, YangDataType.list));
        if (directiveVisitor != null) {
            directiveVisitor.setup();
        }
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public PrimeDirectives collectConfig() {
        PrimeDirectives primeDirectives = new PrimeDirectives();
        Directive directive;
        while((directive = getNextDirective()) != null) {
            directive.removeNonKeysIfMarkedToDelete();
            primeDirectives.addDirective(directive);
        }
        if (primeDirectives.hasChildren()) {
           return primeDirectives;
        } else {
           return null;
        }
    }

    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        onStartDirectiveList();
        for (Element node : nodes.getChildren("directive")) {
            onNextDirective((Directive)node);
            if (directiveVisitor != null) {
                if (node.hasChildren()) {
                    directiveVisitor.visit(node.getChildren());
                }
            }
        }
        onStopDirectiveList();
    }

}
