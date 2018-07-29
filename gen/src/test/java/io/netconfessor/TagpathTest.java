package io.netconfessor;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TagpathTest {

    @Test
    public void concat() {
        Tagpath head = new Tagpath("root/child1/");
        Tagpath res = new Tagpath(head, "grandchild");
        assertEquals("root/child1/grandchild", res.toString());
        assertArrayEquals(new String[] {"root", "child1", "grandchild"}, res.p);
    }


    @Test
    public void concat2() {
        Tagpath head = new Tagpath("root/child1/");
        Tagpath res = new Tagpath(head, "grandchild/beer");
        assertEquals("root/child1/grandchild/beer", res.toString());
        assertArrayEquals(new String[] {"root", "child1", "grandchild", "beer"}, res.p);
    }

}
