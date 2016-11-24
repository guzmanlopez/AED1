package estructuras;

public interface ILista {

	// public interface ILista extends Iterable<Object>

	// ***** Métodos de la interfaz ***** //

	public boolean esVacia();

	public void agregarInicio(Object dato);

	public void agregarFinal(Object dato);

	void agregarI(Object dato, Integer i);

	void insertar(Object dato);

	public void borrarNodoIni();

	public void borrarNodoFin();

	public void vaciarLista();

	public void borrarElemento(Object dato);

	public void mostrarElemento();

	public boolean existeElemento(Object dato);

	public Object obtenerElemento(Object dato);

	public Object obtenerPrimerElemento();

	public int cantidadElementos();

	Object obtenerElementoI(Integer i);

}
