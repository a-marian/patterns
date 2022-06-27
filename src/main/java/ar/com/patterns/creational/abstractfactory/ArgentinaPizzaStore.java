package ar.com.patterns.creational.abstractfactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ArgentinaPizzaStore implements PizzaStore{

    private static Map<String, Supplier<Pizza>> typeConstructorMap = new HashMap<>();

    static {
        typeConstructorMap.put("fugazzeta", FugazzetaPizza::new);
        typeConstructorMap.put("provolone", ProvolonePizza::new);
    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza =  typeConstructorMap.get(type) == null ? null :
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
        box();

        return pizza;
    }

    @Override
    public void prepare(String pizzaName) {
        System.out.println("Preparing " + pizzaName);
    }

    @Override
    public void bake() {
        System.out.println("Stone baking");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    @Override
    public void box() {
        System.out.println("Place pizza in official box");
    }
}
