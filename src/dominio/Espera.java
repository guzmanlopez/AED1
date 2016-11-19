package dominio;

public class Espera {

	// Atributos
	private Cliente cliente;

	// Métodos de acceso y modificación
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	// Constructor
	public Espera(Integer idCliente) {

		this.cliente = new Cliente(idCliente);

	}

}
