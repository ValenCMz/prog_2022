package Parcial_28_10_2021.Filtros;

import Parcial_28_10_2021.Elemento;

public class FiltroOrigen extends Filtro{
	private String origen;
	
	public FiltroOrigen(String origen) {
		this.origen = origen;
	}
	
	public boolean cumple(Elemento e) {
		return e.getCiudadOrigen().equals(origen);
	}

}