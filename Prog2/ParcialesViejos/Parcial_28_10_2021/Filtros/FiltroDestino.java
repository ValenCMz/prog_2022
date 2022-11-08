package Parcial_28_10_2021.Filtros;

import Parcial_28_10_2021.Elemento;

public class FiltroDestino extends Filtro{
	private String destino;
	
	public FiltroDestino(String destino) {
		this.destino = destino;
	}
	
	public boolean cumple(Elemento e) {
		return e.getCiudadDestino().equals(destino);
	}

}
