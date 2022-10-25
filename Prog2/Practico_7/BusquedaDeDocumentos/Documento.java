package BusquedaDeDocumentos;

import java.util.ArrayList;

public class Documento {
	private String titulo;
	private ArrayList<String>autores;
	private String contenido;
	private ArrayList<String>palabrasClaves;
	
	public Documento(String titulo, String contenido) {
		this.titulo = titulo;
		this.autores = new ArrayList<>();
		this.contenido = contenido;
		this.palabrasClaves = new ArrayList<>();
	}

	public String getTitulo() {
		return titulo;
	}

	public ArrayList<String> getAutores() {
		return autores;
	}

	public String getContenido() {
		return contenido;
	}

	public ArrayList<String> getPalabrasClaves() {
		return palabrasClaves;
	}
	
	public boolean tienePalabraClave(String palabraClave) {
		return palabrasClaves.contains(palabraClave);
	}
	
	public boolean tieneAutor(String autorBuscado) {
		return autores.contains(autorBuscado);
	}
	
	public int getCantPalabras() {
		return this.getContenido().split(" ").length;
	}
}
