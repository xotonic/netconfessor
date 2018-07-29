
package io.netconfessor.gen.apConfig.config.system;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.Enum_0_1;

/**
 * Full isolation
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class GlobalStationIsolation extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_0_1 value() {
        return (Enum_0_1) getValue();
    }

    /**
     * Sets the value  leaf "global-station-isolation",
     * @param globalStationIsolationValue used during instantiation.
     */
    public void value(Enum_0_1 globalStationIsolationValue) throws JNCException {
        setValue(globalStationIsolationValue);
    }

    public Enum_0_1 defaultValue() throws JNCException {
        return null;
    }

    public boolean hasDefaultValue() {
        return false;
    }

    public void instantiateValue(String stringRepresentation)
            throws JNCException {
        value(new Enum_0_1(stringRepresentation));
    }

    public Enum_0_1 createValue(String stringRepresentation)
            throws JNCException {
        return new Enum_0_1(stringRepresentation);
    }

    public Class<Enum_0_1> valueClass() {
        return Enum_0_1.class;
    }

    /**
     * Constructor for an empty GlobalStationIsolation object.
     */
    public GlobalStationIsolation() {
        super(ApConfigSchema.NAMESPACE, "global-station-isolation");
    }

    /**
     * Constructor for an empty GlobalStationIsolation object.
     */
    public GlobalStationIsolation(Enum_0_1 value) {
        super(ApConfigSchema.NAMESPACE, "global-station-isolation");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public GlobalStationIsolation clone() {
        return (GlobalStationIsolation)cloneContent(new GlobalStationIsolation());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public GlobalStationIsolation cloneShallow() {
        return (GlobalStationIsolation)cloneShallowContent(new GlobalStationIsolation());
    }

    public GlobalStationIsolation cloneWithoutChildren() {
        return new GlobalStationIsolation();
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
