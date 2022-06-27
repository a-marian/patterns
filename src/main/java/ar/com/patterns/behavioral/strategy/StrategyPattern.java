package ar.com.patterns.behavioral.strategy;

/**
 * The strategy pattern defines a family of algorithms, encapsulates each one and makes them interchangeable.
 * Strategy lets the algorithm vary independently of clients that use it.*/
public class StrategyPattern {
	
	public static void main(String[] args) {
		Navigation navigation = new Navigation();
		navigation.navigate();
	}

}
