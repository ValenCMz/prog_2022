package Parcialito.Filtros;

import Parcialito.Producto;

public class FiltroOr {
	private Filtro f1;
	private Filtro f2;
	
	public FiltroOr(Filtro f1, Filtro f2) {
		this.f1 = f1;
		this.f2 = f2;
	}
	
	public boolean cumple(Producto p) {
		return this.f1.cumple(p) || this.f2.cumple(p);
	}
}
