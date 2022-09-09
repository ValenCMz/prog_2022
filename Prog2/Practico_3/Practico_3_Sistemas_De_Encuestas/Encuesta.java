package Practico_3_Sistemas_De_Encuestas;

import java.util.ArrayList;

public class Encuesta {
	private String nombreEncuesta;
	private ArrayList<String>preguntas;
	private ArrayList<Persona>personasEncuestadas;
	private Empleado empleadoEncuestador;//no es un array ya que el empleado q hace esa encuesta

	//Constructor
	public Encuesta(String nombreEncuesta, Empleado empleadoEncuestador){
		this.nombreEncuesta = nombreEncuesta;
		this.empleadoEncuestador = empleadoEncuestador;
		this.preguntas = new ArrayList<String>();;
		this.personasEncuestadas = new ArrayList<Persona>();
	}

	public String getNombreEncuesta() {
		return nombreEncuesta;
	}

	public void setNombreEncuesta(String nombreEncuesta) {
		this.nombreEncuesta = nombreEncuesta;
	}

	public ArrayList<String> getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(ArrayList<String> preguntas) {
		this.preguntas = preguntas;
	}

	public ArrayList<Persona> getPersonasEncuestadas() {
		return personasEncuestadas;
	}

	public void setPersonasEncuestadas(ArrayList<Persona> personasEncuestadas) {
		this.personasEncuestadas = personasEncuestadas;
	}

	public Empleado getEmpleadoEncuestador() {
		return empleadoEncuestador;
	}

	public void setEmpleadoEncuestador(Empleado empleadoEncuestador) {
		this.empleadoEncuestador = empleadoEncuestador;
	}

	

	
}
