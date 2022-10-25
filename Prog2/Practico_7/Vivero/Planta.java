package Vivero;

import java.util.ArrayList;

public class Planta {
	private String nombreCientifico;
	private ArrayList<String>nombresVulgares;
	private String clasificacionSuperior;
	private String familia;
	private String clase;
	private boolean interior;
	private int reqSol; //del 1 al 10
	private int reqAgua;
	
	public String getNombreCientifico() {
		return nombreCientifico;
	}
	public ArrayList<String> getNombresVulgares() {
		return nombresVulgares;
	}
	public String getClasificacionSuperior() {
		return clasificacionSuperior;
	}
	public String getFamilia() {
		return familia;
	}
	public String getClase() {
		return clase;
	}
	public boolean isInterior() {
		return interior;
	}
	public int getReqSol() {
		return reqSol;
	}
	public int getReqAgua() {
		return reqAgua;
	}

	public boolean tieneNombreVulgar(String nombre) {
		return this.nombresVulgares.contains(nombre);
	}
	
	
	
	
}
