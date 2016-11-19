package dominio;

public class Servicio {

	// Atributos
	private String nomServicio;

	// Métodos de acceso y modificación
	public String getNomServicio() {
		return this.nomServicio;
	}

	public void setNomServicio(String nomServicio) {
		this.nomServicio = nomServicio;
	}

	// Constructor
	public Servicio(String nomServicio) {

		this.nomServicio = nomServicio;

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

		Servicio otro = (Servicio) obj;

		if (this.nomServicio != otro.nomServicio) {
			ret = false;
		}

		return ret;
	}

	@Override
	public String toString() {
		return this.nomServicio;
	}


}
