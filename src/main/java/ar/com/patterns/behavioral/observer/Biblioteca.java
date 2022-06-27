package ar.com.patterns.behavioral.observer;

public class Biblioteca {

	public void devuelveLibro(Libro libro){
		if(libro.getEstado().equals("MALO")){
			AlarmaLibro a = new AlarmaLibro();
			a.notifyObservers();
			
		}
	}
}
