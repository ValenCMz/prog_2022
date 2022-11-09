package InternetMovieData;

import java.util.ArrayList;

import InternetMovieData.Filtros.Filtro;

public class Saga extends Elemento{
	private ArrayList<Elemento>elementos;
	
	public Saga(String titulo) {
		super(titulo);
		this.elementos = new ArrayList<>();
	}

	@Override
	public int getCantOscars() {
		int sum = 0;
		for(Elemento e: elementos)
			sum+= e.getCantOscars();
		return sum;
	}

	@Override
	public ArrayList<Actor> getActores() {
		ArrayList<Actor>toReturn = new ArrayList<>();
		for(Elemento e:elementos) {
			ArrayList<Actor>aux=e.getActores();
			for(Actor a:aux) {
				if(!toReturn.contains(a)) {
					toReturn.add(a);
				}
			}
		}
		return toReturn;
	}

	@Override
	public int getPuntaje() {
		int sum = 0;
		for(Elemento e:elementos) {
			sum+=e.getPuntaje();
		}
		return sum/elementos.size();
	}

	@Override
	public ArrayList<Pelicula> buscar(Filtro f) {
		ArrayList<Pelicula>peliculas = new ArrayList<>();
		for(Elemento e:elementos) {
			peliculas.addAll(e.buscar(f));
		}
		return peliculas;
	}

	@Override
	public Elemento copiar(Filtro f) {
		Saga sagaCopia = new Saga(this.getTitulo());
		for(Elemento e:elementos) {
			Elemento aux = e.copiar(f);
			if(aux!=null) {
				sagaCopia.add(aux);
			}
		}
		if(sagaCopia.estaVacio()) {
			return null;
		}else {
			return sagaCopia;
		}
		
	}

	public boolean estaVacio() {
		return this.elementos.isEmpty();
	}

	public void add(Elemento aux) {
		this.elementos.add(aux);
	}
	
	
	
	

}
