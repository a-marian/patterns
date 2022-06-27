package ar.com.patterns.behavioral.observer.composition;

import java.math.BigDecimal;
import java.util.Observable;

public class Product {
	
	private static final ProductObservable OBSERVABLE;
	
	private String name;
	private BigDecimal price;
	
	static{
		OBSERVABLE = new ProductObservable();
	}
	
	public static Observable getObservable(){
		return OBSERVABLE;
	}
	
	public Product(String name, BigDecimal price){
		this.name = name;
		this.price = price;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		PriceEvent event = new PriceEvent(this, this.price, price);
		this.price = price;
		
		synchronized(OBSERVABLE) {
			OBSERVABLE.setChanged();
			OBSERVABLE.notifyObservers(event);
		}
		
	}



	public class PriceEvent{
		private Product product;
		private BigDecimal previousPrice;
		private BigDecimal newPrice;
		
		public PriceEvent(Product product, BigDecimal previousPrice, BigDecimal newPrice){
			this.product = product;
			this.previousPrice = previousPrice;
			this.newPrice = newPrice;
		}

		public Product getProduct() {
			return product;
		}

		public BigDecimal getPreviousPrice() {
			return previousPrice;
		}

		public BigDecimal getNewPrice() {
			return newPrice;
		}
		
	}
	
	private static class ProductObservable extends Observable {
		
		public synchronized void setChanged(){
			super.setChanged();
		}
	}

}
