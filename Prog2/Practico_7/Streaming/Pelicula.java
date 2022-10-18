package Streaming;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Pelicula {
	private String titulo;
	private String sipnosis;
	private ArrayList<String>generos;
	private String director;
	private ArrayList<String>actores;
	private LocalDate anioEstreno;
	private LocalTime duracion;
	private int edadMinima;
	
	public Pelicula(String titulo, String sipnosis, ArrayList<String> generos, String director,
			ArrayList<String> actores, LocalDate anioEstreno, LocalTime duracion, int edadMinima) {
		this.titulo = titulo;
		this.sipnosis = sipnosis;
		this.generos = generos;
		this.director = director;
		this.actores = actores;
		this.anioEstreno = anioEstreno;
		this.duracion = duracion;
		this.edadMinima = edadMinima;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getSipnosis() {
		return sipnosis;
	}

	public ArrayList<String> getGeneros() {
		return generos;
	}

	public String getDirector() {
		return director;
	}

	public ArrayList<String> getActores() {
		return actores;
	}

	public LocalDate getAnioEstreno() {
		return anioEstreno;
	}

	public LocalTime getDuracion() {
		return duracion;
	}

	public int getEdadMinima() {
		return edadMinima;
	}
	
	public boolean tieneGenero(String genero) {
		return this.generos.contains(genero);
	}
	
	public boolean tieneActor(String actor) {
		return this.actores.contains(actor);
	}
	
	
}
