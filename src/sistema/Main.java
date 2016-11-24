package sistema;

import estructuras.QuickSort;

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
		// PruebaOK_CancelarReserva(s, p);
		// PruebaOK_ListarServicios(s, p);
		// PruebaOK_ListarHotelesCiudad(s, p);

		PruebaOK_ListarHotelesRanking(s, p);

		// PruebaOK_ListarComentarios(s, p);
		// PruebaOK_ListarEspera(s, p);
		//
		// PruebaOK_1(s, p);
		// PruebaOK_2(s, p);
		// PruebaOK_3(s, p);
		// PruebaOK_4(s, p);
		// PruebaOK_5(s, p);

		// ---------------------- PRUEBAS ERROR ----------------------- //

		// PruebaERROR_RegistrarCiudad(s, p);
		// PruebaERROR_RegistrarHotel(s, p);
		// PruebaERROR_IngresarServicio(s, p);
		// PruebaERROR_BorrarServicio(s, p);
		// PruebaERROR_IngresarComentario(s, p);
		// PruebaERROR_RealizarReserva(s, p);
		// PruebaERROR_CancelarReserva(s, p);
		// PruebaERROR_ListarServicios(s, p);
		// PruebaERROR_ListarHotelesCiudad(s, p);
		// PruebaERROR_ListarComentarios(s, p);
		// PruebaERROR_ListarEspera(s, p);
		//
		// PruebaERROR_1(s, p);
		// PruebaERROR_2(s, p);
		// PruebaERROR_3(s, p);
		// PruebaERROR_4(s, p);
		// PruebaERROR_5(s, p);
		// PruebaERROR_6(s, p);
		// PruebaERROR_7(s, p);

		// ------------------- IMPRIMIR RESULTADO PRUEBAS ------------------ //
		p.imprimirResultadosPrueba();

		// QuickSort();
	}

	public static void QuickSort() {

		int[] vector = { 1, 3, 6, 8, 9, 2, 3, 4, 6, 5 };
		QuickSort.quickSort(vector, 0, 9);
		System.out.println(vector[0]);
		System.out.println(vector[1]);
		System.out.println(vector[2]);
		System.out.println(vector[3]);
		System.out.println(vector[4]);
		System.out.println(vector[5]);
		System.out.println(vector[6]);
		System.out.println(vector[7]);
		System.out.println(vector[8]);
		System.out.println(vector[9]);

	}

	// ********** PRUEBAS OK ********** //

	// Prueba OK para crear Sistema de reservas
	public static void PruebaOK_CrearSistemaReservas(Sistema s, Prueba p) {

		p.tituloPrueba("PruebaOK_CrearSistemaReservas - Crear Sistema de Reservas");
		p.ver(s.crearSistemaReservas(20), Sistema.TipoRet.OK,
				"Se creó un sistema de reservas con límite de 20 ciudades");
		p.ver(s.destruirSistemaReservas(), Sistema.TipoRet.OK, "Se destruyó el sistema de reservas creado");

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
		p.ver(s.registrarCiudad("Maldonado"), Sistema.TipoRet.OK, "Se agregó 'Maldonado' al mapa");
		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agregó 'Colonia' al mapa");
		p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agregó 'Salto' al mapa");

		p.ver(s.destruirSistemaReservas(), Sistema.TipoRet.OK, "Se destruyó el sistema de reservas creado");
	}

	// Prueba OK para Registrar Hotel
	public static void PruebaOK_RegistrarHotel(Sistema s, Prueba p) {

		p.tituloPrueba("PruebaOK_RegistrarHotel - Registrar Hotel");
		p.ver(s.crearSistemaReservas(20), Sistema.TipoRet.OK,
				"Se creó un sistema de reservas con límite de '20' ciudades");

		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agregó 'Montevideo' al mapa");
		p.ver(s.registrarCiudad("Maldonado"), Sistema.TipoRet.OK, "Se agregó 'Maldonado' al mapa");
		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agregó 'Colonia' al mapa");
		p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agregó 'Salto' al mapa");

		p.ver(s.registrarHotel("Montevideo", "NH-Columbia", 4, 100), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Montevideo", "Radisson", 4, 100), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Maldonado", "Conrad", 4, 100), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Colonia'");
		p.ver(s.registrarHotel("Colonia", "Radisson", 4, 100), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Colonia'");
		p.ver(s.registrarHotel("Salto", "Horacio Quiroga", 4, 100), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Horacio Quiroga' a la ciudad 'Salto'");

		p.ver(s.destruirSistemaReservas(), Sistema.TipoRet.OK, "Se destruyó el sistema de reservas creado");
	}

	// Prueba OK para Ingresar servicio
	public static void PruebaOK_IngresarServicio(Sistema s, Prueba p) {

		p.tituloPrueba("PruebaOK_IngresarServicio - Ingresar Servicio");
		p.ver(s.crearSistemaReservas(20), Sistema.TipoRet.OK,
				"Se creó un sistema de reservas con límite de '20' ciudades");

		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agregó 'Montevideo' al mapa");
		p.ver(s.registrarCiudad("Maldonado"), Sistema.TipoRet.OK, "Se agregó 'Maldonado' al mapa");
		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agregó 'Colonia' al mapa");
		p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agregó 'Salto' al mapa");

		p.ver(s.registrarHotel("Montevideo", "NH-Columbia", 4, 100), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Montevideo", "Radisson", 4, 100), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Maldonado", "Conrad", 4, 100), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Colonia'");
		p.ver(s.registrarHotel("Colonia", "Radisson", 4, 100), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Colonia'");
		p.ver(s.registrarHotel("Salto", "Horacio Quiroga", 4, 100), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Horacio Quiroga' a la ciudad 'Salto'");

		p.ver(s.ingresarServicio("Montevideo", "NH-Columbia", "Lavado de ropa"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Lavado de ropa' al hotel 'NH-Columbia' de la ciudad 'Montevideo'");
		p.ver(s.ingresarServicio("Montevideo", "NH-Columbia", "Desayuno"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Desayuno' al hotel 'NH-Columbia' de la ciudad 'Montevideo'");
		p.ver(s.ingresarServicio("Montevideo", "Radisson", "Desayuno"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Merienda' al hotel 'Radisson' de la ciudad 'Montevideo'");
		p.ver(s.ingresarServicio("Montevideo", "Radisson", "Cena"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Cena' al hotel 'Radisson' de la ciudad 'Montevideo'");
		p.ver(s.ingresarServicio("Maldonado", "Conrad", "Casino"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Casino' al hotel 'Conrad' de la ciudad 'Maldonado'");
		p.ver(s.ingresarServicio("Maldonado", "Conrad", "Gimnasio"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Gimnasio' al hotel 'Conrad' de la ciudad 'Maldonado'");
		p.ver(s.ingresarServicio("Salto", "Horacio Quiroga", "Piscina"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Piscina' al hotel 'Horacio Quiroga' de la ciudad 'Salto'");
		p.ver(s.ingresarServicio("Salto", "Horacio Quiroga", "Sala fitness"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Sala fitness' al hotel 'Horacio Quiroga' de la ciudad 'Salto'");

		p.ver(s.destruirSistemaReservas(), Sistema.TipoRet.OK, "Se destruyó el sistema de reservas creado");
	}

	// Prueba OK para Borrar servicio
	public static void PruebaOK_BorrarServicio(Sistema s, Prueba p) {

		p.tituloPrueba("PruebaOK_BorrarServicio - Borrar Servicio");

		p.ver(s.crearSistemaReservas(20), Sistema.TipoRet.OK,
				"Se creó un sistema de reservas con límite de '20' ciudades");

		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agregó 'Montevideo' al mapa");
		p.ver(s.registrarCiudad("Maldonado"), Sistema.TipoRet.OK, "Se agregó 'Maldonado' al mapa");
		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agregó 'Colonia' al mapa");
		p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agregó 'Salto' al mapa");

		p.ver(s.registrarHotel("Montevideo", "NH-Columbia", 4, 100), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Montevideo", "Radisson", 4, 100), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Maldonado", "Conrad", 4, 100), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Colonia'");
		p.ver(s.registrarHotel("Colonia", "Radisson", 4, 100), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Colonia'");
		p.ver(s.registrarHotel("Salto", "Horacio Quiroga", 4, 100), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Horacio Quiroga' a la ciudad 'Salto'");

		p.ver(s.ingresarServicio("Montevideo", "NH-Columbia", "Lavado de ropa"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Lavado de ropa' al hotel 'NH-Columbia' de la ciudad 'Montevideo'");
		p.ver(s.ingresarServicio("Montevideo", "NH-Columbia", "Desayuno"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Desayuno' al hotel 'NH-Columbia' de la ciudad 'Montevideo'");
		p.ver(s.ingresarServicio("Montevideo", "Radisson", "Desayuno"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Merienda' al hotel 'Radisson' de la ciudad 'Montevideo'");
		p.ver(s.ingresarServicio("Montevideo", "Radisson", "Cena"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Cena' al hotel 'Radisson' de la ciudad 'Montevideo'");
		p.ver(s.ingresarServicio("Maldonado", "Conrad", "Casino"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Casino' al hotel 'Conrad' de la ciudad 'Maldonado'");
		p.ver(s.ingresarServicio("Maldonado", "Conrad", "Gimnasio"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Gimnasio' al hotel 'Conrad' de la ciudad 'Maldonado'");
		p.ver(s.ingresarServicio("Salto", "Horacio Quiroga", "Piscina"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Piscina' al hotel 'Horacio Quiroga' de la ciudad 'Salto'");
		p.ver(s.ingresarServicio("Salto", "Horacio Quiroga", "Sala fitness"), Sistema.TipoRet.OK,
				"Se agregó el servicio 'Sala fitness' al hotel 'Horacio Quiroga' de la ciudad 'Salto'");

		p.ver(s.borrarServicio("Montevideo", "NH-Columbia", "Lavado de ropa"), Sistema.TipoRet.OK,
				"Se borró el servicio 'Lavado de ropa' del hotel 'NH-Columbia' en 'Montevideo'");
		p.ver(s.borrarServicio("Salto", "Horacio Quiroga", "Sala fitness"), Sistema.TipoRet.OK,
				"Se borró el servicio 'Sala fitness' del hotel 'Horacio Quiroga' en 'Salto'");
		p.ver(s.borrarServicio("Montevideo", "Radisson", "Cena"), Sistema.TipoRet.OK,
				"Se borró el servicio 'Cena' del hotel 'Radisson' en 'Montevideo'");

		p.ver(s.destruirSistemaReservas(), Sistema.TipoRet.OK, "Se destruyó el sistema de reservas creado");
	}

	// Prueba OK para Ingresar Comentario
	public static void PruebaOK_IngresarComentario(Sistema s, Prueba p) {

		p.tituloPrueba("PruebaOK_IngresarComentario - Ingresar Comentario");

		p.ver(s.crearSistemaReservas(20), Sistema.TipoRet.OK,
				"Se creó un sistema de reservas con límite de '20' ciudades");

		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agregó 'Montevideo' al mapa");
		p.ver(s.registrarCiudad("Maldonado"), Sistema.TipoRet.OK, "Se agregó 'Maldonado' al mapa");
		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agregó 'Colonia' al mapa");
		p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agregó 'Salto' al mapa");

		p.ver(s.registrarHotel("Montevideo", "NH-Columbia", 4, 100), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Montevideo", "Radisson", 4, 100), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Maldonado", "Conrad", 4, 100), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Colonia'");
		p.ver(s.registrarHotel("Colonia", "Radisson", 4, 100), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Colonia'");
		p.ver(s.registrarHotel("Salto", "Horacio Quiroga", 4, 100), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Horacio Quiroga' a la ciudad 'Salto'");

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

		p.ver(s.ingresarComentario("Maldonado", "Conrad", "Es imposible ganar en la ruleta!", 1), Sistema.TipoRet.OK,
				"Se agregó el comentario 'Es imposible ganar en la ruleta!' al hotel 'Conrad' de la ciudad 'Maldonado'");
		p.ver(s.ingresarComentario("Maldonado", "Conrad", "Los slots te dan toda la plata!", 5), Sistema.TipoRet.OK,
				"Se agregó el comentario 'Los slots te dan toda la plata!' al hotel 'Conrad' de la ciudad 'Maldonado'");

		p.ver(s.ingresarComentario("Salto", "Horacio Quiroga", "Temperatura piscina ideal!", 5), Sistema.TipoRet.OK,
				"Se agregó el comentario 'Temperatura piscina ideal!' al hotel 'Horacio Quiroga' de la ciudad 'Salto'");
	}

	// Prueba OK para Realizar Reserva
	public static void PruebaOK_RealizarReserva(Sistema s, Prueba p) {

		p.tituloPrueba("PruebaOK_RealizarReserva - Realizar Reserva");

		p.ver(s.crearSistemaReservas(20), Sistema.TipoRet.OK,
				"Se creó un sistema de reservas con límite de '20' ciudades");

		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agregó 'Montevideo' al mapa");
		p.ver(s.registrarCiudad("Maldonado"), Sistema.TipoRet.OK, "Se agregó 'Maldonado' al mapa");
		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agregó 'Colonia' al mapa");
		p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agregó 'Salto' al mapa");

		p.ver(s.registrarHotel("Montevideo", "NH-Columbia", 4, 100), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Montevideo", "Radisson", 4, 100), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Maldonado", "Conrad", 4, 100), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Colonia'");
		p.ver(s.registrarHotel("Colonia", "Radisson", 4, 100), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Colonia'");
		p.ver(s.registrarHotel("Salto", "Horacio Quiroga", 4, 100), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Horacio Quiroga' a la ciudad 'Salto'");

		p.ver(s.realizarReserva(1, "Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '1' en el hotel 'Horacio Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(2, "Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '2' en el hotel 'Horacio Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(3, "Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Cliente en lista de espera para hotel 'Horacio Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(4, "Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Cliente en lista de espera para hotel 'Horacio Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(5, "Montevideo", "Radisson"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '5' en el hotel 'Radisson' en la ciudad de 'Montevideo'");
		p.ver(s.realizarReserva(6, "Montevideo", "NH-Columbia"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '6' en el hotel 'NH-Columbia' en la ciudad de 'Montevideo'");
		p.ver(s.realizarReserva(10, "Maldonado", "Conrad"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '10' en el hotel 'Conrad' en la ciudad de 'Maldonado'");

	}

	// Prueba OK para Borrar Reserva
	public static void PruebaOK_CancelarReserva(Sistema s, Prueba p) {

		p.tituloPrueba("PruebaOK_CancelarReserva - Cancelar Reserva");

		p.ver(s.crearSistemaReservas(20), Sistema.TipoRet.OK,
				"Se creó un sistema de reservas con límite de '20' ciudades");

		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agregó 'Montevideo' al mapa");
		p.ver(s.registrarCiudad("Maldonado"), Sistema.TipoRet.OK, "Se agregó 'Maldonado' al mapa");
		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agregó 'Colonia' al mapa");
		p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agregó 'Salto' al mapa");

		p.ver(s.registrarHotel("Montevideo", "NH-Columbia", 4, 100), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Montevideo", "Radisson", 4, 100), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Maldonado", "Conrad", 4, 100), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Colonia'");
		p.ver(s.registrarHotel("Colonia", "Radisson", 4, 100), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Colonia'");
		p.ver(s.registrarHotel("Salto", "Horacio Quiroga", 4, 100), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Horacio Quiroga' a la ciudad 'Salto'");

		p.ver(s.realizarReserva(1, "Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '1' en el hotel 'Horacio Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(2, "Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '2' en el hotel 'Horacio Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(3, "Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Cliente en lista de espera para hotel 'Horacio Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(4, "Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Cliente en lista de espera para hotel 'Horacio Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(5, "Montevideo", "Radisson"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '5' en el hotel 'Radisson' en la ciudad de 'Montevideo'");
		p.ver(s.realizarReserva(6, "Montevideo", "NH-Columbia"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '6' en el hotel 'NH-Columbia' en la ciudad de 'Montevideo'");
		p.ver(s.realizarReserva(10, "Maldonado", "Conrad"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '10' en el hotel 'Conrad' en la ciudad de 'Maldonado'");

		p.ver(s.realizarReserva(6, "Montevideo", "Radisson"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '6' en el hotel 'Radisson' en la ciudad de 'Montevideo'");
		p.ver(s.realizarReserva(7, "Montevideo", "NH-Columbia"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '7' en el hotel 'NH-Columbia' en la ciudad de 'Montevideo'");
		p.ver(s.realizarReserva(8, "Montevideo", "NH-Columbia"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '8' en el hotel 'NH-Columbia' en la ciudad de 'Montevideo'");

		p.ver(s.cancelarReserva(4, "Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Se canceló la reserva para el cliente '4' en la lista de espera del hotel 'Horacio Quiroga' en la ciudad de 'Salto'");
		p.ver(s.cancelarReserva(1, "Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Se canceló la reserva para el cliente '1' en el hotel 'Horacio Quiroga' en la ciudad de 'Salto'");
		p.ver(s.cancelarReserva(2, "Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Se canceló la reserva para el cliente '2' en el hotel 'Horacio Quiroga' en la ciudad de 'Salto'");
		p.ver(s.cancelarReserva(3, "Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Se canceló la reserva para el cliente '3' en el hotel 'Horacio Quiroga' en la ciudad de 'Salto'");

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
		p.ver(s.registrarHotel("Salto", "Horacio Quiroga", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Horacio Quiroga' a la ciudad 'Salto'");

		p.ver(s.listarHotelesCiudad("Salto"), Sistema.TipoRet.OK, "Listado de los hoteles de 'Salto'");
		p.ver(s.listarHotelesCiudad("Montevideo"), Sistema.TipoRet.OK, "Listado de los hoteles de 'Montevideo'");
		p.ver(s.listarHotelesCiudad("Colonia"), Sistema.TipoRet.OK, "Listado de los hoteles de 'Colonia'");
		p.ver(s.listarHotelesCiudad("Maldonado"), Sistema.TipoRet.OK, "Listado de los hoteles de 'Maldonado'");

	}

	// Prueba OK para Listar Hoteles por ranking
	public static void PruebaOK_ListarHotelesRanking(Sistema s, Prueba p) {

		p.tituloPrueba("PruebaOK_ListarComentarios - Listar Comentarios");

		p.ver(s.crearSistemaReservas(20), Sistema.TipoRet.OK,
				"Se creó un sistema de reservas con límite de '20' ciudades");

		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agregó 'Montevideo' al mapa");
		p.ver(s.registrarCiudad("Maldonado"), Sistema.TipoRet.OK, "Se agregó 'Maldonado' al mapa");
		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agregó 'Colonia' al mapa");
		p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agregó 'Salto' al mapa");

		p.ver(s.registrarHotel("Montevideo", "NH-Columbia", 4, 100), Sistema.TipoRet.OK,
				"Se agregó el hotel 'NH-Columbia' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Montevideo", "Radisson", 4, 100), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Montevideo'");
		p.ver(s.registrarHotel("Maldonado", "Conrad", 4, 100), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Colonia'");
		p.ver(s.registrarHotel("Colonia", "Radisson", 4, 100), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Radisson' a la ciudad 'Colonia'");
		p.ver(s.registrarHotel("Salto", "Horacio Quiroga", 4, 100), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Horacio Quiroga' a la ciudad 'Salto'");

		p.ver(s.ingresarComentario("Montevideo", "NH-Columbia", "Excelente servicio y atención", 3), Sistema.TipoRet.OK,
				"Se agregó el comentario 'Excelente servicio y atención' al hotel 'NH-Columbia' de la ciudad 'Montevideo'");

		p.ver(s.ingresarComentario("Montevideo", "Radisson", "Desayunos muy ricos!", 5), Sistema.TipoRet.OK,
				"Se agregó el comentario 'Desayunos muy ricos!' al hotel 'Radisson' de la ciudad 'Montevideo'");
		p.ver(s.ingresarComentario("Montevideo", "Radisson", "Desayunos muy ricos!", 3), Sistema.TipoRet.OK,
				"Se agregó el comentario 'Desayunos muy ricos!' al hotel 'Radisson' de la ciudad 'Montevideo'");
		p.ver(s.ingresarComentario("Montevideo", "Radisson", "Desayunos muy ricos!", 5), Sistema.TipoRet.OK,
				"Se agregó el comentario 'Desayunos muy ricos!' al hotel 'Radisson' de la ciudad 'Montevideo'");
		p.ver(s.ingresarComentario("Montevideo", "Radisson", "Cena muy temprana y poco abundante", 1),
				Sistema.TipoRet.OK,
				"Se agregó el comentario 'Cena muy temprana y poco abundante' al hotel 'Radisson' de la ciudad 'Montevideo'");
		p.ver(s.ingresarComentario("Montevideo", "Radisson", "Desayunos muy ricos!", 4), Sistema.TipoRet.OK,
				"Se agregó el comentario 'Desayunos muy ricos!' al hotel 'Radisson' de la ciudad 'Montevideo'");

		p.ver(s.ingresarComentario("Maldonado", "Conrad", "Es imposible ganar en la ruleta!", 1), Sistema.TipoRet.OK,
				"Se agregó el comentario 'Es imposible ganar en la ruleta!' al hotel 'Conrad' de la ciudad 'Maldonado'");
		p.ver(s.ingresarComentario("Maldonado", "Conrad", "Los slots te dan toda la plata!", 5), Sistema.TipoRet.OK,
				"Se agregó el comentario 'Los slots te dan toda la plata!' al hotel 'Conrad' de la ciudad 'Maldonado'");

		p.ver(s.ingresarComentario("Salto", "Horacio Quiroga", "Temperatura piscina ideal!", 5), Sistema.TipoRet.OK,
				"Se agregó el comentario 'Temperatura piscina ideal!' al hotel 'Horacio Quiroga' de la ciudad 'Salto'");
		p.ver(s.listarHotelesRanking(), Sistema.TipoRet.OK, "Listar hoteles por Ranking");

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
		p.ver(s.registrarHotel("Salto", "Horacio Quiroga", 5, 2), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Horacio Quiroga' a la ciudad 'Salto'");

		p.ver(s.realizarReserva(1, "Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '1' en el hotel 'Horacio Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(2, "Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '2' en el hotel 'Horacio Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(3, "Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Cliente en lista de espera para hotel 'Horacio Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(4, "Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Cliente en lista de espera para hotel 'Horacio Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(5, "Montevideo", "Radisson"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '5' en el hotel 'Radisson' en la ciudad de 'Montevideo'");
		p.ver(s.realizarReserva(6, "Salto", "NH-Columbia"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '6' en el hotel 'NH-Columbia' en la ciudad de 'Salto'");

		p.ver(s.listarEspera("Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Listar espera del hotel 'Horacio Quiroga' en la ciudad 'Salto'");
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
		p.ver(s.ingresarServicio("Montevideo", "Horacio Quiroga", "Lavado de ropa"), Sistema.TipoRet.ERROR_1,
				"No se agregó el servicio 'Lavado de ropa'. El hotel 'Horacio Quiroga' no existe en la ciudad de 'Montevideo'");
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
		p.ver(s.registrarHotel("Salto", "Horacio Quiroga", 4, 2), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Horacio Quiroga' a la ciudad 'Salto'");

		p.ver(s.realizarReserva(1, "Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '1' en el hotel 'Horacio Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(1, "Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '1' en el hotel 'Horacio Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(1, "Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Cliente en lista de espera para hotel 'Horacio Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(1, "Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Cliente en lista de espera para hotel 'Horacio Quiroga' en la ciudad de 'Salto'");
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
		p.ver(s.registrarHotel("Salto", "Horacio Quiroga", 5, 2), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Horacio Quiroga' a la ciudad 'Salto'");

		p.ver(s.realizarReserva(1, "Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '1' en el hotel 'Horacio Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(2, "Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '2' en el hotel 'Horacio Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(3, "Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Cliente en lista de espera para hotel 'Horacio Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(4, "Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Cliente en lista de espera para hotel 'Horacio Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(5, "Montevideo", "Radisson"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '5' en el hotel 'Radisson' en la ciudad de 'Montevideo'");
		p.ver(s.realizarReserva(6, "Salto", "NH-Columbia"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '6' en el hotel 'NH-Columbia' en la ciudad de 'Salto'");

		p.ver(s.cancelarReserva(1, "Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Se canceló la reserva para el cliente '1' en el hotel 'Horacio Quiroga' en la ciudad de 'Salto'");

		// 1. En caso de que no exista un hotel de nombre “Hotel” registrado en
		// la ciudad “Ciudad”.
		p.tituloPrueba("PruebaERROR_CancelarReserva - No existe el hotel en la ciudad");
		p.ver(s.cancelarReserva(2, "Montevideo", "Horacio Quiroga"), Sistema.TipoRet.ERROR_1,
				"No se canceló la reserva para el cliente '2'. No existe el hotel 'Horacio Quiroga' en la ciudad de 'Montevideo'");

		// 2. En caso de que el cliente “cliente” no tenga ninguna reserva en el
		// hotel “Hotel” registrado en la ciudad “Ciudad”.
		p.tituloPrueba("PruebaERROR_CancelarReserva - El cliente no tiene reserva para el hotel en la ciudad");

		p.ver(s.cancelarReserva(20, "Salto", "Horacio Quiroga"), Sistema.TipoRet.ERROR_2,
				"No se canceló la reserva para el cliente '20'. El cliente no tiene reserva para el hotel en la ciudad.");

		p.ver(s.cancelarReserva(1, "Salto", "Horacio Quiroga"), Sistema.TipoRet.ERROR_2,
				"No se canceló la reserva para el cliente '1'. El cliente no tiene reserva para el hotel en la ciudad.");

		// 3. En caso que no exista la ciudad “Ciudad”.
		p.tituloPrueba("PruebaERROR_CancelarReserva - No existe la ciudad en el sistema");
		p.ver(s.cancelarReserva(2, "Rivera", "Horacio Quiroga"), Sistema.TipoRet.ERROR_3,
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
		p.ver(s.registrarHotel("Salto", "Horacio Quiroga", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Horacio Quiroga' a la ciudad 'Salto'");

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
		p.ver(s.listarServicios("Colonia", "Horacio Quiroga"), Sistema.TipoRet.ERROR_1,
				"No existe el hotel 'Horacio Quiroga' en la ciudad de 'Colonia'");

		// 2. En caso que no exista la ciudad “Ciudad”.
		p.tituloPrueba("PruebaERROR_ListarServicios -  No existe la ciudad");
		p.ver(s.listarServicios("Rivera", "NH-Columbia"), Sistema.TipoRet.ERROR_2, "No existe la ciudad en el sistema");
		p.ver(s.listarServicios("Tacuarembó", "Horacio Quiroga"), Sistema.TipoRet.ERROR_2,
				"No existe la ciudad en el sistema");
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
		p.ver(s.registrarHotel("Salto", "Horacio Quiroga", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Horacio Quiroga' a la ciudad 'Salto'");

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
		p.ver(s.registrarHotel("Salto", "Horacio Quiroga", 4, 110), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Horacio Quiroga' a la ciudad 'Salto'");

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
		p.ver(s.ingresarComentario("Salto", "Horacio Quiroga", "La piscinas están muy limpias", 5), Sistema.TipoRet.OK,
				"Se agregó el comentario 'La piscinas están muy limpias' al hotel 'Horacio Quiroga' de la ciudad 'Salto'");

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
		p.ver(s.listarComentarios("Colonia", "Horacio Quiroga"), Sistema.TipoRet.ERROR_1,
				"No existe el hotel 'Horacio Quiroga' en 'Colonia'");

		// 2. En caso que no exista la ciudad “Ciudad”.
		p.tituloPrueba("PruebaERROR_ListarComentarios - No existe la ciudad");
		p.ver(s.listarComentarios("Rivera", "Radisson"), Sistema.TipoRet.ERROR_2,
				"No existe la ciudad de 'Rivera' en el sistema");
		p.ver(s.listarComentarios("Tacuarembó", "Horacio Quiroga"), Sistema.TipoRet.ERROR_2,
				"No existe la ciudad de 'Tacuarembó' en el sistema");

		s.destruirSistemaReservas();
	}

	public static void PruebaERROR_ListarEspera(Sistema s, Prueba p) {

		p.tituloPrueba("PruebaERROR_ListarEspera - Listar espera");

		p.ver(s.crearSistemaReservas(20), Sistema.TipoRet.OK,
				"Se creó un sistema de reservas con límite de '20' ciudades");

		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agregó 'Montevideo' al mapa");
		p.ver(s.registrarCiudad("Maldonado"), Sistema.TipoRet.OK, "Se agregó 'Maldonado' al mapa");
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
		p.ver(s.registrarHotel("Salto", "Horacio Quiroga", 5, 2), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Horacio Quiroga' a la ciudad 'Salto'");
		p.ver(s.registrarHotel("Maldonado", "Conrad", 5, 100), Sistema.TipoRet.OK,
				"Se agregó el hotel 'Conrad' a la ciudad 'Maldonado'");

		p.ver(s.realizarReserva(1, "Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '1' en el hotel 'Horacio Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(2, "Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '2' en el hotel 'Horacio Quiroga' en la ciudad de 'Salto'");

		p.ver(s.realizarReserva(8, "Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Cliente '8' en lista de espera para hotel 'Horacio Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(3, "Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Cliente '3' en lista de espera para hotel 'Horacio Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(3, "Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Cliente '3' en lista de espera para hotel 'Horacio Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(2, "Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Cliente '2' en lista de espera para hotel 'Horacio Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(5, "Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Cliente '5' en lista de espera para hotel 'Horacio Quiroga' en la ciudad de 'Salto'");
		p.ver(s.realizarReserva(6, "Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Cliente '6' en lista de espera para hotel 'Horacio Quiroga' en la ciudad de 'Salto'");

		p.ver(s.realizarReserva(5, "Montevideo", "Radisson"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '5' en el hotel 'Radisson' en la ciudad de 'Montevideo'");
		p.ver(s.realizarReserva(6, "Salto", "NH-Columbia"), Sistema.TipoRet.OK,
				"Se realizó la reserva para el cliente '6' en el hotel 'NH-Columbia' en la ciudad de 'Salto'");

		p.ver(s.listarEspera("Montevideo", "Radisson"), Sistema.TipoRet.OK,
				"Listar espera del hotel 'Radisson' en la ciudad 'Montevideo'");

		p.ver(s.listarEspera("Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Listar espera del hotel 'Horacio Quiroga' en la ciudad 'Salto'");

		p.ver(s.cancelarReserva(1, "Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Se canceló la reserva para el cliente '1' en el hotel 'Horacio Quiroga' en la ciudad de 'Salto'");
		p.ver(s.cancelarReserva(2, "Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Se canceló la reserva para el cliente '2' en el hotel 'Horacio Quiroga' en la ciudad de 'Salto'");

		p.ver(s.listarEspera("Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Listar espera del hotel 'Horacio Quiroga' en la ciudad 'Salto'");

		p.ver(s.cancelarReserva(6, "Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Se canceló la reserva para el cliente '6' en el hotel 'Horacio Quiroga' en la ciudad de 'Salto'");

		p.ver(s.listarEspera("Salto", "Horacio Quiroga"), Sistema.TipoRet.OK,
				"Listar espera del hotel 'Horacio Quiroga' en la ciudad 'Salto'");

		// 1. En caso que no exista el hotel “Hotel” registrado en la ciudad
		// “Ciudad”.
		p.tituloPrueba("PruebaERROR_ListarEspera - No existe el hotel para la ciudad");
		p.ver(s.listarEspera("Colonia", "Horacio Quiroga"), Sistema.TipoRet.ERROR_1,
				"No se pudo Listar la Espera. No existe el hotel 'Horacio Quiroga' en la ciudad de 'Colonia'");
		p.ver(s.listarEspera("Colonia", "NH-Columbia"), Sistema.TipoRet.ERROR_1,
				"No se pudo Listar la Espera. No existe el hotel 'NH-Columbia' en la ciudad de 'Colonia'");

		// 2. En caso que no exista la ciudad “Ciudad”.
		p.tituloPrueba("PruebaERROR_ListarEspera - No existe la ciudad");
		p.ver(s.listarEspera("Rivera", "Horacio Quiroga"), Sistema.TipoRet.ERROR_2,
				"No se pudo Listar la Espera. No existe la ciudad de 'Rivera' en el sistema");
		p.ver(s.listarEspera("Tacuarembó", "NH-Columbia"), Sistema.TipoRet.ERROR_2,
				"No se pudo Listar la Espera. No existe la ciudad de 'Tacuarembó' en el sistema");

	}

	// ***** pruebas profe ***** //
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
		p.ver(s.registrarCiudad("Soriano"), Sistema.TipoRet.ERROR_2,
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

		// No se agrega "Artigas" a las ciudades, debería ser ERROR 1
		p.ver(s.listarHotelesCiudad("Artigas"), Sistema.TipoRet.ERROR_1, "Listado de hoteles en Artigas");
		s.destruirSistemaReservas();
	}

	public static void PruebaOK_2(Sistema s, Prueba p) {
		s.crearSistemaReservas(5);
		System.out.println("Se crea el sistema de reservas vacio");
		p.tituloPrueba("PRUEBA OK 1 - AGREGAR CIUDADES AL MAPA:");
		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agrego Montevideo al mapa");
		p.ver(s.registrarCiudad("Colonia"), Sistema.TipoRet.OK, "Se agrego Colonia al mapa");
		p.ver(s.registrarCiudad("Salto"), Sistema.TipoRet.OK, "Se agrego Salto al mapa");
		p.ver(s.registrarCiudad("Rivera"), Sistema.TipoRet.OK, "Se agrego Rivera al mapa");
		p.ver(s.registrarCiudad("Maldonado"), Sistema.TipoRet.OK, "Se agrego Maldonado al mapa");

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

		// Tipo de error 1 o 2???
		p.tituloPrueba(
				"PRUEBA 2 - REGISTRAR una ciudad más de la que tiene el sistema como tope - Se ingresaron 5 y el tope es 5");
		p.ver(s.registrarCiudad("Montana"), Sistema.TipoRet.ERROR_2, "No se permite ingresar más ciudades al sistema");
		s.destruirSistemaReservas();
	}

	public static void PruebaERROR_2(Sistema s, Prueba p) {

		System.out.println("Error Ciudad - Se verifica el caso que la ciudad Ciudad ya existe en el sistema.");
		System.out.println("Se crea el sistema de reservas vacio");
		p.ver(s.crearSistemaReservas(5), Sistema.TipoRet.OK, "Se creo el sistema para 5 ciudades");

		p.tituloPrueba("******** PruebaError_2  *******");

		p.tituloPrueba("PRUEBA 1 - AGREGAR CIUDADES AL MAPA Repetidas");
		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.OK, "Se agrego Montevideo al mapa");
		p.ver(s.registrarCiudad("Montevideo"), Sistema.TipoRet.ERROR_1, "Ya existe Montevideo en el sistema");
		s.destruirSistemaReservas();
	}

	public static void PruebaERROR_3(Sistema s, Prueba p) {

		System.out.println("Error Hotel - En caso que Estrellas mayor a 5.");
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

		System.out.println("Error Hotel - En caso que Estrellas sea menor a 1");
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

		System.out.println("Error Hotel - En caso que Capacidad sea menor a 0.");
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
				"Error Hotel - En caso que ya exista un hotel de nombre Nombre dentro de la ciudad Ciudad.");
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

		System.out.println("Error Hotel - En caso que no exista la ciudad Ciudad");
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
