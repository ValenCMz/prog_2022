package Practico_3_Sistemas_De_Encuestas;

import java.util.ArrayList;

public class EmpresaConsultora {
	private ArrayList<Encuesta>encuestasRealizadas;
	private ArrayList<Encuesta>encuestas;
	private ArrayList<Empleado>empleados;
	double plus;
	
	public EmpresaConsultora() {
		this.encuestasRealizadas = new ArrayList<>();
		this.encuestas = new ArrayList<>();
		this.empleados = new ArrayList<Empleado>();
		this.plus = 200;
	}

	public void guardarEncuestasRealizadas(Encuesta encuesta) {
		if(!encuestas.contains(encuesta)){
			this.encuestasRealizadas.add(encuesta);
		}
	}
	
	public void addEncuesta(Encuesta encuesta) {
			this.encuestas.add(encuesta);
	}
	
	public ArrayList<Encuesta> getEncuestasRealizadas() {
		return encuestasRealizadas;
	}
	
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	public double getPlus() {
		return plus;
	}

	public void setPlus(double plus) {
		this.plus = plus;
	}
	
	
	
}
