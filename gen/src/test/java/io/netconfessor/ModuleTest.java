package io.netconfessor;



import io.netconfessor.gen.robocop.Ammo;
import io.netconfessor.gen.robocop.OffenseDetected;
import io.netconfessor.gen.robocop.PrimeDirectives;
import io.netconfessor.gen.robocop.RobocopSchema;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class ModuleTest {

    @Test
    public void test() throws Exception {
        RobocopSchema.enable();

        final Module module = new Module(RobocopSchema.NAMESPACE);
        module.load();

        assertArrayEquals(
                new String[] {"ammo", "prime-directives", "offense-detected"},
                module.childrenNames());


        final Element state = module.addChild("ammo");
        final Element config = module.addChild("prime-directives");
        final Element notification = module.addChild("offense-detected");

        assertTrue(state instanceof Ammo);
        assertTrue(config instanceof PrimeDirectives);
        assertTrue(notification instanceof OffenseDetected);


        Module copy = module.cloneWithoutChildren();
        assertArrayEquals(module.childrenNames(), copy.childrenNames());

    }

}
