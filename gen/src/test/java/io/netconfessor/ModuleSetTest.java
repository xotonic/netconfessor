package io.netconfessor;


import com.netconfessor.gen.robocop.RobocopSchema;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class ModuleSetTest {

    @Test
    public void test() throws Exception {
        RobocopSchema.enable();
        final ModuleSet set = new ModuleSet();
        set.addModule(new Module(RobocopSchema.NAMESPACE));
        set.loadAll();
        String[] actuals = set.childrenNames();
        assertArrayEquals(Arrays.toString(actuals),new String[] {"robocop"}, actuals);

    }
}
