package Tema1.comparadores;

import java.time.LocalDate;
import java.util.Comparator;

import Tema1.Vendedor;

public class ComparadorPorRatioVentas extends ComparadorVendedor{
	private LocalDate inicio;
	private LocalDate fin;

	public ComparadorPorRatioVentas(LocalDate inicio, LocalDate fin) {
		super(inicio,fin);
	}
	
	
	public int compare(Vendedor o1, Vendedor o2) {
		if(o1.ratioVentas(this.getInicio(), this.getFin())>o2.ratioVentas(this.getInicio(), this.getFin())) {
			return 1;
		}
		else if(o1.ratioVentas(this.getInicio(), this.getFin())<o2.ratioVentas(this.getInicio(), this.getFin())) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
