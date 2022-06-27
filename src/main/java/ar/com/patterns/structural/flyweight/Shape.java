package ar.com.patterns.structural.flyweight;

/**
 * Flyweight pattern is primarily used to reduce the number of objects created and to decrece memory
 * footprint and increase performance. This type of design pattern comes under structural pattern
 * as this pattern provides ways to decrease object count
 * thus improving the object structure of application.
 * Flyweight pattern try to reuse already existing similar kind objects by storing them and creates
 * new object when no matching object is found.
 * */
public interface Shape {

    void draw();
}
