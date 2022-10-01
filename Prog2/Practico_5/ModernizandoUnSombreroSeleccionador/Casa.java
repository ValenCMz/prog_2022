package ModernizandoUnSombreroSeleccionador;

import java.util.ArrayList;

public class Casa {
	private String nombre;
	private ArrayList<String>cualidades;
	private ArrayList<Alumno>alumnos;

	private int maxAlumnos;

	public Casa(int maxAlummos) {
		this.maxAlumnos = maxAlummos;
		this.cualidades = new ArrayList<>();
	}
	
	@Override
	public boolean equals(Object obj) {
		Casa casa = (Casa)obj;
		
		try {
			return this.getNombre().equals(casa.getNombre());
		}
		catch(Exception exc) {
			return false;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<String> getCualidades() {
		return cualidades;
	}

	public int getMaxAlumnos() {
		return maxAlumnos;
	}

	public ArrayList<Alumno> getAlumnos() {
		return new ArrayList<Alumno>(alumnos);
	}

	//la casa va a tener lugar si la cantidad de alumnos es menor al maximo de alumnos de la casa
	public boolean tieneLugar() {
		return this.alumnos.size()<this.getMaxAlumnos();
	}
	
	//debo recorrer las cualidades y preguntarle al alumno si las tiene
	public boolean tieneCualidades(Alumno alumno) {
//		recorre las cualidades
		for(String cualidad:cualidades) {
//			si no tiene una cualidad retorno false
			if(!alumno.tieneCualidad(cualidad)) {
				return false;
			}
		}
//		si recorrio todas las cualidades y nunca entro al if va a retortar true
		return true;
		
	}
	
	public void agregarAlumno(Alumno alumno) {
		if(this.permiteAlumno(alumno)) {
			alumnos.add(alumno);
		}
	}
	
	public boolean permiteAlumno(Alumno alumno) {
		return this.tieneCualidades(alumno) && (this.tieneLugar());
	}
	
}
