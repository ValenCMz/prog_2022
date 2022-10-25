package Navidad;

import java.util.ArrayList;

public class Carta {
	private Niño ninio;
	private String remitente;
	private ArrayList<String>regalos;
	private static String CARBON = "trozo de carbon";
	
	public Niño getNinio() {
		return this.ninio;
	}
	
	public void vaciarLista() {
		this.regalos.clear();
		this.regalos.add(CARBON);
	}
	
	public boolean tieneRegalo(String regalo) {
		return this.regalos.contains(regalo);
	}
	
	public boolean perteneceANinioMalo() {
		return this.regalos.contains(CARBON);
	}
}
