package estructuras;

public class NodoLista {

	// Atributos //

	private Object dato;
	private NodoLista siguiente;

	// Constructor //
	
	public NodoLista(Object dato) {
		this.dato = dato;
		this.siguiente = null;
	}

	public NodoLista(Object dato, NodoLista siguiente) {
		this.dato = dato;
		this.siguiente = siguiente;
	}

	// Métodos de acceso y modificación //

	public Object getDato() {
		return this.dato;
	}

	public void setDato(Object dato) {
		this.dato = dato;
	}

	public NodoLista getSiguiente() {
		return this.siguiente;
	}

	public void setSiguiente(NodoLista siguiente) {
		this.siguiente = siguiente;
	}

	// Sobreescribir métodos //
	@Override
	public String toString() {
		return "NodoLista [dato =" + dato + ", siguiente =" + siguiente + "]";
	}

}
