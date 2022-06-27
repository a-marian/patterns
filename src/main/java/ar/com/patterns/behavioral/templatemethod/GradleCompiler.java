package ar.com.patterns.behavioral.templatemethod;

public class GradleCompiler  extends Compiler {
    @Override
    protected void getLibraries() {
        System.out.println("Collect libraries from gradle repositories");
    }

    @Override
    protected void compileToTarget() {
            System.out.println("Gradle compilation ");

    }
}
