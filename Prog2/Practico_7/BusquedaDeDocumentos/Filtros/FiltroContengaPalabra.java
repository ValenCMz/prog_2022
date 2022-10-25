package BusquedaDeDocumentos.Filtros;

import BusquedaDeDocumentos.Documento;

public class FiltroContengaPalabra extends Filtro{
	private String contengaPalabra;
	
	public FiltroContengaPalabra(String contengaPalabra) {
		this.contengaPalabra = contengaPalabra;
	}
	
	public boolean cumple(Documento doc) {
		return doc.getTitulo().contains(contengaPalabra);
	}
	
}
