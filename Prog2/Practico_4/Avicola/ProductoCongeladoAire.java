package Avicola;

import java.time.LocalDate;

public class ProductoCongeladoAire extends ProductoCongelado{
	private double porcNitrogeno;
	private double porcOxigeno;
	private double porcDioxidoCarbono;
	private double porVaporDeAgua;
	
	public ProductoCongeladoAire(LocalDate fechaVencimiento, int nroLote, int codOrgDeSupervAlimen,
			LocalDate fechaEnvasado, double tempMantenimiento, String granjaOrigen, double porcNitrogeno,
			double porcOxigeno, double porcDioxidoCarbono, double porVaporDeAgua, String nombre) {
		super(fechaVencimiento, nroLote, codOrgDeSupervAlimen, fechaEnvasado, tempMantenimiento,
				granjaOrigen, nombre);
		this.porcNitrogeno = porcNitrogeno;
		this.porcOxigeno = porcOxigeno;
		this.porcDioxidoCarbono = porcDioxidoCarbono;
		this.porVaporDeAgua = porVaporDeAgua;
	}

	public double getPorcNitrogeno() {
		return porcNitrogeno;
	}

	public double getPorcOxigeno() {
		return porcOxigeno;
	}

	public double getPorcDioxidoCarbono() {
		return porcDioxidoCarbono;
	}

	public double getPorVaporDeAgua() {
		return porVaporDeAgua;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n Porcentaje Nitrogeno: "+ this.getPorcNitrogeno() + "\n Porcentaje Oxigeno: " + this.getPorcOxigeno() + "\n Porcentaje Dioxido de carbono: " + this.getPorcDioxidoCarbono() + "\n Porcentaje Vapor de agua: " + this.getPorVaporDeAgua();
	}
	
}
