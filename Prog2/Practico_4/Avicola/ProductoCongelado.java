package Avicola;

import java.time.LocalDate;

public class ProductoCongelado extends ProductoRefrigerado{

	public ProductoCongelado(LocalDate fechaVencimiento, int nroLote, int codOrgDeSupervAlimen,
			LocalDate fechaEnvasado, double tempMantenimiento, String granjaOrigen, String nombre) {
		super(fechaVencimiento, nroLote, codOrgDeSupervAlimen, fechaEnvasado, tempMantenimiento,
				granjaOrigen, nombre);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
