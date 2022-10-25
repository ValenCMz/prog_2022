package Streaming.Filtros;

import java.time.LocalTime;

import Streaming.Pelicula;

public class FiltroPorMaxDuracion extends Filtro{
private LocalTime maxDuracion;
	
	public FiltroPorMaxDuracion(LocalTime maxDuracion) {
		this.maxDuracion= maxDuracion;
	}
	
	public boolean cumple(Pelicula pelicula) {
		return pelicula.getDuracion().getMinute() < this.maxDuracion.getMinute();
	}
}
