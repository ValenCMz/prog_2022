package SistemaDeArchivos;

import java.time.LocalDate;

public class Link extends Elemento{
	private static int TAMANIO = 1;//kb
	
	public static void setTamanio(int tam) {
		TAMANIO = tam;
	}
	
	private Elemento referencia;

	public Link(String nombre, LocalDate fechaDeCreacion, Elemento referencia) {
		super(nombre, fechaDeCreacion);
		this.referencia = referencia;
	}
	
	public int getCantElementos() {
		return 0;
	}
	
	public int getTamanio() {
		return TAMANIO;//en kb
	}
}
