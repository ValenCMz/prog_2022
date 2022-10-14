package SistemaDeAlquiler;

//*Puede ser alquilada si hay copias aun disponibles

public class Pelicula extends Item{
	private String infoFilmografica;
	private int cantCopias;
	
	public Pelicula(String nombre, String id, int fechaLimite, int fechaInicio, String infoFilmografica,
			int cantCopias) {
		super(nombre, id, fechaLimite, fechaInicio);
		this.infoFilmografica = infoFilmografica;
		this.cantCopias = cantCopias;
	}
		
	public int getCantCopias() {
		return cantCopias;
	}

	public void setCantCopias(int cantCopias) {
		this.cantCopias = cantCopias;
	}

	//puede ser alquilada si hay copias disponibles
		//Podria hacer un array de copas y preguntar si esta vacio?
	public boolean sePuedeAlquilar() {
		return this.getCantCopias() > 0;
	}
	
	public void actualizar() {
		this.cantCopias--;
	}
	
}
