package ar.com.patterns.creational.abstractfactory;

public class ProvolonePizza extends Pizza {

    ProvolonePizza() {
        this.setProvolone(true);
    }

    private boolean provolone;

    public void setProvolone(boolean provolone) {
        this.provolone = provolone;
    }
}
