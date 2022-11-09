package InternetMovieData;

import java.time.LocalDate;
import java.util.ArrayList;

import InternetMovieData.Filtros.Filtro;

public class Pelicula extends Elemento{
	private int puntaje;
	private LocalDate anioLanzamiento;
	private int cantOscars;
	private ArrayList<Actor>actores;
	
	public Pelicula(String titulo,int puntaje, LocalDate anio, int cantOscars) {
		super(titulo);
		this.puntaje = puntaje;
		this.anioLanzamiento = anio;
		this.cantOscars = cantOscars;
		this.actores = new ArrayList<>();
	}
	
	public int getCantOscars() {
		return this.cantOscars;
	}
	
	public ArrayList<Actor>getActores(){
		ArrayList<Actor>actoresReturn = new ArrayList<>();
		for(Actor a: actores){
			if(!actoresReturn.contains(a)) {
				actoresReturn.add(a);
			}
		}
		return actoresReturn;
	}

	@Override
	public int getPuntaje() {
		return this.puntaje;
	}

	@Override
	public ArrayList<Pelicula> buscar(Filtro f) {
		ArrayList<Pelicula>peliculas = new ArrayList<>();
		if(f.cumple(this)) {
			peliculas.add(this);
		}
		return peliculas;
	}

	@Override
	public Elemento copiar(Filtro f) {
		Pelicula copia = null;
		if(f.cumple(this)) {
			copia = new Pelicula(this.getTitulo(), this.getPuntaje(), this.getAnioLanzamiento(), this.getCantOscars());
			for(Actor a:actores) {
				copia.addActor(a);
			}
		}
		return copia;
	}

	public void addActor(Actor a) {
		if(!actores.contains(a)) {
			actores.add(a);
		}
	}

	public LocalDate getAnioLanzamiento() {
		return anioLanzamiento;
	}
	
	public boolean tieneActor(Actor a) {
		return this.actores.contains(a);
	}
	
	public int getCantActores() {
		return this.actores.size();
	}
	
	
}
