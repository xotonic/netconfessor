
package io.netconfessor.gen.apConfig.config.interface_.common;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.YangInt32;
import io.netconfessor.gen.apConfig.ApConfigSchema;

/**
 * 
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class RouteTable extends Leaf {

    private static final long serialVersionUID = 1L;

    public YangInt32 value() {
        return (YangInt32) getValue();
    }

    /**
     * Sets the value  leaf "route-table",
     * @param routeTableValue used during instantiation.
     */
    public void value(YangInt32 routeTableValue) throws JNCException {
        setValue(routeTableValue);
    }

    public YangInt32 defaultValue() throws JNCException {
        return null;
    }

    public boolean hasDefaultValue() {
        return false;
    }

    public void instantiateValue(String stringRepresentation)
            throws JNCException {
        value(new YangInt32(stringRepresentation));
    }

    public YangInt32 createValue(String stringRepresentation)
            throws JNCException {
        return new YangInt32(stringRepresentation);
    }

    public Class<YangInt32> valueClass() {
        return YangInt32.class;
    }

    /**
     * Constructor for an empty RouteTable object.
     */
    public RouteTable() {
        super(ApConfigSchema.NAMESPACE, "route-table");
    }

    /**
     * Constructor for an empty RouteTable object.
     */
    public RouteTable(YangInt32 value) {
        super(ApConfigSchema.NAMESPACE, "route-table");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public RouteTable clone() {
        return (RouteTable)cloneContent(new RouteTable());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public RouteTable cloneShallow() {
        return (RouteTable)cloneShallowContent(new RouteTable());
    }

    public RouteTable cloneWithoutChildren() {
        return new RouteTable();
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
