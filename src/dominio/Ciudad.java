package dominio;

import estructuras.ILista;
import estructuras.ListaSEIni;

public class Ciudad {

	// ***** Atributos *****//

	private String nomCiudad;
	private ILista hoteles = new ListaSEIni();

	// ***** Métodos de acceso y modificación *****//

	public String getNomCiudad() {
		return this.nomCiudad;
	}

	public void setNomCiudad(String nomCiudad) {
		this.nomCiudad = nomCiudad;
	}

	public ILista getHoteles() {
		return this.hoteles;
	}

	public void setHoteles(Hotel hotel) {
		this.hoteles.insertar(hotel);
	}

	// ***** Constructor ***** //

	public Ciudad(String nomCiudad) {

		this.nomCiudad = nomCiudad;

	}

	// ***** Métodos ***** //

	// pre: el hotel no existe en ILista hoteles
	// pos: el hotel es agregado a ILista hoteles
	public void ingresarHotel(String nombre, String ciudad) {
		Hotel nuevoH = new Hotel(nombre, this.nomCiudad);
		this.hoteles.insertar(nuevoH);
	}

	// pre: el hotel existe en ILista hoteles
	// pos: el hotel es borrado de ILista hoteles
	public void borrarHotel(String nombre, String ciudad) {
		Hotel nuevoH = new Hotel(nombre, this.nomCiudad);
		this.hoteles.borrar(nuevoH);
	}

	// pre: el hotel no existe en ILista hoteles
	// pos: el hotel es agregado a ILista hoteles
	// public void ingresarHotelH(String hotel) {
	// Hotel nuevoH = new Hotel(hotel);
	// this.hoteles.insertar(nuevoH);
	// }

	// pre: el hotel existe en ILista hoteles
	// pos: el hotel es borrado de ILista hoteles
	// public void borrarHotelH(String hotel) {
	// Hotel nuevoH = new Hotel(hotel);
	// this.hoteles.borrar(nuevoH);
	// }

	// ***** Sobreescritura ***** //

	@Override
	public boolean equals(Object obj) {

		boolean ret = true;

		if (this == obj) {
			ret = true;
		}

		if (obj == null) {
			ret = false;
		}

		if (getClass() != obj.getClass()) {
			ret = false;
		}

		Ciudad otra = (Ciudad) obj;

		if (this.nomCiudad != otra.nomCiudad) {
			ret = false;
		}

		return ret;
	}

	@Override
	public String toString() {
		return this.nomCiudad;
	}

}
