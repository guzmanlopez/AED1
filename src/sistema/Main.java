package sistema;

public class Main {

	public static void main(String[] args) {

		// Instanciar clases
		Sistema s = new Sistema();
		Prueba p = new Prueba();

		// ---------------------- PRUEBAS OK --------------------------//

		PruebaOK_CrearSistemaReservas(s, p);
		PruebaOK_DestruirSistemaReservas(s, p);
		PruebaOK_RegistrarCiudad(s, p);
		PruebaOK_RegistrarHotel(s, p);
		PruebaOK_IngresarServicio(s, p);
		PruebaOK_BorrarServicio(s, p);
		PruebaOK_IngresarComentario(s, p);
		PruebaOK_RealizarReserva(s, p);
		PruebaOK_CancelarReserva(s, p);
		PruebaOK_ListarServicios(s, p);
		PruebaOK_ListarHotelesCiudad(s, p);
		PruebaOK_ListarComentarios(s, p);
		PruebaOK_ListarEspera(s, p);

		// ---------------------- PRUEBAS ERROR ----------------------- //

		PruebaERROR_RegistrarCiudad(s, p);
		PruebaERROR_RegistrarHotel(s, p);
		PruebaERROR_IngresarServicio(s, p);
		PruebaERROR_BorrarServicio(s, p);
		PruebaERROR_IngresarComentario(s, p);
		PruebaERROR_RealizarReserva(s, p);
		PruebaERROR_CancelarReserva(s, p);
		PruebaERROR_ListarServicios(s, p);
		PruebaERROR_ListarHotelesCiudad(s, p);
		PruebaERROR_ListarComentarios(s, p);
		PruebaERROR_ListarEspera(s, p);

		// ---------------------- PRUEBAS MODIFICACION --------------------- //

		// PruebaMOD_CrearSistemaReservas(s, p);
		// PruebaMOD_DestruirSistemaReservas(s, p);
		// PruebaMOD_RegistrarCiudad(s, p);
		// PruebaMOD_RegistrarHotel(s, p);
		// PruebaMOD_IngresarServicio(s, p);

		// ------------------- IMPRIMIR RESULTADO PRUEBAS ------------------ //
		p.imprimirResultadosPrueba();
	}

	// ********** PRUEBAS OK ********** //

	// Prueba OK para crear Sistema de reservas
	public static void PruebaOK_CrearSistemaReservas(Sistema s, Prueba p) {

		p.tituloPrueba("PruebaOK_CrearSistemaReservas - Crear Sistema de Reservas");

		p.ver(s.crearSistemaReservas(20), Sistema.TipoRet.OK,
				"Se creó un sistema de reservas con límite de 20 ciudades");

	}

	// Prueba OK para destruir Sistema de reservas
	public static void PruebaOK_DestruirSistemaReservas(Sistema s, Prueba p) {

		p.tituloPrueba("PruebaOK_DestruirSistemaReservas - Destruir Sistema de Reservas");

		p.ver(s.crearSistemaReservas(20), Sistema.TipoRet.OK,
				"Se creó un sistema de reservas con límite de 20 ciudades");
		p.ver(s.destruirSistemaReservas(), Sistema.TipoRet.OK, "Se destruyó el sistema de reservas creado");

	}

	// Prueba OK para Registrar Ciudad
	public static void PruebaOK_RegistrarCiudad(Sistema s, Prueba p) {

		p.tituloPrueba("PruebaOK_RegistrarCiudad - Registrar Ciudad");

		p.ver(s.crearSistemaReservas(20), Sistema.TipoRet.OK,
				"Se creó un sistema de reservas con límite de 20 ciudades");

		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agregó 'Montevideo' al mapa");
		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agregó 'Colonia' al mapa");
		p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agregó 'Salto' al mapa");

	}

	// Prueba OK para Registrar Hotel
	public static void PruebaOK_RegistrarHotel(Sistema s, Prueba p) {

		p.tituloPrueba("PruebaOK_RegistrarHotel - Registrar Hotel");

		p.ver(s.crearSistemaReservas(20), Sistema.TipoRet.OK,
				"Se creó un sistema de reservas con límite de '20' ciudades");

		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agregó 'Montevideo' al mapa");
		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agregó 'Colonia' al mapa");
		p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agregó 'Salto' al mapa");

		p.ver(s.registrarHotel("Montevideo", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Montevideo", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Colonia", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Colonia'");
		p.ver(s.registrarHotel("Salto", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Salto'");
	}

	// Prueba OK para Ingresar servicio
	public static void PruebaOK_IngresarServicio(Sistema s, Prueba p) {

		p.tituloPrueba("PruebaOK_IngresarServicio - Ingresar Servicio");

		p.ver(s.crearSistemaReservas(20), Sistema.TipoRet.OK,
				"Se creó un sistema de reservas con límite de '20' ciudades");

		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agregó 'Montevideo' al mapa");
		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agregó 'Colonia' al mapa");
		p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agregó 'Salto' al mapa");

		p.ver(s.registrarHotel("Montevideo", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Montevideo", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Colonia", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Colonia'");
		p.ver(s.registrarHotel("Salto", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Salto'");

		p.ver(s.ingresarServicio("Montevideo", "NH-Columbia", "Lavado de ropa"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Lavado de ropa' al hotel 'NH-Columbia' de la ciudad 'Montevideo'");
		p.ver(s.ingresarServicio("Salto", "NH-Columbia", "Desayuno"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Desayuno' al hotel 'NH-Columbia' de la ciudad 'Salto'");
		p.ver(s.ingresarServicio("Montevideo", "Radisson", "Desayuno"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Merienda' al hotel 'Radisson' de la ciudad 'Montevideo'");
		p.ver(s.ingresarServicio("Montevideo", "Radisson", "Cena"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Cena' al hotel 'Radisson' de la ciudad 'Montevideo'");
	}

	// Prueba OK para Borrar servicio
	public static void PruebaOK_BorrarServicio(Sistema s, Prueba p) {

		p.tituloPrueba("PruebaOK_BorrarServicio - Borrar Servicio");

		p.ver(s.crearSistemaReservas(20), Sistema.TipoRet.OK,
				"Se creó un sistema de reservas con límite de '20' ciudades");

		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agregó 'Montevideo' al mapa");
		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agregó 'Colonia' al mapa");
		p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agregó 'Salto' al mapa");

		p.ver(s.registrarHotel("Montevideo", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Montevideo", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Colonia", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Colonia'");
		p.ver(s.registrarHotel("Salto", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Salto'");

		p.ver(s.ingresarServicio("Montevideo", "NH-Columbia", "Lavado de ropa"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Lavado de ropa' al hotel 'NH-Columbia' de la ciudad 'Montevideo'");
		p.ver(s.ingresarServicio("Salto", "NH-Columbia", "Desayuno"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Desayuno' al hotel 'NH-Columbia' de la ciudad 'Salto'");
		p.ver(s.ingresarServicio("Montevideo", "Radisson", "Desayuno"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Merienda' al hotel 'Radisson' de la ciudad 'Montevideo'");
		p.ver(s.ingresarServicio("Montevideo", "Radisson", "Cena"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Cena' al hotel 'Radisson' de la ciudad 'Montevideo'");

		p.ver(s.borrarServicio("Montevideo", "NH-Columbia", "Lavado de ropa"), Sistema.TipoRet.OK,
				"Se borró el servicio 'Lavado de ropa' del hotel 'NH-Columbia' en 'Montevideo'");
		p.ver(s.borrarServicio("Salto", "NH-Columbia", "Desayuno"), Sistema.TipoRet.OK,
				"Se borró el servicio 'Desayuno' del hotel 'NH-Columbia' en 'Salto'");
		p.ver(s.borrarServicio("Montevideo", "Radisson", "Cena"), Sistema.TipoRet.OK,
				"Se borró el servicio 'Cena' del hotel 'Radisson' en 'Montevideo'");
	}

	// Prueba OK para Ingresar Comentario
	public static void PruebaOK_IngresarComentario(Sistema s, Prueba p) {

		p.tituloPrueba("PruebaOK_IngresarComentario - Ingresar Comentario");

		p.ver(s.crearSistemaReservas(20), Sistema.TipoRet.OK,
				"Se creó un sistema de reservas con límite de '20' ciudades");

		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agregó 'Montevideo' al mapa");
		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agregó 'Colonia' al mapa");
		p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agregó 'Salto' al mapa");

		p.ver(s.registrarHotel("Montevideo", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Montevideo", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Colonia", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Colonia'");
		p.ver(s.registrarHotel("Salto", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Salto'");

		p.ver(s.ingresarComentario("Montevideo", "NH-Columbia", "Excelente servicio y atención", 4), Sistema.TipoRet.OK,
				"Se agregó el comentario 'Excelente servicio y atención' al hotel 'NH-Columbia' de la ciudad 'Montevideo'");
		
		p.ver(s.ingresarComentario("Montevideo", "Radisson", "Desayunos muy ricos!", 5), Sistema.TipoRet.OK,
				"Se agregó el comentario 'Desayunos muy ricos!' al hotel 'Radisson' de la ciudad 'Montevideo'");
		p.ver(s.ingresarComentario("Montevideo", "Radisson", "Desayunos muy ricos!", 5), Sistema.TipoRet.OK,
				"Se agregó el comentario 'Desayunos muy ricos!' al hotel 'Radisson' de la ciudad 'Montevideo'");
		p.ver(s.ingresarComentario("Montevideo", "Radisson", "Desayunos muy ricos!", 5), Sistema.TipoRet.OK,
				"Se agregó el comentario 'Desayunos muy ricos!' al hotel 'Radisson' de la ciudad 'Montevideo'");
		p.ver(s.ingresarComentario("Montevideo", "Radisson", "Cena muy temprana y poco abundante", 1),
				Sistema.TipoRet.OK,
				"Se agregó el comentario 'Cena muy temprana y poco abundante' al hotel 'Radisson' de la ciudad 'Montevideo'");
		p.ver(s.ingresarComentario("Montevideo", "Radisson", "Desayunos muy ricos!", 4), Sistema.TipoRet.OK,
				"Se agregó el comentario 'Desayunos muy ricos!' al hotel 'Radisson' de la ciudad 'Montevideo'");
	}

	// Prueba OK para Realizar Reserva
	public static void PruebaOK_RealizarReserva(Sistema s, Prueba p) {

		p.tituloPrueba("PruebaOK_RealizarReserva - Realizar Reserva");

		p.ver(s.crearSistemaReservas(20), Sistema.TipoRet.OK,
				"Se creó un sistema de reservas con límite de '20' ciudades");

		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agregó 'Montevideo' al mapa");
		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agregó 'Colonia' al mapa");
		p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agregó 'Salto' al mapa");

		p.ver(s.registrarHotel("Montevideo", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Montevideo", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Colonia", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Colonia'");
		p.ver(s.registrarHotel("Salto", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Salto'");
		p.ver(s.registrarHotel("Salto", "Quiroga", 5, 2), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Quiroga' a la ciudad 'Salto'");

		p.ver(s.realizarReserva(1, "Salto", "Quiroga"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '1' en el hotel 'Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(2, "Salto", "Quiroga"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '2' en el hotel 'Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(3, "Salto", "Quiroga"), Sistema.TipoRet.OK,
				"Cliente en lista de espera para hotel 'Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(4, "Salto", "Quiroga"), Sistema.TipoRet.OK,
				"Cliente en lista de espera para hotel 'Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(5, "Montevideo", "Radisson"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '5' en el hotel 'Radisson' en la ciudad de 'Montevideo'");
		p.ver(s.realizarReserva(6, "Salto", "NH-Columbia"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '6' en el hotel 'NH-Columbia' en la ciudad de 'Salto'");

	}

	// Prueba OK para Borrar Reserva
	public static void PruebaOK_CancelarReserva(Sistema s, Prueba p) {

		p.tituloPrueba("PruebaOK_CancelarReserva - Cancelar Reserva");

		p.ver(s.crearSistemaReservas(20), Sistema.TipoRet.OK,
				"Se creó un sistema de reservas con límite de '20' ciudades");

		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agregó 'Montevideo' al mapa");
		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agregó 'Colonia' al mapa");
		p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agregó 'Salto' al mapa");

		p.ver(s.registrarHotel("Montevideo", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Montevideo", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Colonia", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Colonia'");
		p.ver(s.registrarHotel("Salto", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Salto'");
		p.ver(s.registrarHotel("Salto", "Quiroga", 5, 2), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Quiroga' a la ciudad 'Salto'");

		p.ver(s.realizarReserva(1, "Salto", "Quiroga"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '1' en el hotel 'Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(2, "Salto", "Quiroga"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '2' en el hotel 'Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(3, "Salto", "Quiroga"), Sistema.TipoRet.OK,
				"Cliente en lista de espera para hotel 'Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(4, "Salto", "Quiroga"), Sistema.TipoRet.OK,
				"Cliente en lista de espera para hotel 'Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(5, "Montevideo", "Radisson"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '5' en el hotel 'Radisson' en la ciudad de 'Montevideo'");
		p.ver(s.realizarReserva(6, "Salto", "NH-Columbia"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '6' en el hotel 'NH-Columbia' en la ciudad de 'Salto'");

		p.ver(s.cancelarReserva(1, "Salto", "Quiroga"), Sistema.TipoRet.OK,
				"Se canceló la reserva para el cliente '1' en el hotel 'Quiroga' en la ciudad de 'Salto'");
		p.ver(s.cancelarReserva(2, "Salto", "Quiroga"), Sistema.TipoRet.OK,
				"Se canceló la reserva para el cliente '2' en el hotel 'Quiroga' en la ciudad de 'Salto'");
		p.ver(s.cancelarReserva(3, "Salto", "Quiroga"), Sistema.TipoRet.OK,
				"Se canceló la reserva para el cliente '3' en el hotel 'Quiroga' en la ciudad de 'Salto'");
		p.ver(s.cancelarReserva(4, "Salto", "Quiroga"), Sistema.TipoRet.OK,
				"Se canceló la reserva para el cliente '4' en el hotel 'Quiroga' en la ciudad de 'Salto'");

	}

	// Prueba OK para Listar Servicios
	public static void PruebaOK_ListarServicios(Sistema s, Prueba p) {

		p.tituloPrueba("PruebaOK_ListarServicios - Listar Servicios");

		p.ver(s.crearSistemaReservas(20), Sistema.TipoRet.OK,
				"Se creó un sistema de reservas con límite de '20' ciudades");

		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agregó 'Montevideo' al mapa");
		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agregó 'Colonia' al mapa");
		p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agregó 'Salto' al mapa");

		p.ver(s.registrarHotel("Montevideo", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Montevideo", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Colonia", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Colonia'");
		p.ver(s.registrarHotel("Salto", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Salto'");

		p.ver(s.ingresarServicio("Montevideo", "NH-Columbia", "Lavado de ropa"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Lavado de ropa' al hotel 'NH-Columbia' de la ciudad 'Montevideo'");
		p.ver(s.ingresarServicio("Salto", "NH-Columbia", "Desayuno"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Desayuno' al hotel 'NH-Columbia' de la ciudad 'Salto'");
		p.ver(s.ingresarServicio("Montevideo", "Radisson", "Desayuno"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Merienda' al hotel 'Radisson' de la ciudad 'Montevideo'");
		p.ver(s.ingresarServicio("Montevideo", "Radisson", "Cena"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Cena' al hotel 'Radisson' de la ciudad 'Montevideo'");
		p.ver(s.ingresarServicio("Montevideo", "Radisson", "Piscina"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Piscina' al hotel 'Radisson' de la ciudad 'Montevideo'");
		p.ver(s.ingresarServicio("Montevideo", "Radisson", "Lavado de ropa"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Lavado de ropa' al hotel 'Radisson' de la ciudad 'Montevideo'");
		p.ver(s.ingresarServicio("Salto", "NH-Columbia", "Casino"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Casino' al hotel 'NH-Columbia' de la ciudad 'Salto'");

		p.ver(s.listarServicios("Montevideo", "Radisson"), Sistema.TipoRet.OK,
				"Listar Servicios del hotel 'Radisson' en 'Montevideo'");
		p.ver(s.borrarServicio("Montevideo", "Radisson", "Cena"), Sistema.TipoRet.OK,
				"Se borró el servicio 'Cena' del hotel 'Radisson' en 'Montevideo'");
		p.ver(s.listarServicios("Montevideo", "Radisson"), Sistema.TipoRet.OK,
				"Listar Servicios del hotel 'Radisson' en 'Montevideo'");

		p.ver(s.listarServicios("Salto", "NH-Columbia"), Sistema.TipoRet.OK,
				"Listar Servicios del hotel 'NH-Columbia' en 'Salto'");
		p.ver(s.listarServicios("Colonia", "Radisson"), Sistema.TipoRet.OK,
				"Listar Servicios del hotel 'Radisson' en 'Colonia'");

	}

	// Prueba OK para Listar Hoteles
	public static void PruebaOK_ListarHotelesCiudad(Sistema s, Prueba p) {

		p.tituloPrueba("PruebaOK_ListarHotelesCiudad - Listar Hoteles en la Ciudad");

		p.ver(s.crearSistemaReservas(20), Sistema.TipoRet.OK,
				"Se creó un sistema de reservas con límite de '20' ciudades");

		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agregó 'Montevideo' al mapa");
		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agregó 'Colonia' al mapa");
		p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agregó 'Salto' al mapa");
		p.ver(s.registrarCiudad("Maldonado"), Sistema.TipoRet.OK, "Se agregó 'Maldonado' al mapa");

		p.ver(s.registrarHotel("Montevideo", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Montevideo", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Montevideo", "Conrad", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Conrad' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Colonia", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Colonia'");
		p.ver(s.registrarHotel("Salto", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Salto'");
		p.ver(s.registrarHotel("Salto", "Quiroga", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Quiroga' a la ciudad 'Salto'");

		p.ver(s.listarHotelesCiudad("Salto"), Sistema.TipoRet.OK, "Listado de los hoteles de 'Salto'");
		p.ver(s.listarHotelesCiudad("Montevideo"), Sistema.TipoRet.OK, "Listado de los hoteles de 'Montevideo'");
		p.ver(s.listarHotelesCiudad("Colonia"), Sistema.TipoRet.OK, "Listado de los hoteles de 'Colonia'");
		p.ver(s.listarHotelesCiudad("Maldonado"), Sistema.TipoRet.OK, "Listado de los hoteles de 'Maldonado'");

	}

	// Prueba OK para Listar Comentarios
	public static void PruebaOK_ListarComentarios(Sistema s, Prueba p) {

		p.tituloPrueba("PruebaOK_ListarComentarios - Listar Comentarios");

		p.ver(s.crearSistemaReservas(20), Sistema.TipoRet.OK,
				"Se creó un sistema de reservas con límite de '20' ciudades");

		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agregó 'Montevideo' al mapa");
		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agregó 'Colonia' al mapa");
		p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agregó 'Salto' al mapa");

		p.ver(s.registrarHotel("Montevideo", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Montevideo", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Colonia", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Colonia'");
		p.ver(s.registrarHotel("Salto", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Salto'");

		p.ver(s.ingresarComentario("Montevideo", "NH-Columbia", "Excelente servicio y atención", 5), Sistema.TipoRet.OK,
				"Se agregó el comentario 'Excelente servicio y atención' al hotel 'NH-Columbia' de la ciudad 'Montevideo'");
		p.ver(s.ingresarComentario("Montevideo", "Radisson", "Desayunos muy ricos!", 5), Sistema.TipoRet.OK,
				"Se agregó el comentario 'Desayunos muy ricos!' al hotel 'Radisson' de la ciudad 'Montevideo'");
		p.ver(s.ingresarComentario("Montevideo", "Radisson", "Cena muy temprana y poco abundante", 3),
				Sistema.TipoRet.OK,
				"Se agregó el comentario 'Cena muy temprana y poco abundante' al hotel 'Radisson' de la ciudad 'Montevideo'");
		p.ver(s.ingresarComentario("Montevideo", "Radisson", "La piscina tiene una temperatura ideal!", 5),
				Sistema.TipoRet.OK,
				"Se agregó el comentario 'La piscina tiene una temperatura ideal!' al hotel 'Radisson' de la ciudad 'Montevideo'");

		p.ver(s.listarComentarios("Salto", "NH-Columbia"), Sistema.TipoRet.OK,
				"Listar comentarios del hotel 'NH-Columbia' en 'Salto'");
		p.ver(s.listarComentarios("Montevideo", "NH-Columbia"), Sistema.TipoRet.OK,
				"Listar comentarios del hotel 'NH-Columbia' en 'Montevideo'");
		p.ver(s.listarComentarios("Montevideo", "Radisson"), Sistema.TipoRet.OK,
				"Listar comentarios del hotel 'Radisson' en 'Montevideo'");
	}

	// Prueba OK para Listar Espera
	public static void PruebaOK_ListarEspera(Sistema s, Prueba p) {

		p.tituloPrueba("PruebaOK_ListarEspera - Listar espera");

		p.ver(s.crearSistemaReservas(20), Sistema.TipoRet.OK,
				"Se creó un sistema de reservas con límite de '20' ciudades");

		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agregó 'Montevideo' al mapa");
		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agregó 'Colonia' al mapa");
		p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agregó 'Salto' al mapa");

		p.ver(s.registrarHotel("Montevideo", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Montevideo", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Colonia", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Colonia'");
		p.ver(s.registrarHotel("Salto", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Salto'");
		p.ver(s.registrarHotel("Salto", "Quiroga", 5, 2), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Quiroga' a la ciudad 'Salto'");

		p.ver(s.realizarReserva(1, "Salto", "Quiroga"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '1' en el hotel 'Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(2, "Salto", "Quiroga"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '2' en el hotel 'Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(3, "Salto", "Quiroga"), Sistema.TipoRet.OK,
				"Cliente en lista de espera para hotel 'Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(4, "Salto", "Quiroga"), Sistema.TipoRet.OK,
				"Cliente en lista de espera para hotel 'Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(5, "Montevideo", "Radisson"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '5' en el hotel 'Radisson' en la ciudad de 'Montevideo'");
		p.ver(s.realizarReserva(6, "Salto", "NH-Columbia"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '6' en el hotel 'NH-Columbia' en la ciudad de 'Salto'");

		p.ver(s.listarEspera("Salto", "Quiroga"), Sistema.TipoRet.OK,
				"Listar espera del hotel 'Quiroga' en la ciudad 'Salto'");
		p.ver(s.listarEspera("Montevideo", "Radisson"), Sistema.TipoRet.OK,
				"Listar espera del hotel 'Radisson' en la ciudad 'Montevideo'");

	}

	// ********** PRUEBAS ERROR ********** //

	// Prueba ERROR Registrar Ciudad existente
	public static void PruebaERROR_RegistrarCiudad(Sistema s, Prueba p) {

		p.tituloPrueba("PruebaERROR_RegistrarCiudad - La ciudad ya existe");

		p.ver(s.crearSistemaReservas(20), Sistema.TipoRet.OK,
				"Se creó un sistema de reservas con límite de 20 ciudades");

		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agregó 'Montevideo' al mapa");
		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agregó 'Colonia' al mapa");
		p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agregó 'Salto' al mapa");

		// 1. En caso que la ciudad “Ciudad” ya existe en el sistema.
		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.ERROR_1, "'Colonia' ya existe en el sistema");
		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.ERROR_1, "'Montevideo' ya existe en el sistema");

	}

	// Prueba ERROR para Registrar Hotel
	public static void PruebaERROR_RegistrarHotel(Sistema s, Prueba p) {

		p.tituloPrueba("PruebaERROR_RegistrarHotel");

		p.ver(s.crearSistemaReservas(20), Sistema.TipoRet.OK,
				"Se creó un sistema de reservas con límite de '20' ciudades");

		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agregó 'Montevideo' al mapa");
		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agregó 'Colonia' al mapa");
		p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agregó 'Salto' al mapa");

		p.ver(s.registrarHotel("Montevideo", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Montevideo", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Colonia", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Colonia'");
		p.ver(s.registrarHotel("Salto", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Salto'");

		// 1. En caso que “Estrellas” sea menor a 1 o mayor a 5.
		p.tituloPrueba("PruebaERROR_RegistrarHotel - Estrellas menor a 1");
		p.ver(s.registrarHotel("Rivera", "Conrad", 0, 110), Sistema.TipoRet.ERROR_1,
				"El hotel no fue ingresado. La cantidad de estrellas no debe ser menor a 1.");
		p.ver(s.registrarHotel("Canelones", "Conrad", 0, 110), Sistema.TipoRet.ERROR_1,
				"El hotel no fue ingresado. La cantidad de estrellas no debe ser menor a 1.");

		p.tituloPrueba("PruebaERROR_RegistrarHotel - Estrellas mayor a 5");
		p.ver(s.registrarHotel("Rocha", "Conrad", 6, 110), Sistema.TipoRet.ERROR_1,
				"El hotel no fue ingresado. La cantidad de estrellas no debe ser mayor a 5.");
		p.ver(s.registrarHotel("Tacuarembó", "Conrad", 6, 110), Sistema.TipoRet.ERROR_1,
				"El hotel no fue ingresado. La cantidad de estrellas no debe ser mayor a 5.");

		// 2. En caso que “Capacidad” sea menor a 0
		p.tituloPrueba("PruebaERROR_RegistrarHotel - Capacidad menor a 0");
		p.ver(s.registrarHotel("Rivera", "Conrad", 3, -1), Sistema.TipoRet.ERROR_2,
				"El hotel no fue ingresado. La capacidad no debe ser menor a 0.");
		p.ver(s.registrarHotel("Canelones", "Conrad", 3, -2), Sistema.TipoRet.ERROR_2,
				"El hotel no fue ingresado. La capacidad no debe ser menor a 0.");

		// 3. En caso que ya exista un hotel de nombre “Nombre” dentro de la
		// ciudad “Ciudad”.
		p.tituloPrueba("PruebaERROR_RegistrarHotel - Ya existe el hotel en la ciudad");
		p.ver(s.registrarHotel("Montevideo", "NH-Columbia", 4, 110), Sistema.TipoRet.ERROR_3,
				"El hotel no fue ingresado. Ya existe el hotel 'NH-Columbia' en la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Montevideo", "Radisson", 4, 110), Sistema.TipoRet.ERROR_3,
				"El hotel no fue ingresado. Ya existe el hotel 'Radisson' en la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Colonia", "Radisson", 4, 110), Sistema.TipoRet.ERROR_3,
				"El hotel no fue ingresado. Ya existe el hotel 'Radisson' en la ciudad 'Colonia'");

		// 4. En caso que no exista la ciudad “Ciudad”
		p.tituloPrueba("PruebaERROR_RegistrarHotel - No existe la ciudad");
		p.ver(s.registrarHotel("Rocha", "NH-Columbia", 4, 110), Sistema.TipoRet.ERROR_4,
				"El hotel no fue ingresado. No existe la ciudad de 'Rocha' en el sistema");
		p.ver(s.registrarHotel("Tacuarembó", "Radisson", 4, 110), Sistema.TipoRet.ERROR_4,
				"El hotel no fue ingresado. No existe la ciudad de 'Tacuarembó' en el sistema");

	}

	// Prueba ERROR para Ingresar servicio
	public static void PruebaERROR_IngresarServicio(Sistema s, Prueba p) {

		p.ver(s.crearSistemaReservas(20), Sistema.TipoRet.OK,
				"Se creó un sistema de reservas con límite de '20' ciudades");

		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agregó 'Montevideo' al mapa");
		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agregó 'Colonia' al mapa");
		p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agregó 'Salto' al mapa");

		p.ver(s.registrarHotel("Montevideo", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Montevideo", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Colonia", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Colonia'");
		p.ver(s.registrarHotel("Salto", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Salto'");

		p.ver(s.ingresarServicio("Montevideo", "NH-Columbia", "Lavado de ropa"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Lavado de ropa' al hotel 'NH-Columbia' de la ciudad 'Montevideo'");
		p.ver(s.ingresarServicio("Salto", "NH-Columbia", "Desayuno"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Desayuno' al hotel 'NH-Columbia' de la ciudad 'Salto'");
		p.ver(s.ingresarServicio("Montevideo", "Radisson", "Desayuno"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Merienda' al hotel 'Radisson' de la ciudad 'Montevideo'");
		p.ver(s.ingresarServicio("Montevideo", "Radisson", "Cena"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Cena' al hotel 'Radisson' de la ciudad 'Montevideo'");

		// 1. En caso que no exista un hotel “Hotel” registrado dentro de la
		// ciudad “Ciudad”.
		p.tituloPrueba("PruebaERROR_IngresarServicio - No existe el hotel registrado en la ciudad");
		p.ver(s.ingresarServicio("Montevideo", "Quiroga", "Lavado de ropa"), Sistema.TipoRet.ERROR_1,
				"No se agregó el servicio 'Lavado de ropa'. El hotel 'Quiroga' no existe en la ciudad de 'Montevideo'");
		p.ver(s.ingresarServicio("Salto", "Radisson", "Piscina"), Sistema.TipoRet.ERROR_1,
				"No se agregó el servicio 'Piscina'. El hotel 'Radisson' no existe en la ciudad de 'Salto'");

		// 2. En caso que no exista la ciudad “Ciudad”.
		p.tituloPrueba("PruebaERROR_IngresarServicio - No existe la ciudad");
		p.ver(s.ingresarServicio("Piriápolis", "Radisson", "Lavado de ropa"), Sistema.TipoRet.ERROR_2,
				"No se agregó el servicio 'Lavado de ropa'. No existe la ciudad 'Piriápolis' en el sistema");
		p.ver(s.ingresarServicio("Minas", "NH-Columbia", "Piscina"), Sistema.TipoRet.ERROR_2,
				"No se agregó el servicio 'Piscina'.  No existe la ciudad 'Minas' en el sistema");
	}

	// Prueba ERROR para Borrar servicio
	public static void PruebaERROR_BorrarServicio(Sistema s, Prueba p) {

		p.tituloPrueba("PruebaERROR_BorrarServicio - Borrar Servicio");

		p.ver(s.crearSistemaReservas(20), Sistema.TipoRet.OK,
				"Se creó un sistema de reservas con límite de '20' ciudades");

		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agregó 'Montevideo' al mapa");
		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agregó 'Colonia' al mapa");
		p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agregó 'Salto' al mapa");

		p.ver(s.registrarHotel("Montevideo", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Montevideo", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Colonia", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Colonia'");
		p.ver(s.registrarHotel("Salto", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Salto'");

		p.ver(s.ingresarServicio("Montevideo", "NH-Columbia", "Lavado de ropa"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Lavado de ropa' al hotel 'NH-Columbia' de la ciudad 'Montevideo'");
		p.ver(s.ingresarServicio("Salto", "NH-Columbia", "Desayuno"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Desayuno' al hotel 'NH-Columbia' de la ciudad 'Salto'");
		p.ver(s.ingresarServicio("Montevideo", "Radisson", "Desayuno"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Merienda' al hotel 'Radisson' de la ciudad 'Montevideo'");
		p.ver(s.ingresarServicio("Montevideo", "Radisson", "Cena"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Cena' al hotel 'Radisson' de la ciudad 'Montevideo'");
		p.ver(s.ingresarServicio("Colonia", "Radisson", "Cena"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Cena' al hotel 'Radisson' de la ciudad 'Colonia'");

		// 1. En caso de que no exista un hotel “Hotel” registrado dentro de la
		// ciudad “Ciudad”.
		p.tituloPrueba("PruebaERROR_BorrarServicio - No existe un hotel para la ciudad");
		p.ver(s.borrarServicio("Salto", "Radisson", "Desayuno"), Sistema.TipoRet.ERROR_1,
				"No se pudo borrar el servicio 'Desayuno'. No existe el hotel para la ciudad.");
		p.ver(s.borrarServicio("Colonia", "NH-Columbia", "Cena"), Sistema.TipoRet.ERROR_1,
				"No se pudo borrar el servicio 'Cena'. No existe el hotel para la ciudad.");

		// 2. En caso de que no exista el servicio “Servicio” registrado en el
		// hotel “Hotel”.
		p.tituloPrueba("PruebaERROR_BorrarServicio - No existe el servicio para el hotel");
		p.ver(s.borrarServicio("Salto", "NH-Columbia", "Cena"), Sistema.TipoRet.ERROR_2,
				"No se pudo borrar el servicio 'Cena'. No existe el servicio para el hotel.");
		p.ver(s.borrarServicio("Montevideo", "NH-Columbia", "Piscina"), Sistema.TipoRet.ERROR_2,
				"No se pudo borrar el servicio 'Piscina'. No existe el servicio para el hotel.");

		// 3. En caso que no exista la ciudad “Ciudad”.
		p.tituloPrueba("PruebaERROR_BorrarServicio - No existe la ciudad");
		p.ver(s.borrarServicio("Minas", "Radisson", "Desayuno"), Sistema.TipoRet.ERROR_3,
				"No se pudo borrar el servicio 'Desayuno'. No existe la ciudad.");
		p.ver(s.borrarServicio("Rivera", "NH-Columbia", "Lavado de ropa"), Sistema.TipoRet.ERROR_3,
				"No se pudo borrar el servicio 'Lavado de ropa'. No existe la ciudad.");
	}

	// Prueba ERROR para Ingresar Comentario
	public static void PruebaERROR_IngresarComentario(Sistema s, Prueba p) {

		p.tituloPrueba("PruebaERROR_IngresarComentario - Ingresar Comentario");

		p.ver(s.crearSistemaReservas(20), Sistema.TipoRet.OK,
				"Se creó un sistema de reservas con límite de '20' ciudades");

		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agregó 'Montevideo' al mapa");
		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agregó 'Colonia' al mapa");
		p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agregó 'Salto' al mapa");

		p.ver(s.registrarHotel("Montevideo", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Montevideo", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Colonia", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Colonia'");
		p.ver(s.registrarHotel("Salto", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Salto'");

		p.ver(s.ingresarComentario("Montevideo", "NH-Columbia", "Excelente servicio y atención", 5), Sistema.TipoRet.OK,
				"Se agregó el comentario 'Excelente servicio y atención' al hotel 'NH-Columbia' de la ciudad 'Montevideo'");
		p.ver(s.ingresarComentario("Montevideo", "Radisson", "Desayunos muy ricos!", 5), Sistema.TipoRet.OK,
				"Se agregó el comentario 'Desayunos muy ricos!' al hotel 'Radisson' de la ciudad 'Montevideo'");
		p.ver(s.ingresarComentario("Montevideo", "Radisson", "Cena muy temprana y poco abundante", 3),
				Sistema.TipoRet.OK,
				"Se agregó el comentario 'Cena muy temprana y poco abundante' al hotel 'Radisson' de la ciudad 'Montevideo'");

		// En caso que el ranking sea menor a 0 o mayor a 5.
		p.tituloPrueba("PruebaERROR_IngresarComentario - Ranking menor a 0 o mayor que 5");
		p.ver(s.ingresarComentario("Montevideo", "NH-Columbia", "Excelente servicio y atención", -1),
				Sistema.TipoRet.ERROR_1, "No se agregó el comentario. El ranking debe ser menor a 0 o mayor que 5");
		p.ver(s.ingresarComentario("Montevideo", "Radisson", "Excelente servicio y atención", 6),
				Sistema.TipoRet.ERROR_1, "No se agregó el comentario. El ranking debe ser menor a 0 o mayor que 5");

		// 2. En caso que no exista un hotel de nombre “Hotel” registrado dentro
		// de la ciudad “Ciudad”.
		p.tituloPrueba("PruebaERROR_IngresarComentario - No existe hotel en ciudad");
		p.ver(s.ingresarComentario("Salto", "Radisson", "Excelente servicio y atención", 4), Sistema.TipoRet.ERROR_2,
				"No se agregó el comentario. No existe el hotel en la ciudad.");
		p.ver(s.ingresarComentario("Colonia", "NH-Columbia", "Excelente servicio y atención", 4),
				Sistema.TipoRet.ERROR_2, "No se agregó el comentario. No existe el hotel en la ciudad.");

		// 3. En caso que no exista la ciudad “Ciudad”.
		p.tituloPrueba("PruebaERROR_IngresarComentario - No existe la ciudad en el sistema");
		p.ver(s.ingresarComentario("Rivera", "Radisson", "Excelente servicio y atención", 4), Sistema.TipoRet.ERROR_3,
				"No se agregó el comentario. No existe la ciudad en el sistema.");
		p.ver(s.ingresarComentario("Artigas", "NH-Columbia", "Excelente servicio y atención", 4),
				Sistema.TipoRet.ERROR_3, "No se agregó el comentario. No existe la ciudad en el sistema.");
	}

	// Prueba ERROR para Realizar Reserva
	public static void PruebaERROR_RealizarReserva(Sistema s, Prueba p) {

		p.tituloPrueba("PruebaERROR_RealizarReserva - No Realizar Reserva");

		p.ver(s.crearSistemaReservas(20), Sistema.TipoRet.OK,
				"Se creó un sistema de reservas con límite de '20' ciudades");

		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agregó 'Montevideo' al mapa");
		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agregó 'Colonia' al mapa");
		p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agregó 'Salto' al mapa");

		p.ver(s.registrarHotel("Montevideo", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Montevideo", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Colonia", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Colonia'");
		p.ver(s.registrarHotel("Salto", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Salto'");
		p.ver(s.registrarHotel("Salto", "Quiroga", 4, 2), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Quiroga' a la ciudad 'Salto'");

		p.ver(s.realizarReserva(1, "Salto", "Quiroga"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '1' en el hotel 'Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(1, "Salto", "Quiroga"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '1' en el hotel 'Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(1, "Salto", "Quiroga"), Sistema.TipoRet.OK,
				"Cliente en lista de espera para hotel 'Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(1, "Salto", "Quiroga"), Sistema.TipoRet.OK,
				"Cliente en lista de espera para hotel 'Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(1, "Montevideo", "Radisson"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '1' en el hotel 'Radisson' en la ciudad de 'Montevideo'");
		p.ver(s.realizarReserva(1, "Salto", "NH-Columbia"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '1' en el hotel 'NH-Columbia' en la ciudad de 'Salto'");

		// 1. En caso de que no exista un hotel de nombre “Hotel” registrado
		// dentro de la ciudad Ciudad”.
		p.tituloPrueba("PruebaERROR_RealizarReserva - No existe el hotel para la ciudad");
		p.ver(s.realizarReserva(1, "Salto", "Radisson"), Sistema.TipoRet.ERROR_1,
				"No se realizó la reserva. No existe el hotel para la ciudad.");
		p.ver(s.realizarReserva(1, "Colonia", "NH-Columbia"), Sistema.TipoRet.ERROR_1,
				"No se realizó la reserva. No existe el hotel para la ciudad.");

		// 2. En caso que no exista la ciudad “Ciudad”.
		p.tituloPrueba("PruebaERROR_RealizarReserva - No existe la ciudad en el sistema");
		p.ver(s.realizarReserva(1, "Rivera", "Radisson"), Sistema.TipoRet.ERROR_2,
				"No se realizó la reserva. No existe la ciudad en el sistema.");
		p.ver(s.realizarReserva(1, "Tacuarembó", "NH-Columbia"), Sistema.TipoRet.ERROR_2,
				"No se realizó la reserva. No existe la ciudad en el sistema.");
	}

	// Prueba ERROR para Borrar Reserva
	public static void PruebaERROR_CancelarReserva(Sistema s, Prueba p) {

		p.tituloPrueba("PruebaERROR_CancelarReserva - Cancelar Reserva");

		p.ver(s.crearSistemaReservas(20), Sistema.TipoRet.OK,
				"Se creó un sistema de reservas con límite de '20' ciudades");

		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agregó 'Montevideo' al mapa");
		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agregó 'Colonia' al mapa");
		p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agregó 'Salto' al mapa");

		p.ver(s.registrarHotel("Montevideo", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Montevideo", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Colonia", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Colonia'");
		p.ver(s.registrarHotel("Salto", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Salto'");
		p.ver(s.registrarHotel("Salto", "Quiroga", 5, 2), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Quiroga' a la ciudad 'Salto'");

		p.ver(s.realizarReserva(1, "Salto", "Quiroga"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '1' en el hotel 'Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(2, "Salto", "Quiroga"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '2' en el hotel 'Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(3, "Salto", "Quiroga"), Sistema.TipoRet.OK,
				"Cliente en lista de espera para hotel 'Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(4, "Salto", "Quiroga"), Sistema.TipoRet.OK,
				"Cliente en lista de espera para hotel 'Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(5, "Montevideo", "Radisson"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '5' en el hotel 'Radisson' en la ciudad de 'Montevideo'");
		p.ver(s.realizarReserva(6, "Salto", "NH-Columbia"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '6' en el hotel 'NH-Columbia' en la ciudad de 'Salto'");

		p.ver(s.cancelarReserva(1, "Salto", "Quiroga"), Sistema.TipoRet.OK,
				"Se canceló la reserva para el cliente '1' en el hotel 'Quiroga' en la ciudad de 'Salto'");

		// 1. En caso de que no exista un hotel de nombre “Hotel” registrado en
		// la ciudad “Ciudad”.
		p.tituloPrueba("PruebaERROR_CancelarReserva - No existe el hotel en la ciudad");
		p.ver(s.cancelarReserva(2, "Montevideo", "Quiroga"), Sistema.TipoRet.ERROR_1,
				"No se canceló la reserva para el cliente '2'. No existe el hotel 'Quiroga' en la ciudad de 'Montevideo'");

		// 2. En caso de que el cliente “cliente” no tenga ninguna reserva en el
		// hotel “Hotel” registrado en la ciudad “Ciudad”.
		p.tituloPrueba("PruebaERROR_CancelarReserva - El cliente no tiene reserva para el hotel en la ciudad");

		p.ver(s.cancelarReserva(20, "Salto", "Quiroga"), Sistema.TipoRet.ERROR_2,
				"No se canceló la reserva para el cliente '20'. El cliente no tiene reserva para el hotel en la ciudad.");

		p.ver(s.cancelarReserva(1, "Salto", "Quiroga"), Sistema.TipoRet.ERROR_2,
				"No se canceló la reserva para el cliente '1'. El cliente no tiene reserva para el hotel en la ciudad.");

		// 3. En caso que no exista la ciudad “Ciudad”.
		p.tituloPrueba("PruebaERROR_CancelarReserva - No existe la ciudad en el sistema");
		p.ver(s.cancelarReserva(2, "Rivera", "Quiroga"), Sistema.TipoRet.ERROR_3,
				"No se canceló la reserva para el cliente '2'. No existe la ciudad en el sistema.");
		p.ver(s.cancelarReserva(6, "Tacuarembó", "NH-Columbia"), Sistema.TipoRet.ERROR_3,
				"No se canceló la reserva para el cliente '6'. No existe la ciudad en el sistema.");

	}

	// Prueba ERROR para Listar servicios
	public static void PruebaERROR_ListarServicios(Sistema s, Prueba p) {

		p.ver(s.crearSistemaReservas(20), Sistema.TipoRet.OK,
				"Se creó un sistema de reservas con límite de '20' ciudades");

		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agregó 'Montevideo' al mapa");
		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agregó 'Colonia' al mapa");
		p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agregó 'Salto' al mapa");

		p.ver(s.registrarHotel("Montevideo", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Montevideo", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Colonia", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Colonia'");
		p.ver(s.registrarHotel("Salto", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Salto'");
		p.ver(s.registrarHotel("Salto", "Quiroga", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Quiroga' a la ciudad 'Salto'");

		p.ver(s.ingresarServicio("Montevideo", "NH-Columbia", "Lavado de ropa"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Lavado de ropa' al hotel 'NH-Columbia' de la ciudad 'Montevideo'");
		p.ver(s.ingresarServicio("Salto", "NH-Columbia", "Desayuno"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Desayuno' al hotel 'NH-Columbia' de la ciudad 'Salto'");
		p.ver(s.ingresarServicio("Montevideo", "Radisson", "Desayuno"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Merienda' al hotel 'Radisson' de la ciudad 'Montevideo'");
		p.ver(s.ingresarServicio("Montevideo", "Radisson", "Cena"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Cena' al hotel 'Radisson' de la ciudad 'Montevideo'");
		p.ver(s.ingresarServicio("Montevideo", "Radisson", "Piscina"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Piscina' al hotel 'Radisson' de la ciudad 'Montevideo'");
		p.ver(s.ingresarServicio("Montevideo", "Radisson", "Lavado de ropa"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Lavado de ropa' al hotel 'Radisson' de la ciudad 'Montevideo'");
		p.ver(s.ingresarServicio("Salto", "NH-Columbia", "Casino"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Casino' al hotel 'NH-Columbia' de la ciudad 'Salto'");

		p.ver(s.listarServicios("Montevideo", "Radisson"), Sistema.TipoRet.OK,
				"Listar Servicios del hotel 'Radisson' en 'Montevideo'");
		p.ver(s.borrarServicio("Montevideo", "Radisson", "Cena"), Sistema.TipoRet.OK,
				"Se borró el servicio 'Cena' del hotel 'Radisson' en 'Montevideo'");
		p.ver(s.listarServicios("Montevideo", "Radisson"), Sistema.TipoRet.OK,
				"Listar Servicios del hotel 'Radisson' en 'Montevideo'");

		p.ver(s.listarServicios("Salto", "NH-Columbia"), Sistema.TipoRet.OK,
				"Listar Servicios del hotel 'NH-Columbia' en 'Salto'");
		p.ver(s.listarServicios("Colonia", "Radisson"), Sistema.TipoRet.OK,
				"Listar Servicios del hotel 'Radisson' en 'Colonia'");

		// 1. En caso que no exista el hotel “Hotel” registrado en la ciudad
		// “Ciudad”.
		p.tituloPrueba("PruebaERROR_ListarServicios -  No existe el hotel en la ciudad");

		p.ver(s.listarServicios("Colonia", "NH-Columbia"), Sistema.TipoRet.ERROR_1,
				"No existe el hotel 'NH-Columbia' en la ciudad de 'Colonia'");
		p.ver(s.listarServicios("Colonia", "Quiroga"), Sistema.TipoRet.ERROR_1,
				"No existe el hotel 'Quiroga' en la ciudad de 'Colonia'");

		// 2. En caso que no exista la ciudad “Ciudad”.
		p.tituloPrueba("PruebaERROR_ListarServicios -  No existe la ciudad");
		p.ver(s.listarServicios("Rivera", "NH-Columbia"), Sistema.TipoRet.ERROR_2, "No existe la ciudad en el sistema");
		p.ver(s.listarServicios("Tacuarembó", "Quiroga"), Sistema.TipoRet.ERROR_2, "No existe la ciudad en el sistema");
	}

	// Prueba ERROR para Listar Hoteles
	public static void PruebaERROR_ListarHotelesCiudad(Sistema s, Prueba p) {

		p.tituloPrueba("PruebaERROR_ListarHotelesCiudad - Listar Hoteles en la Ciudad");

		p.ver(s.crearSistemaReservas(20), Sistema.TipoRet.OK,
				"Se creó un sistema de reservas con límite de '20' ciudades");

		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agregó 'Montevideo' al mapa");
		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agregó 'Colonia' al mapa");
		p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agregó 'Salto' al mapa");
		p.ver(s.registrarCiudad("Maldonado"), Sistema.TipoRet.OK, "Se agregó 'Maldonado' al mapa");

		p.ver(s.registrarHotel("Montevideo", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Montevideo", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Montevideo", "Conrad", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Conrad' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Colonia", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Colonia'");
		p.ver(s.registrarHotel("Salto", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Salto'");
		p.ver(s.registrarHotel("Salto", "Quiroga", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Quiroga' a la ciudad 'Salto'");

		p.ver(s.listarHotelesCiudad("Salto"), Sistema.TipoRet.OK, "Listado de los hoteles de 'Salto'");
		p.ver(s.listarHotelesCiudad("Montevideo"), Sistema.TipoRet.OK, "Listado de los hoteles de 'Montevideo'");
		p.ver(s.listarHotelesCiudad("Colonia"), Sistema.TipoRet.OK, "Listado de los hoteles de 'Colonia'");
		p.ver(s.listarHotelesCiudad("Maldonado"), Sistema.TipoRet.OK, "Listado de los hoteles de 'Maldonado'");

		p.tituloPrueba("PruebaERROR_ListarHotelesCiudad - No existe la ciudad");

		p.ver(s.listarHotelesCiudad("Rivera"), Sistema.TipoRet.ERROR_1, "No existe la ciudad en el sistema");
		p.ver(s.listarHotelesCiudad("Tacuarembó"), Sistema.TipoRet.ERROR_1, "No existe la ciudad en el sistema");
		p.ver(s.listarHotelesCiudad("Durazno"), Sistema.TipoRet.ERROR_1, "No existe la ciudad en el sistema");

	}

	// Prueba ERROR para Listar Comentarios
	public static void PruebaERROR_ListarComentarios(Sistema s, Prueba p) {

		p.tituloPrueba("PruebaERROR_ListarComentarios - Listar Comentarios");

		p.ver(s.crearSistemaReservas(20), Sistema.TipoRet.OK,
				"Se creó un sistema de reservas con límite de '20' ciudades");

		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agregó 'Montevideo' al mapa");
		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agregó 'Colonia' al mapa");
		p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agregó 'Salto' al mapa");

		p.ver(s.registrarHotel("Montevideo", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Montevideo", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Colonia", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Colonia'");
		p.ver(s.registrarHotel("Salto", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Salto'");
		p.ver(s.registrarHotel("Salto", "Quiroga", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Quiroga' a la ciudad 'Salto'");

		p.ver(s.ingresarComentario("Montevideo", "NH-Columbia", "Excelente servicio y atención", 5), Sistema.TipoRet.OK,
				"Se agregó el comentario 'Excelente servicio y atención' al hotel 'NH-Columbia' de la ciudad 'Montevideo'");
		p.ver(s.ingresarComentario("Montevideo", "Radisson", "Desayunos muy ricos!", 5), Sistema.TipoRet.OK,
				"Se agregó el comentario 'Desayunos muy ricos!' al hotel 'Radisson' de la ciudad 'Montevideo'");
		p.ver(s.ingresarComentario("Montevideo", "Radisson", "Cena muy temprana y poco abundante", 3),
				Sistema.TipoRet.OK,
				"Se agregó el comentario 'Cena muy temprana y poco abundante' al hotel 'Radisson' de la ciudad 'Montevideo'");
		p.ver(s.ingresarComentario("Montevideo", "Radisson", "La piscina tiene una temperatura ideal!", 5),
				Sistema.TipoRet.OK,
				"Se agregó el comentario 'La piscina tiene una temperatura ideal!' al hotel 'Radisson' de la ciudad 'Montevideo'");
		p.ver(s.ingresarComentario("Salto", "Quiroga", "La piscinas están muy limpias", 5), Sistema.TipoRet.OK,
				"Se agregó el comentario 'La piscinas están muy limpias' al hotel 'Quiroga' de la ciudad 'Salto'");

		p.ver(s.listarComentarios("Salto", "NH-Columbia"), Sistema.TipoRet.OK,
				"Listar comentarios del hotel 'NH-Columbia' en 'Salto'");
		p.ver(s.listarComentarios("Montevideo", "NH-Columbia"), Sistema.TipoRet.OK,
				"Listar comentarios del hotel 'NH-Columbia' en 'Montevideo'");
		p.ver(s.listarComentarios("Montevideo", "Radisson"), Sistema.TipoRet.OK,
				"Listar comentarios del hotel 'Radisson' en 'Montevideo'");

		// 1. En caso que no exista el hotel “Hotel” registrado en la ciudad
		// “Ciudad”.
		p.tituloPrueba("PruebaERROR_ListarComentarios - No existe el hotel en la ciudad");
		p.ver(s.listarComentarios("Salto", "Radisson"), Sistema.TipoRet.ERROR_1,
				"No existe el hotel 'Radisson' en 'Salto'");
		p.ver(s.listarComentarios("Colonia", "Quiroga"), Sistema.TipoRet.ERROR_1,
				"No existe el hotel 'Quiroga' en 'Colonia'");

		// 2. En caso que no exista la ciudad “Ciudad”.
		p.tituloPrueba("PruebaERROR_ListarComentarios - No existe la ciudad");
		p.ver(s.listarComentarios("Rivera", "Radisson"), Sistema.TipoRet.ERROR_2,
				"No existe la ciudad de 'Rivera' en el sistema");
		p.ver(s.listarComentarios("Tacuarembó", "Quiroga"), Sistema.TipoRet.ERROR_2,
				"No existe la ciudad de 'Tacuarembó' en el sistema");

		s.destruirSistemaReservas();
	}

	// Prueba ERROR para Listar Espera
	public static void PruebaERROR_ListarEspera(Sistema s, Prueba p) {

		p.tituloPrueba("PruebaERROR_ListarEspera - Listar espera");

		p.ver(s.crearSistemaReservas(20), Sistema.TipoRet.OK,
				"Se creó un sistema de reservas con límite de '20' ciudades");

		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agregó 'Montevideo' al mapa");
		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agregó 'Colonia' al mapa");
		p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agregó 'Salto' al mapa");

		p.ver(s.registrarHotel("Montevideo", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Montevideo", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Colonia", "Radisson", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Colonia'");
		p.ver(s.registrarHotel("Salto", "NH-Columbia", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Salto'");
		p.ver(s.registrarHotel("Salto", "Quiroga", 5, 2), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Quiroga' a la ciudad 'Salto'");

		p.ver(s.realizarReserva(1, "Salto", "Quiroga"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '1' en el hotel 'Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(2, "Salto", "Quiroga"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '2' en el hotel 'Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(3, "Salto", "Quiroga"), Sistema.TipoRet.OK,
				"Cliente en lista de espera para hotel 'Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(4, "Salto", "Quiroga"), Sistema.TipoRet.OK,
				"Cliente en lista de espera para hotel 'Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(5, "Montevideo", "Radisson"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '5' en el hotel 'Radisson' en la ciudad de 'Montevideo'");
		p.ver(s.realizarReserva(6, "Salto", "NH-Columbia"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '6' en el hotel 'NH-Columbia' en la ciudad de 'Salto'");

		p.ver(s.listarEspera("Salto", "Quiroga"), Sistema.TipoRet.OK,
				"Listar espera del hotel 'Quiroga' en la ciudad 'Salto'");
		p.ver(s.listarEspera("Montevideo", "Radisson"), Sistema.TipoRet.OK,
				"Listar espera del hotel 'Radisson' en la ciudad 'Montevideo'");

		// 1. En caso que no exista el hotel “Hotel” registrado en la ciudad
		// “Ciudad”.
		p.tituloPrueba("PruebaERROR_ListarEspera - No existe el hotel para la ciudad");
		p.ver(s.listarEspera("Colonia", "Quiroga"), Sistema.TipoRet.ERROR_1,
				"No se pudo Listar la Espera. No existe el hotel 'Quiroga' en la ciudad de 'Colonia'");
		p.ver(s.listarEspera("Colonia", "NH-Columbia"), Sistema.TipoRet.ERROR_1,
				"No se pudo Listar la Espera. No existe el hotel 'NH-Columbia' en la ciudad de 'Colonia'");

		// 2. En caso que no exista la ciudad “Ciudad”.
		p.tituloPrueba("PruebaERROR_ListarEspera - No existe la ciudad");
		p.ver(s.listarEspera("Rivera", "Quiroga"), Sistema.TipoRet.ERROR_2,
				"No se pudo Listar la Espera. No existe la ciudad de 'Rivera' en el sistema");
		p.ver(s.listarEspera("Tacuarembó", "NH-Columbia"), Sistema.TipoRet.ERROR_2,
				"No se pudo Listar la Espera. No existe la ciudad de 'Tacuarembó' en el sistema");

	}

}
