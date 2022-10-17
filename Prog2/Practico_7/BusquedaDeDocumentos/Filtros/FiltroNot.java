package BusquedaDeDocumentos.Filtros;

import BusquedaDeDocumentos.Documento;

public class FiltroNot extends Filtro{
	private Filtro f1;
	
	public FiltroNot(Filtro f1) {
		this.f1 = f1;
	}
	
	public boolean cumple(Documento doc) {
		return !f1.cumple(doc);
	}
}
