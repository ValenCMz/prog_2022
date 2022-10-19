package SistemaDeArchivos;

import java.time.LocalDate;

public class Archivo extends Elemento{
	private int tamanioEnKb;

	
	public Archivo(String nombre,int tamanioEnKb) {
		super(nombre);
		this.tamanioEnKb = tamanioEnKb;
	}
	
	//retorna 1 o 0?
	public int getCantElementos() {
		return 0;
	}
	
	public int getTamanio() {
		return this.tamanioEnKb;
	}
}
