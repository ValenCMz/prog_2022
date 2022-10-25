package Futbol5.Filtros;

import Futbol5.Socio;

public class FiltroEdad extends Filtro{
	private int edadMax;
	
	public FiltroEdad(int edadMax) {
		this.edadMax = edadMax;
	}
	
	public boolean cumple(Socio socio) {
		return socio.getEdad()<edadMax;
	}
}
