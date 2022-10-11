package Tema1.comparadores;

import java.time.LocalDate;
import java.util.Comparator;

import Tema1.Vendedor;

public class ComparadorPorVentaTotal extends ComparadorVendedor{

	public ComparadorPorVentaTotal(LocalDate inicio, LocalDate fin) {
		super(inicio,fin);
	}
	
	@Override
	public int compare(Vendedor o1, Vendedor o2) {
		if(o1.cantVentasTotales(this.getInicio(), this.getFin())>o2.cantVentasTotales(this.getInicio(), this.getFin())) {
			return 1;
		}
		else if(o1.cantVentasTotales(this.getInicio(), this.getFin())<o2.cantVentasTotales(this.getInicio(), this.getFin())) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	
}
