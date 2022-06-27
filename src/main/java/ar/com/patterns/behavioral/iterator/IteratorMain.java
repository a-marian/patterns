package ar.com.patterns.behavioral.iterator;

public class IteratorMain {
	public static void main(String[] args) {
        ListaEnlazada<String> lista = new ListaEnlazada<>();
         
        for (int i = 0; i < 10; i++) {
            lista.agregar("Item: " + i);
        }
             
        IteratorLista<String> iterador = lista.obtenerIterador();
         
        while (iterador.tieneMas()) {
            System.out.println(iterador.obtenerActual());
             
        }
    }
}
