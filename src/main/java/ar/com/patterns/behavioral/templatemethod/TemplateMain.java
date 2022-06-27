package ar.com.patterns.behavioral.templatemethod;

/**
 * how to implement Template method pattern
 * Examine the algorithm and think how to split the algorithm into different steps.
 * Create an abstract class and define template method there.
 * Put each step of the algorithm in the separate method. Describe method invocation sequence in template method.
 * Identify places for hooks in your algorithm.
 * Create concrete classes that implements the required steps in tle algorithm.*/
public class TemplateMain {

    public static void main(String[] args) {

        Compiler compiler1 = new MavenCompiler();
        compiler1.compile();

        System.out.println("-----------------");

        Compiler compiler2 = new GradleCompiler();
        compiler2.compile();
    }
}
