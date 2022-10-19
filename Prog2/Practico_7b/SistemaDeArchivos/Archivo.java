package SistemaDeArchivos;

import java.time.LocalDate;

public class Archivo extends Elemento{
	private LocalDate fechaDeUltimaModificacion;
	private int tamanioEnKb;

	
	public Archivo(String nombre, LocalDate fechaDeCreacion, LocalDate fechaDeUltimaModificacion,int tamanioEnKb) {
		super(nombre,fechaDeCreacion);
		this.fechaDeUltimaModificacion = fechaDeUltimaModificacion;
		this.tamanioEnKb = tamanioEnKb;
	}
	
	//retorna 1 o asi mismo?
	public int getCantElementos() {
		return 1;
	}
	
	public int getTamanio() {
		return this.tamanioEnKb;
	}
}
