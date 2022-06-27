package ar.com.patterns.behavioral.iterator;

public class ListaEnlazada <T>{
	
	private static final int CERO = 0;
	private static final int LISTA_VACIA = CERO;
	private static final int PRIMER_INDICE = CERO;
	private int numeroItems = LISTA_VACIA;
	private Nodo<T> raiz;
	private Nodo<T> ultimo;
	
	public final void agregar(T valor){
		Nodo<T> nuevo = new Nodo<>(null, null, valor);
		
		if(this.raiz == null){
			this.raiz = nuevo;
		}else {
			this.ultimo.siguiente = nuevo;
			nuevo.anterior = this.ultimo;
		}
		this.ultimo = nuevo;
		this.numeroItems++;
	}
	
	public final boolean estaVacia(){
		return this.numeroItems  == LISTA_VACIA;
	}
	
	public final T obtener(int indice){
		if(indice < PRIMER_INDICE || indice >= this.numeroItems){
			throw new IllegalArgumentException("Indice no valido para consulta");
		}
		if(indice == PRIMER_INDICE){
			return obtenerPrimero();
		}
		
		if(indice == this.numeroItems -1){
			return obtenerUltimo();
		}
		if(this.numeroItems -(indice+1) < this.numeroItems / 2){
			return consultarHaciaAtras(indice).dato;
		}
		return consultarHaciaAdelante(indice).dato;
	}
	
	public final IteratorLista<T> obtenerIterador(){
		return new IteratorLista<>(this);
	}

	/**
     * Retorna el n&uacute;mero de &iacute;tems en la lista.
     * @return
     */
    public final int obtenerNumeroItems() {
        return this.numeroItems;
    }
 
    /**
     * Obtiene el valor del primer &iacute;tem de la lista.
     * @return
     */
    public final T obtenerPrimero() {
        if (this.raiz == null) {
            throw new IllegalArgumentException("No hay items en la lista.");
        }
 
        return this.raiz.dato;
    }
 
    /**
     * Obtiene el valor del &uacute;ltimo &iacute;tem de la lista.
     * @return
     */
    public final T obtenerUltimo() {
        if (this.ultimo == null) {
            throw new IllegalArgumentException("No hay items en la lista.");
        }
 
        return this.ultimo.dato;
    }
 
    public final T remover(int indice) {
        // Verificamos que el indice este dentro de lo esperado.
        if (indice < PRIMER_INDICE || indice >= this.numeroItems) {
            throw new IllegalArgumentException("Indice no válido para consulta.");
        }
 
        Nodo<T> eliminado;
 
        // Si se consulta el primer indice retornamos el valor de la raiz.
        if (indice == PRIMER_INDICE) {
            eliminado = this.raiz;
            this.raiz = this.raiz.siguiente;
        } else if (indice == this.numeroItems - 1) {
            // Si se consulta el ultimo indice retornamos el valor del ultimo nodo.
            eliminado = this.ultimo;
            this.ultimo = this.ultimo.anterior;
        } else if (this.numeroItems - (indice + 1) < this.numeroItems / 2) {
            /*
             * Si la diferencia entre el numero de items y el indice es menor
             * que la mitad, consultamos iniciando por el ultimo.
             */
 
            eliminado = consultarHaciaAtras(indice);
        } else {
            eliminado = consultarHaciaAdelante(indice);
        }
         
        // Cambiamos las referencias.
        if (eliminado.anterior != null) {
            eliminado.anterior.siguiente = eliminado.siguiente;
        }
         
        if (eliminado.siguiente != null) {
            eliminado.siguiente.anterior = eliminado.anterior;
        }
         
        // Disminuimos el numero de items.
        this.numeroItems--;
         
        return eliminado.dato;
    }
 
    /**
     * Cosulta un nodo iniciando desde el nodo ra&iacute;z.
     * @param indice
     * @return
     */
    private Nodo<T> consultarHaciaAdelante(int indice) {
        int ultimoIndice = PRIMER_INDICE;
 
        Nodo<T> buscado = this.raiz;
 
        while (ultimoIndice != indice) {
            buscado = buscado.siguiente;
            ultimoIndice++;
        }
 
        return buscado;
    }
 
    /**
     * Consulta un nodo iniciando desde el &uacute;ltimo agregado.
     * @param indice
     * @return
     */
    private Nodo<T> consultarHaciaAtras(int indice) {
        int ultimoIndice = this.numeroItems - 1;
 
        Nodo<T> buscado = this.ultimo;
 
        while (ultimoIndice != indice) {
            buscado = buscado.anterior;
            ultimoIndice--;
        }
 
        return buscado;
    }
}
	


