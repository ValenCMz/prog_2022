package BusquedaDeDocumentos.Filtros;

import BusquedaDeDocumentos.Documento;

public abstract class Filtro {
	public abstract boolean cumple(Documento documento);
}
