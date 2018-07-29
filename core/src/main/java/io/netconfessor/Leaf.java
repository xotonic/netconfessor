package io.netconfessor;

/**
 * This class represents leaves in data model aware Element trees.
 * <p>
 * YangElement classes generated from the JNC pyang plugin may instantiate this
 * class for leaf values.
 *
 * @see YangElement
 */
public class Leaf extends YangElement {

    private static final long serialVersionUID = 1L;
    // cache the Tagpath and the SchemaNode
    private Tagpath tp = null;
    private SchemaNode n = null;
    public Leaf(String ns, String name) {
        super(ns, name);
    }

    @Override
    protected void encode(Transport out, boolean newlineAtEnd, Capabilities capas) throws JNCException {
        if (RevisionInfo.olderRevisionSupportEnabled && capas != null) {
            if (tp == null) {
                tp = tagpath();
            }
            if (n == null) {
                n = SchemaTree.lookup(namespace, tp);
            }
            final String rev = capas.getRevision(namespace);
            if (n != null && n.revInfo != null) {
                for (final RevisionInfo r : n.revInfo) {
                    if (r.introduced.compareTo(rev) > 0) {
                        // This node was somehow modified
                        switch (r.type) {
                            case RevisionInfo.R_NODE_ADDED:
                                // NODE_ADDED Skipping
                                return;
                            case RevisionInfo.R_ENUM_ADDED:
                                // Need to check if the added enum is the one we
                                // we wish to send
                                if (r.data.equals(getValue().toString())) {
                                    throw new JNCException(JNCException.REVISION_ERROR,
                                            tp + " bad enum value for rev (" + rev + ") " + r.data);
                                }
                                break;
                            case RevisionInfo.R_BITS_ADDED:
                                // Same thing - check for too new bit strings
                                if (r.data.equals(getValue().toString())) {
                                    throw new JNCException(JNCException.REVISION_ERROR,
                                            tp + " bad bits value for rev (" + rev + ") " + r.data);
                                }
                                break;
                            case RevisionInfo.R_MANDATORY_TRUE_TO_FALSE:
                                // nothing to do
                                break;
                            default:
                        }

                    }
                }
            }
        }
        super.encode(out, newlineAtEnd, capas);
    }

    @Override
    public Leaf clone() {
        final Leaf copy = new Leaf(namespace, name);
        cloneAttrs(copy);
        cloneValue(copy);
        return copy;
    }

    @Override
    public Leaf cloneWithoutChildren() {
        final Leaf copy = new Leaf(namespace, name);
        cloneAttrs(copy);
        cloneValue(copy);
        return copy;
    }

    @Override
    public String[] keyNames() {
        return new String[0];
    }

    @Override
    public Leaf cloneShallow() {
        return (Leaf) cloneShallowContent(new Leaf(namespace, name));
    }


    public Object defaultValue() throws JNCException {
        return null;
    }

    public boolean hasDefaultValue() {
        return false;
    }

    public YangType value() {
        return (YangType)getValue();
    }

    @Override
    public int compare(YangElement b) {
        return elementCompare(b);
    }

    public void instantiateValue(String stringRepresentation) throws JNCException {
        value = stringRepresentation;
    }

    public Object createValue(String stringRepresentation) throws JNCException {
        return new YangString(stringRepresentation);
    }

    public Class<?> valueClass() {
        return Object.class;
    }

    public boolean isKey() {
        return false;
    }
}
