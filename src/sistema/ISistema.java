package sistema;

public interface ISistema {
	
	public Sistema.TipoRet crearSistemaReservas(Integer cantCiudades);

	public Sistema.TipoRet destruirSistemaReservas();

	public Sistema.TipoRet registrarCiudad(String ciudad);

	public Sistema.TipoRet registrarHotel(String ciudad, String nombre, int estrellas, int capacidad);

	public Sistema.TipoRet ingresarServicio(String ciudad, String hotel, String servicio);

	public Sistema.TipoRet borrarServicio(String ciudad, String hotel, String servicio);

	public Sistema.TipoRet ingresarComentario(String ciudad, String hotel, String comentario, int ranking);

	public Sistema.TipoRet realizarReserva(int cliente, String ciudad, String hotel);

	public Sistema.TipoRet cancelarReserva(int cliente, String ciudad, String hotel);

	public Sistema.TipoRet listarServicios(String ciudad, String hotel);

	public Sistema.TipoRet listarHotelesCiudad(String ciudad);

	public Sistema.TipoRet listarHotelesRanking();

	public Sistema.TipoRet listarComentarios(String ciudad, String hotel);

	public Sistema.TipoRet listarEspera(String ciudad, String hotel);

	// Para el ejercicio que utiliza la matriz agregar
	public Sistema.TipoRet CargarDistancias(int[][] ciudades);

	public Sistema.TipoRet buscarCamino(int[][] ciudades, String ciudadOrigen, String ciudadDestino);

}
