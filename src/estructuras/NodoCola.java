package estructuras;

public class NodoCola {

	private Object dato;
	private NodoCola siguiente;

	public NodoCola(Object dato, NodoCola siguiente) {
		this.dato = dato;
		this.siguiente = siguiente;
	}

	public NodoCola(Object dato) {
		this.dato = dato;
		// this.sig = null;
	}

	public Object getDato() {
		return this.dato;
	}

	public void setDato(Object dato) {
		this.dato = dato;
	}

	public NodoCola getSiguiente() {
		return this.siguiente;
	}

	public void setSiguiente(NodoCola siguiente) {
		this.siguiente = siguiente;
	}

	@Override
	public String toString() {
		return "NodoCola [dato=" + dato + ", sig=" + siguiente + "]";
	}

}
