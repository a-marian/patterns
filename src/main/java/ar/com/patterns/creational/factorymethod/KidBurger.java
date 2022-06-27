package ar.com.patterns.creational.factorymethod;

public class KidBurger extends Burger {

    private boolean toy;

    public KidBurger() {
      this.setToy(true);
    }

    public void setToy(boolean toy) {
        this.toy = toy;
    }

    @Override
    public String toString() {
        return "KidBurger{" +
                "name='" + getName() + '\'' +
                "toy=" + toy +
                '}';
    }
}
