
package com.netconfessor.gen.apConfig.config.interface_.wlan.radio;

import com.netconfessor.gen.apConfig.ApConfigSchema;
import com.netconfessor.gen.apConfig.Enum_disabled_auto_forced;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;

/**
 * DFS support
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Dfs extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_disabled_auto_forced value() {
        return (Enum_disabled_auto_forced) getValue();
    }

    /**
     * Sets the value  leaf "dfs",
     * @param dfsValue used during instantiation.
     */
    public void value(Enum_disabled_auto_forced dfsValue) throws JNCException {
        setValue(dfsValue);
    }

    public Enum_disabled_auto_forced defaultValue() throws JNCException {
        return null;
    }

    public boolean hasDefaultValue() {
        return false;
    }

    public void instantiateValue(String stringRepresentation)
            throws JNCException {
        value(new Enum_disabled_auto_forced(stringRepresentation));
    }

    public Enum_disabled_auto_forced createValue(String stringRepresentation)
            throws JNCException {
        return new Enum_disabled_auto_forced(stringRepresentation);
    }

    public Class<Enum_disabled_auto_forced> valueClass() {
        return Enum_disabled_auto_forced.class;
    }

    /**
     * Constructor for an empty Dfs object.
     */
    public Dfs() {
        super(ApConfigSchema.NAMESPACE, "dfs");
    }

    /**
     * Constructor for an empty Dfs object.
     */
    public Dfs(Enum_disabled_auto_forced value) {
        super(ApConfigSchema.NAMESPACE, "dfs");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Dfs clone() {
        return (Dfs)cloneContent(new Dfs());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Dfs cloneShallow() {
        return (Dfs)cloneShallowContent(new Dfs());
    }

    public Dfs cloneWithoutChildren() {
        return new Dfs();
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
