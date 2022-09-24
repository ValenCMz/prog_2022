package Avicola;

import java.time.LocalDate;

public class Producto {
	private String nombre;
	private LocalDate fechaVencimiento;
	private int nroLote;
	private String granjaOrigen;
	private LocalDate fechaEnvasado;

	public Producto(LocalDate fechaVencimiento, int nroLote, String granjaOrigen, String nombre, LocalDate fechaEnvasado) {
		this.fechaVencimiento = fechaVencimiento;
		this.nroLote = nroLote;
		this.granjaOrigen = granjaOrigen;
		this.nombre = nombre;
		this.fechaEnvasado = fechaEnvasado;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public int getNroLote() {
		return nroLote;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNroLote(int nroLote) {
		this.nroLote = nroLote;
	}

	public String getGranjaOrigen() {
		return granjaOrigen;
	}

	public void setGranjaOrigen(String granjaOrigen) {
		this.granjaOrigen = granjaOrigen;
	}
	
	
	
	public LocalDate getFechaEnvasado() {
		return fechaEnvasado;
	}

	@Override
	public String toString() {
		return "Fecha de vencimiento: " +  this.getFechaVencimiento() + "\n Fecha de envasado: "+ this.getFechaEnvasado() + "\n Numero de lote: " + this.getNroLote() + "\n Granja de origen: " + this.getGranjaOrigen();
	}


	
	
}
