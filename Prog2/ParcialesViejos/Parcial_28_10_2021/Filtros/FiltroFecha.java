package Parcial_28_10_2021.Filtros;

import java.time.LocalDate;

import Parcial_28_10_2021.Elemento;

public class FiltroFecha {
	private LocalDate fecha;
	
	public FiltroFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public boolean cumple(Elemento e) {
		LocalDate fechaPaquete = e.getFechaPago();
		if(fechaPaquete!=null) {
			return e.getFechaPago().equals(fecha);
		}
		return false;
	}

}
