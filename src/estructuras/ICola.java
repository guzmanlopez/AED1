package estructuras;

public interface ICola {
	
	// Pre: !isFull()
	public void enqueue(Object o);

	// Pre: !isEmpty()
	public void dequeue();

	// Pre: !isEmpty()
	public Object obtenerPrimerElemento();

	// Pre: !isEmpty()
	public Object frontAndDequeue();

	public int cantidadElementos();

	public void vaciarLista();

	public boolean esVacia();

	public boolean esLLena();

	public boolean existeElemento(Object o);

	// Pre: exists(o)
	public void borrarElemento(Object o);

	Object obtenerElementoI(Integer i);
}