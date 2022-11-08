package Bazar.Filtros;

import Bazar.Elemento;

public class FiltroPesoMin extends Filtro{
	private double min;
	
	public FiltroPesoMin(double min) {
		this.min = min;
	}

	@Override
	public boolean cumple(Elemento e) {
		return e.getPeso()>min;
	}
	
}
