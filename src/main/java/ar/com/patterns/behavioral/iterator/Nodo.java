package ar.com.patterns.behavioral.iterator;

public class Nodo<T> {

	public Nodo anterior;
	public Nodo siguiente;
	
	public T dato;
	
	public Nodo(){}
	
	public Nodo(Nodo anterior, Nodo siguiente, T dato){
		this.anterior  = anterior;
		this.siguiente = siguiente;
		this.dato      = dato;
	}
}
