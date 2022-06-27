package ar.com.patterns.creational.abstractfactory;

public class AbstractFactoryMain {

    public static void main(String[] args) {
        PizzaStore argentinaPizzaStore = new ArgentinaPizzaStore();
        PizzaStore italyStore = new ItalyPizzaStore();

      Pizza fugazzeta = argentinaPizzaStore.orderPizza("fugazzeta");
      Pizza napolitana = italyStore.orderPizza("capricciosa");

      System.out.println("Order 1:" + fugazzeta);
      System.out.println("Order 2: " + napolitana);

    }
}
