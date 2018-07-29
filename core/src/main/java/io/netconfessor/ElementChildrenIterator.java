package io.netconfessor;

import java.util.Iterator;

/**
 * This is an iterator class that is used for iterating over all the children
 * with a specified name in a NodeSet. An object of this iterator class is
 * obtained from the {@link Element#iterator} method.
 * <p>
 * Example usage:
 * <p>
 * <pre>
 * ElementChildrenIterator hostIter = config.iterator(&quot;host&quot;);
 * while (hostIter.hasNext()) {
 *     Element host = hostIter.next();
 *     System.out.println(&quot;Host: &quot; + host);
 * }
 * </pre>
 */
public class ElementChildrenIterator<T extends Element> implements Iterator<T> {

    private final String name;
    private Iterator<T> childrenIterator;
    private T nextChild;
    private boolean hasNextChild = false;

    /**
     * Constructor to create new children iterator for all children.
     */
    public ElementChildrenIterator(NodeSet children) {
        if (children != null) {
            childrenIterator = ((Iterator<T>) children.iterator());
        } else {
            childrenIterator = null;
        }
        name = null;
    }

    /**
     * Constructor to create a new children iterator for children of a specific
     * name.
     */
    public ElementChildrenIterator(NodeSet children, String name) {
        if (children != null) {
            childrenIterator = ((Iterator<T>) children.iterator());
        } else {
            childrenIterator = null;
        }
        this.name = name;
    }

    /**
     * @return <code>true</code> if there are more children;
     * <code>false</code> otherwise.
     */
    @Override
    public boolean hasNext() {
        if (hasNextChild) {
            return true;
        }
        if (childrenIterator == null) {
            return false;
        }
        while (childrenIterator.hasNext()) {
            if (name == null) {
                return true;
            }
            final T child = childrenIterator.next();
            if (child.name.equals(name)) {
                hasNextChild = true;
                nextChild = child;
                return true;
            }
        }
        hasNextChild = false;
        return false;
    }

    /**
     * Iterates the Node set.
     *
     * @return next element with this.name in set or null if none.
     */
    public T nextElement() {
        if (hasNextChild) {
            hasNextChild = false;
            return nextChild;
        }
        while (childrenIterator.hasNext()) {
            final T child = childrenIterator.next();
            if (name == null) {
                return child;
            } else if (child.name.equals(name)) {
                return child;
            }
        }
        return null;
    }

    /**
     * Iterates the Node set.
     *
     * @return next element with this.name in set or null if none.
     */
    @Override
    public T next() {
        return nextElement();
    }

    /**
     * Remove is not supported.
     */
    @Override
    public void remove() {
    }
}
