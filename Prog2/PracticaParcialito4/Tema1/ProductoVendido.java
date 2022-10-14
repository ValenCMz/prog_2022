package Tema1;

import java.time.LocalDate;

public class ProductoVendido {
	private LocalDate fechaDeVenta;
	private String cod;
	private long dniComprador;
	private double precio;
	private int cantVendida;

	public ProductoVendido(LocalDate fechaDeVenta, String cod, long dniComprador, double precio, int cantVendida) {
		this.fechaDeVenta = fechaDeVenta;
		this.cod = cod;
		this.dniComprador = dniComprador;
		this.precio = precio;
		this.cantVendida = cantVendida;
	}
	
	//responsabiliadd del producto el saber su ganancia
	public double calcGanancia() {
		return this.getPrecio() * this.getCantVendida();
	}

	public LocalDate getFechaDeVenta() {
		return fechaDeVenta;
	}

	public String getCod() {
		return cod;
	}

	public long getDniComprador() {
		return dniComprador;
	}

	public double getPrecio() {
		return precio;
	}

	public int getCantVendida() {
		return cantVendida;
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			ProductoVendido p = (ProductoVendido)obj;
			return this.getCod()==(p.getCod());
		}
		catch(Exception e) {
			return false;
		}
	}
	
	
	
}
