package dominio;

import estructuras.ILista;
import estructuras.ListaSEIni;

public class Hotel {

	// ***** Atributos *****//

	private String nombre;
	private Ciudad ciudad;
	private int capacidad;
	private int categoria;

	private ILista comentarios = new ListaSEIni();
	private ILista servicios = new ListaSEIni();
	private ILista reservas = new ListaSEIni();
	private ILista esperas = new ListaSEIni();

	// ***** Métodos de acceso y modificación *****//

	public Hotel(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return this.ciudad.toString();
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public Integer getCapacidad() {
		return this.capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	public Integer getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Integer categoria) {
		this.categoria = categoria;
	}

	public ILista getComentarios() {
		return this.comentarios;
	}

	public void setComentarios(Comentario comentario) {
		this.comentarios.insertar(comentario);
	}

	public ILista getServicios() {
		return this.servicios;
	}

	public void setServicios(Servicio servicio) {
		this.servicios.insertar(servicio);
	}

	public ILista getReservas() {
		return this.reservas;
	}

	public void setReservas(Reserva reserva) {
		this.reservas.insertar(reserva);
	}

	public ILista getEsperas() {
		return this.esperas;
	}

	public void setEsperas(Espera espera) {
		this.reservas.insertar(espera);
	}

	// ***** Constructor *****//

	public Hotel(String nombre, String ciudad, Integer capacidad, Integer categoria) {

		this.nombre = nombre;
		this.ciudad = new Ciudad(ciudad);
		this.capacidad = capacidad;
		this.categoria = categoria;

	}

	public Hotel(String nombre, String ciudad) {

		this.nombre = nombre;
		this.ciudad = new Ciudad(ciudad);

	}

	// **** Métodos ***** //

	// pre: el servicio no existe en ILista servicios
	// pos: el servicio es agregado a ILista servicios
	public void ingresarServicio(String servicio) {
		Servicio nuevoS = new Servicio(servicio);
		this.servicios.insertar(nuevoS);
	}

	// pre: el servicio existe en ILista servicios
	// pos: el servicio es borrado de ILista servicios
	public void borrarServicio(String servicio) {
		Servicio borrarS = new Servicio(servicio);
		this.servicios.borrar(borrarS);
	}

	// pre: el servicio no existe en ILista servicios
	// pos: el servicio es agregado a ILista servicios
	public void ingresarComentario(String ciudad, String hotel, String comentario, Integer ranking) {
		Comentario nuevoC = new Comentario(comentario);
		this.comentarios.insertar(nuevoC);
	}

	// pre: el servicio existe en ILista servicios
	// pos: el servicio es borrado de ILista servicios
	public void borrarComentario(String ciudad, String hotel, String comentario, Integer ranking) {
		Comentario borrarC = new Comentario(comentario);
		this.comentarios.borrar(borrarC);
	}

	// pre: la reserva no existe en ILista reservas
	// pos: la reserva es agregada a ILista reservas
	public void ingresarReservas(int cliente, String ciudad, String hotel) {
		Reserva nuevaR = new Reserva(cliente, ciudad, hotel);
		this.reservas.insertar(nuevaR);
	}

	// pre: la reserva existe en ILista reservas
	// pos: la reserva es borrada de ILista reservas
	public void borrarReservas(int cliente, String ciudad, String hotel) {
		Reserva borrarR = new Reserva(cliente, ciudad, hotel);
		this.reservas.borrar(borrarR);
	}

	// pre: la reserva no existe en ILista reservas
	// pos: la reserva es agregada a ILista reservas
	public void ingresarEspera(Integer idCliente) {

		Espera nuevaE = new Espera(idCliente);
		this.esperas.insertar(nuevaE);
	}

	// pre: la reserva existe en ILista reservas
	// pos: la reserva es borrada de ILista reservas
	public void borrarespera(Integer idCliente) {
		Espera nuevaE = new Espera(idCliente);
		this.esperas.borrar(nuevaE);
	}

	// ***** Sobreescrituras ***** //

	// Cambiar equals para que compare si un hotel es igual a otro solo por
	// nombre y ciudad
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

		Hotel otro = (Hotel) obj;

		if (this.nombre != otro.nombre || this.getCiudad() != otro.getCiudad()) {
			ret = false;
		}

		return ret;
	}

}
