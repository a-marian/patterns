package ar.com.patterns.structural.bridge;

/** Concrete implementation 1 */
class Produce implements Workshop {

    @Override
    public void work() {
        System.out.print("Produced ");
    }
}
