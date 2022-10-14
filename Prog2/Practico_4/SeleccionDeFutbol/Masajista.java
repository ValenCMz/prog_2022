package SeleccionDeFutbol;

import java.time.LocalDate;

public class Masajista extends Integrante{
	private String titulo;
	private int aniosExperiencia;
	
	public Masajista(String nombre, String apellido, int nroPasaporte, LocalDate fechaNacimiento, String titulo, int aniosExperiencia, String estado) {
		super(nombre, apellido, nroPasaporte, fechaNacimiento, estado);
		this.aniosExperiencia = aniosExperiencia;
		this.titulo = titulo;
	}
	
	
}
