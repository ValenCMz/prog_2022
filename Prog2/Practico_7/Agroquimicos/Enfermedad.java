package Agroquimicos;

import java.util.ArrayList;

public class Enfermedad {
	private String nombre;
	private ArrayList<String>estadosPatologicosATratar;

	public Enfermedad(String nombre, ArrayList<String> estadosPatologicosATratar) {
		this.nombre = nombre;
		this.estadosPatologicosATratar = estadosPatologicosATratar;
	}
	
	public boolean puedeSerTratada(ProductoQuimico p) {
		boolean tiene = false;
		int i = 0;
		while(tiene==false && i<estadosPatologicosATratar.size()) {
			if(p.tieneEstado(estadosPatologicosATratar.get(i))) {
				tiene=true;
			}
		}
		return tiene;
	
	}
	
}
