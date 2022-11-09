package InternetMovieData.Filtros;

import InternetMovieData.Actor;
import InternetMovieData.Pelicula;

public class FiltroActor extends Filtro{
	private Actor actorBuscado;
	
	public FiltroActor(Actor actorBuscado) {
		this.actorBuscado = actorBuscado;
	}

	@Override
	public boolean cumple(Pelicula p) {
		return p.tieneActor(actorBuscado);
	}
}
