package io.netconfessor;


import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * XPath expression, which you can use as key.
 * Mainly using for to considering elements of list instead of {@link Tagpath}
 * Note that it does not parse XPath using full grammar therefore order of key predicates matters.
 */
public class XPath implements Serializable {

    private LinkedList<FilterExpr> locationPath = new LinkedList<>();

    public XPath(Element e) {
        this(e, false);
    }


    // TODO extract PrefixMap from elements
    public XPath(Element e, boolean withShadowParents) {
        Element cur = e;
        while (cur != null && (withShadowParents || !cur.shadowed)) {
            final String tagname = cur.name;
            final Element curConst = cur;
            final SchemaNode schemaNode = SchemaTree.lookup(cur.namespace, cur.tagpath());
            if (schemaNode != null && schemaNode.keys != null) {
                String predicate = Arrays.stream(schemaNode.keys).map(key -> curConst.getChild(key))
                        .filter(c -> c.getValue() != null).map(c -> c.name + "='" + String.valueOf(c.getValue()) + "'")
                        .collect(Collectors.joining(" and ", "[", "]"));

                if (predicate.equals("[]")) {
                    predicate = "";
                }


                final FilterExpr filter = new FilterExpr();
                filter.tag = tagname;
                filter.predicate = predicate;
                locationPath.addFirst(filter);
            } else {
                final FilterExpr filter = new FilterExpr();
                filter.tag = tagname;
                filter.predicate = "";
                locationPath.addFirst(filter);
            }
            cur = cur.getParent();
        }
    }

    public XPath(String xpath) {
        final String[] filters = xpath.split("/");
        for (String filterStr : filters) {

            if (filterStr.isEmpty()) {
                // it is root empty element after split
                continue;
            }

            if (filterStr.matches(".*\\[.*]")) {
                final int bracketsBegin = filterStr.indexOf('[');
                final int bracketsEnd = filterStr.indexOf(']');
                final String expr = filterStr.substring(0, bracketsBegin);
                final String predicate = filterStr.substring(bracketsBegin, bracketsEnd + 1);
                final FilterExpr filter = new FilterExpr();
                findNsAndTagname(expr, filter);
                filter.predicate = predicate;
                locationPath.add(filter);
            } else {
                final FilterExpr filter = new FilterExpr();
                findNsAndTagname(filterStr, filter);
                filter.predicate = "";
                locationPath.add(filter);
            }
        }
    }

    private XPath(LinkedList<FilterExpr> locationPath) {
        this.locationPath = locationPath;
    }

    /**
     * /ns:rpc/arp:settings -> /rpc/settings
     */
    public static XPath cutNamespaces(String path) {
        final XPath xpath = new XPath(path);
        for (FilterExpr fe : xpath.locationPath) {
            fe.ns = "";
        }
        return xpath;
    }

    private void findNsAndTagname(String expr, FilterExpr out) {
        final int colonStart = expr.indexOf(":");
        if (colonStart != -1) {
            out.ns = expr.substring(0, colonStart);
            out.tag = expr.substring(colonStart + 1, expr.length());
        } else {
            out.tag = expr;
        }
    }

    @Override
    public String toString() {
        return locationPath.stream()
                .map(f -> "/".concat(f.ns.isEmpty() ? "" : f.ns + ':').concat(f.tag).concat(f.predicate))
                .collect(Collectors.joining());
    }

    public boolean isCaseOf(Tagpath tagpath) {
        return Arrays.equals(tagpath.p, locationPath.stream().map(f -> f.tag).toArray());
    }

    public Tagpath tagpath() {
        return new Tagpath(locationPath.stream().map(f -> f.tag).toArray(String[]::new));
    }

    /**
     * /config/interface[name='br0']/bridge/port[name='eth0'] -> /config/interface/bridge/port
     */
    public XPath withoutPredicates() {
        return new XPath(locationPath.stream().map(fp -> {
            FilterExpr f = new FilterExpr();
            f.ns = fp.ns;
            f.tag = fp.tag;
            f.predicate = "";
            return f;
        }).collect(Collector.of(() -> new LinkedList<>(), (l, f) -> l.add(f), (left, right) -> {
            left.addAll(right);
            return left;
        }, Collector.Characteristics.IDENTITY_FINISH)));
    }

    /**
     * /config/interface[name='br0']/bridge/port[name='eth0'] -> /config/interface[name='br0']/bridge/port
     */
    public XPath withoutLastPredicate() {
        final LinkedList<FilterExpr> copy = new LinkedList<>();
        for (FilterExpr fe : locationPath) {
            FilterExpr cp = new FilterExpr();
            cp.ns = fe.ns;
            cp.tag = fe.tag;
            cp.predicate = fe.predicate;
            copy.add(cp);
        }
        copy.getLast().predicate = "";
        return new XPath(copy);
    }

    public XPath withoutPredicatesAfterTag(String tagname) {
        final LinkedList<FilterExpr> copy = new LinkedList<>();
        boolean afterTag = false;
        final Iterator<FilterExpr> it = locationPath.iterator();
        while (it.hasNext()) {
            final FilterExpr fe = it.next();
            final FilterExpr cp = new FilterExpr();
            cp.tag = fe.tag;
            cp.ns = fe.ns;

            if (afterTag) {
                cp.predicate = "";
            } else {
                cp.predicate = fe.predicate;
            }

            if (fe.tag.equals(tagname)) {
                afterTag = true;
            }

            copy.add(cp);
        }


        return new XPath(copy);
    }

    public String tailNamespace() {
        return locationPath.getLast().ns;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof XPath)) {
            return false;
        }
        XPath xPath = (XPath) o;
        return Objects.equals(locationPath, xPath.locationPath);
    }

    @Override
    public int hashCode() {

        return Objects.hash(locationPath);
    }

    /**
     * ns:tag-name[name='eth0']
     */
    private static class FilterExpr implements Serializable {

        /**
         * ns:  - only alias not ns value
         */
        private String ns = ""; // not required by default

        /**
         * tag-name
         */
        private String tag;
        /**
         * [name='eth0']
         */
        private String predicate;

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof FilterExpr)) {
                return false;
            }
            FilterExpr that = (FilterExpr) o;
            return Objects.equals(tag, that.tag) && Objects.equals(predicate, that.predicate) && Objects
                    .equals(ns, that.ns);
        }

        @Override
        public int hashCode() {
            return Objects.hash(tag, predicate, ns);
        }
    }
}
