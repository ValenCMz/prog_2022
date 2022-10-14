package Parcialito.Filtros;

import Parcialito.Producto;

//Todos los productos que tengan como componente “memoria ram”
public class FiltroPorComponente extends Filtro {
	private String componenteBuscado;
	
	public FiltroPorComponente(String componenteBuscado) {
		this.componenteBuscado = componenteBuscado;
	}
	
	public boolean cumple(Producto p) {
		return p.tieneComponente(componenteBuscado);
	}

}

