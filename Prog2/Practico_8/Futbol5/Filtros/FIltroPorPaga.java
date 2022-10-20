package Futbol5.Filtros;

import Futbol5.Socio;

public class FIltroPorPaga extends Filtro{
	private int minPago;
	
	public FIltroPorPaga(int minPago) {
		this.minPago = minPago;
	}


	@Override
	public boolean cumple(Socio socio) {
		return socio.esMayor(minPago);
	}

}
