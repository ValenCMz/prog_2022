package SeleccionDeFutbol;

import java.util.ArrayList;

public class Contingente {
	private ArrayList<Integrante>integrantes;
	public static final String VIAJANDO = "Viajando";
	public static final String CONCENTRACION = "Concentracion";
	
	public Contingente() {
		this.integrantes = new ArrayList<Integrante>();
	}
	
	public void addIntegrante(Integrante i) {
		if(!integrantes.contains(i)) {
			integrantes.add(i);
		}
	}
	
	public boolean estaDisponible(Integrante i) {
		if(i.getEstado()==VIAJANDO && (i.getEstado()!=CONCENTRACION)) {
			return true;
		}else {
			return false;
		}
	}
}
