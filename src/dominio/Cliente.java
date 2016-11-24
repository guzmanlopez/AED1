package dominio;

public class Cliente {

	// Atributos
	private Integer id;

	// Métodos de acceso y modificación
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente(Integer id) {
		this.id = id;
	}

	// ***** Sobreescritura ***** //

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
		Cliente otro = (Cliente) obj;

		if (this.id != otro.id) {
			ret = false;
		}
		return ret;
	}
	
	@Override
	public String toString() {
		return this.id.toString();
	}
}
