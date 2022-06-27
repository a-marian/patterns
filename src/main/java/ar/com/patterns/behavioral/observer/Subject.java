package ar.com.patterns.behavioral.observer;

public interface Subject {
	
	void attach(ILibroMalEstado observador);
	void dettach(ILibroMalEstado observador);
	void notifyObservers();
	
}
