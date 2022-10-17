package BusquedaDeDocumentos;

import java.util.ArrayList;

import BusquedaDeDocumentos.Filtros.Filtro;

public class Historiador {
	private ArrayList<Documento>documentos;
	
	public Historiador() {
		this.documentos = new ArrayList<>();
	}
	
	public ArrayList<Documento> buscar(Filtro filtro){
		ArrayList<Documento>documentosCumple = new ArrayList<>();
		for(Documento documento:documentos) {
			if(filtro.cumple(documento)) {
				documentosCumple.add(documento);
			}
		}
		return documentosCumple;
	}
}
