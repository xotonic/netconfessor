package io.netconfessor;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class YangBinaryTest {

    private final String[] values =
            {"ABCD", "test", "+/+=", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789+/="};
    private YangBinary[] ybs;

    @Before
    public void setUp() throws YangException {
        ybs = new YangBinary[values.length];
        for (int i = 0; i < ybs.length; i++) {
            ybs[i] = new YangBinary(values[i]);
        }
    }

    @Test
    public void testCloneShallow() throws YangException {
        YangBinary[] clones = new YangBinary[ybs.length];
        for (int i = 0; i < clones.length; i++) {
            clones[i] = ybs[i].cloneShallow();
            assertNotSame(ybs[i], clones[i]);
            assertNotSame(ybs[i].value, clones[i].value);
            assertEquals(ybs[i], clones[i]);
            assertEquals(ybs[i].value, clones[i].value);
        }
    }

    @Test
    public void testClone() throws YangException {
        YangBinary[] clones = new YangBinary[ybs.length];
        for (int i = 0; i < clones.length; i++) {
            clones[i] = (YangBinary) ybs[i].clone();
            assertNotSame(ybs[i], clones[i]);
            assertNotSame(ybs[i].value, clones[i].value);
            assertEquals(ybs[i], clones[i]);
            assertEquals(ybs[i].value, clones[i].value);
        }
    }

    @Test
    public void testToString() throws YangException {
        for (int i = 0; i < values.length; i++) {
            assertEquals(ybs[i].toString(), values[i]);
        }
    }

}
