package InternetMovieData;

import java.util.ArrayList;

import InternetMovieData.Filtros.Filtro;

public class SagaSponsoreada extends Saga{
	private Pelicula p1;
	
	public SagaSponsoreada(String titulo, Pelicula p1) {
		super(titulo);
		this.p1 = p1;
	}

	public ArrayList<Pelicula>buscar(Filtro f){
		ArrayList<Pelicula>pelicula=super.buscar(f);
		pelicula.add(p1);
		return pelicula;
	}
}
