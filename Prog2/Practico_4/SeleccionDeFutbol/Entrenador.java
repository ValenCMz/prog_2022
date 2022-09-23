package SeleccionDeFutbol;

import java.time.LocalDate;

public class Entrenador extends Integrante{
	private int idFederacion;

	public Entrenador(String nombre, String apellido, int nroPasaporte, LocalDate fechaNacimiento, int idFederacion, String estado) {
		super(nombre, apellido, nroPasaporte, fechaNacimiento, estado);
		this.idFederacion = idFederacion;
	}
	
	
	
}
