package Streaming;

import java.util.ArrayList;

import Streaming.Filtros.Filtro;

public class PlataformaStreaming {
	private ArrayList<Pelicula>peliculas;
	private Filtro filtroRentabilidad;
	
	public PlataformaStreaming(Filtro filtroRentabilidad) {
		this.peliculas = new ArrayList<Pelicula>();
		this.filtroRentabilidad = filtroRentabilidad;
	}
	
	public void setFiltroRetabilidad(Filtro filtroRentabilidad) {
		this.filtroRentabilidad = filtroRentabilidad;
	}
	
	public ArrayList<Pelicula> buscar(Filtro f1){
		ArrayList<Pelicula>peliculasCumple=new ArrayList<>();
		for(Pelicula p: peliculas) {
			if(f1.cumple(p)) {
				peliculasCumple.add(p);
			}
		}
		return peliculasCumple;
	}
	
	public boolean peliculaRentable(Pelicula pelicula) {
		return this.filtroRentabilidad.cumple(pelicula);
	}
}
