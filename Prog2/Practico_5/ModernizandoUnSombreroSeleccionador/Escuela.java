package ModernizandoUnSombreroSeleccionador;

import java.util.ArrayList;

public class Escuela {
	private ArrayList<Casa>casas;
	private ArrayList<Alumno>alumnos;

	public Escuela() {
		this.casas = new ArrayList<>();
		this.alumnos = new ArrayList<>();
	}

	public void addCasas(Casa casa) {
		if(!casas.contains(casa)) {
			casas.add(casa);
		}
	}
	
//	Tendria q asignar las casas de manera aleatoria o que le llegue una casa?
	public void asignarCasa(Alumno alumno, Casa casa) {
				casa.agregarAlumno(alumno);
		
	}
}