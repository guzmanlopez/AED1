package estructuras;

import java.util.Comparator;

public class ListaOrd implements ILista {

	public NodoLista inicio;
	private Comparator<Object> comp;

	public ListaOrd(Comparator<Object> comp) {
		this.comp = comp;
	}

	@Override
	public void insertar(Object dato) {
		if (inicio == null || comp.compare(inicio.getDato(), dato) >= 0)
			inicio = new NodoLista(dato, inicio);
		else {
			NodoLista aux = inicio;
			while (aux.getSiguiente() != null && comp.compare(aux.getSiguiente().getDato(), dato) < 0)
				aux = aux.getSiguiente();
			aux.setSiguiente(new NodoLista(dato, aux.getSiguiente()));
		}
	}

	// ***** Métodos ***** //

	// PRE:
	// POS: Retorna true si la lista no tiene nodos
	public boolean esVacia() {
		if (this.inicio == null) {
			return true;
		} else {
			return false;
		}
	}

	// ***** INSERTAR ***** //

	// PRE:
	// POS: Agrega un nuevo Nodo al principio de la lista
	@Override
	public void agregarInicio(Object dato) {

	}

	// PRE:
	// POS: Agrega un nuevo Nodo al final de la lista
	public void agregarFinal(Object dato) {

	}

	// PRE: IMPLEMENTAR ESTA FUNCION
	// POS: Agrega un nuevo Nodo en la posición i de la lista
	@Override
	public void agregarI(Object dato, Integer i) {

		if (inicio == null || i == 0)
			inicio = new NodoLista(dato, inicio);
		else {
			NodoLista aux = inicio;
			while (aux.getSiguiente() != null && (i--) > 1)
				aux = aux.getSiguiente();
			aux.setSiguiente(new NodoLista(dato, aux.getSiguiente()));
		}
	}

	// ***** BORRAR ***** //

	// PRE: Lista con al menos un elemento
	// POS: Borra el primer nodo
	public void borrarNodoIni() {
		if (!this.esVacia()) {
			this.inicio = this.inicio.getSiguiente();
		}
	}

	// PRE:
	// POS: Borra el último nodo
	public void borrarNodoFin() {

	}

	// PRE: lista con al menos un elemento
	// POS: elimina todos los nodos de una lista dada
	public void vaciarLista() {
		while (inicio != null)
			borrarNodoIni();
	}

	// pre: el objeto existe en la lista
	// pos: el objeto es borrado de la lista
	@Override
	public void borrarElemento(Object dato) {

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

	// ***** DEVOLVER ***** //

	// PRE:
	// POS: Recorre y muestra los datos de lista
	public void mostrarElemento() {
		if (this.esVacia())
			System.out.println("Lista vacía");
		else {
			NodoLista aux = this.inicio;
			while (aux != null) {
				System.out.println(aux.getDato());
				aux = aux.getSiguiente();
			}
		}
	}

	// Pos: Retorna true si existe el elemento en la lista o false si no existe
	// el elemento en la lista
	@Override
	public boolean existeElemento(Object dato) {
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
	// Pos: devuelve el dato de la lista
	@Override
	public Object obtenerElemento(Object dato) {
		NodoLista aux = inicio;
		while (aux != null && !aux.getDato().equals(dato))
			aux = aux.getSiguiente();
		return aux.getDato();
	}

	@Override
	public Object obtenerElementoI(Integer i) {
		NodoLista aux = inicio;
		if (this.esVacia()) {
			return null;
		}

		if (this.cantidadElementos() == 1) {
			return inicio.getDato();
		}

		else {
			Integer ite = 0;
			while (aux.getSiguiente() != null && ite <= i) {
				if (ite == i) {
					return aux.getDato();
				}
				aux = aux.getSiguiente();
				ite++;
			}
		}
		return aux.getDato();
	}

	// POS: devuelve el primer elemento de la lista
	@Override
	public Object obtenerPrimerElemento() {
		return inicio.getDato();
	}

	// PRE:
	// POS: Retorna la cantidad de nodos que tiene la lista
	@Override
	public int cantidadElementos() {
		int cont = 0;
		NodoLista aux = inicio;
		while (aux != null) {
			cont++;
			aux = aux.getSiguiente();
		}
		return cont;
	}

}
