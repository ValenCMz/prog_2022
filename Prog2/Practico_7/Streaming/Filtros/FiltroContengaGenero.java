package Streaming.Filtros;

import Streaming.Pelicula;

public class FiltroContengaGenero extends Filtro{
	private String generoBuscado;
	
	public FiltroContengaGenero(String generoBuscado) {
		this.generoBuscado= generoBuscado;
	}
	
	public boolean cumple(Pelicula pelicula) {
		return pelicula.tieneGenero(generoBuscado);
	}
}
