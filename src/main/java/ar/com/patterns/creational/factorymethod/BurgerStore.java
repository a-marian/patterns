package ar.com.patterns.creational.factorymethod;

public class BurgerStore {

    BurgerFactory factory;

    public BurgerStore(BurgerFactory burgerFactory){
        this.factory= burgerFactory;
    }

    public Burger orderBurger(String type){
        Burger burger;
        burger = factory.createBurger(type);
        burger.grillBeef();
        burger.fryPotatoes();
        burger.sliceBurgerBuns();
        burger.makeSalad();
        burger.build();
        burger.box();

        return burger;
    }
}
