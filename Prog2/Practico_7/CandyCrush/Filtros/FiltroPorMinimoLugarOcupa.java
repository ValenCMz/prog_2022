package CandyCrush.Filtros;

import CandyCrush.Ficha;

public class FiltroPorMinimoLugarOcupa extends Filtro{
	private int minLugarOcupa;
	
	public FiltroPorMinimoLugarOcupa(int minLugarOcupa) {
		this.minLugarOcupa = minLugarOcupa;
	}
	
	public boolean cumple(Ficha ficha) {
		return ficha.getLugarOcupa()>this.minLugarOcupa;
	}
}
