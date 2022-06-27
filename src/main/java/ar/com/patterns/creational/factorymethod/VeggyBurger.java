package ar.com.patterns.creational.factorymethod;

public class VeggyBurger extends Burger {

    private boolean veganMeat;

    VeggyBurger() {
        this.setVeganMeat(true);
    }

    public void setVeganMeat(boolean veganMeat) {
        this.veganMeat = veganMeat;
    }

    @Override
    public String toString() {
        return "VeggyBurger{" +
                "name='" + getName() + '\'' +
                "veganMeat=" + veganMeat +
                '}';
    }
}


