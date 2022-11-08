package Bazar.Filtros;

import Bazar.Elemento;

public class FiltroCategoria extends Filtro{
	private String categoriaBuscada;
	public FiltroCategoria(String cat) {
		this.categoriaBuscada = cat;
	}
	
	@Override
	public boolean cumple(Elemento e) {
		return e.tieneCategoria(categoriaBuscada);//Consultar por este filtro
	}

}
