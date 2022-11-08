package Recuperatorio_tema1.Filtros;

import Recuperatorio_tema1.Habitacion;

public class FiltroMinMetros extends Filtro{
	private int min;
	
	public FiltroMinMetros(int min) {
		this.min = min;
	}
	
	public boolean cumple(Habitacion h) {
		return h.getMestrosCuadrados()>min;
	};

}
