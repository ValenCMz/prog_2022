package SistemaDeArchivos.Filtros;

import SistemaDeArchivos.Elemento;

public class FiltroPorNombre extends Filtro{
	private String nombreBuscado;
	
	public FiltroPorNombre(String nombreBuscado) {
		this.nombreBuscado = nombreBuscado;
	}
	
	public boolean cumple(Elemento elemento) {
		return elemento.tieneNombre(nombreBuscado);
	}
}
