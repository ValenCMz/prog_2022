package CandyCrush.Filtros;

import CandyCrush.Ficha;

public class FiltroPorMinPoderDeDestruccion extends Filtro{
	private int minPoderDeDestruccion;
	
	public FiltroPorMinPoderDeDestruccion(int minPoderDeDestruccion) {
		this.minPoderDeDestruccion = minPoderDeDestruccion;
	}
	
	public boolean cumple(Ficha ficha) {
		return ficha.getPoderDeDestruccion()>this.minPoderDeDestruccion;
	}
}
