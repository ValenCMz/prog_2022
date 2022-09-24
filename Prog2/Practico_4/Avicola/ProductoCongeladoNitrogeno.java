package Avicola;

import java.time.LocalDate;

public class ProductoCongeladoNitrogeno extends ProductoCongelado{
	private String metodoCongelacion;
	private double tiempoExposicion;
	
	public ProductoCongeladoNitrogeno(LocalDate fechaVencimiento, int nroLote, int codOrgDeSupervAlimen,
			LocalDate fechaEnvasado, double tempMantenimiento, String granjaOrigen, String metodoCongelacion,
			double tiempoExposicion, String nombre) {
		super(fechaVencimiento, nroLote, codOrgDeSupervAlimen, fechaEnvasado, tempMantenimiento, granjaOrigen, nombre);
		this.metodoCongelacion = metodoCongelacion;
		this.tiempoExposicion = tiempoExposicion;
	}

	public String getMetodoCongelacion() {
		return metodoCongelacion;
	}

	public double getTiempoExposicion() {
		return tiempoExposicion;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n Metodo de congelacion: " + this.getMetodoCongelacion()+ "\n Tiempo de exposicion: " + this.getTiempoExposicion();
	}
	
}
