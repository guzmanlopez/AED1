package estructuras;

import java.util.Iterator;

public class ListaSEIni implements ILista {

	/***** Atributos *****/

	private NodoLista inicio;
	private int cant;

	/***** Constructor *****/

	// Pos: Constructor, crea la lista vacía
	public ListaSEIni() {
		this.inicio = null;
		this.cant = 0;
	}

	// Pos: Constructor, crea la lista vacía.
	@Override
	public Object primero() {
		return inicio.getDato();
	}

	// Insertar al inicio //
	// Pos: Inserta el elemento 'n' al principio de la lista
	@Override
	public void insertar(Object dato) {
		inicio = new NodoLista(dato, inicio);
		cant++;
	}

	@Override
	public Iterator<Object> iterator() {

		return new Iterator<Object>() {

			private NodoLista aux = inicio;

			// Pos: Retorna true si la lista está vacía
			@Override
			public boolean hasNext() {
				return aux != null;
			}

			// Pre: La lista no está vacía
			// Pos: Retorna el elemento siguiente en la iteración
			@Override
			public Object next() {
				Object actual = aux.getDato();
				aux = aux.getSiguiente();
				return actual;
			}
		};
	}

	@Override
	public int largo() {
		int cont = 0;
		NodoLista aux = inicio;
		while (aux != null) {
			cont++;
			aux = aux.getSiguiente();
		}
		return cont;
	}

	@Override
	public boolean existe(Object dato) {

		NodoLista aux = inicio;

		while (aux != null) {

			if (aux.getDato().equals(dato)) {
				return true;
			} else {
				aux = aux.getSiguiente();
			}
		}
		return false;
	}

	// Pre: existe el dato
	@Override
	public Object recuperar(Object dato) {

		NodoLista aux = inicio;

		while (aux != null) {
			if (aux.getDato().equals(dato))
				return aux.getDato();
			else {
				aux = aux.getSiguiente();
			}
		}
		throw new UnsupportedOperationException();
	}

	// pre: el objeto existe en la lista
	// pos: el objeto es borrado de la lista
	@Override
	public void borrar(Object dato) {

		if (inicio.getDato().equals(dato)) {
			inicio = inicio.getSiguiente();
		} else {
			NodoLista aux = inicio;

			while (aux.getSiguiente() != null) {
				if (aux.getSiguiente().getDato().equals(dato)) {
					aux.setSiguiente(aux.getSiguiente().getSiguiente());
					return;
				}
				aux = aux.getSiguiente();
			}
		}
	}

	// pre: el objeto existe en la lista
	// pos: el objeto es borrado de la lista
	@Override
	public String imprimir() {

		// NodoLista aux = inicio;
		// String retorno = "";
		//
		// if (inicio == null) {
		// retorno = "No existen servicios registrados en el hotel";
		// }
		//
		// int i = 0;
		//
		// while (aux != null) {
		// i++;
		// retorno = i + "- " + aux.getDato().toString();
		// return retorno;
		// }
		// return retorno;

		String retorno = "";
		NodoLista aux = this.inicio;
		Integer i = 0;

		while (aux != null) {
			i++;
			aux = aux.getSiguiente();
		}
		
		retorno = i.toString();
		return retorno;

	}

	// if (this.esVacia())
	// System.out.println("La lista es vacia");
	// else{
	// NodoLista aux = this.inicio;
	// while (aux != null){
	// System.out.println(aux.getElem());
	// aux = aux.getSig();
	// }
	// }

}
