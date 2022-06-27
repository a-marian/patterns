package ar.com.patterns.structural.flyweight;

import java.util.List;

/**
 * Use the flyweight pattern when one instance of a class
 * can be used to provide many 'virtual instances'*/
public class FlyweightMain {

    private static final String colors[] = {"Blue", "White", "Black", "Green", "Orange"};

    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.draw();
        }
    }

    private static String getRandomColor(){
        return colors[(int)(Math.random()*colors.length)];
    }

    private static int getRandomX(){
        return (int)(Math.random()*100);
    }

    private static int getRandomY(){
        return (int)(Math.random()*100);
    }
}
