package sistema;

import dominio.Hotel;
import dominio.Ciudad;
//import dominio.Cliente;
//import dominio.Comentario;

// ver si tengo que importar servicio para crear clase servicio
import dominio.Servicio;
import estructuras.ILista;
import estructuras.ListaSEIni;

public class Sistema implements ISistema {

	// ***** Atributos **** //

	private int cantCiudades = 0;

	private ILista hoteles;
	private ILista ciudades;

	// ***** Métodos ***** //

	public enum TipoRet {
		OK, ERROR_1, ERROR_2, ERROR_3, ERROR_4, NO_IMPLEMENTADA
	};

	@Override
	public TipoRet crearSistemaReservas(Integer cantCiudades) {
		this.cantCiudades = cantCiudades;
		this.ciudades = new ListaSEIni();
		this.hoteles = new ListaSEIni();
		return TipoRet.OK;
	}

	@Override
	public TipoRet destruirSistemaReservas() {
		this.cantCiudades = 0;
		this.hoteles = null;
		this.ciudades = null;
		return TipoRet.OK;
	}

	@Override
	public TipoRet registrarCiudad(String ciudad) {

		Ciudad c = new Ciudad(ciudad);

		boolean existeC = this.ciudades.existe(c);

		// 1. En caso que la ciudad “Ciudad” ya existe en el sistema.
		if (existeC) {
			return TipoRet.ERROR_1;
		}

		this.ciudades.insertar(c);
		return TipoRet.OK;
	}

	@Override
	public TipoRet registrarHotel(String ciudad, String nombre, int estrellas, int capacidad) {

		if (estrellas < 1 || estrellas > 5) {
			return TipoRet.ERROR_1;
		}

		if (capacidad < 0) {
			return TipoRet.ERROR_2;
		}

		Ciudad c = new Ciudad(ciudad);
		boolean existeC = this.ciudades.existe(c);

		if (!existeC) {
			return TipoRet.ERROR_4;
		}

		else {
			// Si existe la ciudad
			Hotel h = new Hotel(nombre, ciudad, capacidad, estrellas);
			Ciudad recuperarC = (Ciudad) this.ciudades.recuperar(c);
			boolean existeH = this.hoteles.existe(h);

			if (existeH) {
				return TipoRet.ERROR_3;
			}

			else {
				// Agregar hotel a la ciudad
				recuperarC.ingresarHotel(nombre, ciudad);

				// Agregar hotel a la lista de hoteles
				this.hoteles.insertar(h);
				return TipoRet.OK;
			}
		}
	}

	@Override
	public TipoRet ingresarServicio(String ciudad, String hotel, String servicio) {

		// En caso que no exista la ciudad “Ciudad”.
		Ciudad c = new Ciudad(ciudad);
		boolean existeC = this.ciudades.existe(c);

		if (!existeC) {
			return TipoRet.ERROR_2;
		}

		Hotel h = new Hotel(hotel, ciudad);
		boolean existeH = this.hoteles.existe(h);

		if (!existeH) {
			return TipoRet.ERROR_1;
		}

		else {

			Ciudad recuperarC = (Ciudad) this.ciudades.recuperar(c);
			Hotel recuperarH = (Hotel) recuperarC.getHoteles().recuperar(h);
			recuperarH.ingresarServicio(servicio);
			return TipoRet.OK;
		}
	}

	@Override
	public TipoRet borrarServicio(String ciudad, String hotel, String servicio) {

		// En caso que no exista la ciudad “Ciudad”.
		Ciudad c = new Ciudad(ciudad);
		boolean existeC = this.ciudades.existe(c);

		if (!existeC) {
			return TipoRet.ERROR_3;
		}

		// En caso que no exista un hotel “Hotel” registrado dentro de la ciudad
		// “Ciudad”

		Hotel h = new Hotel(hotel, ciudad);
		boolean existeH = this.hoteles.existe(h);

		if (!existeH) {
			return TipoRet.ERROR_1;
		}

		// 2. En caso de que no exista el servicio “Servicio” registrado en
		// el hotel “Hotel”.

		Ciudad recuperarC = (Ciudad) this.ciudades.recuperar(c);
		Servicio s = new Servicio(servicio);
		Hotel recuperarH = (Hotel) recuperarC.getHoteles().recuperar(h);
		boolean existeS = recuperarH.getServicios().existe(s);

		if (!existeS) {
			return TipoRet.ERROR_2;
		}

		recuperarH.borrarServicio(servicio);
		return TipoRet.OK;
	}

	@Override
	public TipoRet ingresarComentario(String ciudad, String hotel, String comentario, int ranking) {

		// 1. En caso que el ranking sea menor a 0 o mayor a 5.
		if (ranking < 0 || ranking > 5) {

			return TipoRet.ERROR_1;
		}

		Ciudad c = new Ciudad(ciudad);
		boolean existeC = this.ciudades.existe(c);

		// 3. En caso que no exista la ciudad “Ciudad”.
		if (!existeC) {
			return TipoRet.ERROR_3;
		}

		Hotel h = new Hotel(hotel, ciudad);
		boolean existeH = this.hoteles.existe(h);

		if (!existeH) {
			return TipoRet.ERROR_2;
		}

		else {

			Ciudad recuperarC = (Ciudad) this.ciudades.recuperar(c);
			Hotel recuperarH = (Hotel) recuperarC.getHoteles().recuperar(h);
			recuperarH.ingresarComentario(ciudad, hotel, comentario, ranking);
			return TipoRet.OK;
		}
	}

	@Override
	public TipoRet realizarReserva(int cliente, String ciudad, String hotel) {

		Ciudad c = new Ciudad(ciudad);
		boolean existeC = this.ciudades.existe(c);

		// En caso que no exista la ciudad “Ciudad”.
		if (!existeC) {
			return TipoRet.ERROR_2;
		}

		// En caso de que no exista un hotel de nombre “Hotel” registrado
		// dentro de la ciudad Ciudad”.
		Hotel h = new Hotel(hotel, ciudad);
		boolean existeH = this.hoteles.existe(h);

		if (!existeH) {
			return TipoRet.ERROR_1;
		}

		Hotel recuperarH = (Hotel) this.hoteles.recuperar(h);
		int capacidadHotel = recuperarH.getCapacidad();

		// En caso de que la reserva haya sido efectuada correctamente en el
		// hotel “Hotel”
		if (capacidadHotel > 0) {

			recuperarH.ingresarReservas(cliente, ciudad, hotel);
			recuperarH.setCapacidad(capacidadHotel - 1);
			return TipoRet.OK;

			// En caso de que la reserva haya quedado en lista de espera.
		} else {
			recuperarH.ingresarEspera(cliente);
			return TipoRet.OK;
		}
	}

	@Override
	public TipoRet cancelarReserva(int cliente, String ciudad, String hotel) {
		return TipoRet.NO_IMPLEMENTADA;
	}

	@Override
	public TipoRet listarServicios(String ciudad, String hotel) {
		return TipoRet.NO_IMPLEMENTADA;
	}

	@Override
	public TipoRet listarHotelesCiudad(String ciudad) {
		return TipoRet.NO_IMPLEMENTADA;
	}

	@Override
	public TipoRet listarHotelesRanking() {
		return TipoRet.NO_IMPLEMENTADA;
	}

	@Override
	public TipoRet listarComentarios(String ciudad, String hotel) {
		return TipoRet.NO_IMPLEMENTADA;
	}

	@Override
	public TipoRet listarEspera(String ciudad, String hotel) {
		return TipoRet.NO_IMPLEMENTADA;
	}

	@Override
	public TipoRet CargarDistancias(int[][] ciudades) {
		return TipoRet.NO_IMPLEMENTADA;
	}

	@Override
	public TipoRet buscarCamino(int[][] ciudades, String ciudadOrigen, String ciudadDestino) {
		return TipoRet.NO_IMPLEMENTADA;
	}

}
