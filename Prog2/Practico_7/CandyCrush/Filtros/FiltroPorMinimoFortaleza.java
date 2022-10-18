package CandyCrush.Filtros;

import CandyCrush.Ficha;

public class FiltroPorMinimoFortaleza extends Filtro{
	private int minFortaleza;
	
	public FiltroPorMinimoFortaleza(int minFortaleza) {
		this.minFortaleza = minFortaleza;
	}
	
	public boolean cumple(Ficha ficha) {
		return ficha.getFortaleza()>this.minFortaleza;
	}
}
