package Avicola;

import java.time.LocalDate;

public class ProductoCongeladoAgua extends ProductoCongelado {
	private double salinidadDelAgua;

	public ProductoCongeladoAgua(LocalDate fechaVencimiento, int nroLote, int codOrgDeSupervAlimen,
			LocalDate fechaEnvasado, double tempMantenimiento, String granjaOrigen, double salinidadDelAgua, String nombre) {
		super(fechaVencimiento, nroLote, codOrgDeSupervAlimen, fechaEnvasado, tempMantenimiento,
				granjaOrigen, nombre);
		this.salinidadDelAgua = salinidadDelAgua;
	}

	public double getSalinidadDelAgua() {
		return salinidadDelAgua;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\n Salinidad del Agua: " + this.getSalinidadDelAgua();
	}
	
	
}
