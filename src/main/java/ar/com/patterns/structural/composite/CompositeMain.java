package ar.com.patterns.structural.composite;

/**
 * The composite pattern allows you to compose objects into tree structures to represent part-whole hierarchies.
 * Composite lets clients treat individual objects and compositions of object uniformly.
 * Using composite structure we can apply the same operations over both composites and individual objects.
 * In other words, in ost cases we can ignore the differences between compositions of objects and individual objects.*/
public class CompositeMain {

    public static void main(String[] args) {
        MenuComponent dinnerMenu = new Menu("Dinner Menu", "Lunch");
        MenuComponent dessertMenu = new Menu("Dessert menu", "Dessert");
        MenuComponent drinkMenu = new Menu("Drink Menu", "Drinks");

        MenuComponent allMenus = new Menu("All Menus", "Combined menus");

        allMenus.add(dinnerMenu);
        allMenus.add(dessertMenu);
        allMenus.add(drinkMenu);

        dinnerMenu.add(new MenuItem("Pasta", "Ravioles Cuatro quesos con salsa blanca", 250.00));
        dinnerMenu.add(new MenuItem("Chicken", "Pollo al strogonoff", 340.00));
        dinnerMenu.add(new MenuItem("Beef", "Milanesa a caballo", 120.00));

        dessertMenu.add(new MenuItem("Ice ceam", "Banana split", 220.00));
        dessertMenu.add(new MenuItem("Flan", "Flan con dulce de leche", 200.00));
        dessertMenu.add(new MenuItem("Tradicional", "Vigilante", 120.00));

        drinkMenu.add(new MenuItem("Beer", "Honey Barba Roja 200ml", 180.00));
        drinkMenu.add(new MenuItem("Coctail", "Mojito", 200.00));
        drinkMenu.add(new MenuItem("Wine", "Novecento Raices 750ml", 5000.00));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();


    }
}
