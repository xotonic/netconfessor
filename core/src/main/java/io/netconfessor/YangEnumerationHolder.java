package io.netconfessor;

/**
 * Required functional for elements that define enumerations in themselves body not as typedef
 */
public interface YangEnumerationHolder {

    /**
     * Create enum with first selected value in the value set.
     *
     * @return enumeration with value set in 1st position in order
     */
    YangEnumeration createWithFirstSelectedItem() throws JNCException;
}
