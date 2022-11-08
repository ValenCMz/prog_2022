package Parcial_28_10_2021.Filtros;

import Parcial_28_10_2021.Elemento;

public class FiltroCostoMin {
	private int min;
	
	public FiltroCostoMin(int min) {
		this.min=min;	
	}
	
	public boolean cumple(Elemento e) {
		return e.getCosto()>min;
	}
}
