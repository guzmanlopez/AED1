package sistema.de.reservas;

public class main {
	public static void main(String[] args) {
		Sistema s = new Sistema();
		Prueba p = new Prueba();

		// --PRUEBAS OK---------------------------//
		PruebaOK_1(s, p);
		PruebaOK_2(s, p);
		PruebaOK_3(s, p);
		PruebaOK_4(s, p);
		PruebaOK_5(s, p);

		// --PRUEBAS ERROR------------------------//
		PruebaERROR_1(s, p);
		PruebaERROR_2(s, p);
		PruebaERROR_3(s, p);
		PruebaERROR_4(s, p);
		PruebaERROR_5(s, p);
		PruebaERROR_6(s, p);
		PruebaERROR_7(s, p);

		// -----------------------PRUEBA MODIFICACION------------------------//
		// Prueba_Modificacion(s, p);

		p.imprimirResultadosPrueba();
	}

	public static void PruebaOK_1(Sistema s, Prueba p) {
		System.out.println("Se crea el sistema de reservas vacio");
		p.ver(s.crearSistemaReservas(5), Sistema.TipoRet.OK, "Se creo el sistema para 5 ciudades");

		p.tituloPrueba("******** PRUEBA OK 1 - casos base ****");

		p.tituloPrueba("PRUEBA OK 1 - AGREGAR CIUDADES AL MAPA:");
		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agrego Montevideo al mapa");
		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agrego Colonia al mapa");
		p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agrego Salto al mapa");
		p.ver(s.registrarCiudad("Rivera"), Sistema.TipoRet.OK, "Se agrego Rivera al mapa");

		p.tituloPrueba("AGREGAR CIUDADES - CASOS DE ERROR:");
		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.ERROR_1, "Se intento agregar Montevideo que ya existe");
		p.tituloPrueba("AGREGAMOS CIUDAD PARA COMPLETAR MAPA ");
		p.ver(s.registrarCiudad("Rocha"), Sistema.TipoRet.OK, "Se agrego Rocha QUE COMPLETA EL LIMITE");
		p.ver(s.registrarCiudad("Soriano"), Sistema.TipoRet.ERROR_1,
				"Intenta agregar ciudad sobrepasando limite establecido");

		p.tituloPrueba("PRUEBA OK 1 - REGISTRAR HOTEL");
		p.ver(s.registrarHotel("Montevideo", "NH Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agrego el hotel Montevideo-NH Columbia");
		p.ver(s.registrarHotel("Montevideo", "Holiday Inn", 4, 90), Sistema.TipoRet.OK,
				"Se agrego el hotel Montevideo-Holiday Inn");
		p.ver(s.registrarHotel("Montevideo", "Ibis", 3, 60), Sistema.TipoRet.OK, "Se agrego el hotel Montevideo-Ibis");
		p.ver(s.registrarHotel("Montevideo", "Cottage", 4, 90), Sistema.TipoRet.OK,
				"Se agrego el hotel Montevideo-Radison Victoria Plaza");
		p.ver(s.registrarHotel("Montevideo", "Sheraton", 5, 540), Sistema.TipoRet.OK,
				"Se agrego el hotel Montevideo-Sheraton");
		p.ver(s.registrarHotel("Montevideo", "Victoria Plaza", 5, 320), Sistema.TipoRet.OK,
				"Se agrego el hotel Montevideo-Radison Victoria Plaza");
		p.tituloPrueba("2.11 LISTADO DE HOTELES POR CIUDAD ");
		p.ver(s.listarHotelesCiudad("Montevideo"), Sistema.TipoRet.OK, "HOTELES - MONTEVIDEO");

		p.tituloPrueba("ERRORES AL AGREGAR HOTELES :");

		p.ver(s.registrarHotel("Montevideo", "Victoria Plaza", 5, 320), Sistema.TipoRet.ERROR_3,
				"Se intenta agregar, el hotel Montevideo-Radison Victoria Plaza que ya existe");
		p.ver(s.registrarHotel("Montevideo", "Hilton", 6, 320), Sistema.TipoRet.ERROR_1,
				"Se intenta agregar el hotel Montevideo-Hilton con cant estrellas incorrcto");
		p.ver(s.registrarHotel("Montevideo", "Hotel X", 5, -25), Sistema.TipoRet.ERROR_2,
				"Se intenta agregar el hotel Montevideo-Hotel x, capacidad incorrecta");
		p.ver(s.registrarHotel("Soriano", "Hotel Y", 5, 320), Sistema.TipoRet.ERROR_4,
				"Se intenta agregar el Hotel y en una ciudad que no existe");

		p.tituloPrueba("2.11 LISTADO DE HOTELES POR CIUDAD");
		p.ver(s.listarHotelesCiudad("Montevideo"), Sistema.TipoRet.OK,
				"HOTELES - MONTEVIDEO DESPUES DE INTENTAR AGREGAR HOTELES CON ERROR");

		p.ver(s.listarHotelesCiudad("Artigas"), Sistema.TipoRet.OK, "Listado de hoteles en Artigas");
		s.destruirSistemaReservas();
	}

	public static void PruebaOK_2(Sistema s, Prueba p) {
		s.crearSistemaReservas(5);
		System.out.println("Se crea el sistema de reservas vacio");
		p.tituloPrueba("PRUEBA OK 2");
		p.tituloPrueba("2.3 REGISTRAR HOTEL");
		p.ver(s.registrarHotel("Montevideo", "Victoria Plaza", 5, 320), Sistema.TipoRet.OK,
				"Se agrego el hotel Montevideo-Radison Victoria Plaza");
		p.ver(s.registrarHotel("Colonia", "Sheraton", 5, 540), Sistema.TipoRet.OK,
				"Se agrego el hotel Colonia-Sheraton");
		p.ver(s.registrarHotel("Maldonado", "Mantra", 5, 120), Sistema.TipoRet.OK,
				"Se agrego el hotel Maldonado-Mantra");
		p.ver(s.registrarHotel("Maldonado", "Conrad", 5, 320), Sistema.TipoRet.OK,
				"Se agrego el hotel Maldonado-Conrad");
		p.ver(s.registrarHotel("Colonia", "Barcelo", 5, 90), Sistema.TipoRet.OK, "Se agrego el hotel Colonia-Barcelo");
		p.ver(s.registrarHotel("Montevideo", "NH Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agrego el hotel Montevideo-NH Columbia");
		p.ver(s.registrarHotel("Montevideo", "Ibis", 3, 60), Sistema.TipoRet.OK, "Se agrego el hotel Montevideo-Ibis");
		p.ver(s.registrarHotel("Salto", "Horacio Quiroga", 5, 70), Sistema.TipoRet.OK,
				"Se agrego el hotel Salto-Horacio Quiroga");

		p.tituloPrueba("2.10 LISTADO DE HOTELES POR CIUDAD");
		p.ver(s.listarHotelesCiudad("Montevideo"), Sistema.TipoRet.OK, "");
		p.ver(s.listarHotelesCiudad("Colonia"), Sistema.TipoRet.OK, "");
		p.ver(s.listarHotelesCiudad("Maldonado"), Sistema.TipoRet.OK, "");

		p.tituloPrueba("2.4 INGRESAR SERVICIO");
		p.ver(s.ingresarServicio("Montevideo", "Ibis", "wifi"), Sistema.TipoRet.OK,
				"Se ingreso servicio wifi en Montevideo-Ibis");
		p.ver(s.ingresarServicio("Montevideo", "Ibis", "valet parking"), Sistema.TipoRet.OK,
				"Se ingreso servicio valet parking en Montevideo-Ibis");
		p.ver(s.ingresarServicio("Montevideo", "Ibis", "tintoreria"), Sistema.TipoRet.OK,
				"Se ingreso servicio tintoreria en Montevideo-Ibis");
		p.ver(s.ingresarServicio("Montevideo", "Ibis", "piscina"), Sistema.TipoRet.OK,
				"Se ingreso servicio piscina en Montevideo-Ibis");

		p.tituloPrueba("2.9 LISTAR SERVICIOS");
		p.ver(s.listarServicios("Montevideo", "Ibis"), Sistema.TipoRet.OK,
				"Se imprimio Lista de Servicios de Montevideo-Ibis");

		p.tituloPrueba("2.5 BORRAR SERVICIOS");
		p.ver(s.borrarServicio("Montevideo", "Ibis", "valet parking"), Sistema.TipoRet.OK,
				"Se borro servicio valet parking de Montevideo-Ibis");
		p.ver(s.borrarServicio("Montevideo", "Ibis", "piscina"), Sistema.TipoRet.OK,
				"Se borro servicio piscina de Montevideo-Ibis");
		p.ver(s.borrarServicio("Montevideo", "Ibis", "wifi"), Sistema.TipoRet.OK,
				"Se borro servicio wifi de Montevideo-Ibis");

		p.ver(s.listarServicios("Montevideo", "Ibis"), Sistema.TipoRet.OK,
				"Se imprimio Lista de Servicios de Montevideo-Ibis");
		s.destruirSistemaReservas();
	}

	public static void PruebaOK_3(Sistema s, Prueba p) {
		System.out.println("Se crea el sistema de reservas vacio");
		p.ver(s.crearSistemaReservas(5), Sistema.TipoRet.OK, "Se creo el sistema para 5 ciudades");

		p.tituloPrueba("******** PRUEBA 3 *******");

		p.tituloPrueba("PRUEBA OK 1 - AGREGAR CIUDADES AL MAPA:");
		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agrego Montevideo al mapa");
		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agrego Colonia al mapa");
		p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agrego Salto al mapa");
		p.ver(s.registrarCiudad("Rivera"), Sistema.TipoRet.OK, "Se agrego Rivera al mapa");

		p.tituloPrueba("PRUEBA 3 - REGISTRAR MONTEVIDEO");
		p.ver(s.registrarHotel("Montevideo", "NH Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agrego el hotel Montevideo-NH Columbia");
		p.ver(s.registrarHotel("Montevideo", "Holiday Inn", 4, 90), Sistema.TipoRet.OK,
				"Se agrego el hotel Montevideo-Holiday Inn");
		p.ver(s.registrarHotel("Montevideo", "Ibis", 3, 10), Sistema.TipoRet.OK, "Se agrego el hotel Montevideo-Ibis");
		p.ver(s.registrarHotel("Montevideo", "Cottage", 4, 90), Sistema.TipoRet.OK,
				"Se agrego el hotel Montevideo-Radison Victoria Plaza");
		p.ver(s.registrarHotel("Montevideo", "Sheraton", 5, 540), Sistema.TipoRet.OK,
				"Se agrego el hotel Montevideo-Sheraton");
		p.ver(s.registrarHotel("Montevideo", "Victoria Plaza", 5, 320), Sistema.TipoRet.OK,
				"Se agrego el hotel Montevideo-Radison Victoria Plaza");

		p.tituloPrueba("2.11 LISTADO DE HOTELES MONTEVIDEO ");
		p.ver(s.listarHotelesCiudad("Montevideo"), Sistema.TipoRet.OK, "HOTELES - MONTEVIDEO");

		p.tituloPrueba("2.4 INGRESAR SERVICIO HOTELES MONTEVIDEO");
		p.ver(s.ingresarServicio("Montevideo", "Ibis", "wifi"), Sistema.TipoRet.OK,
				"Se ingreso servicio wifi en Montevideo-Ibis");
		p.ver(s.ingresarServicio("Montevideo", "Ibis", "valet parking"), Sistema.TipoRet.OK,
				"Se ingreso servicio valet parking en Montevideo-Ibis");
		p.ver(s.ingresarServicio("Montevideo", "Ibis", "tintoreria"), Sistema.TipoRet.OK,
				"Se ingreso servicio tintoreria en Montevideo-Ibis");
		p.ver(s.ingresarServicio("Montevideo", "Ibis", "piscina"), Sistema.TipoRet.OK,
				"Se ingreso servicio piscina en Montevideo-Ibis");

		p.tituloPrueba("2.10 LISTAR SERVICIOS");
		p.ver(s.listarServicios("Montevideo", "Ibis"), Sistema.TipoRet.OK,
				"Se imprimio Lista de Servicios de Montevideo-Ibis");

		p.tituloPrueba("2.8 Realizar Reserva - 15 Reservas - Debe quedar en Lista de Espera 5");
		for (int i = 1; i <= 15; i++) {
			p.ver(s.realizarReserva(i, "Montevideo", "Ibis"), Sistema.TipoRet.OK,
					"reserva cliente " + i + " hotel Ibis");
		}

		p.tituloPrueba("2.14 Lista de Espera - Debe Listar 5 Clientes - del 11 al 15");
		p.ver(s.listarEspera("Montevideo", "Ibis"), Sistema.TipoRet.OK,
				"Se imprimio Lista de Espera de Montevideo-Ibis");

		p.tituloPrueba("2.9 Cancelar Reserva - Se cancelan 3 reservas");
		for (int i = 1; i <= 3; i++) {
			p.ver(s.cancelarReserva(i, "Montevideo", "Ibis"), Sistema.TipoRet.OK,
					"Se canceló reserva para el cliente " + i);
		}

		p.tituloPrueba("2.14 Lista de Espera - Debe Listar 2 Clientes en Lista de Espera");
		p.ver(s.listarEspera("Montevideo", "Ibis"), Sistema.TipoRet.OK,
				"Se imprimio Lista de Espera de Montevideo-Ibis");
		s.destruirSistemaReservas();
	}

	public static void PruebaOK_4(Sistema s, Prueba p) {
		System.out.println("Se crea el sistema de reservas vacio - sin tope de ciudades");
		p.ver(s.crearSistemaReservas(0), Sistema.TipoRet.OK, "Se creo el sistema para 5 ciudades");

		p.tituloPrueba("******** PRUEBA 4 *******");

		p.tituloPrueba("PRUEBA OK 1 - AGREGAR CIUDADES AL MAPA - Se ingresan 104 ciudades");

		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agrego Colonia al mapa");
		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agrego Montevideo al mapa");
		p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agrego Salto al mapa");
		p.ver(s.registrarCiudad("Rivera"), Sistema.TipoRet.OK, "Se agrego Rivera al mapa");
		for (int i = 1; i <= 100; i++) {
			p.ver(s.registrarCiudad("Ciudad" + i), Sistema.TipoRet.OK, "Se registro la ciudad" + i);
		}

		p.tituloPrueba("PRUEBA 3 - REGISTRAR MONTEVIDEO");
		p.ver(s.registrarHotel("Montevideo", "NH Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agrego el hotel Montevideo-NH Columbia");
		p.ver(s.registrarHotel("Montevideo", "Holiday Inn", 4, 90), Sistema.TipoRet.OK,
				"Se agrego el hotel Montevideo-Holiday Inn");
		p.ver(s.registrarHotel("Montevideo", "Ibis", 3, 10), Sistema.TipoRet.OK, "Se agrego el hotel Montevideo-Ibis");
		p.ver(s.registrarHotel("Montevideo", "Cottage", 4, 90), Sistema.TipoRet.OK,
				"Se agrego el hotel Montevideo-Radison Victoria Plaza");
		p.ver(s.registrarHotel("Montevideo", "Sheraton", 5, 540), Sistema.TipoRet.OK,
				"Se agrego el hotel Montevideo-Sheraton");
		p.ver(s.registrarHotel("Ciudad10", "Victoria Plaza", 5, 320), Sistema.TipoRet.OK,
				"Se agrego el hotel Ciudad10-Radison Victoria Plaza");

		p.tituloPrueba("2.11 LISTADO DE HOTELES MONTEVIDEO ");
		p.ver(s.listarHotelesCiudad("Ciudad10"), Sistema.TipoRet.OK, "HOTELES - Ciudad10");

		s.destruirSistemaReservas();
	}

	public static void PruebaOK_5(Sistema s, Prueba p) {
		System.out.println("Se crea el sistema de reservas vacio");
		p.ver(s.crearSistemaReservas(5), Sistema.TipoRet.OK, "Se creo el sistema para 5 ciudades");

		p.tituloPrueba("******** PRUEBA 5 *******");

		p.tituloPrueba("PRUEBA OK 1 - AGREGAR CIUDADES AL MAPA:");
		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agrego Montevideo al mapa");
		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agrego Colonia al mapa");
		p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agrego Salto al mapa");
		p.ver(s.registrarCiudad("Rivera"), Sistema.TipoRet.OK, "Se agrego Rivera al mapa");

		p.tituloPrueba("PRUEBA 3 - REGISTRAR MONTEVIDEO");
		p.ver(s.registrarHotel("Montevideo", "NH Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agrego el hotel Montevideo-NH Columbia");
		p.ver(s.registrarHotel("Montevideo", "Holiday Inn", 4, 90), Sistema.TipoRet.OK,
				"Se agrego el hotel Montevideo-Holiday Inn");
		p.ver(s.registrarHotel("Montevideo", "Ibis", 3, 10), Sistema.TipoRet.OK, "Se agrego el hotel Montevideo-Ibis");
		p.ver(s.registrarHotel("Montevideo", "Cottage", 4, 90), Sistema.TipoRet.OK,
				"Se agrego el hotel Montevideo-Radison Victoria Plaza");
		p.ver(s.registrarHotel("Montevideo", "Sheraton", 5, 540), Sistema.TipoRet.OK,
				"Se agrego el hotel Montevideo-Sheraton");
		p.ver(s.registrarHotel("Montevideo", "Victoria Plaza", 5, 320), Sistema.TipoRet.OK,
				"Se agrego el hotel Montevideo-Radison Victoria Plaza");

		p.tituloPrueba("2.11 LISTADO DE HOTELES MONTEVIDEO ");
		p.ver(s.listarHotelesCiudad("Montevideo"), Sistema.TipoRet.OK, "HOTELES - MONTEVIDEO");

		p.tituloPrueba("2.4 INGRESAR SERVICIO HOTELES MONTEVIDEO");
		p.ver(s.ingresarServicio("Montevideo", "Ibis", "wifi"), Sistema.TipoRet.OK,
				"Se ingreso servicio wifi en Montevideo-Ibis");
		p.ver(s.ingresarServicio("Montevideo", "Ibis", "valet parking"), Sistema.TipoRet.OK,
				"Se ingreso servicio valet parking en Montevideo-Ibis");
		p.ver(s.ingresarServicio("Montevideo", "Ibis", "tintoreria"), Sistema.TipoRet.OK,
				"Se ingreso servicio tintoreria en Montevideo-Ibis");
		p.ver(s.ingresarServicio("Montevideo", "Ibis", "piscina"), Sistema.TipoRet.OK,
				"Se ingreso servicio piscina en Montevideo-Ibis");

		p.tituloPrueba("2.10 LISTAR SERVICIOS");
		p.ver(s.listarServicios("Montevideo", "Ibis"), Sistema.TipoRet.OK,
				"Se imprimio Lista de Servicios de Montevideo-Ibis");

		p.tituloPrueba("2.7 Ingresar comentario - 15 comentarios para Ibis y 10 para Cottage");
		for (int i = 1; i <= 15; i++) {
			int ranking = 3;
			p.ver(s.ingresarComentario("Montevideo", "Ibis", "Comentario " + i, ranking), Sistema.TipoRet.OK,
					"Ingresa comentario " + i + " a hotel Ibis con valoración" + ranking);
		}
		for (int i = 1; i <= 10; i++) {
			int ranking = 5;
			p.ver(s.ingresarComentario("Montevideo", "Cottage", "Comentario " + i, ranking), Sistema.TipoRet.OK,
					"Ingresa comentario " + i + " a hotel Ibis con valoración" + ranking);
		}

		p.tituloPrueba("2.13 Listado de Comentarios - Debe Imprimir 15 comentarios para Ibis y 10 para Cottage");
		p.ver(s.listarComentarios("Montevideo", "Ibis"), Sistema.TipoRet.OK,
				"Se imprimio Lista de comentarios de Montevideo-Ibis");
		p.ver(s.listarComentarios("Montevideo", "Cottage"), Sistema.TipoRet.OK,
				"Se imprimio Lista de comentarios de Montevideo-Cottage");

		p.tituloPrueba(
				"2.12 Listado de Hoteles Por Ranking - Debe imprimir primero Cottage con ranking 5 y luego Ibis con ranking 3");
		p.ver(s.listarHotelesRanking(), Sistema.TipoRet.OK, "Se imprimio el listado de hoteles por ranking");
		s.destruirSistemaReservas();
	}

	public static void PruebaERROR_1(Sistema s, Prueba p) {

		System.out.println("Error Ciudad - Se verifica que la cantidad de ciudades agregadas sea validadad");
		System.out.println("Se crea el sistema de reservas vacio");
		p.ver(s.crearSistemaReservas(5), Sistema.TipoRet.OK, "Se creo el sistema para 5 ciudades");

		p.tituloPrueba("******** PruebaError_1 *******");

		p.tituloPrueba("PRUEBA 1 - AGREGAR CIUDADES AL MAPA:");
		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agrego Montevideo al mapa");
		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agrego Colonia al mapa");
		p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agrego Salto al mapa");
		p.ver(s.registrarCiudad("Rivera"), Sistema.TipoRet.OK, "Se agrego Rivera al mapa");
		p.ver(s.registrarCiudad("Buenos Aires"), Sistema.TipoRet.OK, "Se agrego Rivera al mapa");

		p.tituloPrueba(
				"PRUEBA 2 - REGISTRAR una ciudad más de la que tiene el sistema como tope - Se ingresaron 5 y el tope es 5");
		p.ver(s.registrarCiudad("Montana"), Sistema.TipoRet.ERROR_2, "No se permite ingresar más ciudades al sistema");
		s.destruirSistemaReservas();
	}

	public static void PruebaERROR_2(Sistema s, Prueba p) {

		System.out.println("Error Ciudad - Se verifica el caso que la ciudad “Ciudad” ya existe en el sistema.");
		System.out.println("Se crea el sistema de reservas vacio");
		p.ver(s.crearSistemaReservas(5), Sistema.TipoRet.OK, "Se creo el sistema para 5 ciudades");

		p.tituloPrueba("******** PruebaError_2  *******");

		p.tituloPrueba("PRUEBA 1 - AGREGAR CIUDADES AL MAPA Repetidas");
		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agrego Montevideo al mapa");
		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.ERROR_1, "Ya existe Montevideo en el sistema");
		s.destruirSistemaReservas();
	}

	public static void PruebaERROR_3(Sistema s, Prueba p) {

		System.out.println("Error Hotel - En caso que “Estrellas” mayor a 5.");
		System.out.println("Se crea el sistema de reservas vacio");
		p.ver(s.crearSistemaReservas(5), Sistema.TipoRet.OK, "Se creo el sistema para 5 ciudades");

		p.tituloPrueba("******** PruebaError_3  *******");

		p.tituloPrueba("PRUEBA 1 - AGREGAR CIUDADES AL MAPA Repetidas");
		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agrego Montevideo al mapa");

		p.tituloPrueba("PRUEBA ERROR 2 - REGISTRAR Hotel con 6 estrellas");
		p.ver(s.registrarHotel("Montevideo", "NH Columbia", 6, 110), Sistema.TipoRet.ERROR_1,
				"No se puede agregar un hotel con más de 5 estrellas");
		s.destruirSistemaReservas();
	}

	public static void PruebaERROR_4(Sistema s, Prueba p) {

		System.out.println("Error Hotel - En caso que “Estrellas” sea menor a 1");
		System.out.println("Se crea el sistema de reservas vacio");
		p.ver(s.crearSistemaReservas(5), Sistema.TipoRet.OK, "Se creo el sistema para 5 ciudades");

		p.tituloPrueba("******** PruebaError_4  *******");

		p.tituloPrueba("PRUEBA 1 - AGREGAR CIUDADES AL MAPA Repetidas");
		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agrego Montevideo al mapa");

		p.tituloPrueba("PRUEBA ERROR 2 - REGISTRAR Hotel con estrella 0");
		p.ver(s.registrarHotel("Montevideo", "NH Columbia", 0, 110), Sistema.TipoRet.ERROR_1,
				"No se puede agregar un hotel con 0 estrellas");
		s.destruirSistemaReservas();
	}

	public static void PruebaERROR_5(Sistema s, Prueba p) {

		System.out.println("Error Hotel - En caso que “Capacidad” sea menor a 0.");
		System.out.println("Se crea el sistema de reservas vacio");
		p.ver(s.crearSistemaReservas(5), Sistema.TipoRet.OK, "Se creo el sistema para 5 ciudades");

		p.tituloPrueba("******** PruebaError_5  *******");

		p.tituloPrueba("PRUEBA 1 - AGREGAR CIUDADES AL MAPA Repetidas");
		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agrego Montevideo al mapa");

		p.tituloPrueba("PRUEBA ERROR 2 - REGISTRAR Hotel con estrella 0");
		p.ver(s.registrarHotel("Montevideo", "NH Columbia", 5, -1), Sistema.TipoRet.ERROR_2,
				"No se puede agregar un hotel con capacidad negativa");
		s.destruirSistemaReservas();
	}

	public static void PruebaERROR_6(Sistema s, Prueba p) {

		System.out.println(
				"Error Hotel - En caso que ya exista un hotel de nombre “Nombre” dentro de la ciudad “Ciudad”.");
		System.out.println("Se crea el sistema de reservas vacio");
		p.ver(s.crearSistemaReservas(5), Sistema.TipoRet.OK, "Se creo el sistema para 5 ciudades");

		p.tituloPrueba("******** PruebaError_6  *******");

		p.tituloPrueba("PRUEBA 1 - AGREGAR CIUDADES AL MAPA Repetidas");
		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agrego Montevideo al mapa");
		p.ver(s.registrarCiudad("Canelones"), Sistema.TipoRet.OK, "Se agrego Montevideo al mapa");

		p.tituloPrueba("PRUEBA ERROR 3 - REGISTRAR Hotel con el mismo nombre en la misma ciudad");
		p.ver(s.registrarHotel("Montevideo", "NH Columbia", 5, 100), Sistema.TipoRet.OK,
				"Se agrego el hotel Montevideo-NH Columbia");
		p.ver(s.registrarHotel("Canelones", "NH Columbia", 5, 100), Sistema.TipoRet.OK,
				"Se agrego el hotel Canelones-NH Columbia");
		p.ver(s.registrarHotel("Montevideo", "NH Columbia", 5, 100), Sistema.TipoRet.ERROR_3,
				"No se puede agregar un hotel repetido para una misma ciudad");
		s.destruirSistemaReservas();
	}

	public static void PruebaERROR_7(Sistema s, Prueba p) {

		System.out.println("Error Hotel - En caso que no exista la ciudad “Ciudad”");
		System.out.println("Se crea el sistema de reservas vacio");
		p.ver(s.crearSistemaReservas(5), Sistema.TipoRet.OK, "Se creo el sistema para 5 ciudades");

		p.tituloPrueba("******** PruebaError_7  *******");

		p.tituloPrueba("PRUEBA 1 - AGREGAR CIUDADES AL MAPA Repetidas");
		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agrego Montevideo al mapa");

		p.tituloPrueba("PRUEBA ERROR 4 - REGISTRAR Hotel con el mismo nombre en la misma ciudad");
		p.ver(s.registrarHotel("Buenos Airtes", "NH Columbia", 5, 100), Sistema.TipoRet.ERROR_4,
				"No se puede agregar un hotel en una ciudad que no existe");
		s.destruirSistemaReservas();

	}

}