package Filtro;

import java.time.LocalDate;

import Tema1.Vendedor;

public class FiltroOr extends Filtro {
	private Filtro f1;
	private Filtro f2;
	
	public FiltroOr(LocalDate inicio, LocalDate fin, Filtro f1, Filtro f2) {
		super(inicio,fin);
		this.f1 = f1;
		this.f2 = f2;
	}
	
	public boolean cumple(Vendedor v) {
		return this.f1.cumple(v)||this.f2.cumple(v);
	}
}
