package Streaming.Filtros;

import Streaming.Pelicula;

public class FiltroPorDirector extends Filtro{
	private String directorBuscado;
	
	public FiltroPorDirector(String directorBuscado) {
		this.directorBuscado= directorBuscado;
	}
	
	public boolean cumple(Pelicula pelicula) {
		return pelicula.getDirector().equals(directorBuscado);
	}
}
