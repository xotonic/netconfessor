package io.netconfessor.robocop;

import com.netconfessor.gen.robocop.*;
import com.netconfessor.gen.robocop.primeDirectives.Directive;
import com.netconfessor.gen.robocop.primeDirectives.DirectiveVisitor;
import com.netconfessor.gen.robocop.primeDirectives.directive.Code;
import com.netconfessor.gen.robocop.primeDirectives.directive.Enabled;
import io.netconfessor.YangData;

import io.netconfessor.LeafYangData;

public class EmptyListRobocopPrinter extends RobocopVisitor {
    @Override
    public AmmoVisitor setupAmmo(YangData data) {
        return null;
    }

    @Override
    public PrimeDirectivesVisitor setupPrimeDirectives(YangData data) {
        return new PrimeDirectivesVisitor() {
            @Override
            public DirectiveVisitor setupDirective(YangData data) {
                return new DirectiveVisitor() {
                    @Override
                    public void setupCode(LeafYangData data) {

                    }

                    @Override
                    public void setupEnabled(LeafYangData data) {

                    }

                    @Override
                    public void onCode(Code leaf) {

                    }

                    @Override
                    public Code getCode() {
                        return null;
                    }

                    @Override
                    public void onEnabled(Enabled leaf) {

                    }

                    @Override
                    public Enabled getEnabled() {
                        return null;
                    }
                };
            }

            @Override
            public void onNextDirective(Directive item) {

            }

            @Override
            protected Directive getNextDirective() {
                return null;
            }
        };
    }

    @Override
    public void onAmmo(Ammo container) {

    }

    @Override
    public void onPrimeDirectives(PrimeDirectives container) {

    }
}
