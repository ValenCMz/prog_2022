package RegistroEmpresa.PersonaAsociada;

import java.util.ArrayList;

public class Jerarquico extends Empleado {
	private ArrayList<Empleado>empleadosACargo;

	public Jerarquico(String cargoDeLaPersona, String nombre, String apellido, int edad, int nroLegajo, double sueldo) {
		super(cargoDeLaPersona, nombre, apellido, edad, nroLegajo, sueldo);
		this.empleadosACargo = new ArrayList<Empleado>();
	}
	
	
}
