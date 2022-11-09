package InternetMovieData.Filtros;

import InternetMovieData.Pelicula;

public class FiltroMinActores extends Filtro{
	private int min;
	
	public FiltroMinActores(int min) {
		this.min = min;
	}
	
	@Override
	public boolean cumple(Pelicula p) {
		return p.getCantActores()>min;
	}
}
