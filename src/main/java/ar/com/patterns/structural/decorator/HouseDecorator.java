package ar.com.patterns.structural.decorator;

/**
 * The decorator pattern attaches additional responsibilities to an object dynamically.
 * Decorators provide a flexible alternative to subclassing for extending functionality
 * */
public abstract class HouseDecorator extends Room {

    private Room room;

    public  HouseDecorator(Room room){
        this.room = room;
    }

    public abstract void decorate();

}
