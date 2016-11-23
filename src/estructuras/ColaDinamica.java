package estructuras;

public class ColaDinamica implements ICola {

	private NodoCola frente;
	private NodoCola cola;
	private int largo;
	private int tope;

	public ColaDinamica(int tope) {
		this.frente = this.cola = null;
		this.largo = 0;
		this.tope = tope;
	}

	public ColaDinamica() {
		this.frente = this.cola = null;
		this.largo = 0;
		this.tope = -1;
	}

	@Override
	public void enqueue(Object o) {
		NodoCola nodoCola = new NodoCola(o);
		if (this.cola != null) {
			this.cola.setSiguiente(nodoCola);
			this.cola = this.cola.getSiguiente();
		} else
			this.frente = this.cola = nodoCola;
		this.largo++;
	}

	@Override
	public void dequeue() {
		this.frente = this.frente.getSiguiente();
		if (this.frente == null)
			this.cola = null;
		this.largo--;
	}

	@Override
	public Object obtenerPrimerElemento() {
		return this.frente.getDato();
	}

	@Override
	public Object obtenerElementoI(Integer i) {
		NodoCola aux = this.frente;
		if (this.esVacia()) {
			return null;
		}
		if (this.cantidadElementos() == 1) {
			return this.frente.getDato();
		} else {
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

	@Override
	public Object obtenerPrimerElementoYDequeue() {
		Object ret = obtenerPrimerElemento();
		dequeue();
		return ret;
	}

	@Override
	public int cantidadElementos() {
		return this.largo;
	}

	@Override
	public void vaciarLista() {
		this.frente = this.cola = null;
		this.largo = 0;
	}

	@Override
	public boolean esVacia() {
		return this.largo == 0;
		// return inicio==null;
		// return fin==null;
	}

	@Override
	public boolean esLLena() {
		return this.tope != -1 && this.largo == tope;
	}

	@Override
	public boolean existeElemento(Object o) {
		NodoCola aux = this.frente;
		while (aux != null) {
			if (aux.getDato().equals(o))
				return true;
			else
				aux = aux.getSiguiente();
		}
		return false;
	}

	@Override
	public void borrarElemento(Object o) {
		if (this.frente.getDato().equals(o)) {
			this.frente = this.frente.getSiguiente();
			this.largo--;
			if (this.frente == null)
				this.cola = null;
		} else {
			NodoCola aux = this.frente;
			while (aux.getSiguiente() != null) {
				if (aux.getSiguiente().getDato().equals(o)) {
					aux.setSiguiente(aux.getSiguiente().getSiguiente());
					this.largo--;
					if (aux.getSiguiente() == null)
						this.cola = aux;
					return;
				} else
					aux = aux.getSiguiente();
			}
		}
	}

	// @Override
	// public Iterator<Object> iterator() {
	// return new Iterator<Object>() {
	// private NodoCola aux = inicio;
	//
	// @Override
	// public Object next() {
	// Object dato = aux.getDato();
	// aux = aux.getSig();
	// return dato;
	// }
	//
	// @Override
	// public boolean hasNext() {
	// return aux != null;
	// }
	//
	// @Override
	// public void remove() {
	// // TODO Auto-generated method stub
	//
	// }
	// };
	// }

}