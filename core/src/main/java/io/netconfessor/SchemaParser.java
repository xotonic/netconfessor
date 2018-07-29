package io.netconfessor;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * A simple SAX parser, for parsing schema files with the following syntax:
 * <pre>
 * <schema>
 *   <node>
 *     <tagapth>string</tagpath>
 *     <namespace>string</namespace>
 *     <primitive_type>string</primitive_type>
 *     <min_occurs>int</min_occurs>
 *     <max_occurs>int</max_occurs>
 *     <children>space-separated strings</children>
 *     <flags>integer</flags>
 *     <desc>string</desc>
 *     <rev>
 *       <info>
 *         <type>7</type>
 *         <idata>4711</idata>
 *         <data>foo</data>
 *         <introduced>2007-10-11</introduced>
 *       </info>
 *     </rev>
 *   </node>
 * <schema>
 * </pre>
 * into a hashtable with {@link SchemaNode} elements.
 */
public class SchemaParser {
    protected XMLReader parser;

    public SchemaParser() throws JNCException {
        try {
            final String javaVersion = System.getProperty("java.version");

            if (javaVersion.startsWith("1.4")) {
                parser = XMLReaderFactory.createXMLReader("org.apache.crimson.parser.XMLReaderImpl");
            } else {
                parser = XMLReaderFactory.createXMLReader();
            }
        } catch (final Exception e) {
            System.exit(-1);
            throw new JNCException(JNCException.PARSER_ERROR, "failed to initialize parser: " + e);
        }
    }

    /**
     * Read in and parse an XML file, and populate a hashtable with SchemaNode
     * objects.
     *
     * @param filename name of file containing the schema
     * @param h        The hashtable to populate.
     * @throws JNCException If there is an IO or SAX parse problem.
     */
    public void readFile(String filename, HashMap<Tagpath, SchemaNode> h, String moduleNamespace) throws JNCException {
        readFile(new InputSource(filename), h, moduleNamespace);
    }

    /**
     * Read in and parse an XML file, and populate a hashtable with SchemaNode
     * objects.
     *
     * @param schemaUrl URL of the schema to parse
     * @param h         The hashtable to populate.
     * @throws JNCException If there is an IO or SAX parse problem.
     */
    public void readFile(URL schemaUrl, HashMap<Tagpath, SchemaNode> h, String moduleNamespace) throws JNCException {
        try {
            readFile(new InputSource(schemaUrl.openStream()), h, moduleNamespace);
        } catch (IOException e) {
            e.printStackTrace();
            throw new JNCException(JNCException.PARSER_ERROR, "Unable to open" + " file: " + schemaUrl + ": " + e);
        }
    }

    private void readFile(InputSource inputSource, HashMap<Tagpath, SchemaNode> h, String moduleNamespace)
            throws JNCException {
        try {
            final SchemaHandler handler = new SchemaHandler(h, moduleNamespace);
            parser.setContentHandler(handler);
            parser.parse(inputSource);
        } catch (final Exception e) {
            e.printStackTrace();
            throw new JNCException(JNCException.PARSER_ERROR, "parse file: " + inputSource + " error: " + e);
        }
    }

    /**
     * Scans the classpath for the XML schema file and populates the hashtable with
     * SchemaNode objects. Class is passed in so that in the case of multiple {@link ClassLoader}s
     * the correct one can be used to locate the schema.
     *
     * @param filename
     * @param h
     * @param clazz
     * @throws JNCException if the file is not found or cannot be parsed.
     */
    public void findAndReadFile(final String filename, final HashMap<Tagpath, SchemaNode> h, final Class clazz,
                                String moduleNamespace) throws JNCException {
        final URL url = clazz.getResource('/' + filename);
        if (url == null) {
            throw new JNCException(JNCException.PARSER_ERROR, "Cannot find file: " + filename + " on the classpath.");
        }
        readFile(url, h, moduleNamespace);
    }

    private class SchemaHandler extends DefaultHandler {
        protected HashMap<Tagpath, SchemaNode> h;
        protected String moduleNamespace;
        protected SchemaNode node;
        protected RevisionInfo ri;
        protected ArrayList<RevisionInfo> riArrayList;
        protected String value = null;

        SchemaHandler(HashMap<Tagpath, SchemaNode> h2, String moduleNamespace) {
            super();
            h = h2;
            this.moduleNamespace = moduleNamespace;
        }

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes)
                throws SAXException {
            if (localName.equals("node")) {
                node = new SchemaNode();
                value = null;
            } else if (localName.equals("rev")) {
                riArrayList = new ArrayList<RevisionInfo>();
                value = null;
            } else if (localName.equals("info")) {
                ri = new RevisionInfo();
                value = null;
            } else if (localName.equals("schema") || localName.equals("node")) {
                value = null;
            } else {
                value = "";
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) {
            switch (localName) {
                case "id":
                    node.id = value;
                    break;
                case "class":
                    node.classname = value;
                    break;
                case "node":
                    h.put(node.tagpath, node);
                    if (!node.namespace.equals(moduleNamespace)) {
                        SchemaTree.create(node.namespace).put(node.tagpath, node);
                    }
                    break;
                case "tagpath":
                    final String[] splittedTagpath = value.split("/");

                    if (splittedTagpath.length == 0) {
                        node.tagpath = new Tagpath(0);
                    } else {
                        node.tagpath = new Tagpath(splittedTagpath.length - 1);
                        System.arraycopy(splittedTagpath, 1, node.tagpath.p, 0, splittedTagpath.length - 1);
                    }
                    break;
                case "namespace":
                    node.namespace = value;
                    break;
                case "tagname":
                    node.name = value;
                    break;
                case "is-config":
                    node.isConfig = Boolean.parseBoolean(value);
                    break;
                case "abstract":
                    node.isAbstract = Boolean.parseBoolean(value);
                    break;
                case "primitive-type":
                    node.primitiveType = Integer.parseInt(value);
                    break;
                case "min-occurs":
                    node.minOccurs = Integer.parseInt(value);
                    break;
                case "max-occurs":
                    node.maxOccurs = Integer.parseInt(value);
                    break;
                case "children":
                    final String[] child = value.split(" ");
                    if (child.length == 0) {
                        node.children = null;
                    } else {
                        node.children = new String[child.length];
                        System.arraycopy(child, 0, node.children, 0, child.length);
                    }
                    break;

                case "children-tags":
                    final String[] childtags =
                            Arrays.stream(value.split(" ")).filter(s -> !s.isEmpty()).toArray(String[]::new);
                    if (childtags.length == 0) {
                        node.childrenTags = new String[0];
                    } else {
                        node.childrenTags = new String[childtags.length];
                        System.arraycopy(childtags, 0, node.childrenTags, 0, childtags.length);
                    }
                    break;
                case "keys":
                    final String[] keysTags =
                            Arrays.stream(value.split(" ")).filter(s -> !s.isEmpty()).toArray(String[]::new);
                    if (keysTags.length == 0) {
                        node.keys = new String[0];
                    } else {
                        node.keys = new String[keysTags.length];
                        System.arraycopy(keysTags, 0, node.keys, 0, keysTags.length);
                    }
                    break;
                case "flags":
                    node.flags = Integer.parseInt(value);
                    break;
                case "desc":
                    node.desc = value;
                    break;
                case "type":
                    node.type = SchemaNode.Type.parse(value);
                    break;
                case "idata":
                    ri.idata = Integer.parseInt(value);
                    break;
                case "data":
                    ri.data = value;
                    break;
                case "introduced":
                    ri.introduced = value;
                    break;
                case "info":
                    riArrayList.add(ri);
                    break;
                case "rev":
                    final RevisionInfo[] riArray = new RevisionInfo[riArrayList.size()];
                    node.revInfo = riArrayList.toArray(riArray);
                    break;
            }
            value = null;
        }

        @Override
        public void characters(char[] ch, int start, int length) {
            if (value == null) {
                return;
            }
            value += new String(ch, start, length);
        }
    }
}
