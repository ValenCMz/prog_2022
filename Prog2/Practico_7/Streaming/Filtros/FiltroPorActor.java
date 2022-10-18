package Streaming.Filtros;

import Streaming.Pelicula;

public class FiltroPorActor extends Filtro{
	private String actorBuscado;
	
	public FiltroPorActor(String actorBuscado) {
		this.actorBuscado= actorBuscado;
	}
	
	public boolean cumple(Pelicula pelicula) {
		return pelicula.tieneActor(actorBuscado);
	}
}
