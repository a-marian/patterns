package ar.com.patterns.creational.factorymethod;

public class PartyBurger extends Burger{

    private boolean cheddarCheese;

    PartyBurger(){
        this.setCheddarCheese(true);
    }

    public void setCheddarCheese(boolean cheddarCheese) {
        this.cheddarCheese = cheddarCheese;
    }

    @Override
    public String toString() {
        return "PartyBurger{" +
                "name='" + getName() + '\'' +
                "cheddarCheese=" + cheddarCheese +
                '}';
    }
}
