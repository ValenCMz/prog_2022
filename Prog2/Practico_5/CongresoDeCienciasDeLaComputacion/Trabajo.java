package CongresoDeCienciasDeLaComputacion;

import java.util.ArrayList;

public class Trabajo {

	private String titulo;
	private ArrayList<String> palabrasClave;
		
	public Trabajo(String titulo) {
		this.titulo = titulo;
		this.palabrasClave = new ArrayList<String>();
	}
	
	public boolean evaluadorEsApto(Evaluador evaluador) {
		int i = 0;
		boolean contiene = true;
		while (contiene && (i< this.palabrasClave.size())) {
			if(!evaluador.contieneTema(this.palabrasClave.get(i))) {
				contiene = false;
			}
		}
		return contiene;
	}
	
	public boolean contieneTema(String tema) {
		return this.palabrasClave.contains(tema);
	}
	
	public void addPalabraClave(String palabraClave) {
		this.palabrasClave.add(palabraClave);
	}

	public ArrayList<String> getPalabrasClave() {
		return new ArrayList<String>(palabrasClave);
	}

	public void setPalabrasClave(ArrayList<String> palabrasClave) {
		this.palabrasClave = palabrasClave;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Trabajo: " + this.getTitulo();
	}
	
}
