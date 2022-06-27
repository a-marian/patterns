package ar.com.patterns.creational.abstractfactory;

/***
 * A factory method handles object creation and encapsulates it in a subclass.
 * This decouples the client code in the superclass from the object creation code in the subclass.
 * A factory method is abstract to the subclasses are counted on the handle object creation
 * A factory method returns a Product that is typically used within methods defined in the superclass
 * A factory method isoletes the client (the code in the superclass like orderPizza())
 *  from knowing what of concrete Product is actually created
 * A factory method may be parameterized(or not) to select among several variations of a product.
 */

/**
 * The abstract factory pattern provides an interface for creating families of related or dependent
 * objects without specifying their concrete classes.
 * The abstract factory defines the interface that all concrete factories must implement
 * which consists of a set of methods for producing products.
 * The concrete factories implement the different products families. To create a product,
 * the client uses one of these factories, so it never has the instantiate a product object.*/

public interface PizzaStore {


    Pizza createPizza(String type);

    Pizza orderPizza(String type);

    void prepare(String pizzaName);

    void bake();

    void cut();

    void box() ;

}
