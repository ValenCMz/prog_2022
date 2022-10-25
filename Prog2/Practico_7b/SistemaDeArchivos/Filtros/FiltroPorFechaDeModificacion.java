package SistemaDeArchivos.Filtros;

import java.time.LocalDate;

import SistemaDeArchivos.Elemento;

public class FiltroPorFechaDeModificacion extends Filtro{
	private LocalDate fechaMin;
	
	public FiltroPorFechaDeModificacion(LocalDate fechaMin) {
		this.fechaMin = fechaMin;
	}
	
	public boolean cumple(Elemento elemento) {
		return elemento.getFechaDeModificacion().isAfter(fechaMin);
	}
}
