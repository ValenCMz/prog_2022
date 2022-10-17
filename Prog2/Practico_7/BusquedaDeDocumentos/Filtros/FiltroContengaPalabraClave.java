package BusquedaDeDocumentos.Filtros;

import BusquedaDeDocumentos.Documento;

public class FiltroContengaPalabraClave extends Filtro{
	private String palabraClave;
	
	public FiltroContengaPalabraClave(String palabraClave) {
		this.palabraClave = palabraClave;
	}
	
	public boolean cumple(Documento doc) {
		return doc.tienePalabraClave(palabraClave);
	}
}
