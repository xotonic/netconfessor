package io.netconfessor;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * A SAX parser, for parsing for example NETCONF messages,
 * into a simple {@link Element Element} tree.
 * <p>
 * This parser is data model aware and will try to construct
 * classes that are generated from the JNC pyang plugin.
 * <p>
 */

/**
 * The handler with hooks for startElement etc. The SAX parser will build up
 * the parse tree, by calling these hooks.
 */
class ElementHandler extends DefaultHandler {

    // pointer to current element (node)
    protected Element current;
    protected Element top;
    protected PrefixMap prefixes = null;
    protected int unknownLevel = 0;

    private boolean leaf = false;
    private String leafNs;
    private String leafName;
    private String leafValue;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        //System.out.println(String.format("Start: %s", localName));

        if (unknownLevel > 0) {
            unknownStartElement(uri, localName, attributes);
            unknownLevel++;
            return;
        }
        final Element parent = current;
        Element child;

        if (parent instanceof YangAnyXml) {
            unknownLevel++;
            child = null;
        } else {
            try {
                child = YangElement.createInstance(this, parent, uri, localName);
            } catch (final JNCException e) {
                e.printStackTrace();
                throw new SAXException(e.toString());
            }

            if (top == null) {
                top = child;
            }
        }

        if (child == null && unknownLevel == 1) {
            // we're entering XML data that's not in the schema
            unknownStartElement(uri, localName, attributes);
            return;
        }

        if (child instanceof Leaf) {
            leaf = true;
            leafNs = uri;
            leafName = localName;
            leafValue = "";
        }
        child.prefixes = prefixes;
        prefixes = null;
        addOtherAttributes(attributes, child);
        current = child; // step down
    }

    private void unknownStartElement(String uri, String localName, Attributes attributes) throws SAXException {
        final Element child = new Element(uri, localName);
        child.prefixes = prefixes;
        prefixes = null;
        addOtherAttributes(attributes, child);
        if (current == null) {
            top = child;
        } else {
            current.addChild(child);
        }
        current = child; // step down
    }

    private void addOtherAttributes(Attributes attributes, Element child) {
        // add other attributes
        for (int i = 0; i < attributes.getLength(); i++) {
            final String attrName = attributes.getLocalName(i);
            final String attrUri = attributes.getURI(i);
            final String attrValue = attributes.getValue(i);
            final Attribute attr = new Attribute(attrUri, attrName, attrValue);
            child.addAttr(attr);
        }
    }

    private void unknownEndElement() {
        // check that we don't have mixed content
        if (current.hasChildren() && current.value != null) {
            // MIXED content not allowed
            current.value = null;
        }
        // step up
        current = current.getParent();
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {

        //System.out.println("End: " + localName);

        if (unknownLevel > 0) {
            unknownEndElement();
            unknownLevel--;
            return;
        }

        if (leaf) {
            // If it's a Leaf - we need to set value properly using
            // the setLeafValue method which will check restrictions
            try {
                ((YangElement) current).setLeafValue(leafNs, leafName, leafValue);
            } catch (final JNCException e) {
                e.printStackTrace();
                throw new SAXException(e.toString());
            }
        } else {
            // check that we don't have mixed content
            if (current.hasChildren() && current.value != null) {
                // MIXED content not allowed
                current.value = null;
            }
        }

        current = current.getParent();
        leaf = false;
    }

    private void unknownCharacters(String content) {
        if (current.value == null) {
            current.value = "";
        }
        current.value = current.value + content;
    }

    @Override
    public void characters(char[] ch, int start, int length) {
        final String content = new String(ch, start, length);
        //System.out.println(String.format("Characters: content='%s', current='%s'",
        //        content, current != null ?  current.name : null));
        if (unknownLevel > 0) {
            unknownCharacters(content);
            return;
        }

        if (leaf) {
            leafValue = leafValue + content;
        } else {
            if (current.value == null) {
                current.value = "";
            }
            current.value = current.value + content;
        }
    }

    @Override
    public void startPrefixMapping(String prefix, String uri) {
        if (prefixes == null) {
            prefixes = new PrefixMap();
        }
        prefixes.add(new Prefix(prefix, uri));
    }
}
