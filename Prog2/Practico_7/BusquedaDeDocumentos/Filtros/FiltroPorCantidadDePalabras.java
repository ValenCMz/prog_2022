package BusquedaDeDocumentos.Filtros;

import BusquedaDeDocumentos.Documento;

public class FiltroPorCantidadDePalabras extends Filtro{
	private int minPalabras;
	
	public FiltroPorCantidadDePalabras(int minPalabras) {
		this.minPalabras = minPalabras;
	}
	
	public boolean cumple(Documento doc) {
		return doc.getCantPalabras() > minPalabras;
	}
}
