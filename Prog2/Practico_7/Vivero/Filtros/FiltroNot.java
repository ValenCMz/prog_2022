package Vivero.Filtros;

import Vivero.Planta;

public class FiltroNot extends Filtro{
	private Filtro f1;
	
	public FiltroNot (Filtro f1) {
		this.f1 = f1;
	}
	
	public boolean cumple(Planta planta) {
		return !f1.cumple(planta);
	}
}
