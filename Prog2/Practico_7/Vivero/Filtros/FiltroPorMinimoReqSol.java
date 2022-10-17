package Vivero.Filtros;

import Vivero.Planta;

public class FiltroPorMinimoReqSol extends Filtro{
	private int minReq;
	
	public FiltroPorMinimoReqSol(int minReq) {
		this.minReq = minReq;
	}
	
	public boolean cumple(Planta planta) {
		return planta.getReqSol()>this.minReq;
	}
}
