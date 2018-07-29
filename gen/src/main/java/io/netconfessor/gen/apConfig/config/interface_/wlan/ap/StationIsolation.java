
package io.netconfessor.gen.apConfig.config.interface_.wlan.ap;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.Enum_0_1;

/**
 * Station isolation
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class StationIsolation extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_0_1 value() {
        return (Enum_0_1) getValue();
    }

    /**
     * Sets the value  leaf "station-isolation",
     * @param stationIsolationValue used during instantiation.
     */
    public void value(Enum_0_1 stationIsolationValue) throws JNCException {
        setValue(stationIsolationValue);
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
     * Constructor for an empty StationIsolation object.
     */
    public StationIsolation() {
        super(ApConfigSchema.NAMESPACE, "station-isolation");
    }

    /**
     * Constructor for an empty StationIsolation object.
     */
    public StationIsolation(Enum_0_1 value) {
        super(ApConfigSchema.NAMESPACE, "station-isolation");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public StationIsolation clone() {
        return (StationIsolation)cloneContent(new StationIsolation());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public StationIsolation cloneShallow() {
        return (StationIsolation)cloneShallowContent(new StationIsolation());
    }

    public StationIsolation cloneWithoutChildren() {
        return new StationIsolation();
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
