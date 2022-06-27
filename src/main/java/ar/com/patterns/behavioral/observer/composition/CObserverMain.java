package ar.com.patterns.behavioral.observer.composition;

import java.math.BigDecimal;
import java.util.Observer;

public class CObserverMain {
	
	public static void main(String[] args) {
		Product p1 = new Product("Libro", new BigDecimal("3.99"));
		Product p2 = new Product("Reader", new BigDecimal("129"));
		
		Observer o1 = new ProductObserver();
		Product.getObservable().addObserver(o1);
		
		p1.setPrice(new BigDecimal("4.99"));
		p2.setPrice(new BigDecimal("119"));
	}

}
