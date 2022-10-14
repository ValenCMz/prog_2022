package Parcialito.Filtros;

import Parcialito.Producto;

//Todos los productos de precio mayor a 556 pesos
public class FiltroPorPrecio extends Filtro{
	private double precioMin;
	
	public FiltroPorPrecio(double precioMin) {
		this.precioMin = precioMin;
	}
	
	//getPrecio() asumo q esta resuelto en la figura1 aparece declarado
	public boolean cumple(Producto p) {
		return p.getPrecio > this.precioMin;
	}
}
