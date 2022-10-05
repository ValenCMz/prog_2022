package CongresoDeCienciasDeLaComputacion;

import java.util.ArrayList;

public class Evaluador {

	private String nombre;
	private ArrayList<String> temas;
	private ArrayList<Trabajo>trabajosAsignados;
	//raro, por ahi necesito la clase temas
	private ArrayList<String>temasExpertos;
		
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
	
	//esto esta mal me parece, tendria q hacer algo q sea reutilizable, por ejemplo en contieneTemaExperto
	public boolean esExperto(Evaluador evaluador) {
		int i = 0;
		boolean esExperto = false;
		while(!esExperto && i<this.temasExpertos.size()) {
			if(evaluador.contieneTemaExperto(temasExpertos.get(i))) {
				esExperto = true;
			}
		}
		return esExperto;
	}
	
	public boolean contieneTemaExperto(String palabra) {
		return this.temasExpertos.contains(palabra);
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
	
	@Override
	public String toString() {
		return "Nombre evaluador: " + this.getNombre();
	}
		
}