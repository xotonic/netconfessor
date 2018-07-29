
package io.netconfessor.gen.apConfig.config.interface_.wlan.ap.radius;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.apConfig.Enum_0_1;

/**
 * Enable periodic accounting updates
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class AcctPeriodic extends Leaf {

    private static final long serialVersionUID = 1L;

    public Enum_0_1 value() {
        return (Enum_0_1) getValue();
    }

    /**
     * Sets the value  leaf "acct-periodic",
     * @param acctPeriodicValue used during instantiation.
     */
    public void value(Enum_0_1 acctPeriodicValue) throws JNCException {
        setValue(acctPeriodicValue);
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
     * Constructor for an empty AcctPeriodic object.
     */
    public AcctPeriodic() {
        super(ApConfigSchema.NAMESPACE, "acct-periodic");
    }

    /**
     * Constructor for an empty AcctPeriodic object.
     */
    public AcctPeriodic(Enum_0_1 value) {
        super(ApConfigSchema.NAMESPACE, "acct-periodic");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public AcctPeriodic clone() {
        return (AcctPeriodic)cloneContent(new AcctPeriodic());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public AcctPeriodic cloneShallow() {
        return (AcctPeriodic)cloneShallowContent(new AcctPeriodic());
    }

    public AcctPeriodic cloneWithoutChildren() {
        return new AcctPeriodic();
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
