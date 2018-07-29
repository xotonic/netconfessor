
package com.netconfessor.gen.robocop.primeDirectives;

import com.netconfessor.gen.robocop.RobocopSchema;
import com.netconfessor.gen.robocop.primeDirectives.directive.Code;
import com.netconfessor.gen.robocop.primeDirectives.directive.Enabled;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.NodeSet;
import io.netconfessor.YangElement;
import io.netconfessor.YangString;

/**
 * 
 * <br/>
 * Namespace: jnc:test:robocop
 *
 * @author jnc.py
 */
public class Directive extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child leaf "code".
     */
    public Code code = null;

    /**
     * Field for child leaf "enabled".
     */
    public Enabled enabled = null;

    /**
     * Constructor for an empty Directive object.
     */
    public Directive() {
        super(RobocopSchema.NAMESPACE, "directive");
    }

    /**
     * Constructor for an initialized Directive object,
     * 
     * @param codeValue Key argument of child.
     */
    public Directive(YangString codeValue) throws JNCException {
        super(RobocopSchema.NAMESPACE, "directive");
        Code code = new Code();
        code.setValue(codeValue);
        this.code = code;
        insertChild(code, childrenNames());
    }

    /**
     * Constructor for an initialized Directive object,
     * with String keys.
     * @param codeValue Key argument of child.
     */
    public Directive(String codeValue) throws JNCException {
        super(RobocopSchema.NAMESPACE, "directive");
        Code code = new Code();
        code.setValue(new YangString(codeValue));
        this.code = code;
        insertChild(code, childrenNames());
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Directive clone() {
        Directive copy;
        try {
            copy = new Directive(code.getValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (Directive)cloneContent(copy);
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Directive cloneShallow() {
        Directive copy;
        try {
            copy = new Directive(code.getValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (Directive)cloneShallowContent(copy);
    }

    public Directive cloneWithoutChildren() {
        return new Directive();
    }

    /**
     * @return An array with the identifiers of any key children
     */
    public String[] keyNames() {
        return new String[] {
            "code",
        };
    }

    /**
     * @return An array with the identifiers of any children, in order.
     */
    public String[] childrenNames() {
        return new String[] {
            "code",
            "enabled",
        };
    }

    /* Access methods for leaf child: "code". */

    /**
     * Adds leaf entry "code", using an existing object.
     * @param code The object to add.
     * @return The added child.
     */
    public Code addCode(Code code) throws JNCException {
        this.code = code;
        insertChild(code, childrenNames());
        return code;
    }

    /**
     * Adds leaf entry "code".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Code addCode() throws JNCException {
        Code code = new Code();
        this.code = code;
        insertChild(code, childrenNames());
        return code;
    }

    /**
     * Deletes leaf entry "code".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteCode() throws JNCException {
        this.code = null;
        String path = "code";
        return delete(path);
    }

    /* Access methods for optional leaf child: "enabled". */

    /**
     * Adds leaf entry "enabled", using an existing object.
     * @param enabled The object to add.
     * @return The added child.
     */
    public Enabled addEnabled(Enabled enabled) throws JNCException {
        this.enabled = enabled;
        insertChild(enabled, childrenNames());
        return enabled;
    }

    /**
     * Adds leaf entry "enabled".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Enabled addEnabled() throws JNCException {
        Enabled enabled = new Enabled();
        this.enabled = enabled;
        insertChild(enabled, childrenNames());
        return enabled;
    }

    /**
     * Deletes leaf entry "enabled".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteEnabled() throws JNCException {
        this.enabled = null;
        String path = "enabled";
        return delete(path);
    }

    /**
     * Support method for addChild.
     * Adds a child to this object.
     * 
     * @param child The child to add
     */
    public void addChild(Element child) {
        super.addChild(child);
        if (child instanceof Code) code = (Code)child;
        else if (child instanceof Enabled) enabled = (Enabled)child;
    }

}
