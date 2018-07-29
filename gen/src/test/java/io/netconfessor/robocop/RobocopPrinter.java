package io.netconfessor.robocop;

import com.netconfessor.gen.robocop.*;
import com.netconfessor.gen.robocop.ammo.PistolAmmo;
import com.netconfessor.gen.robocop.ammo.RocketAmmo;
import com.netconfessor.gen.robocop.primeDirectives.Directive;
import com.netconfessor.gen.robocop.primeDirectives.DirectiveVisitor;
import com.netconfessor.gen.robocop.primeDirectives.directive.Code;
import com.netconfessor.gen.robocop.primeDirectives.directive.Enabled;
import io.netconfessor.YangData;


import io.netconfessor.LeafYangData;
import io.netconfessor.YangBoolean;
import io.netconfessor.YangString;

import java.util.StringJoiner;

public class RobocopPrinter extends RobocopVisitor {


    private String[][] viewDirectives = {
            {"deleteme1", "false"},
            {"deleteme2", "false"},
            {"createme1", "false"},
            {"createme2", "false"},
            {"createme3", "false"},
            {"createme4", "false"},
            {"createme5", "false"},
    };

    private StringJoiner reply = new StringJoiner("->");
    private StringJoiner spec = new StringJoiner("->");


    @Override
    public AmmoVisitor setupAmmo(YangData data) {
        return new AmmoVisitor() {
            @Override
            public void setupPistolAmmo(LeafYangData data) {
                spec.add(data.name());
            }

            @Override
            public void setupRocketAmmo(LeafYangData data) {
                spec.add(data.name());
            }

            @Override
            public void onPistolAmmo(PistolAmmo leaf) {
                reply.add(leaf.name);
            }

            @Override
            public void onRocketAmmo(RocketAmmo leaf) {
                reply.add(leaf.name);
            }
        };
    }

    @Override
    public PrimeDirectivesVisitor setupPrimeDirectives(YangData data) {

        return new PrimeDirectivesVisitor() {
            private int i = -1;
            @Override
            public DirectiveVisitor setupDirective(YangData data) {
                return new DirectiveVisitor() {

                    @Override
                    public void setupCode(LeafYangData data) {
                        spec.add(data.name());
                    }

                    @Override
                    public void setupEnabled(LeafYangData data) {
                        spec.add(data.name());
                    }

                    @Override
                    public void onCode(Code leaf) {

                    }

                    @Override
                    public Code getCode() {
                        final String value = viewDirectives[i][0];
                        return new Code(new YangString(value));
                    }

                    @Override
                    public void onEnabled(Enabled leaf) {

                    }

                    @Override
                    public Enabled getEnabled() {
                        final String value = viewDirectives[i][1];
                        if (value == null) {
                            return null;
                        }
                        return new Enabled(new YangBoolean(value));
                    }
                };
            }

            @Override
            public void onNextDirective(Directive item) {
                final Directive clone = item.clone();
                clone.markDelete();
                reply.add(item.name);

            }

            @Override
            public void onStartDirectiveList() {
                reply.add("[");
            }

            @Override
            public void onStopDirectiveList() {
                reply.add("]");
            }

            @Override
            protected Directive getNextDirective() {
                i++;
                if (i >= viewDirectives.length) {
                    return null;
                }

                final String code = viewDirectives[i][0];

                Directive dir = new Directive();
                dir.addCode().value(new YangString(code));

                if (code.startsWith("deleteme")) {
                    dir.markDelete();
                } else if (code.startsWith("createme")) {
                    final String enabled = viewDirectives[i][1];
                    dir.markCreate();
                    dir.addEnabled().value(new YangBoolean(enabled));
                }
                return dir;
            }
        };
    }

    @Override
    public void onAmmo(Ammo container) {
        reply.add(container.name);
    }

    @Override
    public void onPrimeDirectives(PrimeDirectives container) {
        reply.add(container.name);

    }

    public String reply() {
        final String result = reply.toString();
        reply = new StringJoiner("->");
        return result;
    }

    public String spec() {
        final String result = spec.toString();
        spec = new StringJoiner("->");
        return result;
    }

    public void setViewDirectives(String[][] newInterfacesFromView) {
        this.viewDirectives = newInterfacesFromView;
    }
}
