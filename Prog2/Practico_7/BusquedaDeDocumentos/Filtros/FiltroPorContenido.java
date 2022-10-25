package BusquedaDeDocumentos.Filtros;

import BusquedaDeDocumentos.Documento;

public class FiltroPorContenido extends Filtro {
private String palabraBuscada;
	
	public FiltroPorContenido(String palabraBuscada) {
		this.palabraBuscada = palabraBuscada;
	}
	
	public boolean cumple(Documento doc) {
		return doc.getContenido().contains(palabraBuscada);
	}
}
