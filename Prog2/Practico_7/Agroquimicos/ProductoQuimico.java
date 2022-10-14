package Agroquimicos;

import java.util.ArrayList;

public class ProductoQuimico {
	private String nombre;
	private ArrayList<Cultivo>cultivosDesaconsejados;
	private ArrayList<String>estadosPatologicosQueTrata;
	
	public ProductoQuimico(String nombre, ArrayList<Cultivo> cultivosDesaconsejados, ArrayList<String> estadosPatologicosQueTrata) {
		this.nombre = nombre;
		this.cultivosDesaconsejados = cultivosDesaconsejados;
		this.estadosPatologicosQueTrata = estadosPatologicosQueTrata;
	}
	
	public boolean tieneEstado(String estado) {
		return this.estadosPatologicosQueTrata.contains(estado);
	}
	
//	public boolean trataEnfermedad(Enfermedad enfermedad) {
//		for(String patalogia:patologiasQueTrata) {
//			if(enfermedad.tenesPatologia(patologia)) {
//				
//			}
//		}
//	}
	
	public boolean esCultivoDesaconsejado(Cultivo c) {
		return this.cultivosDesaconsejados.contains(c);
	}
	
	
	
	public void addCultivosDesaconsejados(Cultivo c) {
		this.cultivosDesaconsejados.add(c);
	}
	
	public void addEstadosPatalogicosDelCultivo(String s) {
		this.estadosPatologicosQueTrata.add(s);
	}
	
	public void addPatalogiasQueTrata(String p) {
		this.estadosPatologicosQueTrata.add(p);
	}
	
}
