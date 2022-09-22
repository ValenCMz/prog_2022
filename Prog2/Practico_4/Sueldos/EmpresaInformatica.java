package Sueldos;

import java.util.ArrayList;

import Sueldos.Empleado.Empleado;

public class EmpresaInformatica {
	private ArrayList<Empleado>empleados;
	
	public EmpresaInformatica() {
		this.empleados = new ArrayList<Empleado>();
	}
	
	public void addEmpleado(Empleado e1) {
		if(!empleados.contains(e1)) {
			empleados.add(e1);
		}
	}
	
	public double getCuantoCobra(Empleado e1) {
		return e1.cuantoCobra();
	}
}
