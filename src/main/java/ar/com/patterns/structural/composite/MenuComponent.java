package ar.com.patterns.structural.composite;

/** MenuComponent provides default implementations for every method*/
public abstract class MenuComponent {

    /* composite methods*/
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    /** operation methods*/
    public String getName() {
        throw new UnsupportedOperationException();
    }
    public String getDescription() {
        throw new UnsupportedOperationException(); }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }
    public boolean isVegetarian() {
        throw new UnsupportedOperationException(); }

    /** both will implement*/
    public void print() {
    }
}
