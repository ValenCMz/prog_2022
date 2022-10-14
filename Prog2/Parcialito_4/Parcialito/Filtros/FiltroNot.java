package Parcialito.Filtros;

import Parcialito.Producto;

public class FiltroNot {
	private Filtro filtro;
	
	public FiltroNot(Filtro filtro) {
		this.filtro = filtro;
	}
	
	public boolean cumple(Producto p) {
		return !this.filtro.cumple(p);
	}
}
