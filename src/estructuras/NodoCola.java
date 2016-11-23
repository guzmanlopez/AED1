package estructuras;

public class NodoCola {

	private Object dato;
	private NodoCola siguiente;

	public NodoCola(Object dato, NodoCola sig) {
		this.dato = dato;
		this.siguiente = sig;
	}

	public NodoCola(Object dato) {
		this.dato = dato;
		// this.sig = null;
	}

	public Object getDato() {
		return dato;
	}

	public void setDato(Object dato) {
		this.dato = dato;
	}

	public NodoCola getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoCola sig) {
		this.siguiente = sig;
	}

	@Override
	public String toString() {
		return "NodoCola [dato=" + dato + ", sig=" + siguiente + "]";
	}

}
