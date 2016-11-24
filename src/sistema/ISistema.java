package sistema;

public interface ISistema {

	// PRE: -
	// POS: crea un sistema de reservas con la cantidad de ciudades definida por
	// parámetro
	public Sistema.TipoRet crearSistemaReservas(Integer cantCiudades);

	// PRE: debe existir un sistema de reserva
	// POS: elimina un sistema de reservas reiniciando sus atributos a sus
	// valores originales (listas vacías o cantidad de ciudades en cero)
	public Sistema.TipoRet destruirSistemaReservas();

	// PRE: el ingreso de una nueva ciudad no puede superar la capacidad del
	// sistema
	// PRE: la ciudad no debe existir previamente en el sistema
	// POS: agrega una ciudad a la lista de ciuades del sistema
	public Sistema.TipoRet registrarCiudad(String ciudad);

	// PRE: el hotel a registrarse no puede tener una cantiad de estrellas menor
	// a 1 o mayor a 5
	// PRE: el hotel a registrarse no puede tener una capacidad menor a cero
	// PRE: el hotel a registrarse tiene que tener una ciudad que ya haya sido
	// ingresada al sistema
	// PRE: no puede existir el hotel a ingresarse en el sistema
	// POS: agrega un hotel a la lista de hoteles del sistema y a la lista de
	// hoteles de la ciudad a la cual pertenece el hotel
	public Sistema.TipoRet registrarHotel(String ciudad, String nombre, int estrellas, int capacidad);

	// PRE: tiene que existir el hotel para la ciudad en el cual quiere
	// registrarse el servicio
	// POS: se registra un servicio para un determinado hotel-ciudad: se agrega
	// el servicio al hotel-ciudad en la lista de hoteles del sistema y en la
	// lista de hoteles de la ciudad
	public Sistema.TipoRet ingresarServicio(String ciudad, String hotel, String servicio);

	// PRE: debe existir el servicio para el hotel en la ciudad
	// POS: se borra el servicio especificado para un determinado hotel-ciudad:
	// se borra el servicio al hotel-ciudad en la lista de hoteles del sistema y
	// en la lista de hoteles de la ciudad
	public Sistema.TipoRet borrarServicio(String ciudad, String hotel, String servicio);

	// PRE: el ranking ingresado debe ser mayor a cero o menor a cinco
	// PRE: tiene que existir el hotel-ciudad en el sistema para el cual se
	// quiere ingresar el comentario
	// POS: se registra un comentario para un determinado hotel-ciudad: se
	// agrega el comentario al hotel-ciudad en la lista de hoteles del sistema y
	// en la lista de hoteles de la ciudad
	// POS: se reordena la lista de Hoteles por Ranking
	public Sistema.TipoRet ingresarComentario(String ciudad, String hotel, String comentario, int ranking);

	// PRE: debe existir el hotel-ciudad para el cual quiere ingresarse una
	// reserva
	// POS: se ingresa una reserva para el cliente en el hotel-ciudad
	// especificado si el hotel no está lleno (en el hotel-ciudad de la lista de
	// hoteles del sistema y en la lista de hoteles para la ciudad)
	// POS: se ingresa la reserva a una lista de espera si el hotel está lleno
	// (en el hotel-ciudad de la lista de
	// hoteles del sistema y en la lista de hoteles para la ciudad)
	public Sistema.TipoRet realizarReserva(int cliente, String ciudad, String hotel);

	// PRE: debe existir la reserva para el cliente-hotel-ciudad en la lista de
	// reservas o en la lista de esperas del hotel-ciudad
	// POS: se elimina la reserva para el cliente de la lista de reservas o la
	// lista de espera del hotel-ciudad
	public Sistema.TipoRet cancelarReserva(int cliente, String ciudad, String hotel);

	// PRE: debe existir el hotel-ciudad para el cual se desea listar los
	// servicios
	// POS: lista los servicios del hotel-ciudad especificado (se muestran en
	// pantalla)
	public Sistema.TipoRet listarServicios(String ciudad, String hotel);

	// PRE: debe existir la ciudad para la cual se desea listar los
	// hoteles
	// POS: se listan los hoteles en la ciudad (se muestran en pantalla)
	public Sistema.TipoRet listarHotelesCiudad(String ciudad);

	// PRE: -
	// POS: lista los hoteles de la lista de hoteles del sistema ordenados por
	// ranking de forma descendente (se muestran en pantalla)
	public Sistema.TipoRet listarHotelesRanking();

	// PRE: debe existir el hotel-ciudad para la cual se desea listar los
	// comentarios
	// POS: lista los comentarios del hotel-ciudad (se muestran en pantalla)
	public Sistema.TipoRet listarComentarios(String ciudad, String hotel);

	// PRE: debe existir el hotel-ciudad para la cual se desea listar las reservas en la lista de espera
	// POS: lista las reservas en la lista de espera del hotel-ciudad (se muestran en pantalla)
	public Sistema.TipoRet listarEspera(String ciudad, String hotel);

	// Para el ejercicio que utiliza la matriz agregar
	public Sistema.TipoRet CargarDistancias(int[][] ciudades);

	public Sistema.TipoRet buscarCamino(int[][] ciudades, String ciudadOrigen, String ciudadDestino);

}
