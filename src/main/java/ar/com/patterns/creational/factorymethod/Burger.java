package ar.com.patterns.creational.factorymethod;

public abstract class Burger {

    private String name;

    void grillBeef(){
        System.out.println("pat beef into a disk, get grilling");
    }

    void fryPotatoes(){
        System.out.println("Fry potatoes in hot oil");
    }


    void makeSalad(){
        System.out.println("Mix salad as your preference");
    }

    void sliceBurgerBuns(){
        System.out.println("Slice burger buns and grill a little time ");
    }

    void build(){
        System.out.println("Build the burger with all yoo have prepared");
    }

    void box(){
        System.out.println("Box in packaging to  deliver to a customer");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
