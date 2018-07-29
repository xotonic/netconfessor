
package io.netconfessor.gen.apConfig.config.interface_.vap.radius;

import io.netconfessor.Element;
import io.netconfessor.JNCException;
import io.netconfessor.Leaf;
import io.netconfessor.gen.apConfig.ApConfigSchema;
import io.netconfessor.gen.ietfInetTypes.DomainName;

/**
 * RADIUS authentication domain
 * <br/>
 * Namespace: http://eltex.org/ap
 *
 * @author jnc.py
 */
public class Domain extends Leaf {

    private static final long serialVersionUID = 1L;

    public DomainName value() {
        return (DomainName) getValue();
    }

    /**
     * Sets the value  leaf "domain",
     * @param domainValue used during instantiation.
     */
    public void value(DomainName domainValue) throws JNCException {
        setValue(domainValue);
    }

    public DomainName defaultValue() throws JNCException {
        return null;
    }

    public boolean hasDefaultValue() {
        return false;
    }

    public void instantiateValue(String stringRepresentation)
            throws JNCException {
        value(new DomainName(stringRepresentation));
    }

    public DomainName createValue(String stringRepresentation)
            throws JNCException {
        return new DomainName(stringRepresentation);
    }

    public Class<DomainName> valueClass() {
        return DomainName.class;
    }

    /**
     * Constructor for an empty Domain object.
     */
    public Domain() {
        super(ApConfigSchema.NAMESPACE, "domain");
    }

    /**
     * Constructor for an empty Domain object.
     */
    public Domain(DomainName value) {
        super(ApConfigSchema.NAMESPACE, "domain");
        this.value(value);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Domain clone() {
        return (Domain)cloneContent(new Domain());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Domain cloneShallow() {
        return (Domain)cloneShallowContent(new Domain());
    }

    public Domain cloneWithoutChildren() {
        return new Domain();
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
