
package io.netconfessor.gen.robocop;

import io.netconfessor.Element;
import io.netconfessor.LeafYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangDataType;
import io.netconfessor.YangInt32;
import io.netconfessor.gen.robocop.ammo.PistolAmmo;
import io.netconfessor.gen.robocop.ammo.RocketAmmo;

/**
 * Visitor of container ammo
 *
 * @author jnc.py
 */
public abstract class AmmoVisitor {

    public abstract void setupPistolAmmo(LeafYangData<YangInt32> data);

    public abstract void setupRocketAmmo(LeafYangData<YangInt32> data);

    public abstract void onPistolAmmo(PistolAmmo leaf);

    public abstract void onRocketAmmo(RocketAmmo leaf);

    public void setup() {
        setupPistolAmmo(new LeafYangData<>("pistol-ammo", "/robocop:ammo/robocop:pistol-ammo", "Pistol ammo count", false, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
        setupRocketAmmo(new LeafYangData<>("rocket-ammo", "/robocop:ammo/robocop:rocket-ammo", "Rocket launcher ammo count", false, YangDataType.leaf, "io.netconfessor.YangInt32", s -> new YangInt32(s)));
    }


    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element pistolAmmo = nodes.getFirstChild("pistol-ammo");
        if (pistolAmmo != null) {
            onPistolAmmo((PistolAmmo)pistolAmmo);
        }
        
        final Element rocketAmmo = nodes.getFirstChild("rocket-ammo");
        if (rocketAmmo != null) {
            onRocketAmmo((RocketAmmo)rocketAmmo);
        }
    }

}
