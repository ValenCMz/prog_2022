package Filtro;

import java.time.LocalDate;

import Tema1.ProductoVendido;
import Tema1.Vendedor;

public abstract class Filtro {
	private LocalDate inicio;
	private LocalDate fin;
	
	public Filtro(LocalDate inicio, LocalDate fin) {
		this.inicio = inicio;
		this.fin = fin;
	}
	
	public LocalDate getInicio() {
		return inicio;
	}

	public LocalDate getFin() {
		return fin;
	}

	public abstract boolean cumple(Vendedor v);
}
