package Parcialito.Filtros;

import Parcialito.Producto;

//Todos los productos de nombre “Mouse”
public class FiltroPorNombre extends Filtro {
	private String nombreBuscado;
	
	public FiltroPorNombre(String nombreBuscado) {
		this.nombreBuscado = nombreBuscado;
	}
	
	//getNombre() asumo q esta resuelto en la figura1 aparece declarado
	public boolean cumple(Producto p) {
		return p.getNombre().equals(nombreBuscado);
	}
	
}
