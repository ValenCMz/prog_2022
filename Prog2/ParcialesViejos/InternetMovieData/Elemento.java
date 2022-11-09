package InternetMovieData;

import java.util.ArrayList;

import InternetMovieData.Filtros.Filtro;

public abstract class Elemento {
	private String titulo;
	
	public Elemento(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return this.titulo;
	}
	
	public abstract int getCantOscars();
	public abstract ArrayList<Actor>getActores();
	public abstract int getPuntaje();
	public abstract ArrayList<Pelicula>buscar(Filtro f);
	public abstract Elemento copiar(Filtro f);
}
