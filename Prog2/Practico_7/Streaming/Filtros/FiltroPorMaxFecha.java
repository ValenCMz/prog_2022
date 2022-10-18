package Streaming.Filtros;

import java.time.LocalDate;

import Streaming.Pelicula;

public class FiltroPorMaxFecha extends Filtro {
	private LocalDate maxFecha;
	
	public FiltroPorMaxFecha(LocalDate maxFecha) {
		this.maxFecha= maxFecha;
	}
	
	public boolean cumple(Pelicula pelicula) {
		
		return pelicula.getAnioEstreno().getYear()<this.maxFecha.getYear();
	}
}
