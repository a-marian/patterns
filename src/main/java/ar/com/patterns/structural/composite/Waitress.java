package ar.com.patterns.structural.composite;

public class Waitress {

    MenuComponent menuComponent;

    public Waitress(MenuComponent menuComponent) {
        this.menuComponent = menuComponent;
    }

    public void printMenu(){
        menuComponent.print();
    }
}
