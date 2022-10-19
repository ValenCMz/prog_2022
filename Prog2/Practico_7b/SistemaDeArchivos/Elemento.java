package SistemaDeArchivos;

import java.time.LocalDate;

public abstract class Elemento {
	private String nombre;
	private LocalDate fechaDeCreacion;

	public Elemento(String nombre, LocalDate fechaDeCreacion) {
		this.nombre = nombre;
		this.fechaDeCreacion = fechaDeCreacion;
	}
	
	//va a ser abstracta?
	//que funcion debo usar?
	
//	● la cantidad de elementos que posee un directorio particular,
	public abstract int getCantElementos();
//	● el tamaño total de un directorio particular.
	public abstract int getTamanio();
}
