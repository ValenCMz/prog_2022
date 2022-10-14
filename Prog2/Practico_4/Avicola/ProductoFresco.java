package Avicola;

import java.time.LocalDate;

public class ProductoFresco extends Producto{
	
	public ProductoFresco(LocalDate fechaVencimiento, int nroLote, LocalDate fechaEnvasado,String granjaOrigen, String nombre){
		super(fechaVencimiento, nroLote, granjaOrigen, nombre, fechaEnvasado);		
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}
