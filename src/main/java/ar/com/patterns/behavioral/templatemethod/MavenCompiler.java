package ar.com.patterns.behavioral.templatemethod;

public class MavenCompiler extends Compiler {

    @Override
    protected void getLibraries() {
        System.out.println("Collect libraries  from Maven repositories");
    }

    @Override
    protected void compileToTarget() {
        System.out.println(" Maven compilation");
    }
}
