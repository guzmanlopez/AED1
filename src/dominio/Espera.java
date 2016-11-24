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

	@Override
	public String toString() {
		return this.cliente.getId().toString();
	}

	@Override
	public boolean equals(Object obj) {
		boolean ret = true;
		if (this == obj) {
			ret = true;
		}
		if (obj == null) {
			ret = false;
		}
		if (getClass() != obj.getClass()) {
			ret = false;
		}
		Espera otra = (Espera) obj;
		if (this.getCliente().getId() != otra.getCliente().getId()) {
			ret = false;
		}
		return ret;
	}

}
