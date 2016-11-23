package estructuras;

public class ColaDinamica implements ICola {

	private NodoCola inicio;
	private NodoCola fin;
	private int largo;
	private int tope;

	public ColaDinamica(int tope) {
		this.inicio = this.fin = null;
		this.largo = 0;
		this.tope = tope;
	}

	public ColaDinamica() {
		this.inicio = this.fin = null;
		this.largo = 0;
		this.tope = -1;
	}

	@Override
	public void enqueue(Object o) {
		NodoCola nodoCola = new NodoCola(o);
		if (fin != null) {
			fin.setSiguiente(nodoCola);
			fin = fin.getSiguiente();
		} else
			inicio = fin = nodoCola;
		largo++;
	}

	@Override
	public void dequeue() {
		inicio = inicio.getSiguiente();
		if (inicio == null)
			fin = null;
		largo--;
	}

	@Override
	public Object front() {
		return inicio.getDato();
	}

	@Override
	public Object frontAndDequeue() {
		Object ret = front();
		dequeue();
		return ret;
	}

	@Override
	public int size() {
		return largo;
	}

	@Override
	public void empty() {
		this.inicio = this.fin = null;
		this.largo = 0;
	}

	@Override
	public boolean isEmpty() {
		return largo == 0;
		// return inicio==null;
		// return fin==null;
	}

	@Override
	public boolean isFull() {
		return tope != -1 && largo == tope;
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

	@Override
	public boolean exists(Object o) {
		NodoCola aux = inicio;
		while (aux != null) {
			if (aux.getDato().equals(o))
				return true;
			else
				aux = aux.getSiguiente();
		}
		return false;
	}

	@Override
	public void remove(Object o) {
		if (inicio.getDato().equals(o)) {
			inicio = inicio.getSiguiente();
			largo--;
			if (inicio == null)
				fin = null;
		} else {
			NodoCola aux = inicio;
			while (aux.getSiguiente() != null) {
				if (aux.getSiguiente().getDato().equals(o)) {
					aux.setSiguiente(aux.getSiguiente().getSiguiente());
					largo--;
					if (aux.getSiguiente() == null)
						fin = aux;
					return;
				} else
					aux = aux.getSiguiente();
			}
		}
	}
}