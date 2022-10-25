package Vivero.Filtros;

import Vivero.Planta;

public class FiltroPorInterior extends Filtro{

	public boolean cumple(Planta planta) {
		return planta.isInterior();
	}
	
}
