package Bazar.Filtros;

import Bazar.Elemento;

public class FiltroPrecioMax extends Filtro{
	private double max;
	
	public FiltroPrecioMax(double max) {
		this.max = max;
	}
	
	@Override
	public boolean cumple(Elemento e) {
		return e.getPrecio()<max;
	}
	
}
