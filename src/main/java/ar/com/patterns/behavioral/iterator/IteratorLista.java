package ar.com.patterns.behavioral.iterator;

public class IteratorLista<T> {

	private static final int CERO = 0;
	private static final int PRIMER_INDICE = CERO;
	private int indice = PRIMER_INDICE;
	
	private final ListaEnlazada<T> lista;
	
	public IteratorLista(ListaEnlazada<T> lista){
		this.lista = lista;
	}
	
	public final T obtenerActual(){
		T valor = this.lista.obtener(this.indice);
		this.indice++;
		return valor;
	}
	
	public final void reiniciar(){
		this.indice= PRIMER_INDICE;
	}
	
	public final boolean tieneMas(){
		return this.indice < this.lista.obtenerNumeroItems();
	}
}
