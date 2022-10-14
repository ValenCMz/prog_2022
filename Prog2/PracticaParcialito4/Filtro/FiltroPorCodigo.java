package Filtro;

import java.time.LocalDate;

import Tema1.Vendedor;

public class FiltroPorCodigo extends Filtro{
	
	private String codigoBuscado;
	
	public FiltroPorCodigo(String codigoBuscado, LocalDate inicio, LocalDate fin ) {
		super(inicio,fin);
		this.codigoBuscado = codigoBuscado;
	}

	public boolean cumple(Vendedor vendedor) {
		return vendedor.vendio(codigoBuscado);
	}
	
}
