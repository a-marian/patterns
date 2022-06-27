package ar.com.patterns.creational.abstractfactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ItalyPizzaStore implements PizzaStore{

    private static Map<String, Supplier<Pizza>> typeConstructorMap = new HashMap<>();

    static {
        typeConstructorMap.put("napolitana", NapolitanaPizza::new);
        typeConstructorMap.put("capricciosa", CapricciosaPizza::new);
    }
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = typeConstructorMap.get(type) == null ? null :
                typeConstructorMap.get(type).get();
        pizza.setName(type);

        return pizza;
    }

    @Override
    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        prepare(pizza.getName());
        bake();
        cut();

        return  pizza;
    }

    @Override
    public void prepare(String pizzaName) {
        System.out.println("Preparing " + pizzaName);
    }

    @Override
    public void bake() {
        System.out.println("Regular Oven baking");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    @Override
    public void box() {
        System.out.println("Boxing pizza in new package");
    }


}
