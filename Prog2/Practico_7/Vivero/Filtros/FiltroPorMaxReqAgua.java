package Vivero.Filtros;

import Vivero.Planta;

public class FiltroPorMaxReqAgua extends Filtro{
	private int maxReq;
	
	public FiltroPorMaxReqAgua(int maxReq) {
		this.maxReq = maxReq;
	}
	
	public boolean cumple(Planta planta) {
		return planta.getReqAgua()<this.maxReq;
	}
}
