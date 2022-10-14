package FacturacionDeEmplados;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Empleado>empleados;
	
	public Empresa() {
		this.empleados = new ArrayList<>();
	}
	
	public double getSueldoMensual() {
		int sueldo=0;
		for(Empleado empleado:empleados) {
			sueldo += empleado.getSueldoMensual();
		}
		return sueldo;
	}
	
}
