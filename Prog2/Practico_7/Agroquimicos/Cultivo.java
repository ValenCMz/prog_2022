package Agroquimicos;

import java.util.ArrayList;

public class Cultivo {
	private String nombre;
	ArrayList<Enfermedad>enfermedadesFrecuentes;

	public Cultivo(String nombre, ArrayList<Enfermedad> enfermedadesFrecuentes) {
		this.nombre = nombre;
		this.enfermedadesFrecuentes = enfermedadesFrecuentes;
	}
	
}
