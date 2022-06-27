package ar.com.patterns.creational.factorymethod;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class BurgerFactory {

    private static Map<String, Supplier<Burger>> typeConstructorMap = new HashMap<>();

    static {
        typeConstructorMap.put("veggy", VeggyBurger::new);
        typeConstructorMap.put("party", PartyBurger::new);
        typeConstructorMap.put("kid", KidBurger::new);
    }

    public Burger createBurger(String type){
        Burger burger = typeConstructorMap.get(type) == null ? null :
                typeConstructorMap.get(type).get();
        burger.setName(type);
        return burger;
    }

}
