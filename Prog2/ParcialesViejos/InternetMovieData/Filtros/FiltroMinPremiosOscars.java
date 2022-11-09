package InternetMovieData.Filtros;

import InternetMovieData.Pelicula;

public class FiltroMinPremiosOscars extends Filtro{
	private int min;
	
	public FiltroMinPremiosOscars(int min) {
		this.min = min;
	}
	
	@Override
	public boolean cumple(Pelicula p) {
		return p.getCantOscars()>min;
	}

}
