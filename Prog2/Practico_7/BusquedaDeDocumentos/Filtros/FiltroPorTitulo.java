package BusquedaDeDocumentos.Filtros;

import BusquedaDeDocumentos.Documento;

public class FiltroPorTitulo extends Filtro{
	private String tituloBuscado;
	
	public FiltroPorTitulo(String tituloBuscado) {
		this.tituloBuscado = tituloBuscado;
	}
	
	public boolean cumple(Documento doc) {
		return doc.getTitulo().equals(tituloBuscado);
	}
}
