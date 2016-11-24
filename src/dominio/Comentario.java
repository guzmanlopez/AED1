package dominio;

public class Comentario {

	// Atributos
	private String comentario;
	private Integer ranking;

	// Métodos de acceso y modificación
	public String getComentario() {
		return this.comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public int getRanking() {
		return this.ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	// Constructor
	public Comentario(String comentario, Integer ranking) {
		this.comentario = comentario;
		this.ranking = ranking;
	}

	@Override
	public String toString() {
		return this.comentario + " - " + this.ranking.toString();
	}

}
