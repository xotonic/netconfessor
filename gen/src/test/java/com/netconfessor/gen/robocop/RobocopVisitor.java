
package com.netconfessor.gen.robocop;

import com.netconfessor.gen.robocop.Ammo;
import com.netconfessor.gen.robocop.AmmoVisitor;
import com.netconfessor.gen.robocop.PrimeDirectives;
import com.netconfessor.gen.robocop.PrimeDirectivesVisitor;

import io.netconfessor.Element;
import io.netconfessor.NodeSet;
import io.netconfessor.YangData;
import io.netconfessor.YangDataType;

/**
 * Visitor of module robocop(jnc:test:robocop)
 *
 * @author jnc.py
 */
public abstract class RobocopVisitor {

    private AmmoVisitor ammoVisitor;

    public abstract AmmoVisitor setupAmmo(YangData data);

    private PrimeDirectivesVisitor primeDirectivesVisitor;

    public abstract PrimeDirectivesVisitor setupPrimeDirectives(YangData data);

    public abstract void onAmmo(Ammo container);

    public abstract void onPrimeDirectives(PrimeDirectives container);

    public void setup() {
        ammoVisitor = setupAmmo(new YangData("ammo", "/robocop:ammo", null, false, YangDataType.container));
        if (ammoVisitor != null) {
            ammoVisitor.setup();
        }
        primeDirectivesVisitor = setupPrimeDirectives(new YangData("prime-directives", "/robocop:prime-directives", null, true, YangDataType.container));
        if (primeDirectivesVisitor != null) {
            primeDirectivesVisitor.setup();
        }
    }

    /**
     * Retrieve all config values in registered visitors
     * Before send to device you need sync result with older nodeset (empty allowed)
     */
    public NodeSet collectConfig() {
        NodeSet nodes = new NodeSet();
        if (primeDirectivesVisitor != null) {
            PrimeDirectives primeDirectives = primeDirectivesVisitor.collectConfig();
            if (primeDirectives != null) {
                nodes.add(primeDirectives);
            }
        }
        return nodes;
    }

    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element ammo = nodes.getFirstChild("ammo");
        if (ammo != null) {
            onAmmo((Ammo)ammo);
            if (ammoVisitor != null) {
                if (ammo.hasChildren()) {
                    ammoVisitor.visit(ammo.getChildren());
                }
            }
        }
        
        final Element primeDirectives = nodes.getFirstChild("prime-directives");
        if (primeDirectives != null) {
            onPrimeDirectives((PrimeDirectives)primeDirectives);
            if (primeDirectivesVisitor != null) {
                if (primeDirectives.hasChildren()) {
                    primeDirectivesVisitor.visit(primeDirectives.getChildren());
                }
            }
        }
    }

}
