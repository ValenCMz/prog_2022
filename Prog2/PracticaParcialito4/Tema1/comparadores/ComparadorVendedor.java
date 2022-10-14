package Tema1.comparadores;

import java.time.LocalDate;
import java.util.Comparator;

import Tema1.Vendedor;

public abstract class ComparadorVendedor implements Comparator<Vendedor>{
	private LocalDate inicio;
	private LocalDate fin;

	public ComparadorVendedor(LocalDate inicio, LocalDate fin) {
		this.inicio = inicio;
		this.fin = fin;
	}
	
	public LocalDate getInicio() {
		return this.inicio;
	}
	
	public LocalDate getFin() {
		return this.fin;
	}
	
}
