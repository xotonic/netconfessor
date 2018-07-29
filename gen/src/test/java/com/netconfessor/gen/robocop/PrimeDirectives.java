
package com.netconfessor.gen.robocop;

import com.netconfessor.gen.robocop.RobocopSchema;
import com.netconfessor.gen.robocop.primeDirectives.Directive;

import io.netconfessor.Element;
import io.netconfessor.ElementChildrenIterator;
import io.netconfessor.JNCException;
import io.netconfessor.NodeSet;
import io.netconfessor.YangContainer;
import io.netconfessor.YangElement;
import io.netconfessor.YangString;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * <br/>
 * Namespace: jnc:test:robocop
 *
 * @author jnc.py
 */
public class PrimeDirectives extends YangElement implements YangContainer {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for an empty PrimeDirectives object.
     */
    public PrimeDirectives() {
        super(RobocopSchema.NAMESPACE, "prime-directives");
        setDefaultPrefix();
        setPrefix(RobocopSchema.PREFIX);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public PrimeDirectives clone() {
        return (PrimeDirectives)cloneContent(new PrimeDirectives());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public PrimeDirectives cloneShallow() {
        return (PrimeDirectives)cloneShallowContent(new PrimeDirectives());
    }

    public PrimeDirectives cloneWithoutChildren() {
        return new PrimeDirectives();
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
            "directive",
        };
    }

    /* Access methods for list child: "directive". */

    /**
     * Gets list entry "directive", with specified keys.
     * @param codeValue Key argument of child.
     */
    public Directive getDirective(YangString codeValue) throws JNCException {
        String path = "directive[code='" + codeValue + "']";
        return (Directive)searchOne(path);
    }

    /**
     * Gets list entry "directive", with specified keys.
     * The keys are specified as strings.
     * @param codeValue Key argument of child.
     */
    public Directive getDirective(String codeValue) throws JNCException {
        String path = "directive[code='" + codeValue + "']";
        return (Directive)searchOne(path);
    }

    /**
     * Iterator method for the list "directive".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator<Directive> directiveIterator() {
        return new ElementChildrenIterator(children, "directive");
    }

    /**
     * Adds list entry "directive", using an existing object.
     * @param directive The object to add.
     * @return The added child.
     */
    public Directive addDirective(Directive directive) throws JNCException {
        insertChild(directive, childrenNames());
        return directive;
    }

    /**
     * Adds list entry "directive", with specified keys.
     * @param codeValue Key argument of child.
     * @return The added child.
     */
    public Directive addDirective(YangString codeValue) throws JNCException {
        Directive directive = new Directive(codeValue);
        return addDirective(directive);
    }

    /**
     * Adds list entry "directive", with specified keys.
     * The keys are specified as strings.
     * @param codeValue Key argument of child.
     * @return The added child.
     */
    public Directive addDirective(String codeValue) throws JNCException {
        Directive directive = new Directive(codeValue);
        return addDirective(directive);
    }

    /**
     * Adds list entry "directive".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Directive addDirective() throws JNCException {
        Directive directive = new Directive();
        insertChild(directive, childrenNames());
        return directive;
    }

    /**
     * Deletes list entry "directive", with specified keys.
     * @param codeValue Key argument of child.
     */
    public void deleteDirective(YangString codeValue) throws JNCException {
        String path = "directive[code='" + codeValue + "']";
        delete(path);
    }

    /**
     * Deletes list entry "directive", with specified keys.
     * The keys are specified as strings.
     * @param codeValue Key argument of child.
     */
    public void deleteDirective(String codeValue) throws JNCException {
        String path = "directive[code='" + codeValue + "']";
        delete(path);
    }

    @Override
    public boolean hasLists() {
        return true;
    }

    @Override
    public List<NodeSet> getLists() throws JNCException {
        List<NodeSet> lists = new LinkedList<>();
        lists.add(get("directive"));
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
