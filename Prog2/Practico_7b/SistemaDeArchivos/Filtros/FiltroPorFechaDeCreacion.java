package SistemaDeArchivos.Filtros;

import java.time.LocalDate;

import SistemaDeArchivos.Elemento;

public class FiltroPorFechaDeCreacion extends Filtro{
	private LocalDate fechaMax;
	
	public FiltroPorFechaDeCreacion(LocalDate fechaMax) {
		this.fechaMax = fechaMax;
	}
	
	public boolean cumple(Elemento elemento) {
		return elemento.getFechaDeModificacion().isBefore(fechaMax);
	}
}
