package Futbol5.Filtros;

import Futbol5.Socio;

public class FiltroCuotaImpaga extends Filtro{
	public boolean cumple(Socio socio) {
		return !socio.isPago();
	}
}
