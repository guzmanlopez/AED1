package sistema;

public class Main {

	public static void main(String[] args) {

		// Instanciar clases
		Sistema s = new Sistema();
		Prueba p = new Prueba();

		// ---------------------- PRUEBAS OK --------------------------//

		// PruebaOK_CrearSistemaReservas(s, p);
		// PruebaOK_DestruirSistemaReservas(s, p);
		// PruebaOK_RegistrarCiudad(s, p);
		// PruebaOK_RegistrarHotel(s, p);
		// PruebaOK_IngresarServicio(s, p);
		// PruebaOK_BorrarServicio(s, p);
		// PruebaOK_IngresarComentario(s, p);
		// PruebaOK_RealizarReserva(s, p);
		PruebaOK_CancelarReserva(s, p);

		// ---------------------- PRUEBAS ERROR -----------------------//

		// PruebaERROR_RegistrarCiudad(s, p);
		// PruebaERROR_RegistrarHotel(s, p);
		// PruebaERROR_IngresarServicio(s, p);
		// PruebaERROR_BorrarServicio(s, p);
		// PruebaERROR_IngresarComentario(s, p);
		// PruebaERROR_RealizarReserva(s, p);
		// PruebaERROR_CancelarReserva(s, p);

		// ---------------------- PRUEBAS MODIFICACION -----------------------//

		// PruebaMOD_CrearSistemaReservas(s, p);
		// PruebaMOD_DestruirSistemaReservas(s, p);
		// PruebaMOD_RegistrarCiudad(s, p);
		// PruebaMOD_RegistrarHotel(s, p);
		// PruebaMOD_IngresarServicio(s, p);

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

		p.ver(s.ingresarComentario("Montevideo", "NH-Columbia", "Excelente servicio y atención", 5), Sistema.TipoRet.OK,
				"Se agregó el comentario 'Excelente servicio y atención' al hotel 'NH-Columbia' de la ciudad 'Montevideo'");
		p.ver(s.ingresarComentario("Montevideo", "Radisson", "Desayunos muy ricos!", 5), Sistema.TipoRet.OK,
				"Se agregó el comentario 'Desayunos muy ricos!' al hotel 'Radisson' de la ciudad 'Montevideo'");
		p.ver(s.ingresarComentario("Montevideo", "Radisson", "Cena muy temprana y poco abundante", 3),
				Sistema.TipoRet.OK,
				"Se agregó el comentario 'Cena muy temprana y poco abundante' al hotel 'Radisson' de la ciudad 'Montevideo'");
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

	}

	// Prueba OK para Cancelar Reserva
	public static void PruebaOK_CancelarReserva(Sistema s, Prueba p) {

		p.tituloPrueba("PruebaOK_RealizarReserva - Cancelar Reserva");

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

	// public static void PruebaOK_1(Sistema s, Prueba p) {
	//
	// s.crearSistemaReservas(20);
	// System.out.println("Se crea el sistema de reservas vacio");
	//
	// p.tituloPrueba("PRUEBA OK 1 - casos base");
	// p.tituloPrueba("PRUEBA OK 1 - Agregar ciudades al mapa:");
	//
	// p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agrego
	// Montevideo al mapa");
	// p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agrego
	// Colonia al mapa");
	// p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agrego Salto al
	// mapa");
	// p.ver(s.registrarCiudad("Rivera"), Sistema.TipoRet.OK, "Se agrego Rivera
	// al mapa");
	// p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.ERROR_1, "Se
	// intento agregar Montevideo que ya existe");
	//
	// p.tituloPrueba("PRUEBA OK 1 - REGISTRAR HOTEL");
	// p.ver(s.registrarHotel("Montevideo", "NH-Columbia", 4, 110),
	// Sistema.TipoRet.OK,
	// "Se agreg� el hotel Montevideo-NH-Columbia");
	// p.ver(s.registrarHotel("Montevideo", "Holiday Inn", 4, 90),
	// Sistema.TipoRet.OK,
	// "Se agreg� el hotel Montevideo-Holiday Inn");
	// p.ver(s.registrarHotel("Montevideo", "Ibis", 3, 60), Sistema.TipoRet.OK,
	// "Se agreg� el hotel Montevideo-Ibis");
	// p.ver(s.registrarHotel("Montevideo", "Cottage", 4, 90),
	// Sistema.TipoRet.OK,
	// "Se agreg� el hotel Montevideo-Radison Victoria Plaza");
	// p.ver(s.registrarHotel("Montevideo", "Sheraton", 5, 540),
	// Sistema.TipoRet.OK,
	// "Se agreg� el hotel Montevideo-Sheraton");
	// p.ver(s.registrarHotel("Montevideo", "Victoria Plaza", 5, 320),
	// Sistema.TipoRet.OK,
	// "Se agreg� el hotel Montevideo-Radison Victoria Plaza");
	//
	// p.tituloPrueba("2.10 LISTADO DE HOTELES POR CIUDAD");
	// p.ver(s.listarHotelesCiudad("Montevideo"), Sistema.TipoRet.OK, "");
	// p.ver(s.listarHotelesCiudad("Artigas"), Sistema.TipoRet.OK, "Listado de
	// hoteles en Artigas");
	// s.destruirSistemaReservas();
	// }
	//
	// public static void PruebaOK_2(Sistema s, Prueba p) {
	//
	// s.crearSistemaReservas(20);
	// System.out.println("Se crea el sistema de reservas vacio");
	//
	// p.tituloPrueba("PRUEBA OK 2");
	// p.tituloPrueba("2.3 REGISTRAR HOTEL");
	//
	// p.ver(s.registrarHotel("Montevideo", "Victoria Plaza", 5, 320),
	// Sistema.TipoRet.OK,
	// "Se agreg� el hotel Montevideo-Radison Victoria Plaza");
	// p.ver(s.registrarHotel("Colonia", "Sheraton", 5, 540),
	// Sistema.TipoRet.OK,
	// "Se agreg� el hotel Colonia-Sheraton");
	// p.ver(s.registrarHotel("Maldonado", "Mantra", 5, 120),
	// Sistema.TipoRet.OK,
	// "Se agreg� el hotel Maldonado-Mantra");
	// p.ver(s.registrarHotel("Maldonado", "Conrad", 5, 320),
	// Sistema.TipoRet.OK,
	// "Se agreg� el hotel Maldonado-Conrad");
	// p.ver(s.registrarHotel("Colonia", "Barcel�", 5, 90), Sistema.TipoRet.OK,
	// "Se agreg� el hotel Colonia-Barcel�");
	// p.ver(s.registrarHotel("Montevideo", "NH-Columbia", 4, 110),
	// Sistema.TipoRet.OK,
	// "Se agreg� el hotel Montevideo-NH-Columbia");
	// p.ver(s.registrarHotel("Montevideo", "Ibis", 3, 60), Sistema.TipoRet.OK,
	// "Se agreg� el hotel Montevideo-Ibis");
	// p.ver(s.registrarHotel("Salto", "Horacio Quiroga", 5, 70),
	// Sistema.TipoRet.OK,
	// "Se agreg� el hotel Salto-Horacio Quiroga");
	//
	// p.tituloPrueba("2.10 LISTADO DE HOTELES POR CIUDAD");
	// p.ver(s.listarHotelesCiudad("Montevideo"), Sistema.TipoRet.OK, "");
	// p.ver(s.listarHotelesCiudad("Colonia"), Sistema.TipoRet.OK, "");
	// p.ver(s.listarHotelesCiudad("Maldonado"), Sistema.TipoRet.OK, "");
	//
	// p.tituloPrueba("2.4 INGRESAR SERVICIO");
	// p.ver(s.ingresarServicio("Montevideo", "Ibis", "wifi"),
	// Sistema.TipoRet.OK,
	// "Se ingres� servicio wifi en Montevideo-Ibis");
	// p.ver(s.ingresarServicio("Montevideo", "Ibis", "valet parking"),
	// Sistema.TipoRet.OK,
	// "Se ingres� servicio valet parking en Montevideo-Ibis");
	// p.ver(s.ingresarServicio("Montevideo", "Ibis", "tintoreria"),
	// Sistema.TipoRet.OK,
	// "Se ingres� servicio tintoreria en Montevideo-Ibis");
	// p.ver(s.ingresarServicio("Montevideo", "Ibis", "piscina"),
	// Sistema.TipoRet.OK,
	// "Se ingres� servicio piscina en Montevideo-Ibis");
	//
	// p.tituloPrueba("2.9 LISTAR SERVICIOS");
	// p.ver(s.listarServicios("Montevideo", "Ibis"), Sistema.TipoRet.OK,
	// "Se imprimi� Lista de Servicios de Montevideo-Ibis");
	//
	// p.tituloPrueba("2.5 BORRAR SERVICIOS");
	// p.ver(s.borrarServicio("Montevideo", "Ibis", "valet parking"),
	// Sistema.TipoRet.OK,
	// "Se borr� servicio valet parking de Montevideo-Ibis");
	// p.ver(s.borrarServicio("Montevideo", "Ibis", "piscina"),
	// Sistema.TipoRet.OK,
	// "Se borr� servicio piscina de Montevideo-Ibis");
	// p.ver(s.borrarServicio("Montevideo", "Ibis", "wifi"), Sistema.TipoRet.OK,
	// "Se borr� servicio wifi de Montevideo-Ibis");
	//
	// p.ver(s.listarServicios("Montevideo", "Ibis"), Sistema.TipoRet.OK,
	// "Se imprimi� Lista de Servicios de Montevideo-Ibis");
	// s.destruirSistemaReservas();
	// }

}
