
package com.netconfessor.gen.robocop.primeDirectives;

import com.netconfessor.gen.robocop.primeDirectives.Directive;
import com.netconfessor.gen.robocop.primeDirectives.directive.Code;
import com.netconfessor.gen.robocop.primeDirectives.directive.Enabled;

import io.netconfessor.Element;
import io.netconfessor.LeafYangData;
import io.netconfessor.NodeSet;
import io.netconfessor.YangBoolean;
import io.netconfessor.YangDataType;
import io.netconfessor.YangString;

/**
 * Visitor of list directive
 *
 * @author jnc.py
 */
public abstract class DirectiveVisitor {

    public abstract void setupCode(LeafYangData<YangString> data);

    public abstract void setupEnabled(LeafYangData<YangBoolean> data);

    public abstract void onCode(Code leaf);

    public abstract Code getCode();

    public abstract void onEnabled(Enabled leaf);

    public abstract Enabled getEnabled();

    public void setup() {
        setupCode(new LeafYangData<>("code", "/robocop:prime-directives/robocop:directive/robocop:code", null, true, YangDataType.leaf, "io.netconfessor.YangString", s -> new YangString(s)));
        setupEnabled(new LeafYangData<>("enabled", "/robocop:prime-directives/robocop:directive/robocop:enabled", null, true, YangDataType.leaf, "io.netconfessor.YangBoolean", s -> new YangBoolean(s)));
    }

    /**
     * Retrieve all config values in registered visitors
     */
    public Directive collectConfig(Directive directive) {
        if (directive == null) {
            return null;
        }
        Code code = getCode();
        if (code != null) {
            directive.addCode(code);
        }
        Enabled enabled = getEnabled();
        if (enabled != null) {
            directive.addEnabled(enabled);
        }
        if (directive.hasChildren()) {
           return directive;
        } else {
           return null;
        }
    }

    /**
     * Auto-generated module traverse algorithm
     */
    public void visit(NodeSet nodes) {
        
        final Element code = nodes.getFirstChild("code");
        if (code != null) {
            onCode((Code)code);
        }
        
        final Element enabled = nodes.getFirstChild("enabled");
        if (enabled != null) {
            onEnabled((Enabled)enabled);
        }
    }

}
