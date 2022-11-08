package Parcial_28_10_2021.Filtros;

import Parcial_28_10_2021.Elemento;

public class FiltroNot {
	private Filtro filtro;
	
	public FiltroNot(Filtro filtro) {
		this.filtro = filtro;
	}
	
	public boolean cumple(Elemento e) {
		return !this.filtro.cumple(e);
	}
}
