package RegistroEmpresa.PersonaAsociada;

public class Empleado extends PersonaAsociada{
	private int nroLegajo;
	private double sueldo;
	
	public Empleado(String cargoDeLaPersona, String nombre, String apellido, int edad, int nroLegajo, double sueldo) {
		super(cargoDeLaPersona, nombre, apellido, edad);
		this.nroLegajo = nroLegajo;
		this.sueldo = sueldo;
	}
	
	
	
}
