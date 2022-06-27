package ar.com.patterns.behavioral.observer.composition;

import java.util.Observable;
import java.util.Observer;

public class ProductObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		if (arg instanceof Product.PriceEvent){
			Product.PriceEvent event = (Product.PriceEvent) arg;
			System.out.printf("El producto %s ha cambiado de precio de %s a %s%n", 
					event.getProduct().getName(), event.getPreviousPrice(), event.getNewPrice());
		}
		
	}
	
}
