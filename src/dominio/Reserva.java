package dominio;

public class Reserva {

	// Atributos
	private Cliente cliente;
	private Ciudad ciudad;
	private Hotel hotel;

	// Métodos de acceso y modificación
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Integer idCliente) {
		this.cliente = new Cliente(idCliente);
	}

	public Ciudad getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = new Ciudad(ciudad);
	}

	public Hotel getHotel() {
		return this.hotel;
	}

	public void setHotel(String hotel) {
		this.hotel = new Hotel(hotel);
	}

	// Constructor
	public Reserva(Integer idCliente, String ciudad, String hotel) {

		this.ciudad = new Ciudad(ciudad);
		this.hotel = new Hotel(hotel);
		this.cliente = new Cliente(idCliente);

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

		Reserva otra = (Reserva) obj;

		if (this.getCliente().getId() != otra.getCliente().getId() || this.getCiudad().getNomCiudad() != otra.getCiudad().getNomCiudad() || this.getHotel().getNombre() != otra.getHotel().getNombre()) {
			ret = false;
		}

		return ret;
	}

}
