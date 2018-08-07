#!/usr/bin/python




io_netconfessor = {'Attribute', 'Capabilities', 'ConfDSession',
                   'DefaultIOSubscriber', 'Device', 'DeviceUser', 'DummyElement',
                   'Element', 'ElementChildrenIterator', 'ElementHandler',
                   'ElementLeafListValueIterator', 'IOSubscriber',
                   'JNCException', 'Leaf', 'NetconfSession', 'NodeSet', 'Path',
                   'PathCreate', 'Prefix', 'PrefixMap', 'RevisionInfo',
                   'SchemaNode', 'SchemaParser', 'SchemaTree',
                   'SSHConnection', 'SSHSession', 'Tagpath', 'TCPConnection',
                   'TCPSession', 'Transport', 'Utils', 'XMLParser',
                   'YangBaseInt', 'YangBaseString', 'YangBaseType', 'YangBinary',
                   'YangBits', 'YangBoolean', 'YangDecimal64', 'YangElement',
                   'YangEmpty', 'YangEnumeration', 'YangException',
                   'YangIdentityref', 'YangInt16', 'YangInt32', 'YangInt64',
                   'YangInt8', 'YangLeafref', 'YangString', 'YangType',
                   'YangUInt16', 'YangUInt32', 'YangUInt64', 'YangUInt8',
                   'YangUnion', 'YangXMLParser', 'YangInstanceIdentifier', 'YangAnyXml',
                   'YangEnumerationHolder', 'YangContainer', 'LeafYangData', 'YangData',
                   'YangDataType', 'EnumYangData'}

java_reserved_words = {'abstract', 'assert', 'boolean', 'break', 'byte',
                       'case', 'catch', 'char', 'class', 'const', 'continue',
                       'default', 'double', 'do', 'else', 'enum', 'extends',
                       'false', 'final', 'finally', 'float', 'for', 'goto',
                       'if', 'implements', 'import', 'instanceof', 'int',
                       'interface', 'long', 'native', 'new', 'null', 'package',
                       'private', 'protected', 'public', 'return', 'short',
                       'static', 'strictfp', 'super', 'switch', 'synchronized',
                       'this', 'throw', 'throws', 'transient', 'true', 'try',
                       'void', 'volatile', 'while'}
"""A set of all identifiers that are reserved in Java"""

additional_reserved_words = {'value', 'string'}

java_literals = {'true', 'false', 'null'}
"""The boolean and null literals of Java"""

java_lang = {'Appendable', 'CharSequence', 'Cloneable', 'Comparable',
             'Iterable', 'Readable', 'Runnable', 'Boolean', 'Byte',
             'Character', 'Class', 'ClassLoader', 'Compiler', 'Double',
             'Enum', 'Float', 'Integer', 'Long', 'Math', 'Number',
             'Object', 'Package', 'Process', 'ProcessBuilder',
             'Runtime', 'RuntimePermission', 'SecurityManager',
             'Short', 'StackTraceElement', 'StrictMath', 'String',
             'StringBuffer', 'StringBuilder', 'System', 'Thread',
             'ThreadGroup', 'ThreadLocal', 'Throwable', 'Void'}
"""A subset of the java.lang classes"""

java_util = {'Collection', 'Enumeration', 'Iterator', 'List', 'ListIterator',
             'Map', 'Queue', 'Set', 'ArrayList', 'Arrays', 'HashMap',
             'HashSet', 'Hashtable', 'LinkedList', 'Properties', 'Random',
             'Scanner', 'Stack', 'StringTokenizer', 'Timer', 'TreeMap',
             'TreeSet', 'UUID', 'Vector', 'LinkedList'}
"""A subset of the java.util interfaces and classes"""

java_built_in = java_reserved_words | java_literals | java_lang | additional_reserved_words
"""Identifiers that shouldn't be imported in Java"""

anyxml_stmts = {'anyxml'}

yangelement_stmts = {'container', 'list', 'notification'} | anyxml_stmts | {'leaf', 'leaf-list'}
"""Keywords of statements that YangElement classes are generated from"""

leaf_stmts = {'leaf-list'}
"""Leaf and leaf-list statement keywords"""

non_abstract_stmts = {'leaf', 'leaf-list', 'container', 'list', 'choice', 'case', 'anyxml', 'rpc', 'notification'}

module_stmts = {'module', 'submodule'}
"""Module and submodule statement keywords"""

node_stmts = module_stmts | yangelement_stmts | leaf_stmts
"""Keywords of statements that make up a configuration tree"""

"""

       +---------------------+-------------------------------------+
       | Name                | Description                         |
       +---------------------+-------------------------------------+
       | binary              | Any binary data                     |
       | bits                | A set of bits or flags              |
       | boolean             | "true" or "false"                   |
       | decimal64           | 64-bit signed decimal number        |
       | empty               | A leaf that does not have any value |
       | enumeration         | Enumerated strings                  |
       | identityref         | A reference to an abstract identity |
       | instance-identifier | References a data tree node         |
       | int8                | 8-bit signed integer                |
       | int16               | 16-bit signed integer               |
       | int32               | 32-bit signed integer               |
       | int64               | 64-bit signed integer               |
       | leafref             | A reference to a leaf instance      |
       | string              | Human-readable string               |
       | uint8               | 8-bit unsigned integer              |
       | uint16              | 16-bit unsigned integer             |
       | uint32              | 32-bit unsigned integer             |
       | uint64              | 64-bit unsigned integer             |
       | union               | Choice of member types              |
       +---------------------+-------------------------------------+
"""

package_info = '''/** TODO describe me */
 package '''
"""Format string used in package-info files"""

outputted_warnings = []
"""A list of warning message IDs that are used to avoid duplicate warnings"""

augmented_modules = {}
"""A dict of external modules that are augmented by the YANG module"""

camelized_stmt_args = {}
"""Cache containing camelized versions of statement identifiers"""

normalized_stmt_args = {}
"""Cache containing normalized versions of statement identifiers"""

class_hierarchy = {}
"""Dict that map package names to sets of names of classes to be generated"""


superclasses = {
    "anyxml": "YangAnyXml",
    "leaf": "Leaf",
    "leaf-list": "Leaf"
}
