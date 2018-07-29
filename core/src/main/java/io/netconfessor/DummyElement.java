package io.netconfessor;

/**
 * Used to instantiate YangElement in sync-methods and in tests
 */
class DummyElement extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for the container
     */
    DummyElement(String ns, String name) {
        super(ns, name);
        setDefaultPrefix();
    }

    /**
     * Structure information. An array of the children names.
     */
    @Override
    public String[] childrenNames() {
        return new String[0];
    }

    @Override
    public Element cloneWithoutChildren() {
        return new DummyElement(DUMMY, DUMMY_LC);
    }

    /**
     * Structure information. An array of the names of the key children.
     */
    @Override
    public String[] keyNames() {
        return new String[0];
    }

    /**
     * Clones this object, returning an exact copy.
     *
     * @return A clone of the object.
     */
    @Override
    public Object clone() {
        try {
            return cloneContent(new DummyElement(namespace, name));
        } catch (final Exception e) {
            return null;
        }
    }

    /**
     * Clones this object, returning a shallow copy.
     *
     * @return A clone of the object. Children are not included.
     */
    @Override
    public Element cloneShallow() {
        try {
            return cloneShallowContent(new DummyElement(namespace, name));
        } catch (final Exception e) {
            return null;
        }
    }
}
