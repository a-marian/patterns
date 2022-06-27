package ar.com.patterns.creational.factorymethod;

public class FactoryMethod {

    public static void main(String[] args) {
        BurgerFactory factory = new BurgerFactory();
        BurgerStore store = new BurgerStore(factory);

       Burger veggy = store.orderBurger("veggy");
       Burger party = store.orderBurger("party");
       Burger kid = store.orderBurger("kid");

        System.out.println("Order Veggy Burger: " + veggy);
        System.out.println("Order Party Burger: " + party);
        System.out.println("Order Kid Burger: " + kid);
    }
}
