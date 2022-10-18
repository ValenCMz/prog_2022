package Streaming.Filtros;

import Streaming.Pelicula;

public class FiltroContengaTitulo extends Filtro{
	private String tituloBuscado;
	
	public FiltroContengaTitulo(String tituloBuscado) {
		this.tituloBuscado= tituloBuscado;
	}
	
	public boolean cumple(Pelicula pelicula) {
		return pelicula.getTitulo().contains(tituloBuscado);
	}
}
