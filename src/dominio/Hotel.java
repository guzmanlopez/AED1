package dominio;

import estructuras.ColaDinamica;
import estructuras.ICola;
import estructuras.ILista;
import estructuras.ListaSEIni;

public class Hotel {

	// ***** Atributos *****//

	private String nombre;
	private Ciudad ciudad;
	private int capacidad;
	private int estrellas;
	private float rankingHotel;

	private ILista comentarios = new ListaSEIni();
	private ILista servicios = new ListaSEIni();
	private ILista reservas = new ListaSEIni();
	private ILista esperas = new ListaSEIni();
	// private ICola esperas = new ColaDinamica();

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

	public Integer getEstrellas() {
		return this.estrellas;
	}

	public void setEstrellas(Integer categoria) {
		this.estrellas = categoria;
	}

	public float getRanking() {
		return this.rankingHotel;
	}

	public void setRanking(float ranking) {
		this.rankingHotel = ranking;
	}

	public ILista getComentarios() {
		return this.comentarios;
	}

	public void setComentarios(Comentario comentario) {
		this.comentarios.agregarInicio(comentario);
	}

	public ILista getServicios() {
		return this.servicios;
	}

	public void setServicios(Servicio servicio) {
		this.servicios.agregarInicio(servicio);
	}

	public ILista getReservas() {
		return this.reservas;
	}

	public void setReservas(Reserva reserva) {
		this.reservas.agregarInicio(reserva);
	}

	public ILista getEsperas() {
		return this.esperas;
	}

	public void setEsperas(Espera espera) {
		this.reservas.agregarInicio(espera);
	}

	// ***** Constructor *****//

	public Hotel(String nombre, String ciudad, Integer capacidad, Integer categoria) {

		this.nombre = nombre;
		this.ciudad = new Ciudad(ciudad);
		this.capacidad = capacidad;
		this.estrellas = categoria;
		this.rankingHotel = 0;

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
		this.servicios.agregarInicio(nuevoS);
	}

	// pre: el servicio existe en ILista servicios
	// pos: el servicio es borrado de ILista servicios
	public void borrarServicio(String servicio) {
		Servicio borrarS = new Servicio(servicio);
		this.servicios.borrarElemento(borrarS);
	}

	// pre: el servicio no existe en ILista servicios
	// pos: el servicio es agregado a ILista servicios
	public void ingresarComentario(String ciudad, String hotel, String comentario, Integer ranking) {
		Comentario nuevoC = new Comentario(comentario, ranking);
		this.comentarios.agregarInicio(nuevoC);
		actualizarRankingHotel();
	}

	// pre: el servicio existe en ILista servicios
	// pos: el servicio es borrado de ILista servicios
	public void borrarComentario(String ciudad, String hotel, String comentario, Integer ranking) {
		Comentario borrarC = new Comentario(comentario, ranking);
		this.comentarios.borrarElemento(borrarC);
		actualizarRankingHotel();
	}

	// pre: la reserva no existe en ILista reservas
	// pos: la reserva es agregada a ILista reservas
	public void ingresarReservas(int cliente, String ciudad, String hotel) {
		Reserva nuevaR = new Reserva(cliente, ciudad, hotel);

		// Capacidad
		if (this.capacidad >= 1) {
			this.reservas.agregarInicio(nuevaR);
			this.capacidad = this.capacidad - 1;
		}

		else {
			ingresarEspera(cliente);
			// System.out.println("A lista de espera");
		}
	}

	// pre: la reserva existe en ILista reservas
	// pos: la reserva es borrada de ILista reservas
	public void borrarReservas(int cliente, String ciudad, String hotel) {

		Reserva borrarR = new Reserva(cliente, ciudad, hotel);
		this.reservas.borrarElemento(borrarR);

		if (this.esperas.cantidadElementos() > 0) {

			// Tomo el primero de la lista de espera
			Espera e = (Espera) this.esperas.obtenerPrimerElemento();
			// Creo la reserva
			Reserva r = new Reserva(e.getCliente().getId(), ciudad, hotel);
			// Agrego la reserva a la lista de reservas del hotel
			this.reservas.agregarInicio(r);
			// Borro la espera
			this.esperas.borrarElemento(e);

		}

		else {

			// Capacidad
			this.capacidad = this.capacidad + 1;

		}
	}

	// pre: la reserva no existe en ILista reservas
	// pos: la reserva es agregada a ILista reservas
	public void ingresarEspera(Integer idCliente) {

		Espera nuevaE = new Espera(idCliente);
		this.esperas.agregarInicio(nuevaE);
	}

	// pre: la reserva existe en ILista reservas
	// pos: la reserva es borrada de ILista reservas
	public void borrarespera(Integer idCliente) {
		Espera nuevaE = new Espera(idCliente);
		this.esperas.borrarElemento(nuevaE);
	}

	private void actualizarRankingHotel() {

		float rankingTotal = 0;

		for (Integer i = 0; i < this.comentarios.cantidadElementos(); i++) {
			Comentario comentario = (Comentario) this.comentarios.obtenerElementoI(i);
			rankingTotal += comentario.getRanking();
		}

		// for (Object comentario : this.comentarios) {
		// Comentario c = (Comentario) comentario;
		// rankingTotal += c.getRanking();
		// }

		this.rankingHotel = rankingTotal / this.comentarios.cantidadElementos();
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

	@Override
	public String toString() {
		return this.getNombre();
	}

}
