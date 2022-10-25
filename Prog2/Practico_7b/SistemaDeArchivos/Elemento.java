package SistemaDeArchivos;

import java.time.LocalDate;
import java.util.ArrayList;

import SistemaDeArchivos.Filtros.Filtro;

public abstract class Elemento {
	private String nombre;
	private LocalDate fechaDeModificacion;
	private LocalDate fechaDeCreacion;

	public Elemento(String nombre, LocalDate fechaDeModificacion, LocalDate fechaDeCreacion) {
		this.nombre = nombre;
		this.fechaDeModificacion = fechaDeModificacion;
		this.fechaDeCreacion = fechaDeCreacion;
	}
	
	//va a ser abstracta?
	//que funcion debo usar?
	
//	● la cantidad de elementos que posee un directorio particular,
	public abstract int getCantElementos();
//	● el tamaño total de un directorio particular.
	public abstract int getTamanio();
	
	public boolean tieneNombre(String nombre) {
		return this.nombre.contains(nombre);
	}
	
	public LocalDate getFechaDeModificacion() {
		return this.fechaDeModificacion;
	}
	
	public LocalDate getFechaDeCreacion() {
		return this.fechaDeCreacion;
	}
	
	public String getNombre() {
		return this.getNombre();
	}

	protected abstract ArrayList<Elemento> buscar(Filtro filtro);
}
