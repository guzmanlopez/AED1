package sistema;

import dominio.Hotel;
import dominio.Ciudad;

//import dominio.Cliente;
//import dominio.Comentario;

// ver si tengo que importar estas clases 
import dominio.Servicio;
import dominio.Reserva;

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
			// Ingresar servicio al hotel que está en la lista de hoteles de la
			// ciudad
			Hotel recuperarH = (Hotel) recuperarC.getHoteles().recuperar(h);
			recuperarH.ingresarServicio(servicio);
			// Ingresar servicio al hotel que está en la lista de hoteles del
			// sistema
			Hotel recuperarHenLista = (Hotel) this.hoteles.recuperar(h);
			recuperarHenLista.ingresarServicio(servicio);

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

		// Borrar servicio del hotel que está en la lista de hoteles de la
		// ciudad
		recuperarH.borrarServicio(servicio);
		// Borrar servicio del hotel que está en la lista de hoteles del
		// sistema
		Hotel recuperarHenLista = (Hotel) this.hoteles.recuperar(h);
		recuperarHenLista.borrarServicio(servicio);

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
			// Agregar comentario al hotel en la lista de hoteles de la ciudad
			recuperarH.ingresarComentario(ciudad, hotel, comentario, ranking);

			// Agregar comentario al hotel en la lista de hoteles del sistema
			Hotel recuperarHenS = (Hotel) this.hoteles.recuperar(h);
			recuperarHenS.ingresarComentario(ciudad, hotel, comentario, ranking);

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

		// En caso de que la reserva haya sido efectuada correctamente en el
		// hotel “Hotel”
		recuperarH.ingresarReservas(cliente, ciudad, hotel);
		return TipoRet.OK;

	}

	@Override
	public TipoRet cancelarReserva(int cliente, String ciudad, String hotel) {

		Ciudad c = new Ciudad(ciudad);
		boolean existeC = this.ciudades.existe(c);

		// En caso que no exista la ciudad “Ciudad”.
		if (!existeC) {
			return TipoRet.ERROR_3;
		}

		// En caso de que no exista un hotel de nombre “Hotel” registrado
		// dentro de la ciudad Ciudad”.
		Hotel h = new Hotel(hotel, ciudad);
		boolean existeH = this.hoteles.existe(h);

		if (!existeH) {
			return TipoRet.ERROR_1;
		}

		Hotel recuperarH = (Hotel) this.hoteles.recuperar(h);

		// En caso de que el cliente no tenga la reserva en el hotel
		Reserva r = new Reserva(cliente, ciudad, hotel);
		boolean existeR = recuperarH.getReservas().existe(r);

		if (!existeR) {
			return TipoRet.ERROR_2;
		}

		recuperarH.borrarReservas(cliente, ciudad, hotel);
		// System.out.println("Reservas = " + recuperarH.getReservas().largo());
		// System.out.println("Esperas = " + recuperarH.getEsperas().largo());
		return TipoRet.OK;

	}

	@Override
	public TipoRet listarServicios(String ciudad, String hotel) {

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

		// Ciudad recuperarC = (Ciudad) this.ciudades.recuperar(c);
		// Hotel recuperarH = (Hotel) recuperarC.getHoteles().recuperar(h);
		Hotel recuperarH = (Hotel) this.hoteles.recuperar(h);

		ILista listaServicios = recuperarH.getServicios();

		if (listaServicios.largo() == 0)
			System.out.println("No existen servicios registrados en el hotel " + recuperarH.getNombre() + " "
					+ recuperarH.getCiudad() + "." + "\n");
		else {
			int contador = 1;
			System.out.println(
					"Servicios del Hotel " + recuperarH.getNombre() + " " + recuperarH.getCiudad() + ":" + "\n");
			for (Object servicio : listaServicios)
				System.out.println(contador++ + " - " + (String) servicio.toString());
		}

		return TipoRet.OK;

	}

	@Override
	public TipoRet listarHotelesCiudad(String ciudad) {

		Ciudad c = new Ciudad(ciudad);
		boolean existeC = this.ciudades.existe(c);

		// En caso que no exista la ciudad “Ciudad”.
		if (!existeC) {
			return TipoRet.ERROR_1;
		}

		Ciudad recuperarC = (Ciudad) this.ciudades.recuperar(c);

		ILista listaHoteles = recuperarC.getHoteles();

		if (listaHoteles.largo() == 0)
			System.out.println("No existen hoteles registrados en " + recuperarC.getNomCiudad() + "." + "\n");
		else {
			int contador = 1;
			System.out.println("Hoteles en " + recuperarC.getNomCiudad() + ":" + "\n");
			for (Object hotel : listaHoteles)
				System.out.println(contador++ + " - " + (String) hotel.toString());
		}

		return TipoRet.OK;

	}

	@Override
	public TipoRet listarHotelesRanking() {
		return TipoRet.NO_IMPLEMENTADA;
	}

	@Override
	public TipoRet listarComentarios(String ciudad, String hotel) {

		Ciudad c = new Ciudad(ciudad);
		boolean existeC = this.ciudades.existe(c);

		// En caso que no exista la ciudad “Ciudad”.
		if (!existeC) {
			return TipoRet.ERROR_2;
		}

		// En caso que no exista un hotel “Hotel” registrado dentro de la ciudad
		// “Ciudad”
		Hotel h = new Hotel(hotel, ciudad);
		boolean existeH = this.hoteles.existe(h);

		if (!existeH) {
			return TipoRet.ERROR_1;
		}

		// Ciudad recuperarC = (Ciudad) this.ciudades.recuperar(c);
		// Hotel recuperarH = (Hotel) recuperarC.getHoteles().recuperar(h);
		Hotel recuperarH = (Hotel) this.hoteles.recuperar(h);
		ILista listaComentarios = recuperarH.getComentarios();

		if (listaComentarios.largo() == 0)
			System.out.println("No se han agregado comentarios al hotel " + recuperarH.getNombre() + " "
					+ recuperarH.getCiudad() + "." + "\n");
		else {
			int contador = 1;
			for (Object comentario : listaComentarios)
				System.out.println(contador++ + " - " + (String) comentario.toString());
		}
		return TipoRet.OK;

	}

	@Override
	public TipoRet listarEspera(String ciudad, String hotel) {

		Ciudad c = new Ciudad(ciudad);
		boolean existeC = this.ciudades.existe(c);

		// En caso que no exista la ciudad “Ciudad”.
		if (!existeC) {
			return TipoRet.ERROR_2;
		}

		// En caso que no exista un hotel “Hotel” registrado dentro de la ciudad
		// “Ciudad”
		Hotel h = new Hotel(hotel, ciudad);
		boolean existeH = this.hoteles.existe(h);

		if (!existeH) {
			return TipoRet.ERROR_1;
		}

		Hotel recuperarH = (Hotel) this.hoteles.recuperar(h);
		ILista listaEspera = recuperarH.getEsperas();

		if (listaEspera.largo() == 0)
			System.out.println("No existen reservas pendientes para el hotel " + recuperarH.getNombre() + " "
					+ recuperarH.getCiudad() + "." + "\n");
		else {
			int contador = 1;
			System.out.println(
					"Lista de espera para el hotel " + recuperarH.getNombre() + " " + recuperarH.getCiudad() + ": " + "\n");
			for (Object espera : listaEspera)
				System.out.println(contador++ + " - " + (String) espera.toString());
		}

		return TipoRet.OK;

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
