package Filtro;

import java.time.LocalDate;

import Tema1.Vendedor;

public class FiltroCantidadVendidos extends Filtro {
	private int cantidadMinima;
	
	public FiltroCantidadVendidos(int cantidadMinima, LocalDate inicio, LocalDate fin) {
		super(inicio, fin);
		this.cantidadMinima = cantidadMinima;
	}
	
	//donde pongo lo del periodo? ahora lo arreglo viendo el video je
//	● que vendieron más de 100 productos en un período dado
	public boolean cumple(Vendedor vendedor) {
		return vendedor.cantProductosVendidos(this.getInicio(),this.getFin())>this.cantidadMinima;
	}
	
}
