package Vivero.Filtros;

import Vivero.Planta;

public class FiltroPorMaxReqSol extends Filtro{
	private int maxReq;
	
	public FiltroPorMaxReqSol(int maxReq) {
		this.maxReq = maxReq;
	}
	
	public boolean cumple(Planta planta) {
		return planta.getReqSol()<this.maxReq;
	}
}
