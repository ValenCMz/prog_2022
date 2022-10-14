package SeleccionDeFutbol;

import java.time.LocalDate;

public class Futbolista extends Integrante{
	private int posicion;
	private String pieHabil;
	private int cantGoles;
	
	public Futbolista(String nombre, String apellido, int nroPasaporte, LocalDate fechaNacimiento, int posicion, String pieHabil, int cantGoles, String estado) {
		super(nombre, apellido, nroPasaporte, fechaNacimiento, estado);
		this.posicion= posicion;
		this.pieHabil= pieHabil;
		this.cantGoles = cantGoles;
	}
	
	
}
	