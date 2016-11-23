package sistema;

import dominio.Hotel;
import dominio.Ciudad;
import dominio.Comentario;

//import dominio.Cliente;
//import dominio.Comentario;

// ver si tengo que importar estas clases 
import dominio.Servicio;
import dominio.Reserva;
import dominio.Espera;
import estructuras.ICola;
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
		boolean existeC = this.ciudades.existeElemento(c);

		// 1. En caso que agregar la ciudad “Ciudad” supere el límite
		// establecido por el sistema

		if (this.cantCiudades != 0 && this.ciudades.cantidadElementos() == this.cantCiudades) {
			return TipoRet.ERROR_2;
		}

		// 1. En caso que la ciudad “Ciudad” ya existe en el sistema.
		if (existeC) {
			return TipoRet.ERROR_1;
		}

		this.ciudades.agregarInicio(c);
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
		boolean existeC = this.ciudades.existeElemento(c);

		if (!existeC) {
			return TipoRet.ERROR_4;
		}

		else {
			// Si existe la ciudad
			Hotel h = new Hotel(nombre, ciudad, capacidad, estrellas);
			Ciudad recuperarC = (Ciudad) this.ciudades.obtenerElemento(c);
			boolean existeH = this.hoteles.existeElemento(h);

			if (existeH) {
				return TipoRet.ERROR_3;
			}

			else {
				// Agregar hotel a la ciudad
				recuperarC.ingresarHotel(nombre, ciudad);

				// Agregar hotel a la lista de hoteles en el sistema
				this.hoteles.agregarInicio(h);
				return TipoRet.OK;
			}
		}
	}

	@Override
	public TipoRet ingresarServicio(String ciudad, String hotel, String servicio) {

		// En caso que no exista la ciudad “Ciudad”.
		Ciudad c = new Ciudad(ciudad);
		boolean existeC = this.ciudades.existeElemento(c);

		if (!existeC) {
			return TipoRet.ERROR_2;
		}

		Hotel h = new Hotel(hotel, ciudad);
		boolean existeH = this.hoteles.existeElemento(h);

		if (!existeH) {
			return TipoRet.ERROR_1;
		}

		else {

			Ciudad recuperarC = (Ciudad) this.ciudades.obtenerElemento(c);
			// Ingresar servicio al hotel que está en la lista de hoteles de la
			// ciudad
			Hotel recuperarH = (Hotel) recuperarC.getHoteles().obtenerElemento(h);
			recuperarH.ingresarServicio(servicio);
			// Ingresar servicio al hotel que está en la lista de hoteles del
			// sistema
			Hotel recuperarHenLista = (Hotel) this.hoteles.obtenerElemento(h);
			recuperarHenLista.ingresarServicio(servicio);

			return TipoRet.OK;
		}
	}

	@Override
	public TipoRet borrarServicio(String ciudad, String hotel, String servicio) {

		// En caso que no exista la ciudad “Ciudad”.
		Ciudad c = new Ciudad(ciudad);
		boolean existeC = this.ciudades.existeElemento(c);

		if (!existeC) {
			return TipoRet.ERROR_3;
		}

		// En caso que no exista un hotel “Hotel” registrado dentro de la ciudad
		// “Ciudad”

		Hotel h = new Hotel(hotel, ciudad);
		boolean existeH = this.hoteles.existeElemento(h);

		if (!existeH) {
			return TipoRet.ERROR_1;
		}

		// 2. En caso de que no exista el servicio “Servicio” registrado en
		// el hotel “Hotel”.

		Ciudad recuperarC = (Ciudad) this.ciudades.obtenerElemento(c);
		Servicio s = new Servicio(servicio);
		Hotel recuperarH = (Hotel) recuperarC.getHoteles().obtenerElemento(h);
		boolean existeS = recuperarH.getServicios().existeElemento(s);

		if (!existeS) {
			return TipoRet.ERROR_2;
		}

		// Borrar servicio del hotel que está en la lista de hoteles de la
		// ciudad
		recuperarH.borrarServicio(servicio);
		// Borrar servicio del hotel que está en la lista de hoteles del
		// sistema
		Hotel recuperarHenLista = (Hotel) this.hoteles.obtenerElemento(h);
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
		boolean existeC = this.ciudades.existeElemento(c);

		// 3. En caso que no exista la ciudad “Ciudad”.
		if (!existeC) {
			return TipoRet.ERROR_3;
		}

		Hotel h = new Hotel(hotel, ciudad);
		boolean existeH = this.hoteles.existeElemento(h);

		if (!existeH) {
			return TipoRet.ERROR_2;
		}

		else {

			Ciudad recuperarC = (Ciudad) this.ciudades.obtenerElemento(c);
			Hotel recuperarH = (Hotel) recuperarC.getHoteles().obtenerElemento(h);
			// Agregar comentario al hotel en la lista de hoteles de la ciudad
			recuperarH.ingresarComentario(ciudad, hotel, comentario, ranking);

			// Agregar comentario al hotel en la lista de hoteles del sistema
			Hotel recuperarHenS = (Hotel) this.hoteles.obtenerElemento(h);
			recuperarHenS.ingresarComentario(ciudad, hotel, comentario, ranking);

			// System.out.println(recuperarHenS.getRanking());

			return TipoRet.OK;
		}
	}

	@Override
	public TipoRet realizarReserva(int cliente, String ciudad, String hotel) {

		Ciudad c = new Ciudad(ciudad);
		boolean existeC = this.ciudades.existeElemento(c);

		// En caso que no exista la ciudad “Ciudad”.
		if (!existeC) {
			return TipoRet.ERROR_2;
		}

		// En caso de que no exista un hotel de nombre “Hotel” registrado
		// dentro de la ciudad Ciudad”.
		Hotel h = new Hotel(hotel, ciudad);
		boolean existeH = this.hoteles.existeElemento(h);

		if (!existeH) {
			return TipoRet.ERROR_1;
		}

		Hotel recuperarH = (Hotel) this.hoteles.obtenerElemento(h);

		// En caso de que la reserva haya sido efectuada correctamente en el
		// hotel “Hotel”
		recuperarH.ingresarReservas(cliente, ciudad, hotel);
		return TipoRet.OK;

	}

	@Override
	public TipoRet cancelarReserva(int cliente, String ciudad, String hotel) {

		Ciudad c = new Ciudad(ciudad);
		boolean existeC = this.ciudades.existeElemento(c);

		// En caso que no exista la ciudad “Ciudad”.
		if (!existeC) {
			return TipoRet.ERROR_3;
		}

		// En caso de que no exista un hotel de nombre “Hotel” registrado
		// dentro de la ciudad Ciudad”.
		Hotel h = new Hotel(hotel, ciudad);
		boolean existeH = this.hoteles.existeElemento(h);

		if (!existeH) {
			return TipoRet.ERROR_1;
		}

		Hotel recuperarH = (Hotel) this.hoteles.obtenerElemento(h);

		// En caso de que el cliente no tenga la reserva en el hotel
		Reserva r = new Reserva(cliente, ciudad, hotel);
		Espera e = new Espera(cliente);
		boolean existeR = recuperarH.getReservas().existeElemento(r);
		boolean existeE = recuperarH.getEsperas().existeElemento(e);

		// System.out.println("Existe la espera: " + existeE);

		if (!existeR && !existeE) {
			return TipoRet.ERROR_2;
		}

		if (existeR) {
			recuperarH.borrarReservas(cliente, ciudad, hotel);
		} else {
			recuperarH.borrarEspera(cliente);
		}

		// System.out.println("Reservas = " +
		// recuperarH.getReservas().cantidadElementos());
		// System.out.println("Esperas = " +
		// recuperarH.getEsperas().cantidadElementos());

		return TipoRet.OK;
	}

	@Override
	public TipoRet listarServicios(String ciudad, String hotel) {

		Ciudad c = new Ciudad(ciudad);
		boolean existeC = this.ciudades.existeElemento(c);

		// En caso que no exista la ciudad “Ciudad”.
		if (!existeC) {
			return TipoRet.ERROR_2;
		}

		// En caso de que no exista un hotel de nombre “Hotel” registrado
		// dentro de la ciudad Ciudad”.
		Hotel h = new Hotel(hotel, ciudad);
		boolean existeH = this.hoteles.existeElemento(h);

		if (!existeH) {
			return TipoRet.ERROR_1;
		}

		// Ciudad recuperarC = (Ciudad) this.ciudades.recuperar(c);
		// Hotel recuperarH = (Hotel) recuperarC.getHoteles().recuperar(h);
		Hotel recuperarH = (Hotel) this.hoteles.obtenerElemento(h);

		ILista listaServicios = recuperarH.getServicios();

		if (listaServicios.cantidadElementos() == 0)
			System.out.println("No existen servicios registrados en el hotel " + recuperarH.getNombre() + " "
					+ recuperarH.getCiudad() + "." + "\n");
		else {
			int contador = 1;
			System.out.println(
					"Servicios del Hotel " + recuperarH.getNombre() + " " + recuperarH.getCiudad() + ":" + "\n");

			for (Integer i = 0; i < listaServicios.cantidadElementos(); i++) {
				Servicio servicio = (Servicio) listaServicios.obtenerElementoI(i);
				System.out.println(contador++ + " - " + (String) servicio.toString());
			}

			// for (Object servicio : listaServicios)
			// System.out.println(contador++ + " - " + (String)
			// servicio.toString());
		}

		return TipoRet.OK;

	}

	@Override
	public TipoRet listarHotelesCiudad(String ciudad) {

		Ciudad c = new Ciudad(ciudad);
		boolean existeC = this.ciudades.existeElemento(c);

		// En caso que no exista la ciudad “Ciudad”.
		if (!existeC) {
			return TipoRet.ERROR_1;
		}

		Ciudad recuperarC = (Ciudad) this.ciudades.obtenerElemento(c);

		ILista listaHoteles = recuperarC.getHoteles();

		if (listaHoteles.cantidadElementos() == 0)
			System.out.println("No existen hoteles registrados en " + recuperarC.getNomCiudad() + "." + "\n");
		else {
			int contador = 1;
			System.out.println("Hoteles en " + recuperarC.getNomCiudad() + ":" + "\n");

			for (Integer i = 0; i < listaHoteles.cantidadElementos(); i++) {
				Hotel hotel = (Hotel) listaHoteles.obtenerElementoI(i);
				System.out.println(contador++ + " - " + (String) hotel.toString());
			}

			// for (Object hotel : listaHoteles)
			// System.out.println(contador++ + " - " + (String)
			// hotel.toString());
		}

		return TipoRet.OK;

	}

	@Override
	public TipoRet listarHotelesRanking() {
		ILista listaHoteles = this.hoteles;
		if (listaHoteles.cantidadElementos() == 0)
			System.out.println("No hay registros de hoteles en el sistema");
		else {
			System.out.println("Hoteles ordenados por ranking: " + "/n");
			for (Integer i = 0; i < listaHoteles.cantidadElementos(); i++) {
				Hotel hotel = (Hotel) listaHoteles.obtenerElementoI(i);
				System.out.println((String) hotel.getCiudad() + " - " + (String) hotel.toString() + " - "
						+ (Float) hotel.getRanking());
			}
		}
		return TipoRet.OK;
	}

	@Override
	public TipoRet listarComentarios(String ciudad, String hotel) {

		Ciudad c = new Ciudad(ciudad);
		boolean existeC = this.ciudades.existeElemento(c);

		// En caso que no exista la ciudad “Ciudad”.
		if (!existeC) {
			return TipoRet.ERROR_2;
		}

		// En caso que no exista un hotel “Hotel” registrado dentro de la ciudad
		// “Ciudad”
		Hotel h = new Hotel(hotel, ciudad);
		boolean existeH = this.hoteles.existeElemento(h);

		if (!existeH) {
			return TipoRet.ERROR_1;
		}

		// Ciudad recuperarC = (Ciudad) this.ciudades.recuperar(c);
		// Hotel recuperarH = (Hotel) recuperarC.getHoteles().recuperar(h);
		Hotel recuperarH = (Hotel) this.hoteles.obtenerElemento(h);
		ILista listaComentarios = recuperarH.getComentarios();

		if (listaComentarios.cantidadElementos() == 0)
			System.out.println("No se han agregado comentarios al hotel " + recuperarH.getNombre() + " "
					+ recuperarH.getCiudad() + "." + "\n");
		else {
			int contador = 1;
			for (Integer i = 0; i < listaComentarios.cantidadElementos(); i++) {
				Comentario comentario = (Comentario) listaComentarios.obtenerElementoI(i);
				System.out.println(contador++ + " - " + (String) comentario.toString());
			}
			// for (Object comentario : listaComentarios)
			// System.out.println(contador++ + " - " + (String)
			// comentario.toString());
		}
		return TipoRet.OK;

	}

	@Override
	public TipoRet listarEspera(String ciudad, String hotel) {

		Ciudad c = new Ciudad(ciudad);
		boolean existeC = this.ciudades.existeElemento(c);

		// En caso que no exista la ciudad “Ciudad”.
		if (!existeC) {
			return TipoRet.ERROR_2;
		}

		// En caso que no exista un hotel “Hotel” registrado dentro de la ciudad
		// “Ciudad”
		Hotel h = new Hotel(hotel, ciudad);
		boolean existeH = this.hoteles.existeElemento(h);

		if (!existeH) {
			return TipoRet.ERROR_1;
		}

		Hotel recuperarH = (Hotel) this.hoteles.obtenerElemento(h);
		ICola listaEspera = recuperarH.getEsperas();

		if (listaEspera.cantidadElementos() == 0)
			System.out.println("No existen reservas pendientes para el hotel " + recuperarH.getNombre() + " "
					+ recuperarH.getCiudad() + "." + "\n");
		else {
			int contador = 1;
			System.out.println("Lista de espera para el hotel " + recuperarH.getNombre() + " " + recuperarH.getCiudad()
					+ ": " + "\n");
			for (Integer i = 0; i < listaEspera.cantidadElementos(); i++) {
				Espera espera = (Espera) listaEspera.obtenerElementoI(i);
				System.out.println(contador++ + " - " + (String) espera.toString());
			}
			// for (Object espera : listaEspera)
			// System.out.println(contador++ + " - " + (String)
			// espera.toString());
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
