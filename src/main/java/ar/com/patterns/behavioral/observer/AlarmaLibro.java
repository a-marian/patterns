package ar.com.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class AlarmaLibro implements Subject {
	
	private static List<ILibroMalEstado> observadores = 
			new ArrayList<ILibroMalEstado>();
	
	
	@Override
	public void attach(ILibroMalEstado observador) {
		// TODO Auto-generated method stub
		observadores.add(observador);
	}

	@Override
	public void dettach(ILibroMalEstado observador) {
		observadores.remove(observador);
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < observadores.size(); i++) {
			observadores.get(i).update();
		}
	}
	
	

}
