package Filtro;

import java.time.LocalDate;

import Tema1.Vendedor;

public class FiltroNot extends Filtro{
	private Filtro filtro;
	
	public FiltroNot(LocalDate inicio, LocalDate fin, Filtro filtro) {
		super(inicio,fin);
		this.filtro = filtro;
	}
	
	public boolean cumple(Vendedor v) {
		return ! this.filtro.cumple(v);
	}
}
