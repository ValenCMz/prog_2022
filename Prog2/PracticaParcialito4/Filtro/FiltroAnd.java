package Filtro;

import java.time.LocalDate;

import Tema1.Vendedor;

public class FiltroAnd extends Filtro{

	private Filtro f1;
	private Filtro f2;
	
	public FiltroAnd(LocalDate inicio, LocalDate fin, Filtro f1, Filtro f2) {
		super(inicio, fin);
		this.f1 = f1;
		this.f2 =f2;
	}

	@Override
	public boolean cumple(Vendedor v) {
		return this.f1.cumple(v) && this.f2.cumple(v);
	}
	
	
}
