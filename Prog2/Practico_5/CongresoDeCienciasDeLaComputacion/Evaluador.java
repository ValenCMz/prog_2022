package CongresoDeCienciasDeLaComputacion;

import java.util.ArrayList;

public class Evaluador {

	private String nombre;
	private ArrayList<String> temas;
	private ArrayList<Trabajo>trabajosAsignados;
	
	public Evaluador(String nombre) {
		this.nombre = nombre;
		this.temas = new ArrayList<String>();
		this.trabajosAsignados = new ArrayList<Trabajo>();
	}
	
	public boolean contieneTema(String palabraClave) {
		return this.temas.contains(palabraClave);
	}
	
	public boolean evaluadorEsApto(Trabajo trabajo){
		return trabajo.evaluadorEsApto(this);
	}
	
	public int getCantTrabajos() {
		return trabajosAsignados.size();
	}
	
	
	public void addTema(String tema) {
		this.temas.add(tema);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	public ArrayList<String> getTemas() {
		return new ArrayList<>(temas);
	}

	public void setTemas(ArrayList<String> temas) {
		this.temas = temas;
	}

	@Override
	public String toString() {
		return "Nombre evaluador: " + this.getNombre();
	}
		
}