package Avicola;

import java.time.LocalDate;

public class ProductoRefrigerado extends Producto{
	private int codOrgDeSupervAlimen;
	private double tempMantenimiento;
	
	public ProductoRefrigerado(LocalDate fechaVencimiento, int nroLote, int codOrgDeSupervAlimen,
			LocalDate fechaEnvasado, double tempMantenimiento, String granjaOrigen, String nombre) {
		super(fechaVencimiento, nroLote, granjaOrigen, nombre, fechaEnvasado);
		this.codOrgDeSupervAlimen = codOrgDeSupervAlimen;
		this.tempMantenimiento = tempMantenimiento;
	}

	public int getCodOrgDeSupervAlimen() {
		return codOrgDeSupervAlimen;
	}

	public double getTempMantenimiento() {
		return tempMantenimiento;
	}
	
	@Override
	public String toString() {
		return super.toString() + " \n Codigo Organismo De Supervicencia Alimentaria: " + this.getCodOrgDeSupervAlimen() + "\n Temperatura de mantenimiento" + this.getTempMantenimiento();
	}
	
}
