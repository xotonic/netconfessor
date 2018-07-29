package io.netconfessor.robocop;

import com.netconfessor.gen.robocop.PrimeDirectives;
import com.netconfessor.gen.robocop.primeDirectives.Directive;
import io.netconfessor.NodeSet;

import io.netconfessor.YangBoolean;
import io.netconfessor.YangElement;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasicTest {

    @Test
    public void syncMergeTest() throws Exception {
        NodeSet running = new NodeSet();
        PrimeDirectives rDirectives = new PrimeDirectives();
        rDirectives.addDirective("runningDir0");
        rDirectives.addDirective("runningDir1");
        rDirectives.addDirective("runningDir2");
        rDirectives.addDirective("runningDir3");
        running.add(rDirectives);

        NodeSet candidate = new NodeSet();
        PrimeDirectives cDirectives = new PrimeDirectives();
        cDirectives.addDirective("candidateDir0");
        candidate.add(cDirectives);

        System.out.println(YangElement.sync(running, candidate).toXMLString());

    }

    @Test
    public void removeNonKeysIfMarkedToDeleteTest() throws Exception {
        Directive marked = new Directive("key");
        marked.addEnabled().value(new YangBoolean(true));
        marked.markDelete();
        marked.removeNonKeysIfMarkedToDelete();

        Directive expected = new Directive("key");
        expected.markDelete();

        assertEquals(expected.toXMLString(), marked.toXMLString());
    }

    @Test
    public void containsOnlyKeysTest() throws Exception {
        final Directive dir = new Directive("key1");
        assertTrue(dir.containsKeysOnly());
        dir.addEnabled();
        assertFalse(dir.containsKeysOnly());
    }
}
