package Parcial_28_10_2021.Filtros;

import Parcial_28_10_2021.Elemento;

public class FiltroAnd extends Filtro{
	private Filtro f1;
	private Filtro f2;
	
	public FiltroAnd(Filtro f1, Filtro f2) {
		this.f1 = f1;
		this.f2 = f2;
	}
	
	public boolean cumple(Elemento e) {
		return this.f1.cumple(e) && this.f2.cumple(e);
	}
}
