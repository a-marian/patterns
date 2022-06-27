package ar.com.patterns.structural.bridge;

/** Concrete implementation 1 */
public class Assemble implements Workshop {

    @Override
    public void work() {
        System.out.println(" assembled.");
    }
}
