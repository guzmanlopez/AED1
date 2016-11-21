package estructuras;

public interface ILista extends Iterable<Object> {

	// Pre: Lista.largo() > 0
	public Object primero();

	// Pos: Inserta el elemento 'n' al principio de la lista.
	public void insertar(Object dato);

	public int largo();

	public boolean existe(Object dato);

	// pre: el objeto existe en la lista
	// pos: el objeto es borrado de la lista
	public void borrar(Object dato);

	// Pre: existe el dato
	public Object recuperar(Object dato);

	public String imprimir();
}
