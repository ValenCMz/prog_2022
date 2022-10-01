package ModernizandoUnSombreroSeleccionador;

import java.util.ArrayList;

public class Alumno {
	private String nombre;
	ArrayList<String>cualidades;
	ArrayList<Alumno>familares;
	public Alumno(String nombre, ArrayList<String> cualidades, ArrayList<Alumno> familares) {
		this.nombre = nombre;
		this.cualidades = cualidades;
		this.familares = familares;
	}
	public String getNombre() {
		return nombre;
	}
	public ArrayList<String> getCualidades() {
		return cualidades;
	}
	public ArrayList<Alumno> getFamilares() {
		return familares;
	}
	
	public boolean tieneCualidad(String cualidad) {
		return this.cualidades.contains(cualidad);
	}
	
	public boolean aceptado(Casa casa) {
		return casa.permiteAlumno(this);
	}
	
	//al alumno le llega la casa y este verifica q haya un familiar de los alumnos de la casa
	public boolean tieneFamiliares(Casa casa) {
		int i = 0;
		boolean indice = false;
		while((i<this.familares.size())&&(indice == false)) {
			if(casa.getAlumnos().contains(this.familares.get(i))) {//si los alumnos de la casa cotienen un familiar del alumno
				return indice = true;
			}
		}
		return false;
	}

	
}
