package dominio;

public class Comentario {

	// Atributos
	private String comentario;

	// Métodos de acceso y modificación
	public String getComentario() {
		return this.comentario;
	}

	public void setComentario(String comentario) {		
		this.comentario = comentario;		
	}

	// Constructor
	public Comentario(String comentario) {
		this.comentario = comentario;
	}

}
