package BusquedaDeDocumentos.Filtros;

import BusquedaDeDocumentos.Documento;

public class FiltroPorAutor extends Filtro{
	private String autorBuscado;
	
	public FiltroPorAutor(String autorBuscado) {
		this.autorBuscado = autorBuscado;
	}
	
	public boolean cumple(Documento doc) {
		return doc.tieneAutor(autorBuscado);
	}
}
