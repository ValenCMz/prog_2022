package Vivero.Filtros;

import Vivero.Planta;

public class FiltroPorMinimoReqAgua extends Filtro{
private int minReq;
	
	public FiltroPorMinimoReqAgua(int minReq) {
		this.minReq = minReq;
	}
	
	public boolean cumple(Planta planta) {
		return planta.getReqAgua()>this.minReq;
	}
}
