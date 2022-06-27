package ar.com.patterns.structural.adapter;

/**
 * The adapter converts the interface of a class into another interface the clients expect.
 * Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
 * The adapter pattern is full of good OO design principles: check out the use of object composition
 * to wrap the adaptee with an altered interface.*/

public interface Sorter {

   int[] sort (int[] arrayToSort);
}
