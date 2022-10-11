package Filtro;

import java.time.LocalDate;

import Tema1.Vendedor;

public class FiltroPorGanancias extends Filtro{
	private double gananciaBuscada;
	
	public FiltroPorGanancias(double gananciaBuscada, LocalDate inicio, LocalDate fin) {
		super(inicio,fin);
		this.gananciaBuscada = gananciaBuscada;
	}
	
//	● que generaron a la empresa ganancias por más de $100.000
	public boolean cumple(Vendedor vendedor) {
		return vendedor.gananciasTotales()>this.gananciaBuscada;
	}
	
}
